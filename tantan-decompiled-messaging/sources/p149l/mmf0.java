package p149l;

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
public class mmf0 {

    /* JADX INFO: renamed from: l.mmf0$a */
    public static class C18503a {

        /* JADX INFO: renamed from: A */
        public boolean f134628A;

        /* JADX INFO: renamed from: B */
        public Drawable f134629B;

        /* JADX INFO: renamed from: C */
        public boolean f134630C;

        /* JADX INFO: renamed from: D */
        public Uri f134631D;

        /* JADX INFO: renamed from: E */
        public boolean f134632E;

        /* JADX INFO: renamed from: F */
        @DrawableRes
        public int f134633F;

        /* JADX INFO: renamed from: G */
        public ClickableSpan f134634G;

        /* JADX INFO: renamed from: H */
        public String f134635H;

        /* JADX INFO: renamed from: I */
        public final SpannableStringBuilder f134636I;

        /* JADX INFO: renamed from: a */
        public Context f134637a;

        /* JADX INFO: renamed from: b */
        public int f134638b;

        /* JADX INFO: renamed from: c */
        public CharSequence f134639c;

        /* JADX INFO: renamed from: d */
        public int f134640d;

        /* JADX INFO: renamed from: e */
        @ColorInt
        public int f134641e;

        /* JADX INFO: renamed from: f */
        @ColorInt
        public int f134642f;

        /* JADX INFO: renamed from: g */
        @ColorInt
        public int f134643g;

        /* JADX INFO: renamed from: h */
        public boolean f134644h;

        /* JADX INFO: renamed from: i */
        public int f134645i;

        /* JADX INFO: renamed from: j */
        public int f134646j;

        /* JADX INFO: renamed from: k */
        public boolean f134647k;

        /* JADX INFO: renamed from: l */
        public int f134648l;

        /* JADX INFO: renamed from: m */
        public int f134649m;

        /* JADX INFO: renamed from: n */
        public float f134650n;

        /* JADX INFO: renamed from: o */
        public float f134651o;

        /* JADX INFO: renamed from: p */
        public boolean f134652p;

        /* JADX INFO: renamed from: q */
        public boolean f134653q;

        /* JADX INFO: renamed from: r */
        public boolean f134654r;

        /* JADX INFO: renamed from: s */
        public boolean f134655s;

        /* JADX INFO: renamed from: t */
        public boolean f134656t;

        /* JADX INFO: renamed from: u */
        public boolean f134657u;

        /* JADX INFO: renamed from: v */
        public boolean f134658v;

        /* JADX INFO: renamed from: w */
        public String f134659w;

        /* JADX INFO: renamed from: x */
        public Layout.Alignment f134660x;

        /* JADX INFO: renamed from: y */
        public boolean f134661y;

        /* JADX INFO: renamed from: z */
        public Bitmap f134662z;

        public C18503a(Context context, @NonNull CharSequence charSequence) {
            this.f134638b = 301989888;
            this.f134637a = context;
            this.f134639c = charSequence;
            this.f134640d = 33;
            this.f134641e = 301989888;
            this.f134642f = 301989888;
            this.f134643g = 301989888;
            this.f134650n = -1.0f;
            this.f134651o = -1.0f;
            this.f134636I = new SpannableStringBuilder();
        }

        /* JADX INFO: renamed from: a */
        public C18503a m155393a(@NonNull CharSequence charSequence) {
            m155397e();
            this.f134639c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public SpannableStringBuilder m155394b() {
            m155397e();
            return this.f134636I;
        }

        /* JADX INFO: renamed from: c */
        public C18503a m155395c(@ColorInt int i) {
            this.f134641e = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18503a m155396d(float f) {
            this.f134650n = f;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final void m155397e() {
            int length = this.f134636I.length();
            this.f134636I.append(this.f134639c);
            int length2 = this.f134636I.length();
            if (this.f134641e != this.f134638b) {
                this.f134636I.setSpan(new ForegroundColorSpan(this.f134641e), length, length2, this.f134640d);
                this.f134641e = this.f134638b;
            }
            if (this.f134642f != this.f134638b) {
                this.f134636I.setSpan(new BackgroundColorSpan(this.f134642f), length, length2, this.f134640d);
                this.f134642f = this.f134638b;
            }
            if (this.f134644h) {
                this.f134636I.setSpan(new LeadingMarginSpan.Standard(this.f134645i, this.f134646j), length, length2, this.f134640d);
                this.f134644h = false;
            }
            if (this.f134643g != this.f134638b) {
                this.f134636I.setSpan(new QuoteSpan(this.f134643g), length, length2, 0);
                this.f134643g = this.f134638b;
            }
            if (this.f134647k) {
                this.f134636I.setSpan(new BulletSpan(this.f134648l, this.f134649m), length, length2, 0);
                this.f134647k = false;
            }
            if (this.f134650n != -1.0f) {
                this.f134636I.setSpan(new RelativeSizeSpan(this.f134650n), length, length2, this.f134640d);
                this.f134650n = -1.0f;
            }
            if (this.f134651o != -1.0f) {
                this.f134636I.setSpan(new ScaleXSpan(this.f134651o), length, length2, this.f134640d);
                this.f134651o = -1.0f;
            }
            if (this.f134652p) {
                this.f134636I.setSpan(new StrikethroughSpan(), length, length2, this.f134640d);
                this.f134652p = false;
            }
            if (this.f134653q) {
                this.f134636I.setSpan(new UnderlineSpan(), length, length2, this.f134640d);
                this.f134653q = false;
            }
            if (this.f134654r) {
                this.f134636I.setSpan(new SuperscriptSpan(), length, length2, this.f134640d);
                this.f134654r = false;
            }
            if (this.f134655s) {
                this.f134636I.setSpan(new SubscriptSpan(), length, length2, this.f134640d);
                this.f134655s = false;
            }
            if (this.f134656t) {
                this.f134636I.setSpan(new StyleSpan(1), length, length2, this.f134640d);
                this.f134656t = false;
            }
            if (this.f134657u) {
                this.f134636I.setSpan(new StyleSpan(2), length, length2, this.f134640d);
                this.f134657u = false;
            }
            if (this.f134658v) {
                this.f134636I.setSpan(new StyleSpan(3), length, length2, this.f134640d);
                this.f134658v = false;
            }
            if (this.f134659w != null) {
                this.f134636I.setSpan(new TypefaceSpan(this.f134659w), length, length2, this.f134640d);
                this.f134659w = null;
            }
            if (this.f134660x != null) {
                this.f134636I.setSpan(new AlignmentSpan.Standard(this.f134660x), length, length2, this.f134640d);
                this.f134660x = null;
            }
            boolean z = this.f134661y;
            if (z || this.f134628A || this.f134630C || this.f134632E) {
                if (z) {
                    this.f134636I.setSpan(new ImageSpan(this.f134637a, this.f134662z), length, length2, this.f134640d);
                    this.f134662z = null;
                    this.f134661y = false;
                } else if (this.f134628A) {
                    this.f134636I.setSpan(new ImageSpan(this.f134629B), length, length2, this.f134640d);
                    this.f134629B = null;
                    this.f134628A = false;
                } else {
                    boolean z2 = this.f134630C;
                    SpannableStringBuilder spannableStringBuilder = this.f134636I;
                    if (z2) {
                        spannableStringBuilder.setSpan(new ImageSpan(this.f134637a, this.f134631D), length, length2, this.f134640d);
                        this.f134631D = null;
                        this.f134630C = false;
                    } else {
                        spannableStringBuilder.setSpan(new ImageSpan(this.f134637a, this.f134633F), length, length2, this.f134640d);
                        this.f134633F = 0;
                        this.f134632E = false;
                    }
                }
            }
            ClickableSpan clickableSpan = this.f134634G;
            if (clickableSpan != null) {
                this.f134636I.setSpan(clickableSpan, length, length2, this.f134640d);
                this.f134634G = null;
            }
            if (this.f134635H != null) {
                this.f134636I.setSpan(new URLSpan(this.f134635H), length, length2, this.f134640d);
                this.f134635H = null;
            }
            this.f134640d = 33;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18503a m155392a(Context context, @NonNull CharSequence charSequence) {
        return new C18503a(context, charSequence);
    }
}
