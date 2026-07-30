package p003l;

import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class w7g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GameInfo f8510b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f8511c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z8g0 f8512d;

    public w7g0(z8g0 z8g0Var, int i, GameInfo gameInfo, String str) {
        this.f8512d = z8g0Var;
        this.f8509a = i;
        this.f8510b = gameInfo;
        this.f8511c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z8g0 z8g0Var = this.f8512d;
        if (this.f8509a == 0) {
            mqg0 mqg0Var = z8g0Var.f9275f;
            long j = z8g0Var.f9270a;
            mqg0Var.f5740o.put(Long.valueOf(j), this.f8510b);
            this.f8512d.f9274e.onSuccess(this.f8510b);
            return;
        }
        GameInfo gameInfo = (GameInfo) z8g0Var.f9275f.f5740o.get(Long.valueOf(z8g0Var.f9270a));
        z8g0 z8g0Var2 = this.f8512d;
        if (gameInfo != null) {
            z8g0Var2.f9274e.onSuccess(gameInfo);
        } else {
            z8g0Var2.f9274e.onFailure(this.f8509a, this.f8511c);
        }
    }
}
