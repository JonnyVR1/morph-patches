package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;

/* JADX INFO: loaded from: classes6.dex */
public class k94 implements mnl.InterfaceC18510a {

    /* JADX INFO: renamed from: b */
    private InterfaceC17958a f121900b;

    /* JADX INFO: renamed from: c */
    private mnl f121901c;

    /* JADX INFO: renamed from: g */
    private ulw f121905g;

    /* JADX INFO: renamed from: a */
    final int f121899a = 303;

    /* JADX INFO: renamed from: d */
    int f121902d = 60;

    /* JADX INFO: renamed from: e */
    private Rect f121903e = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: f */
    private SurfaceTexture f121904f = null;

    /* JADX INFO: renamed from: l.k94$a */
    public interface InterfaceC17958a {
        /* JADX INFO: renamed from: D */
        void mo145025D(byte[] bArr);
    }

    public k94(ulw ulwVar, boolean z) {
        this.f121905g = ulwVar;
        m145012l(ulwVar, z);
    }

    /* JADX INFO: renamed from: b */
    private int m144996b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: n */
    private boolean m144997n(Rect rect, Rect rect2) {
        return Math.abs(((float) rect2.width()) - ((float) rect.width())) > ((float) this.f121902d) || Math.abs(((float) rect2.height()) - ((float) rect.height())) > ((float) this.f121902d) || Math.abs(rect.left - rect2.left) > this.f121902d || Math.abs(rect.right - rect2.right) > this.f121902d || Math.abs(rect.top - rect2.top) > this.f121902d || Math.abs(rect.bottom - rect2.bottom) > this.f121902d;
    }

    /* JADX INFO: renamed from: q */
    private Rect m144998q(RectF rectF) {
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* JADX INFO: renamed from: A */
    public void m144999A(int i) {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            mnlVar.mo111765b(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m145000B(SurfaceTexture surfaceTexture) {
        mnl mnlVar = this.f121901c;
        if (mnlVar == null) {
            return false;
        }
        this.f121904f = surfaceTexture;
        return mnlVar.mo111772j(surfaceTexture);
    }

    /* JADX INFO: renamed from: C */
    public boolean m145001C(int i, slw slwVar) {
        mnl mnlVar = this.f121901c;
        return mnlVar != null && mnlVar.mo111755E(i, slwVar);
    }

    /* JADX INFO: renamed from: a */
    public Rect m145002a(float f, float f2, Rect rect) {
        dt6 dt6Var = new dt6(((egw) this.f121901c).m116405V(), new RectF(rect));
        int iWidth = rect.width() / 5;
        int i = iWidth / 2;
        int iM144996b = m144996b(((int) f) - i, rect.left, rect.right - iWidth);
        int iM144996b2 = m144996b(((int) f2) - i, rect.top, rect.bottom - iWidth);
        return m144998q(dt6Var.m113537c(new RectF(iM144996b, iM144996b2, iM144996b + iWidth, iM144996b2 + iWidth)));
    }

    /* JADX INFO: renamed from: c */
    public void m145003c() {
        if (this.f121905g.f177141g0) {
            ulw ulwVar = this.f121905g;
            Rect rect = new Rect(0, 0, ulwVar.f177138f, ulwVar.f177136e);
            m145005e(m145002a(rect.centerX(), rect.centerY(), rect), null);
        } else if (this.f121901c != null) {
            m145005e(new Rect(-100, -100, 100, 100), null);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m145004d(int i, int i2, float f, float f2, float f3, float f4, float f5) {
        int iM144996b;
        int iM144996b2;
        int iM144996b3;
        int iM144996b4;
        if (!this.f121905g.f177141g0) {
            if (f <= 0.0f) {
                f = 0.0f;
            }
            if (f2 <= 0.0f) {
                f2 = 0.0f;
            }
            float f6 = i;
            if (f3 > f6) {
                f3 = f6;
            }
            float f7 = i2;
            if (f4 > f7) {
                f4 = f7;
            }
            m145005e(new Rect((int) (((f * 2000.0f) / f6) - 1000.0f), (int) (((f2 * 2000.0f) / f7) - 1000.0f), (int) (((f3 * 2000.0f) / f6) - 1000.0f), (int) (((f4 * 2000.0f) / f7) - 1000.0f)), null);
            return;
        }
        dt6 dt6Var = new dt6(((egw) this.f121901c).m116405V(), new RectF(0.0f, 0.0f, i2, i));
        Rect rect = new Rect(0, 0, i2, i);
        if (m145013m()) {
            iM144996b = m144996b((int) f2, 0, rect.width());
            iM144996b2 = m144996b((int) (rect.height() - f3), 0, rect.height());
            iM144996b3 = m144996b((int) f4, 0, rect.width());
            iM144996b4 = m144996b((int) (rect.height() - f), 0, rect.height());
        } else {
            iM144996b = m144996b((int) f2, 0, rect.width());
            iM144996b2 = m144996b((int) f, 0, rect.height());
            iM144996b3 = m144996b((int) f4, 0, rect.width());
            iM144996b4 = m144996b((int) f3, 0, rect.height());
        }
        RectF rectF = new RectF(iM144996b, iM144996b2, iM144996b3, iM144996b4);
        rectF.toString();
        m145005e(m144998q(dt6Var.m113537c(rectF)), null);
        this.f121903e.toString();
    }

    /* JADX INFO: renamed from: e */
    public void m145005e(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f121901c != null) {
            if (m144997n(this.f121903e, rect) || !m145013m()) {
                this.f121903e.set(rect);
                this.f121901c.mo111773k(this.f121903e, autoFocusCallback);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public mnl m145006f() {
        return this.f121901c;
    }

    /* JADX INFO: renamed from: g */
    public int m145007g() {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            return mnlVar.mo111774m();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m145008h() {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            return mnlVar.mo111767d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m145009i() {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            return mnlVar.mo111770h();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public int m145010j() {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            return mnlVar.mo111766c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int m145011k() {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            return mnlVar.mo111769g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m145012l(ulw ulwVar, boolean z) {
        if (ulwVar.f177141g0) {
            this.f121901c = new egw(ulwVar);
        } else {
            this.f121901c = new dgw(ulwVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m145013m() {
        mnl mnlVar = this.f121901c;
        if (mnlVar == null) {
            return false;
        }
        return mnlVar.mo111771i();
    }

    /* JADX INFO: renamed from: o */
    public void m145014o() {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            mnlVar.mo111762L();
        }
    }

    @Override // p149l.mnl.InterfaceC18510a
    public void onData(byte[] bArr) {
        InterfaceC17958a interfaceC17958a = this.f121900b;
        if (interfaceC17958a != null) {
            interfaceC17958a.mo145025D(bArr);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m145015p(int i, slw slwVar) {
        mnl mnlVar = this.f121901c;
        if (mnlVar == null) {
            return false;
        }
        if (!mnlVar.mo111757G(i, slwVar)) {
            n8c.m158485c("CameraSource", "Camera prepare Failed !!!");
            return false;
        }
        this.f121901c.mo111761K(this);
        this.f121903e = new Rect();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public int m145016r() {
        mnl mnlVar = this.f121901c;
        if (mnlVar == null) {
            return 1;
        }
        try {
            mnlVar.mo111761K(null);
            this.f121901c.mo111768e(null);
            this.f121901c.mo111764a();
            this.f121904f = null;
            this.f121901c = null;
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m145017s(int i, slw slwVar) {
        mnl mnlVar = this.f121901c;
        if (mnlVar == null) {
            return false;
        }
        mnlVar.mo111756F(i, slwVar);
        return this.f121901c.mo111772j(this.f121904f);
    }

    /* JADX INFO: renamed from: u */
    public void m145019u(Context context) {
        mnl mnlVar = this.f121901c;
        if (mnlVar == null || !(mnlVar instanceof egw)) {
            return;
        }
        ((egw) mnlVar).m116407e0(context);
    }

    /* JADX INFO: renamed from: v */
    public void m145020v(InterfaceC17958a interfaceC17958a) {
        this.f121900b = interfaceC17958a;
    }

    /* JADX INFO: renamed from: w */
    public void m145021w(int i) {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            mnlVar.setExposureCompensation(i);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m145022x(egw.InterfaceC16606h interfaceC16606h) {
        mnl mnlVar = this.f121901c;
        if (mnlVar == null || !(mnlVar instanceof egw)) {
            return;
        }
        ((egw) mnlVar).m116408f0(interfaceC16606h);
    }

    /* JADX INFO: renamed from: y */
    public void m145023y(Camera.ErrorCallback errorCallback) {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            mnlVar.mo111768e(errorCallback);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m145024z(mnl.InterfaceC18513d interfaceC18513d) {
        mnl mnlVar = this.f121901c;
        if (mnlVar != null) {
            mnlVar.mo111759I(interfaceC18513d);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m145018t() {
    }
}
