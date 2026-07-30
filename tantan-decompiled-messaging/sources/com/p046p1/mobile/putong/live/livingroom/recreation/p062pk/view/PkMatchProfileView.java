package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p147v.VImage;
import p149l.bt0;
import p149l.g5c0;
import p149l.i3c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkMatchProfileView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f51714a;

    /* JADX INFO: renamed from: b */
    public VImage f51715b;

    /* JADX INFO: renamed from: c */
    public VImage f51716c;

    /* JADX INFO: renamed from: d */
    public VImage f51717d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Integer> f51718e;

    /* JADX INFO: renamed from: f */
    public int f51719f;

    /* JADX INFO: renamed from: g */
    public long f51720g;

    /* JADX INFO: renamed from: h */
    public float f51721h;

    /* JADX INFO: renamed from: i */
    public float f51722i;

    /* JADX INFO: renamed from: j */
    public boolean f51723j;

    /* JADX INFO: renamed from: k */
    public float f51724k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f51725l;

    /* JADX INFO: renamed from: m */
    public Runnable f51726m;

    public PkMatchProfileView(@NonNull Context context) {
        super(context);
        this.f51718e = new ArrayList<>();
        this.f51720g = 1500L;
        this.f51721h = 0.66f;
        this.f51722i = 1.0f;
        this.f51723j = true;
        this.f51726m = new Runnable() { // from class: l.mv70
            @Override // java.lang.Runnable
            public final void run() {
                this.f135885a.m76212j();
            }
        };
    }

    private int getNextPic() {
        if (this.f51719f < 0 || this.f51718e.size() <= 1) {
            return 0;
        }
        int i = this.f51719f + 1;
        int size = this.f51718e.size();
        ArrayList<Integer> arrayList = this.f51718e;
        return i >= size ? arrayList.get(0).intValue() : arrayList.get(this.f51719f + 1).intValue();
    }

    /* JADX INFO: renamed from: b */
    public void m76204b(long j) {
        postDelayed(this.f51726m, j);
    }

    /* JADX INFO: renamed from: c */
    public final void m76205c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f51725l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nv70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f140690a.m76206d(valueAnimator);
            }
        });
        this.f51725l.setRepeatMode(1);
        this.f51725l.setRepeatCount(-1);
        this.f51725l.setDuration(this.f51720g);
        this.f51725l.start();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m76206d(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f51724k = fFloatValue;
        float f = this.f51721h;
        boolean z = this.f51723j;
        if (fFloatValue <= f) {
            if (z) {
                this.f51723j = false;
                this.f51722i *= -1.0f;
                this.f51719f = this.f51719f + 1 < this.f51718e.size() ? this.f51719f + 1 : 0;
            }
            this.f51714a.setImageResource(this.f51718e.get(this.f51719f).intValue());
            return;
        }
        if (!z) {
            this.f51723j = true;
        }
        int nextPic = getNextPic();
        if (nextPic == 0) {
            return;
        }
        this.f51715b.setImageResource(nextPic);
        float f2 = this.f51724k;
        float f3 = this.f51721h;
        float f4 = ((f2 - f3) / (1.0f - f3)) * 180.0f * this.f51722i;
        VImage vImage = this.f51714a;
        vImage.setPivotX(vImage.getWidth() / 2);
        VImage vImage2 = this.f51714a;
        vImage2.setPivotY(vImage2.getHeight() * 1.2f);
        this.f51714a.setRotation(f4);
        this.f51714a.setImageResource(this.f51718e.get(this.f51719f).intValue());
    }

    /* JADX INFO: renamed from: e */
    public final void m76207e() {
        this.f51716c.setScaleX(0.0f);
        this.f51717d.setScaleX(0.0f);
        bt0.m103739l(this.f51716c, bt0.f77162i, 0L, 400L, new LinearInterpolator(), 0.0f, 1.0f).start();
        bt0.m103739l(this.f51717d, bt0.f77162i, 200L, 800L, new BounceInterpolator(), 0.0f, 1.0f).start();
    }

    /* JADX INFO: renamed from: f */
    public void m76208f() {
        xdl0.m208344M(this.f51716c, true);
        xdl0.m208344M(this.f51717d, true);
        xdl0.m208345M0(this, true);
        m76207e();
    }

    /* JADX INFO: renamed from: g */
    public void m76209g() {
        m76204b(1000L);
        m76208f();
    }

    /* JADX INFO: renamed from: h */
    public void m76210h() {
        m76212j();
    }

    /* JADX INFO: renamed from: i */
    public void m76211i() {
        removeCallbacks(this.f51726m);
        this.f51725l.start();
        xdl0.m208344M(this.f51716c, false);
        xdl0.m208344M(this.f51717d, false);
        xdl0.m208344M(this.f51714a, true);
        xdl0.m208344M(this.f51715b, true);
        xdl0.m208345M0(this, true);
    }

    /* JADX INFO: renamed from: j */
    public void m76212j() {
        this.f51725l.end();
        xdl0.m208344M(this.f51714a, false);
        xdl0.m208344M(this.f51715b, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f51725l.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f51714a = (VImage) findViewById(g5c0.f100837W0);
        this.f51715b = (VImage) findViewById(g5c0.f100957i4);
        this.f51716c = (VImage) findViewById(g5c0.f100640A1);
        VImage vImage = (VImage) findViewById(g5c0.f100649B1);
        this.f51717d = vImage;
        xdl0.m208344M(vImage, false);
        xdl0.m208344M(this.f51716c, false);
        this.f51718e.add(Integer.valueOf(i3c0.f110967c5));
        this.f51718e.add(Integer.valueOf(i3c0.f110979d5));
        this.f51718e.add(Integer.valueOf(i3c0.f110991e5));
        m76205c();
    }

    public PkMatchProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51718e = new ArrayList<>();
        this.f51720g = 1500L;
        this.f51721h = 0.66f;
        this.f51722i = 1.0f;
        this.f51723j = true;
        this.f51726m = new Runnable() { // from class: l.mv70
            @Override // java.lang.Runnable
            public final void run() {
                this.f135885a.m76212j();
            }
        };
    }

    public PkMatchProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51718e = new ArrayList<>();
        this.f51720g = 1500L;
        this.f51721h = 0.66f;
        this.f51722i = 1.0f;
        this.f51723j = true;
        this.f51726m = new Runnable() { // from class: l.mv70
            @Override // java.lang.Runnable
            public final void run() {
                this.f135885a.m76212j();
            }
        };
    }
}
