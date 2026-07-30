package p153l;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import org.checkerframework.dataflow.qual.Pure;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class myb implements InterfaceC1886e {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final CharSequence f139367a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Layout.Alignment f139368b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Layout.Alignment f139369c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Bitmap f139370d;

    /* JADX INFO: renamed from: e */
    public final float f139371e;

    /* JADX INFO: renamed from: f */
    public final int f139372f;

    /* JADX INFO: renamed from: g */
    public final int f139373g;

    /* JADX INFO: renamed from: h */
    public final float f139374h;

    /* JADX INFO: renamed from: i */
    public final int f139375i;

    /* JADX INFO: renamed from: j */
    public final float f139376j;

    /* JADX INFO: renamed from: k */
    public final float f139377k;

    /* JADX INFO: renamed from: l */
    public final boolean f139378l;

    /* JADX INFO: renamed from: m */
    public final int f139379m;

    /* JADX INFO: renamed from: n */
    public final int f139380n;

    /* JADX INFO: renamed from: o */
    public final float f139381o;

    /* JADX INFO: renamed from: p */
    public final int f139382p;

    /* JADX INFO: renamed from: q */
    public final float f139383q;

    /* JADX INFO: renamed from: r */
    public static final myb f139358r = new C18746b().m160768o("").m160754a();

    /* JADX INFO: renamed from: s */
    public static final String f139359s = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: t */
    public static final String f139360t = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: u */
    public static final String f139361u = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: v */
    public static final String f139362v = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: w */
    public static final String f139363w = bmk0.m105181z0(4);

    /* JADX INFO: renamed from: x */
    public static final String f139364x = bmk0.m105181z0(5);

    /* JADX INFO: renamed from: y */
    public static final String f139365y = bmk0.m105181z0(6);

    /* JADX INFO: renamed from: z */
    public static final String f139366z = bmk0.m105181z0(7);

    /* JADX INFO: renamed from: A */
    public static final String f139348A = bmk0.m105181z0(8);

    /* JADX INFO: renamed from: B */
    public static final String f139349B = bmk0.m105181z0(9);

    /* JADX INFO: renamed from: C */
    public static final String f139350C = bmk0.m105181z0(10);

    /* JADX INFO: renamed from: D */
    public static final String f139351D = bmk0.m105181z0(11);

    /* JADX INFO: renamed from: E */
    public static final String f139352E = bmk0.m105181z0(12);

    /* JADX INFO: renamed from: F */
    public static final String f139353F = bmk0.m105181z0(13);

    /* JADX INFO: renamed from: G */
    public static final String f139354G = bmk0.m105181z0(14);

    /* JADX INFO: renamed from: H */
    public static final String f139355H = bmk0.m105181z0(15);

    /* JADX INFO: renamed from: I */
    public static final String f139356I = bmk0.m105181z0(16);

    /* JADX INFO: renamed from: J */
    public static final InterfaceC1886e.a<myb> f139357J = new InterfaceC1886e.a() { // from class: l.lyb
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return myb.m160752c(bundle);
        }
    };

    public myb(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            w11.m204369e(bitmap);
        } else {
            w11.m204365a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f139367a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f139367a = charSequence.toString();
        } else {
            this.f139367a = null;
        }
        this.f139368b = alignment;
        this.f139369c = alignment2;
        this.f139370d = bitmap;
        this.f139371e = f;
        this.f139372f = i;
        this.f139373g = i2;
        this.f139374h = f2;
        this.f139375i = i3;
        this.f139376j = f4;
        this.f139377k = f5;
        this.f139378l = z;
        this.f139379m = i5;
        this.f139380n = i4;
        this.f139381o = f3;
        this.f139382p = i6;
        this.f139383q = f6;
    }

    /* JADX INFO: renamed from: c */
    public static final myb m160752c(Bundle bundle) {
        C18746b c18746b = new C18746b();
        CharSequence charSequence = bundle.getCharSequence(f139359s);
        if (charSequence != null) {
            c18746b.m160768o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f139360t);
        if (alignment != null) {
            c18746b.m160769p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f139361u);
        if (alignment2 != null) {
            c18746b.m160763j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f139362v);
        if (bitmap != null) {
            c18746b.m160759f(bitmap);
        }
        String str = f139363w;
        if (bundle.containsKey(str)) {
            String str2 = f139364x;
            if (bundle.containsKey(str2)) {
                c18746b.m160761h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f139365y;
        if (bundle.containsKey(str3)) {
            c18746b.m160762i(bundle.getInt(str3));
        }
        String str4 = f139366z;
        if (bundle.containsKey(str4)) {
            c18746b.m160764k(bundle.getFloat(str4));
        }
        String str5 = f139348A;
        if (bundle.containsKey(str5)) {
            c18746b.m160765l(bundle.getInt(str5));
        }
        String str6 = f139350C;
        if (bundle.containsKey(str6)) {
            String str7 = f139349B;
            if (bundle.containsKey(str7)) {
                c18746b.m160770q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f139351D;
        if (bundle.containsKey(str8)) {
            c18746b.m160767n(bundle.getFloat(str8));
        }
        String str9 = f139352E;
        if (bundle.containsKey(str9)) {
            c18746b.m160760g(bundle.getFloat(str9));
        }
        String str10 = f139353F;
        if (bundle.containsKey(str10)) {
            c18746b.m160772s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f139354G, false)) {
            c18746b.m160755b();
        }
        String str11 = f139355H;
        if (bundle.containsKey(str11)) {
            c18746b.m160771r(bundle.getInt(str11));
        }
        String str12 = f139356I;
        if (bundle.containsKey(str12)) {
            c18746b.m160766m(bundle.getFloat(str12));
        }
        return c18746b.m160754a();
    }

    /* JADX INFO: renamed from: b */
    public C18746b m160753b() {
        return new C18746b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && myb.class == obj.getClass()) {
            myb mybVar = (myb) obj;
            if (TextUtils.equals(this.f139367a, mybVar.f139367a) && this.f139368b == mybVar.f139368b && this.f139369c == mybVar.f139369c) {
                Bitmap bitmap = this.f139370d;
                Bitmap bitmap2 = mybVar.f139370d;
                if (bitmap != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) {
                    if (this.f139371e == mybVar.f139371e && this.f139372f == mybVar.f139372f && this.f139373g == mybVar.f139373g && this.f139374h == mybVar.f139374h && this.f139375i == mybVar.f139375i && this.f139376j == mybVar.f139376j && this.f139377k == mybVar.f139377k && this.f139378l == mybVar.f139378l && this.f139379m == mybVar.f139379m && this.f139380n == mybVar.f139380n && this.f139381o == mybVar.f139381o && this.f139382p == mybVar.f139382p && this.f139383q == mybVar.f139383q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f139367a, this.f139368b, this.f139369c, this.f139370d, Float.valueOf(this.f139371e), Integer.valueOf(this.f139372f), Integer.valueOf(this.f139373g), Float.valueOf(this.f139374h), Integer.valueOf(this.f139375i), Float.valueOf(this.f139376j), Float.valueOf(this.f139377k), Boolean.valueOf(this.f139378l), Integer.valueOf(this.f139379m), Integer.valueOf(this.f139380n), Float.valueOf(this.f139381o), Integer.valueOf(this.f139382p), Float.valueOf(this.f139383q));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f139359s, this.f139367a);
        bundle.putSerializable(f139360t, this.f139368b);
        bundle.putSerializable(f139361u, this.f139369c);
        bundle.putParcelable(f139362v, this.f139370d);
        bundle.putFloat(f139363w, this.f139371e);
        bundle.putInt(f139364x, this.f139372f);
        bundle.putInt(f139365y, this.f139373g);
        bundle.putFloat(f139366z, this.f139374h);
        bundle.putInt(f139348A, this.f139375i);
        bundle.putInt(f139349B, this.f139380n);
        bundle.putFloat(f139350C, this.f139381o);
        bundle.putFloat(f139351D, this.f139376j);
        bundle.putFloat(f139352E, this.f139377k);
        bundle.putBoolean(f139354G, this.f139378l);
        bundle.putInt(f139353F, this.f139379m);
        bundle.putInt(f139355H, this.f139382p);
        bundle.putFloat(f139356I, this.f139383q);
        return bundle;
    }

    /* JADX INFO: renamed from: l.myb$b */
    public static final class C18746b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public CharSequence f139384a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Bitmap f139385b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Layout.Alignment f139386c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Layout.Alignment f139387d;

        /* JADX INFO: renamed from: e */
        public float f139388e;

        /* JADX INFO: renamed from: f */
        public int f139389f;

        /* JADX INFO: renamed from: g */
        public int f139390g;

        /* JADX INFO: renamed from: h */
        public float f139391h;

        /* JADX INFO: renamed from: i */
        public int f139392i;

        /* JADX INFO: renamed from: j */
        public int f139393j;

        /* JADX INFO: renamed from: k */
        public float f139394k;

        /* JADX INFO: renamed from: l */
        public float f139395l;

        /* JADX INFO: renamed from: m */
        public float f139396m;

        /* JADX INFO: renamed from: n */
        public boolean f139397n;

        /* JADX INFO: renamed from: o */
        @ColorInt
        public int f139398o;

        /* JADX INFO: renamed from: p */
        public int f139399p;

        /* JADX INFO: renamed from: q */
        public float f139400q;

        public C18746b(myb mybVar) {
            this.f139384a = mybVar.f139367a;
            this.f139385b = mybVar.f139370d;
            this.f139386c = mybVar.f139368b;
            this.f139387d = mybVar.f139369c;
            this.f139388e = mybVar.f139371e;
            this.f139389f = mybVar.f139372f;
            this.f139390g = mybVar.f139373g;
            this.f139391h = mybVar.f139374h;
            this.f139392i = mybVar.f139375i;
            this.f139393j = mybVar.f139380n;
            this.f139394k = mybVar.f139381o;
            this.f139395l = mybVar.f139376j;
            this.f139396m = mybVar.f139377k;
            this.f139397n = mybVar.f139378l;
            this.f139398o = mybVar.f139379m;
            this.f139399p = mybVar.f139382p;
            this.f139400q = mybVar.f139383q;
        }

        /* JADX INFO: renamed from: a */
        public myb m160754a() {
            return new myb(this.f139384a, this.f139386c, this.f139387d, this.f139385b, this.f139388e, this.f139389f, this.f139390g, this.f139391h, this.f139392i, this.f139393j, this.f139394k, this.f139395l, this.f139396m, this.f139397n, this.f139398o, this.f139399p, this.f139400q);
        }

        /* JADX INFO: renamed from: b */
        public C18746b m160755b() {
            this.f139397n = false;
            return this;
        }

        @Pure
        /* JADX INFO: renamed from: c */
        public int m160756c() {
            return this.f139390g;
        }

        @Pure
        /* JADX INFO: renamed from: d */
        public int m160757d() {
            return this.f139392i;
        }

        @Nullable
        @Pure
        /* JADX INFO: renamed from: e */
        public CharSequence m160758e() {
            return this.f139384a;
        }

        /* JADX INFO: renamed from: f */
        public C18746b m160759f(Bitmap bitmap) {
            this.f139385b = bitmap;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C18746b m160760g(float f) {
            this.f139396m = f;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C18746b m160761h(float f, int i) {
            this.f139388e = f;
            this.f139389f = i;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C18746b m160762i(int i) {
            this.f139390g = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C18746b m160763j(@Nullable Layout.Alignment alignment) {
            this.f139387d = alignment;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C18746b m160764k(float f) {
            this.f139391h = f;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C18746b m160765l(int i) {
            this.f139392i = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C18746b m160766m(float f) {
            this.f139400q = f;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18746b m160767n(float f) {
            this.f139395l = f;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18746b m160768o(CharSequence charSequence) {
            this.f139384a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18746b m160769p(@Nullable Layout.Alignment alignment) {
            this.f139386c = alignment;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18746b m160770q(float f, int i) {
            this.f139394k = f;
            this.f139393j = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18746b m160771r(int i) {
            this.f139399p = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18746b m160772s(@ColorInt int i) {
            this.f139398o = i;
            this.f139397n = true;
            return this;
        }

        public C18746b() {
            this.f139384a = null;
            this.f139385b = null;
            this.f139386c = null;
            this.f139387d = null;
            this.f139388e = -3.4028235E38f;
            this.f139389f = Integer.MIN_VALUE;
            this.f139390g = Integer.MIN_VALUE;
            this.f139391h = -3.4028235E38f;
            this.f139392i = Integer.MIN_VALUE;
            this.f139393j = Integer.MIN_VALUE;
            this.f139394k = -3.4028235E38f;
            this.f139395l = -3.4028235E38f;
            this.f139396m = -3.4028235E38f;
            this.f139397n = false;
            this.f139398o = RoundedDrawable.DEFAULT_BORDER_COLOR;
            this.f139399p = Integer.MIN_VALUE;
        }
    }
}
