package com.p000p1.mobile.putong.core.newui.home.views;

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
import com.p1.mobile.android.app.App;
import l.e16;
import l.t100;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IconTextView extends View {

    /* JADX INFO: renamed from: a */
    public Drawable f2738a;

    /* JADX INFO: renamed from: b */
    public int f2739b;

    /* JADX INFO: renamed from: c */
    public int f2740c;

    /* JADX INFO: renamed from: d */
    public TextPaint f2741d;

    /* JADX INFO: renamed from: e */
    public String f2742e;

    /* JADX INFO: renamed from: f */
    public String f2743f;

    /* JADX INFO: renamed from: g */
    public String f2744g;

    /* JADX INFO: renamed from: h */
    public int f2745h;

    public IconTextView(Context context) {
        super(context);
        this.f2740c = 16;
        this.f2742e = "";
        this.f2743f = "";
        this.f2744g = "";
        this.f2745h = 2;
        m3193b();
    }

    /* JADX INFO: renamed from: a */
    public final void m3192a(int i) {
        if (i <= 0) {
            return;
        }
        if (this.f2742e.isEmpty()) {
            this.f2743f = "";
            this.f2744g = "";
            return;
        }
        int iBreakText = this.f2741d.breakText(this.f2742e, true, (i - this.f2739b) - this.f2740c, null);
        this.f2743f = this.f2742e.substring(0, iBreakText);
        if (iBreakText < this.f2742e.length()) {
            this.f2744g = TextUtils.ellipsize(this.f2742e.substring(iBreakText).trim(), this.f2741d, i, TextUtils.TruncateAt.END).toString();
        } else {
            this.f2744g = "";
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3193b() {
        TextPaint textPaint = new TextPaint();
        this.f2741d = textPaint;
        textPaint.setAntiAlias(true);
        this.f2741d.setTextSize(t100.d(14.0f));
        this.f2741d.setColor(App.e.getColor(w0c0.l0));
        this.f2739b = t100.d(20.0f);
        this.f2740c = t100.d(4.0f);
        Drawable drawableE = e16.e(getContext(), R.drawable.ic_menu_info_details);
        this.f2738a = drawableE;
        if (drawableE != null) {
            int i = this.f2739b;
            drawableE.setBounds(0, 0, i, i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2743f.isEmpty()) {
            return;
        }
        Paint.FontMetrics fontMetrics = this.f2741d.getFontMetrics();
        float f = fontMetrics.top;
        float f2 = -f;
        float f3 = fontMetrics.bottom - f;
        Drawable drawable = this.f2738a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.drawText(this.f2743f, this.f2739b + this.f2740c, f2, this.f2741d);
        if (this.f2744g.isEmpty()) {
            return;
        }
        canvas.drawText(this.f2744g, 0.0f, f2 + f3, this.f2741d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        m3192a(size);
        Paint.FontMetrics fontMetrics = this.f2741d.getFontMetrics();
        int i3 = (int) (fontMetrics.bottom - fontMetrics.top);
        boolean zIsEmpty = TextUtils.isEmpty(this.f2744g);
        int i4 = this.f2739b;
        setMeasuredDimension(size, zIsEmpty ? Math.max(i4, i3) : Math.max(i4, i3 * this.f2745h));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f2738a = drawable;
        if (drawable != null) {
            int i = this.f2739b;
            drawable.setBounds(0, 0, i, i);
        }
        invalidate();
    }

    public void setText(String str) {
        if (str == null) {
            str = "";
        }
        this.f2742e = str;
        m3192a(getWidth());
        requestLayout();
        invalidate();
    }

    public void setTextSize(float f) {
        this.f2741d.setTextSize(f);
        requestLayout();
    }

    public IconTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2740c = 16;
        this.f2742e = "";
        this.f2743f = "";
        this.f2744g = "";
        this.f2745h = 2;
        m3193b();
    }
}
