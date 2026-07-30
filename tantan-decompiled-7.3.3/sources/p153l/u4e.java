package p153l;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public class u4e {

    /* JADX INFO: renamed from: a */
    public final byd0 f177458a = new byd0("disk_nearly_full_dialog_time", 0L);

    /* JADX INFO: renamed from: b */
    public final byd0 f177459b = new byd0("disk_Full_Disk_Toast_Time", 0L);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m194476a(Context context) {
        try {
            th0.C20312a c20312a = new th0.C20312a(context);
            c20312a.m191160s(App.f16088e.getString(R$string.f18234w)).m191151j(App.f16088e.getString(R$string.f18229v)).m191159r(App.f16088e.getString(R$string.f18224u));
            c20312a.m191142a().m191141g();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m194478c(Context context) {
        try {
            th0.C20312a c20312a = new th0.C20312a(context);
            c20312a.m191160s(App.f16088e.getString(R$string.f18219t)).m191151j(App.f16088e.getString(R$string.f18214s)).m191159r(App.f16088e.getString(R$string.f18209r)).m191148g(false).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.s4e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yx0.m217669d();
                }
            });
            c20312a.m191142a().m191141g();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m194480e() {
        return m194481f() < 200;
    }

    /* JADX INFO: renamed from: f */
    public static long m194481f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024;
    }

    /* JADX INFO: renamed from: g */
    public static long m194482g() {
        try {
            if (!PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE") || !Environment.getExternalStorageDirectory().canRead()) {
                return -1L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return ((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024) / 1024;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m194483h() {
        if (pzi0.m174453n() > this.f177459b.get().longValue()) {
            this.f177459b.put(Long.valueOf(pzi0.m174453n()));
            o1j0.m165647u(App.f16088e.getString(R$string.f18214s)).show();
        }
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.t4e
            @Override // java.lang.Runnable
            public final void run() {
                yx0.m217669d();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: i */
    public void m194484i(final Context context) {
        if (context == null) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.q4e
            @Override // java.lang.Runnable
            public final void run() {
                u4e.m194478c(context);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public void m194485j(final Context context) {
        if (context == null || pzi0.m174453n() <= this.f177458a.get().longValue()) {
            return;
        }
        this.f177458a.put(Long.valueOf(pzi0.m174453n()));
        l51.m152887G(new Runnable() { // from class: l.p4e
            @Override // java.lang.Runnable
            public final void run() {
                u4e.m194476a(context);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m194486k() {
        l51.m152887G(new Runnable() { // from class: l.r4e
            @Override // java.lang.Runnable
            public final void run() {
                this.f161192a.m194483h();
            }
        });
    }
}
