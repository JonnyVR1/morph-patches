package p153l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ogt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f147305a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f147306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f147307c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f147308d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ugt0 f147309e;

    public ogt0(ugt0 ugt0Var, String str, String str2, int i, int i2, boolean z) {
        this.f147305a = str;
        this.f147306b = str2;
        this.f147307c = i;
        this.f147308d = i2;
        this.f147309e = ugt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f147305a);
        map.put("cachedSrc", this.f147306b);
        map.put("bytesLoaded", Integer.toString(this.f147307c));
        map.put("totalBytes", Integer.toString(this.f147308d));
        map.put("cacheReady", "0");
        ugt0.m195941f(this.f147309e, "onPrecacheEvent", map);
    }
}
