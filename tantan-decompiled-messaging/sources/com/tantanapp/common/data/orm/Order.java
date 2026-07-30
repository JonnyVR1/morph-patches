package com.tantanapp.common.data.orm;

import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Order<T> implements Comparator<T> {
    /* JADX INFO: renamed from: EQ */
    public abstract Filter<T> mo81259EQ(T t);

    /* JADX INFO: renamed from: GT */
    public abstract Filter<T> mo81260GT(T t);

    public abstract Filter<T> GT_EQ(T t);

    public abstract Column column();

    public abstract String emit();
}
