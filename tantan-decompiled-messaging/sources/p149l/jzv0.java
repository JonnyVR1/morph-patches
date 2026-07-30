package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class jzv0 {

    /* JADX INFO: renamed from: d */
    @GuardedBy("LiteSdkInfoRetriever.class")
    public static jzv0 f120422d;

    /* JADX INFO: renamed from: a */
    public final Context f120423a;

    /* JADX INFO: renamed from: b */
    public final qbt0 f120424b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f120425c = new AtomicReference();

    @VisibleForTesting
    public jzv0(Context context, qbt0 qbt0Var) {
        this.f120423a = context;
        this.f120424b = qbt0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static qbt0 m143952a(Context context) {
        try {
            return gat0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            x2t0.m206867e("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static jzv0 m143953d(Context context) {
        synchronized (jzv0.class) {
            try {
                jzv0 jzv0Var = f120422d;
                if (jzv0Var != null) {
                    return jzv0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) das0.f85262b.m115379e()).longValue();
                qbt0 qbt0VarM143952a = null;
                if (jLongValue > 0 && jLongValue <= 240304702) {
                    qbt0VarM143952a = m143952a(applicationContext);
                }
                jzv0 jzv0Var2 = new jzv0(applicationContext, qbt0VarM143952a);
                f120422d = jzv0Var2;
                return jzv0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ons0 m143954b() {
        return (ons0) this.f120425c.get();
    }

    /* JADX INFO: renamed from: c */
    public final zzcei m143955c(int i, boolean z, int i2) {
        zzen zzenVarM143958g;
        vny0.m199080r();
        boolean zM12311d = C2075b.m12311d(this.f120423a);
        zzcei zzceiVar = new zzcei(240304000, i2, true, zM12311d);
        return (((Boolean) das0.f85263c.m115379e()).booleanValue() && (zzenVarM143958g = m143958g()) != null) ? new zzcei(240304000, zzenVarM143958g.zza(), true, zM12311d) : zzceiVar;
    }

    /* JADX INFO: renamed from: e */
    public final String m143956e() {
        zzen zzenVarM143958g = m143958g();
        if (zzenVarM143958g != null) {
            return zzenVarM143958g.zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m143957f(ons0 ons0Var) {
        ons0 adapterCreator;
        if (!((Boolean) das0.f85261a.m115379e()).booleanValue()) {
            izv0.m139075a(this.f120425c, null, ons0Var);
            return;
        }
        qbt0 qbt0Var = this.f120424b;
        if (qbt0Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = qbt0Var.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.f120425c;
        if (adapterCreator != null) {
            ons0Var = adapterCreator;
        }
        izv0.m139075a(atomicReference, null, ons0Var);
    }

    /* JADX INFO: renamed from: g */
    public final zzen m143958g() {
        qbt0 qbt0Var = this.f120424b;
        if (qbt0Var != null) {
            try {
                return qbt0Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }
}
