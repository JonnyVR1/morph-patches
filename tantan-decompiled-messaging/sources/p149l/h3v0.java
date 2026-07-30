package p149l;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;

/* JADX INFO: loaded from: classes6.dex */
public final class h3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f105766a;

    public h3v0(Context context) {
        this.f105766a = context;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m129178a(boolean z) {
        gkj gkjVarM126632a = new gkj.C17099a().m126633b("com.google.android.gms.ads").m126634c(z).m126632a();
        TopicsManagerFutures topicsManagerFuturesM3211a = TopicsManagerFutures.m3211a(this.f105766a);
        return topicsManagerFuturesM3211a != null ? topicsManagerFuturesM3211a.mo3212b(gkjVarM126632a) : jmw0.m142234g(new IllegalStateException());
    }
}
