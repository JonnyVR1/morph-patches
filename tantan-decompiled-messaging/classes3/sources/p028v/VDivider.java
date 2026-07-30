package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.b9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VDivider extends View {

    /* JADX INFO: renamed from: a */
    public int f12700a;

    /* JADX INFO: renamed from: b */
    public int f12701b;

    /* JADX INFO: renamed from: c */
    public boolean f12702c;

    /* JADX INFO: renamed from: d */
    public int f12703d;

    /* JADX INFO: renamed from: e */
    public int f12704e;

    /* JADX INFO: renamed from: f */
    public Paint f12705f;

    public VDivider(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.x3);
        this.f12700a = typedArrayObtainStyledAttributes.getColor(b9c0.B3, -1);
        this.f12701b = typedArrayObtainStyledAttributes.getInt(b9c0.C3, 0);
        this.f12702c = typedArrayObtainStyledAttributes.getBoolean(b9c0.A3, false);
        this.f12703d = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.z3, 18);
        this.f12704e = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.y3, 12);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f12705f = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f12705f.setColor(this.f12700a);
        if (this.f12702c) {
            this.f12705f.setPathEffect(new DashPathEffect(new float[]{this.f12703d, this.f12704e}, 0.0f));
        }
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m11479a(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float measuredWidth = getMeasuredWidth();
        this.f12705f.setStrokeWidth(getMeasuredHeight());
        canvas.drawLine(0.0f, measuredHeight, measuredWidth, measuredHeight, this.f12705f);
    }

    /* JADX INFO: renamed from: b */
    public final void m11480b(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight();
        this.f12705f.setStrokeWidth(getMeasuredHeight());
        canvas.drawLine(measuredWidth, 0.0f, measuredWidth, measuredHeight, this.f12705f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12701b == 0) {
            m11479a(canvas);
        } else {
            m11480b(canvas);
        }
    }

    public void setDividerColor(int i) {
        if (NullChecker.a(this.f12705f)) {
            this.f12705f.setColor(i);
            invalidate();
        }
    }

    public VDivider(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VDivider(Context context) {
        this(context, null);
    }
}
