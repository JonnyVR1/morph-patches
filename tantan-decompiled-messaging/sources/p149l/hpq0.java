package p149l;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mmkv.MMKV;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.service.C14837ah;

/* JADX INFO: loaded from: classes2.dex */
public class hpq0 {

    /* JADX INFO: renamed from: b */
    private static volatile hpq0 f108958b;

    /* JADX INFO: renamed from: a */
    private Context f108959a;

    /* JADX INFO: renamed from: l.hpq0$a */
    public class RunnableC17369a implements Runnable {
        public RunnableC17369a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hpq0.this.m132383g();
        }
    }

    private hpq0(Context context) {
        this.f108959a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m132378a(int i) {
        return Math.max(60, i);
    }

    /* JADX INFO: renamed from: b */
    public static hpq0 m132379b(Context context) {
        if (f108958b == null) {
            synchronized (hpq0.class) {
                try {
                    if (f108958b == null) {
                        f108958b = new hpq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f108958b;
    }

    /* JADX INFO: renamed from: d */
    private void m132380d(C14837ah c14837ah, njq0 njq0Var, boolean z) {
        if (c14837ah.m86489a(EnumC14745gk.UploadSwitch.m85646a(), true)) {
            xpq0 xpq0Var = new xpq0(this.f108959a);
            if (z) {
                njq0Var.m159777k(xpq0Var, m132378a(c14837ah.m86481a(EnumC14745gk.UploadFrequency.m85646a(), MMKV.ExpireInDay)));
            } else {
                njq0Var.m159776j(xpq0Var);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m132382f() {
        try {
            Context context = this.f108959a;
            (context instanceof Application ? (Application) context : (Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new bpq0(this.f108959a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m132383g() {
        njq0 njq0VarM159772f = njq0.m159772f(this.f108959a);
        C14837ah c14837ahM86477a = C14837ah.m86477a(this.f108959a);
        SharedPreferences sharedPreferences = this.f108959a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", jCurrentTimeMillis);
        if (j == jCurrentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", jCurrentTimeMillis).commit();
        }
        if (Math.abs(jCurrentTimeMillis - j) < 172800000) {
            return;
        }
        m132380d(c14837ahM86477a, njq0VarM159772f, false);
        if (c14837ahM86477a.m86489a(EnumC14745gk.StorageCollectionSwitch.m85646a(), true)) {
            int iM132378a = m132378a(c14837ahM86477a.m86481a(EnumC14745gk.StorageCollectionFrequency.m85646a(), MMKV.ExpireInDay));
            njq0VarM159772f.m159778l(new wpq0(this.f108959a, iM132378a), iM132378a, 0);
        }
        fvq0.m123356j(this.f108959a);
        if (c14837ahM86477a.m86489a(EnumC14745gk.ActivityTSSwitch.m85646a(), false)) {
            m132382f();
        }
        m132380d(c14837ahM86477a, njq0VarM159772f, true);
    }

    /* JADX INFO: renamed from: c */
    public void m132384c() {
        njq0.m159772f(this.f108959a).m159773g(new RunnableC17369a());
    }
}
