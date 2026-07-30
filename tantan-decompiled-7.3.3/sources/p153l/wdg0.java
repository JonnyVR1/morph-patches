package p153l;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wdg0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m205879a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m205880b(Object obj) {
        return !(obj instanceof x8r);
    }

    /* JADX INFO: renamed from: c */
    public static void m205881c(myb.C18746b c18746b) {
        c18746b.m160755b();
        if (c18746b.m160758e() instanceof Spanned) {
            if (!(c18746b.m160758e() instanceof Spannable)) {
                c18746b.m160768o(SpannableString.valueOf(c18746b.m160758e()));
            }
            m205883e((Spannable) w11.m204369e(c18746b.m160758e()), new tp80() { // from class: l.udg0
                @Override // p153l.tp80
                public final boolean apply(Object obj) {
                    return wdg0.m205880b(obj);
                }
            });
        }
        m205882d(c18746b);
    }

    /* JADX INFO: renamed from: d */
    public static void m205882d(myb.C18746b c18746b) {
        c18746b.m160770q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c18746b.m160758e() instanceof Spanned) {
            if (!(c18746b.m160758e() instanceof Spannable)) {
                c18746b.m160768o(SpannableString.valueOf(c18746b.m160758e()));
            }
            m205883e((Spannable) w11.m204369e(c18746b.m160758e()), new tp80() { // from class: l.vdg0
                @Override // p153l.tp80
                public final boolean apply(Object obj) {
                    return wdg0.m205879a(obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m205883e(Spannable spannable, tp80<Object> tp80Var) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (tp80Var.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static float m205884f(int i, float f, int i2, int i3) {
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
