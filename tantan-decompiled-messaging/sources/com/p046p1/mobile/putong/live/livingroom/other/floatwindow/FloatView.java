package com.p046p1.mobile.putong.live.livingroom.other.floatwindow;

import android.app.Activity;
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
import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.view.LiveLoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.dqd0;
import p149l.e30;
import p149l.f30;
import p149l.fld0;
import p149l.hdv;
import p149l.iqi;
import p149l.jqi;
import p149l.kqi;
import p149l.uep0;
import p149l.xdl0;
import p149l.xtl;
import p149l.ypv;
import p149l.zqi;

/* JADX INFO: loaded from: classes4.dex */
public class FloatView extends FrameLayout implements xtl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51170a;

    /* JADX INFO: renamed from: b */
    public View f51171b;

    /* JADX INFO: renamed from: c */
    public ViewStub f51172c;

    /* JADX INFO: renamed from: d */
    public VText f51173d;

    /* JADX INFO: renamed from: e */
    public VImage f51174e;

    /* JADX INFO: renamed from: f */
    public VImage f51175f;

    /* JADX INFO: renamed from: g */
    public float f51176g;

    /* JADX INFO: renamed from: h */
    public float f51177h;

    /* JADX INFO: renamed from: i */
    public float f51178i;

    /* JADX INFO: renamed from: j */
    public float f51179j;

    /* JADX INFO: renamed from: k */
    public float f51180k;

    /* JADX INFO: renamed from: l */
    public float f51181l;

    /* JADX INFO: renamed from: m */
    public Context f51182m;

    /* JADX INFO: renamed from: n */
    public long f51183n;

    /* JADX INFO: renamed from: o */
    public AnimatorWrapper f51184o;

    /* JADX INFO: renamed from: p */
    public boolean f51185p;

    /* JADX INFO: renamed from: q */
    public dqd0 f51186q;

    /* JADX INFO: renamed from: r */
    public LiveLoadingView f51187r;

    /* JADX INFO: renamed from: s */
    public MoveDirection f51188s;

    /* JADX INFO: renamed from: t */
    public WindowManager.LayoutParams f51189t;

    /* JADX INFO: renamed from: u */
    public e30<WindowManager.LayoutParams> f51190u;

    /* JADX INFO: renamed from: v */
    public jqi f51191v;

    /* JADX INFO: renamed from: w */
    public List<iqi> f51192w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.FloatView$a */
    public static /* synthetic */ class C12884a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51193a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f51193a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51193a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51193a[MoveDirection.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51193a[MoveDirection.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51185p = false;
        this.f51192w = new ArrayList();
    }

    private int getBottomMargin() {
        if (uep0.m193338y(ypv.f199497e)) {
            return xdl0.m208336I(ypv.f199497e);
        }
        return 0;
    }

    private int getTopMargin() {
        return xdl0.m208331F0();
    }

    /* JADX INFO: renamed from: d */
    public final void m75446d(View view) {
        kqi.m146946a(this, view);
    }

    @Override // p149l.xtl
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m75447e(iqi iqiVar) {
        if (iqiVar != null) {
            this.f51192w.add(iqiVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m75448f(MoveDirection moveDirection) {
        int i;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i2 = 0;
        if (moveDirection == null) {
            float f = iArr[0];
            jqi jqiVar = this.f51191v;
            moveDirection = f < (((float) jqiVar.f119290g) - f) - ((float) jqiVar.f119288e) ? MoveDirection.Left : MoveDirection.Right;
        }
        int topMargin = getTopMargin();
        int i3 = C12884a.f51193a[moveDirection.ordinal()];
        if (i3 == 1) {
            topMargin = iArr[1];
            AnimatorWrapper animatorWrapper = this.f51184o;
            MoveDirection moveDirection2 = MoveDirection.Left;
            WindowManager.LayoutParams layoutParams = this.f51189t;
            animatorWrapper.m75434a(moveDirection2, layoutParams.x, layoutParams.y, 0.0f, topMargin);
        } else if (i3 != 2) {
            if (i3 == 3) {
                i = iArr[0];
                topMargin = getTopMargin();
                AnimatorWrapper animatorWrapper2 = this.f51184o;
                MoveDirection moveDirection3 = MoveDirection.Top;
                WindowManager.LayoutParams layoutParams2 = this.f51189t;
                animatorWrapper2.m75434a(moveDirection3, layoutParams2.x, layoutParams2.y, iArr[0], getTopMargin());
            } else if (i3 == 4) {
                i = iArr[0];
                jqi jqiVar2 = this.f51191v;
                topMargin = (jqiVar2.f119291h - jqiVar2.f119289f) - getBottomMargin();
                AnimatorWrapper animatorWrapper3 = this.f51184o;
                MoveDirection moveDirection4 = MoveDirection.Bottom;
                WindowManager.LayoutParams layoutParams3 = this.f51189t;
                float f2 = layoutParams3.x;
                float f3 = layoutParams3.y;
                float f4 = iArr[0];
                jqi jqiVar3 = this.f51191v;
                animatorWrapper3.m75434a(moveDirection4, f2, f3, f4, (jqiVar3.f119291h - jqiVar3.f119289f) - getBottomMargin());
            }
            i2 = i;
        } else {
            jqi jqiVar4 = this.f51191v;
            int i4 = jqiVar4.f119290g;
            int i5 = jqiVar4.f119288e;
            int i6 = iArr[1];
            AnimatorWrapper animatorWrapper4 = this.f51184o;
            MoveDirection moveDirection5 = MoveDirection.Right;
            WindowManager.LayoutParams layoutParams4 = this.f51189t;
            animatorWrapper4.m75434a(moveDirection5, layoutParams4.x, layoutParams4.y, i4 - i5, i6);
            i2 = i4 - i5;
            topMargin = i6;
        }
        this.f51186q.m113006g(i2, topMargin, moveDirection.name());
        this.f51188s = moveDirection;
    }

    /* JADX INFO: renamed from: g */
    public void m75449g(float f) {
        m75450h(f);
        ViewGroup.LayoutParams layoutParams = this.f51170a.getLayoutParams();
        jqi jqiVar = this.f51191v;
        layoutParams.width = jqiVar.f119284a;
        layoutParams.height = jqiVar.f119285b;
        this.f51170a.setLayoutParams(layoutParams);
        xdl0.m208329E0(this.f51174e, new View.OnClickListener() { // from class: l.eqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92804a.m75454l(view);
            }
        });
        xdl0.m208329E0(this.f51175f, new View.OnClickListener() { // from class: l.fqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98808a.m75455q(view);
            }
        });
        post(new Runnable() { // from class: l.gqi
            @Override // java.lang.Runnable
            public final void run() {
                this.f103952a.m75456r();
            }
        });
    }

    @Override // p149l.xtl
    public FrameLayout getPlayerContainer() {
        return this.f51170a;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.f51189t;
    }

    /* JADX INFO: renamed from: h */
    public final void m75450h(float f) {
        this.f51182m = getContext();
        this.f51186q = ((hdv) ypv.m215673l(fld0.f98150e)).f107313s;
        this.f51184o = new AnimatorWrapper(new f30() { // from class: l.hqi
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f109059a.m75461w(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, this, 800);
        m75451i(f);
        m75452j();
    }

    /* JADX INFO: renamed from: i */
    public final void m75451i(float f) {
        this.f51191v = new jqi();
        int iM208412y0 = xdl0.m208412y0();
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        if (activity == null) {
            activity = ypv.f199497e;
        }
        int iM208410x0 = xdl0.m208410x0(activity);
        int[] iArrM219853a = zqi.m219853a(f);
        int i = iArrM219853a[0];
        int i2 = iArrM219853a[1];
        jqi jqiVar = this.f51191v;
        jqiVar.f119284a = i;
        jqiVar.f119285b = i2;
        jqiVar.f119288e = i;
        jqiVar.f119289f = i2;
        jqiVar.f119290g = iM208412y0;
        jqiVar.f119291h = iM208410x0;
        double dM113003d = this.f51186q.m113003d();
        double dM113004e = this.f51186q.m113004e();
        String strM113002c = this.f51186q.m113002c();
        if (!TextUtils.isEmpty(strM113002c)) {
            if (TextUtils.equals(strM113002c, MoveDirection.Right.name())) {
                dM113003d = iM208412y0 - i;
            } else if (TextUtils.equals(strM113002c, MoveDirection.Bottom.name())) {
                dM113004e = iM208410x0 - (i2 + getBottomMargin());
            }
        }
        jqi jqiVar2 = this.f51191v;
        jqiVar2.f119286c = dM113003d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? iM208412y0 - i : (int) dM113003d;
        jqiVar2.f119287d = dM113004e < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? ypv.m215672k().m195912p5(iM208410x0) : (int) dM113004e;
    }

    /* JADX INFO: renamed from: j */
    public final void m75452j() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        this.f51189t = layoutParams;
        layoutParams.packageName = this.f51182m.getPackageName();
        WindowManager.LayoutParams layoutParams2 = this.f51189t;
        layoutParams2.flags = 197512;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2003;
        }
        layoutParams2.format = 1;
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        jqi jqiVar = this.f51191v;
        layoutParams2.width = jqiVar.f119284a;
        layoutParams2.height = jqiVar.f119285b;
        layoutParams2.x = jqiVar.f119286c;
        layoutParams2.y = jqiVar.f119287d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m75453k() {
        float scaledTouchSlop = ViewConfiguration.get(this.f51182m).getScaledTouchSlop();
        return !((Math.abs(this.f51180k - this.f51178i) > scaledTouchSlop ? 1 : (Math.abs(this.f51180k - this.f51178i) == scaledTouchSlop ? 0 : -1)) > 0 || (Math.abs(this.f51181l - this.f51179j) > scaledTouchSlop ? 1 : (Math.abs(this.f51181l - this.f51179j) == scaledTouchSlop ? 0 : -1)) > 0) && (((System.currentTimeMillis() - this.f51183n) > ((long) ViewConfiguration.getTapTimeout()) ? 1 : ((System.currentTimeMillis() - this.f51183n) == ((long) ViewConfiguration.getTapTimeout()) ? 0 : -1)) < 0);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m75454l(View view) {
        Iterator<iqi> it = this.f51192w.iterator();
        while (it.hasNext()) {
            it.next().mo110492b(true);
        }
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: m */
    public void mo73346m(boolean z) {
        if (this.f51187r == null) {
            this.f51187r = (LiveLoadingView) this.f51172c.inflate();
        }
        LiveLoadingView liveLoadingView = this.f51187r;
        if (z) {
            xdl0.m208344M(liveLoadingView, true);
            this.f51187r.m68744g();
        } else {
            liveLoadingView.m68745h();
            xdl0.m208344M(this.f51172c, false);
        }
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: n */
    public void mo73347n() {
        this.f51173d.setText("");
        xdl0.m208344M(this.f51173d, false);
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: o */
    public void mo73348o(String str) {
        xdl0.m208344M(this.f51173d, true);
        this.f51173d.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51184o.m75435b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75446d(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f51185p = false;
            this.f51184o.m75435b();
            this.f51183n = System.currentTimeMillis();
            this.f51176g = motionEvent.getX();
            this.f51177h = motionEvent.getY();
            this.f51180k = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f51181l = rawY;
            this.f51178i = this.f51180k;
            this.f51179j = rawY;
        } else if (action == 1) {
            this.f51185p = false;
            if (m75453k()) {
                Iterator<iqi> it = this.f51192w.iterator();
                while (it.hasNext()) {
                    it.next().mo110491a();
                }
            } else {
                this.f51178i = motionEvent.getRawX();
                this.f51179j = motionEvent.getRawY();
                float f = this.f51178i - this.f51176g;
                jqi jqiVar = this.f51191v;
                float f2 = jqiVar.f119288e / 2.0f;
                if ((f >= (-f2) && f + f2 <= jqiVar.f119290g) || this.f51192w.isEmpty()) {
                    m75448f(null);
                }
            }
        } else if (action == 2) {
            this.f51178i = motionEvent.getRawX();
            this.f51179j = motionEvent.getRawY();
            if (this.f51185p) {
                m75459u();
            } else {
                this.f51185p = !m75453k();
            }
        }
        return true;
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: p */
    public void mo73349p(boolean z) {
        xdl0.m208344M(this.f51171b, z);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m75455q(View view) {
        VImage vImage = this.f51175f;
        vImage.setSelected(!vImage.isSelected());
        Iterator<iqi> it = this.f51192w.iterator();
        while (it.hasNext()) {
            it.next().mo110493c(this.f51175f.isSelected());
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m75456r() {
        jqi jqiVar = this.f51191v;
        m75460v(jqiVar.f119288e, jqiVar.f119289f);
    }

    /* JADX INFO: renamed from: s */
    public void m75457s(int i, int i2) {
        m75458t(i, i2);
        jqi jqiVar = this.f51191v;
        jqiVar.f119284a = i;
        jqiVar.f119288e = i;
        jqiVar.f119285b = i2;
        jqiVar.f119289f = i2;
        m75448f(this.f51188s);
    }

    public void setUpdateWindowAction(e30<WindowManager.LayoutParams> e30Var) {
        this.f51190u = e30Var;
    }

    @Override // p149l.xtl
    public void setVoiceSelected(boolean z) {
        this.f51175f.setSelected(z);
    }

    /* JADX INFO: renamed from: t */
    public void m75458t(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f51170a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f51170a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m75459u() {
        int i = (int) (this.f51178i - this.f51176g);
        int i2 = (int) (this.f51179j - this.f51177h);
        int topMargin = getTopMargin();
        if (i2 < topMargin) {
            i2 = topMargin;
        } else {
            jqi jqiVar = this.f51191v;
            int i3 = jqiVar.f119291h;
            int i4 = jqiVar.f119289f;
            if (i2 > i3 - i4) {
                i2 = i3 - i4;
            }
        }
        if (i < 0) {
            i = 0;
        } else {
            jqi jqiVar2 = this.f51191v;
            int i5 = jqiVar2.f119290g;
            int i6 = jqiVar2.f119288e;
            if (i > i5 - i6) {
                i = i5 - i6;
            }
        }
        m75461w(i, i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m75460v(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f51189t;
        layoutParams.width = i;
        layoutParams.height = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f51190u;
        if (e30Var != null) {
            e30Var.call(layoutParams);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m75461w(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f51189t;
        layoutParams.x = i;
        layoutParams.y = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f51190u;
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
