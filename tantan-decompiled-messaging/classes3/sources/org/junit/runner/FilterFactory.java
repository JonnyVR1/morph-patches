package org.junit.runner;

import org.junit.runner.manipulation.Filter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface FilterFactory {

    public static class FilterNotCreatedException extends Exception {
        public FilterNotCreatedException(Exception exc) {
            super(exc.getMessage(), exc);
        }
    }

    Filter createFilter(FilterFactoryParams filterFactoryParams) throws FilterNotCreatedException;
}
