package p149l;

import tech.sud.gip.core.ISudListenerReportStatsEvent;

/* JADX INFO: loaded from: classes.dex */
public final class fgg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f97366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f97367b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f97368c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f97369d;

    public fgg0(String str, boolean z, String str2, int i) {
        this.f97366a = str;
        this.f97367b = z;
        this.f97368c = str2;
        this.f97369d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mlg0.f134427b.m155912p(this.f97366a, this.f97367b);
        ISudListenerReportStatsEvent iSudListenerReportStatsEvent = xlg0.f193418b;
        if (iSudListenerReportStatsEvent != null) {
            iSudListenerReportStatsEvent.onReportStatsEvent(this.f97368c, this.f97369d, this.f97366a);
        }
    }
}
