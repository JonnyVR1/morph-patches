package p002l;

import android.util.Pair;
import l.e30;
import l.ffw;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yef0 extends xxl {

    /* JADX INFO: renamed from: c */
    public final dkf0 f22823c;

    public yef0(dkf0 dkf0Var, c<Pair<Boolean, Boolean>> cVar, f6t f6tVar) {
        super(cVar, f6tVar);
        this.f22823c = dkf0Var;
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: f */
    public void mo10924f() {
        m26172c(ypv.a.u0()).takeFirst(new w9j() { // from class: l.wef0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.d(new e30() { // from class: l.xef0
            public final void call(Object obj) {
                this.f22246a.m26659i((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m26659i(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f22823c.mo11927d(true, false, null, null);
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: b */
    public void mo10923b() {
    }
}
