package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VScroll;
import p153l.jzk0;
import p153l.l51;
import p153l.mmj;
import p153l.pzi0;
import p153l.qa00;
import p153l.rhc0;
import p153l.t4m;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class VReorderCards<T extends VReorderCard> extends ViewGroup implements VScroll.InterfaceC22682b {

    /* JADX INFO: renamed from: A */
    public InterfaceC8790c f33914A;

    /* JADX INFO: renamed from: B */
    public y20<Boolean> f33915B;

    /* JADX INFO: renamed from: a */
    public final String f33916a;

    /* JADX INFO: renamed from: b */
    public jzk0 f33917b;

    /* JADX INFO: renamed from: c */
    public final float f33918c;

    /* JADX INFO: renamed from: d */
    public int f33919d;

    /* JADX INFO: renamed from: e */
    public boolean f33920e;

    /* JADX INFO: renamed from: f */
    public boolean f33921f;

    /* JADX INFO: renamed from: g */
    public boolean f33922g;

    /* JADX INFO: renamed from: h */
    public t4m f33923h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8789b f33924i;

    /* JADX INFO: renamed from: j */
    public Runnable f33925j;

    /* JADX INFO: renamed from: k */
    public final int f33926k;

    /* JADX INFO: renamed from: l */
    public boolean f33927l;

    /* JADX INFO: renamed from: m */
    public boolean f33928m;

    /* JADX INFO: renamed from: n */
    public GestureDetector.SimpleOnGestureListener f33929n;

    /* JADX INFO: renamed from: o */
    public mmj f33930o;

    /* JADX INFO: renamed from: p */
    public jzk0[] f33931p;

    /* JADX INFO: renamed from: q */
    public int f33932q;

    /* JADX INFO: renamed from: r */
    public int f33933r;

    /* JADX INFO: renamed from: s */
    public int f33934s;

    /* JADX INFO: renamed from: t */
    public boolean f33935t;

    /* JADX INFO: renamed from: u */
    public boolean f33936u;

    /* JADX INFO: renamed from: v */
    public PointF f33937v;

    /* JADX INFO: renamed from: w */
    public long f33938w;

    /* JADX INFO: renamed from: x */
    public final Runnable f33939x;

    /* JADX INFO: renamed from: y */
    public String f33940y;

    /* JADX INFO: renamed from: z */
    public boolean f33941z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$a */
    public class C8788a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public long f33942a = 0;

        public C8788a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            jzk0 jzk0VarM51997k;
            VReorderCards vReorderCards = VReorderCards.this;
            jzk0 jzk0Var = vReorderCards.f33917b;
            if (jzk0Var == null) {
                return true;
            }
            VReorderCard vReorderCard = jzk0Var.f123276g;
            if (!vReorderCard.f33892a) {
                if (!vReorderCards.f33927l && !vReorderCards.f33928m) {
                    return true;
                }
                vReorderCard.m51967A(motionEvent);
                return true;
            }
            int x = (int) motionEvent2.getX();
            int y = (int) motionEvent2.getY();
            if (!VReorderCards.this.f33917b.m147666d(x, y) && (jzk0VarM51997k = VReorderCards.this.m51997k(x, y)) != null) {
                VReorderCard vReorderCard2 = jzk0VarM51997k.f123276g;
                if (!vReorderCard2.f33893b) {
                    if (vReorderCard2.f33905n) {
                        VReorderCards vReorderCards2 = VReorderCards.this;
                        jzk0 jzk0Var2 = vReorderCards2.f33917b;
                        vReorderCards2.f33917b = jzk0VarM51997k;
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        for (int i2 = 0; i2 < VReorderCards.this.f33919d; i2++) {
                            int i3 = jzk0Var2.f123274e;
                            int i4 = jzk0VarM51997k.f123274e;
                            if (i3 > i4 && i2 == i4) {
                                arrayList.add(jzk0Var2.f123276g);
                            }
                            if (i2 != jzk0Var2.f123274e) {
                                arrayList.add(VReorderCards.this.f33931p[i2].f123276g);
                            }
                            int i5 = jzk0Var2.f123274e;
                            int i6 = jzk0VarM51997k.f123274e;
                            if (i5 < i6 && i2 == i6) {
                                arrayList.add(jzk0Var2.f123276g);
                            }
                        }
                        while (true) {
                            VReorderCards vReorderCards3 = VReorderCards.this;
                            if (i >= vReorderCards3.f33919d) {
                                return true;
                            }
                            vReorderCards3.f33931p[i].m147668f((VReorderCard) arrayList.get(i));
                            VReorderCard vReorderCard3 = VReorderCards.this.f33931p[i].f123276g;
                            if (!vReorderCard3.f33892a) {
                                vReorderCard3.m51971g();
                            }
                            i++;
                        }
                    } else if (vReorderCard2.f33907p) {
                        l51.m152890J(VReorderCards.this.f33939x);
                        l51.m152888H(VReorderCards.this.getContext(), VReorderCards.this.f33939x, ViewConfiguration.getLongPressTimeout());
                    }
                }
            }
            VReorderCards.this.f33917b.f123276g.m51979p(x, y);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            VReorderCard vReorderCard;
            this.f33942a = motionEvent.getDownTime();
            VReorderCards vReorderCards = VReorderCards.this;
            jzk0 jzk0Var = vReorderCards.f33917b;
            if (jzk0Var != null && (vReorderCard = jzk0Var.f123276g) != null && !vReorderCard.f33893b) {
                if (!vReorderCards.f33927l) {
                    vReorderCards.f33928m = true;
                    vReorderCards.getParent().requestDisallowInterceptTouchEvent(true);
                }
                VReorderCards.this.f33917b.f123276g.m51967A(motionEvent);
            }
            InterfaceC8790c interfaceC8790c = VReorderCards.this.f33914A;
            if (interfaceC8790c != null) {
                interfaceC8790c.mo52005a(true);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            long j = this.f33942a;
            long downTime = motionEvent.getDownTime();
            VReorderCards vReorderCards = VReorderCards.this;
            if (j == downTime) {
                InterfaceC8790c interfaceC8790c = vReorderCards.f33914A;
                if (interfaceC8790c != null) {
                    interfaceC8790c.mo52005a(false);
                }
                return false;
            }
            jzk0 jzk0VarM51997k = vReorderCards.m51997k((int) motionEvent.getX(), (int) motionEvent.getY());
            if (jzk0VarM51997k != null) {
                final VReorderCard vReorderCard = jzk0VarM51997k.f123276g;
                vReorderCard.setPressed(true);
                VReorderCards.this.postDelayed(new Runnable() { // from class: l.izk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        vReorderCard.setPressed(false);
                    }
                }, 50L);
                if (!VReorderCards.this.m51999m()) {
                    if (NullChecker.m82486a(VReorderCards.this.f33925j)) {
                        VReorderCards.this.f33925j.run();
                    }
                    jzk0VarM51997k.f123276g.mo51887u();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$b */
    public interface InterfaceC8789b {
        /* JADX INFO: renamed from: a */
        void mo52004a(int i, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCards$c */
    public interface InterfaceC8790c {
        /* JADX INFO: renamed from: a */
        void mo52005a(boolean z);
    }

    public VReorderCards(Context context) {
        super(context);
        this.f33916a = "VReorderCards";
        this.f33917b = null;
        this.f33918c = 0.75f;
        this.f33919d = 6;
        this.f33920e = false;
        this.f33921f = true;
        this.f33922g = true;
        this.f33926k = 3;
        this.f33927l = true;
        this.f33928m = false;
        this.f33929n = new C8788a();
        this.f33932q = 1;
        this.f33936u = false;
        this.f33938w = 0L;
        this.f33939x = new Runnable() { // from class: l.gzk0
            @Override // java.lang.Runnable
            public final void run() {
                r1j0.m179420g("头像位置不支持更改");
            }
        };
        this.f33940y = "";
        this.f33941z = false;
        m51998l(context, null);
    }

    @Override // p151v.VScroll.InterfaceC22682b
    /* JADX INFO: renamed from: a */
    public boolean mo51991a(int i, int i2) {
        jzk0 jzk0VarM51997k = m51997k(i, i2);
        return (jzk0VarM51997k == null || jzk0VarM51997k.f123276g.f33893b) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m51992f(MotionEvent motionEvent) {
        this.f33938w = pzi0.m174454o();
        this.f33937v = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f33936u = false;
        jzk0 jzk0VarM51997k = m51997k((int) motionEvent.getX(), (int) motionEvent.getY());
        if (jzk0VarM51997k != null) {
            int i = jzk0VarM51997k.f123274e;
            if (i >= 0) {
                jzk0 jzk0Var = this.f33931p[i];
                VReorderCard vReorderCard = jzk0Var.f123276g;
                if (!vReorderCard.f33893b) {
                    if (!vReorderCard.f33905n) {
                        if (!vReorderCard.f33907p || this.f33938w <= 0) {
                            return;
                        }
                        l51.m152890J(this.f33939x);
                        l51.m152888H(getContext(), new Runnable() { // from class: l.fzk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f101488a.m52001o();
                            }
                        }, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    this.f33917b = jzk0Var;
                    this.f33941z = true;
                    for (int i2 = 0; i2 < this.f33919d; i2++) {
                        VReorderCard vReorderCard2 = this.f33931p[i2].f123276g;
                        if (vReorderCard2.f33893b) {
                            bringChildToFront(vReorderCard2);
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f33919d;
                        jzk0[] jzk0VarArr = this.f33931p;
                        if (i3 >= i4) {
                            bringChildToFront(jzk0VarArr[i].f123276g);
                            invalidate();
                            this.f33941z = false;
                            return;
                        } else {
                            VReorderCard vReorderCard3 = jzk0VarArr[i3].f123276g;
                            if (!vReorderCard3.f33893b) {
                                bringChildToFront(vReorderCard3);
                            }
                            i3++;
                        }
                    }
                }
            }
            if (i < 0 || !this.f33931p[i].f123276g.f33893b) {
                return;
            }
            this.f33936u = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m51993g(MotionEvent motionEvent) {
        jzk0 jzk0VarM51997k;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (((int) Math.sqrt(Math.pow(Math.abs(x - this.f33937v.x), 2.0d) + Math.pow(Math.abs(y - this.f33937v.y), 2.0d))) >= ViewConfiguration.get(getContext()).getScaledTouchSlop() || (jzk0VarM51997k = m51997k((int) x, (int) y)) == null) {
            return;
        }
        final VReorderCard vReorderCard = jzk0VarM51997k.f123276g;
        vReorderCard.setPressed(true);
        postDelayed(new Runnable() { // from class: l.hzk0
            @Override // java.lang.Runnable
            public final void run() {
                vReorderCard.setPressed(false);
            }
        }, 50L);
        if (m51999m()) {
            return;
        }
        jzk0VarM51997k.f123276g.mo51887u();
    }

    /* JADX INFO: renamed from: h */
    public T m51994h(int i) {
        jzk0[] jzk0VarArr = this.f33931p;
        return jzk0VarArr[0] == null ? (T) getChildAt(i) : (T) jzk0VarArr[i].f123276g;
    }

    /* JADX INFO: renamed from: i */
    public int m51995i() {
        int i = 0;
        for (jzk0 jzk0Var : this.f33931p) {
            VReorderCard vReorderCard = jzk0Var.f123276g;
            if (vReorderCard != null && !vReorderCard.f33893b) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public void m51996j(int i) {
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = ((i - getPaddingLeft()) - getPaddingRight()) / 3;
        int i2 = this.f33932q;
        int i3 = ((int) ((paddingLeft2 - i2) / 0.75f)) + i2;
        setMeasuredDimension(i, (Math.max(this.f33919d / 3, 1) * i3) + getPaddingTop() + getPaddingBottom());
        for (int i4 = 0; i4 < this.f33919d; i4++) {
            int i5 = i4 / 3;
            int i6 = i4 % 3;
            this.f33931p[i4].m147669g((paddingLeft2 * i6) + paddingLeft, i5 * i3, ((i6 + 1) * paddingLeft2) + paddingLeft, (i5 + 1) * i3);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft2, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.f33933r = paddingLeft2;
        this.f33934s = paddingLeft2;
        for (int i7 = 0; i7 < this.f33919d; i7++) {
            jzk0 jzk0Var = this.f33931p[i7];
            if (jzk0Var.f123276g == null) {
                jzk0Var.m147668f((VReorderCard) getChildAt(i7));
            }
            this.f33931p[i7].f123276g.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f33931p[i7].f123276g.setCurPageId(this.f33940y);
        }
    }

    /* JADX INFO: renamed from: k */
    public jzk0 m51997k(int i, int i2) {
        for (int i3 = 0; i3 < this.f33919d; i3++) {
            if (this.f33931p[i3].m147666d(i, i2)) {
                return this.f33931p[i3];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m51998l(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.f33919d = context.obtainStyledAttributes(attributeSet, rhc0.f163120a).getInteger(rhc0.f163122b, 6);
        }
        setViewCount(this.f33919d);
        setClipChildren(false);
        setClipToPadding(false);
        mmj mmjVar = new mmj(context, this.f33929n);
        this.f33930o = mmjVar;
        mmjVar.m159062b(false);
        this.f33932q = qa00.f156318e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m51999m() {
        for (int i = 0; i < this.f33919d; i++) {
            if (NullChecker.m82486a(this.f33931p[i].f123276g.f33895d) && this.f33931p[i].f123276g.f33895d.m204616d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m52000n() {
        return this.f33935t;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m52001o() {
        if (this.f33938w > 0) {
            this.f33939x.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.f33919d; i5++) {
            VReorderCard vReorderCard = this.f33931p[i5].f123276g;
            if (!vReorderCard.m51976m()) {
                vReorderCard.layout(0, 0, vReorderCard.getMeasuredWidth(), vReorderCard.getMeasuredHeight());
                vReorderCard.m51985y();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f33935t) {
            m51996j(size);
            return;
        }
        setMeasuredDimension(i, i);
        int i3 = this.f33932q;
        int i4 = ((size - (i3 * 4)) + 2) / 3;
        int i5 = i4 * 2;
        int[] iArr = {i3, (i3 * 2) + i4, (i3 * 3) + i5};
        int[] iArr2 = {i4 + i3, i5 + (i3 * 2), (i4 * 3) + (i3 * 3)};
        if (this.f33933r != i4) {
            jzk0 jzk0Var = this.f33931p[0];
            int i6 = iArr[0];
            int i7 = iArr2[1];
            jzk0Var.m147669g(i6, i6, i7, i7);
            this.f33931p[1].m147669g(iArr[2], iArr[0], iArr2[2], iArr2[0]);
            this.f33931p[2].m147669g(iArr[2], iArr[1], iArr2[2], iArr2[1]);
            jzk0 jzk0Var2 = this.f33931p[3];
            int i8 = iArr[2];
            int i9 = iArr2[2];
            jzk0Var2.m147669g(i8, i8, i9, i9);
            this.f33931p[4].m147669g(iArr[1], iArr[2], iArr2[1], iArr2[2]);
            this.f33931p[5].m147669g(iArr[0], iArr[2], iArr2[0], iArr2[2]);
            this.f33933r = i4;
            int i10 = iArr2[1];
            this.f33934s = i10;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            for (int i11 = 0; i11 < this.f33919d; i11++) {
                this.f33931p[i11].f123276g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        t4m t4mVar;
        super.onTouchEvent(motionEvent);
        if (!this.f33922g) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m51992f(motionEvent);
            if (!this.f33927l) {
                this.f33928m = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (action == 1) {
            jzk0 jzk0Var = this.f33917b;
            if (jzk0Var != null) {
                if (jzk0Var.f123276g.f33892a && (t4mVar = this.f33923h) != null) {
                    t4mVar.mo48724d();
                }
                this.f33917b.f123276g.m51984x();
                this.f33917b = null;
                if (!this.f33921f) {
                    m51993g(motionEvent);
                }
            } else if (this.f33936u) {
                m51993g(motionEvent);
            }
            if (!this.f33927l) {
                this.f33928m = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f33938w = 0L;
        } else if (action == 3) {
            jzk0 jzk0Var2 = this.f33917b;
            if (jzk0Var2 != null) {
                jzk0Var2.f123276g.m51984x();
                this.f33917b = null;
            }
            this.f33938w = 0L;
        }
        if (!this.f33936u && this.f33921f) {
            this.f33930o.m159061a(motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public VReorderCard mo51900p() {
        return new VReorderCard(getContext());
    }

    /* JADX INFO: renamed from: q */
    public void m52002q(Runnable runnable) {
        this.f33925j = runnable;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f33941z) {
            return;
        }
        super.requestLayout();
    }

    public void setCardPadding(int i) {
        this.f33932q = i;
    }

    public void setCardsCrop(boolean z) {
        this.f33935t = z;
    }

    public void setClickEnable(boolean z) {
        this.f33922g = z;
    }

    public void setCurPageId(String str) {
        this.f33940y = str;
    }

    public void setDragging(boolean z) {
        if (NullChecker.m82486a(this.f33915B)) {
            this.f33915B.call(Boolean.valueOf(z));
        }
    }

    public void setEnableDrag(boolean z) {
        this.f33921f = z;
    }

    public void setOnDraggingListener(y20<Boolean> y20Var) {
        this.f33915B = y20Var;
    }

    public void setReorderCardsCallback(t4m t4mVar) {
        this.f33923h = t4mVar;
    }

    public void setSlideWithoutPress(boolean z) {
        this.f33927l = z;
    }

    public void setUploadListener(InterfaceC8789b interfaceC8789b) {
        this.f33924i = interfaceC8789b;
    }

    public void setViewCatchListener(InterfaceC8790c interfaceC8790c) {
        this.f33914A = interfaceC8790c;
    }

    public void setViewCount(int i) {
        removeAllViews();
        this.f33919d = i;
        this.f33931p = new jzk0[i];
        for (int i2 = 0; i2 < i; i2++) {
            VReorderCard vReorderCardMo51900p = mo51900p();
            this.f33931p[i2] = new jzk0(this, i2);
            this.f33931p[i2].m147668f(vReorderCardMo51900p);
            addView(vReorderCardMo51900p);
        }
        requestLayout();
    }

    public VReorderCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33916a = "VReorderCards";
        this.f33917b = null;
        this.f33918c = 0.75f;
        this.f33919d = 6;
        this.f33920e = false;
        this.f33921f = true;
        this.f33922g = true;
        this.f33926k = 3;
        this.f33927l = true;
        this.f33928m = false;
        this.f33929n = new C8788a();
        this.f33932q = 1;
        this.f33936u = false;
        this.f33938w = 0L;
        this.f33939x = new Runnable() { // from class: l.gzk0
            @Override // java.lang.Runnable
            public final void run() {
                r1j0.m179420g("头像位置不支持更改");
            }
        };
        this.f33940y = "";
        this.f33941z = false;
        m51998l(context, attributeSet);
    }

    public VReorderCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33916a = "VReorderCards";
        this.f33917b = null;
        this.f33918c = 0.75f;
        this.f33919d = 6;
        this.f33920e = false;
        this.f33921f = true;
        this.f33922g = true;
        this.f33926k = 3;
        this.f33927l = true;
        this.f33928m = false;
        this.f33929n = new C8788a();
        this.f33932q = 1;
        this.f33936u = false;
        this.f33938w = 0L;
        this.f33939x = new Runnable() { // from class: l.gzk0
            @Override // java.lang.Runnable
            public final void run() {
                r1j0.m179420g("头像位置不支持更改");
            }
        };
        this.f33940y = "";
        this.f33941z = false;
        m51998l(context, attributeSet);
    }
}
