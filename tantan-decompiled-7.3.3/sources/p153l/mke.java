package p153l;

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
public final class mke {

    /* JADX INFO: renamed from: a */
    public final EdgeEffect f137282a;

    /* JADX INFO: renamed from: l.mke$a */
    @RequiresApi(21)
    public static class C18638a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m158765a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: renamed from: l.mke$b */
    @RequiresApi(31)
    public static class C18639b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m158766a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static float m158767b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static float m158768c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public mke(Context context) {
        this.f137282a = new EdgeEffect(context);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m158755a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C18639b.m158766a(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: c */
    public static float m158756c(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C18639b.m158767b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public static void m158757f(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        C18638a.m158765a(edgeEffect, f, f2);
    }

    /* JADX INFO: renamed from: h */
    public static float m158758h(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C18639b.m158768c(edgeEffect, f, f2);
        }
        m158757f(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public boolean m158759b(Canvas canvas) {
        return this.f137282a.draw(canvas);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public boolean m158760d() {
        return this.f137282a.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public boolean m158761e(int i) {
        this.f137282a.onAbsorb(i);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public boolean m158762g(float f) {
        this.f137282a.onPull(f);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public boolean m158763i() {
        this.f137282a.onRelease();
        return this.f137282a.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public void m158764j(int i, int i2) {
        this.f137282a.setSize(i, i2);
    }
}
