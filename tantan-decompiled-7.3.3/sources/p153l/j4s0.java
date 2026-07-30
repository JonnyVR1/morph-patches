package p153l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class j4s0 {

    /* JADX INFO: renamed from: e */
    public static final String[] f118322e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a */
    public long f118323a = 0;

    /* JADX INFO: renamed from: b */
    public long f118324b = 0;

    /* JADX INFO: renamed from: c */
    public long f118325c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f118326d = false;

    public j4s0(@NonNull Context context, @NonNull Executor executor, @NonNull String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new h4s0(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static j4s0 m143448d(@NonNull Context context, @NonNull Executor executor) {
        return new j4s0(context, executor, f118322e);
    }

    /* JADX INFO: renamed from: b */
    public final long m143452b() {
        long j = this.f118325c;
        this.f118325c = -1L;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public final long m143453c() {
        if (this.f118326d) {
            return this.f118324b - this.f118323a;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: h */
    public final void m143454h() {
        if (this.f118326d) {
            this.f118324b = System.currentTimeMillis();
        }
    }
}
