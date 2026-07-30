package p149l;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class g3e {

    /* JADX INFO: renamed from: a */
    public final zpd0 f100454a = new zpd0("disk_nearly_full_dialog_time", 0L);

    /* JADX INFO: renamed from: b */
    public final zpd0 f100455b = new zpd0("disk_Full_Disk_Toast_Time", 0L);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m124245a(Context context) {
        try {
            xh0.C21150a c21150a = new xh0.C21150a(context);
            c21150a.m208740s(App.f15369e.getString(R$string.f17515w)).m208731j(App.f15369e.getString(R$string.f17510v)).m208739r(App.f15369e.getString(R$string.f17505u));
            c21150a.m208722a().m208721g();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m124247c(Context context) {
        try {
            xh0.C21150a c21150a = new xh0.C21150a(context);
            c21150a.m208740s(App.f15369e.getString(R$string.f17500t)).m208731j(App.f15369e.getString(R$string.f17495s)).m208739r(App.f15369e.getString(R$string.f17490r)).m208728g(false).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.e3e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rx0.m181467d();
                }
            });
            c21150a.m208722a().m208721g();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m124249e() {
        return m124250f() < 200;
    }

    /* JADX INFO: renamed from: f */
    public static long m124250f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024;
    }

    /* JADX INFO: renamed from: g */
    public static long m124251g() {
        try {
            if (!PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE") || !Environment.getExternalStorageDirectory().canRead()) {
                return -1L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m124252h() {
        if (mqi0.m155943n() > this.f100455b.get().longValue()) {
            this.f100455b.put(Long.valueOf(mqi0.m155943n()));
            lsi0.m151591u(App.f15369e.getString(R$string.f17495s)).show();
        }
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.f3e
            @Override // java.lang.Runnable
            public final void run() {
                rx0.m181467d();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: i */
    public void m124253i(final Context context) {
        if (context == null) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.c3e
            @Override // java.lang.Runnable
            public final void run() {
                g3e.m124247c(context);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public void m124254j(final Context context) {
        if (context == null || mqi0.m155943n() <= this.f100454a.get().longValue()) {
            return;
        }
        this.f100454a.put(Long.valueOf(mqi0.m155943n()));
        e51.m114742G(new Runnable() { // from class: l.b3e
            @Override // java.lang.Runnable
            public final void run() {
                g3e.m124245a(context);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m124255k() {
        e51.m114742G(new Runnable() { // from class: l.d3e
            @Override // java.lang.Runnable
            public final void run() {
                this.f84208a.m124252h();
            }
        });
    }
}
