package p149l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class hmi0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f108432a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final int[] f108433b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f108434c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f108435d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e */
    public static final int[] f108436e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    public static final int[] f108437f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    public static final int[] f108438g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h */
    public static final int[] f108439h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i */
    public static final int[] f108440i = new int[0];

    /* JADX INFO: renamed from: j */
    public static final int[] f108441j = new int[1];

    /* JADX INFO: renamed from: a */
    public static int m131733a(Context context, int i) {
        ColorStateList colorStateListM131736d = m131736d(context, i);
        if (colorStateListM131736d != null && colorStateListM131736d.isStateful()) {
            return colorStateListM131736d.getColorForState(f108433b, colorStateListM131736d.getDefaultColor());
        }
        TypedValue typedValueM131737e = m131737e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM131737e, true);
        return m131735c(context, i, typedValueM131737e.getFloat());
    }

    /* JADX INFO: renamed from: b */
    public static int m131734b(Context context, int i) {
        int[] iArr = f108441j;
        iArr[0] = i;
        qri0 qri0VarM175992t = qri0.m175992t(context, null, iArr);
        try {
            return qri0VarM175992t.m175995b(0, 0);
        } finally {
            qri0VarM175992t.m176012v();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m131735c(Context context, int i, float f) {
        int iM131734b = m131734b(context, i);
        return ge5.m125678o(iM131734b, Math.round(Color.alpha(iM131734b) * f));
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m131736d(Context context, int i) {
        int[] iArr = f108441j;
        iArr[0] = i;
        qri0 qri0VarM175992t = qri0.m175992t(context, null, iArr);
        try {
            return qri0VarM175992t.m175996c(0);
        } finally {
            qri0VarM175992t.m176012v();
        }
    }

    /* JADX INFO: renamed from: e */
    public static TypedValue m131737e() {
        ThreadLocal<TypedValue> threadLocal = f108432a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
