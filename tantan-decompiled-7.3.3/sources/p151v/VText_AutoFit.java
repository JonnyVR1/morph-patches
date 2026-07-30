package p151v;

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
import p153l.hhc0;

/* JADX INFO: loaded from: classes3.dex */
public class VText_AutoFit extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f210360i;

    /* JADX INFO: renamed from: j */
    public float f210361j;

    /* JADX INFO: renamed from: k */
    public boolean f210362k;

    /* JADX INFO: renamed from: l */
    public float f210363l;

    public VText_AutoFit(Context context) {
        super(context);
        m224511h(context, null, 0);
    }

    /* JADX INFO: renamed from: h */
    private void m224511h(Context context, AttributeSet attributeSet, int i) {
        this.f210360i = new Paint(getPaint());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109826s5, i, 0);
        this.f210363l = typedArrayObtainStyledAttributes.getDimension(hhc0.f109833t5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    private void m224512l(String str, int i) {
        if (i > 0) {
            this.f210361j = getTextSize();
            int iWidth = 0;
            for (Drawable drawable : getCompoundDrawables()) {
                if (drawable != null) {
                    iWidth += drawable.getBounds().width();
                }
            }
            int paddingLeft = (((i - getPaddingLeft()) - getPaddingRight()) - getCompoundDrawablePadding()) - iWidth;
            float fM224513o = m224513o(this.f210361j, str);
            while (fM224513o > paddingLeft) {
                float f = this.f210361j;
                if (f <= this.f210363l) {
                    break;
                }
                float f2 = f - 1.0f;
                this.f210361j = f2;
                fM224513o = m224513o(f2, str);
            }
            setTextSize(0, this.f210361j);
        }
    }

    /* JADX INFO: renamed from: o */
    private float m224513o(float f, String str) {
        this.f210360i.setTextSize(f);
        float f2 = 0.0f;
        for (String str2 : str.split(SignParameters.NEW_LINE)) {
            float fMeasureText = this.f210360i.measureText(str2);
            if (f2 < fMeasureText) {
                f2 = fMeasureText;
            }
        }
        return f2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f210362k || this.f210361j > 0.0f) {
            return;
        }
        m224512l(getText().toString(), getMeasuredWidth());
    }

    /* JADX INFO: renamed from: p */
    public void m224514p() {
        this.f210361j = 0.0f;
    }

    public void setPaused(boolean z) {
        this.f210362k = z;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        super.setTypeface(typeface, i);
        Paint paint = this.f210360i;
        if (paint == null) {
            return;
        }
        if (i <= 0) {
            paint.setFakeBoldText(false);
            this.f210360i.setTextSkewX(0.0f);
            setTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.f210360i.setFakeBoldText((i2 & 1) != 0);
            this.f210360i.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public VText_AutoFit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224511h(context, attributeSet, 0);
    }

    public VText_AutoFit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224511h(context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        if (!NullChecker.m82486a(this.f210360i) || this.f210360i.getTypeface() == typeface) {
            return;
        }
        this.f210360i.setTypeface(typeface);
    }
}
