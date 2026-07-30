package com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawPanelView;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p1.mobile.putong.live.base.data.BLivePosition;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.ffw;
import l.hxs;
import l.jo0;
import l.lsi0;
import l.t100;
import l.vwb;
import l.ypv;
import p002l.i3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DrawPanelView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f5614a;

    /* JADX INFO: renamed from: b */
    public Canvas f5615b;

    /* JADX INFO: renamed from: c */
    public Paint f5616c;

    /* JADX INFO: renamed from: d */
    public int f5617d;

    /* JADX INFO: renamed from: e */
    public int f5618e;

    /* JADX INFO: renamed from: f */
    public float f5619f;

    /* JADX INFO: renamed from: g */
    public float f5620g;

    /* JADX INFO: renamed from: h */
    public float f5621h;

    /* JADX INFO: renamed from: i */
    public Bitmap f5622i;

    /* JADX INFO: renamed from: j */
    public BLiveGiftExtraDrawInfo f5623j;

    /* JADX INFO: renamed from: k */
    public Rect f5624k;

    /* JADX INFO: renamed from: l */
    public List<BLivePosition> f5625l;

    /* JADX INFO: renamed from: m */
    public List<List<BLivePosition>> f5626m;

    /* JADX INFO: renamed from: n */
    public e30<Integer> f5627n;

    /* JADX INFO: renamed from: o */
    public int f5628o;

    /* JADX INFO: renamed from: p */
    public int f5629p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f5630q;

    /* JADX INFO: renamed from: r */
    public RectF f5631r;

    /* JADX INFO: renamed from: s */
    public boolean f5632s;

    /* JADX INFO: renamed from: t */
    public int f5633t;

    /* JADX INFO: renamed from: u */
    public String f5634u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawPanelView$a */
    public class C0384a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGiftExtraDrawInfo f5635a;

        public C0384a(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
            this.f5635a = bLiveGiftExtraDrawInfo;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            DrawPanelView.this.f5626m.add(new ArrayList(this.f5635a.coordinates));
        }
    }

    public DrawPanelView(Context context) {
        super(context);
        this.f5621h = t100.d(30.0f);
        this.f5623j = BLiveGiftExtraDrawInfo.new_();
        this.f5625l = new ArrayList();
        this.f5626m = new ArrayList();
        this.f5628o = 0;
        this.f5632s = true;
        this.f5633t = ypv.k().f4();
        m7079o();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7065a(float f, float f2, float f3, BLivePosition bLivePosition) {
        bLivePosition.x = (bLivePosition.x * f) + f2;
        bLivePosition.y = (bLivePosition.y * f) + f3;
    }

    private List<BLivePosition> getGiftList() {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(this.f5626m)) {
            for (List<BLivePosition> list : this.f5626m) {
                if (!vwb.J(list)) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m7070f(int i, int i2, boolean z, int i3) {
        if (this.f5628o == this.f5633t) {
            if (this.f5632s) {
                this.f5632s = false;
                lsi0.y(String.format(getContext().getString(R$string.f3097X4), String.valueOf(this.f5633t)));
                return;
            }
            return;
        }
        float f = i;
        float f2 = this.f5621h;
        if (f <= f2 / 2.0f || f >= this.f5617d - (f2 / 2.0f)) {
            return;
        }
        float f3 = i2;
        if (f3 <= f2 / 2.0f || f3 >= this.f5618e - (f2 / 2.0f)) {
            return;
        }
        m7085u(z, i3);
        m7075k(f, f3, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m7071g(float f, float f2) {
        BLivePosition bLivePosition = new BLivePosition();
        bLivePosition.x = f;
        bLivePosition.y = f2;
        this.f5625l.add(bLivePosition);
    }

    public BLiveGiftExtraDrawInfo getDrawParam() {
        this.f5623j.coordinates = getGiftList();
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f5623j;
        bLiveGiftExtraDrawInfo.width = this.f5617d;
        bLiveGiftExtraDrawInfo.length = this.f5618e;
        bLiveGiftExtraDrawInfo.imgUrl = this.f5634u;
        return bLiveGiftExtraDrawInfo;
    }

    /* JADX INFO: renamed from: h */
    public void m7072h() {
        if (m7081q()) {
            this.f5630q.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7073i() {
        if (this.f5614a != null) {
            if (m7081q()) {
                this.f5630q.cancel();
            }
            this.f5614a.eraseColor(0);
            this.f5626m.clear();
            this.f5623j.clear();
            m7085u(false, 0);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7074j(List<BLivePosition> list) {
        list.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m7075k(float f, float f2, boolean z) {
        float f3 = (int) (this.f5621h / 2.0f);
        this.f5631r.set(f - f3, f2 - f3, f + f3, f3 + f2);
        this.f5615b.drawBitmap(this.f5622i, this.f5624k, this.f5631r, this.f5616c);
        this.f5619f = f;
        this.f5620g = f2;
        if (z) {
            m7071g(f, f2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m7076l(final BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        final float f;
        final float f2;
        m7073i();
        if (m7081q()) {
            this.f5630q.cancel();
        }
        this.f5629p = 0;
        int giftNum = bLiveGiftExtraDrawInfo.getGiftNum() * ypv.k().k4();
        this.f5630q = ValueAnimator.ofInt(0, giftNum).setDuration(giftNum);
        int i = this.f5617d;
        float f3 = bLiveGiftExtraDrawInfo.width;
        final float f4 = i / f3;
        int i2 = this.f5618e;
        float f5 = bLiveGiftExtraDrawInfo.length;
        float f6 = i2 / f5;
        if (f4 > f6) {
            f = (i - (f3 * f6)) / 2.0f;
            f2 = (i2 - (f5 * f6)) / 2.0f;
            f4 = f6;
        } else {
            f = (i - (f3 * f4)) / 2.0f;
            f2 = (i2 - (f5 * f4)) / 2.0f;
        }
        vwb.z(bLiveGiftExtraDrawInfo.coordinates, new e30() { // from class: l.bbe
            public final void call(Object obj) {
                DrawPanelView.m7065a(f4, f, f2, (BLivePosition) obj);
            }
        });
        this.f5630q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cbe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8578a.m7082r(bLiveGiftExtraDrawInfo, valueAnimator);
            }
        });
        this.f5630q.start();
        this.f5630q.addListener(new C0384a(bLiveGiftExtraDrawInfo));
    }

    /* JADX INFO: renamed from: m */
    public final void m7077m(float f, float f2) {
        float f3 = f - this.f5619f;
        float f4 = f2 - this.f5620g;
        double dM7078n = m7078n(f3, f4);
        long jRound = Math.round(dM7078n / ((double) this.f5621h));
        double d = ((double) f3) / dM7078n;
        float f5 = this.f5621h;
        double d2 = d * ((double) f5);
        double d3 = (((double) f4) / dM7078n) * ((double) f5);
        for (int i = 1; i < jRound; i++) {
            m7070f((int) (((double) this.f5619f) + d2), (int) (((double) this.f5620g) + d3), true, 1);
        }
    }

    /* JADX INFO: renamed from: n */
    public final double m7078n(float f, float f2) {
        return Math.sqrt((f * f) + (f2 * f2));
    }

    /* JADX INFO: renamed from: o */
    public final void m7079o() {
        Paint paint = new Paint();
        this.f5616c = paint;
        paint.setAntiAlias(false);
        this.f5616c.setColor(Color.parseColor("#D81B60"));
        this.f5616c.setStyle(Paint.Style.STROKE);
        this.f5616c.setStrokeWidth(2.0f);
        this.f5631r = new RectF();
        m7088x();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f5614a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f5616c);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5617d = i;
        this.f5618e = i2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m7081q()) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f5614a == null) {
                m7080p();
            }
            this.f5619f = x;
            this.f5620g = y;
            m7074j(this.f5625l);
            m7070f((int) x, (int) y, true, 1);
        } else if (action == 1) {
            m7087w();
        } else if (action == 2) {
            m7077m(x, y);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m7080p() {
        this.f5614a = Bitmap.createBitmap(this.f5617d, this.f5618e, Bitmap.Config.ARGB_8888);
        this.f5615b = new Canvas(this.f5614a);
    }

    /* JADX INFO: renamed from: q */
    public boolean m7081q() {
        ValueAnimator valueAnimator = this.f5630q;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7082r(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, ValueAnimator valueAnimator) {
        this.f5629p = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m7086v(bLiveGiftExtraDrawInfo);
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7083s(Bitmap bitmap) {
        if (bitmap == null) {
            m7088x();
        } else {
            setGiftBitmap(bitmap);
        }
        m7073i();
    }

    public void setGiftBitmap(Bitmap bitmap) {
        float f = this.f5621h;
        this.f5622i = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f, false);
        this.f5624k = new Rect(0, 0, this.f5622i.getWidth(), this.f5622i.getHeight());
    }

    public void setGiftUrl(String str) {
        this.f5634u = str;
        hxs.e("context_livingAct", str).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.zae
            public final void call(Object obj) {
                this.f23321a.m7083s((Bitmap) obj);
            }
        }, new e30() { // from class: l.abe
            public final void call(Object obj) {
                this.f7483a.m7084t((Throwable) obj);
            }
        }));
    }

    public void setNumberChageListener(e30<Integer> e30Var) {
        this.f5627n = e30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7084t(Throwable th) {
        m7088x();
        m7073i();
    }

    /* JADX INFO: renamed from: u */
    public final void m7085u(boolean z, int i) {
        if (z) {
            this.f5628o += i;
        } else {
            this.f5628o = i;
        }
        if (i < this.f5633t) {
            this.f5632s = true;
        }
        e30<Integer> e30Var = this.f5627n;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(this.f5628o));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m7086v(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        if (this.f5614a == null) {
            m7080p();
        }
        this.f5614a.eraseColor(0);
        for (int i = 0; i < bLiveGiftExtraDrawInfo.getGiftNum(); i++) {
            BLivePosition item = bLiveGiftExtraDrawInfo.getItem(i);
            if (this.f5629p - (ypv.k().k4() * i) >= 0) {
                m7085u(false, i + 1);
                m7075k(item.x, item.y, false);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m7087w() {
        if (vwb.J(this.f5625l)) {
            return;
        }
        this.f5626m.add(new ArrayList(this.f5625l));
        m7074j(this.f5625l);
    }

    /* JADX INFO: renamed from: x */
    public final void m7088x() {
        setGiftBitmap(BitmapFactory.decodeResource(getContext().getResources(), i3c0.f12809h2));
    }

    /* JADX INFO: renamed from: y */
    public void m7089y() {
        if (vwb.J(this.f5626m)) {
            return;
        }
        List<List<BLivePosition>> list = this.f5626m;
        list.remove(list.size() - 1);
        this.f5614a.eraseColor(0);
        invalidate();
        if (vwb.J(this.f5626m)) {
            m7085u(false, 0);
            return;
        }
        int i = 0;
        for (List<BLivePosition> list2 : this.f5626m) {
            if (!vwb.J(list2)) {
                for (BLivePosition bLivePosition : list2) {
                    m7075k(bLivePosition.x, bLivePosition.y, false);
                    i++;
                }
            }
        }
        m7085u(false, i);
        invalidate();
    }

    public DrawPanelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5621h = t100.d(30.0f);
        this.f5623j = BLiveGiftExtraDrawInfo.new_();
        this.f5625l = new ArrayList();
        this.f5626m = new ArrayList();
        this.f5628o = 0;
        this.f5632s = true;
        this.f5633t = ypv.k().f4();
        m7079o();
    }

    public DrawPanelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5621h = t100.d(30.0f);
        this.f5623j = BLiveGiftExtraDrawInfo.new_();
        this.f5625l = new ArrayList();
        this.f5626m = new ArrayList();
        this.f5628o = 0;
        this.f5632s = true;
        this.f5633t = ypv.k().f4();
        m7079o();
    }
}
