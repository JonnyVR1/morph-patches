package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class xjv0 implements myv0 {

    /* JADX INFO: renamed from: a */
    public myv0 f194651a;

    @Override // p153l.myv0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo98626a(View view) {
        myv0 myv0Var = this.f194651a;
        if (myv0Var != null) {
            myv0Var.mo98626a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m211264b(myv0 myv0Var) {
        this.f194651a = myv0Var;
    }

    @Override // p153l.myv0
    public final synchronized void zzb() {
        myv0 myv0Var = this.f194651a;
        if (myv0Var != null) {
            myv0Var.zzb();
        }
    }

    @Override // p153l.myv0
    public final synchronized void zzc() {
        myv0 myv0Var = this.f194651a;
        if (myv0Var != null) {
            myv0Var.zzc();
        }
    }
}
