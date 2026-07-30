package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class ycm {
    /* JADX INFO: renamed from: a */
    public static <T> T m214160a(String str, Class<T> cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
            }
            ixq0.m138886c("IdentityServiceManager getIdentityService: " + str + " is not a extend of " + cls.getSimpleName());
            return null;
        } catch (Exception unused) {
            ixq0.m138886c("IdentityServiceManager " + str + " is not loaded");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static wm2 m214161b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (wm2.class.isAssignableFrom(cls)) {
                return (wm2) cls.newInstance();
            }
            ixq0.m138886c("IdentityServiceManagergetRouter: " + str + " is not a impl of BaseIdentityRouter");
            return null;
        } catch (Exception unused) {
            ixq0.m138886c("IdentityServiceManager" + str + " is not loaded");
            return null;
        }
    }
}
