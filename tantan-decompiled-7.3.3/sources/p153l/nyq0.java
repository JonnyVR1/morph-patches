package p153l;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mmkv.MMKV;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.service.C14985ah;

/* JADX INFO: loaded from: classes2.dex */
public class nyq0 {

    /* JADX INFO: renamed from: b */
    private static volatile nyq0 f144349b;

    /* JADX INFO: renamed from: a */
    private Context f144350a;

    /* JADX INFO: renamed from: l.nyq0$a */
    public class RunnableC18995a implements Runnable {
        public RunnableC18995a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nyq0.this.m165353g();
        }
    }

    private nyq0(Context context) {
        this.f144350a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m165348a(int i) {
        return Math.max(60, i);
    }

    /* JADX INFO: renamed from: b */
    public static nyq0 m165349b(Context context) {
        if (f144349b == null) {
            synchronized (nyq0.class) {
                try {
                    if (f144349b == null) {
                        f144349b = new nyq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f144349b;
    }

    /* JADX INFO: renamed from: d */
    private void m165350d(C14985ah c14985ah, tsq0 tsq0Var, boolean z) {
        if (c14985ah.m87660a(EnumC14893gk.UploadSwitch.m86817a(), true)) {
            dzq0 dzq0Var = new dzq0(this.f144350a);
            if (z) {
                tsq0Var.m192632k(dzq0Var, m165348a(c14985ah.m87652a(EnumC14893gk.UploadFrequency.m86817a(), MMKV.ExpireInDay)));
            } else {
                tsq0Var.m192631j(dzq0Var);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m165352f() {
        try {
            Context context = this.f144350a;
            (context instanceof Application ? (Application) context : (Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new hyq0(this.f144350a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m165353g() {
        tsq0 tsq0VarM192627f = tsq0.m192627f(this.f144350a);
        C14985ah c14985ahM87648a = C14985ah.m87648a(this.f144350a);
        SharedPreferences sharedPreferences = this.f144350a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", jCurrentTimeMillis);
        if (j == jCurrentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", jCurrentTimeMillis).commit();
        }
        if (Math.abs(jCurrentTimeMillis - j) < 172800000) {
            return;
        }
        m165350d(c14985ahM87648a, tsq0VarM192627f, false);
        if (c14985ahM87648a.m87660a(EnumC14893gk.StorageCollectionSwitch.m86817a(), true)) {
            int iM165348a = m165348a(c14985ahM87648a.m87652a(EnumC14893gk.StorageCollectionFrequency.m86817a(), MMKV.ExpireInDay));
            tsq0VarM192627f.m192633l(new czq0(this.f144350a, iM165348a), iM165348a, 0);
        }
        l4r0.m152825j(this.f144350a);
        if (c14985ahM87648a.m87660a(EnumC14893gk.ActivityTSSwitch.m86817a(), false)) {
            m165352f();
        }
        m165350d(c14985ahM87648a, tsq0VarM192627f, true);
    }

    /* JADX INFO: renamed from: c */
    public void m165354c() {
        tsq0.m192627f(this.f144350a).m192628g(new RunnableC18995a());
    }
}
