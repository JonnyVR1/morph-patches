package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;

/* JADX INFO: loaded from: classes11.dex */
public class ColorTrackTextView extends VText_Medium {

    /* JADX INFO: renamed from: l */
    public Paint f24626l;

    /* JADX INFO: renamed from: m */
    public Paint f24627m;

    /* JADX INFO: renamed from: n */
    public float f24628n;

    /* JADX INFO: renamed from: o */
    public Direction f24629o;

    /* JADX INFO: renamed from: p */
    public Rect f24630p;

    public enum Direction {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public ColorTrackTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24628n = 1.0f;
        this.f24629o = Direction.LEFT_TO_RIGHT;
        m40592s();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        int width = getWidth();
        int height = getHeight();
        this.f24626l.getTextBounds(string, 0, string.length(), this.f24630p);
        int iWidth = (width / 2) - (this.f24630p.width() / 2);
        Paint.FontMetrics fontMetrics = this.f24626l.getFontMetrics();
        float f = fontMetrics.bottom;
        int i = (height / 2) + ((int) (((f - fontMetrics.top) / 2.0f) - f));
        int i2 = (int) (this.f24628n * width);
        Direction direction = this.f24629o;
        if (direction == Direction.LEFT_TO_RIGHT) {
            m40591r(canvas, this.f24627m, iWidth, i, 0, i2);
            m40591r(canvas, this.f24626l, iWidth, i, i2, width);
        } else if (direction == Direction.RIGHT_TO_LEFT) {
            int i3 = width - i2;
            m40591r(canvas, this.f24627m, iWidth, i, i3, width);
            m40591r(canvas, this.f24626l, iWidth, i, 0, i3);
        }
    }

    /* JADX INFO: renamed from: q */
    public final Paint m40590q(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setTextSize(getTextSize());
        return paint;
    }

    /* JADX INFO: renamed from: r */
    public final void m40591r(Canvas canvas, Paint paint, int i, int i2, int i3, int i4) {
        canvas.save();
        canvas.clipRect(i3, 0, i4, getHeight());
        canvas.drawText(getText().toString(), i, i2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: s */
    public final void m40592s() {
        this.f24630p = new Rect();
        this.f24626l = m40590q(Color.parseColor("#33000000"));
        this.f24627m = m40590q(Color.parseColor("#33000000"));
    }

    public void setDirection(Direction direction) {
        this.f24629o = direction;
    }

    public void setProgress(float f) {
        this.f24628n = f;
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public void m40593t(int i, int i2) {
        this.f24626l.setColor(i);
        this.f24627m.setColor(i2);
        this.f24628n = 0.0f;
        this.f24630p.set(0, 0, 0, 0);
        invalidate();
    }

    public ColorTrackTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m40592s();
    }

    public ColorTrackTextView(Context context) {
        this(context, null);
        m40592s();
    }
}
