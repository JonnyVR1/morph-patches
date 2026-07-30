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
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class rsi0 {

    /* JADX INFO: renamed from: b */
    protected static Context f160866b;

    /* JADX INFO: renamed from: c */
    private static rsi0 f160867c;

    /* JADX INFO: renamed from: d */
    private static Handler f160868d = new HandlerC19774a(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    protected Toast f160869a = null;

    /* JADX INFO: renamed from: l.rsi0$a */
    public static class HandlerC19774a extends Handler {
        public HandlerC19774a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1365) {
                rsi0.m180674e((CharSequence) message.obj, message.arg1);
            } else if (i == 1366) {
                rsi0.m180675f((CharSequence) message.obj);
            } else if (i == 1367) {
                rsi0.m180676g((CharSequence) message.obj, message.arg1);
            }
        }
    }

    /* JADX INFO: renamed from: l.rsi0$b */
    public static class HandlerC19775b extends Handler {

        /* JADX INFO: renamed from: a */
        private Handler f160870a;

        public HandlerC19775b(Handler handler) {
            this.f160870a = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                this.f160870a.handleMessage(message);
            } catch (WindowManager.BadTokenException e) {
                MDLog.printErrStackTrace(rsi0.class.getSimpleName(), e);
            }
        }
    }

    public rsi0() {
        if (f160866b != null) {
            mo117295j();
        } else {
            upk0.m194883a("Showner not been activated. You must call 'doEnable(Context c)' method before");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m180673d(Context context) {
        f160866b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m180674e(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            if (f160867c == null) {
                f160867c = enw.m117294r();
            }
            int iM180681h = f160867c.m180681h();
            f160867c.mo117296q(charSequence, false, i);
            f160867c.m180682k(iM180681h);
        } catch (Throwable th) {
            MDLog.printErrStackTrace("Toaster", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m180675f(CharSequence charSequence) {
        if (f160867c == null) {
            f160867c = enw.m117294r();
        }
        f160867c.m180683o(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m180676g(CharSequence charSequence, int i) {
        if (f160867c == null) {
            f160867c = enw.m117294r();
        }
        int iM180681h = f160867c.m180681h();
        f160867c.mo117296q(charSequence, false, i);
        f160867c.m180682k(iM180681h);
    }

    /* JADX INFO: renamed from: i */
    public static void m180677i(Toast toast) {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new HandlerC19775b((Handler) declaredField2.get(obj)));
        } catch (IllegalAccessException e) {
            MDLog.printErrStackTrace(rsi0.class.getSimpleName(), e);
        } catch (NoSuchFieldException e2) {
            MDLog.printErrStackTrace(rsi0.class.getSimpleName(), e2);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(rsi0.class.getSimpleName(), th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m180678l(CharSequence charSequence) {
        m180679m(charSequence, 0);
    }

    /* JADX INFO: renamed from: m */
    public static void m180679m(CharSequence charSequence, int i) {
        if (dv0.m113761e()) {
            if (dv0.m113762f()) {
                m180674e(charSequence, i);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1365;
            messageObtain.obj = charSequence;
            messageObtain.arg1 = i;
            f160868d.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m180680n(CharSequence charSequence) {
        if (dv0.m113761e()) {
            if (dv0.m113762f()) {
                m180675f(charSequence);
                return;
            }
            Message message = new Message();
            message.what = 1366;
            message.obj = charSequence;
            f160868d.sendMessage(message);
        }
    }

    /* JADX INFO: renamed from: h */
    public int m180681h() {
        return this.f160869a.getDuration();
    }

    /* JADX INFO: renamed from: j */
    public void mo117295j() {
        Toast toastMakeText = Toast.makeText(f160866b, "", 0);
        this.f160869a = toastMakeText;
        if (Build.VERSION.SDK_INT == 25) {
            m180677i(toastMakeText);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m180682k(int i) {
        this.f160869a.setDuration(i);
    }

    /* JADX INFO: renamed from: o */
    public void m180683o(CharSequence charSequence) {
        m180684p(charSequence, false);
    }

    /* JADX INFO: renamed from: p */
    public void m180684p(CharSequence charSequence, boolean z) {
        mo117296q(charSequence, false, 0);
    }

    /* JADX INFO: renamed from: q */
    public void mo117296q(CharSequence charSequence, boolean z, int i) {
        if (z) {
            try {
                mo117295j();
            } catch (Throwable unused) {
                return;
            }
        }
        this.f160869a.setText(charSequence);
        this.f160869a.setDuration(i);
        this.f160869a.show();
    }
}
