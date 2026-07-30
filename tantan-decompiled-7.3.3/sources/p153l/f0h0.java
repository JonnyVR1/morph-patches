package p153l;

import android.content.Context;
import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f0h0 implements bkg0 {

    /* JADX INFO: renamed from: f */
    public static final String f96681f = "SudGIP ".concat(f0h0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final mrg0 f96682a;

    /* JADX INFO: renamed from: b */
    public final glg0 f96683b;

    /* JADX INFO: renamed from: c */
    public GameInfo f96684c;

    /* JADX INFO: renamed from: d */
    public final long f96685d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f96686e = false;

    public f0h0(Context context, dlg0 dlg0Var, mrg0 mrg0Var) {
        new upg0(this);
        new qvg0(this);
        this.f96682a = mrg0Var;
        this.f96683b = dlg0Var.f89534b;
    }

    @Override // p153l.bkg0
    /* JADX INFO: renamed from: a */
    public final void mo104809a(GameInfo gameInfo, int i, String str) {
        this.f96686e = false;
        if (gameInfo == null) {
            this.f96682a.m159699b(2, -1, "gameInfo params cannot be null");
            return;
        }
        this.f96684c = gameInfo;
        glg0 glg0Var = this.f96683b;
        int i2 = gameInfo.engine;
        syg0 syg0Var = new syg0(this);
        if (1 == i2) {
            glg0Var.f104849a.m192040b(i2, syg0Var);
            return;
        }
        if (5 == i2) {
            glg0Var.f104850b.m192040b(i2, syg0Var);
            return;
        }
        glg0Var.getClass();
        syg0Var.mo121147a("不支持engine=" + i2);
    }

    @Override // p153l.bkg0
    public final void cancel() {
        this.f96686e = true;
        GameInfo gameInfo = this.f96684c;
        if (gameInfo != null) {
            glg0 glg0Var = this.f96683b;
            int i = gameInfo.engine;
            long j = this.f96685d;
            if (1 == i) {
                glg0Var.f104849a.getClass();
                String str = bhg0.f76783d;
                weg0.f188695a.m104344e(j);
            } else {
                if (5 != i) {
                    glg0Var.getClass();
                    return;
                }
                glg0Var.f104850b.getClass();
                String str2 = bhg0.f76783d;
                weg0.f188695a.m104344e(j);
            }
        }
    }
}
