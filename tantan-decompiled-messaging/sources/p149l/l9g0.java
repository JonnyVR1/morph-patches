package p149l;

import Sudabstract.Sudfor;
import android.content.Context;
import tech.sud.gip.core.GameInfo;

/* JADX INFO: loaded from: classes.dex */
public final class l9g0 implements tbg0 {

    /* JADX INFO: renamed from: j */
    public static final String f127108j = "SudGIP ".concat(l9g0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final Context f127109a;

    /* JADX INFO: renamed from: b */
    public GameInfo f127110b;

    /* JADX INFO: renamed from: c */
    public final ejg0 f127111c;

    /* JADX INFO: renamed from: d */
    public final udg0 f127112d;

    /* JADX INFO: renamed from: e */
    public long f127113e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f127114f = false;

    /* JADX INFO: renamed from: g */
    public long f127115g = 0;

    /* JADX INFO: renamed from: h */
    public final d6g0 f127116h = new d6g0(this);

    /* JADX INFO: renamed from: i */
    public final l8g0 f127117i = new l8g0(this);

    public l9g0(Context context, vcg0 vcg0Var, ejg0 ejg0Var) {
        this.f127109a = context;
        this.f127112d = vcg0Var.f180927a;
        this.f127111c = ejg0Var;
    }

    @Override // p149l.tbg0
    /* JADX INFO: renamed from: a */
    public final void mo149032a(GameInfo gameInfo, int i, String str) {
        long jM159330a;
        this.f127114f = false;
        if (gameInfo == null) {
            this.f127111c.m116842b(3, -1, "null == gameInfo");
            return;
        }
        this.f127110b = gameInfo;
        this.f127115g = gameInfo.mgId;
        if (gameInfo.isInstalled) {
            this.f127111c.m116841a(3);
            return;
        }
        String str2 = 1 == gameInfo.engine ? gameInfo.eUrl : "";
        if (str2 == null || str2.isEmpty()) {
            this.f127111c.m116842b(3, -1, "null == gameInfo.eUrl || gameInfo.eUrl.isEmpty()");
            return;
        }
        gig0 gig0Var = new gig0();
        gig0Var.f102893a = gameInfo.engine;
        gig0Var.f102894b = Sudfor.LoadMGPackageGamePackage;
        gig0Var.f102895c = gameInfo.mgId;
        gig0Var.f102896d = str2;
        gig0Var.f102897e = gameInfo.version;
        gig0Var.f102898f = gameInfo.hash;
        udg0 udg0Var = this.f127112d;
        d6g0 d6g0Var = this.f127116h;
        udg0Var.getClass();
        int i2 = gig0Var.f102893a;
        if (1 == i2) {
            jM159330a = udg0Var.f175919a.m159330a(gig0Var, d6g0Var);
        } else {
            jM159330a = 5 == i2 ? udg0Var.f175920b.m159330a(gig0Var, d6g0Var) : 0L;
        }
        this.f127113e = jM159330a;
    }

    @Override // p149l.tbg0
    public final void cancel() {
        this.f127114f = true;
        GameInfo gameInfo = this.f127110b;
        if (gameInfo != null) {
            udg0 udg0Var = this.f127112d;
            int i = gameInfo.engine;
            long j = this.f127113e;
            if (1 == i) {
                udg0Var.f175919a.getClass();
                String str = t8g0.f168916d;
                o6g0.f142345a.m187555e(j);
            } else {
                if (5 != i) {
                    udg0Var.getClass();
                    return;
                }
                udg0Var.f175920b.getClass();
                String str2 = t8g0.f168916d;
                o6g0.f142345a.m187555e(j);
            }
        }
    }
}
