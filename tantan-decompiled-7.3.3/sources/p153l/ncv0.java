package p153l;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;

/* JADX INFO: loaded from: classes6.dex */
public final class ncv0 {

    /* JADX INFO: renamed from: a */
    public final Context f141405a;

    public ncv0(Context context) {
        this.f141405a = context;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m162604a(boolean z) {
        wmj wmjVarM207112a = new wmj.C21141a().m207113b("com.google.android.gms.ads").m207114c(z).m207112a();
        TopicsManagerFutures topicsManagerFuturesM3212a = TopicsManagerFutures.m3212a(this.f141405a);
        return topicsManagerFuturesM3212a != null ? topicsManagerFuturesM3212a.mo3213b(wmjVarM207112a) : pvw0.m173980g(new IllegalStateException());
    }
}
