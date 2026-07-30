package p149l;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes7.dex */
public interface cbl0 {

    /* JADX INFO: renamed from: l.cbl0$a */
    public class C16101a implements InterfaceC16103c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC16102b f80164a;

        public C16101a(InterfaceC16102b interfaceC16102b) {
            this.f80164a = interfaceC16102b;
        }

        @Override // p149l.cbl0.InterfaceC16103c
        /* JADX INFO: renamed from: a */
        public void mo20064a(SurfaceTexture surfaceTexture) {
            this.f80164a.mo106018a(surfaceTexture);
        }
    }

    /* JADX INFO: renamed from: l.cbl0$b */
    public interface InterfaceC16102b {
        /* JADX INFO: renamed from: a */
        void mo106018a(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: l.cbl0$c */
    public interface InterfaceC16103c {
        /* JADX INFO: renamed from: a */
        void mo20064a(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: a */
    void mo19143a(long j, InterfaceC16103c interfaceC16103c, int i, int i2);

    /* JADX INFO: renamed from: b */
    void mo19144b(long j, int i);

    /* JADX INFO: renamed from: c */
    default void mo19145c(long j, InterfaceC16102b interfaceC16102b, int i, int i2) {
        mo19143a(j, new C16101a(interfaceC16102b), i, i2);
    }
}
