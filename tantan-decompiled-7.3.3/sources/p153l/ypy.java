package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.utils.DeviceUtil;

/* JADX INFO: loaded from: classes11.dex */
public class ypy extends ioi0<eqy> {

    /* JADX INFO: renamed from: h */
    public rpy f201142h;

    /* JADX INFO: renamed from: i */
    public Runnable f201143i;

    /* JADX INFO: renamed from: l.ypy$a */
    public class RunnableC21663a implements Runnable {
        public RunnableC21663a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ypy.this.m141316o()) {
                wpy wpyVarM217070v = ypy.this.m217070v();
                if (wpyVarM217070v != null) {
                    wpyVarM217070v.m121751a(ypy.this.mo82324j());
                    ypy.this.m141317q(wpyVarM217070v);
                }
                u21.m194239c(this, ypy.this.f201142h.m182560g());
            }
        }
    }

    public ypy() {
        this.f201143i = new RunnableC21663a();
        this.f201142h = new rpy();
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: c */
    public long mo82319c() {
        return this.f201142h.m182562i();
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: d */
    public int mo82320d() {
        return this.f201142h.m182563j();
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: e */
    public long mo82321e() {
        return this.f201142h.m182564k();
    }

    @Override // p153l.ioi0
    @NonNull
    /* JADX INFO: renamed from: j */
    public String mo82324j() {
        return "memory";
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: k */
    public f6m mo82325k() {
        return new dqy(mo82324j());
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: l */
    public uni0 mo82326l() {
        return this.f201142h;
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: p */
    public int mo82328p() {
        return 30;
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: r */
    public void mo82329r() {
        u21.m194239c(this.f201143i, this.f201142h.m182561h());
    }

    /* JADX INFO: renamed from: v */
    public final wpy m217070v() {
        eqy eqyVarM202349a = vpy.m202349a(du2.m118045e());
        if (m217072x(eqyVarM202349a)) {
            return new wpy(du2.m118046f(), eqyVarM202349a.f95427b, eqyVarM202349a.f95426a, eqyVarM202349a.f95429d, eqyVarM202349a.f95428c);
        }
        return null;
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public eqy mo82322f() {
        return vpy.m202349a(du2.m118045e());
    }

    /* JADX INFO: renamed from: x */
    public final boolean m217072x(eqy eqyVar) {
        long jM82402l = DeviceUtil.m82402l(this.f116167f);
        return jM82402l > 0 && ((long) eqyVar.f95428c) > jM82402l / 10240;
    }

    public ypy(rpy rpyVar) {
        this.f201143i = new RunnableC21663a();
        this.f201142h = rpyVar;
    }
}
