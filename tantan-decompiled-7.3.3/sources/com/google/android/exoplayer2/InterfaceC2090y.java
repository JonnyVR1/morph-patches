package com.google.android.exoplayer2;

import android.annotation.SuppressLint;

/* JADX INFO: renamed from: com.google.android.exoplayer2.y */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2090y {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.y$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo12267b(InterfaceC2089x interfaceC2089x);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: e */
    static int m12259e(int i) {
        return i & 24;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: h */
    static int m12260h(int i) {
        return i & 64;
    }

    /* JADX INFO: renamed from: i */
    static int m12261i(int i, int i2, int i3) {
        return m12264t(i, i2, i3, 0, 128);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: p */
    static int m12262p(int i) {
        return i & 7;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    static int m12263r(int i) {
        return i & 384;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: t */
    static int m12264t(int i, int i2, int i3, int i4, int i5) {
        return i | i2 | i3 | i4 | i5;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: u */
    static int m12265u(int i) {
        return i & 32;
    }

    /* JADX INFO: renamed from: v */
    static int m12266v(int i) {
        return m12261i(i, 0, 0);
    }

    /* JADX INFO: renamed from: C */
    int mo9815C() throws ExoPlaybackException;

    /* JADX INFO: renamed from: a */
    int mo10438a(C1894k c1894k) throws ExoPlaybackException;

    String getName();

    int getTrackType();

    /* JADX INFO: renamed from: n */
    default void mo9833n(a aVar) {
    }

    /* JADX INFO: renamed from: q */
    default void mo9835q() {
    }
}
