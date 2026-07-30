package p153l;

import android.util.Pair;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class fnf0 extends q0m {

    /* JADX INFO: renamed from: c */
    public final msf0 f99917c;

    public fnf0(msf0 msf0Var, C22421c<Pair<Boolean, Boolean>> c22421c, g8t g8tVar) {
        super(c22421c, g8tVar);
        this.f99917c = msf0Var;
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: f */
    public void mo108623f() {
        m174727c(zrv.f205799a.m207697u0()).takeFirst(new qcj() { // from class: l.dnf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.enf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94781a.m126368i((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m126368i(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f99917c.mo159784d(true, false, null, null);
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: b */
    public void mo108622b() {
    }
}
