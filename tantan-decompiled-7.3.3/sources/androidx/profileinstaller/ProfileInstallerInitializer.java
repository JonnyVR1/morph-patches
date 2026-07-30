package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.C0548c;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.jum;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements jum<C0545b> {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    @RequiresApi(28)
    public static class C0544a {
        /* JADX INFO: renamed from: a */
        public static Handler m3230a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C0545b {
    }

    /* JADX INFO: renamed from: g */
    public static void m3227g(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: l.my90
            @Override // java.lang.Runnable
            public final void run() {
                C0548c.m3255h(context);
            }
        });
    }

    @Override // p153l.jum
    @NonNull
    public List<Class<? extends jum<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.jum
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0545b mo2996a(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: l.ky90
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f129292a.m3229f(applicationContext);
            }
        });
        return new C0545b();
    }

    /* JADX INFO: renamed from: f */
    public void m3229f(@NonNull final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C0544a.m3230a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: l.ly90
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m3227g(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
