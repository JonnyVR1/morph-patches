package com.google.android.exoplayer2.p030ui;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2038b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.b$a */
    public interface a {
        /* JADX INFO: renamed from: L */
        void mo11877L(InterfaceC2038b interfaceC2038b, long j);

        /* JADX INFO: renamed from: N */
        void mo11878N(InterfaceC2038b interfaceC2038b, long j);

        /* JADX INFO: renamed from: u */
        void mo11879u(InterfaceC2038b interfaceC2038b, long j, boolean z);
    }

    /* JADX INFO: renamed from: a */
    void mo11813a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    /* JADX INFO: renamed from: b */
    void mo11814b(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
