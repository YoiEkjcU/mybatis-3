package org.apache.ibatis.cache;

/**
 * @author Clinton Begin
 */
public final class NullCacheKey extends CacheKey {

    private static final long serialVersionUID = 1L;

    public NullCacheKey() {
        super();
    }

    @Override
    public void update(Object object) {
        throw new CacheException("Not allowed to update a NullCacheKey instance.");
    }

    @Override
    public void updateAll(Object[] objects) {
        throw new CacheException("Not allowed to update a NullCacheKey instance.");
    }
}
