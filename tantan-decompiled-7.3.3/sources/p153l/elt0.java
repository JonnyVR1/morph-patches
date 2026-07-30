package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class elt0 {

    /* JADX INFO: renamed from: a */
    public zzcei f94582a;

    /* JADX INFO: renamed from: b */
    public Context f94583b;

    /* JADX INFO: renamed from: c */
    public WeakReference f94584c;

    /* JADX INFO: renamed from: c */
    public final elt0 m121292c(Context context) {
        this.f94584c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f94583b = context;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final elt0 m121293d(zzcei zzceiVar) {
        this.f94582a = zzceiVar;
        return this;
    }
}
