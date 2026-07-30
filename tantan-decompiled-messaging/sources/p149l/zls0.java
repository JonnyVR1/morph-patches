package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class zls0 {

    /* JADX INFO: renamed from: a */
    public final Object f203655a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f203656b = new Object();

    /* JADX INFO: renamed from: c */
    public ims0 f203657c;

    /* JADX INFO: renamed from: d */
    public ims0 f203658d;

    /* JADX INFO: renamed from: c */
    public static final Context m219290c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX INFO: renamed from: a */
    public final ims0 m219291a(Context context, zzcei zzceiVar, @Nullable b5w0 b5w0Var) {
        ims0 ims0Var;
        synchronized (this.f203655a) {
            try {
                if (this.f203657c == null) {
                    this.f203657c = new ims0(m219290c(context), zzceiVar, (String) d1s0.m109677c().m144697a(m7s0.f132156a), b5w0Var);
                }
                ims0Var = this.f203657c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ims0Var;
    }

    /* JADX INFO: renamed from: b */
    public final ims0 m219292b(Context context, zzcei zzceiVar, b5w0 b5w0Var) {
        ims0 ims0Var;
        synchronized (this.f203656b) {
            try {
                if (this.f203658d == null) {
                    this.f203658d = new ims0(m219290c(context), zzceiVar, (String) las0.f127240b.m115379e(), b5w0Var);
                }
                ims0Var = this.f203658d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ims0Var;
    }
}
