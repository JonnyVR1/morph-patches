package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.layout.expanded.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import p147v.VLinear;
import p149l.e9c0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileOpButtonLinearRoot extends VLinear {

    /* JADX INFO: renamed from: j */
    public static Bitmap f33872j;

    /* JADX INFO: renamed from: c */
    public Paint f33873c;

    /* JADX INFO: renamed from: d */
    public Path f33874d;

    /* JADX INFO: renamed from: e */
    public Rect f33875e;

    /* JADX INFO: renamed from: f */
    public RectF f33876f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f33877g;

    /* JADX INFO: renamed from: h */
    public boolean f33878h;

    /* JADX INFO: renamed from: i */
    public int f33879i;

    public ExpProfileOpButtonLinearRoot(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33877g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f33878h = true;
        this.f33879i = -36854;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90056o0, i, 0);
            this.f33878h = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90062q0, true);
            this.f33879i = typedArrayObtainStyledAttributes.getColor(e9c0.f90059p0, -36854);
            typedArrayObtainStyledAttributes.recycle();
        }
        m52400r();
    }

    /* JADX INFO: renamed from: r */
    private void m52400r() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f33873c = paint;
        paint.setAntiAlias(true);
        this.f33875e = new Rect(0, 0, 0, 0);
        this.f33876f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f33874d = new Path();
    }

    /* JADX INFO: renamed from: P */
    public final void m52401P() {
        if (f33872j == null) {
            f33872j = BitmapFactory.decodeResource(getResources(), x2c0.f190784zl);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m52402Q(boolean z) {
        this.f33878h = z;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f33873c.setXfermode(null);
        this.f33873c.setColor(this.f33879i);
        this.f33873c.setShadowLayer(10.0f, 0.0f, 0.0f, -2040358);
        canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.f33873c);
        if (this.f33878h) {
            return;
        }
        m52401P();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int iMin = Math.min(f33872j.getWidth(), (getMeasuredWidth() * f33872j.getHeight()) / getMeasuredHeight());
        this.f33875e.set(0, 0, iMin, f33872j.getHeight());
        this.f33876f.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f33872j.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f33872j, this.f33875e, this.f33876f, this.f33873c);
        this.f33873c.setColor(-1);
        this.f33874d.reset();
        this.f33874d.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f33874d;
        float measuredWidth = getMeasuredWidth() + 1;
        float measuredHeight = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth, measuredHeight, direction);
        this.f33874d.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, direction);
        this.f33873c.setXfermode(this.f33877g);
        this.f33874d.close();
        canvas.drawPath(this.f33874d, this.f33873c);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // p147v.VLinear, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ExpProfileOpButtonLinearRoot(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpProfileOpButtonLinearRoot(Context context) {
        this(context, null);
    }
}
