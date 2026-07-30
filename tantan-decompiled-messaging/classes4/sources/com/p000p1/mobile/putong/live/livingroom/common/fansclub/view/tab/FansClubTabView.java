package com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.tab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.vwb;
import p002l.chg;
import p002l.gyl;
import p002l.il5;
import p002l.mag;
import p002l.p9c0;
import p002l.rk5;
import p002l.z2m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansClubTabView extends View {

    /* JADX INFO: renamed from: a */
    public final List<chg> f5089a;

    /* JADX INFO: renamed from: b */
    public List<InterfaceC0347b> f5090b;

    /* JADX INFO: renamed from: c */
    public gyl f5091c;

    /* JADX INFO: renamed from: d */
    public z2m f5092d;

    /* JADX INFO: renamed from: e */
    public int f5093e;

    /* JADX INFO: renamed from: f */
    public int f5094f;

    /* JADX INFO: renamed from: g */
    public int f5095g;

    /* JADX INFO: renamed from: h */
    public Paint f5096h;

    /* JADX INFO: renamed from: i */
    public RectF f5097i;

    /* JADX INFO: renamed from: j */
    public boolean f5098j;

    /* JADX INFO: renamed from: k */
    public long f5099k;

    /* JADX INFO: renamed from: l */
    public float f5100l;

    /* JADX INFO: renamed from: m */
    public float f5101m;

    /* JADX INFO: renamed from: n */
    public float f5102n;

    /* JADX INFO: renamed from: o */
    public ViewConfiguration f5103o;

    /* JADX INFO: renamed from: p */
    public float f5104p;

    /* JADX INFO: renamed from: q */
    public mag f5105q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView$a */
    public class C0346a implements ViewPager.j {
        public C0346a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
            FansClubTabView.this.m6415t(i, f);
        }

        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView$b */
    public interface InterfaceC0347b {
        /* JADX INFO: renamed from: a */
        void mo6417a(int i);
    }

    public FansClubTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5089a = new ArrayList();
        this.f5090b = new ArrayList();
        this.f5091c = new rk5();
        this.f5092d = new il5();
        this.f5093e = 0;
        this.f5094f = 0;
        this.f5095g = 0;
        this.f5096h = new Paint();
        this.f5097i = new RectF();
        this.f5098j = true;
        this.f5102n = 0.0f;
        m6407l(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public void m6400e(InterfaceC0347b interfaceC0347b) {
        if (this.f5090b.contains(interfaceC0347b)) {
            return;
        }
        this.f5090b.add(interfaceC0347b);
    }

    /* JADX INFO: renamed from: f */
    public void m6401f(final ViewPager viewPager) {
        this.f5090b.clear();
        m6400e(new InterfaceC0347b() { // from class: l.ecg
            @Override // com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView.InterfaceC0347b
            /* JADX INFO: renamed from: a */
            public final void mo6417a(int i) {
                this.f9668a.m6408m(viewPager, i);
            }
        });
        viewPager.i();
        viewPager.d(new C0346a());
        int currentItem = viewPager.getCurrentItem();
        this.f5094f = currentItem;
        this.f5089a.get(currentItem).m11043b(this.f5092d);
    }

    /* JADX INFO: renamed from: g */
    public final void m6402g(int i) {
        if (this.f5094f == i || vwb.J(this.f5089a)) {
            return;
        }
        this.f5094f = i;
        for (int i2 = 0; i2 < this.f5089a.size(); i2++) {
            int i3 = this.f5094f;
            List<chg> list = this.f5089a;
            if (i2 == i3) {
                list.get(i2).m11043b(this.f5092d);
            } else {
                list.get(i2).m11042a(this.f5091c);
            }
        }
        vwb.z(this.f5090b, new e30() { // from class: l.ccg
            public final void call(Object obj) {
                this.f8591a.m6409n((FansClubTabView.InterfaceC0347b) obj);
            }
        });
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public final void m6403h(float f) {
        int size = 0;
        while (size < this.f5089a.size() && (f - this.f5089a.get(size).m11045d()) - this.f5093e > 0.0f) {
            f -= this.f5089a.get(size).m11045d() + this.f5093e;
            size++;
        }
        if (size >= this.f5089a.size()) {
            size = this.f5089a.size() - 1;
        }
        m6402g(size);
    }

    /* JADX INFO: renamed from: i */
    public final void m6404i(Canvas canvas) {
        if (this.f5098j) {
            canvas.save();
            canvas.translate(this.f5102n - (this.f5097i.right / 2.0f), getMeasuredHeight() - this.f5097i.height());
            RectF rectF = this.f5097i;
            float f = this.f5104p;
            canvas.drawRoundRect(rectF, f, f, this.f5096h);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6405j(chg chgVar, Canvas canvas) {
        canvas.drawText(chgVar.m11046e(), chgVar.m11045d() / 2.0f, chgVar.m11044c(), chgVar.m11047f());
    }

    /* JADX INFO: renamed from: k */
    public void m6406k() {
        this.f5098j = false;
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final void m6407l(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        this.f5103o = ViewConfiguration.get(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17123e0);
        int color = typedArrayObtainStyledAttributes.getColor(p9c0.f17125f0, 16777215);
        float dimension = typedArrayObtainStyledAttributes.getDimension(p9c0.f17131i0, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(p9c0.f17127g0, 0.0f);
        this.f5104p = typedArrayObtainStyledAttributes.getDimension(p9c0.f17129h0, 0.0f);
        this.f5096h.setAntiAlias(true);
        this.f5096h.setColor(color);
        this.f5096h.setStyle(Paint.Style.FILL);
        this.f5097i.set(0.0f, 0.0f, dimension, dimension2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m6408m(ViewPager viewPager, int i) {
        mag magVar = this.f5105q;
        if (magVar != null && i != 0) {
            magVar.m25548F2().FansRecallEvent.hideFansRecallSelectPanel().j(Boolean.TRUE);
        }
        viewPager.T(i, true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m6409n(InterfaceC0347b interfaceC0347b) {
        interfaceC0347b.mo6417a(this.f5094f);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m6410o(Canvas canvas, chg chgVar) {
        canvas.translate(this.f5095g, 0.0f);
        m6405j(chgVar, canvas);
        this.f5095g = (int) (this.f5095g + this.f5093e + chgVar.m11045d());
    }

    @Override // android.view.View
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (vwb.J(this.f5089a)) {
            return;
        }
        canvas.save();
        this.f5095g = 0;
        canvas.translate(0.0f, getMeasuredHeight() / 2);
        vwb.z(this.f5089a, new e30() { // from class: l.dcg
            public final void call(Object obj) {
                this.f9165a.m6410o(canvas, (chg) obj);
            }
        });
        canvas.restore();
        m6404i(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (vwb.J(this.f5089a)) {
            super.onMeasure(i, i2);
            return;
        }
        int size = this.f5089a.size();
        int iM11045d = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iM11045d = (int) (iM11045d + this.f5089a.get(i3).m11045d());
            if (i3 < size - 1) {
                iM11045d += this.f5093e;
            }
        }
        setMeasuredDimension(iM11045d, View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5099k = System.currentTimeMillis();
            this.f5100l = motionEvent.getX();
            this.f5101m = motionEvent.getY();
        } else if (action == 1 && Math.abs(motionEvent.getX() - this.f5100l) < this.f5103o.getScaledTouchSlop() && Math.abs(motionEvent.getY() - this.f5101m) < this.f5103o.getScaledTouchSlop() && System.currentTimeMillis() - this.f5099k < ViewConfiguration.getDoubleTapTimeout()) {
            m6403h(Math.abs(motionEvent.getX()));
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m6411p(String str) {
        this.f5089a.add(new chg(str).m11042a(this.f5091c));
    }

    /* JADX INFO: renamed from: q */
    public FansClubTabView m6412q(List<String> list) {
        if (vwb.J(list)) {
            return this;
        }
        this.f5089a.clear();
        vwb.z(list, new e30() { // from class: l.fcg
            public final void call(Object obj) {
                this.f10231a.m6411p((String) obj);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: r */
    public FansClubTabView m6413r(int i) {
        this.f5093e = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public FansClubTabView m6414s(gyl gylVar) {
        if (gylVar != null) {
            this.f5091c = gylVar;
        }
        return this;
    }

    public void setPresenter(mag magVar) {
        this.f5105q = magVar;
    }

    /* JADX INFO: renamed from: t */
    public void m6415t(int i, float f) {
        List<chg> list;
        if (i >= this.f5089a.size() || this.f5089a.size() <= 1) {
            return;
        }
        int i2 = 0;
        int iM11045d = 0;
        while (true) {
            list = this.f5089a;
            if (i2 >= i) {
                break;
            }
            iM11045d = (int) (iM11045d + list.get(i2).m11045d() + this.f5093e);
            i2++;
        }
        int iM11045d2 = (int) (iM11045d + (list.get(i).m11045d() / 2.0f));
        if (f > 0.0f) {
            iM11045d2 = (int) (iM11045d2 + (((this.f5089a.get(i + 1).m11045d() / 2.0f) + (this.f5089a.get(i).m11045d() / 2.0f) + this.f5093e) * f));
        }
        this.f5102n = iM11045d2;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public FansClubTabView m6416u(z2m z2mVar) {
        if (z2mVar != null) {
            this.f5092d = z2mVar;
        }
        return this;
    }

    public FansClubTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FansClubTabView(Context context) {
        this(context, null);
    }
}
