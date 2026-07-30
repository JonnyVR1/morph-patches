package p149l;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public class ivk {

    /* JADX INFO: renamed from: a */
    private final Context f115173a;

    /* JADX INFO: renamed from: b */
    private final ContentObserver f115174b = new C17627a(null);

    /* JADX INFO: renamed from: c */
    private Vibrator f115175c;

    /* JADX INFO: renamed from: d */
    private boolean f115176d;

    /* JADX INFO: renamed from: e */
    private long f115177e;

    /* JADX INFO: renamed from: l.ivk$a */
    public class C17627a extends ContentObserver {
        public C17627a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            ivk ivkVar = ivk.this;
            ivkVar.f115176d = ivk.m138625d(ivkVar.f115173a);
        }
    }

    public ivk(Context context) {
        this.f115173a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static boolean m138625d(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
    }

    /* JADX INFO: renamed from: e */
    private boolean m138626e(Context context) {
        return context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: f */
    public void m138627f() {
        if (m138626e(this.f115173a)) {
            this.f115175c = (Vibrator) this.f115173a.getSystemService("vibrator");
        }
        this.f115176d = m138625d(this.f115173a);
        this.f115173a.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, this.f115174b);
    }

    /* JADX INFO: renamed from: g */
    public void m138628g() {
        this.f115175c = null;
        this.f115173a.getContentResolver().unregisterContentObserver(this.f115174b);
    }

    /* JADX INFO: renamed from: h */
    public void m138629h() {
        if (this.f115175c == null || !this.f115176d) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f115177e >= 125) {
            this.f115175c.vibrate(50L);
            this.f115177e = jUptimeMillis;
        }
    }
}
