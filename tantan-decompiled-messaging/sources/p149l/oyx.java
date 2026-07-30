package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class oyx {
    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m166732f(Video video) {
        File file = new File(qib0.m174833t0(), System.currentTimeMillis() + ".jpg");
        file.getParentFile().mkdirs();
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: g */
    public static void m166733g(Act act, Runnable runnable, boolean z, boolean z2) {
        PermissionHelper.C13128a c13128aM79903u = PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(z).m79903u(z2);
        Objects.requireNonNull(runnable);
        c13128aM79903u.m79897o(new lyx(runnable)).m79891i(act);
    }

    /* JADX INFO: renamed from: h */
    public static void m166734h(Act act, Runnable runnable) {
        PermissionHelper.C13128a c13128aM79903u = PermissionHelper.m79882c().m79899q(zqx.m219898k() ? vwb.m200324f0("android.permission.CAMERA") : vwb.m200324f0("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE")).m79905w(false).m79903u(false);
        Objects.requireNonNull(runnable);
        c13128aM79903u.m79897o(new lyx(runnable)).m79891i(act);
    }

    /* JADX INFO: renamed from: i */
    public static void m166735i(final Act act, final boolean z) {
        m166733g(act, new Runnable() { // from class: l.jyx
            @Override // java.lang.Runnable
            public final void run() {
                act.mediaCapture(z);
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m166736j(final Act act, final boolean z, final boolean z2) {
        m166733g(act, new Runnable() { // from class: l.iyx
            @Override // java.lang.Runnable
            public final void run() {
                act.mediaCapture(z, z2);
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: k */
    public static void m166737k(final Act act, boolean z, boolean z2) {
        m166733g(act, new Runnable() { // from class: l.nyx
            @Override // java.lang.Runnable
            public final void run() {
                act.recordVideo();
            }
        }, z, z2);
    }

    /* JADX INFO: renamed from: l */
    public static void m166738l(final Act act) {
        m166733g(act, new Runnable() { // from class: l.kyx
            @Override // java.lang.Runnable
            public final void run() {
                act.takePicture();
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: m */
    public static void m166739m(final Act act, boolean z, boolean z2) {
        m166733g(act, new Runnable() { // from class: l.myx
            @Override // java.lang.Runnable
            public final void run() {
                act.takePicture();
            }
        }, z, z2);
    }
}
