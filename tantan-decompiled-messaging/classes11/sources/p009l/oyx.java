package p009l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Video;
import java.io.File;
import java.util.Objects;
import l.qib0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oyx {
    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m20066f(Video video) {
        File file = new File(qib0.t0(), System.currentTimeMillis() + ".jpg");
        file.getParentFile().mkdirs();
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: g */
    public static void m20067g(Act act, Runnable runnable, boolean z, boolean z2) {
        PermissionHelper.C0530a c0530aM10232u = PermissionHelper.m10211c().m10229r("android.permission.CAMERA").m10234w(z).m10232u(z2);
        Objects.requireNonNull(runnable);
        c0530aM10232u.m10226o(new lyx(runnable)).m10220i(act);
    }

    /* JADX INFO: renamed from: h */
    public static void m20068h(Act act, Runnable runnable) {
        PermissionHelper.C0530a c0530aM10232u = PermissionHelper.m10211c().m10228q(zqx.m25938k() ? vwb.f0(new String[]{"android.permission.CAMERA"}) : vwb.f0(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"})).m10234w(false).m10232u(false);
        Objects.requireNonNull(runnable);
        c0530aM10232u.m10226o(new lyx(runnable)).m10220i(act);
    }

    /* JADX INFO: renamed from: i */
    public static void m20069i(final Act act, final boolean z) {
        m20067g(act, new Runnable() { // from class: l.jyx
            @Override // java.lang.Runnable
            public final void run() {
                act.mediaCapture(z);
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m20070j(final Act act, final boolean z, final boolean z2) {
        m20067g(act, new Runnable() { // from class: l.iyx
            @Override // java.lang.Runnable
            public final void run() {
                act.mediaCapture(z, z2);
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: k */
    public static void m20071k(final Act act, boolean z, boolean z2) {
        m20067g(act, new Runnable() { // from class: l.nyx
            @Override // java.lang.Runnable
            public final void run() {
                act.recordVideo();
            }
        }, z, z2);
    }

    /* JADX INFO: renamed from: l */
    public static void m20072l(final Act act) {
        m20067g(act, new Runnable() { // from class: l.kyx
            @Override // java.lang.Runnable
            public final void run() {
                act.takePicture();
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: m */
    public static void m20073m(final Act act, boolean z, boolean z2) {
        m20067g(act, new Runnable() { // from class: l.myx
            @Override // java.lang.Runnable
            public final void run() {
                act.takePicture();
            }
        }, z, z2);
    }
}
