package p153l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class nfq0 {

    /* JADX INFO: renamed from: l.nfq0$a */
    public static class C18868a {
        /* JADX INFO: renamed from: a */
        public static void m162937a(@NonNull Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: l.nfq0$b */
    @RequiresApi(30)
    public static class C18869b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m162938a(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static bhq0 m162935a(@NonNull Window window, @NonNull View view) {
        return new bhq0(window, view);
    }

    /* JADX INFO: renamed from: b */
    public static void m162936b(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C18869b.m162938a(window, z);
        } else {
            C18868a.m162937a(window, z);
        }
    }
}
