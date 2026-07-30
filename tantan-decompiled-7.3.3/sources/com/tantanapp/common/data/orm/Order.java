package com.tantanapp.common.data.orm;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Order<T> implements Comparator<T> {
    /* JADX INFO: renamed from: EQ */
    public abstract Filter<T> mo82442EQ(T t);

    /* JADX INFO: renamed from: GT */
    public abstract Filter<T> mo82443GT(T t);

    public abstract Filter<T> GT_EQ(T t);

    public abstract Column column();

    public abstract String emit();
}
