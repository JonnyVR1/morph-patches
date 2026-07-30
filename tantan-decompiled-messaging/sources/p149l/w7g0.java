package p149l;

import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class w7g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f185050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GameInfo f185051b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f185052c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z8g0 f185053d;

    public w7g0(z8g0 z8g0Var, int i, GameInfo gameInfo, String str) {
        this.f185053d = z8g0Var;
        this.f185050a = i;
        this.f185051b = gameInfo;
        this.f185052c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z8g0 z8g0Var = this.f185053d;
        if (this.f185050a == 0) {
            mqg0 mqg0Var = z8g0Var.f202156f;
            long j = z8g0Var.f202151a;
            mqg0Var.f135238o.put(Long.valueOf(j), this.f185051b);
            this.f185053d.f202155e.onSuccess(this.f185051b);
            return;
        }
        GameInfo gameInfo = (GameInfo) z8g0Var.f202156f.f135238o.get(Long.valueOf(z8g0Var.f202151a));
        z8g0 z8g0Var2 = this.f185053d;
        if (gameInfo != null) {
            z8g0Var2.f202155e.onSuccess(gameInfo);
        } else {
            z8g0Var2.f202155e.onFailure(this.f185050a, this.f185052c);
        }
    }
}
