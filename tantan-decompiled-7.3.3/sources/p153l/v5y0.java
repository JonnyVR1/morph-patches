package p153l;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class v5y0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, vcr0, hqy0, s2z0, sxy0, iwx0, rvx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n6y0 f182588a;

    public /* synthetic */ v5y0(n6y0 n6y0Var, r5y0 r5y0Var) {
        this.f182588a = n6y0Var;
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: T */
    public final void mo199952T(String str) {
        this.f182588a.f140552q.mo141215c(str);
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: U */
    public final void mo199953U(vwx0 vwx0Var) {
        this.f182588a.f140552q.mo141190E(vwx0Var);
        this.f182588a.f140514J = null;
        this.f182588a.f140520P = null;
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: V */
    public final void mo199954V(vwx0 vwx0Var) {
        this.f182588a.f140520P = vwx0Var;
        this.f182588a.f140552q.mo141192G(vwx0Var);
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: W */
    public final void mo199955W(final aou0 aou0Var) {
        this.f182588a.f140530Z = aou0Var;
        g1w0 g1w0Var = this.f182588a.f140546k;
        g1w0Var.m128567d(25, new mwv0() { // from class: l.i5y0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((pkt0) obj).mo141225j(aou0Var);
            }
        });
        g1w0Var.m128566c();
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: X */
    public final void mo199956X(sqr0 sqr0Var, @Nullable zwx0 zwx0Var) {
        this.f182588a.f140514J = sqr0Var;
        this.f182588a.f140552q.mo141221f(sqr0Var, zwx0Var);
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: Y */
    public final void mo199957Y(String str, long j, long j2) {
        this.f182588a.f140552q.mo141240z(str, j, j2);
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: Z */
    public final void mo199958Z(Object obj, long j) {
        this.f182588a.f140552q.mo141186A(obj, j);
        n6y0 n6y0Var = this.f182588a;
        if (n6y0Var.f140516L == obj) {
            g1w0 g1w0Var = n6y0Var.f140546k;
            g1w0Var.m128567d(26, new mwv0() { // from class: l.m5y0
                @Override // p153l.mwv0
                public final void zza(Object obj2) {
                }
            });
            g1w0Var.m128566c();
        }
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: a */
    public final void mo136715a(long j) {
        this.f182588a.f140552q.mo141213b(j);
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: a0 */
    public final void mo199959a0(int i, long j) {
        this.f182588a.f140552q.mo141227l(i, j);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: b */
    public final void mo136716b(Exception exc) {
        this.f182588a.f140552q.mo141219e(exc);
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: b0 */
    public final void mo199960b0(long j, int i) {
        this.f182588a.f140552q.mo141189D(j, i);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: c */
    public final void mo136717c(jqy0 jqy0Var) {
        this.f182588a.f140552q.mo141233s(jqy0Var);
    }

    @Override // p153l.vcr0
    /* JADX INFO: renamed from: c0 */
    public final void mo199961c0(Exception exc) {
        this.f182588a.f140552q.mo141188C(exc);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: d */
    public final void mo136718d(int i, long j, long j2) {
        this.f182588a.f140552q.mo141205T(i, j, j2);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: e */
    public final void mo136719e(jqy0 jqy0Var) {
        this.f182588a.f140552q.mo141230o(jqy0Var);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: f */
    public final void mo136720f(Exception exc) {
        this.f182588a.f140552q.mo141193H(exc);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: g */
    public final void mo136721g(vwx0 vwx0Var) {
        this.f182588a.f140552q.mo141236v(vwx0Var);
        this.f182588a.f140515K = null;
        this.f182588a.f140521Q = null;
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: h */
    public final void mo136722h(String str, long j, long j2) {
        this.f182588a.f140552q.mo141217d(str, j, j2);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: i */
    public final void mo136723i(vwx0 vwx0Var) {
        this.f182588a.f140521Q = vwx0Var;
        this.f182588a.f140552q.mo141238x(vwx0Var);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: j */
    public final void mo136724j(sqr0 sqr0Var, @Nullable zwx0 zwx0Var) {
        this.f182588a.f140515K = sqr0Var;
        this.f182588a.f140552q.mo141197L(sqr0Var, zwx0Var);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        n6y0.m161830z(this.f182588a, surfaceTexture);
        this.f182588a.m161841P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f182588a.m161844S(null);
        this.f182588a.m161841P(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f182588a.m161841P(i, i2);
    }

    @Override // p153l.hqy0
    /* JADX INFO: renamed from: q */
    public final void mo136725q(final boolean z) {
        n6y0 n6y0Var = this.f182588a;
        if (n6y0Var.f140525U == z) {
            return;
        }
        n6y0Var.f140525U = z;
        g1w0 g1w0Var = this.f182588a.f140546k;
        g1w0Var.m128567d(23, new mwv0() { // from class: l.d5y0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((pkt0) obj).mo141231q(z);
            }
        });
        g1w0Var.m128566c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f182588a.m161841P(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f182588a.m161841P(0, 0);
    }

    @Override // p153l.hqy0
    public final void zzc(String str) {
        this.f182588a.f140552q.zzx(str);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
