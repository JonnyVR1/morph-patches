package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.layout.expanded.view;

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
import l.e9c0;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileOpButtonRoot extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static Bitmap f1702h;

    /* JADX INFO: renamed from: a */
    public Paint f1703a;

    /* JADX INFO: renamed from: b */
    public Path f1704b;

    /* JADX INFO: renamed from: c */
    public Rect f1705c;

    /* JADX INFO: renamed from: d */
    public RectF f1706d;

    /* JADX INFO: renamed from: e */
    public PorterDuffXfermode f1707e;

    /* JADX INFO: renamed from: f */
    public boolean f1708f;

    /* JADX INFO: renamed from: g */
    public int f1709g;

    public ExpProfileOpButtonRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1707e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1708f = true;
        this.f1709g = -36854;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.r0, i, 0);
            this.f1708f = typedArrayObtainStyledAttributes.getBoolean(e9c0.t0, true);
            this.f1709g = typedArrayObtainStyledAttributes.getColor(e9c0.s0, -36854);
            typedArrayObtainStyledAttributes.recycle();
        }
        m2938b();
    }

    /* JADX INFO: renamed from: a */
    public final void m2937a() {
        if (f1702h == null) {
            f1702h = BitmapFactory.decodeResource(getResources(), x2c0.zl);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2938b() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f1703a = paint;
        paint.setAntiAlias(true);
        this.f1705c = new Rect(0, 0, 0, 0);
        this.f1706d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f1704b = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1703a.setXfermode(null);
        this.f1703a.setColor(this.f1709g);
        this.f1703a.setShadowLayer(10.0f, 0.0f, 0.0f, -2040358);
        canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.f1703a);
        if (this.f1708f) {
            return;
        }
        m2937a();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int iMin = Math.min(f1702h.getWidth(), (getMeasuredWidth() * f1702h.getHeight()) / getMeasuredHeight());
        this.f1705c.set(0, 0, iMin, f1702h.getHeight());
        this.f1706d.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f1702h.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f1702h, this.f1705c, this.f1706d, this.f1703a);
        this.f1703a.setColor(-1);
        this.f1704b.reset();
        this.f1704b.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f1704b;
        float measuredWidth = getMeasuredWidth() + 1;
        float measuredHeight = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth, measuredHeight, direction);
        this.f1704b.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, direction);
        this.f1703a.setXfermode(this.f1707e);
        this.f1704b.close();
        canvas.drawPath(this.f1704b, this.f1703a);
        canvas.restoreToCount(iSaveLayer);
    }

    public ExpProfileOpButtonRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpProfileOpButtonRoot(@NonNull Context context) {
        this(context, null);
    }
}
