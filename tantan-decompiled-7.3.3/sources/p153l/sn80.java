package p153l;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class sn80 implements Spannable {

    /* JADX INFO: renamed from: d */
    public static final Object f169653d = new Object();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Spannable f169654a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C20112a f169655b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PrecomputedText f169656c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public C20112a m186874a() {
        return this.f169655b;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: b */
    public PrecomputedText m186875b() {
        if (dn80.m117055a(this.f169654a)) {
            return en80.m121428a(this.f169654a);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f169654a.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f169654a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f169654a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f169654a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f169656c.getSpans(i, i2, cls) : (T[]) this.f169654a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f169654a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f169654a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            wg3.m206174a("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f169656c.removeSpan(obj);
        } else {
            this.f169654a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            wg3.m206174a("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f169656c.setSpan(obj, i, i2, i3);
        } else {
            this.f169654a.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f169654a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f169654a.toString();
    }

    /* JADX INFO: renamed from: l.sn80$a */
    public static final class C20112a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final TextPaint f169657a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final TextDirectionHeuristic f169658b;

        /* JADX INFO: renamed from: c */
        public final int f169659c;

        /* JADX INFO: renamed from: d */
        public final int f169660d;

        /* JADX INFO: renamed from: e */
        public final PrecomputedText.Params f169661e;

        /* JADX INFO: renamed from: l.sn80$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            @NonNull
            public final TextPaint f169662a;

            /* JADX INFO: renamed from: c */
            public int f169664c = 1;

            /* JADX INFO: renamed from: d */
            public int f169665d = 1;

            /* JADX INFO: renamed from: b */
            public TextDirectionHeuristic f169663b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(@NonNull TextPaint textPaint) {
                this.f169662a = textPaint;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public C20112a m186881a() {
                return new C20112a(this.f169662a, this.f169663b, this.f169664c, this.f169665d);
            }

            @RequiresApi(23)
            /* JADX INFO: renamed from: b */
            public a m186882b(int i) {
                this.f169664c = i;
                return this;
            }

            @RequiresApi(23)
            /* JADX INFO: renamed from: c */
            public a m186883c(int i) {
                this.f169665d = i;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m186884d(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f169663b = textDirectionHeuristic;
                return this;
            }
        }

        public C20112a(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f169661e = rn80.m182120a(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f169661e = null;
            }
            this.f169657a = textPaint;
            this.f169658b = textDirectionHeuristic;
            this.f169659c = i;
            this.f169660d = i2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: a */
        public boolean m186876a(@NonNull C20112a c20112a) {
            if (this.f169659c != c20112a.m186877b() || this.f169660d != c20112a.m186878c() || this.f169657a.getTextSize() != c20112a.m186880e().getTextSize() || this.f169657a.getTextScaleX() != c20112a.m186880e().getTextScaleX() || this.f169657a.getTextSkewX() != c20112a.m186880e().getTextSkewX() || this.f169657a.getLetterSpacing() != c20112a.m186880e().getLetterSpacing() || !TextUtils.equals(this.f169657a.getFontFeatureSettings(), c20112a.m186880e().getFontFeatureSettings()) || this.f169657a.getFlags() != c20112a.m186880e().getFlags() || !this.f169657a.getTextLocales().equals(c20112a.m186880e().getTextLocales())) {
                return false;
            }
            if (this.f169657a.getTypeface() == null) {
                return c20112a.m186880e().getTypeface() == null;
            }
            return this.f169657a.getTypeface().equals(c20112a.m186880e().getTypeface());
        }

        @RequiresApi(23)
        /* JADX INFO: renamed from: b */
        public int m186877b() {
            return this.f169659c;
        }

        @RequiresApi(23)
        /* JADX INFO: renamed from: c */
        public int m186878c() {
            return this.f169660d;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public TextDirectionHeuristic m186879d() {
            return this.f169658b;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public TextPaint m186880e() {
            return this.f169657a;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C20112a)) {
                return false;
            }
            C20112a c20112a = (C20112a) obj;
            return m186876a(c20112a) && this.f169658b == c20112a.m186879d();
        }

        public int hashCode() {
            return l950.m153328b(Float.valueOf(this.f169657a.getTextSize()), Float.valueOf(this.f169657a.getTextScaleX()), Float.valueOf(this.f169657a.getTextSkewX()), Float.valueOf(this.f169657a.getLetterSpacing()), Integer.valueOf(this.f169657a.getFlags()), this.f169657a.getTextLocales(), this.f169657a.getTypeface(), Boolean.valueOf(this.f169657a.isElegantTextHeight()), this.f169658b, Integer.valueOf(this.f169659c), Integer.valueOf(this.f169660d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f169657a.getTextSize());
            sb.append(", textScaleX=" + this.f169657a.getTextScaleX());
            sb.append(", textSkewX=" + this.f169657a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f169657a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f169657a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f169657a.getTextLocales());
            sb.append(", typeface=" + this.f169657a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f169657a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f169658b);
            sb.append(", breakStrategy=" + this.f169659c);
            sb.append(", hyphenationFrequency=" + this.f169660d);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi(28)
        public C20112a(@NonNull PrecomputedText.Params params) {
            this.f169657a = params.getTextPaint();
            this.f169658b = params.getTextDirection();
            this.f169659c = params.getBreakStrategy();
            this.f169660d = params.getHyphenationFrequency();
            this.f169661e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
