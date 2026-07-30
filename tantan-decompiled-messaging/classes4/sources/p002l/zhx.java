package p002l;

import android.util.Pair;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.ffw;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zhx extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f23433c;

    /* JADX INFO: renamed from: d */
    public final boolean f23434d;

    public zhx(nt10 nt10Var, c<Pair<Boolean, Boolean>> cVar, f6t f6tVar) {
        super(cVar, f6tVar);
        this.f23433c = nt10Var;
        this.f23434d = nt10Var instanceof dkf0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m27392h(Boolean bool) {
        this.f23433c.mo18909a(true);
        if (this.f23434d) {
            ((dkf0) this.f23433c).mo11926c(false);
        }
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: f */
    public void mo10924f() {
        m26172c(Act.mediaCapture()).subscribe(ffw.d(new e30() { // from class: l.yhx
            public final void call(Object obj) {
                this.f22892a.m27392h((Boolean) obj);
            }
        }));
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: b */
    public void mo10923b() {
    }
}
