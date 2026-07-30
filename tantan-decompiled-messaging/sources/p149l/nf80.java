package p149l;

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
public class nf80 implements Spannable {

    /* JADX INFO: renamed from: d */
    public static final Object f138689d = new Object();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Spannable f138690a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C18685a f138691b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PrecomputedText f138692c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public C18685a m159138a() {
        return this.f138691b;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: b */
    public PrecomputedText m159139b() {
        if (ye80.m214343a(this.f138690a)) {
            return ze80.m218279a(this.f138690a);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f138690a.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f138690a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f138690a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f138690a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f138692c.getSpans(i, i2, cls) : (T[]) this.f138690a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f138690a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f138690a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            ig3.m135964a("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f138692c.removeSpan(obj);
        } else {
            this.f138690a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            ig3.m135964a("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f138692c.setSpan(obj, i, i2, i3);
        } else {
            this.f138690a.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f138690a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f138690a.toString();
    }

    /* JADX INFO: renamed from: l.nf80$a */
    public static final class C18685a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final TextPaint f138693a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final TextDirectionHeuristic f138694b;

        /* JADX INFO: renamed from: c */
        public final int f138695c;

        /* JADX INFO: renamed from: d */
        public final int f138696d;

        /* JADX INFO: renamed from: e */
        public final PrecomputedText.Params f138697e;

        /* JADX INFO: renamed from: l.nf80$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            @NonNull
            public final TextPaint f138698a;

            /* JADX INFO: renamed from: c */
            public int f138700c = 1;

            /* JADX INFO: renamed from: d */
            public int f138701d = 1;

            /* JADX INFO: renamed from: b */
            public TextDirectionHeuristic f138699b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(@NonNull TextPaint textPaint) {
                this.f138698a = textPaint;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public C18685a m159145a() {
                return new C18685a(this.f138698a, this.f138699b, this.f138700c, this.f138701d);
            }

            @RequiresApi(23)
            /* JADX INFO: renamed from: b */
            public a m159146b(int i) {
                this.f138700c = i;
                return this;
            }

            @RequiresApi(23)
            /* JADX INFO: renamed from: c */
            public a m159147c(int i) {
                this.f138701d = i;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m159148d(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f138699b = textDirectionHeuristic;
                return this;
            }
        }

        public C18685a(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f138697e = mf80.m154368a(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f138697e = null;
            }
            this.f138693a = textPaint;
            this.f138694b = textDirectionHeuristic;
            this.f138695c = i;
            this.f138696d = i2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: a */
        public boolean m159140a(@NonNull C18685a c18685a) {
            if (this.f138695c != c18685a.m159141b() || this.f138696d != c18685a.m159142c() || this.f138693a.getTextSize() != c18685a.m159144e().getTextSize() || this.f138693a.getTextScaleX() != c18685a.m159144e().getTextScaleX() || this.f138693a.getTextSkewX() != c18685a.m159144e().getTextSkewX() || this.f138693a.getLetterSpacing() != c18685a.m159144e().getLetterSpacing() || !TextUtils.equals(this.f138693a.getFontFeatureSettings(), c18685a.m159144e().getFontFeatureSettings()) || this.f138693a.getFlags() != c18685a.m159144e().getFlags() || !this.f138693a.getTextLocales().equals(c18685a.m159144e().getTextLocales())) {
                return false;
            }
            if (this.f138693a.getTypeface() == null) {
                return c18685a.m159144e().getTypeface() == null;
            }
            return this.f138693a.getTypeface().equals(c18685a.m159144e().getTypeface());
        }

        @RequiresApi(23)
        /* JADX INFO: renamed from: b */
        public int m159141b() {
            return this.f138695c;
        }

        @RequiresApi(23)
        /* JADX INFO: renamed from: c */
        public int m159142c() {
            return this.f138696d;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public TextDirectionHeuristic m159143d() {
            return this.f138694b;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public TextPaint m159144e() {
            return this.f138693a;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C18685a)) {
                return false;
            }
            C18685a c18685a = (C18685a) obj;
            return m159140a(c18685a) && this.f138694b == c18685a.m159143d();
        }

        public int hashCode() {
            return w050.m200829b(Float.valueOf(this.f138693a.getTextSize()), Float.valueOf(this.f138693a.getTextScaleX()), Float.valueOf(this.f138693a.getTextSkewX()), Float.valueOf(this.f138693a.getLetterSpacing()), Integer.valueOf(this.f138693a.getFlags()), this.f138693a.getTextLocales(), this.f138693a.getTypeface(), Boolean.valueOf(this.f138693a.isElegantTextHeight()), this.f138694b, Integer.valueOf(this.f138695c), Integer.valueOf(this.f138696d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f138693a.getTextSize());
            sb.append(", textScaleX=" + this.f138693a.getTextScaleX());
            sb.append(", textSkewX=" + this.f138693a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f138693a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f138693a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f138693a.getTextLocales());
            sb.append(", typeface=" + this.f138693a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f138693a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f138694b);
            sb.append(", breakStrategy=" + this.f138695c);
            sb.append(", hyphenationFrequency=" + this.f138696d);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi(28)
        public C18685a(@NonNull PrecomputedText.Params params) {
            this.f138693a = params.getTextPaint();
            this.f138694b = params.getTextDirection();
            this.f138695c = params.getBreakStrategy();
            this.f138696d = params.getHyphenationFrequency();
            this.f138697e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
