package p149l;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class pwx0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, p3r0, bhy0, mty0, moy0, cnx0, lmx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hxx0 f151609a;

    public /* synthetic */ pwx0(hxx0 hxx0Var, lwx0 lwx0Var) {
        this.f151609a = hxx0Var;
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: T */
    public final void mo167267T(String str) {
        this.f151609a.f109990q.mo106387c(str);
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: U */
    public final void mo167268U(pnx0 pnx0Var) {
        this.f151609a.f109990q.mo106362E(pnx0Var);
        this.f151609a.f109952J = null;
        this.f151609a.f109958P = null;
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: V */
    public final void mo167269V(pnx0 pnx0Var) {
        this.f151609a.f109958P = pnx0Var;
        this.f151609a.f109990q.mo106364G(pnx0Var);
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: W */
    public final void mo167270W(final ueu0 ueu0Var) {
        this.f151609a.f109968Z = ueu0Var;
        asv0 asv0Var = this.f151609a.f109984k;
        asv0Var.m98627d(25, new gnv0() { // from class: l.cwx0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((jbt0) obj).mo106397j(ueu0Var);
            }
        });
        asv0Var.m98626c();
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: X */
    public final void mo167271X(mhr0 mhr0Var, @Nullable tnx0 tnx0Var) {
        this.f151609a.f109952J = mhr0Var;
        this.f151609a.f109990q.mo106393f(mhr0Var, tnx0Var);
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: Y */
    public final void mo167272Y(String str, long j, long j2) {
        this.f151609a.f109990q.mo106413z(str, j, j2);
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: Z */
    public final void mo167273Z(Object obj, long j) {
        this.f151609a.f109990q.mo106358A(obj, j);
        hxx0 hxx0Var = this.f151609a;
        if (hxx0Var.f109954L == obj) {
            asv0 asv0Var = hxx0Var.f109984k;
            asv0Var.m98627d(26, new gnv0() { // from class: l.gwx0
                @Override // p149l.gnv0
                public final void zza(Object obj2) {
                }
            });
            asv0Var.m98626c();
        }
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: a */
    public final void mo101957a(long j) {
        this.f151609a.f109990q.mo106385b(j);
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: a0 */
    public final void mo167274a0(int i, long j) {
        this.f151609a.f109990q.mo106399l(i, j);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: b */
    public final void mo101958b(Exception exc) {
        this.f151609a.f109990q.mo106391e(exc);
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: b0 */
    public final void mo167275b0(long j, int i) {
        this.f151609a.f109990q.mo106361D(j, i);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: c */
    public final void mo101959c(dhy0 dhy0Var) {
        this.f151609a.f109990q.mo106406s(dhy0Var);
    }

    @Override // p149l.p3r0
    /* JADX INFO: renamed from: c0 */
    public final void mo167276c0(Exception exc) {
        this.f151609a.f109990q.mo106360C(exc);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: d */
    public final void mo101960d(int i, long j, long j2) {
        this.f151609a.f109990q.mo106377T(i, j, j2);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: e */
    public final void mo101961e(dhy0 dhy0Var) {
        this.f151609a.f109990q.mo106402o(dhy0Var);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: f */
    public final void mo101962f(Exception exc) {
        this.f151609a.f109990q.mo106365H(exc);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: g */
    public final void mo101963g(pnx0 pnx0Var) {
        this.f151609a.f109990q.mo106409v(pnx0Var);
        this.f151609a.f109953K = null;
        this.f151609a.f109959Q = null;
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: h */
    public final void mo101964h(String str, long j, long j2) {
        this.f151609a.f109990q.mo106389d(str, j, j2);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: i */
    public final void mo101965i(pnx0 pnx0Var) {
        this.f151609a.f109959Q = pnx0Var;
        this.f151609a.f109990q.mo106411x(pnx0Var);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: j */
    public final void mo101966j(mhr0 mhr0Var, @Nullable tnx0 tnx0Var) {
        this.f151609a.f109953K = mhr0Var;
        this.f151609a.f109990q.mo106369L(mhr0Var, tnx0Var);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        hxx0.m133450z(this.f151609a, surfaceTexture);
        this.f151609a.m133461P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f151609a.m133464S(null);
        this.f151609a.m133461P(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f151609a.m133461P(i, i2);
    }

    @Override // p149l.bhy0
    /* JADX INFO: renamed from: q */
    public final void mo101967q(final boolean z) {
        hxx0 hxx0Var = this.f151609a;
        if (hxx0Var.f109963U == z) {
            return;
        }
        hxx0Var.f109963U = z;
        asv0 asv0Var = this.f151609a.f109984k;
        asv0Var.m98627d(23, new gnv0() { // from class: l.xvx0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                ((jbt0) obj).mo106404q(z);
            }
        });
        asv0Var.m98626c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f151609a.m133461P(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f151609a.m133461P(0, 0);
    }

    @Override // p149l.bhy0
    public final void zzc(String str) {
        this.f151609a.f109990q.zzx(str);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
