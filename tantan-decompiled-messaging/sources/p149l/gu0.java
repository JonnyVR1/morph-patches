package p149l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class gu0 {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f104367a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f104368b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f104369c = null;

    /* JADX INFO: renamed from: d */
    public boolean f104370d = false;

    /* JADX INFO: renamed from: e */
    public boolean f104371e = false;

    /* JADX INFO: renamed from: f */
    public boolean f104372f;

    public gu0(CompoundButton compoundButton) {
        this.f104367a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public void m128014a() {
        Drawable drawableM108479a = cs5.m108479a(this.f104367a);
        if (drawableM108479a != null) {
            if (this.f104370d || this.f104371e) {
                Drawable drawableMutate = kbe.m145284r(drawableM108479a).mutate();
                if (this.f104370d) {
                    kbe.m145281o(drawableMutate, this.f104368b);
                }
                if (this.f104371e) {
                    kbe.m145282p(drawableMutate, this.f104369c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f104367a.getDrawableState());
                }
                this.f104367a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m128016c() {
        return this.f104368b;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m128017d() {
        return this.f104369c;
    }

    /* JADX INFO: renamed from: e */
    public void m128018e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        TypedArray typedArrayObtainStyledAttributes = this.f104367a.getContext().obtainStyledAttributes(attributeSet, aac0.f68364O0, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(aac0.f68374Q0) && (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(aac0.f68374Q0, 0)) != 0) {
                try {
                    CompoundButton compoundButton = this.f104367a;
                    compoundButton.setButtonDrawable(nu0.m161424b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArrayObtainStyledAttributes.hasValue(aac0.f68369P0)) {
                        CompoundButton compoundButton2 = this.f104367a;
                        compoundButton2.setButtonDrawable(nu0.m161424b(compoundButton2.getContext(), resourceId));
                    }
                }
            } else if (typedArrayObtainStyledAttributes.hasValue(aac0.f68369P0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(aac0.f68369P0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f104367a;
                compoundButton3.setButtonDrawable(nu0.m161424b(compoundButton3.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(aac0.f68379R0)) {
                cs5.m108481c(this.f104367a, typedArrayObtainStyledAttributes.getColorStateList(aac0.f68379R0));
            }
            if (typedArrayObtainStyledAttributes.hasValue(aac0.f68384S0)) {
                cs5.m108482d(this.f104367a, cce.m106048d(typedArrayObtainStyledAttributes.getInt(aac0.f68384S0, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m128019f() {
        if (this.f104372f) {
            this.f104372f = false;
        } else {
            this.f104372f = true;
            m128014a();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m128020g(ColorStateList colorStateList) {
        this.f104368b = colorStateList;
        this.f104370d = true;
        m128014a();
    }

    /* JADX INFO: renamed from: h */
    public void m128021h(@Nullable PorterDuff.Mode mode) {
        this.f104369c = mode;
        this.f104371e = true;
        m128014a();
    }

    /* JADX INFO: renamed from: b */
    public int m128015b(int i) {
        return i;
    }
}
