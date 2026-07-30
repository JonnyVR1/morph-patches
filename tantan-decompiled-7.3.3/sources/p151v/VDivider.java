package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.hhc0;

/* JADX INFO: loaded from: classes3.dex */
public class VDivider extends View {

    /* JADX INFO: renamed from: a */
    public int f209997a;

    /* JADX INFO: renamed from: b */
    public int f209998b;

    /* JADX INFO: renamed from: c */
    public boolean f209999c;

    /* JADX INFO: renamed from: d */
    public int f210000d;

    /* JADX INFO: renamed from: e */
    public int f210001e;

    /* JADX INFO: renamed from: f */
    public Paint f210002f;

    public VDivider(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109859x3);
        this.f209997a = typedArrayObtainStyledAttributes.getColor(hhc0.f109539B3, -1);
        this.f209998b = typedArrayObtainStyledAttributes.getInt(hhc0.f109546C3, 0);
        this.f209999c = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109532A3, false);
        this.f210000d = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109873z3, 18);
        this.f210001e = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109866y3, 12);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f210002f = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f210002f.setColor(this.f209997a);
        if (this.f209999c) {
            this.f210002f.setPathEffect(new DashPathEffect(new float[]{this.f210000d, this.f210001e}, 0.0f));
        }
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m224251a(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float measuredWidth = getMeasuredWidth();
        this.f210002f.setStrokeWidth(getMeasuredHeight());
        canvas.drawLine(0.0f, measuredHeight, measuredWidth, measuredHeight, this.f210002f);
    }

    /* JADX INFO: renamed from: b */
    public final void m224252b(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight();
        this.f210002f.setStrokeWidth(getMeasuredHeight());
        canvas.drawLine(measuredWidth, 0.0f, measuredWidth, measuredHeight, this.f210002f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f209998b == 0) {
            m224251a(canvas);
        } else {
            m224252b(canvas);
        }
    }

    public void setDividerColor(int i) {
        if (NullChecker.m82486a(this.f210002f)) {
            this.f210002f.setColor(i);
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
