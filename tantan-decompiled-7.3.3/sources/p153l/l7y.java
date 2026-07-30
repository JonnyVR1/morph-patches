package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class l7y {
    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m153154f(Video video) {
        File file = new File(uqb0.m197287t0(), System.currentTimeMillis() + ".jpg");
        file.getParentFile().mkdirs();
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: g */
    public static void m153155g(Act act, Runnable runnable, boolean z, boolean z2) {
        PermissionHelper.C13291a c13291aM81086u = PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(z).m81086u(z2);
        Objects.requireNonNull(runnable);
        c13291aM81086u.m81080o(new i7y(runnable)).m81074i(act);
    }

    /* JADX INFO: renamed from: h */
    public static void m153156h(Act act, Runnable runnable) {
        PermissionHelper.C13291a c13291aM81086u = PermissionHelper.m81065c().m81082q(wzx.m208784k() ? jyb.m147507f0("android.permission.CAMERA") : jyb.m147507f0("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE")).m81088w(false).m81086u(false);
        Objects.requireNonNull(runnable);
        c13291aM81086u.m81080o(new i7y(runnable)).m81074i(act);
    }

    /* JADX INFO: renamed from: i */
    public static void m153157i(final Act act, final boolean z) {
        m153155g(act, new Runnable() { // from class: l.g7y
            @Override // java.lang.Runnable
            public final void run() {
                act.mediaCapture(z);
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m153158j(final Act act, final boolean z, final boolean z2) {
        m153155g(act, new Runnable() { // from class: l.f7y
            @Override // java.lang.Runnable
            public final void run() {
                act.mediaCapture(z, z2);
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: k */
    public static void m153159k(final Act act, boolean z, boolean z2) {
        m153155g(act, new Runnable() { // from class: l.k7y
            @Override // java.lang.Runnable
            public final void run() {
                act.recordVideo();
            }
        }, z, z2);
    }

    /* JADX INFO: renamed from: l */
    public static void m153160l(final Act act) {
        m153155g(act, new Runnable() { // from class: l.h7y
            @Override // java.lang.Runnable
            public final void run() {
                act.takePicture();
            }
        }, false, false);
    }

    /* JADX INFO: renamed from: m */
    public static void m153161m(final Act act, boolean z, boolean z2) {
        m153155g(act, new Runnable() { // from class: l.j7y
            @Override // java.lang.Runnable
            public final void run() {
                act.takePicture();
            }
        }, z, z2);
    }
}
