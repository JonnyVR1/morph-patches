package p149l;

import Sudabstract.Sudfor;
import java.util.ArrayList;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerPreloadMGPkg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class veg0 {

    /* JADX INFO: renamed from: i */
    public static final String f181187i = "SudGIP ".concat(veg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final long f181188a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f181189b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f181190c = false;

    /* JADX INFO: renamed from: d */
    public final ycg0 f181191d;

    /* JADX INFO: renamed from: e */
    public final udg0 f181192e;

    /* JADX INFO: renamed from: f */
    public long f181193f;

    /* JADX INFO: renamed from: g */
    public long f181194g;

    /* JADX INFO: renamed from: h */
    public ipg0 f181195h;

    public veg0(long j) {
        this.f181188a = j;
        vcg0 vcg0Var = vcg0.f180926c;
        if (vcg0Var == null) {
            qkq0.m175383a("SudGameRuntime hasn't been initialized");
            throw null;
        }
        this.f181191d = vcg0Var.f180928b;
        this.f181192e = vcg0Var.f180927a;
    }

    /* JADX INFO: renamed from: a */
    public final void m198181a(int i, String str) {
        ArrayList arrayList = this.f181189b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ISudListenerPreloadMGPkg) obj).onPreloadFailure(this.f181188a, i, str);
        }
        this.f181190c = false;
        this.f181189b.clear();
        ipg0 ipg0Var = this.f181195h;
        if (ipg0Var != null) {
            ipg0Var.f114294a.f144996a.remove(Long.valueOf(this.f181188a));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m198182b(final GameInfo gameInfo) {
        udg0 udg0Var = this.f181192e;
        int i = gameInfo.engine;
        long j = gameInfo.mgId;
        String str = gameInfo.version;
        mgg0 mgg0Var = new mgg0() { // from class: l.teg0
            @Override // p149l.mgg0
            /* JADX INFO: renamed from: a */
            public final void mo154544a(boolean z, String str2, boolean z2) {
                this.f169841a.m198183c(gameInfo, z, str2, z2);
            }
        };
        if (1 == i) {
            udg0Var.f175919a.m159331d(i, j, str, mgg0Var);
        } else if (5 == i) {
            udg0Var.f175920b.m159331d(i, j, str, mgg0Var);
        } else {
            udg0Var.getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m198183c(GameInfo gameInfo, boolean z, String str, boolean z2) {
        if (this.f181190c) {
            String str2 = f181187i;
            SudLogger.m221565d(str2, "preload isGameInstalled isInstalled=" + z);
            if (z) {
                LogUtils.file("SudGamePkgPreloadTask", "preload gamepackage is installed");
                SudLogger.m221565d(str2, "preload gamepackage is installed");
                ArrayList arrayList = this.f181189b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ISudListenerPreloadMGPkg) obj).onPreloadSuccess(this.f181188a);
                }
                this.f181190c = false;
                this.f181189b.clear();
                ipg0 ipg0Var = this.f181195h;
                if (ipg0Var != null) {
                    ipg0Var.f114294a.f144996a.remove(Long.valueOf(this.f181188a));
                    return;
                }
                return;
            }
            String str3 = 1 == gameInfo.engine ? gameInfo.eUrl : "";
            if (str3 == null || str3.isEmpty()) {
                m198181a(-1, "null == gameInfo.eUrl || gameInfo.eUrl.isEmpty()");
                return;
            }
            gig0 gig0Var = new gig0();
            gig0Var.f102893a = gameInfo.engine;
            gig0Var.f102894b = Sudfor.PreloadPackageGamePackage;
            gig0Var.f102895c = gameInfo.mgId;
            gig0Var.f102896d = str3;
            gig0Var.f102897e = gameInfo.version;
            gig0Var.f102898f = gameInfo.hash;
            mcg0 mcg0Var = new mcg0("checkoutGamePkg");
            mcg0Var.f133120j.put("engine", Integer.valueOf(gameInfo.engine));
            mcg0Var.f133120j.put("package_type", 4);
            mcg0Var.f133117g = String.valueOf(gameInfo.mgId);
            udg0 udg0Var = this.f181192e;
            neg0 neg0Var = new neg0(this, mcg0Var);
            udg0Var.getClass();
            int i2 = gig0Var.f102893a;
            if (1 == i2) {
                udg0Var.f175919a.m159330a(gig0Var, neg0Var);
            } else if (5 == i2) {
                udg0Var.f175920b.m159330a(gig0Var, neg0Var);
            }
        }
    }
}
