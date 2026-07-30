package p149l;

import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class anx {

    /* JADX INFO: renamed from: a */
    public wwl f70773a = new m500();

    /* JADX INFO: renamed from: a */
    public void m97817a() {
        this.f70773a.mo153118j();
    }

    /* JADX INFO: renamed from: b */
    public void m97818b(int i, boolean z, float f) {
        this.f70773a.mo153108A(i, z, f);
    }

    /* JADX INFO: renamed from: c */
    public void m97819c() {
        this.f70773a.create();
    }

    /* JADX INFO: renamed from: d */
    public void m97820d(af50 af50Var) {
        this.f70773a.mo153127z(af50Var);
    }

    /* JADX INFO: renamed from: e */
    public int m97821e() {
        return this.f70773a.mo153112d();
    }

    /* JADX INFO: renamed from: f */
    public int m97822f() {
        return this.f70773a.mo153111c();
    }

    /* JADX INFO: renamed from: g */
    public void m97823g(List<MMPresetFilter> list) {
        wwl wwlVar = this.f70773a;
        if (wwlVar instanceof m500) {
            ((m500) wwlVar).m153121o(list);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m97824h() {
        return this.f70773a.mo153113e();
    }

    /* JADX INFO: renamed from: i */
    public boolean m97825i() {
        return this.f70773a.mo153116h();
    }

    /* JADX INFO: renamed from: j */
    public void m97826j() {
        this.f70773a.mo153123s();
    }

    /* JADX INFO: renamed from: k */
    public boolean m97827k(Act act) {
        if (CoreModule.m29934N().isCameraSdkLoaded()) {
            return this.f70773a.mo153125x(act);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void m97828l() {
        if (CoreModule.m29934N().isCameraSdkLoaded()) {
            this.f70773a.release();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m97829m(SurfaceHolder surfaceHolder, int i, int i2) {
        this.f70773a.mo153120n(i, i2);
        this.f70773a.mo153124w(surfaceHolder);
        this.f70773a.mo153115g();
    }

    /* JADX INFO: renamed from: n */
    public void m97830n(int i) {
        this.f70773a.mo153110b(i);
    }

    /* JADX INFO: renamed from: o */
    public void m97831o() {
        if (CoreModule.m29934N().isCameraSdkLoaded()) {
            this.f70773a.mo153115g();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m97832p() {
        this.f70773a.mo153117i();
    }

    /* JADX INFO: renamed from: q */
    public void m97833q() {
        if (CoreModule.m29934N().isCameraSdkLoaded()) {
            this.f70773a.mo153109a();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m97834r() {
        this.f70773a.mo153114f();
    }

    /* JADX INFO: renamed from: s */
    public void m97835s(qg50 qg50Var) {
        this.f70773a.mo153126y(qg50Var);
    }
}
