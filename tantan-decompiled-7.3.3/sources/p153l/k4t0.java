package p153l;

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
public class k4t0 {

    /* JADX INFO: renamed from: a */
    public static final String f123924a = "k4t0";

    /* JADX INFO: renamed from: b */
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static Context f123925b;

    /* JADX INFO: renamed from: c */
    public static t1v0 f123926c;

    /* JADX INFO: renamed from: a */
    public static <T> T m148294a(Class<?> cls) {
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
    public static <T> T m148295b(ClassLoader classLoader, String str) {
        try {
            return (T) m148294a(((ClassLoader) Preconditions.checkNotNull(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String strValueOf = String.valueOf(str);
            throw new IllegalStateException(strValueOf.length() != 0 ? "Unable to find dynamic class ".concat(strValueOf) : new String("Unable to find dynamic class "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static t1v0 m148296c(Context context) throws GooglePlayServicesNotAvailableException {
        t1v0 fyv0Var;
        Preconditions.checkNotNull(context);
        t1v0 t1v0Var = f123926c;
        if (t1v0Var != null) {
            return t1v0Var;
        }
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (iIsGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        IBinder iBinder = (IBinder) m148295b(m148297d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
        if (iBinder == null) {
            fyv0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            fyv0Var = iInterfaceQueryLocalInterface instanceof t1v0 ? (t1v0) iInterfaceQueryLocalInterface : new fyv0(iBinder);
        }
        f123926c = fyv0Var;
        try {
            fyv0Var.mo128138d8(h950.m134038Y2(m148297d(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return f123926c;
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Context m148297d(Context context) {
        Context context2 = f123925b;
        if (context2 != null) {
            return context2;
        }
        Context contextM148298e = m148298e(context);
        f123925b = contextM148298e;
        return contextM148298e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Context m148298e(Context context) {
        try {
            return DynamiteModule.m12530e(context, DynamiteModule.f9840b, "com.google.android.gms.maps_dynamite").m12538b();
        } catch (Exception e) {
            Log.e(f123924a, "Failed to load maps module, use legacy", e);
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }
}
