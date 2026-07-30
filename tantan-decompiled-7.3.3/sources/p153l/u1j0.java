package p153l;

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
public class u1j0 {

    /* JADX INFO: renamed from: b */
    protected static Context f177006b;

    /* JADX INFO: renamed from: c */
    private static u1j0 f177007c;

    /* JADX INFO: renamed from: d */
    private static Handler f177008d = new HandlerC20447a(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    protected Toast f177009a = null;

    /* JADX INFO: renamed from: l.u1j0$a */
    public static class HandlerC20447a extends Handler {
        public HandlerC20447a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1365) {
                u1j0.m193973e((CharSequence) message.obj, message.arg1);
            } else if (i == 1366) {
                u1j0.m193974f((CharSequence) message.obj);
            } else if (i == 1367) {
                u1j0.m193975g((CharSequence) message.obj, message.arg1);
            }
        }
    }

    /* JADX INFO: renamed from: l.u1j0$b */
    public static class HandlerC20448b extends Handler {

        /* JADX INFO: renamed from: a */
        private Handler f177010a;

        public HandlerC20448b(Handler handler) {
            this.f177010a = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                this.f177010a.handleMessage(message);
            } catch (WindowManager.BadTokenException e) {
                MDLog.printErrStackTrace(u1j0.class.getSimpleName(), e);
            }
        }
    }

    public u1j0() {
        if (f177006b != null) {
            mo111991j();
        } else {
            azk0.m101074a("Showner not been activated. You must call 'doEnable(Context c)' method before");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m193972d(Context context) {
        f177006b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m193973e(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            if (f177007c == null) {
                f177007c = cqw.m111990r();
            }
            int iM193980h = f177007c.m193980h();
            f177007c.mo111992q(charSequence, false, i);
            f177007c.m193981k(iM193980h);
        } catch (Throwable th) {
            MDLog.printErrStackTrace("Toaster", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m193974f(CharSequence charSequence) {
        if (f177007c == null) {
            f177007c = cqw.m111990r();
        }
        f177007c.m193982o(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m193975g(CharSequence charSequence, int i) {
        if (f177007c == null) {
            f177007c = cqw.m111990r();
        }
        int iM193980h = f177007c.m193980h();
        f177007c.mo111992q(charSequence, false, i);
        f177007c.m193981k(iM193980h);
    }

    /* JADX INFO: renamed from: i */
    public static void m193976i(Toast toast) {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new HandlerC20448b((Handler) declaredField2.get(obj)));
        } catch (IllegalAccessException e) {
            MDLog.printErrStackTrace(u1j0.class.getSimpleName(), e);
        } catch (NoSuchFieldException e2) {
            MDLog.printErrStackTrace(u1j0.class.getSimpleName(), e2);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(u1j0.class.getSimpleName(), th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m193977l(CharSequence charSequence) {
        m193978m(charSequence, 0);
    }

    /* JADX INFO: renamed from: m */
    public static void m193978m(CharSequence charSequence, int i) {
        if (kv0.m151651e()) {
            if (kv0.m151652f()) {
                m193973e(charSequence, i);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1365;
            messageObtain.obj = charSequence;
            messageObtain.arg1 = i;
            f177008d.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m193979n(CharSequence charSequence) {
        if (kv0.m151651e()) {
            if (kv0.m151652f()) {
                m193974f(charSequence);
                return;
            }
            Message message = new Message();
            message.what = 1366;
            message.obj = charSequence;
            f177008d.sendMessage(message);
        }
    }

    /* JADX INFO: renamed from: h */
    public int m193980h() {
        return this.f177009a.getDuration();
    }

    /* JADX INFO: renamed from: j */
    public void mo111991j() {
        Toast toastMakeText = Toast.makeText(f177006b, "", 0);
        this.f177009a = toastMakeText;
        if (Build.VERSION.SDK_INT == 25) {
            m193976i(toastMakeText);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m193981k(int i) {
        this.f177009a.setDuration(i);
    }

    /* JADX INFO: renamed from: o */
    public void m193982o(CharSequence charSequence) {
        m193983p(charSequence, false);
    }

    /* JADX INFO: renamed from: p */
    public void m193983p(CharSequence charSequence, boolean z) {
        mo111992q(charSequence, false, 0);
    }

    /* JADX INFO: renamed from: q */
    public void mo111992q(CharSequence charSequence, boolean z, int i) {
        if (z) {
            try {
                mo111991j();
            } catch (Throwable unused) {
                return;
            }
        }
        this.f177009a.setText(charSequence);
        this.f177009a.setDuration(i);
        this.f177009a.show();
    }
}
