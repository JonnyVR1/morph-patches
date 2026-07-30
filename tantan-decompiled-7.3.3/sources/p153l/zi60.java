package p153l;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class zi60 {

    /* JADX INFO: renamed from: l.zi60$a */
    @RequiresApi(21)
    public static class C21812a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Interpolator m219725a(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Interpolator m219724a(float f, float f2, float f3, float f4) {
        return C21812a.m219725a(f, f2, f3, f4);
    }
}
