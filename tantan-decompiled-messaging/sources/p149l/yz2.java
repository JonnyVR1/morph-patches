package p149l;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class yz2 {

    /* JADX INFO: renamed from: a */
    public final pli f200843a;

    /* JADX INFO: renamed from: b */
    public final BiometricManager f200844b;

    /* JADX INFO: renamed from: l.yz2$a */
    @RequiresApi(29)
    public static class C21585a {
        /* JADX INFO: renamed from: a */
        public static int m216590a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static BiometricManager m216591b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }
    }

    public yz2(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f200844b = C21585a.m216591b(context);
            this.f200843a = null;
        } else {
            this.f200844b = null;
            this.f200843a = pli.m170200c(context);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static yz2 m216588b(@NonNull Context context) {
        return new yz2(context);
    }

    /* JADX INFO: renamed from: a */
    public int m216589a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C21585a.m216590a(this.f200844b);
        }
        if (this.f200843a.m170208f()) {
            return !this.f200843a.m170207e() ? 11 : 0;
        }
        return 12;
    }
}
