package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.io.IOException;
import p149l.erc0;
import p149l.hix;
import p149l.v680;
import p149l.vod0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.x */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2066x extends C2004u.b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.x$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10263a();

        /* JADX INFO: renamed from: b */
        void mo10264b();
    }

    /* JADX INFO: renamed from: A */
    default void mo10368A(float f, float f2) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: B */
    void mo9760B(erc0 erc0Var, C1871k[] c1871kArr, vod0 vod0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    /* JADX INFO: renamed from: b */
    boolean mo9653b();

    /* JADX INFO: renamed from: c */
    boolean mo9654c();

    /* JADX INFO: renamed from: d */
    boolean mo9775d();

    void disable();

    /* JADX INFO: renamed from: g */
    boolean mo9776g();

    String getName();

    int getState();

    @Nullable
    vod0 getStream();

    int getTrackType();

    /* JADX INFO: renamed from: j */
    void mo10393j(long j, long j2) throws ExoPlaybackException;

    /* JADX INFO: renamed from: k */
    long mo9777k();

    /* JADX INFO: renamed from: l */
    void mo9778l(long j) throws ExoPlaybackException;

    @Nullable
    /* JADX INFO: renamed from: m */
    hix mo9657m();

    /* JADX INFO: renamed from: o */
    void mo9780o(C1871k[] c1871kArr, vod0 vod0Var, long j, long j2) throws ExoPlaybackException;

    default void release() {
    }

    void reset();

    /* JADX INFO: renamed from: s */
    void mo9782s();

    void start() throws ExoPlaybackException;

    void stop();

    /* JADX INFO: renamed from: w */
    void mo9783w() throws IOException;

    /* JADX INFO: renamed from: x */
    void mo9784x(int i, v680 v680Var);

    /* JADX INFO: renamed from: y */
    InterfaceC2067y mo9785y();
}
