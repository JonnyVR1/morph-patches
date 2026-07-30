package org.junit.experimental.categories;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runner.manipulation.Filter;

/* JADX INFO: loaded from: classes3.dex */
public final class ExcludeCategories extends CategoryFilterFactory {
    @Override // org.junit.experimental.categories.CategoryFilterFactory
    public Filter createFilter(List<Class<?>> list) {
        return new ExcludesAny(list);
    }

    public static class ExcludesAny extends Categories.CategoryFilter {
        public ExcludesAny(List<Class<?>> list) {
            this(new HashSet(list));
        }

        @Override // org.junit.experimental.categories.Categories.CategoryFilter, org.junit.runner.manipulation.Filter
        public String describe() {
            return "excludes " + super.describe();
        }

        public ExcludesAny(Set<Class<?>> set) {
            super(true, null, true, set);
        }
    }
}
