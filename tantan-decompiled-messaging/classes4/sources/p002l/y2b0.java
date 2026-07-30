package p002l;

import android.app.Dialog;
import android.util.Pair;
import l.e1m;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y2b0 extends xxl {

    /* JADX INFO: renamed from: c */
    public final dkf0 f22612c;

    /* JADX INFO: renamed from: d */
    public e1m f22613d;

    /* JADX INFO: renamed from: l.y2b0$a */
    public class C0905a implements e1m {
        public C0905a() {
        }

        /* JADX INFO: renamed from: a */
        public void m26306a(Dialog dialog) {
            if (y2b0.this.m26173d()) {
                return;
            }
            y2b0.this.f22612c.mo11926c(true);
        }

        /* JADX INFO: renamed from: b */
        public void m26307b(Dialog dialog) {
            y2b0.this.f22612c.mo11926c(false);
        }
    }

    public y2b0(dkf0 dkf0Var, c<Pair<Boolean, Boolean>> cVar, f6t f6tVar) {
        super(cVar, f6tVar);
        this.f22613d = new C0905a();
        this.f22612c = dkf0Var;
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: b */
    public void mo10923b() {
        ypv.a.C0(this.f22613d);
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: f */
    public void mo10924f() {
        ypv.a.g0(this.f22613d);
        if (ypv.a.Q()) {
            this.f22612c.mo11926c(false);
        }
    }
}
