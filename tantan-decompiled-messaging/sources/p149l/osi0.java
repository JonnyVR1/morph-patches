package p149l;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import org.joor.Reflect;

/* JADX INFO: loaded from: classes13.dex */
public class osi0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC19015c f145397a;

    /* JADX INFO: renamed from: b */
    public static Field f145398b;

    /* JADX INFO: renamed from: c */
    public static Field f145399c;

    /* JADX INFO: renamed from: l.osi0$b */
    public static class C19014b implements InterfaceC19015c {
        public C19014b() {
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: a */
        public void mo29649a(int i) {
            mo29650b(f16.m119092a().getText(i).toString());
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: b */
        public void mo29650b(String str) {
            osi0.m165785i(str);
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: c */
        public void mo29651c(String str) {
            mo29650b(str);
        }

        @Override // p149l.osi0.InterfaceC19015c
        /* JADX INFO: renamed from: d */
        public void mo29652d(int i) {
            mo29649a(i);
        }
    }

    /* JADX INFO: renamed from: l.osi0$c */
    public interface InterfaceC19015c {
        /* JADX INFO: renamed from: a */
        void mo29649a(int i);

        /* JADX INFO: renamed from: b */
        void mo29650b(String str);

        /* JADX INFO: renamed from: c */
        void mo29651c(String str);

        /* JADX INFO: renamed from: d */
        void mo29652d(int i);
    }

    /* JADX INFO: renamed from: l.osi0$d */
    public static class HandlerC19016d extends Handler {

        /* JADX INFO: renamed from: a */
        public final Handler f145400a;

        public HandlerC19016d(Handler handler) {
            this.f145400a = handler;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                this.f145400a.dispatchMessage(message);
            } catch (Exception unused) {
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f145400a.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m165777a(int i) {
        m165780d().mo29652d(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m165778b(String str) {
        m165780d().mo29651c(str);
    }

    /* JADX INFO: renamed from: c */
    public static Toast m165779c() {
        Toast toast = new Toast(f16.m119092a());
        if (Build.VERSION.SDK_INT < 26) {
            m165781e(toast);
        }
        return toast;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC19015c m165780d() {
        if (f145397a == null) {
            f145397a = new C19014b();
        }
        return f145397a;
    }

    /* JADX INFO: renamed from: e */
    public static void m165781e(Toast toast) {
        try {
            if (f145398b == null) {
                f145398b = Reflect.m221137on("android.widget.Toast").field0("mTN");
            }
            if (f145399c == null) {
                Field declaredField = f145398b.getType().getDeclaredField("mHandler");
                f145399c = declaredField;
                declaredField.setAccessible(true);
            }
            Field field = f145398b;
            if (field != null && f145399c != null) {
                Object obj = field.get(toast);
                f145399c.set(obj, new HandlerC19016d((Handler) f145399c.get(obj)));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m165782f(int i) {
        m165780d().mo29649a(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m165783g(String str) {
        m165780d().mo29650b(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m165784h(InterfaceC19015c interfaceC19015c) {
        f145397a = interfaceC19015c;
    }

    /* JADX INFO: renamed from: i */
    public static void m165785i(String str) {
        Toast toastMakeText = Toast.makeText(f16.m119092a(), str, 0);
        if (Build.VERSION.SDK_INT < 26) {
            m165781e(toastMakeText);
        }
        toastMakeText.show();
    }
}
