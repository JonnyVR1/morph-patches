package p153l;

import Sudabstract.Sudfor;
import android.content.Context;
import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes.dex */
public final class thg0 implements bkg0 {

    /* JADX INFO: renamed from: j */
    public static final String f174360j = "SudGIP ".concat(thg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final Context f174361a;

    /* JADX INFO: renamed from: b */
    public GameInfo f174362b;

    /* JADX INFO: renamed from: c */
    public final mrg0 f174363c;

    /* JADX INFO: renamed from: d */
    public final cmg0 f174364d;

    /* JADX INFO: renamed from: e */
    public long f174365e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f174366f = false;

    /* JADX INFO: renamed from: g */
    public long f174367g = 0;

    /* JADX INFO: renamed from: h */
    public final leg0 f174368h = new leg0(this);

    /* JADX INFO: renamed from: i */
    public final tgg0 f174369i = new tgg0(this);

    public thg0(Context context, dlg0 dlg0Var, mrg0 mrg0Var) {
        this.f174361a = context;
        this.f174364d = dlg0Var.f89533a;
        this.f174363c = mrg0Var;
    }

    @Override // p153l.bkg0
    /* JADX INFO: renamed from: a */
    public final void mo104809a(GameInfo gameInfo, int i, String str) {
        long jM202119a;
        this.f174366f = false;
        if (gameInfo == null) {
            this.f174363c.m159699b(3, -1, "null == gameInfo");
            return;
        }
        this.f174362b = gameInfo;
        this.f174367g = gameInfo.mgId;
        if (gameInfo.isInstalled) {
            this.f174363c.m159698a(3);
            return;
        }
        String str2 = 1 == gameInfo.engine ? gameInfo.eUrl : "";
        if (str2 == null || str2.isEmpty()) {
            this.f174363c.m159699b(3, -1, "null == gameInfo.eUrl || gameInfo.eUrl.isEmpty()");
            return;
        }
        oqg0 oqg0Var = new oqg0();
        oqg0Var.f148588a = gameInfo.engine;
        oqg0Var.f148589b = Sudfor.LoadMGPackageGamePackage;
        oqg0Var.f148590c = gameInfo.mgId;
        oqg0Var.f148591d = str2;
        oqg0Var.f148592e = gameInfo.version;
        oqg0Var.f148593f = gameInfo.hash;
        cmg0 cmg0Var = this.f174364d;
        leg0 leg0Var = this.f174368h;
        cmg0Var.getClass();
        int i2 = oqg0Var.f148588a;
        if (1 == i2) {
            jM202119a = cmg0Var.f82590a.m202119a(oqg0Var, leg0Var);
        } else {
            jM202119a = 5 == i2 ? cmg0Var.f82591b.m202119a(oqg0Var, leg0Var) : 0L;
        }
        this.f174365e = jM202119a;
    }

    @Override // p153l.bkg0
    public final void cancel() {
        this.f174366f = true;
        GameInfo gameInfo = this.f174362b;
        if (gameInfo != null) {
            cmg0 cmg0Var = this.f174364d;
            int i = gameInfo.engine;
            long j = this.f174365e;
            if (1 == i) {
                cmg0Var.f82590a.getClass();
                String str = bhg0.f76783d;
                weg0.f188695a.m104344e(j);
            } else {
                if (5 != i) {
                    cmg0Var.getClass();
                    return;
                }
                cmg0Var.f82591b.getClass();
                String str2 = bhg0.f76783d;
                weg0.f188695a.m104344e(j);
            }
        }
    }
}
