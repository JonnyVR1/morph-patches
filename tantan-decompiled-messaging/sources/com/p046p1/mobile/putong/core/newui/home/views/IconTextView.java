package com.p046p1.mobile.putong.core.newui.home.views;

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
import com.p046p1.mobile.android.app.App;
import p149l.e16;
import p149l.t100;
import p149l.w0c0;

/* JADX INFO: loaded from: classes11.dex */
public class IconTextView extends View {

    /* JADX INFO: renamed from: a */
    public Drawable f23960a;

    /* JADX INFO: renamed from: b */
    public int f23961b;

    /* JADX INFO: renamed from: c */
    public int f23962c;

    /* JADX INFO: renamed from: d */
    public TextPaint f23963d;

    /* JADX INFO: renamed from: e */
    public String f23964e;

    /* JADX INFO: renamed from: f */
    public String f23965f;

    /* JADX INFO: renamed from: g */
    public String f23966g;

    /* JADX INFO: renamed from: h */
    public int f23967h;

    public IconTextView(Context context) {
        super(context);
        this.f23962c = 16;
        this.f23964e = "";
        this.f23965f = "";
        this.f23966g = "";
        this.f23967h = 2;
        m39175b();
    }

    /* JADX INFO: renamed from: a */
    public final void m39174a(int i) {
        if (i <= 0) {
            return;
        }
        if (this.f23964e.isEmpty()) {
            this.f23965f = "";
            this.f23966g = "";
            return;
        }
        int iBreakText = this.f23963d.breakText(this.f23964e, true, (i - this.f23961b) - this.f23962c, null);
        this.f23965f = this.f23964e.substring(0, iBreakText);
        if (iBreakText < this.f23964e.length()) {
            this.f23966g = TextUtils.ellipsize(this.f23964e.substring(iBreakText).trim(), this.f23963d, i, TextUtils.TruncateAt.END).toString();
        } else {
            this.f23966g = "";
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m39175b() {
        TextPaint textPaint = new TextPaint();
        this.f23963d = textPaint;
        textPaint.setAntiAlias(true);
        this.f23963d.setTextSize(t100.m186890d(14.0f));
        this.f23963d.setColor(App.f15369e.getColor(w0c0.f183864l0));
        this.f23961b = t100.m186890d(20.0f);
        this.f23962c = t100.m186890d(4.0f);
        Drawable drawableM114377e = e16.m114377e(getContext(), R.drawable.ic_menu_info_details);
        this.f23960a = drawableM114377e;
        if (drawableM114377e != null) {
            int i = this.f23961b;
            drawableM114377e.setBounds(0, 0, i, i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23965f.isEmpty()) {
            return;
        }
        Paint.FontMetrics fontMetrics = this.f23963d.getFontMetrics();
        float f = fontMetrics.top;
        float f2 = -f;
        float f3 = fontMetrics.bottom - f;
        Drawable drawable = this.f23960a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.drawText(this.f23965f, this.f23961b + this.f23962c, f2, this.f23963d);
        if (this.f23966g.isEmpty()) {
            return;
        }
        canvas.drawText(this.f23966g, 0.0f, f2 + f3, this.f23963d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        m39174a(size);
        Paint.FontMetrics fontMetrics = this.f23963d.getFontMetrics();
        int i3 = (int) (fontMetrics.bottom - fontMetrics.top);
        boolean zIsEmpty = TextUtils.isEmpty(this.f23966g);
        int i4 = this.f23961b;
        setMeasuredDimension(size, zIsEmpty ? Math.max(i4, i3) : Math.max(i4, i3 * this.f23967h));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f23960a = drawable;
        if (drawable != null) {
            int i = this.f23961b;
            drawable.setBounds(0, 0, i, i);
        }
        invalidate();
    }

    public void setText(String str) {
        if (str == null) {
            str = "";
        }
        this.f23964e = str;
        m39174a(getWidth());
        requestLayout();
        invalidate();
    }

    public void setTextSize(float f) {
        this.f23963d.setTextSize(f);
        requestLayout();
    }

    public IconTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23962c = 16;
        this.f23964e = "";
        this.f23965f = "";
        this.f23966g = "";
        this.f23967h = 2;
        m39175b();
    }
}
