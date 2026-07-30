package p153l;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class t1j0 {

    /* JADX INFO: renamed from: b */
    protected static Context f171675b;

    /* JADX INFO: renamed from: c */
    private static t1j0 f171676c;

    /* JADX INFO: renamed from: d */
    private static Handler f171677d = new HandlerC20212a(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    protected Toast f171678a = null;

    /* JADX INFO: renamed from: l.t1j0$a */
    public class HandlerC20212a extends Handler {
        public HandlerC20212a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1365) {
                t1j0.m188912e((CharSequence) message.obj, message.arg1);
            } else if (i == 1366) {
                t1j0.m188913f((CharSequence) message.obj);
            } else if (i == 1367) {
                t1j0.m188914g((CharSequence) message.obj, message.arg1);
            }
        }
    }

    /* JADX INFO: renamed from: l.t1j0$b */
    public static class HandlerC20213b extends Handler {

        /* JADX INFO: renamed from: a */
        private Handler f171679a;

        public HandlerC20213b(Handler handler) {
            this.f171679a = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                this.f171679a.handleMessage(message);
            } catch (WindowManager.BadTokenException e) {
                Log.e(t1j0.class.getSimpleName(), "handleMessage: ", e);
            }
        }
    }

    public t1j0() {
        if (f171675b != null) {
            mo117574j();
        } else {
            azk0.m101074a("Showner not been activated. You must call 'doEnable(Context c)' method before");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m188911d(Context context) {
        f171675b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m188912e(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            if (f171676c == null) {
                f171676c = dqw.m117573t();
            }
            int iM188921h = f171676c.m188921h();
            f171676c.mo117575s(charSequence, false, i);
            f171676c.m188922k(iM188921h);
        } catch (Throwable th) {
            Log.e(t1j0.class.getSimpleName(), "doShow: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m188913f(CharSequence charSequence) {
        if (f171676c == null) {
            f171676c = dqw.m117573t();
        }
        f171676c.m188923q(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m188914g(CharSequence charSequence, int i) {
        if (f171676c == null) {
            f171676c = dqw.m117573t();
        }
        int iM188921h = f171676c.m188921h();
        f171676c.mo117575s(charSequence, false, i);
        f171676c.m188922k(iM188921h);
    }

    /* JADX INFO: renamed from: i */
    public static void m188915i(Toast toast) {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new HandlerC20213b((Handler) declaredField2.get(obj)));
        } catch (IllegalAccessException e) {
            Log.e(t1j0.class.getSimpleName(), "hookToast: ", e);
        } catch (NoSuchFieldException e2) {
            Log.e(t1j0.class.getSimpleName(), "hookToast: ", e2);
        } catch (Throwable th) {
            Log.e(t1j0.class.getSimpleName(), "hookToast: ", th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m188916l(int i) {
        m188917m(f171675b.getString(i));
    }

    /* JADX INFO: renamed from: m */
    public static void m188917m(CharSequence charSequence) {
        m188918n(charSequence, 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m188918n(CharSequence charSequence, int i) {
        if (lv0.m155976f()) {
            if (lv0.m155977g()) {
                m188912e(charSequence, i);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1365;
            messageObtain.obj = charSequence;
            messageObtain.arg1 = i;
            f171677d.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m188919o(int i) {
        m188920p(f171675b.getString(i));
    }

    /* JADX INFO: renamed from: p */
    public static void m188920p(CharSequence charSequence) {
        if (lv0.m155976f()) {
            if (lv0.m155977g()) {
                m188913f(charSequence);
                return;
            }
            Message message = new Message();
            message.what = 1366;
            message.obj = charSequence;
            f171677d.sendMessage(message);
        }
    }

    /* JADX INFO: renamed from: h */
    public int m188921h() {
        return this.f171678a.getDuration();
    }

    /* JADX INFO: renamed from: j */
    public void mo117574j() {
        Toast toastMakeText = Toast.makeText(f171675b, "", 0);
        this.f171678a = toastMakeText;
        if (Build.VERSION.SDK_INT == 25) {
            m188915i(toastMakeText);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m188922k(int i) {
        this.f171678a.setDuration(i);
    }

    /* JADX INFO: renamed from: q */
    public void m188923q(CharSequence charSequence) {
        m188924r(charSequence, false);
    }

    /* JADX INFO: renamed from: r */
    public void m188924r(CharSequence charSequence, boolean z) {
        mo117575s(charSequence, false, 0);
    }

    /* JADX INFO: renamed from: s */
    public void mo117575s(CharSequence charSequence, boolean z, int i) {
        if (z) {
            try {
                mo117574j();
            } catch (Throwable unused) {
                return;
            }
        }
        this.f171678a.setText(charSequence);
        this.f171678a.setDuration(i);
        this.f171678a.show();
    }
}
