package p009l;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import l.e51;
import l.lsi0;
import l.rx0;
import l.xh0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g3e {

    /* JADX INFO: renamed from: a */
    public final zpd0 f13298a = new zpd0("disk_nearly_full_dialog_time", 0L);

    /* JADX INFO: renamed from: b */
    public final zpd0 f13299b = new zpd0("disk_Full_Disk_Toast_Time", 0L);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14777a(Context context) {
        try {
            xh0.a aVar = new xh0.a(context);
            aVar.s(App.e.getString(R.string.w)).j(App.e.getString(R.string.v)).r(App.e.getString(R.string.u));
            aVar.a().g();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14779c(Context context) {
        try {
            xh0.a aVar = new xh0.a(context);
            aVar.s(App.e.getString(R.string.t)).j(App.e.getString(R.string.s)).r(App.e.getString(R.string.r)).g(false).h(false).o(new View.OnClickListener() { // from class: l.e3e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rx0.d();
                }
            });
            aVar.a().g();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14781e() {
        return m14782f() < 200;
    }

    /* JADX INFO: renamed from: f */
    public static long m14782f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024;
    }

    /* JADX INFO: renamed from: g */
    public static long m14783g() {
        try {
            if (!PermissionHelper.m10210b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE") || !Environment.getExternalStorageDirectory().canRead()) {
                return -1L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024;
        } catch (Exception e) {
            CrashHelper.c(e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m14784h() {
        if (mqi0.m18549n() > ((Long) this.f13299b.get()).longValue()) {
            this.f13299b.put(Long.valueOf(mqi0.m18549n()));
            lsi0.u(App.e.getString(R.string.s)).show();
        }
        e51.H(App.e, new Runnable() { // from class: l.f3e
            @Override // java.lang.Runnable
            public final void run() {
                rx0.d();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: i */
    public void m14785i(final Context context) {
        if (context == null) {
            return;
        }
        e51.G(new Runnable() { // from class: l.c3e
            @Override // java.lang.Runnable
            public final void run() {
                g3e.m14779c(context);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public void m14786j(final Context context) {
        if (context == null || mqi0.m18549n() <= ((Long) this.f13298a.get()).longValue()) {
            return;
        }
        this.f13298a.put(Long.valueOf(mqi0.m18549n()));
        e51.G(new Runnable() { // from class: l.b3e
            @Override // java.lang.Runnable
            public final void run() {
                g3e.m14777a(context);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m14787k() {
        e51.G(new Runnable() { // from class: l.d3e
            @Override // java.lang.Runnable
            public final void run() {
                this.f11628a.m14784h();
            }
        });
    }
}
