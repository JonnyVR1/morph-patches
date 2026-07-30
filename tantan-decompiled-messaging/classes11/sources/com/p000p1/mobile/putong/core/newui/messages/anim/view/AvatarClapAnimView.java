package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.t100;
import p009l.zxz;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AvatarClapAnimView extends FrameLayout implements zxz.InterfaceC1382d {

    /* JADX INFO: renamed from: l */
    public static float f4185l = 0.6f;

    /* JADX INFO: renamed from: m */
    public static float f4186m = 0.7f;

    /* JADX INFO: renamed from: a */
    public int f4187a;

    /* JADX INFO: renamed from: b */
    public AppCompatImageView f4188b;

    /* JADX INFO: renamed from: c */
    public int f4189c;

    /* JADX INFO: renamed from: d */
    public int f4190d;

    /* JADX INFO: renamed from: e */
    public Paint f4191e;

    /* JADX INFO: renamed from: f */
    public float f4192f;

    /* JADX INFO: renamed from: g */
    public float f4193g;

    /* JADX INFO: renamed from: h */
    public float f4194h;

    /* JADX INFO: renamed from: i */
    public float f4195i;

    /* JADX INFO: renamed from: j */
    public float f4196j;

    /* JADX INFO: renamed from: k */
    public float f4197k;

    public AvatarClapAnimView(Context context) {
        super(context);
        this.f4187a = 1;
        this.f4192f = 0.0f;
        this.f4197k = 1.0f;
        m6060b();
    }

    @Override // p009l.zxz.InterfaceC1382d
    /* JADX INFO: renamed from: a */
    public void mo6059a(boolean z, float f, String str, String str2) {
        this.f4192f = f;
        invalidate();
        m6061c();
    }

    /* JADX INFO: renamed from: b */
    public final void m6060b() {
        this.f4195i = 0.254f;
        this.f4196j = 0.121f;
        this.f4193g = t100.d(4.0f);
        this.f4194h = t100.d(8.0f);
        setWillNotDraw(false);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f4188b = appCompatImageView;
        appCompatImageView.setImageResource(c3c0.L);
        addView((View) this.f4188b, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        this.f4188b.setPivotX(this.f4195i);
        this.f4188b.setPivotY(this.f4196j);
        Paint paint = new Paint();
        this.f4191e = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m6061c() {
        float f = this.f4192f;
        float f2 = 1.0f;
        if (f < 10.0f) {
            f2 = 1.0f - ((f / 10.0f) * 0.05f);
        } else if (f < 15.0f) {
            f2 = 0.95f;
        } else if (f < 25.0f) {
            f2 = 1.0f - (((25.0f - f) / 10.0f) * 0.05f);
        }
        this.f4188b.setScaleX(f2);
        this.f4188b.setScaleY(f2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4190d <= 0 || this.f4189c <= 0) {
            return;
        }
        float f = this.f4192f;
        if (f >= 15.0f) {
            f = 30.0f - f;
        }
        float f2 = (f / 30.0f) + 1.0f;
        this.f4191e.setColor(Color.argb((int) (this.f4197k * 102.0f), 215, 77, 55));
        canvas.drawCircle(this.f4189c * f4185l, this.f4190d * f4186m, this.f4194h * f2, this.f4191e);
        this.f4191e.setColor(Color.argb((int) (this.f4197k * 179.0f), 215, 77, 55));
        canvas.drawCircle(this.f4189c * f4185l, this.f4190d * f4186m, this.f4193g * f2, this.f4191e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4189c = View.MeasureSpec.getSize(i);
        this.f4190d = View.MeasureSpec.getSize(i2);
        this.f4188b.setTranslationX((int) (this.f4189c * (f4185l - this.f4195i)));
        this.f4188b.setTranslationY((int) (this.f4190d * (f4186m - this.f4196j)));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (NullChecker.a(this.f4188b)) {
            this.f4188b.setAlpha(f);
        }
        this.f4197k = f;
        invalidate();
    }

    public AvatarClapAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4187a = 1;
        this.f4192f = 0.0f;
        this.f4197k = 1.0f;
        m6060b();
    }

    public AvatarClapAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4187a = 1;
        this.f4192f = 0.0f;
        this.f4197k = 1.0f;
        m6060b();
    }
}
