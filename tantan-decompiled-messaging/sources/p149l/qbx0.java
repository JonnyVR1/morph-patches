package p149l;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class qbx0 implements qax0 {

    /* JADX INFO: renamed from: c */
    @GuardedBy("GservicesLoader.class")
    public static qbx0 f153713c;

    /* JADX INFO: renamed from: a */
    public final Context f153714a;

    /* JADX INFO: renamed from: b */
    public final ContentObserver f153715b;

    public qbx0(Context context) {
        this.f153714a = context;
        pdx0 pdx0Var = new pdx0(this, null);
        this.f153715b = pdx0Var;
        context.getContentResolver().registerContentObserver(upw0.f177680a, true, pdx0Var);
    }

    /* JADX INFO: renamed from: a */
    public static qbx0 m173854a(Context context) {
        qbx0 qbx0Var;
        synchronized (qbx0.class) {
            try {
                if (f153713c == null) {
                    f153713c = nj60.m159646b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new qbx0(context) : new qbx0();
                }
                qbx0Var = f153713c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qbx0Var;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m173855b() {
        Context context;
        try {
            qbx0 qbx0Var = f153713c;
            if (qbx0Var != null && (context = qbx0Var.f153714a) != null && qbx0Var.f153715b != null) {
                context.getContentResolver().unregisterContentObserver(f153713c.f153715b);
            }
            f153713c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String m173856c(String str) {
        return vqw0.m199605a(this.f153714a.getContentResolver(), str, null);
    }

    @Override // p149l.qax0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.f153714a;
        if (context != null && !o1x0.m162271b(context)) {
            try {
                return (String) r9x0.m178465a(new scx0() { // from class: l.kex0
                    @Override // p149l.scx0
                    public final Object zza() {
                        return this.f122876a.m173856c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    public qbx0() {
        this.f153714a = null;
        this.f153715b = null;
    }
}
