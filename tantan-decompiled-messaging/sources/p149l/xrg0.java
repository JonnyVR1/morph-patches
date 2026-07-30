package p149l;

import android.content.Context;
import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes.dex */
public final class xrg0 implements tbg0 {

    /* JADX INFO: renamed from: f */
    public static final String f194138f = "SudGIP ".concat(xrg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final ejg0 f194139a;

    /* JADX INFO: renamed from: b */
    public final ycg0 f194140b;

    /* JADX INFO: renamed from: c */
    public GameInfo f194141c;

    /* JADX INFO: renamed from: d */
    public final long f194142d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f194143e = false;

    public xrg0(Context context, vcg0 vcg0Var, ejg0 ejg0Var) {
        new mhg0(this);
        new ing0(this);
        this.f194139a = ejg0Var;
        this.f194140b = vcg0Var.f180928b;
    }

    @Override // p149l.tbg0
    /* JADX INFO: renamed from: a */
    public final void mo149032a(GameInfo gameInfo, int i, String str) {
        this.f194143e = false;
        if (gameInfo == null) {
            this.f194139a.m116842b(2, -1, "gameInfo params cannot be null");
            return;
        }
        this.f194141c = gameInfo;
        ycg0 ycg0Var = this.f194140b;
        int i2 = gameInfo.engine;
        kqg0 kqg0Var = new kqg0(this);
        if (1 == i2) {
            ycg0Var.f197449a.m149778b(i2, kqg0Var);
            return;
        }
        if (5 == i2) {
            ycg0Var.f197450b.m149778b(i2, kqg0Var);
            return;
        }
        ycg0Var.getClass();
        kqg0Var.mo146944a("不支持engine=" + i2);
    }

    @Override // p149l.tbg0
    public final void cancel() {
        this.f194143e = true;
        GameInfo gameInfo = this.f194141c;
        if (gameInfo != null) {
            ycg0 ycg0Var = this.f194140b;
            int i = gameInfo.engine;
            long j = this.f194142d;
            if (1 == i) {
                ycg0Var.f197449a.getClass();
                String str = t8g0.f168916d;
                o6g0.f142345a.m187555e(j);
            } else {
                if (5 != i) {
                    ycg0Var.getClass();
                    return;
                }
                ycg0Var.f197450b.getClass();
                String str2 = t8g0.f168916d;
                o6g0.f142345a.m187555e(j);
            }
        }
    }
}
