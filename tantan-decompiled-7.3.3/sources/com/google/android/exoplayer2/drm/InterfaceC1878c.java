package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import p153l.bf80;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1878c {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1878c f7503a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final InterfaceC1878c f7504b;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c$b */
    public interface b {

        /* JADX INFO: renamed from: a */
        public static final b f7505a = new b() { // from class: l.yde
            @Override // com.google.android.exoplayer2.drm.InterfaceC1878c.b
            public final void release() {
                InterfaceC1878c.b.m9988a();
            }
        };

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m9988a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f7503a = aVar;
        f7504b = aVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    DrmSession mo9928a(@Nullable InterfaceC1877b.a aVar, C1894k c1894k);

    /* JADX INFO: renamed from: b */
    default b mo9929b(@Nullable InterfaceC1877b.a aVar, C1894k c1894k) {
        return b.f7505a;
    }

    /* JADX INFO: renamed from: c */
    int mo9930c(C1894k c1894k);

    /* JADX INFO: renamed from: d */
    void mo9931d(Looper looper, bf80 bf80Var);

    default void prepare() {
    }

    default void release() {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.c$a */
    public class a implements InterfaceC1878c {
        @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
        @Nullable
        /* JADX INFO: renamed from: a */
        public DrmSession mo9928a(@Nullable InterfaceC1877b.a aVar, C1894k c1894k) {
            if (c1894k.f7788o == null) {
                return null;
            }
            return new C1881f(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
        /* JADX INFO: renamed from: c */
        public int mo9930c(C1894k c1894k) {
            return c1894k.f7788o != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
        /* JADX INFO: renamed from: d */
        public void mo9931d(Looper looper, bf80 bf80Var) {
        }
    }
}
