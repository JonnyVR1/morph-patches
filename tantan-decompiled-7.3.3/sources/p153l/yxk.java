package p153l;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public class yxk {

    /* JADX INFO: renamed from: a */
    private final Context f201981a;

    /* JADX INFO: renamed from: b */
    private final ContentObserver f201982b = new C21706a(null);

    /* JADX INFO: renamed from: c */
    private Vibrator f201983c;

    /* JADX INFO: renamed from: d */
    private boolean f201984d;

    /* JADX INFO: renamed from: e */
    private long f201985e;

    /* JADX INFO: renamed from: l.yxk$a */
    public class C21706a extends ContentObserver {
        public C21706a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            yxk yxkVar = yxk.this;
            yxkVar.f201984d = yxk.m217724d(yxkVar.f201981a);
        }
    }

    public yxk(Context context) {
        this.f201981a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static boolean m217724d(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
    }

    /* JADX INFO: renamed from: e */
    private boolean m217725e(Context context) {
        return context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: f */
    public void m217726f() {
        if (m217725e(this.f201981a)) {
            this.f201983c = (Vibrator) this.f201981a.getSystemService("vibrator");
        }
        this.f201984d = m217724d(this.f201981a);
        this.f201981a.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, this.f201982b);
    }

    /* JADX INFO: renamed from: g */
    public void m217727g() {
        this.f201983c = null;
        this.f201981a.getContentResolver().unregisterContentObserver(this.f201982b);
    }

    /* JADX INFO: renamed from: h */
    public void m217728h() {
        if (this.f201983c == null || !this.f201984d) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f201985e >= 125) {
            this.f201983c.vibrate(50L);
            this.f201985e = jUptimeMillis;
        }
    }
}
