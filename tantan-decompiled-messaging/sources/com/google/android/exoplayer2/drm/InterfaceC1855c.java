package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import p149l.v680;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1855c {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1855c f7466a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final InterfaceC1855c f7467b;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c$b */
    public interface b {

        /* JADX INFO: renamed from: a */
        public static final b f7468a = new b() { // from class: l.uce
            @Override // com.google.android.exoplayer2.drm.InterfaceC1855c.b
            public final void release() {
                InterfaceC1855c.b.m9934a();
            }
        };

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m9934a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f7466a = aVar;
        f7467b = aVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    DrmSession mo9874a(@Nullable InterfaceC1854b.a aVar, C1871k c1871k);

    /* JADX INFO: renamed from: b */
    default b mo9875b(@Nullable InterfaceC1854b.a aVar, C1871k c1871k) {
        return b.f7468a;
    }

    /* JADX INFO: renamed from: c */
    int mo9876c(C1871k c1871k);

    /* JADX INFO: renamed from: d */
    void mo9877d(Looper looper, v680 v680Var);

    default void prepare() {
    }

    default void release() {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c$a */
    public class a implements InterfaceC1855c {
        @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
        @Nullable
        /* JADX INFO: renamed from: a */
        public DrmSession mo9874a(@Nullable InterfaceC1854b.a aVar, C1871k c1871k) {
            if (c1871k.f7751o == null) {
                return null;
            }
            return new C1858f(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
        /* JADX INFO: renamed from: c */
        public int mo9876c(C1871k c1871k) {
            return c1871k.f7751o != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
        /* JADX INFO: renamed from: d */
        public void mo9877d(Looper looper, v680 v680Var) {
        }
    }
}
