package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p149l.hwb;

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
    static void m9909e(@Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.mo9831g(null);
        }
        if (drmSession != null) {
            drmSession.mo9827b(null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    DrmSessionException mo9826a();

    /* JADX INFO: renamed from: b */
    void mo9827b(@Nullable InterfaceC1854b.a aVar);

    /* JADX INFO: renamed from: c */
    default boolean mo9828c() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    hwb mo9829d();

    @Nullable
    /* JADX INFO: renamed from: f */
    Map<String, String> mo9830f();

    /* JADX INFO: renamed from: g */
    void mo9831g(@Nullable InterfaceC1854b.a aVar);

    int getState();

    /* JADX INFO: renamed from: h */
    UUID mo9832h();

    /* JADX INFO: renamed from: i */
    boolean mo9833i(String str);
}
