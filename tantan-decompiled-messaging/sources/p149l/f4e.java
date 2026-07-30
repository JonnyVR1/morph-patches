package p149l;

import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class f4e {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f94807a;

    /* JADX INFO: renamed from: l.f4e$a */
    @RequiresApi(28)
    public static class C16747a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m119304a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m119305b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static int m119306c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static int m119307d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public f4e(DisplayCutout displayCutout) {
        this.f94807a = displayCutout;
    }

    /* JADX INFO: renamed from: e */
    public static f4e m119299e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new f4e(displayCutout);
    }

    /* JADX INFO: renamed from: a */
    public int m119300a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C16747a.m119304a(this.f94807a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int m119301b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C16747a.m119305b(this.f94807a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m119302c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C16747a.m119306c(this.f94807a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m119303d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C16747a.m119307d(this.f94807a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f4e.class != obj.getClass()) {
            return false;
        }
        return w050.m200828a(this.f94807a, ((f4e) obj).f94807a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f94807a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.f94807a + "}";
    }
}
