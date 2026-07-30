package p149l;

import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class aeg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GameInfo f69041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f69042c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dhg0 f69043d;

    public aeg0(dhg0 dhg0Var, int i, GameInfo gameInfo, String str) {
        this.f69043d = dhg0Var;
        this.f69040a = i;
        this.f69041b = gameInfo;
        this.f69042c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x8g0 x8g0Var = this.f69043d.f86287e;
        int i = this.f69040a;
        if (i == 0) {
            x8g0Var.onSuccess(this.f69041b);
        } else {
            x8g0Var.onFailure(i, this.f69042c);
        }
    }
}
