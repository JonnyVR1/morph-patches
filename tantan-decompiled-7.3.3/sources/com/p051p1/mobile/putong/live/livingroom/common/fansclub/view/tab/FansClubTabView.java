package com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.tab;

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
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import java.util.ArrayList;
import java.util.List;
import p153l.acg;
import p153l.jyb;
import p153l.lm5;
import p153l.qig;
import p153l.r5m;
import p153l.sl5;
import p153l.vhc0;
import p153l.y20;
import p153l.z0m;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubTabView extends View {

    /* JADX INFO: renamed from: a */
    public final List<qig> f49895a;

    /* JADX INFO: renamed from: b */
    public List<InterfaceC12921b> f49896b;

    /* JADX INFO: renamed from: c */
    public z0m f49897c;

    /* JADX INFO: renamed from: d */
    public r5m f49898d;

    /* JADX INFO: renamed from: e */
    public int f49899e;

    /* JADX INFO: renamed from: f */
    public int f49900f;

    /* JADX INFO: renamed from: g */
    public int f49901g;

    /* JADX INFO: renamed from: h */
    public Paint f49902h;

    /* JADX INFO: renamed from: i */
    public RectF f49903i;

    /* JADX INFO: renamed from: j */
    public boolean f49904j;

    /* JADX INFO: renamed from: k */
    public long f49905k;

    /* JADX INFO: renamed from: l */
    public float f49906l;

    /* JADX INFO: renamed from: m */
    public float f49907m;

    /* JADX INFO: renamed from: n */
    public float f49908n;

    /* JADX INFO: renamed from: o */
    public ViewConfiguration f49909o;

    /* JADX INFO: renamed from: p */
    public float f49910p;

    /* JADX INFO: renamed from: q */
    public acg f49911q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView$a */
    public class C12920a implements ViewPager.InterfaceC0718j {
        public C12920a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            FansClubTabView.this.m74079t(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView$b */
    public interface InterfaceC12921b {
        /* JADX INFO: renamed from: a */
        void mo74081a(int i);
    }

    public FansClubTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49895a = new ArrayList();
        this.f49896b = new ArrayList();
        this.f49897c = new sl5();
        this.f49898d = new lm5();
        this.f49899e = 0;
        this.f49900f = 0;
        this.f49901g = 0;
        this.f49902h = new Paint();
        this.f49903i = new RectF();
        this.f49904j = true;
        this.f49908n = 0.0f;
        m74071l(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public void m74064e(InterfaceC12921b interfaceC12921b) {
        if (this.f49896b.contains(interfaceC12921b)) {
            return;
        }
        this.f49896b.add(interfaceC12921b);
    }

    /* JADX INFO: renamed from: f */
    public void m74065f(final ViewPager viewPager) {
        this.f49896b.clear();
        m74064e(new InterfaceC12921b() { // from class: l.sdg
            @Override // com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView.InterfaceC12921b
            /* JADX INFO: renamed from: a */
            public final void mo74081a(int i) {
                this.f167411a.m74072m(viewPager, i);
            }
        });
        viewPager.m4191i();
        viewPager.m4187d(new C12920a());
        int currentItem = viewPager.getCurrentItem();
        this.f49900f = currentItem;
        this.f49895a.get(currentItem).m176745b(this.f49898d);
    }

    /* JADX INFO: renamed from: g */
    public final void m74066g(int i) {
        if (this.f49900f == i || jyb.m147479J(this.f49895a)) {
            return;
        }
        this.f49900f = i;
        for (int i2 = 0; i2 < this.f49895a.size(); i2++) {
            int i3 = this.f49900f;
            List<qig> list = this.f49895a;
            if (i2 == i3) {
                list.get(i2).m176745b(this.f49898d);
            } else {
                list.get(i2).m176744a(this.f49897c);
            }
        }
        jyb.m147537z(this.f49896b, new y20() { // from class: l.qdg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156721a.m74073n((FansClubTabView.InterfaceC12921b) obj);
            }
        });
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public final void m74067h(float f) {
        int size = 0;
        while (size < this.f49895a.size() && (f - this.f49895a.get(size).m176747d()) - this.f49899e > 0.0f) {
            f -= this.f49895a.get(size).m176747d() + this.f49899e;
            size++;
        }
        if (size >= this.f49895a.size()) {
            size = this.f49895a.size() - 1;
        }
        m74066g(size);
    }

    /* JADX INFO: renamed from: i */
    public final void m74068i(Canvas canvas) {
        if (this.f49904j) {
            canvas.save();
            canvas.translate(this.f49908n - (this.f49903i.right / 2.0f), getMeasuredHeight() - this.f49903i.height());
            RectF rectF = this.f49903i;
            float f = this.f49910p;
            canvas.drawRoundRect(rectF, f, f, this.f49902h);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m74069j(qig qigVar, Canvas canvas) {
        canvas.drawText(qigVar.m176748e(), qigVar.m176747d() / 2.0f, qigVar.m176746c(), qigVar.m176749f());
    }

    /* JADX INFO: renamed from: k */
    public void m74070k() {
        this.f49904j = false;
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final void m74071l(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        this.f49909o = ViewConfiguration.get(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184125e0);
        int color = typedArrayObtainStyledAttributes.getColor(vhc0.f184127f0, 16777215);
        float dimension = typedArrayObtainStyledAttributes.getDimension(vhc0.f184133i0, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(vhc0.f184129g0, 0.0f);
        this.f49910p = typedArrayObtainStyledAttributes.getDimension(vhc0.f184131h0, 0.0f);
        this.f49902h.setAntiAlias(true);
        this.f49902h.setColor(color);
        this.f49902h.setStyle(Paint.Style.FILL);
        this.f49903i.set(0.0f, 0.0f, dimension, dimension2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m74072m(ViewPager viewPager, int i) {
        acg acgVar = this.f49911q;
        if (acgVar != null && i != 0) {
            acgVar.m213811F2().FansRecallEvent.hideFansRecallSelectPanel().mo199273j(Boolean.TRUE);
        }
        viewPager.m4178T(i, true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m74073n(InterfaceC12921b interfaceC12921b) {
        interfaceC12921b.mo74081a(this.f49900f);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m74074o(Canvas canvas, qig qigVar) {
        canvas.translate(this.f49901g, 0.0f);
        m74069j(qigVar, canvas);
        this.f49901g = (int) (this.f49901g + this.f49899e + qigVar.m176747d());
    }

    @Override // android.view.View
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (jyb.m147479J(this.f49895a)) {
            return;
        }
        canvas.save();
        this.f49901g = 0;
        canvas.translate(0.0f, getMeasuredHeight() / 2);
        jyb.m147537z(this.f49895a, new y20() { // from class: l.rdg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162306a.m74074o(canvas, (qig) obj);
            }
        });
        canvas.restore();
        m74068i(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (jyb.m147479J(this.f49895a)) {
            super.onMeasure(i, i2);
            return;
        }
        int size = this.f49895a.size();
        int iM176747d = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iM176747d = (int) (iM176747d + this.f49895a.get(i3).m176747d());
            if (i3 < size - 1) {
                iM176747d += this.f49899e;
            }
        }
        setMeasuredDimension(iM176747d, View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f49905k = System.currentTimeMillis();
            this.f49906l = motionEvent.getX();
            this.f49907m = motionEvent.getY();
        } else if (action == 1 && Math.abs(motionEvent.getX() - this.f49906l) < this.f49909o.getScaledTouchSlop() && Math.abs(motionEvent.getY() - this.f49907m) < this.f49909o.getScaledTouchSlop() && System.currentTimeMillis() - this.f49905k < ViewConfiguration.getDoubleTapTimeout()) {
            m74067h(Math.abs(motionEvent.getX()));
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m74075p(String str) {
        this.f49895a.add(new qig(str).m176744a(this.f49897c));
    }

    /* JADX INFO: renamed from: q */
    public FansClubTabView m74076q(List<String> list) {
        if (jyb.m147479J(list)) {
            return this;
        }
        this.f49895a.clear();
        jyb.m147537z(list, new y20() { // from class: l.tdg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173328a.m74075p((String) obj);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: r */
    public FansClubTabView m74077r(int i) {
        this.f49899e = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public FansClubTabView m74078s(z0m z0mVar) {
        if (z0mVar != null) {
            this.f49897c = z0mVar;
        }
        return this;
    }

    public void setPresenter(acg acgVar) {
        this.f49911q = acgVar;
    }

    /* JADX INFO: renamed from: t */
    public void m74079t(int i, float f) {
        List<qig> list;
        if (i >= this.f49895a.size() || this.f49895a.size() <= 1) {
            return;
        }
        int i2 = 0;
        int iM176747d = 0;
        while (true) {
            list = this.f49895a;
            if (i2 >= i) {
                break;
            }
            iM176747d = (int) (iM176747d + list.get(i2).m176747d() + this.f49899e);
            i2++;
        }
        int iM176747d2 = (int) (iM176747d + (list.get(i).m176747d() / 2.0f));
        if (f > 0.0f) {
            iM176747d2 = (int) (iM176747d2 + (((this.f49895a.get(i + 1).m176747d() / 2.0f) + (this.f49895a.get(i).m176747d() / 2.0f) + this.f49899e) * f));
        }
        this.f49908n = iM176747d2;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public FansClubTabView m74080u(r5m r5mVar) {
        if (r5mVar != null) {
            this.f49898d = r5mVar;
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
