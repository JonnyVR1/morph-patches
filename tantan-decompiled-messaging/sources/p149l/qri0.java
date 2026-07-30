package p149l;

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
public class qri0 {

    /* JADX INFO: renamed from: a */
    public final Context f155991a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f155992b;

    /* JADX INFO: renamed from: c */
    public TypedValue f155993c;

    public qri0(Context context, TypedArray typedArray) {
        this.f155991a = context;
        this.f155992b = typedArray;
    }

    /* JADX INFO: renamed from: s */
    public static qri0 m175991s(Context context, int i, int[] iArr) {
        return new qri0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* JADX INFO: renamed from: t */
    public static qri0 m175992t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new qri0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: u */
    public static qri0 m175993u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new qri0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public boolean m175994a(int i, boolean z) {
        return this.f155992b.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: b */
    public int m175995b(int i, int i2) {
        return this.f155992b.getColor(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m175996c(int i) {
        int resourceId;
        ColorStateList colorStateListM161423a;
        return (!this.f155992b.hasValue(i) || (resourceId = this.f155992b.getResourceId(i, 0)) == 0 || (colorStateListM161423a = nu0.m161423a(this.f155991a, resourceId)) == null) ? this.f155992b.getColorStateList(i) : colorStateListM161423a;
    }

    /* JADX INFO: renamed from: d */
    public float m175997d(int i, float f) {
        return this.f155992b.getDimension(i, f);
    }

    /* JADX INFO: renamed from: e */
    public int m175998e(int i, int i2) {
        return this.f155992b.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: f */
    public int m175999f(int i, int i2) {
        return this.f155992b.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: g */
    public Drawable m176000g(int i) {
        int resourceId;
        return (!this.f155992b.hasValue(i) || (resourceId = this.f155992b.getResourceId(i, 0)) == 0) ? this.f155992b.getDrawable(i) : nu0.m161424b(this.f155991a, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m176001h(int i) {
        int resourceId;
        if (!this.f155992b.hasValue(i) || (resourceId = this.f155992b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return iu0.m138315b().m138320d(this.f155991a, resourceId, true);
    }

    /* JADX INFO: renamed from: i */
    public float m176002i(int i, float f) {
        return this.f155992b.getFloat(i, f);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public Typeface m176003j(@StyleableRes int i, int i2, @Nullable ywc0.AbstractC21562e abstractC21562e) {
        int resourceId = this.f155992b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f155993c == null) {
            this.f155993c = new TypedValue();
        }
        return ywc0.m216336g(this.f155991a, resourceId, this.f155993c, i2, abstractC21562e);
    }

    /* JADX INFO: renamed from: k */
    public int m176004k(int i, int i2) {
        return this.f155992b.getInt(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public int m176005l(int i, int i2) {
        return this.f155992b.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public int m176006m(int i, int i2) {
        return this.f155992b.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public int m176007n(int i, int i2) {
        return this.f155992b.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public String m176008o(int i) {
        return this.f155992b.getString(i);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m176009p(int i) {
        return this.f155992b.getText(i);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence[] m176010q(int i) {
        return this.f155992b.getTextArray(i);
    }

    /* JADX INFO: renamed from: r */
    public boolean m176011r(int i) {
        return this.f155992b.hasValue(i);
    }

    /* JADX INFO: renamed from: v */
    public void m176012v() {
        this.f155992b.recycle();
    }
}
