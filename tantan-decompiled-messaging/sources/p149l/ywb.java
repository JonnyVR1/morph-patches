package p149l;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import org.checkerframework.dataflow.qual.Pure;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ywb implements InterfaceC1863e {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final CharSequence f200431a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Layout.Alignment f200432b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Layout.Alignment f200433c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Bitmap f200434d;

    /* JADX INFO: renamed from: e */
    public final float f200435e;

    /* JADX INFO: renamed from: f */
    public final int f200436f;

    /* JADX INFO: renamed from: g */
    public final int f200437g;

    /* JADX INFO: renamed from: h */
    public final float f200438h;

    /* JADX INFO: renamed from: i */
    public final int f200439i;

    /* JADX INFO: renamed from: j */
    public final float f200440j;

    /* JADX INFO: renamed from: k */
    public final float f200441k;

    /* JADX INFO: renamed from: l */
    public final boolean f200442l;

    /* JADX INFO: renamed from: m */
    public final int f200443m;

    /* JADX INFO: renamed from: n */
    public final int f200444n;

    /* JADX INFO: renamed from: o */
    public final float f200445o;

    /* JADX INFO: renamed from: p */
    public final int f200446p;

    /* JADX INFO: renamed from: q */
    public final float f200447q;

    /* JADX INFO: renamed from: r */
    public static final ywb f200422r = new C21557b().m216325o("").m216311a();

    /* JADX INFO: renamed from: s */
    public static final String f200423s = vck0.m197903z0(0);

    /* JADX INFO: renamed from: t */
    public static final String f200424t = vck0.m197903z0(1);

    /* JADX INFO: renamed from: u */
    public static final String f200425u = vck0.m197903z0(2);

    /* JADX INFO: renamed from: v */
    public static final String f200426v = vck0.m197903z0(3);

    /* JADX INFO: renamed from: w */
    public static final String f200427w = vck0.m197903z0(4);

    /* JADX INFO: renamed from: x */
    public static final String f200428x = vck0.m197903z0(5);

    /* JADX INFO: renamed from: y */
    public static final String f200429y = vck0.m197903z0(6);

    /* JADX INFO: renamed from: z */
    public static final String f200430z = vck0.m197903z0(7);

    /* JADX INFO: renamed from: A */
    public static final String f200412A = vck0.m197903z0(8);

    /* JADX INFO: renamed from: B */
    public static final String f200413B = vck0.m197903z0(9);

    /* JADX INFO: renamed from: C */
    public static final String f200414C = vck0.m197903z0(10);

    /* JADX INFO: renamed from: D */
    public static final String f200415D = vck0.m197903z0(11);

    /* JADX INFO: renamed from: E */
    public static final String f200416E = vck0.m197903z0(12);

    /* JADX INFO: renamed from: F */
    public static final String f200417F = vck0.m197903z0(13);

    /* JADX INFO: renamed from: G */
    public static final String f200418G = vck0.m197903z0(14);

    /* JADX INFO: renamed from: H */
    public static final String f200419H = vck0.m197903z0(15);

    /* JADX INFO: renamed from: I */
    public static final String f200420I = vck0.m197903z0(16);

    /* JADX INFO: renamed from: J */
    public static final InterfaceC1863e.a<ywb> f200421J = new InterfaceC1863e.a() { // from class: l.xwb
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return ywb.m216309c(bundle);
        }
    };

    public ywb(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            p11.m167011e(bitmap);
        } else {
            p11.m167007a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f200431a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f200431a = charSequence.toString();
        } else {
            this.f200431a = null;
        }
        this.f200432b = alignment;
        this.f200433c = alignment2;
        this.f200434d = bitmap;
        this.f200435e = f;
        this.f200436f = i;
        this.f200437g = i2;
        this.f200438h = f2;
        this.f200439i = i3;
        this.f200440j = f4;
        this.f200441k = f5;
        this.f200442l = z;
        this.f200443m = i5;
        this.f200444n = i4;
        this.f200445o = f3;
        this.f200446p = i6;
        this.f200447q = f6;
    }

    /* JADX INFO: renamed from: c */
    public static final ywb m216309c(Bundle bundle) {
        C21557b c21557b = new C21557b();
        CharSequence charSequence = bundle.getCharSequence(f200423s);
        if (charSequence != null) {
            c21557b.m216325o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f200424t);
        if (alignment != null) {
            c21557b.m216326p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f200425u);
        if (alignment2 != null) {
            c21557b.m216320j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f200426v);
        if (bitmap != null) {
            c21557b.m216316f(bitmap);
        }
        String str = f200427w;
        if (bundle.containsKey(str)) {
            String str2 = f200428x;
            if (bundle.containsKey(str2)) {
                c21557b.m216318h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f200429y;
        if (bundle.containsKey(str3)) {
            c21557b.m216319i(bundle.getInt(str3));
        }
        String str4 = f200430z;
        if (bundle.containsKey(str4)) {
            c21557b.m216321k(bundle.getFloat(str4));
        }
        String str5 = f200412A;
        if (bundle.containsKey(str5)) {
            c21557b.m216322l(bundle.getInt(str5));
        }
        String str6 = f200414C;
        if (bundle.containsKey(str6)) {
            String str7 = f200413B;
            if (bundle.containsKey(str7)) {
                c21557b.m216327q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f200415D;
        if (bundle.containsKey(str8)) {
            c21557b.m216324n(bundle.getFloat(str8));
        }
        String str9 = f200416E;
        if (bundle.containsKey(str9)) {
            c21557b.m216317g(bundle.getFloat(str9));
        }
        String str10 = f200417F;
        if (bundle.containsKey(str10)) {
            c21557b.m216329s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f200418G, false)) {
            c21557b.m216312b();
        }
        String str11 = f200419H;
        if (bundle.containsKey(str11)) {
            c21557b.m216328r(bundle.getInt(str11));
        }
        String str12 = f200420I;
        if (bundle.containsKey(str12)) {
            c21557b.m216323m(bundle.getFloat(str12));
        }
        return c21557b.m216311a();
    }

    /* JADX INFO: renamed from: b */
    public C21557b m216310b() {
        return new C21557b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ywb.class == obj.getClass()) {
            ywb ywbVar = (ywb) obj;
            if (TextUtils.equals(this.f200431a, ywbVar.f200431a) && this.f200432b == ywbVar.f200432b && this.f200433c == ywbVar.f200433c) {
                Bitmap bitmap = this.f200434d;
                Bitmap bitmap2 = ywbVar.f200434d;
                if (bitmap != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) {
                    if (this.f200435e == ywbVar.f200435e && this.f200436f == ywbVar.f200436f && this.f200437g == ywbVar.f200437g && this.f200438h == ywbVar.f200438h && this.f200439i == ywbVar.f200439i && this.f200440j == ywbVar.f200440j && this.f200441k == ywbVar.f200441k && this.f200442l == ywbVar.f200442l && this.f200443m == ywbVar.f200443m && this.f200444n == ywbVar.f200444n && this.f200445o == ywbVar.f200445o && this.f200446p == ywbVar.f200446p && this.f200447q == ywbVar.f200447q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f200431a, this.f200432b, this.f200433c, this.f200434d, Float.valueOf(this.f200435e), Integer.valueOf(this.f200436f), Integer.valueOf(this.f200437g), Float.valueOf(this.f200438h), Integer.valueOf(this.f200439i), Float.valueOf(this.f200440j), Float.valueOf(this.f200441k), Boolean.valueOf(this.f200442l), Integer.valueOf(this.f200443m), Integer.valueOf(this.f200444n), Float.valueOf(this.f200445o), Integer.valueOf(this.f200446p), Float.valueOf(this.f200447q));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f200423s, this.f200431a);
        bundle.putSerializable(f200424t, this.f200432b);
        bundle.putSerializable(f200425u, this.f200433c);
        bundle.putParcelable(f200426v, this.f200434d);
        bundle.putFloat(f200427w, this.f200435e);
        bundle.putInt(f200428x, this.f200436f);
        bundle.putInt(f200429y, this.f200437g);
        bundle.putFloat(f200430z, this.f200438h);
        bundle.putInt(f200412A, this.f200439i);
        bundle.putInt(f200413B, this.f200444n);
        bundle.putFloat(f200414C, this.f200445o);
        bundle.putFloat(f200415D, this.f200440j);
        bundle.putFloat(f200416E, this.f200441k);
        bundle.putBoolean(f200418G, this.f200442l);
        bundle.putInt(f200417F, this.f200443m);
        bundle.putInt(f200419H, this.f200446p);
        bundle.putFloat(f200420I, this.f200447q);
        return bundle;
    }

    /* JADX INFO: renamed from: l.ywb$b */
    public static final class C21557b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public CharSequence f200448a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Bitmap f200449b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Layout.Alignment f200450c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Layout.Alignment f200451d;

        /* JADX INFO: renamed from: e */
        public float f200452e;

        /* JADX INFO: renamed from: f */
        public int f200453f;

        /* JADX INFO: renamed from: g */
        public int f200454g;

        /* JADX INFO: renamed from: h */
        public float f200455h;

        /* JADX INFO: renamed from: i */
        public int f200456i;

        /* JADX INFO: renamed from: j */
        public int f200457j;

        /* JADX INFO: renamed from: k */
        public float f200458k;

        /* JADX INFO: renamed from: l */
        public float f200459l;

        /* JADX INFO: renamed from: m */
        public float f200460m;

        /* JADX INFO: renamed from: n */
        public boolean f200461n;

        /* JADX INFO: renamed from: o */
        @ColorInt
        public int f200462o;

        /* JADX INFO: renamed from: p */
        public int f200463p;

        /* JADX INFO: renamed from: q */
        public float f200464q;

        public C21557b(ywb ywbVar) {
            this.f200448a = ywbVar.f200431a;
            this.f200449b = ywbVar.f200434d;
            this.f200450c = ywbVar.f200432b;
            this.f200451d = ywbVar.f200433c;
            this.f200452e = ywbVar.f200435e;
            this.f200453f = ywbVar.f200436f;
            this.f200454g = ywbVar.f200437g;
            this.f200455h = ywbVar.f200438h;
            this.f200456i = ywbVar.f200439i;
            this.f200457j = ywbVar.f200444n;
            this.f200458k = ywbVar.f200445o;
            this.f200459l = ywbVar.f200440j;
            this.f200460m = ywbVar.f200441k;
            this.f200461n = ywbVar.f200442l;
            this.f200462o = ywbVar.f200443m;
            this.f200463p = ywbVar.f200446p;
            this.f200464q = ywbVar.f200447q;
        }

        /* JADX INFO: renamed from: a */
        public ywb m216311a() {
            return new ywb(this.f200448a, this.f200450c, this.f200451d, this.f200449b, this.f200452e, this.f200453f, this.f200454g, this.f200455h, this.f200456i, this.f200457j, this.f200458k, this.f200459l, this.f200460m, this.f200461n, this.f200462o, this.f200463p, this.f200464q);
        }

        /* JADX INFO: renamed from: b */
        public C21557b m216312b() {
            this.f200461n = false;
            return this;
        }

        @Pure
        /* JADX INFO: renamed from: c */
        public int m216313c() {
            return this.f200454g;
        }

        @Pure
        /* JADX INFO: renamed from: d */
        public int m216314d() {
            return this.f200456i;
        }

        @Nullable
        @Pure
        /* JADX INFO: renamed from: e */
        public CharSequence m216315e() {
            return this.f200448a;
        }

        /* JADX INFO: renamed from: f */
        public C21557b m216316f(Bitmap bitmap) {
            this.f200449b = bitmap;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C21557b m216317g(float f) {
            this.f200460m = f;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C21557b m216318h(float f, int i) {
            this.f200452e = f;
            this.f200453f = i;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C21557b m216319i(int i) {
            this.f200454g = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C21557b m216320j(@Nullable Layout.Alignment alignment) {
            this.f200451d = alignment;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C21557b m216321k(float f) {
            this.f200455h = f;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C21557b m216322l(int i) {
            this.f200456i = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C21557b m216323m(float f) {
            this.f200464q = f;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C21557b m216324n(float f) {
            this.f200459l = f;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C21557b m216325o(CharSequence charSequence) {
            this.f200448a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C21557b m216326p(@Nullable Layout.Alignment alignment) {
            this.f200450c = alignment;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C21557b m216327q(float f, int i) {
            this.f200458k = f;
            this.f200457j = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C21557b m216328r(int i) {
            this.f200463p = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C21557b m216329s(@ColorInt int i) {
            this.f200462o = i;
            this.f200461n = true;
            return this;
        }

        public C21557b() {
            this.f200448a = null;
            this.f200449b = null;
            this.f200450c = null;
            this.f200451d = null;
            this.f200452e = -3.4028235E38f;
            this.f200453f = Integer.MIN_VALUE;
            this.f200454g = Integer.MIN_VALUE;
            this.f200455h = -3.4028235E38f;
            this.f200456i = Integer.MIN_VALUE;
            this.f200457j = Integer.MIN_VALUE;
            this.f200458k = -3.4028235E38f;
            this.f200459l = -3.4028235E38f;
            this.f200460m = -3.4028235E38f;
            this.f200461n = false;
            this.f200462o = RoundedDrawable.DEFAULT_BORDER_COLOR;
            this.f200463p = Integer.MIN_VALUE;
        }
    }
}
