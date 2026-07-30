package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class ije {

    /* JADX INFO: renamed from: a */
    public final EdgeEffect f113546a;

    /* JADX INFO: renamed from: l.ije$a */
    @RequiresApi(21)
    public static class C17563a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m136604a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: renamed from: l.ije$b */
    @RequiresApi(31)
    public static class C17564b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m136605a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static float m136606b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static float m136607c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public ije(Context context) {
        this.f113546a = new EdgeEffect(context);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m136594a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C17564b.m136605a(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: c */
    public static float m136595c(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C17564b.m136606b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public static void m136596f(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        C17563a.m136604a(edgeEffect, f, f2);
    }

    /* JADX INFO: renamed from: h */
    public static float m136597h(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C17564b.m136607c(edgeEffect, f, f2);
        }
        m136596f(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public boolean m136598b(Canvas canvas) {
        return this.f113546a.draw(canvas);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public boolean m136599d() {
        return this.f113546a.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public boolean m136600e(int i) {
        this.f113546a.onAbsorb(i);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public boolean m136601g(float f) {
        this.f113546a.onPull(f);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public boolean m136602i() {
        this.f113546a.onRelease();
        return this.f113546a.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public void m136603j(int i, int i2) {
        this.f113546a.setSize(i, i2);
    }
}
