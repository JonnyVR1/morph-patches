package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import l.b9c0;
import org.eclipse.jetty.http.HttpStatus;
import p003l.eqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VText_NoTopPadding extends AppCompatTextView {
    public VText_NoTopPadding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11772h(attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private void m11772h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.A5);
            int i = typedArrayObtainStyledAttributes.getInt(b9c0.B5, HttpStatus.BAD_REQUEST_400);
            typedArrayObtainStyledAttributes.recycle();
            if (i == 500) {
                setTypeface(eqh0.m3924c(3));
                return;
            }
            if (i == 600) {
                setTypeface(eqh0.m3924c(2), 1);
                return;
            }
            if (i == 700) {
                setTypeface(Typeface.DEFAULT_BOLD);
            } else if (i != 800) {
                setTypeface(eqh0.m3924c(2));
            } else {
                setTypeface(eqh0.m3924c(3), 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        canvas.translate(0.0f, (-getBaseline()) + getLineBounds(0, null));
        super/*android.view.View*/.onDraw(canvas);
    }

    public VText_NoTopPadding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_NoTopPadding(Context context) {
        this(context, null, 0);
    }
}
