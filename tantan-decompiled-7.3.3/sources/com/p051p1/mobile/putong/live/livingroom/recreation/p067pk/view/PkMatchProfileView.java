package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p151v.VImage;
import p153l.bnl0;
import p153l.gt0;
import p153l.mdc0;
import p153l.obc0;

/* JADX INFO: loaded from: classes5.dex */
public class PkMatchProfileView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f52562a;

    /* JADX INFO: renamed from: b */
    public VImage f52563b;

    /* JADX INFO: renamed from: c */
    public VImage f52564c;

    /* JADX INFO: renamed from: d */
    public VImage f52565d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Integer> f52566e;

    /* JADX INFO: renamed from: f */
    public int f52567f;

    /* JADX INFO: renamed from: g */
    public long f52568g;

    /* JADX INFO: renamed from: h */
    public float f52569h;

    /* JADX INFO: renamed from: i */
    public float f52570i;

    /* JADX INFO: renamed from: j */
    public boolean f52571j;

    /* JADX INFO: renamed from: k */
    public float f52572k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f52573l;

    /* JADX INFO: renamed from: m */
    public Runnable f52574m;

    public PkMatchProfileView(@NonNull Context context) {
        super(context);
        this.f52566e = new ArrayList<>();
        this.f52568g = 1500L;
        this.f52569h = 0.66f;
        this.f52570i = 1.0f;
        this.f52571j = true;
        this.f52574m = new Runnable() { // from class: l.s380
            @Override // java.lang.Runnable
            public final void run() {
                this.f165986a.m77395j();
            }
        };
    }

    private int getNextPic() {
        if (this.f52567f < 0 || this.f52566e.size() <= 1) {
            return 0;
        }
        int i = this.f52567f + 1;
        int size = this.f52566e.size();
        ArrayList<Integer> arrayList = this.f52566e;
        return i >= size ? arrayList.get(0).intValue() : arrayList.get(this.f52567f + 1).intValue();
    }

    /* JADX INFO: renamed from: b */
    public void m77387b(long j) {
        postDelayed(this.f52574m, j);
    }

    /* JADX INFO: renamed from: c */
    public final void m77388c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52573l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t380
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f171906a.m77389d(valueAnimator);
            }
        });
        this.f52573l.setRepeatMode(1);
        this.f52573l.setRepeatCount(-1);
        this.f52573l.setDuration(this.f52568g);
        this.f52573l.start();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m77389d(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f52572k = fFloatValue;
        float f = this.f52569h;
        boolean z = this.f52571j;
        if (fFloatValue <= f) {
            if (z) {
                this.f52571j = false;
                this.f52570i *= -1.0f;
                this.f52567f = this.f52567f + 1 < this.f52566e.size() ? this.f52567f + 1 : 0;
            }
            this.f52562a.setImageResource(this.f52566e.get(this.f52567f).intValue());
            return;
        }
        if (!z) {
            this.f52571j = true;
        }
        int nextPic = getNextPic();
        if (nextPic == 0) {
            return;
        }
        this.f52563b.setImageResource(nextPic);
        float f2 = this.f52572k;
        float f3 = this.f52569h;
        float f4 = ((f2 - f3) / (1.0f - f3)) * 180.0f * this.f52570i;
        VImage vImage = this.f52562a;
        vImage.setPivotX(vImage.getWidth() / 2);
        VImage vImage2 = this.f52562a;
        vImage2.setPivotY(vImage2.getHeight() * 1.2f);
        this.f52562a.setRotation(f4);
        this.f52562a.setImageResource(this.f52566e.get(this.f52567f).intValue());
    }

    /* JADX INFO: renamed from: e */
    public final void m77390e() {
        this.f52564c.setScaleX(0.0f);
        this.f52565d.setScaleX(0.0f);
        gt0.m132166l(this.f52564c, gt0.f106354i, 0L, 400L, new LinearInterpolator(), 0.0f, 1.0f).start();
        gt0.m132166l(this.f52565d, gt0.f106354i, 200L, 800L, new BounceInterpolator(), 0.0f, 1.0f).start();
    }

    /* JADX INFO: renamed from: f */
    public void m77391f() {
        bnl0.m105524M(this.f52564c, true);
        bnl0.m105524M(this.f52565d, true);
        bnl0.m105525M0(this, true);
        m77390e();
    }

    /* JADX INFO: renamed from: g */
    public void m77392g() {
        m77387b(1000L);
        m77391f();
    }

    /* JADX INFO: renamed from: h */
    public void m77393h() {
        m77395j();
    }

    /* JADX INFO: renamed from: i */
    public void m77394i() {
        removeCallbacks(this.f52574m);
        this.f52573l.start();
        bnl0.m105524M(this.f52564c, false);
        bnl0.m105524M(this.f52565d, false);
        bnl0.m105524M(this.f52562a, true);
        bnl0.m105524M(this.f52563b, true);
        bnl0.m105525M0(this, true);
    }

    /* JADX INFO: renamed from: j */
    public void m77395j() {
        this.f52573l.end();
        bnl0.m105524M(this.f52562a, false);
        bnl0.m105524M(this.f52563b, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f52573l.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52562a = (VImage) findViewById(mdc0.f136082W0);
        this.f52563b = (VImage) findViewById(mdc0.f136202i4);
        this.f52564c = (VImage) findViewById(mdc0.f135885A1);
        VImage vImage = (VImage) findViewById(mdc0.f135894B1);
        this.f52565d = vImage;
        bnl0.m105524M(vImage, false);
        bnl0.m105524M(this.f52564c, false);
        this.f52566e.add(Integer.valueOf(obc0.f146295c5));
        this.f52566e.add(Integer.valueOf(obc0.f146307d5));
        this.f52566e.add(Integer.valueOf(obc0.f146319e5));
        m77388c();
    }

    public PkMatchProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52566e = new ArrayList<>();
        this.f52568g = 1500L;
        this.f52569h = 0.66f;
        this.f52570i = 1.0f;
        this.f52571j = true;
        this.f52574m = new Runnable() { // from class: l.s380
            @Override // java.lang.Runnable
            public final void run() {
                this.f165986a.m77395j();
            }
        };
    }

    public PkMatchProfileView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52566e = new ArrayList<>();
        this.f52568g = 1500L;
        this.f52569h = 0.66f;
        this.f52570i = 1.0f;
        this.f52571j = true;
        this.f52574m = new Runnable() { // from class: l.s380
            @Override // java.lang.Runnable
            public final void run() {
                this.f165986a.m77395j();
            }
        };
    }
}
