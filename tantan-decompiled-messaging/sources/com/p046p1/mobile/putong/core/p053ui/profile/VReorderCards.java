package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VScroll;
import p149l.a2m;
import p149l.dqk0;
import p149l.e30;
import p149l.e51;
import p149l.k9c0;
import p149l.mqi0;
import p149l.t100;
import p149l.tjj;

/* JADX INFO: loaded from: classes4.dex */
public class VReorderCards<T extends VReorderCard> extends ViewGroup implements VScroll.InterfaceC22567b {

    /* JADX INFO: renamed from: A */
    public InterfaceC8627c f33066A;

    /* JADX INFO: renamed from: B */
    public e30<Boolean> f33067B;

    /* JADX INFO: renamed from: a */
    public final String f33068a;

    /* JADX INFO: renamed from: b */
    public dqk0 f33069b;

    /* JADX INFO: renamed from: c */
    public final float f33070c;

    /* JADX INFO: renamed from: d */
    public int f33071d;

    /* JADX INFO: renamed from: e */
    public boolean f33072e;

    /* JADX INFO: renamed from: f */
    public boolean f33073f;

    /* JADX INFO: renamed from: g */
    public boolean f33074g;

    /* JADX INFO: renamed from: h */
    public a2m f33075h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8626b f33076i;

    /* JADX INFO: renamed from: j */
    public Runnable f33077j;

    /* JADX INFO: renamed from: k */
    public final int f33078k;

    /* JADX INFO: renamed from: l */
    public boolean f33079l;

    /* JADX INFO: renamed from: m */
    public boolean f33080m;

    /* JADX INFO: renamed from: n */
    public GestureDetector.SimpleOnGestureListener f33081n;

    /* JADX INFO: renamed from: o */
    public tjj f33082o;

    /* JADX INFO: renamed from: p */
    public dqk0[] f33083p;

    /* JADX INFO: renamed from: q */
    public int f33084q;

    /* JADX INFO: renamed from: r */
    public int f33085r;

    /* JADX INFO: renamed from: s */
    public int f33086s;

    /* JADX INFO: renamed from: t */
    public boolean f33087t;

    /* JADX INFO: renamed from: u */
    public boolean f33088u;

    /* JADX INFO: renamed from: v */
    public PointF f33089v;

    /* JADX INFO: renamed from: w */
    public long f33090w;

    /* JADX INFO: renamed from: x */
    public final Runnable f33091x;

    /* JADX INFO: renamed from: y */
    public String f33092y;

    /* JADX INFO: renamed from: z */
    public boolean f33093z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$a */
    public class C8625a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public long f33094a = 0;

        public C8625a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            dqk0 dqk0VarM50814k;
            VReorderCards vReorderCards = VReorderCards.this;
            dqk0 dqk0Var = vReorderCards.f33069b;
            if (dqk0Var == null) {
                return true;
            }
            VReorderCard vReorderCard = dqk0Var.f87436g;
            if (!vReorderCard.f33044a) {
                if (!vReorderCards.f33079l && !vReorderCards.f33080m) {
                    return true;
                }
                vReorderCard.m50784A(motionEvent);
                return true;
            }
            int x = (int) motionEvent2.getX();
            int y = (int) motionEvent2.getY();
            if (!VReorderCards.this.f33069b.m113077d(x, y) && (dqk0VarM50814k = VReorderCards.this.m50814k(x, y)) != null) {
                VReorderCard vReorderCard2 = dqk0VarM50814k.f87436g;
                if (!vReorderCard2.f33045b) {
                    if (vReorderCard2.f33057n) {
                        VReorderCards vReorderCards2 = VReorderCards.this;
                        dqk0 dqk0Var2 = vReorderCards2.f33069b;
                        vReorderCards2.f33069b = dqk0VarM50814k;
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        for (int i2 = 0; i2 < VReorderCards.this.f33071d; i2++) {
                            int i3 = dqk0Var2.f87434e;
                            int i4 = dqk0VarM50814k.f87434e;
                            if (i3 > i4 && i2 == i4) {
                                arrayList.add(dqk0Var2.f87436g);
                            }
                            if (i2 != dqk0Var2.f87434e) {
                                arrayList.add(VReorderCards.this.f33083p[i2].f87436g);
                            }
                            int i5 = dqk0Var2.f87434e;
                            int i6 = dqk0VarM50814k.f87434e;
                            if (i5 < i6 && i2 == i6) {
                                arrayList.add(dqk0Var2.f87436g);
                            }
                        }
                        while (true) {
                            VReorderCards vReorderCards3 = VReorderCards.this;
                            if (i >= vReorderCards3.f33071d) {
                                return true;
                            }
                            vReorderCards3.f33083p[i].m113079f((VReorderCard) arrayList.get(i));
                            VReorderCard vReorderCard3 = VReorderCards.this.f33083p[i].f87436g;
                            if (!vReorderCard3.f33044a) {
                                vReorderCard3.m50788g();
                            }
                            i++;
                        }
                    } else if (vReorderCard2.f33059p) {
                        e51.m114745J(VReorderCards.this.f33091x);
                        e51.m114743H(VReorderCards.this.getContext(), VReorderCards.this.f33091x, ViewConfiguration.getLongPressTimeout());
                    }
                }
            }
            VReorderCards.this.f33069b.f87436g.m50796p(x, y);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            VReorderCard vReorderCard;
            this.f33094a = motionEvent.getDownTime();
            VReorderCards vReorderCards = VReorderCards.this;
            dqk0 dqk0Var = vReorderCards.f33069b;
            if (dqk0Var != null && (vReorderCard = dqk0Var.f87436g) != null && !vReorderCard.f33045b) {
                if (!vReorderCards.f33079l) {
                    vReorderCards.f33080m = true;
                    vReorderCards.getParent().requestDisallowInterceptTouchEvent(true);
                }
                VReorderCards.this.f33069b.f87436g.m50784A(motionEvent);
            }
            InterfaceC8627c interfaceC8627c = VReorderCards.this.f33066A;
            if (interfaceC8627c != null) {
                interfaceC8627c.mo50822a(true);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            long j = this.f33094a;
            long downTime = motionEvent.getDownTime();
            VReorderCards vReorderCards = VReorderCards.this;
            if (j == downTime) {
                InterfaceC8627c interfaceC8627c = vReorderCards.f33066A;
                if (interfaceC8627c != null) {
                    interfaceC8627c.mo50822a(false);
                }
                return false;
            }
            dqk0 dqk0VarM50814k = vReorderCards.m50814k((int) motionEvent.getX(), (int) motionEvent.getY());
            if (dqk0VarM50814k != null) {
                final VReorderCard vReorderCard = dqk0VarM50814k.f87436g;
                vReorderCard.setPressed(true);
                VReorderCards.this.postDelayed(new Runnable() { // from class: l.cqk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        vReorderCard.setPressed(false);
                    }
                }, 50L);
                if (!VReorderCards.this.m50816m()) {
                    if (NullChecker.m81303a(VReorderCards.this.f33077j)) {
                        VReorderCards.this.f33077j.run();
                    }
                    dqk0VarM50814k.f87436g.mo50704u();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$b */
    public interface InterfaceC8626b {
        /* JADX INFO: renamed from: a */
        void mo50821a(int i, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$c */
    public interface InterfaceC8627c {
        /* JADX INFO: renamed from: a */
        void mo50822a(boolean z);
    }

    public VReorderCards(Context context) {
        super(context);
        this.f33068a = "VReorderCards";
        this.f33069b = null;
        this.f33070c = 0.75f;
        this.f33071d = 6;
        this.f33072e = false;
        this.f33073f = true;
        this.f33074g = true;
        this.f33078k = 3;
        this.f33079l = true;
        this.f33080m = false;
        this.f33081n = new C8625a();
        this.f33084q = 1;
        this.f33088u = false;
        this.f33090w = 0L;
        this.f33091x = new Runnable() { // from class: l.aqk0
            @Override // java.lang.Runnable
            public final void run() {
                osi0.m165783g("头像位置不支持更改");
            }
        };
        this.f33092y = "";
        this.f33093z = false;
        m50815l(context, null);
    }

    @Override // p147v.VScroll.InterfaceC22567b
    /* JADX INFO: renamed from: a */
    public boolean mo50808a(int i, int i2) {
        dqk0 dqk0VarM50814k = m50814k(i, i2);
        return (dqk0VarM50814k == null || dqk0VarM50814k.f87436g.f33045b) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m50809f(MotionEvent motionEvent) {
        this.f33090w = mqi0.m155944o();
        this.f33089v = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f33088u = false;
        dqk0 dqk0VarM50814k = m50814k((int) motionEvent.getX(), (int) motionEvent.getY());
        if (dqk0VarM50814k != null) {
            int i = dqk0VarM50814k.f87434e;
            if (i >= 0) {
                dqk0 dqk0Var = this.f33083p[i];
                VReorderCard vReorderCard = dqk0Var.f87436g;
                if (!vReorderCard.f33045b) {
                    if (!vReorderCard.f33057n) {
                        if (!vReorderCard.f33059p || this.f33090w <= 0) {
                            return;
                        }
                        e51.m114745J(this.f33091x);
                        e51.m114743H(getContext(), new Runnable() { // from class: l.zpk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f204261a.m50818o();
                            }
                        }, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    this.f33069b = dqk0Var;
                    this.f33093z = true;
                    for (int i2 = 0; i2 < this.f33071d; i2++) {
                        VReorderCard vReorderCard2 = this.f33083p[i2].f87436g;
                        if (vReorderCard2.f33045b) {
                            bringChildToFront(vReorderCard2);
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f33071d;
                        dqk0[] dqk0VarArr = this.f33083p;
                        if (i3 >= i4) {
                            bringChildToFront(dqk0VarArr[i].f87436g);
                            invalidate();
                            this.f33093z = false;
                            return;
                        } else {
                            VReorderCard vReorderCard3 = dqk0VarArr[i3].f87436g;
                            if (!vReorderCard3.f33045b) {
                                bringChildToFront(vReorderCard3);
                            }
                            i3++;
                        }
                    }
                }
            }
            if (i < 0 || !this.f33083p[i].f87436g.f33045b) {
                return;
            }
            this.f33088u = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m50810g(MotionEvent motionEvent) {
        dqk0 dqk0VarM50814k;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (((int) Math.sqrt(Math.pow(Math.abs(x - this.f33089v.x), 2.0d) + Math.pow(Math.abs(y - this.f33089v.y), 2.0d))) >= ViewConfiguration.get(getContext()).getScaledTouchSlop() || (dqk0VarM50814k = m50814k((int) x, (int) y)) == null) {
            return;
        }
        final VReorderCard vReorderCard = dqk0VarM50814k.f87436g;
        vReorderCard.setPressed(true);
        postDelayed(new Runnable() { // from class: l.bqk0
            @Override // java.lang.Runnable
            public final void run() {
                vReorderCard.setPressed(false);
            }
        }, 50L);
        if (m50816m()) {
            return;
        }
        dqk0VarM50814k.f87436g.mo50704u();
    }

    /* JADX INFO: renamed from: h */
    public T m50811h(int i) {
        dqk0[] dqk0VarArr = this.f33083p;
        return dqk0VarArr[0] == null ? (T) getChildAt(i) : (T) dqk0VarArr[i].f87436g;
    }

    /* JADX INFO: renamed from: i */
    public int m50812i() {
        int i = 0;
        for (dqk0 dqk0Var : this.f33083p) {
            VReorderCard vReorderCard = dqk0Var.f87436g;
            if (vReorderCard != null && !vReorderCard.f33045b) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public void m50813j(int i) {
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = ((i - getPaddingLeft()) - getPaddingRight()) / 3;
        int i2 = this.f33084q;
        int i3 = ((int) ((paddingLeft2 - i2) / 0.75f)) + i2;
        setMeasuredDimension(i, (Math.max(this.f33071d / 3, 1) * i3) + getPaddingTop() + getPaddingBottom());
        for (int i4 = 0; i4 < this.f33071d; i4++) {
            int i5 = i4 / 3;
            int i6 = i4 % 3;
            this.f33083p[i4].m113080g((paddingLeft2 * i6) + paddingLeft, i5 * i3, ((i6 + 1) * paddingLeft2) + paddingLeft, (i5 + 1) * i3);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft2, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.f33085r = paddingLeft2;
        this.f33086s = paddingLeft2;
        for (int i7 = 0; i7 < this.f33071d; i7++) {
            dqk0 dqk0Var = this.f33083p[i7];
            if (dqk0Var.f87436g == null) {
                dqk0Var.m113079f((VReorderCard) getChildAt(i7));
            }
            this.f33083p[i7].f87436g.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f33083p[i7].f87436g.setCurPageId(this.f33092y);
        }
    }

    /* JADX INFO: renamed from: k */
    public dqk0 m50814k(int i, int i2) {
        for (int i3 = 0; i3 < this.f33071d; i3++) {
            if (this.f33083p[i3].m113077d(i, i2)) {
                return this.f33083p[i3];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m50815l(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.f33071d = context.obtainStyledAttributes(attributeSet, k9c0.f121959a).getInteger(k9c0.f121961b, 6);
        }
        setViewCount(this.f33071d);
        setClipChildren(false);
        setClipToPadding(false);
        tjj tjjVar = new tjj(context, this.f33081n);
        this.f33082o = tjjVar;
        tjjVar.m189335b(false);
        this.f33084q = t100.f167256e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m50816m() {
        for (int i = 0; i < this.f33071d; i++) {
            if (NullChecker.m81303a(this.f33083p[i].f87436g.f33047d) && this.f33083p[i].f87436g.f33047d.m105115d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m50817n() {
        return this.f33087t;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m50818o() {
        if (this.f33090w > 0) {
            this.f33091x.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.f33071d; i5++) {
            VReorderCard vReorderCard = this.f33083p[i5].f87436g;
            if (!vReorderCard.m50793m()) {
                vReorderCard.layout(0, 0, vReorderCard.getMeasuredWidth(), vReorderCard.getMeasuredHeight());
                vReorderCard.m50802y();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f33087t) {
            m50813j(size);
            return;
        }
        setMeasuredDimension(i, i);
        int i3 = this.f33084q;
        int i4 = ((size - (i3 * 4)) + 2) / 3;
        int i5 = i4 * 2;
        int[] iArr = {i3, (i3 * 2) + i4, (i3 * 3) + i5};
        int[] iArr2 = {i4 + i3, i5 + (i3 * 2), (i4 * 3) + (i3 * 3)};
        if (this.f33085r != i4) {
            dqk0 dqk0Var = this.f33083p[0];
            int i6 = iArr[0];
            int i7 = iArr2[1];
            dqk0Var.m113080g(i6, i6, i7, i7);
            this.f33083p[1].m113080g(iArr[2], iArr[0], iArr2[2], iArr2[0]);
            this.f33083p[2].m113080g(iArr[2], iArr[1], iArr2[2], iArr2[1]);
            dqk0 dqk0Var2 = this.f33083p[3];
            int i8 = iArr[2];
            int i9 = iArr2[2];
            dqk0Var2.m113080g(i8, i8, i9, i9);
            this.f33083p[4].m113080g(iArr[1], iArr[2], iArr2[1], iArr2[2]);
            this.f33083p[5].m113080g(iArr[0], iArr[2], iArr2[0], iArr2[2]);
            this.f33085r = i4;
            int i10 = iArr2[1];
            this.f33086s = i10;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            for (int i11 = 0; i11 < this.f33071d; i11++) {
                this.f33083p[i11].f87436g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a2m a2mVar;
        super.onTouchEvent(motionEvent);
        if (!this.f33074g) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m50809f(motionEvent);
            if (!this.f33079l) {
                this.f33080m = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (action == 1) {
            dqk0 dqk0Var = this.f33069b;
            if (dqk0Var != null) {
                if (dqk0Var.f87436g.f33044a && (a2mVar = this.f33075h) != null) {
                    a2mVar.mo47541d();
                }
                this.f33069b.f87436g.m50801x();
                this.f33069b = null;
                if (!this.f33073f) {
                    m50810g(motionEvent);
                }
            } else if (this.f33088u) {
                m50810g(motionEvent);
            }
            if (!this.f33079l) {
                this.f33080m = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f33090w = 0L;
        } else if (action == 3) {
            dqk0 dqk0Var2 = this.f33069b;
            if (dqk0Var2 != null) {
                dqk0Var2.f87436g.m50801x();
                this.f33069b = null;
            }
            this.f33090w = 0L;
        }
        if (!this.f33088u && this.f33073f) {
            this.f33082o.m189334a(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public VReorderCard mo50717p() {
        return new VReorderCard(getContext());
    }

    /* JADX INFO: renamed from: q */
    public void m50819q(Runnable runnable) {
        this.f33077j = runnable;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f33093z) {
            return;
        }
        super.requestLayout();
    }

    public void setCardPadding(int i) {
        this.f33084q = i;
    }

    public void setCardsCrop(boolean z) {
        this.f33087t = z;
    }

    public void setClickEnable(boolean z) {
        this.f33074g = z;
    }

    public void setCurPageId(String str) {
        this.f33092y = str;
    }

    public void setDragging(boolean z) {
        if (NullChecker.m81303a(this.f33067B)) {
            this.f33067B.call(Boolean.valueOf(z));
        }
    }

    public void setEnableDrag(boolean z) {
        this.f33073f = z;
    }

    public void setOnDraggingListener(e30<Boolean> e30Var) {
        this.f33067B = e30Var;
    }

    public void setReorderCardsCallback(a2m a2mVar) {
        this.f33075h = a2mVar;
    }

    public void setSlideWithoutPress(boolean z) {
        this.f33079l = z;
    }

    public void setUploadListener(InterfaceC8626b interfaceC8626b) {
        this.f33076i = interfaceC8626b;
    }

    public void setViewCatchListener(InterfaceC8627c interfaceC8627c) {
        this.f33066A = interfaceC8627c;
    }

    public void setViewCount(int i) {
        removeAllViews();
        this.f33071d = i;
        this.f33083p = new dqk0[i];
        for (int i2 = 0; i2 < i; i2++) {
            VReorderCard vReorderCardMo50717p = mo50717p();
            this.f33083p[i2] = new dqk0(this, i2);
            this.f33083p[i2].m113079f(vReorderCardMo50717p);
            addView(vReorderCardMo50717p);
        }
        requestLayout();
    }

    public VReorderCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33068a = "VReorderCards";
        this.f33069b = null;
        this.f33070c = 0.75f;
        this.f33071d = 6;
        this.f33072e = false;
        this.f33073f = true;
        this.f33074g = true;
        this.f33078k = 3;
        this.f33079l = true;
        this.f33080m = false;
        this.f33081n = new C8625a();
        this.f33084q = 1;
        this.f33088u = false;
        this.f33090w = 0L;
        this.f33091x = new Runnable() { // from class: l.aqk0
            @Override // java.lang.Runnable
            public final void run() {
                osi0.m165783g("头像位置不支持更改");
            }
        };
        this.f33092y = "";
        this.f33093z = false;
        m50815l(context, attributeSet);
    }

    public VReorderCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33068a = "VReorderCards";
        this.f33069b = null;
        this.f33070c = 0.75f;
        this.f33071d = 6;
        this.f33072e = false;
        this.f33073f = true;
        this.f33074g = true;
        this.f33078k = 3;
        this.f33079l = true;
        this.f33080m = false;
        this.f33081n = new C8625a();
        this.f33084q = 1;
        this.f33088u = false;
        this.f33090w = 0L;
        this.f33091x = new Runnable() { // from class: l.aqk0
            @Override // java.lang.Runnable
            public final void run() {
                osi0.m165783g("头像位置不支持更改");
            }
        };
        this.f33092y = "";
        this.f33093z = false;
        m50815l(context, attributeSet);
    }
}
