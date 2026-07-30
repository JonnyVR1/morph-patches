package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.e51;
import l.k9c0;
import l.mqi0;
import l.osi0;
import l.t100;
import l.tjj;
import p002l.a2m;
import p002l.dqk0;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VReorderCards<T extends VReorderCard> extends ViewGroup implements VScroll.b {

    /* JADX INFO: renamed from: A */
    public InterfaceC0052c f888A;

    /* JADX INFO: renamed from: B */
    public e30<Boolean> f889B;

    /* JADX INFO: renamed from: a */
    public final String f890a;

    /* JADX INFO: renamed from: b */
    public dqk0 f891b;

    /* JADX INFO: renamed from: c */
    public final float f892c;

    /* JADX INFO: renamed from: d */
    public int f893d;

    /* JADX INFO: renamed from: e */
    public boolean f894e;

    /* JADX INFO: renamed from: f */
    public boolean f895f;

    /* JADX INFO: renamed from: g */
    public boolean f896g;

    /* JADX INFO: renamed from: h */
    public a2m f897h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0051b f898i;

    /* JADX INFO: renamed from: j */
    public Runnable f899j;

    /* JADX INFO: renamed from: k */
    public final int f900k;

    /* JADX INFO: renamed from: l */
    public boolean f901l;

    /* JADX INFO: renamed from: m */
    public boolean f902m;

    /* JADX INFO: renamed from: n */
    public GestureDetector.SimpleOnGestureListener f903n;

    /* JADX INFO: renamed from: o */
    public tjj f904o;

    /* JADX INFO: renamed from: p */
    public dqk0[] f905p;

    /* JADX INFO: renamed from: q */
    public int f906q;

    /* JADX INFO: renamed from: r */
    public int f907r;

    /* JADX INFO: renamed from: s */
    public int f908s;

    /* JADX INFO: renamed from: t */
    public boolean f909t;

    /* JADX INFO: renamed from: u */
    public boolean f910u;

    /* JADX INFO: renamed from: v */
    public PointF f911v;

    /* JADX INFO: renamed from: w */
    public long f912w;

    /* JADX INFO: renamed from: x */
    public final Runnable f913x;

    /* JADX INFO: renamed from: y */
    public String f914y;

    /* JADX INFO: renamed from: z */
    public boolean f915z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$a */
    public class C0050a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public long f916a = 0;

        public C0050a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            dqk0 dqk0VarM1260k;
            VReorderCards vReorderCards = VReorderCards.this;
            dqk0 dqk0Var = vReorderCards.f891b;
            if (dqk0Var == null) {
                return true;
            }
            VReorderCard vReorderCard = dqk0Var.f9400g;
            if (!vReorderCard.f866a) {
                if (!vReorderCards.f901l && !vReorderCards.f902m) {
                    return true;
                }
                vReorderCard.m1230A(motionEvent);
                return true;
            }
            int x = (int) motionEvent2.getX();
            int y = (int) motionEvent2.getY();
            if (!VReorderCards.this.f891b.m11996d(x, y) && (dqk0VarM1260k = VReorderCards.this.m1260k(x, y)) != null) {
                VReorderCard vReorderCard2 = dqk0VarM1260k.f9400g;
                if (!vReorderCard2.f867b) {
                    if (vReorderCard2.f879n) {
                        VReorderCards vReorderCards2 = VReorderCards.this;
                        dqk0 dqk0Var2 = vReorderCards2.f891b;
                        vReorderCards2.f891b = dqk0VarM1260k;
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        for (int i2 = 0; i2 < VReorderCards.this.f893d; i2++) {
                            int i3 = dqk0Var2.f9398e;
                            int i4 = dqk0VarM1260k.f9398e;
                            if (i3 > i4 && i2 == i4) {
                                arrayList.add(dqk0Var2.f9400g);
                            }
                            if (i2 != dqk0Var2.f9398e) {
                                arrayList.add(VReorderCards.this.f905p[i2].f9400g);
                            }
                            int i5 = dqk0Var2.f9398e;
                            int i6 = dqk0VarM1260k.f9398e;
                            if (i5 < i6 && i2 == i6) {
                                arrayList.add(dqk0Var2.f9400g);
                            }
                        }
                        while (true) {
                            VReorderCards vReorderCards3 = VReorderCards.this;
                            if (i >= vReorderCards3.f893d) {
                                return true;
                            }
                            vReorderCards3.f905p[i].m11998f((VReorderCard) arrayList.get(i));
                            VReorderCard vReorderCard3 = VReorderCards.this.f905p[i].f9400g;
                            if (!vReorderCard3.f866a) {
                                vReorderCard3.m1234g();
                            }
                            i++;
                        }
                    } else if (vReorderCard2.f881p) {
                        e51.J(VReorderCards.this.f913x);
                        e51.H(VReorderCards.this.getContext(), VReorderCards.this.f913x, ViewConfiguration.getLongPressTimeout());
                    }
                }
            }
            VReorderCards.this.f891b.f9400g.m1242p(x, y);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            VReorderCard vReorderCard;
            this.f916a = motionEvent.getDownTime();
            VReorderCards vReorderCards = VReorderCards.this;
            dqk0 dqk0Var = vReorderCards.f891b;
            if (dqk0Var != null && (vReorderCard = dqk0Var.f9400g) != null && !vReorderCard.f867b) {
                if (!vReorderCards.f901l) {
                    vReorderCards.f902m = true;
                    vReorderCards.getParent().requestDisallowInterceptTouchEvent(true);
                }
                VReorderCards.this.f891b.f9400g.m1230A(motionEvent);
            }
            InterfaceC0052c interfaceC0052c = VReorderCards.this.f888A;
            if (interfaceC0052c != null) {
                interfaceC0052c.mo1268a(true);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            long j = this.f916a;
            long downTime = motionEvent.getDownTime();
            VReorderCards vReorderCards = VReorderCards.this;
            if (j == downTime) {
                InterfaceC0052c interfaceC0052c = vReorderCards.f888A;
                if (interfaceC0052c != null) {
                    interfaceC0052c.mo1268a(false);
                }
                return false;
            }
            dqk0 dqk0VarM1260k = vReorderCards.m1260k((int) motionEvent.getX(), (int) motionEvent.getY());
            if (dqk0VarM1260k != null) {
                final VReorderCard vReorderCard = dqk0VarM1260k.f9400g;
                vReorderCard.setPressed(true);
                VReorderCards.this.postDelayed(new Runnable() { // from class: l.cqk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        vReorderCard.setPressed(false);
                    }
                }, 50L);
                if (!VReorderCards.this.m1262m()) {
                    if (NullChecker.a(VReorderCards.this.f899j)) {
                        VReorderCards.this.f899j.run();
                    }
                    dqk0VarM1260k.f9400g.mo1140u();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$b */
    public interface InterfaceC0051b {
        /* JADX INFO: renamed from: a */
        void mo1267a(int i, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$c */
    public interface InterfaceC0052c {
        /* JADX INFO: renamed from: a */
        void mo1268a(boolean z);
    }

    public VReorderCards(Context context) {
        super(context);
        this.f890a = "VReorderCards";
        this.f891b = null;
        this.f892c = 0.75f;
        this.f893d = 6;
        this.f894e = false;
        this.f895f = true;
        this.f896g = true;
        this.f900k = 3;
        this.f901l = true;
        this.f902m = false;
        this.f903n = new C0050a();
        this.f906q = 1;
        this.f910u = false;
        this.f912w = 0L;
        this.f913x = new Runnable() { // from class: l.aqk0
            @Override // java.lang.Runnable
            public final void run() {
                osi0.g("头像位置不支持更改");
            }
        };
        this.f914y = "";
        this.f915z = false;
        m1261l(context, null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1254a(int i, int i2) {
        dqk0 dqk0VarM1260k = m1260k(i, i2);
        return (dqk0VarM1260k == null || dqk0VarM1260k.f9400g.f867b) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m1255f(MotionEvent motionEvent) {
        this.f912w = mqi0.o();
        this.f911v = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f910u = false;
        dqk0 dqk0VarM1260k = m1260k((int) motionEvent.getX(), (int) motionEvent.getY());
        if (dqk0VarM1260k != null) {
            int i = dqk0VarM1260k.f9398e;
            if (i >= 0) {
                dqk0 dqk0Var = this.f905p[i];
                VReorderCard vReorderCard = dqk0Var.f9400g;
                if (!vReorderCard.f867b) {
                    if (!vReorderCard.f879n) {
                        if (!vReorderCard.f881p || this.f912w <= 0) {
                            return;
                        }
                        e51.J(this.f913x);
                        e51.H(getContext(), new Runnable() { // from class: l.zpk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f23562a.m1264o();
                            }
                        }, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    this.f891b = dqk0Var;
                    this.f915z = true;
                    for (int i2 = 0; i2 < this.f893d; i2++) {
                        VReorderCard vReorderCard2 = this.f905p[i2].f9400g;
                        if (vReorderCard2.f867b) {
                            bringChildToFront(vReorderCard2);
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f893d;
                        dqk0[] dqk0VarArr = this.f905p;
                        if (i3 >= i4) {
                            bringChildToFront(dqk0VarArr[i].f9400g);
                            invalidate();
                            this.f915z = false;
                            return;
                        } else {
                            VReorderCard vReorderCard3 = dqk0VarArr[i3].f9400g;
                            if (!vReorderCard3.f867b) {
                                bringChildToFront(vReorderCard3);
                            }
                            i3++;
                        }
                    }
                }
            }
            if (i < 0 || !this.f905p[i].f9400g.f867b) {
                return;
            }
            this.f910u = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1256g(MotionEvent motionEvent) {
        dqk0 dqk0VarM1260k;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (((int) Math.sqrt(Math.pow(Math.abs(x - this.f911v.x), 2.0d) + Math.pow(Math.abs(y - this.f911v.y), 2.0d))) >= ViewConfiguration.get(getContext()).getScaledTouchSlop() || (dqk0VarM1260k = m1260k((int) x, (int) y)) == null) {
            return;
        }
        final VReorderCard vReorderCard = dqk0VarM1260k.f9400g;
        vReorderCard.setPressed(true);
        postDelayed(new Runnable() { // from class: l.bqk0
            @Override // java.lang.Runnable
            public final void run() {
                vReorderCard.setPressed(false);
            }
        }, 50L);
        if (m1262m()) {
            return;
        }
        dqk0VarM1260k.f9400g.mo1140u();
    }

    /* JADX INFO: renamed from: h */
    public T m1257h(int i) {
        dqk0[] dqk0VarArr = this.f905p;
        return dqk0VarArr[0] == null ? (T) getChildAt(i) : (T) dqk0VarArr[i].f9400g;
    }

    /* JADX INFO: renamed from: i */
    public int m1258i() {
        int i = 0;
        for (dqk0 dqk0Var : this.f905p) {
            VReorderCard vReorderCard = dqk0Var.f9400g;
            if (vReorderCard != null && !vReorderCard.f867b) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public void m1259j(int i) {
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = ((i - getPaddingLeft()) - getPaddingRight()) / 3;
        int i2 = this.f906q;
        int i3 = ((int) ((paddingLeft2 - i2) / 0.75f)) + i2;
        setMeasuredDimension(i, (Math.max(this.f893d / 3, 1) * i3) + getPaddingTop() + getPaddingBottom());
        for (int i4 = 0; i4 < this.f893d; i4++) {
            int i5 = i4 / 3;
            int i6 = i4 % 3;
            this.f905p[i4].m11999g((paddingLeft2 * i6) + paddingLeft, i5 * i3, ((i6 + 1) * paddingLeft2) + paddingLeft, (i5 + 1) * i3);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft2, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.f907r = paddingLeft2;
        this.f908s = paddingLeft2;
        for (int i7 = 0; i7 < this.f893d; i7++) {
            dqk0 dqk0Var = this.f905p[i7];
            if (dqk0Var.f9400g == null) {
                dqk0Var.m11998f((VReorderCard) getChildAt(i7));
            }
            this.f905p[i7].f9400g.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f905p[i7].f9400g.setCurPageId(this.f914y);
        }
    }

    /* JADX INFO: renamed from: k */
    public dqk0 m1260k(int i, int i2) {
        for (int i3 = 0; i3 < this.f893d; i3++) {
            if (this.f905p[i3].m11996d(i, i2)) {
                return this.f905p[i3];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m1261l(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.f893d = context.obtainStyledAttributes(attributeSet, k9c0.a).getInteger(k9c0.b, 6);
        }
        setViewCount(this.f893d);
        setClipChildren(false);
        setClipToPadding(false);
        tjj tjjVar = new tjj(context, this.f903n);
        this.f904o = tjjVar;
        tjjVar.b(false);
        this.f906q = t100.e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1262m() {
        for (int i = 0; i < this.f893d; i++) {
            if (NullChecker.a(this.f905p[i].f9400g.f869d) && this.f905p[i].f9400g.f869d.d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1263n() {
        return this.f909t;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m1264o() {
        if (this.f912w > 0) {
            this.f913x.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.f893d; i5++) {
            VReorderCard vReorderCard = this.f905p[i5].f9400g;
            if (!vReorderCard.m1239m()) {
                vReorderCard.layout(0, 0, vReorderCard.getMeasuredWidth(), vReorderCard.getMeasuredHeight());
                vReorderCard.m1248y();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f909t) {
            m1259j(size);
            return;
        }
        setMeasuredDimension(i, i);
        int i3 = this.f906q;
        int i4 = ((size - (i3 * 4)) + 2) / 3;
        int i5 = i4 * 2;
        int[] iArr = {i3, (i3 * 2) + i4, (i3 * 3) + i5};
        int[] iArr2 = {i4 + i3, i5 + (i3 * 2), (i4 * 3) + (i3 * 3)};
        if (this.f907r != i4) {
            dqk0 dqk0Var = this.f905p[0];
            int i6 = iArr[0];
            int i7 = iArr2[1];
            dqk0Var.m11999g(i6, i6, i7, i7);
            this.f905p[1].m11999g(iArr[2], iArr[0], iArr2[2], iArr2[0]);
            this.f905p[2].m11999g(iArr[2], iArr[1], iArr2[2], iArr2[1]);
            dqk0 dqk0Var2 = this.f905p[3];
            int i8 = iArr[2];
            int i9 = iArr2[2];
            dqk0Var2.m11999g(i8, i8, i9, i9);
            this.f905p[4].m11999g(iArr[1], iArr[2], iArr2[1], iArr2[2]);
            this.f905p[5].m11999g(iArr[0], iArr[2], iArr2[0], iArr2[2]);
            this.f907r = i4;
            int i10 = iArr2[1];
            this.f908s = i10;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            for (int i11 = 0; i11 < this.f893d; i11++) {
                this.f905p[i11].f9400g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a2m a2mVar;
        super.onTouchEvent(motionEvent);
        if (!this.f896g) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m1255f(motionEvent);
            if (!this.f901l) {
                this.f902m = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (action == 1) {
            dqk0 dqk0Var = this.f891b;
            if (dqk0Var != null) {
                if (dqk0Var.f9400g.f866a && (a2mVar = this.f897h) != null) {
                    a2mVar.mo1670d();
                }
                this.f891b.f9400g.m1247x();
                this.f891b = null;
                if (!this.f895f) {
                    m1256g(motionEvent);
                }
            } else if (this.f910u) {
                m1256g(motionEvent);
            }
            if (!this.f901l) {
                this.f902m = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f912w = 0L;
        } else if (action == 3) {
            dqk0 dqk0Var2 = this.f891b;
            if (dqk0Var2 != null) {
                dqk0Var2.f9400g.m1247x();
                this.f891b = null;
            }
            this.f912w = 0L;
        }
        if (!this.f910u && this.f895f) {
            this.f904o.a(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public VReorderCard mo1153p() {
        return new VReorderCard(getContext());
    }

    /* JADX INFO: renamed from: q */
    public void m1265q(Runnable runnable) {
        this.f899j = runnable;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f915z) {
            return;
        }
        super.requestLayout();
    }

    public void setCardPadding(int i) {
        this.f906q = i;
    }

    public void setCardsCrop(boolean z) {
        this.f909t = z;
    }

    public void setClickEnable(boolean z) {
        this.f896g = z;
    }

    public void setCurPageId(String str) {
        this.f914y = str;
    }

    public void setDragging(boolean z) {
        if (NullChecker.a(this.f889B)) {
            this.f889B.call(Boolean.valueOf(z));
        }
    }

    public void setEnableDrag(boolean z) {
        this.f895f = z;
    }

    public void setOnDraggingListener(e30<Boolean> e30Var) {
        this.f889B = e30Var;
    }

    public void setReorderCardsCallback(a2m a2mVar) {
        this.f897h = a2mVar;
    }

    public void setSlideWithoutPress(boolean z) {
        this.f901l = z;
    }

    public void setUploadListener(InterfaceC0051b interfaceC0051b) {
        this.f898i = interfaceC0051b;
    }

    public void setViewCatchListener(InterfaceC0052c interfaceC0052c) {
        this.f888A = interfaceC0052c;
    }

    public void setViewCount(int i) {
        removeAllViews();
        this.f893d = i;
        this.f905p = new dqk0[i];
        for (int i2 = 0; i2 < i; i2++) {
            VReorderCard vReorderCardMo1153p = mo1153p();
            this.f905p[i2] = new dqk0(this, i2);
            this.f905p[i2].m11998f(vReorderCardMo1153p);
            addView(vReorderCardMo1153p);
        }
        requestLayout();
    }

    public VReorderCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f890a = "VReorderCards";
        this.f891b = null;
        this.f892c = 0.75f;
        this.f893d = 6;
        this.f894e = false;
        this.f895f = true;
        this.f896g = true;
        this.f900k = 3;
        this.f901l = true;
        this.f902m = false;
        this.f903n = new C0050a();
        this.f906q = 1;
        this.f910u = false;
        this.f912w = 0L;
        this.f913x = new Runnable() { // from class: l.aqk0
            @Override // java.lang.Runnable
            public final void run() {
                osi0.g("头像位置不支持更改");
            }
        };
        this.f914y = "";
        this.f915z = false;
        m1261l(context, attributeSet);
    }

    public VReorderCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f890a = "VReorderCards";
        this.f891b = null;
        this.f892c = 0.75f;
        this.f893d = 6;
        this.f894e = false;
        this.f895f = true;
        this.f896g = true;
        this.f900k = 3;
        this.f901l = true;
        this.f902m = false;
        this.f903n = new C0050a();
        this.f906q = 1;
        this.f910u = false;
        this.f912w = 0L;
        this.f913x = new Runnable() { // from class: l.aqk0
            @Override // java.lang.Runnable
            public final void run() {
                osi0.g("头像位置不支持更改");
            }
        };
        this.f914y = "";
        this.f915z = false;
        m1261l(context, attributeSet);
    }
}
