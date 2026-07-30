package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2258u1;

/* JADX INFO: loaded from: classes6.dex */
public final class a6w0 {

    /* JADX INFO: renamed from: a */
    public boolean f67809a;

    /* JADX INFO: renamed from: a */
    public final void m95164a(Context context) {
        n7w0.m158171b(context, "Application Context cannot be null");
        if (this.f67809a) {
            return;
        }
        this.f67809a = true;
        y6w0.m213252c().m213254d(context);
        m6w0.m153308i().m167694d(context);
        j7w0.m140121b(context);
        k7w0.m144707d(context);
        C2258u1.m13336a(context);
        r6w0.m178099b().m178101c(context);
        l6w0.m148782b().m148785d(context);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95165b() {
        return this.f67809a;
    }
}
