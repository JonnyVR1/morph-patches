package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;
import p153l.vxb;
import p153l.w11;
import p153l.zr3;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1881f implements DrmSession {

    /* JADX INFO: renamed from: a */
    public final DrmSession.DrmSessionException f7506a;

    public C1881f(DrmSession.DrmSessionException drmSessionException) {
        this.f7506a = (DrmSession.DrmSessionException) w11.m204369e(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: a */
    public DrmSession.DrmSessionException mo9880a() {
        return this.f7506a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: b */
    public void mo9881b(@Nullable InterfaceC1877b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: c */
    public boolean mo9882c() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: d */
    public vxb mo9883d() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: f */
    public Map<String, String> mo9884f() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: g */
    public void mo9885g(@Nullable InterfaceC1877b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: h */
    public final UUID mo9886h() {
        return zr3.f205729a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: i */
    public boolean mo9887i(String str) {
        return false;
    }
}
