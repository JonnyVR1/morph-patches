package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class rmp0 implements iam<tam> {

    /* JADX INFO: renamed from: a */
    public tam f163895a;

    /* JADX INFO: renamed from: b */
    public smp0 f163896b;

    /* JADX INFO: renamed from: c */
    public dem0 f163897c;

    /* JADX INFO: renamed from: d */
    public boolean f163898d;

    public rmp0(boolean z) {
        this.f163898d = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m182091m(View view) {
        this.f163895a.mo135968y1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m182092q(View view) {
        this.f163895a.mo135968y1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m182093u() {
        this.f163895a.mo135958K1(true, true, "slide");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        dem0 dem0Var = this.f163897c;
        if (dem0Var != null) {
            dem0Var.m115437d();
            return;
        }
        smp0 smp0Var = this.f163896b;
        if (smp0Var != null) {
            smp0Var.m186824d();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tam tamVar) {
        this.f163895a = tamVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m182095j() {
        dem0 dem0Var = this.f163897c;
        if (dem0Var != null) {
            dem0Var.m115438e();
            return;
        }
        smp0 smp0Var = this.f163896b;
        if (smp0Var != null) {
            smp0Var.m186825e();
        }
    }

    /* JADX INFO: renamed from: k */
    public uam m182096k() {
        dem0 dem0Var = this.f163897c;
        if (dem0Var != null) {
            return dem0Var.m115439f();
        }
        smp0 smp0Var = this.f163896b;
        if (smp0Var != null) {
            return smp0Var.m186826f();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m182097l() {
        dem0 dem0Var = this.f163897c;
        if (dem0Var != null && dem0Var.m115441h()) {
            return true;
        }
        smp0 smp0Var = this.f163896b;
        return smp0Var != null && smp0Var.m186829i();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m182098n() {
        return Boolean.valueOf(this.f163895a.mo135967v0());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m182099p() {
        this.f163895a.mo135958K1(true, true, "slide");
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Boolean m182100s() {
        return Boolean.valueOf(this.f163895a.mo135967v0());
    }

    /* JADX INFO: renamed from: v */
    public boolean m182101v() {
        if (this.f163898d) {
            if (this.f163897c == null) {
                this.f163897c = new dem0();
            }
            return this.f163897c.m115442i(new View.OnClickListener() { // from class: l.lmp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132707a.m182091m(view);
                }
            }, new pcj() { // from class: l.mmp0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f137627a.m182098n();
                }
            }, new x20() { // from class: l.nmp0
                @Override // p153l.x20
                public final void call() {
                    this.f142733a.m182099p();
                }
            });
        }
        if (this.f163896b == null) {
            this.f163896b = new smp0();
        }
        return this.f163896b.m186830j(new View.OnClickListener() { // from class: l.omp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147982a.m182092q(view);
            }
        }, new pcj() { // from class: l.pmp0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153210a.m182100s();
            }
        }, new x20() { // from class: l.qmp0
            @Override // p153l.x20
            public final void call() {
                this.f158393a.m182093u();
            }
        });
    }
}
