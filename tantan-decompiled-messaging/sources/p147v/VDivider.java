package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p149l.b9c0;

/* JADX INFO: loaded from: classes3.dex */
public class VDivider extends View {

    /* JADX INFO: renamed from: a */
    public int f209075a;

    /* JADX INFO: renamed from: b */
    public int f209076b;

    /* JADX INFO: renamed from: c */
    public boolean f209077c;

    /* JADX INFO: renamed from: d */
    public int f209078d;

    /* JADX INFO: renamed from: e */
    public int f209079e;

    /* JADX INFO: renamed from: f */
    public Paint f209080f;

    public VDivider(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74550x3);
        this.f209075a = typedArrayObtainStyledAttributes.getColor(b9c0.f74230B3, -1);
        this.f209076b = typedArrayObtainStyledAttributes.getInt(b9c0.f74237C3, 0);
        this.f209077c = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74223A3, false);
        this.f209078d = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74564z3, 18);
        this.f209079e = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74557y3, 12);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f209080f = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f209080f.setColor(this.f209075a);
        if (this.f209077c) {
            this.f209080f.setPathEffect(new DashPathEffect(new float[]{this.f209078d, this.f209079e}, 0.0f));
        }
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m223005a(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float measuredWidth = getMeasuredWidth();
        this.f209080f.setStrokeWidth(getMeasuredHeight());
        canvas.drawLine(0.0f, measuredHeight, measuredWidth, measuredHeight, this.f209080f);
    }

    /* JADX INFO: renamed from: b */
    public final void m223006b(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight();
        this.f209080f.setStrokeWidth(getMeasuredHeight());
        canvas.drawLine(measuredWidth, 0.0f, measuredWidth, measuredHeight, this.f209080f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f209076b == 0) {
            m223005a(canvas);
        } else {
            m223006b(canvas);
        }
    }

    public void setDividerColor(int i) {
        if (NullChecker.m81303a(this.f209080f)) {
            this.f209080f.setColor(i);
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
