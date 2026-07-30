package org.junit.experimental.categories;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runner.manipulation.Filter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class IncludeCategories extends CategoryFilterFactory {
    @Override // org.junit.experimental.categories.CategoryFilterFactory
    public Filter createFilter(List<Class<?>> list) {
        return new IncludesAny(list);
    }

    public static class IncludesAny extends Categories.CategoryFilter {
        public IncludesAny(List<Class<?>> list) {
            this(new HashSet(list));
        }

        @Override // org.junit.experimental.categories.Categories.CategoryFilter, org.junit.runner.manipulation.Filter
        public String describe() {
            return "includes " + super.describe();
        }

        public IncludesAny(Set<Class<?>> set) {
            super(true, set, true, null);
        }
    }
}
