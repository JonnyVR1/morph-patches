package p153l;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class n03 {

    /* JADX INFO: renamed from: a */
    public final loi f139585a;

    /* JADX INFO: renamed from: b */
    public final BiometricManager f139586b;

    /* JADX INFO: renamed from: l.n03$a */
    @RequiresApi(29)
    public static class C18753a {
        /* JADX INFO: renamed from: a */
        public static int m160953a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static BiometricManager m160954b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }
    }

    public n03(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f139586b = C18753a.m160954b(context);
            this.f139585a = null;
        } else {
            this.f139586b = null;
            this.f139585a = loi.m155059c(context);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static n03 m160951b(@NonNull Context context) {
        return new n03(context);
    }

    /* JADX INFO: renamed from: a */
    public int m160952a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C18753a.m160953a(this.f139586b);
        }
        if (this.f139585a.m155067f()) {
            return !this.f139585a.m155066e() ? 11 : 0;
        }
        return 12;
    }
}
