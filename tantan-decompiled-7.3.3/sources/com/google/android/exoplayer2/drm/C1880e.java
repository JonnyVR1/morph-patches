package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.vxb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.e */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public final class C1880e implements InterfaceC1882g {
    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo9995a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: b */
    public InterfaceC1882g.d mo9996b() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: c */
    public byte[] mo9997c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: d */
    public void mo9998d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: e */
    public void mo9999e(@Nullable InterfaceC1882g.b bVar) {
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    @Nullable
    /* JADX INFO: renamed from: f */
    public byte[] mo10000f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: h */
    public void mo10001h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: i */
    public int mo10002i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: j */
    public vxb mo10003j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: k */
    public boolean mo10004k(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: l */
    public void mo10005l(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: m */
    public InterfaceC1882g.a mo10006m(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    public void release() {
    }
}
