package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class xrw {

    /* JADX INFO: renamed from: a */
    private final Context f194184a;

    public xrw(Context context) {
        this.f194184a = context;
    }

    /* JADX INFO: renamed from: b */
    private static l1k m210726b(String str) {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                m210727c(cls, e);
                objNewInstance = null;
            } catch (InstantiationException e2) {
                m210727c(cls, e2);
                objNewInstance = null;
            } catch (NoSuchMethodException e3) {
                m210727c(cls, e3);
                objNewInstance = null;
            } catch (InvocationTargetException e4) {
                m210727c(cls, e4);
                objNewInstance = null;
            }
            if (objNewInstance instanceof l1k) {
                return (l1k) objNewInstance;
            }
            ibe.m135253a("Expected instanceof GlideModule, but found: ", objNewInstance);
            return null;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m210727c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* JADX INFO: renamed from: a */
    public List<l1k> m210728a() {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f194184a.getPackageManager().getApplicationInfo(this.f194184a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                Objects.toString(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m210726b(str));
                    Log.isLoggable("ManifestParser", 3);
                }
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            pkq0.m170054a("Unable to find metadata to parse GlideModules", e);
            return null;
        }
    }
}
