package p149l;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.Toast;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.log.Log4Android;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class qsi0 {

    /* JADX INFO: renamed from: b */
    protected static Context f156231b;

    /* JADX INFO: renamed from: c */
    private static qsi0 f156232c;

    /* JADX INFO: renamed from: d */
    private static Handler f156233d = new HandlerC19568a(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    protected Toast f156234a = null;

    /* JADX INFO: renamed from: l.qsi0$a */
    public static class HandlerC19568a extends Handler {
        public HandlerC19568a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1365) {
                qsi0.m176290d((CharSequence) message.obj, message.arg1);
            } else if (i == 1366) {
                qsi0.m176291e((CharSequence) message.obj);
            } else if (i == 1367) {
                qsi0.m176292f((CharSequence) message.obj, message.arg1);
            }
        }
    }

    /* JADX INFO: renamed from: l.qsi0$b */
    public static class HandlerC19569b extends Handler {

        /* JADX INFO: renamed from: a */
        private Handler f156235a;

        public HandlerC19569b(Handler handler) {
            this.f156235a = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                this.f156235a.handleMessage(message);
            } catch (WindowManager.BadTokenException e) {
                MDLog.printErrStackTrace(qsi0.class.getSimpleName(), e);
            }
        }
    }

    public qsi0() {
        if (f156231b != null) {
            mo122383i();
        } else {
            upk0.m194883a("Showner not been activated. You must call 'doEnable(Context c)' method before");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m176290d(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            if (f156232c == null) {
                f156232c = fnw.m122382p();
            }
            int iM176296g = f156232c.m176296g();
            f156232c.mo122384o(charSequence, false, i);
            f156232c.m176297j(iM176296g);
        } catch (Throwable th) {
            Log4Android.m18417f().m18422e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m176291e(CharSequence charSequence) {
        if (f156232c == null) {
            f156232c = fnw.m122382p();
        }
        f156232c.m176298m(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m176292f(CharSequence charSequence, int i) {
        if (f156232c == null) {
            f156232c = fnw.m122382p();
        }
        int iM176296g = f156232c.m176296g();
        f156232c.mo122384o(charSequence, false, i);
        f156232c.m176297j(iM176296g);
    }

    /* JADX INFO: renamed from: h */
    public static void m176293h(Toast toast) {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new HandlerC19569b((Handler) declaredField2.get(obj)));
        } catch (IllegalAccessException e) {
            MDLog.printErrStackTrace(qsi0.class.getSimpleName(), e);
        } catch (NoSuchFieldException e2) {
            MDLog.printErrStackTrace(qsi0.class.getSimpleName(), e2);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(qsi0.class.getSimpleName(), th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m176294k(CharSequence charSequence) {
        m176295l(charSequence, 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m176295l(CharSequence charSequence, int i) {
        if (ev0.m118237e()) {
            if (ev0.m118238f()) {
                m176290d(charSequence, i);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1365;
            messageObtain.obj = charSequence;
            messageObtain.arg1 = i;
            f156233d.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: g */
    public int m176296g() {
        return this.f156234a.getDuration();
    }

    /* JADX INFO: renamed from: i */
    public void mo122383i() {
        Toast toastMakeText = Toast.makeText(f156231b, "", 0);
        this.f156234a = toastMakeText;
        if (Build.VERSION.SDK_INT == 25) {
            m176293h(toastMakeText);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m176297j(int i) {
        this.f156234a.setDuration(i);
    }

    /* JADX INFO: renamed from: m */
    public void m176298m(CharSequence charSequence) {
        m176299n(charSequence, false);
    }

    /* JADX INFO: renamed from: n */
    public void m176299n(CharSequence charSequence, boolean z) {
        mo122384o(charSequence, false, 0);
    }

    /* JADX INFO: renamed from: o */
    public void mo122384o(CharSequence charSequence, boolean z, int i) {
        if (z) {
            try {
                mo122383i();
            } catch (Throwable unused) {
                return;
            }
        }
        this.f156234a.setText(charSequence);
        this.f156234a.setDuration(i);
        this.f156234a.show();
    }
}
