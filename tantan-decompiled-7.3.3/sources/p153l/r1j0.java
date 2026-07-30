package p153l;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import org.joor.Reflect;

/* JADX INFO: loaded from: classes11.dex */
public class r1j0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC19737c f160833a;

    /* JADX INFO: renamed from: b */
    public static Field f160834b;

    /* JADX INFO: renamed from: c */
    public static Field f160835c;

    /* JADX INFO: renamed from: l.r1j0$b */
    public static class C19736b implements InterfaceC19737c {
        public C19736b() {
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: a */
        public void mo30647a(int i) {
            mo30648b(k26.m147943a().getText(i).toString());
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: b */
        public void mo30648b(String str) {
            r1j0.m179422i(str);
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: c */
        public void mo30649c(String str) {
            mo30648b(str);
        }

        @Override // p153l.r1j0.InterfaceC19737c
        /* JADX INFO: renamed from: d */
        public void mo30650d(int i) {
            mo30647a(i);
        }
    }

    /* JADX INFO: renamed from: l.r1j0$c */
    public interface InterfaceC19737c {
        /* JADX INFO: renamed from: a */
        void mo30647a(int i);

        /* JADX INFO: renamed from: b */
        void mo30648b(String str);

        /* JADX INFO: renamed from: c */
        void mo30649c(String str);

        /* JADX INFO: renamed from: d */
        void mo30650d(int i);
    }

    /* JADX INFO: renamed from: l.r1j0$d */
    public static class HandlerC19738d extends Handler {

        /* JADX INFO: renamed from: a */
        public final Handler f160836a;

        public HandlerC19738d(Handler handler) {
            this.f160836a = handler;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                this.f160836a.dispatchMessage(message);
            } catch (Exception unused) {
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f160836a.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m179414a(int i) {
        m179417d().mo30650d(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m179415b(String str) {
        m179417d().mo30649c(str);
    }

    /* JADX INFO: renamed from: c */
    public static Toast m179416c() {
        Toast toast = new Toast(k26.m147943a());
        if (Build.VERSION.SDK_INT < 26) {
            m179418e(toast);
        }
        return toast;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC19737c m179417d() {
        if (f160833a == null) {
            f160833a = new C19736b();
        }
        return f160833a;
    }

    /* JADX INFO: renamed from: e */
    public static void m179418e(Toast toast) {
        try {
            if (f160834b == null) {
                f160834b = Reflect.m222383on("android.widget.Toast").field0("mTN");
            }
            if (f160835c == null) {
                Field declaredField = f160834b.getType().getDeclaredField("mHandler");
                f160835c = declaredField;
                declaredField.setAccessible(true);
            }
            Field field = f160834b;
            if (field != null && f160835c != null) {
                Object obj = field.get(toast);
                f160835c.set(obj, new HandlerC19738d((Handler) f160835c.get(obj)));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m179419f(int i) {
        m179417d().mo30647a(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m179420g(String str) {
        m179417d().mo30648b(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m179421h(InterfaceC19737c interfaceC19737c) {
        f160833a = interfaceC19737c;
    }

    /* JADX INFO: renamed from: i */
    public static void m179422i(String str) {
        Toast toastMakeText = Toast.makeText(k26.m147943a(), str, 0);
        if (Build.VERSION.SDK_INT < 26) {
            m179418e(toastMakeText);
        }
        toastMakeText.show();
    }
}
