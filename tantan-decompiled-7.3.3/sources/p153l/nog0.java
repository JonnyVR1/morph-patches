package p153l;

import tech.sud.gip.core.ISudListenerReportStatsEvent;

/* JADX INFO: loaded from: classes.dex */
public final class nog0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f142980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f142981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f142982c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f142983d;

    public nog0(String str, boolean z, String str2, int i) {
        this.f142980a = str;
        this.f142981b = z;
        this.f142982c = str2;
        this.f142983d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        utg0.f180947b.m198645p(this.f142980a, this.f142981b);
        ISudListenerReportStatsEvent iSudListenerReportStatsEvent = fug0.f100912b;
        if (iSudListenerReportStatsEvent != null) {
            iSudListenerReportStatsEvent.onReportStatsEvent(this.f142982c, this.f142983d, this.f142980a);
        }
    }
}
