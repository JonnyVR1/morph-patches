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
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.e9c0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileOpButtonRoot extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static Bitmap f33880h;

    /* JADX INFO: renamed from: a */
    public Paint f33881a;

    /* JADX INFO: renamed from: b */
    public Path f33882b;

    /* JADX INFO: renamed from: c */
    public Rect f33883c;

    /* JADX INFO: renamed from: d */
    public RectF f33884d;

    /* JADX INFO: renamed from: e */
    public PorterDuffXfermode f33885e;

    /* JADX INFO: renamed from: f */
    public boolean f33886f;

    /* JADX INFO: renamed from: g */
    public int f33887g;

    public ExpProfileOpButtonRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33885e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f33886f = true;
        this.f33887g = -36854;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90065r0, i, 0);
            this.f33886f = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90071t0, true);
            this.f33887g = typedArrayObtainStyledAttributes.getColor(e9c0.f90068s0, -36854);
            typedArrayObtainStyledAttributes.recycle();
        }
        m52404b();
    }

    /* JADX INFO: renamed from: a */
    public final void m52403a() {
        if (f33880h == null) {
            f33880h = BitmapFactory.decodeResource(getResources(), x2c0.f190784zl);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m52404b() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f33881a = paint;
        paint.setAntiAlias(true);
        this.f33883c = new Rect(0, 0, 0, 0);
        this.f33884d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f33882b = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f33881a.setXfermode(null);
        this.f33881a.setColor(this.f33887g);
        this.f33881a.setShadowLayer(10.0f, 0.0f, 0.0f, -2040358);
        canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.f33881a);
        if (this.f33886f) {
            return;
        }
        m52403a();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int iMin = Math.min(f33880h.getWidth(), (getMeasuredWidth() * f33880h.getHeight()) / getMeasuredHeight());
        this.f33883c.set(0, 0, iMin, f33880h.getHeight());
        this.f33884d.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f33880h.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f33880h, this.f33883c, this.f33884d, this.f33881a);
        this.f33881a.setColor(-1);
        this.f33882b.reset();
        this.f33882b.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f33882b;
        float measuredWidth = getMeasuredWidth() + 1;
        float measuredHeight = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth, measuredHeight, direction);
        this.f33882b.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, direction);
        this.f33881a.setXfermode(this.f33885e);
        this.f33882b.close();
        canvas.drawPath(this.f33882b, this.f33881a);
        canvas.restoreToCount(iSaveLayer);
    }

    public ExpProfileOpButtonRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpProfileOpButtonRoot(@NonNull Context context) {
        this(context, null);
    }
}
