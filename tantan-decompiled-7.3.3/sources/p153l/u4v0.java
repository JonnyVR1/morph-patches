package p153l;

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
public final class u4v0 {

    /* JADX INFO: renamed from: A */
    public static final String f177510A;

    /* JADX INFO: renamed from: B */
    public static final String f177511B;

    /* JADX INFO: renamed from: C */
    public static final String f177512C;

    /* JADX INFO: renamed from: D */
    public static final String f177513D;

    /* JADX INFO: renamed from: E */
    public static final String f177514E;

    /* JADX INFO: renamed from: F */
    public static final String f177515F;

    /* JADX INFO: renamed from: G */
    public static final String f177516G;

    /* JADX INFO: renamed from: H */
    public static final String f177517H;

    /* JADX INFO: renamed from: I */
    public static final String f177518I;

    /* JADX INFO: renamed from: J */
    @Deprecated
    public static final mhy0 f177519J;

    /* JADX INFO: renamed from: p */
    @Deprecated
    public static final u4v0 f177520p;

    /* JADX INFO: renamed from: q */
    public static final String f177521q;

    /* JADX INFO: renamed from: r */
    public static final String f177522r;

    /* JADX INFO: renamed from: s */
    public static final String f177523s;

    /* JADX INFO: renamed from: t */
    public static final String f177524t;

    /* JADX INFO: renamed from: u */
    public static final String f177525u;

    /* JADX INFO: renamed from: v */
    public static final String f177526v;

    /* JADX INFO: renamed from: w */
    public static final String f177527w;

    /* JADX INFO: renamed from: x */
    public static final String f177528x;

    /* JADX INFO: renamed from: y */
    public static final String f177529y;

    /* JADX INFO: renamed from: z */
    public static final String f177530z;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final CharSequence f177531a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Layout.Alignment f177532b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Layout.Alignment f177533c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Bitmap f177534d;

    /* JADX INFO: renamed from: e */
    public final float f177535e;

    /* JADX INFO: renamed from: f */
    public final int f177536f;

    /* JADX INFO: renamed from: g */
    public final int f177537g;

    /* JADX INFO: renamed from: h */
    public final float f177538h;

    /* JADX INFO: renamed from: i */
    public final int f177539i;

    /* JADX INFO: renamed from: j */
    public final float f177540j;

    /* JADX INFO: renamed from: k */
    public final float f177541k;

    /* JADX INFO: renamed from: l */
    public final int f177542l;

    /* JADX INFO: renamed from: m */
    public final float f177543m;

    /* JADX INFO: renamed from: n */
    public final int f177544n;

    /* JADX INFO: renamed from: o */
    public final float f177545o;

    static {
        j2v0 j2v0Var = new j2v0();
        j2v0Var.m143277l("");
        f177520p = j2v0Var.m143281p();
        f177521q = Integer.toString(0, 36);
        f177522r = Integer.toString(17, 36);
        f177523s = Integer.toString(1, 36);
        f177524t = Integer.toString(2, 36);
        f177525u = Integer.toString(3, 36);
        f177526v = Integer.toString(18, 36);
        f177527w = Integer.toString(4, 36);
        f177528x = Integer.toString(5, 36);
        f177529y = Integer.toString(6, 36);
        f177530z = Integer.toString(7, 36);
        f177510A = Integer.toString(8, 36);
        f177511B = Integer.toString(9, 36);
        f177512C = Integer.toString(10, 36);
        f177513D = Integer.toString(11, 36);
        f177514E = Integer.toString(12, 36);
        f177515F = Integer.toString(13, 36);
        f177516G = Integer.toString(14, 36);
        f177517H = Integer.toString(15, 36);
        f177518I = Integer.toString(16, 36);
        f177519J = new mhy0() { // from class: l.yyu0
        };
    }

    public /* synthetic */ u4v0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, o3v0 o3v0Var) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            lev0.m153956d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f177531a = SpannedString.valueOf(charSequence);
        } else {
            this.f177531a = charSequence != null ? charSequence.toString() : null;
        }
        this.f177532b = alignment;
        this.f177533c = alignment2;
        this.f177534d = bitmap;
        this.f177535e = f;
        this.f177536f = i;
        this.f177537g = i2;
        this.f177538h = f2;
        this.f177539i = i3;
        this.f177540j = f4;
        this.f177541k = f5;
        this.f177542l = i4;
        this.f177543m = f3;
        this.f177544n = i6;
        this.f177545o = f6;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m194499a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f177531a;
        if (charSequence != null) {
            bundle.putCharSequence(f177521q, charSequence);
            CharSequence charSequence2 = this.f177531a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListM157518a = m8v0.m157518a((Spanned) charSequence2);
                if (!arrayListM157518a.isEmpty()) {
                    bundle.putParcelableArrayList(f177522r, arrayListM157518a);
                }
            }
        }
        bundle.putSerializable(f177523s, this.f177532b);
        bundle.putSerializable(f177524t, this.f177533c);
        bundle.putFloat(f177527w, this.f177535e);
        bundle.putInt(f177528x, this.f177536f);
        bundle.putInt(f177529y, this.f177537g);
        bundle.putFloat(f177530z, this.f177538h);
        bundle.putInt(f177510A, this.f177539i);
        bundle.putInt(f177511B, this.f177542l);
        bundle.putFloat(f177512C, this.f177543m);
        bundle.putFloat(f177513D, this.f177540j);
        bundle.putFloat(f177514E, this.f177541k);
        bundle.putBoolean(f177516G, false);
        bundle.putInt(f177515F, RoundedDrawable.DEFAULT_BORDER_COLOR);
        bundle.putInt(f177517H, this.f177544n);
        bundle.putFloat(f177518I, this.f177545o);
        if (this.f177534d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            lev0.m153958f(this.f177534d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f177526v, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final j2v0 m194500b() {
        return new j2v0(this, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u4v0.class == obj.getClass()) {
            u4v0 u4v0Var = (u4v0) obj;
            if (TextUtils.equals(this.f177531a, u4v0Var.f177531a) && this.f177532b == u4v0Var.f177532b && this.f177533c == u4v0Var.f177533c) {
                Bitmap bitmap = this.f177534d;
                Bitmap bitmap2 = u4v0Var.f177534d;
                if (bitmap != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) {
                    if (this.f177535e == u4v0Var.f177535e && this.f177536f == u4v0Var.f177536f && this.f177537g == u4v0Var.f177537g && this.f177538h == u4v0Var.f177538h && this.f177539i == u4v0Var.f177539i && this.f177540j == u4v0Var.f177540j && this.f177541k == u4v0Var.f177541k && this.f177542l == u4v0Var.f177542l && this.f177543m == u4v0Var.f177543m && this.f177544n == u4v0Var.f177544n && this.f177545o == u4v0Var.f177545o) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f177531a, this.f177532b, this.f177533c, this.f177534d, Float.valueOf(this.f177535e), Integer.valueOf(this.f177536f), Integer.valueOf(this.f177537g), Float.valueOf(this.f177538h), Integer.valueOf(this.f177539i), Float.valueOf(this.f177540j), Float.valueOf(this.f177541k), Boolean.FALSE, Integer.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR), Integer.valueOf(this.f177542l), Float.valueOf(this.f177543m), Integer.valueOf(this.f177544n), Float.valueOf(this.f177545o)});
    }
}
