package com.google.android.exoplayer2.p031ui;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2061b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.b$a */
    public interface a {
        /* JADX INFO: renamed from: L */
        void mo11931L(InterfaceC2061b interfaceC2061b, long j);

        /* JADX INFO: renamed from: N */
        void mo11932N(InterfaceC2061b interfaceC2061b, long j);

        /* JADX INFO: renamed from: u */
        void mo11933u(InterfaceC2061b interfaceC2061b, long j, boolean z);
    }

    /* JADX INFO: renamed from: a */
    void mo11867a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    /* JADX INFO: renamed from: b */
    void mo11868b(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
