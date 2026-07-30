package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class ofm {
    /* JADX INFO: renamed from: a */
    public static <T> T m167457a(String str, Class<T> cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
            }
            o6r0.m166283c("IdentityServiceManager getIdentityService: " + str + " is not a extend of " + cls.getSimpleName());
            return null;
        } catch (Exception unused) {
            o6r0.m166283c("IdentityServiceManager " + str + " is not loaded");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static dn2 m167458b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (dn2.class.isAssignableFrom(cls)) {
                return (dn2) cls.newInstance();
            }
            o6r0.m166283c("IdentityServiceManagergetRouter: " + str + " is not a impl of BaseIdentityRouter");
            return null;
        } catch (Exception unused) {
            o6r0.m166283c("IdentityServiceManager" + str + " is not loaded");
            return null;
        }
    }
}
