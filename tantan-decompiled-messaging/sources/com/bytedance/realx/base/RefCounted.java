package com.bytedance.realx.base;

/* JADX INFO: loaded from: classes.dex */
public interface RefCounted {
    void release();

    void retain();
}
