package p153l;

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
public abstract class z4s0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static final tbt0 f202975a;

    static {
        tbt0 k9t0Var = null;
        try {
            Object objNewInstance = s3s0.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                k9t0Var = iInterfaceQueryLocalInterface instanceof tbt0 ? (tbt0) iInterfaceQueryLocalInterface : new k9t0(iBinder);
            } else {
                dct0.m115298g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            dct0.m115298g("Failed to instantiate ClientApi class.");
        }
        f202975a = k9t0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract Object mo96776a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo96777b(tbt0 tbt0Var) throws RemoteException;

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Object mo96778c() throws RemoteException;

    /* JADX INFO: renamed from: d */
    public final Object m218609d(Context context, boolean z) {
        boolean z2;
        Object objM218610e;
        if (!z) {
            k6s0.m148569b();
            if (!obt0.m167044u(context, 12451000)) {
                dct0.m115293b("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.m12528a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m12529c(context, ModuleDescriptor.MODULE_ID));
        sgs0.m185829a(context);
        if (((Boolean) tis0.f174504a.m149974e()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) tis0.f174505b.m149974e()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            objM218610e = m218610e();
            if (objM218610e == null && !z2) {
                objM218610e = m218611f();
            }
        } else {
            Object objM218611f = m218611f();
            if (objM218611f == null) {
                if (k6s0.m148572e().nextInt(((Long) qjs0.f158040a.m149974e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    k6s0.m148569b().m167061p(context, k6s0.m148570c().zza, "gmob-apps", bundle, true);
                }
            }
            objM218610e = objM218611f == null ? m218610e() : objM218611f;
        }
        return objM218610e == null ? mo96776a() : objM218610e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m218610e() {
        tbt0 tbt0Var = f202975a;
        if (tbt0Var == null) {
            dct0.m115298g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo96777b(tbt0Var);
        } catch (RemoteException e) {
            dct0.m115299h("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m218611f() {
        try {
            return mo96778c();
        } catch (RemoteException e) {
            dct0.m115299h("Cannot invoke remote loader.", e);
            return null;
        }
    }
}
