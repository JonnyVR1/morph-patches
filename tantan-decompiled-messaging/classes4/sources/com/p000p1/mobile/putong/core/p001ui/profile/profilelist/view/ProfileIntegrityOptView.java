package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import l.t100;
import l.u4c0;
import l.w0c0;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileIntegrityOptView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f1903c;

    /* JADX INFO: renamed from: d */
    public VText f1904d;

    /* JADX INFO: renamed from: e */
    public VText f1905e;

    /* JADX INFO: renamed from: f */
    public VText f1906f;

    /* JADX INFO: renamed from: g */
    public Paint f1907g;

    /* JADX INFO: renamed from: h */
    public Paint f1908h;

    /* JADX INFO: renamed from: i */
    public int f1909i;

    /* JADX INFO: renamed from: j */
    public int f1910j;

    /* JADX INFO: renamed from: k */
    public int f1911k;

    /* JADX INFO: renamed from: l */
    public int f1912l;

    /* JADX INFO: renamed from: m */
    public int f1913m;

    /* JADX INFO: renamed from: n */
    public int f1914n;

    public ProfileIntegrityOptView(Context context) {
        super(context);
        this.f1911k = t100.d(20.0f);
        this.f1912l = t100.d(20.0f);
        this.f1913m = t100.d(16.0f);
        this.f1914n = t100.d(3.0f);
    }

    /* JADX INFO: renamed from: P */
    public void m3436P(int i, int i2, String str) {
        m3437Q(i, i2, str, "");
    }

    /* JADX INFO: renamed from: Q */
    public void m3437Q(int i, int i2, String str, String str2) {
        this.f1909i = i;
        this.f1910j = i2;
        VImage vImage = this.f1903c;
        if (i == i2) {
            xdl0.M(vImage, true);
            this.f1904d.setText(String.format("资料完整度%s%%", Integer.valueOf(i2)));
            xdl0.M0(this.f1905e, false);
            xdl0.M0(this.f1906f, false);
            return;
        }
        xdl0.M0(vImage, false);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f1904d;
        if (zIsEmpty) {
            vText.setText(String.format("资料完整度%s%%", Integer.valueOf(i)));
        } else {
            vText.setText(String.format("资料完整度%s%%，" + str, Integer.valueOf(i)));
        }
        this.f1905e.setText("+" + (i2 - i) + "%");
        this.f1906f.setText(str2);
        xdl0.M0(this.f1906f, true);
        xdl0.M0(this.f1905e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NonNull Canvas canvas) {
        super/*android.view.View*/.dispatchDraw(canvas);
        if (this.f1909i == this.f1910j) {
            return;
        }
        canvas.save();
        canvas.rotate(-90.0f, (this.f1913m / 2) + this.f1911k, this.f1912l / 2);
        int i = this.f1913m;
        canvas.drawCircle((i / 2) + this.f1911k, this.f1912l / 2, (i / 2) - this.f1914n, this.f1907g);
        int i2 = this.f1911k;
        int i3 = this.f1914n;
        RectF rectF = new RectF(i2 + i3, i3 + t100.d(2.0f), (this.f1911k + this.f1913m) - this.f1914n, (this.f1912l - t100.d(2.0f)) - this.f1914n);
        int i4 = this.f1909i;
        canvas.drawArc(rectF, 0.0f, i4 == 0 ? 36.0f : (i4 / this.f1910j) * 360.0f, false, this.f1908h);
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f1903c = findViewById(u4c0.G5);
        this.f1904d = findViewById(u4c0.ge);
        this.f1905e = findViewById(u4c0.u);
        this.f1906f = findViewById(u4c0.d4);
        Paint paint = new Paint();
        this.f1907g = paint;
        paint.setColor(CoreModule.b.getResources().getColor(w0c0.n0));
        Paint paint2 = this.f1907g;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f1907g.setStrokeWidth(t100.d(3.2f));
        this.f1907g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f1908h = paint3;
        paint3.setColor(Color.parseColor("#FE7E1D"));
        this.f1908h.setStyle(style);
        this.f1908h.setStrokeWidth(t100.d(3.2f));
        this.f1908h.setAntiAlias(true);
    }

    public ProfileIntegrityOptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1911k = t100.d(20.0f);
        this.f1912l = t100.d(20.0f);
        this.f1913m = t100.d(16.0f);
        this.f1914n = t100.d(3.0f);
    }

    public ProfileIntegrityOptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1911k = t100.d(20.0f);
        this.f1912l = t100.d(20.0f);
        this.f1913m = t100.d(16.0f);
        this.f1914n = t100.d(3.0f);
    }
}
