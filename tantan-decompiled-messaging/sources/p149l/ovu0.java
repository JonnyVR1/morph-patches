package p149l;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class ovu0 {

    /* JADX INFO: renamed from: A */
    public static final String f145853A;

    /* JADX INFO: renamed from: B */
    public static final String f145854B;

    /* JADX INFO: renamed from: C */
    public static final String f145855C;

    /* JADX INFO: renamed from: D */
    public static final String f145856D;

    /* JADX INFO: renamed from: E */
    public static final String f145857E;

    /* JADX INFO: renamed from: F */
    public static final String f145858F;

    /* JADX INFO: renamed from: G */
    public static final String f145859G;

    /* JADX INFO: renamed from: H */
    public static final String f145860H;

    /* JADX INFO: renamed from: I */
    public static final String f145861I;

    /* JADX INFO: renamed from: J */
    @Deprecated
    public static final g8y0 f145862J;

    /* JADX INFO: renamed from: p */
    @Deprecated
    public static final ovu0 f145863p;

    /* JADX INFO: renamed from: q */
    public static final String f145864q;

    /* JADX INFO: renamed from: r */
    public static final String f145865r;

    /* JADX INFO: renamed from: s */
    public static final String f145866s;

    /* JADX INFO: renamed from: t */
    public static final String f145867t;

    /* JADX INFO: renamed from: u */
    public static final String f145868u;

    /* JADX INFO: renamed from: v */
    public static final String f145869v;

    /* JADX INFO: renamed from: w */
    public static final String f145870w;

    /* JADX INFO: renamed from: x */
    public static final String f145871x;

    /* JADX INFO: renamed from: y */
    public static final String f145872y;

    /* JADX INFO: renamed from: z */
    public static final String f145873z;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final CharSequence f145874a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Layout.Alignment f145875b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Layout.Alignment f145876c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Bitmap f145877d;

    /* JADX INFO: renamed from: e */
    public final float f145878e;

    /* JADX INFO: renamed from: f */
    public final int f145879f;

    /* JADX INFO: renamed from: g */
    public final int f145880g;

    /* JADX INFO: renamed from: h */
    public final float f145881h;

    /* JADX INFO: renamed from: i */
    public final int f145882i;

    /* JADX INFO: renamed from: j */
    public final float f145883j;

    /* JADX INFO: renamed from: k */
    public final float f145884k;

    /* JADX INFO: renamed from: l */
    public final int f145885l;

    /* JADX INFO: renamed from: m */
    public final float f145886m;

    /* JADX INFO: renamed from: n */
    public final int f145887n;

    /* JADX INFO: renamed from: o */
    public final float f145888o;

    static {
        dtu0 dtu0Var = new dtu0();
        dtu0Var.m113594l("");
        f145863p = dtu0Var.m113598p();
        f145864q = Integer.toString(0, 36);
        f145865r = Integer.toString(17, 36);
        f145866s = Integer.toString(1, 36);
        f145867t = Integer.toString(2, 36);
        f145868u = Integer.toString(3, 36);
        f145869v = Integer.toString(18, 36);
        f145870w = Integer.toString(4, 36);
        f145871x = Integer.toString(5, 36);
        f145872y = Integer.toString(6, 36);
        f145873z = Integer.toString(7, 36);
        f145853A = Integer.toString(8, 36);
        f145854B = Integer.toString(9, 36);
        f145855C = Integer.toString(10, 36);
        f145856D = Integer.toString(11, 36);
        f145857E = Integer.toString(12, 36);
        f145858F = Integer.toString(13, 36);
        f145859G = Integer.toString(14, 36);
        f145860H = Integer.toString(15, 36);
        f145861I = Integer.toString(16, 36);
        f145862J = new g8y0() { // from class: l.spu0
        };
    }

    public /* synthetic */ ovu0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, iuu0 iuu0Var) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            f5v0.m119533d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f145874a = SpannedString.valueOf(charSequence);
        } else {
            this.f145874a = charSequence != null ? charSequence.toString() : null;
        }
        this.f145875b = alignment;
        this.f145876c = alignment2;
        this.f145877d = bitmap;
        this.f145878e = f;
        this.f145879f = i;
        this.f145880g = i2;
        this.f145881h = f2;
        this.f145882i = i3;
        this.f145883j = f4;
        this.f145884k = f5;
        this.f145885l = i4;
        this.f145886m = f3;
        this.f145887n = i6;
        this.f145888o = f6;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m166208a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f145874a;
        if (charSequence != null) {
            bundle.putCharSequence(f145864q, charSequence);
            CharSequence charSequence2 = this.f145874a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListM128914a = gzu0.m128914a((Spanned) charSequence2);
                if (!arrayListM128914a.isEmpty()) {
                    bundle.putParcelableArrayList(f145865r, arrayListM128914a);
                }
            }
        }
        bundle.putSerializable(f145866s, this.f145875b);
        bundle.putSerializable(f145867t, this.f145876c);
        bundle.putFloat(f145870w, this.f145878e);
        bundle.putInt(f145871x, this.f145879f);
        bundle.putInt(f145872y, this.f145880g);
        bundle.putFloat(f145873z, this.f145881h);
        bundle.putInt(f145853A, this.f145882i);
        bundle.putInt(f145854B, this.f145885l);
        bundle.putFloat(f145855C, this.f145886m);
        bundle.putFloat(f145856D, this.f145883j);
        bundle.putFloat(f145857E, this.f145884k);
        bundle.putBoolean(f145859G, false);
        bundle.putInt(f145858F, RoundedDrawable.DEFAULT_BORDER_COLOR);
        bundle.putInt(f145860H, this.f145887n);
        bundle.putFloat(f145861I, this.f145888o);
        if (this.f145877d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f5v0.m119535f(this.f145877d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f145869v, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final dtu0 m166209b() {
        return new dtu0(this, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ovu0.class == obj.getClass()) {
            ovu0 ovu0Var = (ovu0) obj;
            if (TextUtils.equals(this.f145874a, ovu0Var.f145874a) && this.f145875b == ovu0Var.f145875b && this.f145876c == ovu0Var.f145876c) {
                Bitmap bitmap = this.f145877d;
                Bitmap bitmap2 = ovu0Var.f145877d;
                if (bitmap != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) {
                    if (this.f145878e == ovu0Var.f145878e && this.f145879f == ovu0Var.f145879f && this.f145880g == ovu0Var.f145880g && this.f145881h == ovu0Var.f145881h && this.f145882i == ovu0Var.f145882i && this.f145883j == ovu0Var.f145883j && this.f145884k == ovu0Var.f145884k && this.f145885l == ovu0Var.f145885l && this.f145886m == ovu0Var.f145886m && this.f145887n == ovu0Var.f145887n && this.f145888o == ovu0Var.f145888o) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f145874a, this.f145875b, this.f145876c, this.f145877d, Float.valueOf(this.f145878e), Integer.valueOf(this.f145879f), Integer.valueOf(this.f145880g), Float.valueOf(this.f145881h), Integer.valueOf(this.f145882i), Float.valueOf(this.f145883j), Float.valueOf(this.f145884k), Boolean.FALSE, Integer.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR), Integer.valueOf(this.f145885l), Float.valueOf(this.f145886m), Integer.valueOf(this.f145887n), Float.valueOf(this.f145888o)});
    }
}
