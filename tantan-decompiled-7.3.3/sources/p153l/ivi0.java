package p153l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class ivi0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f117071a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final int[] f117072b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f117073c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f117074d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e */
    public static final int[] f117075e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    public static final int[] f117076f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    public static final int[] f117077g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h */
    public static final int[] f117078h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i */
    public static final int[] f117079i = new int[0];

    /* JADX INFO: renamed from: j */
    public static final int[] f117080j = new int[1];

    /* JADX INFO: renamed from: a */
    public static int m142316a(Context context, int i) {
        ColorStateList colorStateListM142319d = m142319d(context, i);
        if (colorStateListM142319d != null && colorStateListM142319d.isStateful()) {
            return colorStateListM142319d.getColorForState(f117072b, colorStateListM142319d.getDefaultColor());
        }
        TypedValue typedValueM142320e = m142320e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM142320e, true);
        return m142318c(context, i, typedValueM142320e.getFloat());
    }

    /* JADX INFO: renamed from: b */
    public static int m142317b(Context context, int i) {
        int[] iArr = f117080j;
        iArr[0] = i;
        t0j0 t0j0VarM188781t = t0j0.m188781t(context, null, iArr);
        try {
            return t0j0VarM188781t.m188784b(0, 0);
        } finally {
            t0j0VarM188781t.m188801v();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m142318c(Context context, int i, float f) {
        int iM142317b = m142317b(context, i);
        return gf5.m130052o(iM142317b, Math.round(Color.alpha(iM142317b) * f));
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m142319d(Context context, int i) {
        int[] iArr = f117080j;
        iArr[0] = i;
        t0j0 t0j0VarM188781t = t0j0.m188781t(context, null, iArr);
        try {
            return t0j0VarM188781t.m188785c(0);
        } finally {
            t0j0VarM188781t.m188801v();
        }
    }

    /* JADX INFO: renamed from: e */
    public static TypedValue m142320e() {
        ThreadLocal<TypedValue> threadLocal = f117071a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
