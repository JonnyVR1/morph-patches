package p007l;

import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import l.vwb;
import l.x9j;
import org.joor.Reflect;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class f51 {

    /* JADX INFO: renamed from: a */
    public static Class f2665a;

    /* JADX INFO: renamed from: b */
    public static x9j<Object, Object[], Reflect> f2666b;

    /* JADX INFO: renamed from: c */
    public static x9j<Object, Object[], Reflect> f2667c;

    static {
        try {
            ClassLoader classLoader = App.f1068e.getClassLoader();
            StringBuilder sb = new StringBuilder("android.o");
            Character ch = 's';
            sb.append(ch.toString());
            sb.append(".SystemProperties");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            f2665a = clsLoadClass;
            f2666b = Reflect.callRepeatably(clsLoadClass, "native_get", new Object[]{"mine_type"});
            f2667c = Reflect.callRepeatably(f2665a, "get", new Object[]{"mine_type"});
        } catch (ClassNotFoundException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m9080a(String str) {
        x9j<Object, Object[], Reflect> x9jVar;
        Class cls = f2665a;
        if (cls == null || (x9jVar = f2666b) == null) {
            return null;
        }
        return vwb.W((String) ((Reflect) x9jVar.call(cls, new String[]{str})).get());
    }

    /* JADX INFO: renamed from: b */
    public static final String m9081b(String str) {
        x9j<Object, Object[], Reflect> x9jVar;
        Class cls = f2665a;
        if (cls == null || (x9jVar = f2667c) == null) {
            return null;
        }
        return vwb.W((String) ((Reflect) x9jVar.call(cls, new String[]{str})).get());
    }
}
