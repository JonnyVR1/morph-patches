package p153l;

import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xvx {

    /* JADX INFO: renamed from: a */
    public ozl f196442a = new ae00();

    /* JADX INFO: renamed from: a */
    public void m213262a() {
        this.f196442a.mo97158j();
    }

    /* JADX INFO: renamed from: b */
    public void m213263b(int i, boolean z, float f) {
        this.f196442a.mo97148A(i, z, f);
    }

    /* JADX INFO: renamed from: c */
    public void m213264c() {
        this.f196442a.create();
    }

    /* JADX INFO: renamed from: d */
    public void m213265d(hn50 hn50Var) {
        this.f196442a.mo97167z(hn50Var);
    }

    /* JADX INFO: renamed from: e */
    public int m213266e() {
        return this.f196442a.mo97152d();
    }

    /* JADX INFO: renamed from: f */
    public int m213267f() {
        return this.f196442a.mo97151c();
    }

    /* JADX INFO: renamed from: g */
    public void m213268g(List<MMPresetFilter> list) {
        ozl ozlVar = this.f196442a;
        if (ozlVar instanceof ae00) {
            ((ae00) ozlVar).m97161o(list);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m213269h() {
        return this.f196442a.mo97153e();
    }

    /* JADX INFO: renamed from: i */
    public boolean m213270i() {
        return this.f196442a.mo97156h();
    }

    /* JADX INFO: renamed from: j */
    public void m213271j() {
        this.f196442a.mo97163s();
    }

    /* JADX INFO: renamed from: k */
    public boolean m213272k(Act act) {
        if (CoreModule.m30932N().isCameraSdkLoaded()) {
            return this.f196442a.mo97165x(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m213273l() {
        if (CoreModule.m30932N().isCameraSdkLoaded()) {
            this.f196442a.release();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m213274m(SurfaceHolder surfaceHolder, int i, int i2) {
        this.f196442a.mo97160n(i, i2);
        this.f196442a.mo97164w(surfaceHolder);
        this.f196442a.mo97155g();
    }

    /* JADX INFO: renamed from: n */
    public void m213275n(int i) {
        this.f196442a.mo97150b(i);
    }

    /* JADX INFO: renamed from: o */
    public void m213276o() {
        if (CoreModule.m30932N().isCameraSdkLoaded()) {
            this.f196442a.mo97155g();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m213277p() {
        this.f196442a.mo97157i();
    }

    /* JADX INFO: renamed from: q */
    public void m213278q() {
        if (CoreModule.m30932N().isCameraSdkLoaded()) {
            this.f196442a.mo97149a();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m213279r() {
        this.f196442a.mo97154f();
    }

    /* JADX INFO: renamed from: s */
    public void m213280s(wo50 wo50Var) {
        this.f196442a.mo97166y(wo50Var);
    }
}
