package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    static final EmptyImmutableSetMultimap INSTANCE = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.m15715of(), 0, null);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
