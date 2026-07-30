package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2281u1;

/* JADX INFO: loaded from: classes6.dex */
public final class gfw0 {

    /* JADX INFO: renamed from: a */
    public boolean f103964a;

    /* JADX INFO: renamed from: a */
    public final void m130125a(Context context) {
        tgw0.m191133b(context, "Application Context cannot be null");
        if (this.f103964a) {
            return;
        }
        this.f103964a = true;
        egw0.m120810c().m120813d(context);
        sfw0.m185674i().m201191d(context);
        pgw0.m172283b(context);
        qgw0.m176524d(context);
        C2281u1.m13390a(context);
        xfw0.m210858b().m210860c(context);
        rfw0.m181309b().m181311d(context);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m130126b() {
        return this.f103964a;
    }
}
