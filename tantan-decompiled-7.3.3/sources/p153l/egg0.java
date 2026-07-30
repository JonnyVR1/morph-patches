package p153l;

import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class egg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GameInfo f93931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f93932c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hhg0 f93933d;

    public egg0(hhg0 hhg0Var, int i, GameInfo gameInfo, String str) {
        this.f93933d = hhg0Var;
        this.f93930a = i;
        this.f93931b = gameInfo;
        this.f93932c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hhg0 hhg0Var = this.f93933d;
        if (this.f93930a == 0) {
            uyg0 uyg0Var = hhg0Var.f109892f;
            long j = hhg0Var.f109887a;
            uyg0Var.f181615o.put(Long.valueOf(j), this.f93931b);
            this.f93933d.f109891e.onSuccess(this.f93931b);
            return;
        }
        GameInfo gameInfo = (GameInfo) hhg0Var.f109892f.f181615o.get(Long.valueOf(hhg0Var.f109887a));
        hhg0 hhg0Var2 = this.f93933d;
        if (gameInfo != null) {
            hhg0Var2.f109891e.onSuccess(gameInfo);
        } else {
            hhg0Var2.f109891e.onFailure(this.f93930a, this.f93932c);
        }
    }
}
