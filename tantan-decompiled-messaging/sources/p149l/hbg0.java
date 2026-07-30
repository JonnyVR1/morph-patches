package p149l;

import java.util.HashMap;
import java.util.Map;
import tech.sud.gip.core.ISudCfg;

/* JADX INFO: loaded from: classes.dex */
public final class hbg0 implements ISudCfg {

    /* JADX INFO: renamed from: a */
    public boolean f106930a = true;

    /* JADX INFO: renamed from: b */
    public boolean f106931b = false;

    /* JADX INFO: renamed from: c */
    public final HashMap f106932c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f106933d = new HashMap();

    @Override // tech.sud.gip.core.ISudCfg
    public final void addEmbeddedMGPkg(long j, String str) {
        this.f106932c.put(Long.valueOf(j), str);
        hdg0 hdg0Var = (hdg0) ogg0.f143859a.f139627a.get(Long.valueOf(j));
        if (hdg0Var == null || hdg0Var.f107245b) {
            return;
        }
        hdg0Var.f107244a = true;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final Map getAdvancedConfigMap() {
        return this.f106933d;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final String getEmbeddedMGPkgPath(long j) {
        return (String) this.f106932c.get(Long.valueOf(j));
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final boolean getShowCustomLoading() {
        return this.f106931b;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final boolean getShowLoadingGameBg() {
        return this.f106930a;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final void removeEmbeddedMGPkg(long j) {
        this.f106932c.remove(Long.valueOf(j));
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final void setShowCustomLoading(boolean z) {
        this.f106931b = z;
    }

    @Override // tech.sud.gip.core.ISudCfg
    public final void setShowLoadingGameBg(boolean z) {
        this.f106930a = z;
    }
}
