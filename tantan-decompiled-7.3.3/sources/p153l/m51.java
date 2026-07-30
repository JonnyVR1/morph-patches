package p153l;

import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import org.joor.Reflect;

/* JADX INFO: loaded from: classes8.dex */
public class m51 {

    /* JADX INFO: renamed from: a */
    public static Class f134850a;

    /* JADX INFO: renamed from: b */
    public static rcj<Object, Object[], Reflect> f134851b;

    /* JADX INFO: renamed from: c */
    public static rcj<Object, Object[], Reflect> f134852c;

    static {
        try {
            ClassLoader classLoader = App.f16088e.getClassLoader();
            StringBuilder sb = new StringBuilder("android.o");
            Character ch = 's';
            sb.append(ch.toString());
            sb.append(".SystemProperties");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            f134850a = clsLoadClass;
            f134851b = Reflect.callRepeatably((Class) clsLoadClass, "native_get", "mine_type");
            f134852c = Reflect.callRepeatably(f134850a, "get", "mine_type");
        } catch (ClassNotFoundException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m157083a(String str) {
        rcj<Object, Object[], Reflect> rcjVar;
        Class cls = f134850a;
        if (cls == null || (rcjVar = f134851b) == null) {
            return null;
        }
        return jyb.m147492W((String) rcjVar.call(cls, new String[]{str}).get());
    }

    /* JADX INFO: renamed from: b */
    public static final String m157084b(String str) {
        rcj<Object, Object[], Reflect> rcjVar;
        Class cls = f134850a;
        if (cls == null || (rcjVar = f134852c) == null) {
            return null;
        }
        return jyb.m147492W((String) rcjVar.call(cls, new String[]{str}).get());
    }
}
