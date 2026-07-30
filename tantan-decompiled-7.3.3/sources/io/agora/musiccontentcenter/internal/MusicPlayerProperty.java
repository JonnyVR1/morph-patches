package io.agora.musiccontentcenter.internal;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class MusicPlayerProperty {
    long handler;

    /* JADX INFO: renamed from: id */
    int f64019id;

    @CalledByNative
    public MusicPlayerProperty(long j, int i) {
        this.handler = j;
        this.f64019id = i;
    }
}
