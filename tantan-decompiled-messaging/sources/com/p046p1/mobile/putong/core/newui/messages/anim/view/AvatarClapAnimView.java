package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.NullChecker;
import p149l.c3c0;
import p149l.t100;
import p149l.zxz;

/* JADX INFO: loaded from: classes11.dex */
public class AvatarClapAnimView extends FrameLayout implements zxz.InterfaceC21817d {

    /* JADX INFO: renamed from: l */
    public static float f25407l = 0.6f;

    /* JADX INFO: renamed from: m */
    public static float f25408m = 0.7f;

    /* JADX INFO: renamed from: a */
    public int f25409a;

    /* JADX INFO: renamed from: b */
    public AppCompatImageView f25410b;

    /* JADX INFO: renamed from: c */
    public int f25411c;

    /* JADX INFO: renamed from: d */
    public int f25412d;

    /* JADX INFO: renamed from: e */
    public Paint f25413e;

    /* JADX INFO: renamed from: f */
    public float f25414f;

    /* JADX INFO: renamed from: g */
    public float f25415g;

    /* JADX INFO: renamed from: h */
    public float f25416h;

    /* JADX INFO: renamed from: i */
    public float f25417i;

    /* JADX INFO: renamed from: j */
    public float f25418j;

    /* JADX INFO: renamed from: k */
    public float f25419k;

    public AvatarClapAnimView(Context context) {
        super(context);
        this.f25409a = 1;
        this.f25414f = 0.0f;
        this.f25419k = 1.0f;
        m41918b();
    }

    @Override // p149l.zxz.InterfaceC21817d
    /* JADX INFO: renamed from: a */
    public void mo41917a(boolean z, float f, String str, String str2) {
        this.f25414f = f;
        invalidate();
        m41919c();
    }

    /* JADX INFO: renamed from: b */
    public final void m41918b() {
        this.f25417i = 0.254f;
        this.f25418j = 0.121f;
        this.f25415g = t100.m186890d(4.0f);
        this.f25416h = t100.m186890d(8.0f);
        setWillNotDraw(false);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f25410b = appCompatImageView;
        appCompatImageView.setImageResource(c3c0.f78566L);
        addView(this.f25410b, new FrameLayout.LayoutParams(-1, -1));
        this.f25410b.setPivotX(this.f25417i);
        this.f25410b.setPivotY(this.f25418j);
        Paint paint = new Paint();
        this.f25413e = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m41919c() {
        float f = this.f25414f;
        float f2 = 1.0f;
        if (f < 10.0f) {
            f2 = 1.0f - ((f / 10.0f) * 0.05f);
        } else if (f < 15.0f) {
            f2 = 0.95f;
        } else if (f < 25.0f) {
            f2 = 1.0f - (((25.0f - f) / 10.0f) * 0.05f);
        }
        this.f25410b.setScaleX(f2);
        this.f25410b.setScaleY(f2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f25412d <= 0 || this.f25411c <= 0) {
            return;
        }
        float f = this.f25414f;
        if (f >= 15.0f) {
            f = 30.0f - f;
        }
        float f2 = (f / 30.0f) + 1.0f;
        this.f25413e.setColor(Color.argb((int) (this.f25419k * 102.0f), 215, 77, 55));
        canvas.drawCircle(this.f25411c * f25407l, this.f25412d * f25408m, this.f25416h * f2, this.f25413e);
        this.f25413e.setColor(Color.argb((int) (this.f25419k * 179.0f), 215, 77, 55));
        canvas.drawCircle(this.f25411c * f25407l, this.f25412d * f25408m, this.f25415g * f2, this.f25413e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f25411c = View.MeasureSpec.getSize(i);
        this.f25412d = View.MeasureSpec.getSize(i2);
        this.f25410b.setTranslationX((int) (this.f25411c * (f25407l - this.f25417i)));
        this.f25410b.setTranslationY((int) (this.f25412d * (f25408m - this.f25418j)));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (NullChecker.m81303a(this.f25410b)) {
            this.f25410b.setAlpha(f);
        }
        this.f25419k = f;
        invalidate();
    }

    public AvatarClapAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25409a = 1;
        this.f25414f = 0.0f;
        this.f25419k = 1.0f;
        m41918b();
    }

    public AvatarClapAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25409a = 1;
        this.f25414f = 0.0f;
        this.f25419k = 1.0f;
        m41918b();
    }
}
