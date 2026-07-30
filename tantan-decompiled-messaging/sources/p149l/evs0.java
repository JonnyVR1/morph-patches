package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes6.dex */
public class evs0 {

    /* JADX INFO: renamed from: a */
    public static final String f93378a = "evs0";

    /* JADX INFO: renamed from: b */
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static Context f93379b;

    /* JADX INFO: renamed from: c */
    public static nsu0 f93380c;

    /* JADX INFO: renamed from: a */
    public static <T> T m118316a(Class<?> cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m118317b(ClassLoader classLoader, String str) {
        try {
            return (T) m118316a(((ClassLoader) Preconditions.checkNotNull(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String strValueOf = String.valueOf(str);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Unable to find dynamic class ".concat(strValueOf) : new String("Unable to find dynamic class "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static nsu0 m118318c(Context context) throws GooglePlayServicesNotAvailableException {
        nsu0 zov0Var;
        Preconditions.checkNotNull(context);
        nsu0 nsu0Var = f93380c;
        if (nsu0Var != null) {
            return nsu0Var;
        }
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (iIsGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        IBinder iBinder = (IBinder) m118317b(m118319d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
        if (iBinder == null) {
            zov0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            zov0Var = iInterfaceQueryLocalInterface instanceof nsu0 ? (nsu0) iInterfaceQueryLocalInterface : new zov0(iBinder);
        }
        f93380c = zov0Var;
        try {
            zov0Var.mo160797d8(s050.m181848Y2(m118319d(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return f93380c;
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Context m118319d(Context context) {
        Context context2 = f93379b;
        if (context2 != null) {
            return context2;
        }
        Context contextM118320e = m118320e(context);
        f93379b = contextM118320e;
        return contextM118320e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Context m118320e(Context context) {
        try {
            return DynamiteModule.m12476e(context, DynamiteModule.f9803b, "com.google.android.gms.maps_dynamite").m12484b();
        } catch (Exception e) {
            Log.e(f93378a, "Failed to load maps module, use legacy", e);
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }
}
