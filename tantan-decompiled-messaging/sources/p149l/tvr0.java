package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tvr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static final n2t0 f172333a;

    static {
        n2t0 e0t0Var = null;
        try {
            Object objNewInstance = mur0.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                e0t0Var = iInterfaceQueryLocalInterface instanceof n2t0 ? (n2t0) iInterfaceQueryLocalInterface : new e0t0(iBinder);
            } else {
                x2t0.m206869g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            x2t0.m206869g("Failed to instantiate ClientApi class.");
        }
        f172333a = e0t0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract Object mo96268a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo96269b(n2t0 n2t0Var) throws RemoteException;

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Object mo96270c() throws RemoteException;

    /* JADX INFO: renamed from: d */
    public final Object m190780d(Context context, boolean z) {
        boolean z2;
        Object objM190781e;
        if (!z) {
            exr0.m118703b();
            if (!i2t0.m134091u(context, 12451000)) {
                x2t0.m206864b("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.m12474a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m12475c(context, ModuleDescriptor.MODULE_ID));
        m7s0.m153417a(context);
        if (((Boolean) n9s0.f137830a.m115379e()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) n9s0.f137831b.m115379e()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            objM190781e = m190781e();
            if (objM190781e == null && !z2) {
                objM190781e = m190782f();
            }
        } else {
            Object objM190782f = m190782f();
            if (objM190782f == null) {
                if (exr0.m118706e().nextInt(((Long) kas0.f122145a.m115379e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    exr0.m118703b().m134108p(context, exr0.m118704c().zza, "gmob-apps", bundle, true);
                }
            }
            objM190781e = objM190782f == null ? m190781e() : objM190782f;
        }
        return objM190781e == null ? mo96268a() : objM190781e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m190781e() {
        n2t0 n2t0Var = f172333a;
        if (n2t0Var == null) {
            x2t0.m206869g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo96269b(n2t0Var);
        } catch (RemoteException e) {
            x2t0.m206870h("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m190782f() {
        try {
            return mo96270c();
        } catch (RemoteException e) {
            x2t0.m206870h("Cannot invoke remote loader.", e);
            return null;
        }
    }
}
