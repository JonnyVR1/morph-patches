package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;
import p149l.ar3;
import p149l.hwb;
import p149l.p11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1858f implements DrmSession {

    /* JADX INFO: renamed from: a */
    public final DrmSession.DrmSessionException f7469a;

    public C1858f(DrmSession.DrmSessionException drmSessionException) {
        this.f7469a = (DrmSession.DrmSessionException) p11.m167011e(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: a */
    public DrmSession.DrmSessionException mo9826a() {
        return this.f7469a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: b */
    public void mo9827b(@Nullable InterfaceC1854b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: c */
    public boolean mo9828c() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: d */
    public hwb mo9829d() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: f */
    public Map<String, String> mo9830f() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: g */
    public void mo9831g(@Nullable InterfaceC1854b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: h */
    public final UUID mo9832h() {
        return ar3.f71228a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: i */
    public boolean mo9833i(String str) {
        return false;
    }
}
