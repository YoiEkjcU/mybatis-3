package org.apache.ibatis.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

/**
 * @author Clinton Begin
 */
@Deprecated
public class ExternalResources {

    private static final Log log = LogFactory.getLog(ExternalResources.class);

    private ExternalResources() {
        // do nothing
    }

    public static void copyExternalResource(File sourceFile, File destFile) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();
        }

        try (FileChannel source = FileChannel.open(sourceFile.toPath(), StandardOpenOption.READ); //
                FileChannel destination = FileChannel.open(destFile.toPath(), StandardOpenOption.WRITE)) {
            destination.transferFrom(source, 0, source.size());
        }
    }

    public static String getConfiguredTemplate(String templatePath, String templateProperty) throws FileNotFoundException {
        String templateName = "";
        Properties migrationProperties = new Properties();

        try {
            migrationProperties.load(new FileInputStream(templatePath));
            templateName = migrationProperties.getProperty(templateProperty);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (Exception e) {
            log.error("", e);
        }

        return templateName;
    }
}
