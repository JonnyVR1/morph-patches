package p153l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class hnl0 {

    /* JADX INFO: renamed from: a */
    public static final vnl0 f110797a;

    /* JADX INFO: renamed from: b */
    public static final Property<View, Float> f110798b;

    /* JADX INFO: renamed from: c */
    public static final Property<View, Rect> f110799c;

    /* JADX INFO: renamed from: l.hnl0$a */
    public static class C17522a extends Property<View, Float> {
        public C17522a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(hnl0.m136149c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            hnl0.m136153g(view, f.floatValue());
        }
    }

    /* JADX INFO: renamed from: l.hnl0$b */
    public static class C17523b extends Property<View, Rect> {
        public C17523b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return kkl0.m150179r(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            kkl0.m150176p0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f110797a = new unl0();
        } else {
            f110797a = new tnl0();
        }
        f110798b = new C17522a(Float.class, "translationAlpha");
        f110799c = new C17523b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static void m136147a(@NonNull View view) {
        f110797a.mo159188a(view);
    }

    /* JADX INFO: renamed from: b */
    public static dml0 m136148b(@NonNull View view) {
        return new bml0(view);
    }

    /* JADX INFO: renamed from: c */
    public static float m136149c(@NonNull View view) {
        return f110797a.mo159189b(view);
    }

    /* JADX INFO: renamed from: d */
    public static qfq0 m136150d(@NonNull View view) {
        return new pfq0(view);
    }

    /* JADX INFO: renamed from: e */
    public static void m136151e(@NonNull View view) {
        f110797a.mo159190c(view);
    }

    /* JADX INFO: renamed from: f */
    public static void m136152f(@NonNull View view, int i, int i2, int i3, int i4) {
        f110797a.mo182318d(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static void m136153g(@NonNull View view, float f) {
        f110797a.mo159191e(view, f);
    }

    /* JADX INFO: renamed from: h */
    public static void m136154h(@NonNull View view, int i) {
        f110797a.mo191954f(view, i);
    }

    /* JADX INFO: renamed from: i */
    public static void m136155i(@NonNull View view, @NonNull Matrix matrix) {
        f110797a.mo173071g(view, matrix);
    }

    /* JADX INFO: renamed from: j */
    public static void m136156j(@NonNull View view, @NonNull Matrix matrix) {
        f110797a.mo173072h(view, matrix);
    }
}
