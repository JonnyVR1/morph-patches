package p149l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class i6q0 {

    /* JADX INFO: renamed from: l.i6q0$a */
    public static class C17493a {
        /* JADX INFO: renamed from: a */
        public static void m134632a(@NonNull Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: l.i6q0$b */
    @RequiresApi(30)
    public static class C17494b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m134633a(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static w7q0 m134630a(@NonNull Window window, @NonNull View view) {
        return new w7q0(window, view);
    }

    /* JADX INFO: renamed from: b */
    public static void m134631b(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C17494b.m134633a(window, z);
        } else {
            C17493a.m134632a(window, z);
        }
    }
}
