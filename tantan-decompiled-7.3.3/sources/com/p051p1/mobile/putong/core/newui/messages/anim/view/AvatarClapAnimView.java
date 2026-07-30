package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.NullChecker;
import p153l.ibc0;
import p153l.qa00;
import p153l.w600;

/* JADX INFO: loaded from: classes11.dex */
public class AvatarClapAnimView extends FrameLayout implements w600.InterfaceC21034d {

    /* JADX INFO: renamed from: l */
    public static float f26149l = 0.6f;

    /* JADX INFO: renamed from: m */
    public static float f26150m = 0.7f;

    /* JADX INFO: renamed from: a */
    public int f26151a;

    /* JADX INFO: renamed from: b */
    public AppCompatImageView f26152b;

    /* JADX INFO: renamed from: c */
    public int f26153c;

    /* JADX INFO: renamed from: d */
    public int f26154d;

    /* JADX INFO: renamed from: e */
    public Paint f26155e;

    /* JADX INFO: renamed from: f */
    public float f26156f;

    /* JADX INFO: renamed from: g */
    public float f26157g;

    /* JADX INFO: renamed from: h */
    public float f26158h;

    /* JADX INFO: renamed from: i */
    public float f26159i;

    /* JADX INFO: renamed from: j */
    public float f26160j;

    /* JADX INFO: renamed from: k */
    public float f26161k;

    public AvatarClapAnimView(Context context) {
        super(context);
        this.f26151a = 1;
        this.f26156f = 0.0f;
        this.f26161k = 1.0f;
        m42929b();
    }

    @Override // p153l.w600.InterfaceC21034d
    /* JADX INFO: renamed from: a */
    public void mo42928a(boolean z, float f, String str, String str2) {
        this.f26156f = f;
        invalidate();
        m42930c();
    }

    /* JADX INFO: renamed from: b */
    public final void m42929b() {
        this.f26159i = 0.254f;
        this.f26160j = 0.121f;
        this.f26157g = qa00.m175859d(4.0f);
        this.f26158h = qa00.m175859d(8.0f);
        setWillNotDraw(false);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f26152b = appCompatImageView;
        appCompatImageView.setImageResource(ibc0.f113841L);
        addView(this.f26152b, new FrameLayout.LayoutParams(-1, -1));
        this.f26152b.setPivotX(this.f26159i);
        this.f26152b.setPivotY(this.f26160j);
        Paint paint = new Paint();
        this.f26155e = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m42930c() {
        float f = this.f26156f;
        float f2 = 1.0f;
        if (f < 10.0f) {
            f2 = 1.0f - ((f / 10.0f) * 0.05f);
        } else if (f < 15.0f) {
            f2 = 0.95f;
        } else if (f < 25.0f) {
            f2 = 1.0f - (((25.0f - f) / 10.0f) * 0.05f);
        }
        this.f26152b.setScaleX(f2);
        this.f26152b.setScaleY(f2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f26154d <= 0 || this.f26153c <= 0) {
            return;
        }
        float f = this.f26156f;
        if (f >= 15.0f) {
            f = 30.0f - f;
        }
        float f2 = (f / 30.0f) + 1.0f;
        this.f26155e.setColor(Color.argb((int) (this.f26161k * 102.0f), 215, 77, 55));
        canvas.drawCircle(this.f26153c * f26149l, this.f26154d * f26150m, this.f26158h * f2, this.f26155e);
        this.f26155e.setColor(Color.argb((int) (this.f26161k * 179.0f), 215, 77, 55));
        canvas.drawCircle(this.f26153c * f26149l, this.f26154d * f26150m, this.f26157g * f2, this.f26155e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f26153c = View.MeasureSpec.getSize(i);
        this.f26154d = View.MeasureSpec.getSize(i2);
        this.f26152b.setTranslationX((int) (this.f26153c * (f26149l - this.f26159i)));
        this.f26152b.setTranslationY((int) (this.f26154d * (f26150m - this.f26160j)));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (NullChecker.m82486a(this.f26152b)) {
            this.f26152b.setAlpha(f);
        }
        this.f26161k = f;
        invalidate();
    }

    public AvatarClapAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26151a = 1;
        this.f26156f = 0.0f;
        this.f26161k = 1.0f;
        m42929b();
    }

    public AvatarClapAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26151a = 1;
        this.f26156f = 0.0f;
        this.f26161k = 1.0f;
        m42929b();
    }
}
