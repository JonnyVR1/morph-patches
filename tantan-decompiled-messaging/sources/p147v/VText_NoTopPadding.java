package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p149l.b9c0;
import p149l.eqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VText_NoTopPadding extends AppCompatTextView {
    public VText_NoTopPadding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223285h(attributeSet);
    }

    /* JADX INFO: renamed from: h */
    private void m223285h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f74225A5);
            int i = typedArrayObtainStyledAttributes.getInt(b9c0.f74232B5, 400);
            typedArrayObtainStyledAttributes.recycle();
            if (i == 500) {
                setTypeface(eqh0.m117752c(3));
                return;
            }
            if (i == 600) {
                setTypeface(eqh0.m117752c(2), 1);
                return;
            }
            if (i == 700) {
                setTypeface(Typeface.DEFAULT_BOLD);
            } else if (i != 800) {
                setTypeface(eqh0.m117752c(2));
            } else {
                setTypeface(eqh0.m117752c(3), 1);
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
