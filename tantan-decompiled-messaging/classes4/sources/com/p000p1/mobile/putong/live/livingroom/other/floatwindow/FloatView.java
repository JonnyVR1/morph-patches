package com.p000p1.mobile.putong.live.livingroom.other.floatwindow;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.view.LiveLoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.dqd0;
import l.e30;
import l.f30;
import l.fld0;
import l.hdv;
import l.uep0;
import l.xdl0;
import l.ypv;
import p002l.iqi;
import p002l.jqi;
import p002l.kqi;
import p002l.xtl;
import p002l.zqi;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FloatView extends FrameLayout implements xtl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f7212a;

    /* JADX INFO: renamed from: b */
    public View f7213b;

    /* JADX INFO: renamed from: c */
    public ViewStub f7214c;

    /* JADX INFO: renamed from: d */
    public VText f7215d;

    /* JADX INFO: renamed from: e */
    public VImage f7216e;

    /* JADX INFO: renamed from: f */
    public VImage f7217f;

    /* JADX INFO: renamed from: g */
    public float f7218g;

    /* JADX INFO: renamed from: h */
    public float f7219h;

    /* JADX INFO: renamed from: i */
    public float f7220i;

    /* JADX INFO: renamed from: j */
    public float f7221j;

    /* JADX INFO: renamed from: k */
    public float f7222k;

    /* JADX INFO: renamed from: l */
    public float f7223l;

    /* JADX INFO: renamed from: m */
    public Context f7224m;

    /* JADX INFO: renamed from: n */
    public long f7225n;

    /* JADX INFO: renamed from: o */
    public AnimatorWrapper f7226o;

    /* JADX INFO: renamed from: p */
    public boolean f7227p;

    /* JADX INFO: renamed from: q */
    public dqd0 f7228q;

    /* JADX INFO: renamed from: r */
    public LiveLoadingView f7229r;

    /* JADX INFO: renamed from: s */
    public MoveDirection f7230s;

    /* JADX INFO: renamed from: t */
    public WindowManager.LayoutParams f7231t;

    /* JADX INFO: renamed from: u */
    public e30<WindowManager.LayoutParams> f7232u;

    /* JADX INFO: renamed from: v */
    public jqi f7233v;

    /* JADX INFO: renamed from: w */
    public List<iqi> f7234w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.FloatView$a */
    public static /* synthetic */ class C0473a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7235a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f7235a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7235a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7235a[MoveDirection.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7235a[MoveDirection.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7227p = false;
        this.f7234w = new ArrayList();
    }

    private int getBottomMargin() {
        if (uep0.y(ypv.e)) {
            return xdl0.I(ypv.e);
        }
        return 0;
    }

    private int getTopMargin() {
        return xdl0.F0();
    }

    /* JADX INFO: renamed from: d */
    public final void m9079d(View view) {
        kqi.m16762a(this, view);
    }

    @Override // p002l.xtl
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m9080e(iqi iqiVar) {
        if (iqiVar != null) {
            this.f7234w.add(iqiVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9081f(MoveDirection moveDirection) {
        int i;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i2 = 0;
        if (moveDirection == null) {
            float f = iArr[0];
            jqi jqiVar = this.f7233v;
            moveDirection = f < (((float) jqiVar.f13989g) - f) - ((float) jqiVar.f13987e) ? MoveDirection.Left : MoveDirection.Right;
        }
        int topMargin = getTopMargin();
        int i3 = C0473a.f7235a[moveDirection.ordinal()];
        if (i3 == 1) {
            topMargin = iArr[1];
            AnimatorWrapper animatorWrapper = this.f7226o;
            MoveDirection moveDirection2 = MoveDirection.Left;
            WindowManager.LayoutParams layoutParams = this.f7231t;
            animatorWrapper.m9067a(moveDirection2, layoutParams.x, layoutParams.y, 0.0f, topMargin);
        } else if (i3 != 2) {
            if (i3 == 3) {
                i = iArr[0];
                topMargin = getTopMargin();
                AnimatorWrapper animatorWrapper2 = this.f7226o;
                MoveDirection moveDirection3 = MoveDirection.Top;
                WindowManager.LayoutParams layoutParams2 = this.f7231t;
                animatorWrapper2.m9067a(moveDirection3, layoutParams2.x, layoutParams2.y, iArr[0], getTopMargin());
            } else if (i3 == 4) {
                i = iArr[0];
                jqi jqiVar2 = this.f7233v;
                topMargin = (jqiVar2.f13990h - jqiVar2.f13988f) - getBottomMargin();
                AnimatorWrapper animatorWrapper3 = this.f7226o;
                MoveDirection moveDirection4 = MoveDirection.Bottom;
                WindowManager.LayoutParams layoutParams3 = this.f7231t;
                float f2 = layoutParams3.x;
                float f3 = layoutParams3.y;
                float f4 = iArr[0];
                jqi jqiVar3 = this.f7233v;
                animatorWrapper3.m9067a(moveDirection4, f2, f3, f4, (jqiVar3.f13990h - jqiVar3.f13988f) - getBottomMargin());
            }
            i2 = i;
        } else {
            jqi jqiVar4 = this.f7233v;
            int i4 = jqiVar4.f13989g;
            int i5 = jqiVar4.f13987e;
            int i6 = iArr[1];
            AnimatorWrapper animatorWrapper4 = this.f7226o;
            MoveDirection moveDirection5 = MoveDirection.Right;
            WindowManager.LayoutParams layoutParams4 = this.f7231t;
            animatorWrapper4.m9067a(moveDirection5, layoutParams4.x, layoutParams4.y, i4 - i5, i6);
            i2 = i4 - i5;
            topMargin = i6;
        }
        this.f7228q.g(i2, topMargin, moveDirection.name());
        this.f7230s = moveDirection;
    }

    /* JADX INFO: renamed from: g */
    public void m9082g(float f) {
        m9083h(f);
        ViewGroup.LayoutParams layoutParams = this.f7212a.getLayoutParams();
        jqi jqiVar = this.f7233v;
        layoutParams.width = jqiVar.f13983a;
        layoutParams.height = jqiVar.f13984b;
        this.f7212a.setLayoutParams(layoutParams);
        xdl0.E0(this.f7216e, new View.OnClickListener() { // from class: l.eqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9931a.m9087l(view);
            }
        });
        xdl0.E0(this.f7217f, new View.OnClickListener() { // from class: l.fqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10597a.m9088q(view);
            }
        });
        post(new Runnable() { // from class: l.gqi
            @Override // java.lang.Runnable
            public final void run() {
                this.f11578a.m9089r();
            }
        });
    }

    @Override // p002l.xtl
    public FrameLayout getPlayerContainer() {
        return this.f7212a;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.f7231t;
    }

    /* JADX INFO: renamed from: h */
    public final void m9083h(float f) {
        this.f7224m = getContext();
        this.f7228q = ((hdv) ypv.l(fld0.e)).s;
        this.f7226o = new AnimatorWrapper(new f30() { // from class: l.hqi
            public final void call(Object obj, Object obj2) {
                this.f12218a.m9094w(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, this, 800);
        m9084i(f);
        m9085j();
    }

    /* JADX INFO: renamed from: i */
    public final void m9084i(float f) {
        this.f7233v = new jqi();
        int iY0 = xdl0.y0();
        Context context = Act.foreground_() == null ? null : (Context) Act.foreground_().a.get();
        if (context == null) {
            context = ypv.e;
        }
        int iX0 = xdl0.x0(context);
        int[] iArrM27502a = zqi.m27502a(f);
        int i = iArrM27502a[0];
        int i2 = iArrM27502a[1];
        jqi jqiVar = this.f7233v;
        jqiVar.f13983a = i;
        jqiVar.f13984b = i2;
        jqiVar.f13987e = i;
        jqiVar.f13988f = i2;
        jqiVar.f13989g = iY0;
        jqiVar.f13990h = iX0;
        double d = this.f7228q.d();
        double dE = this.f7228q.e();
        String strC = this.f7228q.c();
        if (!TextUtils.isEmpty(strC)) {
            if (TextUtils.equals(strC, MoveDirection.Right.name())) {
                d = iY0 - i;
            } else if (TextUtils.equals(strC, MoveDirection.Bottom.name())) {
                dE = iX0 - (i2 + getBottomMargin());
            }
        }
        jqi jqiVar2 = this.f7233v;
        jqiVar2.f13985c = d < 0.0d ? iY0 - i : (int) d;
        jqiVar2.f13986d = dE < 0.0d ? ypv.k().p5(iX0) : (int) dE;
    }

    /* JADX INFO: renamed from: j */
    public final void m9085j() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        this.f7231t = layoutParams;
        layoutParams.packageName = this.f7224m.getPackageName();
        WindowManager.LayoutParams layoutParams2 = this.f7231t;
        layoutParams2.flags = 197512;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2003;
        }
        layoutParams2.format = 1;
        layoutParams2.gravity = 8388659;
        jqi jqiVar = this.f7233v;
        layoutParams2.width = jqiVar.f13983a;
        layoutParams2.height = jqiVar.f13984b;
        layoutParams2.x = jqiVar.f13985c;
        layoutParams2.y = jqiVar.f13986d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9086k() {
        float scaledTouchSlop = ViewConfiguration.get(this.f7224m).getScaledTouchSlop();
        return !((Math.abs(this.f7222k - this.f7220i) > scaledTouchSlop ? 1 : (Math.abs(this.f7222k - this.f7220i) == scaledTouchSlop ? 0 : -1)) > 0 || (Math.abs(this.f7223l - this.f7221j) > scaledTouchSlop ? 1 : (Math.abs(this.f7223l - this.f7221j) == scaledTouchSlop ? 0 : -1)) > 0) && (((System.currentTimeMillis() - this.f7225n) > ((long) ViewConfiguration.getTapTimeout()) ? 1 : ((System.currentTimeMillis() - this.f7225n) == ((long) ViewConfiguration.getTapTimeout()) ? 0 : -1)) < 0);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9087l(View view) {
        Iterator<iqi> it = this.f7234w.iterator();
        while (it.hasNext()) {
            it.next().mo11698b(true);
        }
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: m */
    public void mo6882m(boolean z) {
        if (this.f7229r == null) {
            this.f7229r = this.f7214c.inflate();
        }
        LiveLoadingView liveLoadingView = this.f7229r;
        if (z) {
            xdl0.M(liveLoadingView, true);
            this.f7229r.g();
        } else {
            liveLoadingView.h();
            xdl0.M(this.f7214c, false);
        }
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: n */
    public void mo6883n() {
        this.f7215d.setText("");
        xdl0.M(this.f7215d, false);
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: o */
    public void mo6884o(String str) {
        xdl0.M(this.f7215d, true);
        this.f7215d.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7226o.m9068b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9079d(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7227p = false;
            this.f7226o.m9068b();
            this.f7225n = System.currentTimeMillis();
            this.f7218g = motionEvent.getX();
            this.f7219h = motionEvent.getY();
            this.f7222k = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f7223l = rawY;
            this.f7220i = this.f7222k;
            this.f7221j = rawY;
        } else if (action == 1) {
            this.f7227p = false;
            if (m9086k()) {
                Iterator<iqi> it = this.f7234w.iterator();
                while (it.hasNext()) {
                    it.next().mo11697a();
                }
            } else {
                this.f7220i = motionEvent.getRawX();
                this.f7221j = motionEvent.getRawY();
                float f = this.f7220i - this.f7218g;
                jqi jqiVar = this.f7233v;
                float f2 = jqiVar.f13987e / 2.0f;
                if ((f >= (-f2) && f + f2 <= jqiVar.f13989g) || this.f7234w.isEmpty()) {
                    m9081f(null);
                }
            }
        } else if (action == 2) {
            this.f7220i = motionEvent.getRawX();
            this.f7221j = motionEvent.getRawY();
            if (this.f7227p) {
                m9092u();
            } else {
                this.f7227p = !m9086k();
            }
        }
        return true;
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: p */
    public void mo6885p(boolean z) {
        xdl0.M(this.f7213b, z);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m9088q(View view) {
        VImage vImage = this.f7217f;
        vImage.setSelected(!vImage.isSelected());
        Iterator<iqi> it = this.f7234w.iterator();
        while (it.hasNext()) {
            it.next().mo11699c(this.f7217f.isSelected());
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m9089r() {
        jqi jqiVar = this.f7233v;
        m9093v(jqiVar.f13987e, jqiVar.f13988f);
    }

    /* JADX INFO: renamed from: s */
    public void m9090s(int i, int i2) {
        m9091t(i, i2);
        jqi jqiVar = this.f7233v;
        jqiVar.f13983a = i;
        jqiVar.f13987e = i;
        jqiVar.f13984b = i2;
        jqiVar.f13988f = i2;
        m9081f(this.f7230s);
    }

    public void setUpdateWindowAction(e30<WindowManager.LayoutParams> e30Var) {
        this.f7232u = e30Var;
    }

    @Override // p002l.xtl
    public void setVoiceSelected(boolean z) {
        this.f7217f.setSelected(z);
    }

    /* JADX INFO: renamed from: t */
    public void m9091t(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f7212a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f7212a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m9092u() {
        int i = (int) (this.f7220i - this.f7218g);
        int i2 = (int) (this.f7221j - this.f7219h);
        int topMargin = getTopMargin();
        if (i2 < topMargin) {
            i2 = topMargin;
        } else {
            jqi jqiVar = this.f7233v;
            int i3 = jqiVar.f13990h;
            int i4 = jqiVar.f13988f;
            if (i2 > i3 - i4) {
                i2 = i3 - i4;
            }
        }
        if (i < 0) {
            i = 0;
        } else {
            jqi jqiVar2 = this.f7233v;
            int i5 = jqiVar2.f13989g;
            int i6 = jqiVar2.f13987e;
            if (i > i5 - i6) {
                i = i5 - i6;
            }
        }
        m9094w(i, i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m9093v(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f7231t;
        layoutParams.width = i;
        layoutParams.height = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f7232u;
        if (e30Var != null) {
            e30Var.call(layoutParams);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m9094w(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f7231t;
        layoutParams.x = i;
        layoutParams.y = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f7232u;
        if (e30Var != null) {
            e30Var.call(layoutParams);
        }
    }

    public FloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatView(Context context) {
        this(context, null);
    }
}
