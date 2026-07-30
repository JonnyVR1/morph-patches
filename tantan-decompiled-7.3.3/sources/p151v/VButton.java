package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.StyleableRes;
import p153l.hhc0;
import p153l.lyh0;
import p153l.oyh0;

/* JADX INFO: loaded from: classes3.dex */
public class VButton extends CompoundButton {

    /* JADX INFO: renamed from: a */
    public boolean f209966a;

    /* JADX INFO: renamed from: b */
    public float f209967b;

    public VButton(Context context) {
        super(context);
        this.f209966a = false;
        this.f209967b = 0.0f;
        m224238c(context, null, 0);
    }

    /* JADX INFO: renamed from: c */
    private void m224238c(Context context, AttributeSet attributeSet, int i) {
        lyh0.m156281a(this, context, attributeSet, i);
        oyh0.m169867b(this, context, attributeSet, i);
        m224241d(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public void m224239a() {
        if (this.f209966a) {
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
    public final Drawable m224240b(TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
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
    public final void m224241d(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hhc0.f109775l3);
            Drawable drawableM224240b = m224240b(typedArrayObtainStyledAttributes, hhc0.f109796o3, hhc0.f109824s3);
            Drawable drawableM224240b2 = m224240b(typedArrayObtainStyledAttributes, hhc0.f109803p3, hhc0.f109831t3);
            Drawable drawableM224240b3 = m224240b(typedArrayObtainStyledAttributes, hhc0.f109782m3, hhc0.f109838u3);
            Drawable drawableM224240b4 = m224240b(typedArrayObtainStyledAttributes, hhc0.f109789n3, hhc0.f109810q3);
            setCompoundDrawables(drawableM224240b, drawableM224240b3, drawableM224240b2, drawableM224240b4);
            if (drawableM224240b != null || drawableM224240b2 != null || drawableM224240b3 != null || drawableM224240b4 != null) {
                this.f209966a = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109817r3, false);
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
        m224239a();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lyh0.m156282b(this, context, i);
    }

    public VButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209966a = false;
        this.f209967b = 0.0f;
        m224238c(context, attributeSet, 0);
    }

    public VButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209966a = false;
        this.f209967b = 0.0f;
        m224238c(context, attributeSet, i);
    }
}
