package p153l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class mu0 {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f138707a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f138708b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f138709c = null;

    /* JADX INFO: renamed from: d */
    public boolean f138710d = false;

    /* JADX INFO: renamed from: e */
    public boolean f138711e = false;

    /* JADX INFO: renamed from: f */
    public boolean f138712f;

    public mu0(CompoundButton compoundButton) {
        this.f138707a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public void m160056a() {
        Drawable drawableM132201a = gt5.m132201a(this.f138707a);
        if (drawableM132201a != null) {
            if (this.f138710d || this.f138711e) {
                Drawable drawableMutate = oce.m167178r(drawableM132201a).mutate();
                if (this.f138710d) {
                    oce.m167175o(drawableMutate, this.f138708b);
                }
                if (this.f138711e) {
                    oce.m167176p(drawableMutate, this.f138709c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f138707a.getDrawableState());
                }
                this.f138707a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m160058c() {
        return this.f138708b;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m160059d() {
        return this.f138709c;
    }

    /* JADX INFO: renamed from: e */
    public void m160060e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        TypedArray typedArrayObtainStyledAttributes = this.f138707a.getContext().obtainStyledAttributes(attributeSet, gic0.f104290O0, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(gic0.f104300Q0) && (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(gic0.f104300Q0, 0)) != 0) {
                try {
                    CompoundButton compoundButton = this.f138707a;
                    compoundButton.setButtonDrawable(tu0.m192702b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArrayObtainStyledAttributes.hasValue(gic0.f104295P0)) {
                        CompoundButton compoundButton2 = this.f138707a;
                        compoundButton2.setButtonDrawable(tu0.m192702b(compoundButton2.getContext(), resourceId));
                    }
                }
            } else if (typedArrayObtainStyledAttributes.hasValue(gic0.f104295P0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(gic0.f104295P0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f138707a;
                compoundButton3.setButtonDrawable(tu0.m192702b(compoundButton3.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(gic0.f104305R0)) {
                gt5.m132203c(this.f138707a, typedArrayObtainStyledAttributes.getColorStateList(gic0.f104305R0));
            }
            if (typedArrayObtainStyledAttributes.hasValue(gic0.f104310S0)) {
                gt5.m132204d(this.f138707a, gde.m129924d(typedArrayObtainStyledAttributes.getInt(gic0.f104310S0, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m160061f() {
        if (this.f138712f) {
            this.f138712f = false;
        } else {
            this.f138712f = true;
            m160056a();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m160062g(ColorStateList colorStateList) {
        this.f138708b = colorStateList;
        this.f138710d = true;
        m160056a();
    }

    /* JADX INFO: renamed from: h */
    public void m160063h(@Nullable PorterDuff.Mode mode) {
        this.f138709c = mode;
        this.f138711e = true;
        m160056a();
    }

    /* JADX INFO: renamed from: b */
    public int m160057b(int i) {
        return i;
    }
}
