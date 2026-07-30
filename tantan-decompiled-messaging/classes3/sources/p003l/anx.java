package p003l;

import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class anx {

    /* JADX INFO: renamed from: a */
    public wwl f2238a = new m500();

    /* JADX INFO: renamed from: a */
    public void m2886a() {
        this.f2238a.mo6309j();
    }

    /* JADX INFO: renamed from: b */
    public void m2887b(int i, boolean z, float f) {
        this.f2238a.mo6299A(i, z, f);
    }

    /* JADX INFO: renamed from: c */
    public void m2888c() {
        this.f2238a.create();
    }

    /* JADX INFO: renamed from: d */
    public void m2889d(af50 af50Var) {
        this.f2238a.mo6318z(af50Var);
    }

    /* JADX INFO: renamed from: e */
    public int m2890e() {
        return this.f2238a.mo6303d();
    }

    /* JADX INFO: renamed from: f */
    public int m2891f() {
        return this.f2238a.mo6302c();
    }

    /* JADX INFO: renamed from: g */
    public void m2892g(List<MMPresetFilter> list) {
        wwl wwlVar = this.f2238a;
        if (wwlVar instanceof m500) {
            ((m500) wwlVar).m6312o(list);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m2893h() {
        return this.f2238a.mo6304e();
    }

    /* JADX INFO: renamed from: i */
    public boolean m2894i() {
        return this.f2238a.mo6307h();
    }

    /* JADX INFO: renamed from: j */
    public void m2895j() {
        this.f2238a.mo6314s();
    }

    /* JADX INFO: renamed from: k */
    public boolean m2896k(Act act) {
        if (CoreModule.N().isCameraSdkLoaded()) {
            return this.f2238a.mo6316x(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m2897l() {
        if (CoreModule.N().isCameraSdkLoaded()) {
            this.f2238a.release();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2898m(SurfaceHolder surfaceHolder, int i, int i2) {
        this.f2238a.mo6311n(i, i2);
        this.f2238a.mo6315w(surfaceHolder);
        this.f2238a.mo6306g();
    }

    /* JADX INFO: renamed from: n */
    public void m2899n(int i) {
        this.f2238a.mo6301b(i);
    }

    /* JADX INFO: renamed from: o */
    public void m2900o() {
        if (CoreModule.N().isCameraSdkLoaded()) {
            this.f2238a.mo6306g();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2901p() {
        this.f2238a.mo6308i();
    }

    /* JADX INFO: renamed from: q */
    public void m2902q() {
        if (CoreModule.N().isCameraSdkLoaded()) {
            this.f2238a.mo6300a();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2903r() {
        this.f2238a.mo6305f();
    }

    /* JADX INFO: renamed from: s */
    public void m2904s(qg50 qg50Var) {
        this.f2238a.mo6317y(qg50Var);
    }
}
