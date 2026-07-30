package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.C0547c;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.hsm;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements hsm<C0544b> {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    @RequiresApi(28)
    public static class C0543a {
        /* JADX INFO: renamed from: a */
        public static Handler m3229a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C0544b {
    }

    /* JADX INFO: renamed from: g */
    public static void m3226g(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: l.iq90
            @Override // java.lang.Runnable
            public final void run() {
                C0547c.m3254h(context);
            }
        });
    }

    @Override // p149l.hsm
    @NonNull
    public List<Class<? extends hsm<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.hsm
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0544b mo2995a(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: l.gq90
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f103909a.m3228f(applicationContext);
            }
        });
        return new C0544b();
    }

    /* JADX INFO: renamed from: f */
    public void m3228f(@NonNull final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C0543a.m3229a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: l.hq90
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m3226g(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
