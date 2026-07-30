package com.p051p1.mobile.putong.core.newui.home.views;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import p153l.c9c0;
import p153l.j26;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class IconTextView extends View {

    /* JADX INFO: renamed from: a */
    public Drawable f24702a;

    /* JADX INFO: renamed from: b */
    public int f24703b;

    /* JADX INFO: renamed from: c */
    public int f24704c;

    /* JADX INFO: renamed from: d */
    public TextPaint f24705d;

    /* JADX INFO: renamed from: e */
    public String f24706e;

    /* JADX INFO: renamed from: f */
    public String f24707f;

    /* JADX INFO: renamed from: g */
    public String f24708g;

    /* JADX INFO: renamed from: h */
    public int f24709h;

    public IconTextView(Context context) {
        super(context);
        this.f24704c = 16;
        this.f24706e = "";
        this.f24707f = "";
        this.f24708g = "";
        this.f24709h = 2;
        m40178b();
    }

    /* JADX INFO: renamed from: a */
    public final void m40177a(int i) {
        if (i <= 0) {
            return;
        }
        if (this.f24706e.isEmpty()) {
            this.f24707f = "";
            this.f24708g = "";
            return;
        }
        int iBreakText = this.f24705d.breakText(this.f24706e, true, (i - this.f24703b) - this.f24704c, null);
        this.f24707f = this.f24706e.substring(0, iBreakText);
        if (iBreakText < this.f24706e.length()) {
            this.f24708g = TextUtils.ellipsize(this.f24706e.substring(iBreakText).trim(), this.f24705d, i, TextUtils.TruncateAt.END).toString();
        } else {
            this.f24708g = "";
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m40178b() {
        TextPaint textPaint = new TextPaint();
        this.f24705d = textPaint;
        textPaint.setAntiAlias(true);
        this.f24705d.setTextSize(qa00.m175859d(14.0f));
        this.f24705d.setColor(App.f16088e.getColor(c9c0.f80437m0));
        this.f24703b = qa00.m175859d(20.0f);
        this.f24704c = qa00.m175859d(4.0f);
        Drawable drawableM143192e = j26.m143192e(getContext(), R.drawable.ic_menu_info_details);
        this.f24702a = drawableM143192e;
        if (drawableM143192e != null) {
            int i = this.f24703b;
            drawableM143192e.setBounds(0, 0, i, i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24707f.isEmpty()) {
            return;
        }
        Paint.FontMetrics fontMetrics = this.f24705d.getFontMetrics();
        float f = fontMetrics.top;
        float f2 = -f;
        float f3 = fontMetrics.bottom - f;
        Drawable drawable = this.f24702a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.drawText(this.f24707f, this.f24703b + this.f24704c, f2, this.f24705d);
        if (this.f24708g.isEmpty()) {
            return;
        }
        canvas.drawText(this.f24708g, 0.0f, f2 + f3, this.f24705d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        m40177a(size);
        Paint.FontMetrics fontMetrics = this.f24705d.getFontMetrics();
        int i3 = (int) (fontMetrics.bottom - fontMetrics.top);
        boolean zIsEmpty = TextUtils.isEmpty(this.f24708g);
        int i4 = this.f24703b;
        setMeasuredDimension(size, zIsEmpty ? Math.max(i4, i3) : Math.max(i4, i3 * this.f24709h));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f24702a = drawable;
        if (drawable != null) {
            int i = this.f24703b;
            drawable.setBounds(0, 0, i, i);
        }
        invalidate();
    }

    public void setText(String str) {
        if (str == null) {
            str = "";
        }
        this.f24706e = str;
        m40177a(getWidth());
        requestLayout();
        invalidate();
    }

    public void setTextSize(float f) {
        this.f24705d.setTextSize(f);
        requestLayout();
    }

    public IconTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24704c = 16;
        this.f24706e = "";
        this.f24707f = "";
        this.f24708g = "";
        this.f24709h = 2;
        m40178b();
    }
}
