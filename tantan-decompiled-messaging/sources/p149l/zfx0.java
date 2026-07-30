package p149l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class zfx0 extends cgx0 {

    /* JADX INFO: renamed from: a */
    public final Logger f202995a;

    public zfx0(String str) {
        this.f202995a = Logger.getLogger(str);
    }

    @Override // p149l.cgx0
    /* JADX INFO: renamed from: a */
    public final void mo106845a(String str) {
        this.f202995a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
