package p149l;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class o5g0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m162781a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m162782b(Object obj) {
        return !(obj instanceof w6r);
    }

    /* JADX INFO: renamed from: c */
    public static void m162783c(ywb.C21557b c21557b) {
        c21557b.m216312b();
        if (c21557b.m216315e() instanceof Spanned) {
            if (!(c21557b.m216315e() instanceof Spannable)) {
                c21557b.m216325o(SpannableString.valueOf(c21557b.m216315e()));
            }
            m162785e((Spannable) p11.m167011e(c21557b.m216315e()), new oh80() { // from class: l.m5g0
                @Override // p149l.oh80
                public final boolean apply(Object obj) {
                    return o5g0.m162782b(obj);
                }
            });
        }
        m162784d(c21557b);
    }

    /* JADX INFO: renamed from: d */
    public static void m162784d(ywb.C21557b c21557b) {
        c21557b.m216327q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c21557b.m216315e() instanceof Spanned) {
            if (!(c21557b.m216315e() instanceof Spannable)) {
                c21557b.m216325o(SpannableString.valueOf(c21557b.m216315e()));
            }
            m162785e((Spannable) p11.m167011e(c21557b.m216315e()), new oh80() { // from class: l.n5g0
                @Override // p149l.oh80
                public final boolean apply(Object obj) {
                    return o5g0.m162781a(obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m162785e(Spannable spannable, oh80<Object> oh80Var) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (oh80Var.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static float m162786f(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
