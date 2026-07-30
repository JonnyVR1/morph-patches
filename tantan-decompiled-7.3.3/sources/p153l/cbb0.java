package p153l;

import android.app.Dialog;
import android.util.Pair;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class cbb0 extends q0m {

    /* JADX INFO: renamed from: c */
    public final msf0 f80717c;

    /* JADX INFO: renamed from: d */
    public x3m f80718d;

    /* JADX INFO: renamed from: l.cbb0$a */
    public class C16225a implements x3m {
        public C16225a() {
        }

        @Override // p153l.x3m
        /* JADX INFO: renamed from: a */
        public void mo108624a(Dialog dialog) {
            if (cbb0.this.m174728d()) {
                return;
            }
            cbb0.this.f80717c.mo159783c(true);
        }

        @Override // p153l.x3m
        /* JADX INFO: renamed from: b */
        public void mo108625b(Dialog dialog) {
            cbb0.this.f80717c.mo159783c(false);
        }
    }

    public cbb0(msf0 msf0Var, C22421c<Pair<Boolean, Boolean>> c22421c, g8t g8tVar) {
        super(c22421c, g8tVar);
        this.f80718d = new C16225a();
        this.f80717c = msf0Var;
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: b */
    public void mo108622b() {
        zrv.f205799a.m207629C0(this.f80718d);
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: f */
    public void mo108623f() {
        zrv.f205799a.m207669g0(this.f80718d);
        if (zrv.f205799a.m207646Q()) {
            this.f80717c.mo159783c(false);
        }
    }
}
