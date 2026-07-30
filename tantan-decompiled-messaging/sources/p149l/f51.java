package p149l;

import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import org.joor.Reflect;

/* JADX INFO: loaded from: classes8.dex */
public class f51 {

    /* JADX INFO: renamed from: a */
    public static Class f94951a;

    /* JADX INFO: renamed from: b */
    public static x9j<Object, Object[], Reflect> f94952b;

    /* JADX INFO: renamed from: c */
    public static x9j<Object, Object[], Reflect> f94953c;

    static {
        try {
            ClassLoader classLoader = App.f15369e.getClassLoader();
            StringBuilder sb = new StringBuilder("android.o");
            Character ch = 's';
            sb.append(ch.toString());
            sb.append(".SystemProperties");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            f94951a = clsLoadClass;
            f94952b = Reflect.callRepeatably((Class) clsLoadClass, "native_get", "mine_type");
            f94953c = Reflect.callRepeatably(f94951a, "get", "mine_type");
        } catch (ClassNotFoundException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m119473a(String str) {
        x9j<Object, Object[], Reflect> x9jVar;
        Class cls = f94951a;
        if (cls == null || (x9jVar = f94952b) == null) {
            return null;
        }
        return vwb.m200309W((String) x9jVar.call(cls, new String[]{str}).get());
    }

    /* JADX INFO: renamed from: b */
    public static final String m119474b(String str) {
        x9j<Object, Object[], Reflect> x9jVar;
        Class cls = f94951a;
        if (cls == null || (x9jVar = f94953c) == null) {
            return null;
        }
        return vwb.m200309W((String) x9jVar.call(cls, new String[]{str}).get());
    }
}
