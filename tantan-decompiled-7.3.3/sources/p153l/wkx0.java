package p153l;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class wkx0 implements wjx0 {

    /* JADX INFO: renamed from: c */
    @GuardedBy("GservicesLoader.class")
    public static wkx0 f189606c;

    /* JADX INFO: renamed from: a */
    public final Context f189607a;

    /* JADX INFO: renamed from: b */
    public final ContentObserver f189608b;

    public wkx0(Context context) {
        this.f189607a = context;
        vmx0 vmx0Var = new vmx0(this, null);
        this.f189608b = vmx0Var;
        context.getContentResolver().registerContentObserver(azw0.f74194a, true, vmx0Var);
    }

    /* JADX INFO: renamed from: a */
    public static wkx0 m206876a(Context context) {
        wkx0 wkx0Var;
        synchronized (wkx0.class) {
            try {
                if (f189606c == null) {
                    f189606c = sr60.m187592b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new wkx0(context) : new wkx0();
                }
                wkx0Var = f189606c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wkx0Var;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m206877b() {
        Context context;
        try {
            wkx0 wkx0Var = f189606c;
            if (wkx0Var != null && (context = wkx0Var.f189607a) != null && wkx0Var.f189608b != null) {
                context.getContentResolver().unregisterContentObserver(f189606c.f189608b);
            }
            f189606c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String m206878c(String str) {
        return b0x0.m101377a(this.f189607a.getContentResolver(), str, null);
    }

    @Override // p153l.wjx0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.f189607a;
        if (context != null && !uax0.m195204b(context)) {
            try {
                return (String) xix0.m211178a(new ylx0() { // from class: l.qnx0
                    @Override // p153l.ylx0
                    public final Object zza() {
                        return this.f158669a.m206878c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    public wkx0() {
        this.f189607a = null;
        this.f189608b = null;
    }
}
