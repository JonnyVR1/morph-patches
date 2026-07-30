package p149l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class del0 {

    /* JADX INFO: renamed from: a */
    public static final rel0 f85805a;

    /* JADX INFO: renamed from: b */
    public static final Property<View, Float> f85806b;

    /* JADX INFO: renamed from: c */
    public static final Property<View, Rect> f85807c;

    /* JADX INFO: renamed from: l.del0$a */
    public static class C16343a extends Property<View, Float> {
        public C16343a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(del0.m111270c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            del0.m111274g(view, f.floatValue());
        }
    }

    /* JADX INFO: renamed from: l.del0$b */
    public static class C16344b extends Property<View, Rect> {
        public C16344b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return gbl0.m125216r(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            gbl0.m125213p0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f85805a = new qel0();
        } else {
            f85805a = new pel0();
        }
        f85806b = new C16343a(Float.class, "translationAlpha");
        f85807c = new C16344b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static void m111268a(@NonNull View view) {
        f85805a.mo135711a(view);
    }

    /* JADX INFO: renamed from: b */
    public static zcl0 m111269b(@NonNull View view) {
        return new xcl0(view);
    }

    /* JADX INFO: renamed from: c */
    public static float m111270c(@NonNull View view) {
        return f85805a.mo135712b(view);
    }

    /* JADX INFO: renamed from: d */
    public static l6q0 m111271d(@NonNull View view) {
        return new k6q0(view);
    }

    /* JADX INFO: renamed from: e */
    public static void m111272e(@NonNull View view) {
        f85805a.mo135713c(view);
    }

    /* JADX INFO: renamed from: f */
    public static void m111273f(@NonNull View view, int i, int i2, int i3, int i4) {
        f85805a.mo159119d(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static void m111274g(@NonNull View view, float f) {
        f85805a.mo135714e(view, f);
    }

    /* JADX INFO: renamed from: h */
    public static void m111275h(@NonNull View view, int i) {
        f85805a.mo168523f(view, i);
    }

    /* JADX INFO: renamed from: i */
    public static void m111276i(@NonNull View view, @NonNull Matrix matrix) {
        f85805a.mo149583g(view, matrix);
    }

    /* JADX INFO: renamed from: j */
    public static void m111277j(@NonNull View view, @NonNull Matrix matrix) {
        f85805a.mo149584h(view, matrix);
    }
}
