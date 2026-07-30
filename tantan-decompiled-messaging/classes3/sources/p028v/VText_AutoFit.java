package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.b9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VText_AutoFit extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f13063i;

    /* JADX INFO: renamed from: j */
    public float f13064j;

    /* JADX INFO: renamed from: k */
    public boolean f13065k;

    /* JADX INFO: renamed from: l */
    public float f13066l;

    public VText_AutoFit(Context context) {
        super(context);
        m11751h(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private void m11751h(Context context, AttributeSet attributeSet, int i) {
        this.f13063i = new Paint(getPaint());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.s5, i, 0);
        this.f13066l = typedArrayObtainStyledAttributes.getDimension(b9c0.t5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private void m11752l(String str, int i) {
        if (i > 0) {
            this.f13064j = getTextSize();
            int iWidth = 0;
            for (Drawable drawable : getCompoundDrawables()) {
                if (drawable != null) {
                    iWidth += drawable.getBounds().width();
                }
            }
            int paddingLeft = (((i - getPaddingLeft()) - getPaddingRight()) - getCompoundDrawablePadding()) - iWidth;
            float fM11753o = m11753o(this.f13064j, str);
            while (fM11753o > paddingLeft) {
                float f = this.f13064j;
                if (f <= this.f13066l) {
                    break;
                }
                float f2 = f - 1.0f;
                this.f13064j = f2;
                fM11753o = m11753o(f2, str);
            }
            setTextSize(0, this.f13064j);
        }
    }

    /* JADX INFO: renamed from: o */
    private float m11753o(float f, String str) {
        this.f13063i.setTextSize(f);
        float f2 = 0.0f;
        for (String str2 : str.split("\n")) {
            float fMeasureText = this.f13063i.measureText(str2);
            if (f2 < fMeasureText) {
                f2 = fMeasureText;
            }
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (this.f13065k || this.f13064j > 0.0f) {
            return;
        }
        m11752l(getText().toString(), getMeasuredWidth());
    }

    /* JADX INFO: renamed from: p */
    public void m11754p() {
        this.f13064j = 0.0f;
    }

    public void setPaused(boolean z) {
        this.f13065k = z;
    }

    public void setTypeface(@Nullable Typeface typeface, int i) {
        super.setTypeface(typeface, i);
        Paint paint = this.f13063i;
        if (paint == null) {
            return;
        }
        if (i <= 0) {
            paint.setFakeBoldText(false);
            this.f13063i.setTextSkewX(0.0f);
            setTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.f13063i.setFakeBoldText((i2 & 1) != 0);
            this.f13063i.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public VText_AutoFit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11751h(context, attributeSet, 0);
    }

    public VText_AutoFit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11751h(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTypeface(Typeface typeface) {
        super/*android.widget.TextView*/.setTypeface(typeface);
        if (!NullChecker.a(this.f13063i) || this.f13063i.getTypeface() == typeface) {
            return;
        }
        this.f13063i.setTypeface(typeface);
    }
}
