package com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.base.data.BLivePosition;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawPanelView;
import java.util.ArrayList;
import java.util.List;
import p153l.dhw;
import p153l.fo0;
import p153l.izs;
import p153l.jyb;
import p153l.o1j0;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class DrawPanelView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f50420a;

    /* JADX INFO: renamed from: b */
    public Canvas f50421b;

    /* JADX INFO: renamed from: c */
    public Paint f50422c;

    /* JADX INFO: renamed from: d */
    public int f50423d;

    /* JADX INFO: renamed from: e */
    public int f50424e;

    /* JADX INFO: renamed from: f */
    public float f50425f;

    /* JADX INFO: renamed from: g */
    public float f50426g;

    /* JADX INFO: renamed from: h */
    public float f50427h;

    /* JADX INFO: renamed from: i */
    public Bitmap f50428i;

    /* JADX INFO: renamed from: j */
    public BLiveGiftExtraDrawInfo f50429j;

    /* JADX INFO: renamed from: k */
    public Rect f50430k;

    /* JADX INFO: renamed from: l */
    public List<BLivePosition> f50431l;

    /* JADX INFO: renamed from: m */
    public List<List<BLivePosition>> f50432m;

    /* JADX INFO: renamed from: n */
    public y20<Integer> f50433n;

    /* JADX INFO: renamed from: o */
    public int f50434o;

    /* JADX INFO: renamed from: p */
    public int f50435p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f50436q;

    /* JADX INFO: renamed from: r */
    public RectF f50437r;

    /* JADX INFO: renamed from: s */
    public boolean f50438s;

    /* JADX INFO: renamed from: t */
    public int f50439t;

    /* JADX INFO: renamed from: u */
    public String f50440u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawPanelView$a */
    public class C12958a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGiftExtraDrawInfo f50441a;

        public C12958a(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
            this.f50441a = bLiveGiftExtraDrawInfo;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            DrawPanelView.this.f50432m.add(new ArrayList(this.f50441a.coordinates));
        }
    }

    public DrawPanelView(Context context) {
        super(context);
        this.f50427h = qa00.m175859d(30.0f);
        this.f50429j = BLiveGiftExtraDrawInfo.new_();
        this.f50431l = new ArrayList();
        this.f50432m = new ArrayList();
        this.f50434o = 0;
        this.f50438s = true;
        this.f50439t = zrv.m221193k().m203618f4();
        m74718o();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m74704a(float f, float f2, float f3, BLivePosition bLivePosition) {
        bLivePosition.f45278x = (bLivePosition.f45278x * f) + f2;
        bLivePosition.f45279y = (bLivePosition.f45279y * f) + f3;
    }

    private List<BLivePosition> getGiftList() {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(this.f50432m)) {
            for (List<BLivePosition> list : this.f50432m) {
                if (!jyb.m147479J(list)) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m74709f(int i, int i2, boolean z, int i3) {
        if (this.f50434o == this.f50439t) {
            if (this.f50438s) {
                this.f50438s = false;
                o1j0.m165651y(String.format(getContext().getString(R$string.f47903X4), String.valueOf(this.f50439t)));
                return;
            }
            return;
        }
        float f = i;
        float f2 = this.f50427h;
        if (f <= f2 / 2.0f || f >= this.f50423d - (f2 / 2.0f)) {
            return;
        }
        float f3 = i2;
        if (f3 <= f2 / 2.0f || f3 >= this.f50424e - (f2 / 2.0f)) {
            return;
        }
        m74724u(z, i3);
        m74714k(f, f3, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m74710g(float f, float f2) {
        BLivePosition bLivePosition = new BLivePosition();
        bLivePosition.f45278x = f;
        bLivePosition.f45279y = f2;
        this.f50431l.add(bLivePosition);
    }

    public BLiveGiftExtraDrawInfo getDrawParam() {
        this.f50429j.coordinates = getGiftList();
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f50429j;
        bLiveGiftExtraDrawInfo.width = this.f50423d;
        bLiveGiftExtraDrawInfo.length = this.f50424e;
        bLiveGiftExtraDrawInfo.imgUrl = this.f50440u;
        return bLiveGiftExtraDrawInfo;
    }

    /* JADX INFO: renamed from: h */
    public void m74711h() {
        if (m74720q()) {
            this.f50436q.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m74712i() {
        if (this.f50420a != null) {
            if (m74720q()) {
                this.f50436q.cancel();
            }
            this.f50420a.eraseColor(0);
            this.f50432m.clear();
            this.f50429j.clear();
            m74724u(false, 0);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m74713j(List<BLivePosition> list) {
        list.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m74714k(float f, float f2, boolean z) {
        float f3 = (int) (this.f50427h / 2.0f);
        this.f50437r.set(f - f3, f2 - f3, f + f3, f3 + f2);
        this.f50421b.drawBitmap(this.f50428i, this.f50430k, this.f50437r, this.f50422c);
        this.f50425f = f;
        this.f50426g = f2;
        if (z) {
            m74710g(f, f2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m74715l(final BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        final float f;
        final float f2;
        m74712i();
        if (m74720q()) {
            this.f50436q.cancel();
        }
        this.f50435p = 0;
        int giftNum = bLiveGiftExtraDrawInfo.getGiftNum() * zrv.m221193k().m203658k4();
        this.f50436q = ValueAnimator.ofInt(0, giftNum).setDuration(giftNum);
        int i = this.f50423d;
        float f3 = bLiveGiftExtraDrawInfo.width;
        final float f4 = i / f3;
        int i2 = this.f50424e;
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
        jyb.m147537z(bLiveGiftExtraDrawInfo.coordinates, new y20() { // from class: l.fce
            @Override // p153l.y20
            public final void call(Object obj) {
                DrawPanelView.m74704a(f4, f, f2, (BLivePosition) obj);
            }
        });
        this.f50436q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gce
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f103560a.m74721r(bLiveGiftExtraDrawInfo, valueAnimator);
            }
        });
        this.f50436q.start();
        this.f50436q.addListener(new C12958a(bLiveGiftExtraDrawInfo));
    }

    /* JADX INFO: renamed from: m */
    public final void m74716m(float f, float f2) {
        float f3 = f - this.f50425f;
        float f4 = f2 - this.f50426g;
        double dM74717n = m74717n(f3, f4);
        long jRound = Math.round(dM74717n / ((double) this.f50427h));
        double d = ((double) f3) / dM74717n;
        float f5 = this.f50427h;
        double d2 = d * ((double) f5);
        double d3 = (((double) f4) / dM74717n) * ((double) f5);
        for (int i = 1; i < jRound; i++) {
            m74709f((int) (((double) this.f50425f) + d2), (int) (((double) this.f50426g) + d3), true, 1);
        }
    }

    /* JADX INFO: renamed from: n */
    public final double m74717n(float f, float f2) {
        return Math.sqrt((f * f) + (f2 * f2));
    }

    /* JADX INFO: renamed from: o */
    public final void m74718o() {
        Paint paint = new Paint();
        this.f50422c = paint;
        paint.setAntiAlias(false);
        this.f50422c.setColor(Color.parseColor("#D81B60"));
        this.f50422c.setStyle(Paint.Style.STROKE);
        this.f50422c.setStrokeWidth(2.0f);
        this.f50437r = new RectF();
        m74727x();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f50420a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f50422c);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f50423d = i;
        this.f50424e = i2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m74720q()) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f50420a == null) {
                m74719p();
            }
            this.f50425f = x;
            this.f50426g = y;
            m74713j(this.f50431l);
            m74709f((int) x, (int) y, true, 1);
        } else if (action == 1) {
            m74726w();
        } else if (action == 2) {
            m74716m(x, y);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m74719p() {
        this.f50420a = Bitmap.createBitmap(this.f50423d, this.f50424e, Bitmap.Config.ARGB_8888);
        this.f50421b = new Canvas(this.f50420a);
    }

    /* JADX INFO: renamed from: q */
    public boolean m74720q() {
        ValueAnimator valueAnimator = this.f50436q;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m74721r(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, ValueAnimator valueAnimator) {
        this.f50435p = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m74725v(bLiveGiftExtraDrawInfo);
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m74722s(Bitmap bitmap) {
        if (bitmap == null) {
            m74727x();
        } else {
            setGiftBitmap(bitmap);
        }
        m74712i();
    }

    public void setGiftBitmap(Bitmap bitmap) {
        float f = this.f50427h;
        this.f50428i = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f, false);
        this.f50430k = new Rect(0, 0, this.f50428i.getWidth(), this.f50428i.getHeight());
    }

    public void setGiftUrl(String str) {
        this.f50440u = str;
        izs.m142854e("context_livingAct", str).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.dce
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87779a.m74722s((Bitmap) obj);
            }
        }, new y20() { // from class: l.ece
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93030a.m74723t((Throwable) obj);
            }
        }));
    }

    public void setNumberChageListener(y20<Integer> y20Var) {
        this.f50433n = y20Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m74723t(Throwable th) {
        m74727x();
        m74712i();
    }

    /* JADX INFO: renamed from: u */
    public final void m74724u(boolean z, int i) {
        if (z) {
            this.f50434o += i;
        } else {
            this.f50434o = i;
        }
        if (i < this.f50439t) {
            this.f50438s = true;
        }
        y20<Integer> y20Var = this.f50433n;
        if (y20Var != null) {
            y20Var.call(Integer.valueOf(this.f50434o));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m74725v(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        if (this.f50420a == null) {
            m74719p();
        }
        this.f50420a.eraseColor(0);
        for (int i = 0; i < bLiveGiftExtraDrawInfo.getGiftNum(); i++) {
            BLivePosition item = bLiveGiftExtraDrawInfo.getItem(i);
            if (this.f50435p - (zrv.m221193k().m203658k4() * i) >= 0) {
                m74724u(false, i + 1);
                m74714k(item.f45278x, item.f45279y, false);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m74726w() {
        if (jyb.m147479J(this.f50431l)) {
            return;
        }
        this.f50432m.add(new ArrayList(this.f50431l));
        m74713j(this.f50431l);
    }

    /* JADX INFO: renamed from: x */
    public final void m74727x() {
        setGiftBitmap(BitmapFactory.decodeResource(getContext().getResources(), obc0.f146352h2));
    }

    /* JADX INFO: renamed from: y */
    public void m74728y() {
        if (jyb.m147479J(this.f50432m)) {
            return;
        }
        List<List<BLivePosition>> list = this.f50432m;
        list.remove(list.size() - 1);
        this.f50420a.eraseColor(0);
        invalidate();
        if (jyb.m147479J(this.f50432m)) {
            m74724u(false, 0);
            return;
        }
        int i = 0;
        for (List<BLivePosition> list2 : this.f50432m) {
            if (!jyb.m147479J(list2)) {
                for (BLivePosition bLivePosition : list2) {
                    m74714k(bLivePosition.f45278x, bLivePosition.f45279y, false);
                    i++;
                }
            }
        }
        m74724u(false, i);
        invalidate();
    }

    public DrawPanelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50427h = qa00.m175859d(30.0f);
        this.f50429j = BLiveGiftExtraDrawInfo.new_();
        this.f50431l = new ArrayList();
        this.f50432m = new ArrayList();
        this.f50434o = 0;
        this.f50438s = true;
        this.f50439t = zrv.m221193k().m203618f4();
        m74718o();
    }

    public DrawPanelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50427h = qa00.m175859d(30.0f);
        this.f50429j = BLiveGiftExtraDrawInfo.new_();
        this.f50431l = new ArrayList();
        this.f50432m = new ArrayList();
        this.f50434o = 0;
        this.f50438s = true;
        this.f50439t = zrv.m221193k().m203618f4();
        m74718o();
    }
}
