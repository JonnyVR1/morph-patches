package com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift;

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
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.base.data.BLivePosition;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawPanelView;
import java.util.ArrayList;
import java.util.List;
import p149l.e30;
import p149l.ffw;
import p149l.hxs;
import p149l.i3c0;
import p149l.jo0;
import p149l.lsi0;
import p149l.t100;
import p149l.vwb;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class DrawPanelView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f49572a;

    /* JADX INFO: renamed from: b */
    public Canvas f49573b;

    /* JADX INFO: renamed from: c */
    public Paint f49574c;

    /* JADX INFO: renamed from: d */
    public int f49575d;

    /* JADX INFO: renamed from: e */
    public int f49576e;

    /* JADX INFO: renamed from: f */
    public float f49577f;

    /* JADX INFO: renamed from: g */
    public float f49578g;

    /* JADX INFO: renamed from: h */
    public float f49579h;

    /* JADX INFO: renamed from: i */
    public Bitmap f49580i;

    /* JADX INFO: renamed from: j */
    public BLiveGiftExtraDrawInfo f49581j;

    /* JADX INFO: renamed from: k */
    public Rect f49582k;

    /* JADX INFO: renamed from: l */
    public List<BLivePosition> f49583l;

    /* JADX INFO: renamed from: m */
    public List<List<BLivePosition>> f49584m;

    /* JADX INFO: renamed from: n */
    public e30<Integer> f49585n;

    /* JADX INFO: renamed from: o */
    public int f49586o;

    /* JADX INFO: renamed from: p */
    public int f49587p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f49588q;

    /* JADX INFO: renamed from: r */
    public RectF f49589r;

    /* JADX INFO: renamed from: s */
    public boolean f49590s;

    /* JADX INFO: renamed from: t */
    public int f49591t;

    /* JADX INFO: renamed from: u */
    public String f49592u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawPanelView$a */
    public class C12795a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGiftExtraDrawInfo f49593a;

        public C12795a(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
            this.f49593a = bLiveGiftExtraDrawInfo;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            DrawPanelView.this.f49584m.add(new ArrayList(this.f49593a.coordinates));
        }
    }

    public DrawPanelView(Context context) {
        super(context);
        this.f49579h = t100.m186890d(30.0f);
        this.f49581j = BLiveGiftExtraDrawInfo.new_();
        this.f49583l = new ArrayList();
        this.f49584m = new ArrayList();
        this.f49586o = 0;
        this.f49590s = true;
        this.f49591t = ypv.m215672k().m195831f4();
        m73535o();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73521a(float f, float f2, float f3, BLivePosition bLivePosition) {
        bLivePosition.f44430x = (bLivePosition.f44430x * f) + f2;
        bLivePosition.f44431y = (bLivePosition.f44431y * f) + f3;
    }

    private List<BLivePosition> getGiftList() {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(this.f49584m)) {
            for (List<BLivePosition> list : this.f49584m) {
                if (!vwb.m200296J(list)) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m73526f(int i, int i2, boolean z, int i3) {
        if (this.f49586o == this.f49591t) {
            if (this.f49590s) {
                this.f49590s = false;
                lsi0.m151595y(String.format(getContext().getString(R$string.f47055X4), String.valueOf(this.f49591t)));
                return;
            }
            return;
        }
        float f = i;
        float f2 = this.f49579h;
        if (f <= f2 / 2.0f || f >= this.f49575d - (f2 / 2.0f)) {
            return;
        }
        float f3 = i2;
        if (f3 <= f2 / 2.0f || f3 >= this.f49576e - (f2 / 2.0f)) {
            return;
        }
        m73541u(z, i3);
        m73531k(f, f3, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m73527g(float f, float f2) {
        BLivePosition bLivePosition = new BLivePosition();
        bLivePosition.f44430x = f;
        bLivePosition.f44431y = f2;
        this.f49583l.add(bLivePosition);
    }

    public BLiveGiftExtraDrawInfo getDrawParam() {
        this.f49581j.coordinates = getGiftList();
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f49581j;
        bLiveGiftExtraDrawInfo.width = this.f49575d;
        bLiveGiftExtraDrawInfo.length = this.f49576e;
        bLiveGiftExtraDrawInfo.imgUrl = this.f49592u;
        return bLiveGiftExtraDrawInfo;
    }

    /* JADX INFO: renamed from: h */
    public void m73528h() {
        if (m73537q()) {
            this.f49588q.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m73529i() {
        if (this.f49572a != null) {
            if (m73537q()) {
                this.f49588q.cancel();
            }
            this.f49572a.eraseColor(0);
            this.f49584m.clear();
            this.f49581j.clear();
            m73541u(false, 0);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m73530j(List<BLivePosition> list) {
        list.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m73531k(float f, float f2, boolean z) {
        float f3 = (int) (this.f49579h / 2.0f);
        this.f49589r.set(f - f3, f2 - f3, f + f3, f3 + f2);
        this.f49573b.drawBitmap(this.f49580i, this.f49582k, this.f49589r, this.f49574c);
        this.f49577f = f;
        this.f49578g = f2;
        if (z) {
            m73527g(f, f2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m73532l(final BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        final float f;
        final float f2;
        m73529i();
        if (m73537q()) {
            this.f49588q.cancel();
        }
        this.f49587p = 0;
        int giftNum = bLiveGiftExtraDrawInfo.getGiftNum() * ypv.m215672k().m195871k4();
        this.f49588q = ValueAnimator.ofInt(0, giftNum).setDuration(giftNum);
        int i = this.f49575d;
        float f3 = bLiveGiftExtraDrawInfo.width;
        final float f4 = i / f3;
        int i2 = this.f49576e;
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
        vwb.m200354z(bLiveGiftExtraDrawInfo.coordinates, new e30() { // from class: l.bbe
            @Override // p149l.e30
            public final void call(Object obj) {
                DrawPanelView.m73521a(f4, f, f2, (BLivePosition) obj);
            }
        });
        this.f49588q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cbe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f80133a.m73538r(bLiveGiftExtraDrawInfo, valueAnimator);
            }
        });
        this.f49588q.start();
        this.f49588q.addListener(new C12795a(bLiveGiftExtraDrawInfo));
    }

    /* JADX INFO: renamed from: m */
    public final void m73533m(float f, float f2) {
        float f3 = f - this.f49577f;
        float f4 = f2 - this.f49578g;
        double dM73534n = m73534n(f3, f4);
        long jRound = Math.round(dM73534n / ((double) this.f49579h));
        double d = ((double) f3) / dM73534n;
        float f5 = this.f49579h;
        double d2 = d * ((double) f5);
        double d3 = (((double) f4) / dM73534n) * ((double) f5);
        for (int i = 1; i < jRound; i++) {
            m73526f((int) (((double) this.f49577f) + d2), (int) (((double) this.f49578g) + d3), true, 1);
        }
    }

    /* JADX INFO: renamed from: n */
    public final double m73534n(float f, float f2) {
        return Math.sqrt((f * f) + (f2 * f2));
    }

    /* JADX INFO: renamed from: o */
    public final void m73535o() {
        Paint paint = new Paint();
        this.f49574c = paint;
        paint.setAntiAlias(false);
        this.f49574c.setColor(Color.parseColor("#D81B60"));
        this.f49574c.setStyle(Paint.Style.STROKE);
        this.f49574c.setStrokeWidth(2.0f);
        this.f49589r = new RectF();
        m73544x();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f49572a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f49574c);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f49575d = i;
        this.f49576e = i2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m73537q()) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f49572a == null) {
                m73536p();
            }
            this.f49577f = x;
            this.f49578g = y;
            m73530j(this.f49583l);
            m73526f((int) x, (int) y, true, 1);
        } else if (action == 1) {
            m73543w();
        } else if (action == 2) {
            m73533m(x, y);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m73536p() {
        this.f49572a = Bitmap.createBitmap(this.f49575d, this.f49576e, Bitmap.Config.ARGB_8888);
        this.f49573b = new Canvas(this.f49572a);
    }

    /* JADX INFO: renamed from: q */
    public boolean m73537q() {
        ValueAnimator valueAnimator = this.f49588q;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m73538r(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, ValueAnimator valueAnimator) {
        this.f49587p = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m73542v(bLiveGiftExtraDrawInfo);
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m73539s(Bitmap bitmap) {
        if (bitmap == null) {
            m73544x();
        } else {
            setGiftBitmap(bitmap);
        }
        m73529i();
    }

    public void setGiftBitmap(Bitmap bitmap) {
        float f = this.f49579h;
        this.f49580i = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f, false);
        this.f49582k = new Rect(0, 0, this.f49580i.getWidth(), this.f49580i.getHeight());
    }

    public void setGiftUrl(String str) {
        this.f49592u = str;
        hxs.m133392e("context_livingAct", str).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.zae
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202343a.m73539s((Bitmap) obj);
            }
        }, new e30() { // from class: l.abe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68644a.m73540t((Throwable) obj);
            }
        }));
    }

    public void setNumberChageListener(e30<Integer> e30Var) {
        this.f49585n = e30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m73540t(Throwable th) {
        m73544x();
        m73529i();
    }

    /* JADX INFO: renamed from: u */
    public final void m73541u(boolean z, int i) {
        if (z) {
            this.f49586o += i;
        } else {
            this.f49586o = i;
        }
        if (i < this.f49591t) {
            this.f49590s = true;
        }
        e30<Integer> e30Var = this.f49585n;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(this.f49586o));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m73542v(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        if (this.f49572a == null) {
            m73536p();
        }
        this.f49572a.eraseColor(0);
        for (int i = 0; i < bLiveGiftExtraDrawInfo.getGiftNum(); i++) {
            BLivePosition item = bLiveGiftExtraDrawInfo.getItem(i);
            if (this.f49587p - (ypv.m215672k().m195871k4() * i) >= 0) {
                m73541u(false, i + 1);
                m73531k(item.f44430x, item.f44431y, false);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m73543w() {
        if (vwb.m200296J(this.f49583l)) {
            return;
        }
        this.f49584m.add(new ArrayList(this.f49583l));
        m73530j(this.f49583l);
    }

    /* JADX INFO: renamed from: x */
    public final void m73544x() {
        setGiftBitmap(BitmapFactory.decodeResource(getContext().getResources(), i3c0.f111024h2));
    }

    /* JADX INFO: renamed from: y */
    public void m73545y() {
        if (vwb.m200296J(this.f49584m)) {
            return;
        }
        List<List<BLivePosition>> list = this.f49584m;
        list.remove(list.size() - 1);
        this.f49572a.eraseColor(0);
        invalidate();
        if (vwb.m200296J(this.f49584m)) {
            m73541u(false, 0);
            return;
        }
        int i = 0;
        for (List<BLivePosition> list2 : this.f49584m) {
            if (!vwb.m200296J(list2)) {
                for (BLivePosition bLivePosition : list2) {
                    m73531k(bLivePosition.f44430x, bLivePosition.f44431y, false);
                    i++;
                }
            }
        }
        m73541u(false, i);
        invalidate();
    }

    public DrawPanelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49579h = t100.m186890d(30.0f);
        this.f49581j = BLiveGiftExtraDrawInfo.new_();
        this.f49583l = new ArrayList();
        this.f49584m = new ArrayList();
        this.f49586o = 0;
        this.f49590s = true;
        this.f49591t = ypv.m215672k().m195831f4();
        m73535o();
    }

    public DrawPanelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49579h = t100.m186890d(30.0f);
        this.f49581j = BLiveGiftExtraDrawInfo.new_();
        this.f49583l = new ArrayList();
        this.f49584m = new ArrayList();
        this.f49586o = 0;
        this.f49590s = true;
        this.f49591t = ypv.m215672k().m195831f4();
        m73535o();
    }
}
