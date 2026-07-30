package p149l;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class ua60 {

    /* JADX INFO: renamed from: l.ua60$a */
    @RequiresApi(21)
    public static class C20395a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Interpolator m192733a(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Interpolator m192732a(float f, float f2, float f3, float f4) {
        return C20395a.m192733a(f, f2, f3, f4);
    }
}
