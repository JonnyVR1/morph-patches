package p153l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class t0j0 {

    /* JADX INFO: renamed from: a */
    public final Context f171536a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f171537b;

    /* JADX INFO: renamed from: c */
    public TypedValue f171538c;

    public t0j0(Context context, TypedArray typedArray) {
        this.f171536a = context;
        this.f171537b = typedArray;
    }

    /* JADX INFO: renamed from: s */
    public static t0j0 m188780s(Context context, int i, int[] iArr) {
        return new t0j0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* JADX INFO: renamed from: t */
    public static t0j0 m188781t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t0j0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: u */
    public static t0j0 m188782u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new t0j0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public boolean m188783a(int i, boolean z) {
        return this.f171537b.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: b */
    public int m188784b(int i, int i2) {
        return this.f171537b.getColor(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m188785c(int i) {
        int resourceId;
        ColorStateList colorStateListM192701a;
        return (!this.f171537b.hasValue(i) || (resourceId = this.f171537b.getResourceId(i, 0)) == 0 || (colorStateListM192701a = tu0.m192701a(this.f171536a, resourceId)) == null) ? this.f171537b.getColorStateList(i) : colorStateListM192701a;
    }

    /* JADX INFO: renamed from: d */
    public float m188786d(int i, float f) {
        return this.f171537b.getDimension(i, f);
    }

    /* JADX INFO: renamed from: e */
    public int m188787e(int i, int i2) {
        return this.f171537b.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: f */
    public int m188788f(int i, int i2) {
        return this.f171537b.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: g */
    public Drawable m188789g(int i) {
        int resourceId;
        return (!this.f171537b.hasValue(i) || (resourceId = this.f171537b.getResourceId(i, 0)) == 0) ? this.f171537b.getDrawable(i) : tu0.m192702b(this.f171536a, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m188790h(int i) {
        int resourceId;
        if (!this.f171537b.hasValue(i) || (resourceId = this.f171537b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return ou0.m169198b().m169203d(this.f171536a, resourceId, true);
    }

    /* JADX INFO: renamed from: i */
    public float m188791i(int i, float f) {
        return this.f171537b.getFloat(i, f);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public Typeface m188792j(@StyleableRes int i, int i2, @Nullable c5d0.AbstractC16196e abstractC16196e) {
        int resourceId = this.f171537b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f171538c == null) {
            this.f171538c = new TypedValue();
        }
        return c5d0.m108037g(this.f171536a, resourceId, this.f171538c, i2, abstractC16196e);
    }

    /* JADX INFO: renamed from: k */
    public int m188793k(int i, int i2) {
        return this.f171537b.getInt(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public int m188794l(int i, int i2) {
        return this.f171537b.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public int m188795m(int i, int i2) {
        return this.f171537b.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public int m188796n(int i, int i2) {
        return this.f171537b.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public String m188797o(int i) {
        return this.f171537b.getString(i);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m188798p(int i) {
        return this.f171537b.getText(i);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence[] m188799q(int i) {
        return this.f171537b.getTextArray(i);
    }

    /* JADX INFO: renamed from: r */
    public boolean m188800r(int i) {
        return this.f171537b.hasValue(i);
    }

    /* JADX INFO: renamed from: v */
    public void m188801v() {
        this.f171537b.recycle();
    }
}
