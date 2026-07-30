package p003l;

import l.x8g0;
import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class aeg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2152a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GameInfo f2153b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2154c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dhg0 f2155d;

    public aeg0(dhg0 dhg0Var, int i, GameInfo gameInfo, String str) {
        this.f2155d = dhg0Var;
        this.f2152a = i;
        this.f2153b = gameInfo;
        this.f2154c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x8g0 x8g0Var = this.f2155d.f3003e;
        int i = this.f2152a;
        if (i == 0) {
            x8g0Var.onSuccess(this.f2153b);
        } else {
            x8g0Var.onFailure(i, this.f2154c);
        }
    }
}
