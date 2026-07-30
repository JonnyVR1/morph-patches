package p153l;

import java.util.HashMap;
import java.util.Map;
import tech.sud.gip.core.ISudCfg;

/* JADX INFO: loaded from: classes.dex */
public final class pjg0 implements ISudCfg {

    /* JADX INFO: renamed from: a */
    public boolean f152692a = true;

    /* JADX INFO: renamed from: b */
    public boolean f152693b = false;

    /* JADX INFO: renamed from: c */
    public final HashMap f152694c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f152695d = new HashMap();

    @Override // tech.sud.gip.core.ISudCfg
    public final void addEmbeddedMGPkg(long j, String str) {
        this.f152694c.put(Long.valueOf(j), str);
        plg0 plg0Var = (plg0) wog0.f190041a.f185816a.get(Long.valueOf(j));
        if (plg0Var == null || plg0Var.f153031b) {
            return;
        }
        plg0Var.f153030a = true;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final Map getAdvancedConfigMap() {
        return this.f152695d;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final String getEmbeddedMGPkgPath(long j) {
        return (String) this.f152694c.get(Long.valueOf(j));
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final boolean getShowCustomLoading() {
        return this.f152693b;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final boolean getShowLoadingGameBg() {
        return this.f152692a;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final void removeEmbeddedMGPkg(long j) {
        this.f152694c.remove(Long.valueOf(j));
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final void setShowCustomLoading(boolean z) {
        this.f152693b = z;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final void setShowLoadingGameBg(boolean z) {
        this.f152692a = z;
    }
}
