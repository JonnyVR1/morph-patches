package p153l;

import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class img0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115774a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GameInfo f115775b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f115776c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lpg0 f115777d;

    public img0(lpg0 lpg0Var, int i, GameInfo gameInfo, String str) {
        this.f115777d = lpg0Var;
        this.f115774a = i;
        this.f115775b = gameInfo;
        this.f115776c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fhg0 fhg0Var = this.f115777d.f133062e;
        int i = this.f115774a;
        if (i == 0) {
            fhg0Var.onSuccess(this.f115775b);
        } else {
            fhg0Var.onFailure(i, this.f115776c);
        }
    }
}
