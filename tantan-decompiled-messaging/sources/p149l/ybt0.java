package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ybt0 {

    /* JADX INFO: renamed from: a */
    public zzcei f197363a;

    /* JADX INFO: renamed from: b */
    public Context f197364b;

    /* JADX INFO: renamed from: c */
    public WeakReference f197365c;

    /* JADX INFO: renamed from: c */
    public final ybt0 m213976c(Context context) {
        this.f197365c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f197364b = context;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ybt0 m213977d(zzcei zzceiVar) {
        this.f197363a = zzceiVar;
        return this;
    }
}
