package p149l;

import android.app.Dialog;
import android.util.Pair;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class y2b0 extends xxl {

    /* JADX INFO: renamed from: c */
    public final dkf0 f195504c;

    /* JADX INFO: renamed from: d */
    public e1m f195505d;

    /* JADX INFO: renamed from: l.y2b0$a */
    public class C21286a implements e1m {
        public C21286a() {
        }

        @Override // p149l.e1m
        /* JADX INFO: renamed from: a */
        public void mo111053a(Dialog dialog) {
            if (y2b0.this.m211509d()) {
                return;
            }
            y2b0.this.f195504c.mo112219c(true);
        }

        @Override // p149l.e1m
        /* JADX INFO: renamed from: b */
        public void mo111054b(Dialog dialog) {
            y2b0.this.f195504c.mo112219c(false);
        }
    }

    public y2b0(dkf0 dkf0Var, C22306c<Pair<Boolean, Boolean>> c22306c, f6t f6tVar) {
        super(c22306c, f6tVar);
        this.f195505d = new C21286a();
        this.f195504c = dkf0Var;
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: b */
    public void mo105960b() {
        ypv.f199493a.m199307C0(this.f195505d);
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: f */
    public void mo105961f() {
        ypv.f199493a.m199347g0(this.f195505d);
        if (ypv.f199493a.m199324Q()) {
            this.f195504c.mo112219c(false);
        }
    }
}
