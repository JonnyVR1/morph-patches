package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.common.utils.NullChecker;
import p149l.b9c0;

/* JADX INFO: loaded from: classes3.dex */
public class VText_AutoFit extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f209438i;

    /* JADX INFO: renamed from: j */
    public float f209439j;

    /* JADX INFO: renamed from: k */
    public boolean f209440k;

    /* JADX INFO: renamed from: l */
    public float f209441l;

    public VText_AutoFit(Context context) {
        super(context);
        m223265h(context, null, 0);
    }

    /* JADX INFO: renamed from: h */
    private void m223265h(Context context, AttributeSet attributeSet, int i) {
        this.f209438i = new Paint(getPaint());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74517s5, i, 0);
        this.f209441l = typedArrayObtainStyledAttributes.getDimension(b9c0.f74524t5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    private void m223266l(String str, int i) {
        if (i > 0) {
            this.f209439j = getTextSize();
            int iWidth = 0;
            for (Drawable drawable : getCompoundDrawables()) {
                if (drawable != null) {
                    iWidth += drawable.getBounds().width();
                }
            }
            int paddingLeft = (((i - getPaddingLeft()) - getPaddingRight()) - getCompoundDrawablePadding()) - iWidth;
            float fM223267o = m223267o(this.f209439j, str);
            while (fM223267o > paddingLeft) {
                float f = this.f209439j;
                if (f <= this.f209441l) {
                    break;
                }
                float f2 = f - 1.0f;
                this.f209439j = f2;
                fM223267o = m223267o(f2, str);
            }
            setTextSize(0, this.f209439j);
        }
    }

    /* JADX INFO: renamed from: o */
    private float m223267o(float f, String str) {
        this.f209438i.setTextSize(f);
        float f2 = 0.0f;
        for (String str2 : str.split(SignParameters.NEW_LINE)) {
            float fMeasureText = this.f209438i.measureText(str2);
            if (f2 < fMeasureText) {
                f2 = fMeasureText;
            }
        }
        return f2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f209440k || this.f209439j > 0.0f) {
            return;
        }
        m223266l(getText().toString(), getMeasuredWidth());
    }

    /* JADX INFO: renamed from: p */
    public void m223268p() {
        this.f209439j = 0.0f;
    }

    public void setPaused(boolean z) {
        this.f209440k = z;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        super.setTypeface(typeface, i);
        Paint paint = this.f209438i;
        if (paint == null) {
            return;
        }
        if (i <= 0) {
            paint.setFakeBoldText(false);
            this.f209438i.setTextSkewX(0.0f);
            setTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.f209438i.setFakeBoldText((i2 & 1) != 0);
            this.f209438i.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public VText_AutoFit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223265h(context, attributeSet, 0);
    }

    public VText_AutoFit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223265h(context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        if (!NullChecker.m81303a(this.f209438i) || this.f209438i.getTypeface() == typeface) {
            return;
        }
        this.f209438i.setTypeface(typeface);
    }
}
