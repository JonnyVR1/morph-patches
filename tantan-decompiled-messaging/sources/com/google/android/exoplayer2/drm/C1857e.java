package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.hwb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.e */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public final class C1857e implements InterfaceC1859g {
    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo9941a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: b */
    public InterfaceC1859g.d mo9942b() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: c */
    public byte[] mo9943c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: d */
    public void mo9944d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: e */
    public void mo9945e(@Nullable InterfaceC1859g.b bVar) {
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    @Nullable
    /* JADX INFO: renamed from: f */
    public byte[] mo9946f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: h */
    public void mo9947h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: i */
    public int mo9948i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: j */
    public hwb mo9949j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: k */
    public boolean mo9950k(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: l */
    public void mo9951l(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: m */
    public InterfaceC1859g.a mo9952m(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    public void release() {
    }
}
