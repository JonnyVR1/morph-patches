package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p153l.vxb;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.errorCode = i;
        }
    }

    /* JADX INFO: renamed from: e */
    static void m9963e(@Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.mo9885g(null);
        }
        if (drmSession != null) {
            drmSession.mo9881b(null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    DrmSessionException mo9880a();

    /* JADX INFO: renamed from: b */
    void mo9881b(@Nullable InterfaceC1877b.a aVar);

    /* JADX INFO: renamed from: c */
    default boolean mo9882c() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    vxb mo9883d();

    @Nullable
    /* JADX INFO: renamed from: f */
    Map<String, String> mo9884f();

    /* JADX INFO: renamed from: g */
    void mo9885g(@Nullable InterfaceC1877b.a aVar);

    int getState();

    /* JADX INFO: renamed from: h */
    UUID mo9886h();

    /* JADX INFO: renamed from: i */
    boolean mo9887i(String str);
}
