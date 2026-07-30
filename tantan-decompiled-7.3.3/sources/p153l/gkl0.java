package p153l;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes8.dex */
public interface gkl0 {

    /* JADX INFO: renamed from: l.gkl0$a */
    public class C17238a implements InterfaceC17240c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC17239b f104750a;

        public C17238a(InterfaceC17239b interfaceC17239b) {
            this.f104750a = interfaceC17239b;
        }

        @Override // p153l.gkl0.InterfaceC17240c
        /* JADX INFO: renamed from: a */
        public void mo21063a(SurfaceTexture surfaceTexture) {
            this.f104750a.mo130586a(surfaceTexture);
        }
    }

    /* JADX INFO: renamed from: l.gkl0$b */
    public interface InterfaceC17239b {
        /* JADX INFO: renamed from: a */
        void mo130586a(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: l.gkl0$c */
    public interface InterfaceC17240c {
        /* JADX INFO: renamed from: a */
        void mo21063a(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: a */
    void mo20123a(long j, InterfaceC17240c interfaceC17240c, int i, int i2);

    /* JADX INFO: renamed from: b */
    void mo20124b(long j, int i);

    /* JADX INFO: renamed from: c */
    default void mo20125c(long j, InterfaceC17239b interfaceC17239b, int i, int i2) {
        mo20123a(j, new C17238a(interfaceC17239b), i, i2);
    }
}
