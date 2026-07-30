package com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.tab;

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
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import java.util.ArrayList;
import java.util.List;
import p149l.chg;
import p149l.e30;
import p149l.gyl;
import p149l.il5;
import p149l.mag;
import p149l.p9c0;
import p149l.rk5;
import p149l.vwb;
import p149l.z2m;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubTabView extends View {

    /* JADX INFO: renamed from: a */
    public final List<chg> f49047a;

    /* JADX INFO: renamed from: b */
    public List<InterfaceC12758b> f49048b;

    /* JADX INFO: renamed from: c */
    public gyl f49049c;

    /* JADX INFO: renamed from: d */
    public z2m f49050d;

    /* JADX INFO: renamed from: e */
    public int f49051e;

    /* JADX INFO: renamed from: f */
    public int f49052f;

    /* JADX INFO: renamed from: g */
    public int f49053g;

    /* JADX INFO: renamed from: h */
    public Paint f49054h;

    /* JADX INFO: renamed from: i */
    public RectF f49055i;

    /* JADX INFO: renamed from: j */
    public boolean f49056j;

    /* JADX INFO: renamed from: k */
    public long f49057k;

    /* JADX INFO: renamed from: l */
    public float f49058l;

    /* JADX INFO: renamed from: m */
    public float f49059m;

    /* JADX INFO: renamed from: n */
    public float f49060n;

    /* JADX INFO: renamed from: o */
    public ViewConfiguration f49061o;

    /* JADX INFO: renamed from: p */
    public float f49062p;

    /* JADX INFO: renamed from: q */
    public mag f49063q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView$a */
    public class C12757a implements ViewPager.InterfaceC0716j {
        public C12757a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            FansClubTabView.this.m72896t(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView$b */
    public interface InterfaceC12758b {
        /* JADX INFO: renamed from: a */
        void mo72898a(int i);
    }

    public FansClubTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49047a = new ArrayList();
        this.f49048b = new ArrayList();
        this.f49049c = new rk5();
        this.f49050d = new il5();
        this.f49051e = 0;
        this.f49052f = 0;
        this.f49053g = 0;
        this.f49054h = new Paint();
        this.f49055i = new RectF();
        this.f49056j = true;
        this.f49060n = 0.0f;
        m72888l(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public void m72881e(InterfaceC12758b interfaceC12758b) {
        if (this.f49048b.contains(interfaceC12758b)) {
            return;
        }
        this.f49048b.add(interfaceC12758b);
    }

    /* JADX INFO: renamed from: f */
    public void m72882f(final ViewPager viewPager) {
        this.f49048b.clear();
        m72881e(new InterfaceC12758b() { // from class: l.ecg
            @Override // com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView.InterfaceC12758b
            /* JADX INFO: renamed from: a */
            public final void mo72898a(int i) {
                this.f90498a.m72889m(viewPager, i);
            }
        });
        viewPager.m4189i();
        viewPager.m4185d(new C12757a());
        int currentItem = viewPager.getCurrentItem();
        this.f49052f = currentItem;
        this.f49047a.get(currentItem).m106868b(this.f49050d);
    }

    /* JADX INFO: renamed from: g */
    public final void m72883g(int i) {
        if (this.f49052f == i || vwb.m200296J(this.f49047a)) {
            return;
        }
        this.f49052f = i;
        for (int i2 = 0; i2 < this.f49047a.size(); i2++) {
            int i3 = this.f49052f;
            List<chg> list = this.f49047a;
            if (i2 == i3) {
                list.get(i2).m106868b(this.f49050d);
            } else {
                list.get(i2).m106867a(this.f49049c);
            }
        }
        vwb.m200354z(this.f49048b, new e30() { // from class: l.ccg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80235a.m72890n((FansClubTabView.InterfaceC12758b) obj);
            }
        });
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public final void m72884h(float f) {
        int size = 0;
        while (size < this.f49047a.size() && (f - this.f49047a.get(size).m106870d()) - this.f49051e > 0.0f) {
            f -= this.f49047a.get(size).m106870d() + this.f49051e;
            size++;
        }
        if (size >= this.f49047a.size()) {
            size = this.f49047a.size() - 1;
        }
        m72883g(size);
    }

    /* JADX INFO: renamed from: i */
    public final void m72885i(Canvas canvas) {
        if (this.f49056j) {
            canvas.save();
            canvas.translate(this.f49060n - (this.f49055i.right / 2.0f), getMeasuredHeight() - this.f49055i.height());
            RectF rectF = this.f49055i;
            float f = this.f49062p;
            canvas.drawRoundRect(rectF, f, f, this.f49054h);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m72886j(chg chgVar, Canvas canvas) {
        canvas.drawText(chgVar.m106871e(), chgVar.m106870d() / 2.0f, chgVar.m106869c(), chgVar.m106872f());
    }

    /* JADX INFO: renamed from: k */
    public void m72887k() {
        this.f49056j = false;
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final void m72888l(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        this.f49061o = ViewConfiguration.get(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147726e0);
        int color = typedArrayObtainStyledAttributes.getColor(p9c0.f147728f0, 16777215);
        float dimension = typedArrayObtainStyledAttributes.getDimension(p9c0.f147734i0, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(p9c0.f147730g0, 0.0f);
        this.f49062p = typedArrayObtainStyledAttributes.getDimension(p9c0.f147732h0, 0.0f);
        this.f49054h.setAntiAlias(true);
        this.f49054h.setColor(color);
        this.f49054h.setStyle(Paint.Style.FILL);
        this.f49055i.set(0.0f, 0.0f, dimension, dimension2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m72889m(ViewPager viewPager, int i) {
        mag magVar = this.f49063q;
        if (magVar != null && i != 0) {
            magVar.m206028F2().FansRecallEvent.hideFansRecallSelectPanel().mo172463j(Boolean.TRUE);
        }
        viewPager.m4176T(i, true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m72890n(InterfaceC12758b interfaceC12758b) {
        interfaceC12758b.mo72898a(this.f49052f);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m72891o(Canvas canvas, chg chgVar) {
        canvas.translate(this.f49053g, 0.0f);
        m72886j(chgVar, canvas);
        this.f49053g = (int) (this.f49053g + this.f49051e + chgVar.m106870d());
    }

    @Override // android.view.View
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (vwb.m200296J(this.f49047a)) {
            return;
        }
        canvas.save();
        this.f49053g = 0;
        canvas.translate(0.0f, getMeasuredHeight() / 2);
        vwb.m200354z(this.f49047a, new e30() { // from class: l.dcg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85399a.m72891o(canvas, (chg) obj);
            }
        });
        canvas.restore();
        m72885i(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (vwb.m200296J(this.f49047a)) {
            super.onMeasure(i, i2);
            return;
        }
        int size = this.f49047a.size();
        int iM106870d = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iM106870d = (int) (iM106870d + this.f49047a.get(i3).m106870d());
            if (i3 < size - 1) {
                iM106870d += this.f49051e;
            }
        }
        setMeasuredDimension(iM106870d, View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f49057k = System.currentTimeMillis();
            this.f49058l = motionEvent.getX();
            this.f49059m = motionEvent.getY();
        } else if (action == 1 && Math.abs(motionEvent.getX() - this.f49058l) < this.f49061o.getScaledTouchSlop() && Math.abs(motionEvent.getY() - this.f49059m) < this.f49061o.getScaledTouchSlop() && System.currentTimeMillis() - this.f49057k < ViewConfiguration.getDoubleTapTimeout()) {
            m72884h(Math.abs(motionEvent.getX()));
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m72892p(String str) {
        this.f49047a.add(new chg(str).m106867a(this.f49049c));
    }

    /* JADX INFO: renamed from: q */
    public FansClubTabView m72893q(List<String> list) {
        if (vwb.m200296J(list)) {
            return this;
        }
        this.f49047a.clear();
        vwb.m200354z(list, new e30() { // from class: l.fcg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96795a.m72892p((String) obj);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: r */
    public FansClubTabView m72894r(int i) {
        this.f49051e = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public FansClubTabView m72895s(gyl gylVar) {
        if (gylVar != null) {
            this.f49049c = gylVar;
        }
        return this;
    }

    public void setPresenter(mag magVar) {
        this.f49063q = magVar;
    }

    /* JADX INFO: renamed from: t */
    public void m72896t(int i, float f) {
        List<chg> list;
        if (i >= this.f49047a.size() || this.f49047a.size() <= 1) {
            return;
        }
        int i2 = 0;
        int iM106870d = 0;
        while (true) {
            list = this.f49047a;
            if (i2 >= i) {
                break;
            }
            iM106870d = (int) (iM106870d + list.get(i2).m106870d() + this.f49051e);
            i2++;
        }
        int iM106870d2 = (int) (iM106870d + (list.get(i).m106870d() / 2.0f));
        if (f > 0.0f) {
            iM106870d2 = (int) (iM106870d2 + (((this.f49047a.get(i + 1).m106870d() / 2.0f) + (this.f49047a.get(i).m106870d() / 2.0f) + this.f49051e) * f));
        }
        this.f49060n = iM106870d2;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public FansClubTabView m72897u(z2m z2mVar) {
        if (z2mVar != null) {
            this.f49050d = z2mVar;
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
