package p149l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class dvr0 {

    /* JADX INFO: renamed from: e */
    public static final String[] f88094e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a */
    public long f88095a = 0;

    /* JADX INFO: renamed from: b */
    public long f88096b = 0;

    /* JADX INFO: renamed from: c */
    public long f88097c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f88098d = false;

    public dvr0(@NonNull Context context, @NonNull Executor executor, @NonNull String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new bvr0(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static dvr0 m113811d(@NonNull Context context, @NonNull Executor executor) {
        return new dvr0(context, executor, f88094e);
    }

    /* JADX INFO: renamed from: b */
    public final long m113815b() {
        long j = this.f88097c;
        this.f88097c = -1L;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public final long m113816c() {
        if (this.f88098d) {
            return this.f88096b - this.f88095a;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: h */
    public final void m113817h() {
        if (this.f88098d) {
            this.f88096b = System.currentTimeMillis();
        }
    }
}
