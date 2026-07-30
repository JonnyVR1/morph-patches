package p153l;

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
public final class wuw {

    /* JADX INFO: renamed from: a */
    private final Context f190891a;

    public wuw(Context context) {
        this.f190891a = context;
    }

    /* JADX INFO: renamed from: b */
    private static b4k m207978b(String str) {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                m207979c(cls, e);
                objNewInstance = null;
            } catch (InstantiationException e2) {
                m207979c(cls, e2);
                objNewInstance = null;
            } catch (NoSuchMethodException e3) {
                m207979c(cls, e3);
                objNewInstance = null;
            } catch (InvocationTargetException e4) {
                m207979c(cls, e4);
                objNewInstance = null;
            }
            if (objNewInstance instanceof b4k) {
                return (b4k) objNewInstance;
            }
            mce.m157919a("Expected instanceof GlideModule, but found: ", objNewInstance);
            return null;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m207979c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* JADX INFO: renamed from: a */
    public List<b4k> m207980a() {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f190891a.getPackageManager().getApplicationInfo(this.f190891a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                Objects.toString(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(m207978b(str));
                    Log.isLoggable("ManifestParser", 3);
                }
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            vtq0.m202761a("Unable to find metadata to parse GlideModules", e);
            return null;
        }
    }
}
