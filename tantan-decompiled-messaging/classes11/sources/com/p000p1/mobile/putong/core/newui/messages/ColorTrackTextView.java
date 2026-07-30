package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Medium;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ColorTrackTextView extends VText_Medium {

    /* JADX INFO: renamed from: l */
    public Paint f3404l;

    /* JADX INFO: renamed from: m */
    public Paint f3405m;

    /* JADX INFO: renamed from: n */
    public float f3406n;

    /* JADX INFO: renamed from: o */
    public Direction f3407o;

    /* JADX INFO: renamed from: p */
    public Rect f3408p;

    public enum Direction {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public ColorTrackTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3406n = 1.0f;
        this.f3407o = Direction.LEFT_TO_RIGHT;
        m4685s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        int width = getWidth();
        int height = getHeight();
        this.f3404l.getTextBounds(string, 0, string.length(), this.f3408p);
        int iWidth = (width / 2) - (this.f3408p.width() / 2);
        Paint.FontMetrics fontMetrics = this.f3404l.getFontMetrics();
        float f = fontMetrics.bottom;
        int i = (height / 2) + ((int) (((f - fontMetrics.top) / 2.0f) - f));
        int i2 = (int) (this.f3406n * width);
        Direction direction = this.f3407o;
        if (direction == Direction.LEFT_TO_RIGHT) {
            m4684r(canvas, this.f3405m, iWidth, i, 0, i2);
            m4684r(canvas, this.f3404l, iWidth, i, i2, width);
        } else if (direction == Direction.RIGHT_TO_LEFT) {
            int i3 = width - i2;
            m4684r(canvas, this.f3405m, iWidth, i, i3, width);
            m4684r(canvas, this.f3404l, iWidth, i, 0, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final Paint m4683q(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setTextSize(getTextSize());
        return paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final void m4684r(Canvas canvas, Paint paint, int i, int i2, int i3, int i4) {
        canvas.save();
        canvas.clipRect(i3, 0, i4, getHeight());
        canvas.drawText(getText().toString(), i, i2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: s */
    public final void m4685s() {
        this.f3408p = new Rect();
        this.f3404l = m4683q(Color.parseColor("#33000000"));
        this.f3405m = m4683q(Color.parseColor("#33000000"));
    }

    public void setDirection(Direction direction) {
        this.f3407o = direction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setProgress(float f) {
        this.f3406n = f;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m4686t(int i, int i2) {
        this.f3404l.setColor(i);
        this.f3405m.setColor(i2);
        this.f3406n = 0.0f;
        this.f3408p.set(0, 0, 0, 0);
        invalidate();
    }

    public ColorTrackTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m4685s();
    }

    public ColorTrackTextView(Context context) {
        this(context, null);
        m4685s();
    }
}
