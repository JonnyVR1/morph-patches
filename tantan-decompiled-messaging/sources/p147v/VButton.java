package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.StyleableRes;
import p149l.b9c0;
import p149l.eqh0;
import p149l.hqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VButton extends CompoundButton {

    /* JADX INFO: renamed from: a */
    public boolean f209044a;

    /* JADX INFO: renamed from: b */
    public float f209045b;

    public VButton(Context context) {
        super(context);
        this.f209044a = false;
        this.f209045b = 0.0f;
        m222992c(context, null, 0);
    }

    /* JADX INFO: renamed from: c */
    private void m222992c(Context context, AttributeSet attributeSet, int i) {
        eqh0.m117750a(this, context, attributeSet, i);
        hqh0.m132454b(this, context, attributeSet, i);
        m222995d(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public void m222993a() {
        if (this.f209044a) {
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
    public final Drawable m222994b(TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
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
    public final void m222995d(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f74466l3);
            Drawable drawableM222994b = m222994b(typedArrayObtainStyledAttributes, b9c0.f74487o3, b9c0.f74515s3);
            Drawable drawableM222994b2 = m222994b(typedArrayObtainStyledAttributes, b9c0.f74494p3, b9c0.f74522t3);
            Drawable drawableM222994b3 = m222994b(typedArrayObtainStyledAttributes, b9c0.f74473m3, b9c0.f74529u3);
            Drawable drawableM222994b4 = m222994b(typedArrayObtainStyledAttributes, b9c0.f74480n3, b9c0.f74501q3);
            setCompoundDrawables(drawableM222994b, drawableM222994b3, drawableM222994b2, drawableM222994b4);
            if (drawableM222994b != null || drawableM222994b2 != null || drawableM222994b3 != null || drawableM222994b4 != null) {
                this.f209044a = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74508r3, false);
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
        m222993a();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eqh0.m117751b(this, context, i);
    }

    public VButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209044a = false;
        this.f209045b = 0.0f;
        m222992c(context, attributeSet, 0);
    }

    public VButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209044a = false;
        this.f209045b = 0.0f;
        m222992c(context, attributeSet, i);
    }
}
