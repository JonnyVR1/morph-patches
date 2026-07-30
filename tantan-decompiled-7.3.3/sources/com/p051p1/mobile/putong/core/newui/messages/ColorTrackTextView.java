package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;

/* JADX INFO: loaded from: classes11.dex */
public class ColorTrackTextView extends VText_Medium {

    /* JADX INFO: renamed from: l */
    public Paint f25368l;

    /* JADX INFO: renamed from: m */
    public Paint f25369m;

    /* JADX INFO: renamed from: n */
    public float f25370n;

    /* JADX INFO: renamed from: o */
    public Direction f25371o;

    /* JADX INFO: renamed from: p */
    public Rect f25372p;

    public enum Direction {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public ColorTrackTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25370n = 1.0f;
        this.f25371o = Direction.LEFT_TO_RIGHT;
        m41603s();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        int width = getWidth();
        int height = getHeight();
        this.f25368l.getTextBounds(string, 0, string.length(), this.f25372p);
        int iWidth = (width / 2) - (this.f25372p.width() / 2);
        Paint.FontMetrics fontMetrics = this.f25368l.getFontMetrics();
        float f = fontMetrics.bottom;
        int i = (height / 2) + ((int) (((f - fontMetrics.top) / 2.0f) - f));
        int i2 = (int) (this.f25370n * width);
        Direction direction = this.f25371o;
        if (direction == Direction.LEFT_TO_RIGHT) {
            m41602r(canvas, this.f25369m, iWidth, i, 0, i2);
            m41602r(canvas, this.f25368l, iWidth, i, i2, width);
        } else if (direction == Direction.RIGHT_TO_LEFT) {
            int i3 = width - i2;
            m41602r(canvas, this.f25369m, iWidth, i, i3, width);
            m41602r(canvas, this.f25368l, iWidth, i, 0, i3);
        }
    }

    /* JADX INFO: renamed from: q */
    public final Paint m41601q(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setTextSize(getTextSize());
        return paint;
    }

    /* JADX INFO: renamed from: r */
    public final void m41602r(Canvas canvas, Paint paint, int i, int i2, int i3, int i4) {
        canvas.save();
        canvas.clipRect(i3, 0, i4, getHeight());
        canvas.drawText(getText().toString(), i, i2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: s */
    public final void m41603s() {
        this.f25372p = new Rect();
        this.f25368l = m41601q(Color.parseColor("#33000000"));
        this.f25369m = m41601q(Color.parseColor("#33000000"));
    }

    public void setDirection(Direction direction) {
        this.f25371o = direction;
    }

    public void setProgress(float f) {
        this.f25370n = f;
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public void m41604t(int i, int i2) {
        this.f25368l.setColor(i);
        this.f25369m.setColor(i2);
        this.f25370n = 0.0f;
        this.f25372p.set(0, 0, 0, 0);
        invalidate();
    }

    public ColorTrackTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m41603s();
    }

    public ColorTrackTextView(Context context) {
        this(context, null);
        m41603s();
    }
}
