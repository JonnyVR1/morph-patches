package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.io.IOException;
import p153l.bf80;
import p153l.erx;
import p153l.jzc0;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.x */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2089x extends C2027u.b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.x$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10317a();

        /* JADX INFO: renamed from: b */
        void mo10318b();
    }

    /* JADX INFO: renamed from: A */
    default void mo10422A(float f, float f2) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: B */
    void mo9814B(jzc0 jzc0Var, C1894k[] c1894kArr, xwd0 xwd0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    /* JADX INFO: renamed from: b */
    boolean mo9707b();

    /* JADX INFO: renamed from: c */
    boolean mo9708c();

    /* JADX INFO: renamed from: d */
    boolean mo9829d();

    void disable();

    /* JADX INFO: renamed from: g */
    boolean mo9830g();

    String getName();

    int getState();

    @Nullable
    xwd0 getStream();

    int getTrackType();

    /* JADX INFO: renamed from: j */
    void mo10447j(long j, long j2) throws ExoPlaybackException;

    /* JADX INFO: renamed from: k */
    long mo9831k();

    /* JADX INFO: renamed from: l */
    void mo9832l(long j) throws ExoPlaybackException;

    @Nullable
    /* JADX INFO: renamed from: m */
    erx mo9711m();

    /* JADX INFO: renamed from: o */
    void mo9834o(C1894k[] c1894kArr, xwd0 xwd0Var, long j, long j2) throws ExoPlaybackException;

    default void release() {
    }

    void reset();

    /* JADX INFO: renamed from: s */
    void mo9836s();

    void start() throws ExoPlaybackException;

    void stop();

    /* JADX INFO: renamed from: w */
    void mo9837w() throws IOException;

    /* JADX INFO: renamed from: x */
    void mo9838x(int i, bf80 bf80Var);

    /* JADX INFO: renamed from: y */
    InterfaceC2090y mo9839y();
}
