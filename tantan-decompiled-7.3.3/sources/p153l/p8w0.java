package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class p8w0 {

    /* JADX INFO: renamed from: d */
    @GuardedBy("LiteSdkInfoRetriever.class")
    public static p8w0 f151065d;

    /* JADX INFO: renamed from: a */
    public final Context f151066a;

    /* JADX INFO: renamed from: b */
    public final wkt0 f151067b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f151068c = new AtomicReference();

    @VisibleForTesting
    public p8w0(Context context, wkt0 wkt0Var) {
        this.f151066a = context;
        this.f151067b = wkt0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static wkt0 m171280a(Context context) {
        try {
            return mjt0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            dct0.m115296e("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static p8w0 m171281d(Context context) {
        synchronized (p8w0.class) {
            try {
                p8w0 p8w0Var = f151065d;
                if (p8w0Var != null) {
                    return p8w0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) jjs0.f121238b.m149974e()).longValue();
                wkt0 wkt0VarM171280a = null;
                if (jLongValue > 0 && jLongValue <= 240304702) {
                    wkt0VarM171280a = m171280a(applicationContext);
                }
                p8w0 p8w0Var2 = new p8w0(applicationContext, wkt0VarM171280a);
                f151065d = p8w0Var2;
                return p8w0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final uws0 m171282b() {
        return (uws0) this.f151068c.get();
    }

    /* JADX INFO: renamed from: c */
    public final zzcei m171283c(int i, boolean z, int i2) {
        zzen zzenVarM171286g;
        bxy0.m106934r();
        boolean zM12365d = C2098b.m12365d(this.f151066a);
        zzcei zzceiVar = new zzcei(240304000, i2, true, zM12365d);
        return (((Boolean) jjs0.f121239c.m149974e()).booleanValue() && (zzenVarM171286g = m171286g()) != null) ? new zzcei(240304000, zzenVarM171286g.zza(), true, zM12365d) : zzceiVar;
    }

    /* JADX INFO: renamed from: e */
    public final String m171284e() {
        zzen zzenVarM171286g = m171286g();
        if (zzenVarM171286g != null) {
            return zzenVarM171286g.zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m171285f(uws0 uws0Var) {
        uws0 adapterCreator;
        if (!((Boolean) jjs0.f121237a.m149974e()).booleanValue()) {
            o8w0.m166634a(this.f151068c, null, uws0Var);
            return;
        }
        wkt0 wkt0Var = this.f151067b;
        if (wkt0Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = wkt0Var.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.f151068c;
        if (adapterCreator != null) {
            uws0Var = adapterCreator;
        }
        o8w0.m166634a(atomicReference, null, uws0Var);
    }

    /* JADX INFO: renamed from: g */
    public final zzen m171286g() {
        wkt0 wkt0Var = this.f151067b;
        if (wkt0Var != null) {
            try {
                return wkt0Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }
}
