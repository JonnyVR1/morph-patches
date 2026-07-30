package p153l;

import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class t5e {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f172195a;

    /* JADX INFO: renamed from: l.t5e$a */
    @RequiresApi(28)
    public static class C20240a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m189385a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m189386b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static int m189387c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static int m189388d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public t5e(DisplayCutout displayCutout) {
        this.f172195a = displayCutout;
    }

    /* JADX INFO: renamed from: e */
    public static t5e m189380e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new t5e(displayCutout);
    }

    /* JADX INFO: renamed from: a */
    public int m189381a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20240a.m189385a(this.f172195a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int m189382b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20240a.m189386b(this.f172195a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m189383c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20240a.m189387c(this.f172195a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m189384d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20240a.m189388d(this.f172195a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t5e.class != obj.getClass()) {
            return false;
        }
        return l950.m153327a(this.f172195a, ((t5e) obj).f172195a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f172195a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.f172195a + "}";
    }
}
