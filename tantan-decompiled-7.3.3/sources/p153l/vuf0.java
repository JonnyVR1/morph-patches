package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class vuf0 {

    /* JADX INFO: renamed from: l.vuf0$a */
    public static class C20935a {

        /* JADX INFO: renamed from: A */
        public boolean f185780A;

        /* JADX INFO: renamed from: B */
        public Drawable f185781B;

        /* JADX INFO: renamed from: C */
        public boolean f185782C;

        /* JADX INFO: renamed from: D */
        public Uri f185783D;

        /* JADX INFO: renamed from: E */
        public boolean f185784E;

        /* JADX INFO: renamed from: F */
        @DrawableRes
        public int f185785F;

        /* JADX INFO: renamed from: G */
        public ClickableSpan f185786G;

        /* JADX INFO: renamed from: H */
        public String f185787H;

        /* JADX INFO: renamed from: I */
        public final SpannableStringBuilder f185788I;

        /* JADX INFO: renamed from: a */
        public Context f185789a;

        /* JADX INFO: renamed from: b */
        public int f185790b;

        /* JADX INFO: renamed from: c */
        public CharSequence f185791c;

        /* JADX INFO: renamed from: d */
        public int f185792d;

        /* JADX INFO: renamed from: e */
        @ColorInt
        public int f185793e;

        /* JADX INFO: renamed from: f */
        @ColorInt
        public int f185794f;

        /* JADX INFO: renamed from: g */
        @ColorInt
        public int f185795g;

        /* JADX INFO: renamed from: h */
        public boolean f185796h;

        /* JADX INFO: renamed from: i */
        public int f185797i;

        /* JADX INFO: renamed from: j */
        public int f185798j;

        /* JADX INFO: renamed from: k */
        public boolean f185799k;

        /* JADX INFO: renamed from: l */
        public int f185800l;

        /* JADX INFO: renamed from: m */
        public int f185801m;

        /* JADX INFO: renamed from: n */
        public float f185802n;

        /* JADX INFO: renamed from: o */
        public float f185803o;

        /* JADX INFO: renamed from: p */
        public boolean f185804p;

        /* JADX INFO: renamed from: q */
        public boolean f185805q;

        /* JADX INFO: renamed from: r */
        public boolean f185806r;

        /* JADX INFO: renamed from: s */
        public boolean f185807s;

        /* JADX INFO: renamed from: t */
        public boolean f185808t;

        /* JADX INFO: renamed from: u */
        public boolean f185809u;

        /* JADX INFO: renamed from: v */
        public boolean f185810v;

        /* JADX INFO: renamed from: w */
        public String f185811w;

        /* JADX INFO: renamed from: x */
        public Layout.Alignment f185812x;

        /* JADX INFO: renamed from: y */
        public boolean f185813y;

        /* JADX INFO: renamed from: z */
        public Bitmap f185814z;

        public C20935a(Context context, @NonNull CharSequence charSequence) {
            this.f185790b = 301989888;
            this.f185789a = context;
            this.f185791c = charSequence;
            this.f185792d = 33;
            this.f185793e = 301989888;
            this.f185794f = 301989888;
            this.f185795g = 301989888;
            this.f185802n = -1.0f;
            this.f185803o = -1.0f;
            this.f185788I = new SpannableStringBuilder();
        }

        /* JADX INFO: renamed from: a */
        public C20935a m202789a(@NonNull CharSequence charSequence) {
            m202793e();
            this.f185791c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public SpannableStringBuilder m202790b() {
            m202793e();
            return this.f185788I;
        }

        /* JADX INFO: renamed from: c */
        public C20935a m202791c(@ColorInt int i) {
            this.f185793e = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20935a m202792d(float f) {
            this.f185802n = f;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m202793e() {
            int length = this.f185788I.length();
            this.f185788I.append(this.f185791c);
            int length2 = this.f185788I.length();
            if (this.f185793e != this.f185790b) {
                this.f185788I.setSpan(new ForegroundColorSpan(this.f185793e), length, length2, this.f185792d);
                this.f185793e = this.f185790b;
            }
            if (this.f185794f != this.f185790b) {
                this.f185788I.setSpan(new BackgroundColorSpan(this.f185794f), length, length2, this.f185792d);
                this.f185794f = this.f185790b;
            }
            if (this.f185796h) {
                this.f185788I.setSpan(new LeadingMarginSpan.Standard(this.f185797i, this.f185798j), length, length2, this.f185792d);
                this.f185796h = false;
            }
            if (this.f185795g != this.f185790b) {
                this.f185788I.setSpan(new QuoteSpan(this.f185795g), length, length2, 0);
                this.f185795g = this.f185790b;
            }
            if (this.f185799k) {
                this.f185788I.setSpan(new BulletSpan(this.f185800l, this.f185801m), length, length2, 0);
                this.f185799k = false;
            }
            if (this.f185802n != -1.0f) {
                this.f185788I.setSpan(new RelativeSizeSpan(this.f185802n), length, length2, this.f185792d);
                this.f185802n = -1.0f;
            }
            if (this.f185803o != -1.0f) {
                this.f185788I.setSpan(new ScaleXSpan(this.f185803o), length, length2, this.f185792d);
                this.f185803o = -1.0f;
            }
            if (this.f185804p) {
                this.f185788I.setSpan(new StrikethroughSpan(), length, length2, this.f185792d);
                this.f185804p = false;
            }
            if (this.f185805q) {
                this.f185788I.setSpan(new UnderlineSpan(), length, length2, this.f185792d);
                this.f185805q = false;
            }
            if (this.f185806r) {
                this.f185788I.setSpan(new SuperscriptSpan(), length, length2, this.f185792d);
                this.f185806r = false;
            }
            if (this.f185807s) {
                this.f185788I.setSpan(new SubscriptSpan(), length, length2, this.f185792d);
                this.f185807s = false;
            }
            if (this.f185808t) {
                this.f185788I.setSpan(new StyleSpan(1), length, length2, this.f185792d);
                this.f185808t = false;
            }
            if (this.f185809u) {
                this.f185788I.setSpan(new StyleSpan(2), length, length2, this.f185792d);
                this.f185809u = false;
            }
            if (this.f185810v) {
                this.f185788I.setSpan(new StyleSpan(3), length, length2, this.f185792d);
                this.f185810v = false;
            }
            if (this.f185811w != null) {
                this.f185788I.setSpan(new TypefaceSpan(this.f185811w), length, length2, this.f185792d);
                this.f185811w = null;
            }
            if (this.f185812x != null) {
                this.f185788I.setSpan(new AlignmentSpan.Standard(this.f185812x), length, length2, this.f185792d);
                this.f185812x = null;
            }
            boolean z = this.f185813y;
            if (z || this.f185780A || this.f185782C || this.f185784E) {
                if (z) {
                    this.f185788I.setSpan(new ImageSpan(this.f185789a, this.f185814z), length, length2, this.f185792d);
                    this.f185814z = null;
                    this.f185813y = false;
                } else if (this.f185780A) {
                    this.f185788I.setSpan(new ImageSpan(this.f185781B), length, length2, this.f185792d);
                    this.f185781B = null;
                    this.f185780A = false;
                } else {
                    boolean z2 = this.f185782C;
                    SpannableStringBuilder spannableStringBuilder = this.f185788I;
                    if (z2) {
                        spannableStringBuilder.setSpan(new ImageSpan(this.f185789a, this.f185783D), length, length2, this.f185792d);
                        this.f185783D = null;
                        this.f185782C = false;
                    } else {
                        spannableStringBuilder.setSpan(new ImageSpan(this.f185789a, this.f185785F), length, length2, this.f185792d);
                        this.f185785F = 0;
                        this.f185784E = false;
                    }
                }
            }
            ClickableSpan clickableSpan = this.f185786G;
            if (clickableSpan != null) {
                this.f185788I.setSpan(clickableSpan, length, length2, this.f185792d);
                this.f185786G = null;
            }
            if (this.f185787H != null) {
                this.f185788I.setSpan(new URLSpan(this.f185787H), length, length2, this.f185792d);
                this.f185787H = null;
            }
            this.f185792d = 33;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C20935a m202788a(Context context, @NonNull CharSequence charSequence) {
        return new C20935a(context, charSequence);
    }
}
