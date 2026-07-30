package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p153l.hhc0;
import p153l.lyh0;

/* JADX INFO: loaded from: classes3.dex */
public class VText_NoTopPadding extends AppCompatTextView {
    public VText_NoTopPadding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224531h(attributeSet);
    }

    /* JADX INFO: renamed from: h */
    private void m224531h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hhc0.f109534A5);
            int i = typedArrayObtainStyledAttributes.getInt(hhc0.f109541B5, 400);
            typedArrayObtainStyledAttributes.recycle();
            if (i == 500) {
                setTypeface(lyh0.m156283c(3));
                return;
            }
            if (i == 600) {
                setTypeface(lyh0.m156283c(2), 1);
                return;
            }
            if (i == 700) {
                setTypeface(Typeface.DEFAULT_BOLD);
            } else if (i != 800) {
                setTypeface(lyh0.m156283c(2));
            } else {
                setTypeface(lyh0.m156283c(3), 1);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.translate(0.0f, (-getBaseline()) + getLineBounds(0, null));
        super.onDraw(canvas);
    }

    public VText_NoTopPadding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_NoTopPadding(Context context) {
        this(context, null, 0);
    }
}
