package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.roj0;
import l.ura;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class bh60 {

    /* JADX INFO: renamed from: a */
    public PurchaseType f10106a;

    /* JADX INFO: renamed from: b */
    public f5f0 f10107b;

    public bh60(PurchaseType purchaseType, f5f0 f5f0Var) {
        this.f10106a = purchaseType;
        this.f10107b = f5f0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m12031a() {
        if (ura.e().d().U()) {
            CoreModule.c.O0.B3();
        }
        mo11533c();
    }

    /* JADX INFO: renamed from: b */
    public abstract c<roj0> mo11532b();

    /* JADX INFO: renamed from: d */
    public abstract void mo11534d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo11535e();

    /* JADX INFO: renamed from: c */
    public void mo11533c() {
    }
}
