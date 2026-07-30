package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.StyleableRes;
import l.b9c0;
import p003l.eqh0;
import p003l.hqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VButton extends CompoundButton {

    /* JADX INFO: renamed from: a */
    public boolean f12669a;

    /* JADX INFO: renamed from: b */
    public float f12670b;

    public VButton(Context context) {
        super(context);
        this.f12669a = false;
        this.f12670b = 0.0f;
        m11465c(context, null, 0);
    }

    /* JADX INFO: renamed from: c */
    private void m11465c(Context context, AttributeSet attributeSet, int i) {
        eqh0.m3922a(this, context, attributeSet, i);
        hqh0.m4994b(this, context, attributeSet, i);
        m11468d(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public void m11466a() {
        if (this.f12669a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            float fMeasureText = getPaint().measureText(getText().toString());
            float compoundDrawablePadding = getCompoundDrawablePadding();
            Drawable drawable = compoundDrawables[0];
            float fWidth = drawable == null ? 0.0f : drawable.getBounds().width() + compoundDrawablePadding;
            Drawable drawable2 = compoundDrawables[2];
            float width = (getWidth() - ((fMeasureText + fWidth) + (drawable2 != null ? drawable2.getBounds().width() + compoundDrawablePadding : 0.0f))) / 2.0f;
            float paddingLeft = width < ((float) getPaddingLeft()) ? getPaddingLeft() : width;
            if (width < getPaddingRight()) {
                width = getPaddingRight();
            }
            setPadding((int) paddingLeft, getPaddingTop(), (int) width, getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m11467b(TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        float dimension = typedArray.getDimension(i2, 0.0f);
        if (drawable == null) {
            return drawable;
        }
        if (dimension == 0.0f) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        int i3 = (int) dimension;
        drawableMutate.setBounds(0, 0, i3, i3);
        return drawableMutate;
    }

    /* JADX INFO: renamed from: d */
    public final void m11468d(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.l3);
            Drawable drawableM11467b = m11467b(typedArrayObtainStyledAttributes, b9c0.o3, b9c0.s3);
            Drawable drawableM11467b2 = m11467b(typedArrayObtainStyledAttributes, b9c0.p3, b9c0.t3);
            Drawable drawableM11467b3 = m11467b(typedArrayObtainStyledAttributes, b9c0.m3, b9c0.u3);
            Drawable drawableM11467b4 = m11467b(typedArrayObtainStyledAttributes, b9c0.n3, b9c0.q3);
            setCompoundDrawables(drawableM11467b, drawableM11467b3, drawableM11467b2, drawableM11467b4);
            if (drawableM11467b != null || drawableM11467b2 != null || drawableM11467b3 != null || drawableM11467b4 != null) {
                this.f12669a = typedArrayObtainStyledAttributes.getBoolean(b9c0.r3, false);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m11466a();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eqh0.m3923b(this, context, i);
    }

    public VButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12669a = false;
        this.f12670b = 0.0f;
        m11465c(context, attributeSet, 0);
    }

    public VButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12669a = false;
        this.f12670b = 0.0f;
        m11465c(context, attributeSet, i);
    }
}
