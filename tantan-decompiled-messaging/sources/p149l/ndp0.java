package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class ndp0 implements s7m<d8m> {

    /* JADX INFO: renamed from: a */
    public d8m f138298a;

    /* JADX INFO: renamed from: b */
    public odp0 f138299b;

    /* JADX INFO: renamed from: c */
    public z4m0 f138300c;

    /* JADX INFO: renamed from: d */
    public boolean f138301d;

    public ndp0(boolean z) {
        this.f138301d = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m159005m(View view) {
        this.f138298a.mo110336y1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m159006q(View view) {
        this.f138298a.mo110336y1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m159007u() {
        this.f138298a.mo110329K1(true, true, "slide");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        z4m0 z4m0Var = this.f138300c;
        if (z4m0Var != null) {
            z4m0Var.m217108d();
            return;
        }
        odp0 odp0Var = this.f138299b;
        if (odp0Var != null) {
            odp0Var.m163704d();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d8m d8mVar) {
        this.f138298a = d8mVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m159009j() {
        z4m0 z4m0Var = this.f138300c;
        if (z4m0Var != null) {
            z4m0Var.m217109e();
            return;
        }
        odp0 odp0Var = this.f138299b;
        if (odp0Var != null) {
            odp0Var.m163705e();
        }
    }

    /* JADX INFO: renamed from: k */
    public e8m m159010k() {
        z4m0 z4m0Var = this.f138300c;
        if (z4m0Var != null) {
            return z4m0Var.m217110f();
        }
        odp0 odp0Var = this.f138299b;
        if (odp0Var != null) {
            return odp0Var.m163706f();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m159011l() {
        z4m0 z4m0Var = this.f138300c;
        if (z4m0Var != null && z4m0Var.m217112h()) {
            return true;
        }
        odp0 odp0Var = this.f138299b;
        return odp0Var != null && odp0Var.m163709i();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m159012n() {
        return Boolean.valueOf(this.f138298a.mo110335v0());
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m159013p() {
        this.f138298a.mo110329K1(true, true, "slide");
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Boolean m159014s() {
        return Boolean.valueOf(this.f138298a.mo110335v0());
    }

    /* JADX INFO: renamed from: v */
    public boolean m159015v() {
        if (this.f138301d) {
            if (this.f138300c == null) {
                this.f138300c = new z4m0();
            }
            return this.f138300c.m217113i(new View.OnClickListener() { // from class: l.hdp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107287a.m159005m(view);
                }
            }, new v9j() { // from class: l.idp0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f112670a.m159012n();
                }
            }, new d30() { // from class: l.jdp0
                @Override // p149l.d30
                public final void call() {
                    this.f117428a.m159013p();
                }
            });
        }
        if (this.f138299b == null) {
            this.f138299b = new odp0();
        }
        return this.f138299b.m163710j(new View.OnClickListener() { // from class: l.kdp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122595a.m159006q(view);
            }
        }, new v9j() { // from class: l.ldp0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f127575a.m159014s();
            }
        }, new d30() { // from class: l.mdp0
            @Override // p149l.d30
            public final void call() {
                this.f133283a.m159007u();
            }
        });
    }
}
