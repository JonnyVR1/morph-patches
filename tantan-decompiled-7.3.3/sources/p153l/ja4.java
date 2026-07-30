package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;

/* JADX INFO: loaded from: classes8.dex */
public class ja4 implements xpl.InterfaceC21407a {

    /* JADX INFO: renamed from: b */
    private InterfaceC17902a f118938b;

    /* JADX INFO: renamed from: c */
    private xpl f118939c;

    /* JADX INFO: renamed from: g */
    private tow f118943g;

    /* JADX INFO: renamed from: a */
    final int f118937a = 303;

    /* JADX INFO: renamed from: d */
    int f118940d = 60;

    /* JADX INFO: renamed from: e */
    private Rect f118941e = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: f */
    private SurfaceTexture f118942f = null;

    /* JADX INFO: renamed from: l.ja4$a */
    public interface InterfaceC17902a {
        /* JADX INFO: renamed from: D */
        void mo143990D(byte[] bArr);
    }

    public ja4(tow towVar, boolean z) {
        this.f118943g = towVar;
        m143977l(towVar, z);
    }

    /* JADX INFO: renamed from: b */
    private int m143961b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: n */
    private boolean m143962n(Rect rect, Rect rect2) {
        return Math.abs(((float) rect2.width()) - ((float) rect.width())) > ((float) this.f118940d) || Math.abs(((float) rect2.height()) - ((float) rect.height())) > ((float) this.f118940d) || Math.abs(rect.left - rect2.left) > this.f118940d || Math.abs(rect.right - rect2.right) > this.f118940d || Math.abs(rect.top - rect2.top) > this.f118940d || Math.abs(rect.bottom - rect2.bottom) > this.f118940d;
    }

    /* JADX INFO: renamed from: q */
    private Rect m143963q(RectF rectF) {
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* JADX INFO: renamed from: A */
    public void m143964A(int i) {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            xplVar.mo104562b(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m143965B(SurfaceTexture surfaceTexture) {
        xpl xplVar = this.f118939c;
        if (xplVar == null) {
            return false;
        }
        this.f118942f = surfaceTexture;
        return xplVar.mo104569j(surfaceTexture);
    }

    /* JADX INFO: renamed from: C */
    public boolean m143966C(int i, row rowVar) {
        xpl xplVar = this.f118939c;
        return xplVar != null && xplVar.mo104552E(i, rowVar);
    }

    /* JADX INFO: renamed from: a */
    public Rect m143967a(float f, float f2, Rect rect) {
        gu6 gu6Var = new gu6(((ciw) this.f118939c).m110020V(), new RectF(rect));
        int iWidth = rect.width() / 5;
        int i = iWidth / 2;
        int iM143961b = m143961b(((int) f) - i, rect.left, rect.right - iWidth);
        int iM143961b2 = m143961b(((int) f2) - i, rect.top, rect.bottom - iWidth);
        return m143963q(gu6Var.m132275c(new RectF(iM143961b, iM143961b2, iM143961b + iWidth, iM143961b2 + iWidth)));
    }

    /* JADX INFO: renamed from: c */
    public void m143968c() {
        if (this.f118943g.f175483g0) {
            tow towVar = this.f118943g;
            Rect rect = new Rect(0, 0, towVar.f175480f, towVar.f175478e);
            m143970e(m143967a(rect.centerX(), rect.centerY(), rect), null);
        } else if (this.f118939c != null) {
            m143970e(new Rect(-100, -100, 100, 100), null);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m143969d(int i, int i2, float f, float f2, float f3, float f4, float f5) {
        int iM143961b;
        int iM143961b2;
        int iM143961b3;
        int iM143961b4;
        if (!this.f118943g.f175483g0) {
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
            m143970e(new Rect((int) (((f * 2000.0f) / f6) - 1000.0f), (int) (((f2 * 2000.0f) / f7) - 1000.0f), (int) (((f3 * 2000.0f) / f6) - 1000.0f), (int) (((f4 * 2000.0f) / f7) - 1000.0f)), null);
            return;
        }
        gu6 gu6Var = new gu6(((ciw) this.f118939c).m110020V(), new RectF(0.0f, 0.0f, i2, i));
        Rect rect = new Rect(0, 0, i2, i);
        if (m143978m()) {
            iM143961b = m143961b((int) f2, 0, rect.width());
            iM143961b2 = m143961b((int) (rect.height() - f3), 0, rect.height());
            iM143961b3 = m143961b((int) f4, 0, rect.width());
            iM143961b4 = m143961b((int) (rect.height() - f), 0, rect.height());
        } else {
            iM143961b = m143961b((int) f2, 0, rect.width());
            iM143961b2 = m143961b((int) f, 0, rect.height());
            iM143961b3 = m143961b((int) f4, 0, rect.width());
            iM143961b4 = m143961b((int) f3, 0, rect.height());
        }
        RectF rectF = new RectF(iM143961b, iM143961b2, iM143961b3, iM143961b4);
        rectF.toString();
        m143970e(m143963q(gu6Var.m132275c(rectF)), null);
        this.f118941e.toString();
    }

    /* JADX INFO: renamed from: e */
    public void m143970e(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        if (this.f118939c != null) {
            if (m143962n(this.f118941e, rect) || !m143978m()) {
                this.f118941e.set(rect);
                this.f118939c.mo104570k(this.f118941e, autoFocusCallback);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public xpl m143971f() {
        return this.f118939c;
    }

    /* JADX INFO: renamed from: g */
    public int m143972g() {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            return xplVar.mo104571m();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m143973h() {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            return xplVar.mo104564d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m143974i() {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            return xplVar.mo104567h();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public int m143975j() {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            return xplVar.mo104563c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int m143976k() {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            return xplVar.mo104566g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m143977l(tow towVar, boolean z) {
        if (towVar.f175483g0) {
            this.f118939c = new ciw(towVar);
        } else {
            this.f118939c = new biw(towVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m143978m() {
        xpl xplVar = this.f118939c;
        if (xplVar == null) {
            return false;
        }
        return xplVar.mo104568i();
    }

    /* JADX INFO: renamed from: o */
    public void m143979o() {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            xplVar.mo104559L();
        }
    }

    @Override // p153l.xpl.InterfaceC21407a
    public void onData(byte[] bArr) {
        InterfaceC17902a interfaceC17902a = this.f118938b;
        if (interfaceC17902a != null) {
            interfaceC17902a.mo143990D(bArr);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m143980p(int i, row rowVar) {
        xpl xplVar = this.f118939c;
        if (xplVar == null) {
            return false;
        }
        if (!xplVar.mo104554G(i, rowVar)) {
            t9c.m189745c("CameraSource", "Camera prepare Failed !!!");
            return false;
        }
        this.f118939c.mo104558K(this);
        this.f118941e = new Rect();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public int m143981r() {
        xpl xplVar = this.f118939c;
        if (xplVar == null) {
            return 1;
        }
        try {
            xplVar.mo104558K(null);
            this.f118939c.mo104565e(null);
            this.f118939c.mo104561a();
            this.f118942f = null;
            this.f118939c = null;
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m143982s(int i, row rowVar) {
        xpl xplVar = this.f118939c;
        if (xplVar == null) {
            return false;
        }
        xplVar.mo104553F(i, rowVar);
        return this.f118939c.mo104569j(this.f118942f);
    }

    /* JADX INFO: renamed from: u */
    public void m143984u(Context context) {
        xpl xplVar = this.f118939c;
        if (xplVar == null || !(xplVar instanceof ciw)) {
            return;
        }
        ((ciw) xplVar).m110022e0(context);
    }

    /* JADX INFO: renamed from: v */
    public void m143985v(InterfaceC17902a interfaceC17902a) {
        this.f118938b = interfaceC17902a;
    }

    /* JADX INFO: renamed from: w */
    public void m143986w(int i) {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            xplVar.setExposureCompensation(i);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m143987x(ciw.InterfaceC16270h interfaceC16270h) {
        xpl xplVar = this.f118939c;
        if (xplVar == null || !(xplVar instanceof ciw)) {
            return;
        }
        ((ciw) xplVar).m110023f0(interfaceC16270h);
    }

    /* JADX INFO: renamed from: y */
    public void m143988y(Camera.ErrorCallback errorCallback) {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            xplVar.mo104565e(errorCallback);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m143989z(xpl.InterfaceC21410d interfaceC21410d) {
        xpl xplVar = this.f118939c;
        if (xplVar != null) {
            xplVar.mo104556I(interfaceC21410d);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m143983t() {
    }
}
