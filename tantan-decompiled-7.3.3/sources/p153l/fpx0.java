package p153l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class fpx0 extends ipx0 {

    /* JADX INFO: renamed from: a */
    public final Logger f100229a;

    public fpx0(String str) {
        this.f100229a = Logger.getLogger(str);
    }

    @Override // p153l.ipx0
    /* JADX INFO: renamed from: a */
    public final void mo117432a(String str) {
        this.f100229a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
