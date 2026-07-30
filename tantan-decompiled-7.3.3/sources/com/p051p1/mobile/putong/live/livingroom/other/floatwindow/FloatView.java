package com.p051p1.mobile.putong.live.livingroom.other.floatwindow;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.view.LiveLoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.eti;
import p153l.fti;
import p153l.fyd0;
import p153l.gti;
import p153l.htd0;
import p153l.ifv;
import p153l.lwl;
import p153l.vti;
import p153l.y20;
import p153l.ynp0;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class FloatView extends FrameLayout implements lwl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52018a;

    /* JADX INFO: renamed from: b */
    public View f52019b;

    /* JADX INFO: renamed from: c */
    public ViewStub f52020c;

    /* JADX INFO: renamed from: d */
    public VText f52021d;

    /* JADX INFO: renamed from: e */
    public VImage f52022e;

    /* JADX INFO: renamed from: f */
    public VImage f52023f;

    /* JADX INFO: renamed from: g */
    public float f52024g;

    /* JADX INFO: renamed from: h */
    public float f52025h;

    /* JADX INFO: renamed from: i */
    public float f52026i;

    /* JADX INFO: renamed from: j */
    public float f52027j;

    /* JADX INFO: renamed from: k */
    public float f52028k;

    /* JADX INFO: renamed from: l */
    public float f52029l;

    /* JADX INFO: renamed from: m */
    public Context f52030m;

    /* JADX INFO: renamed from: n */
    public long f52031n;

    /* JADX INFO: renamed from: o */
    public AnimatorWrapper f52032o;

    /* JADX INFO: renamed from: p */
    public boolean f52033p;

    /* JADX INFO: renamed from: q */
    public fyd0 f52034q;

    /* JADX INFO: renamed from: r */
    public LiveLoadingView f52035r;

    /* JADX INFO: renamed from: s */
    public MoveDirection f52036s;

    /* JADX INFO: renamed from: t */
    public WindowManager.LayoutParams f52037t;

    /* JADX INFO: renamed from: u */
    public y20<WindowManager.LayoutParams> f52038u;

    /* JADX INFO: renamed from: v */
    public fti f52039v;

    /* JADX INFO: renamed from: w */
    public List<eti> f52040w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.FloatView$a */
    public static /* synthetic */ class C13047a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52041a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f52041a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52041a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52041a[MoveDirection.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52041a[MoveDirection.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52033p = false;
        this.f52040w = new ArrayList();
    }

    private int getBottomMargin() {
        if (ynp0.m216948y(zrv.f205803e)) {
            return bnl0.m105516I(zrv.f205803e);
        }
        return 0;
    }

    private int getTopMargin() {
        return bnl0.m105511F0();
    }

    /* JADX INFO: renamed from: d */
    public final void m76629d(View view) {
        gti.m132239a(this, view);
    }

    @Override // p153l.lwl
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m76630e(eti etiVar) {
        if (etiVar != null) {
            this.f52040w.add(etiVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m76631f(MoveDirection moveDirection) {
        int i;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i2 = 0;
        if (moveDirection == null) {
            float f = iArr[0];
            fti ftiVar = this.f52039v;
            moveDirection = f < (((float) ftiVar.f100747g) - f) - ((float) ftiVar.f100745e) ? MoveDirection.Left : MoveDirection.Right;
        }
        int topMargin = getTopMargin();
        int i3 = C13047a.f52041a[moveDirection.ordinal()];
        if (i3 == 1) {
            topMargin = iArr[1];
            AnimatorWrapper animatorWrapper = this.f52032o;
            MoveDirection moveDirection2 = MoveDirection.Left;
            WindowManager.LayoutParams layoutParams = this.f52037t;
            animatorWrapper.m76617a(moveDirection2, layoutParams.x, layoutParams.y, 0.0f, topMargin);
        } else if (i3 != 2) {
            if (i3 == 3) {
                i = iArr[0];
                topMargin = getTopMargin();
                AnimatorWrapper animatorWrapper2 = this.f52032o;
                MoveDirection moveDirection3 = MoveDirection.Top;
                WindowManager.LayoutParams layoutParams2 = this.f52037t;
                animatorWrapper2.m76617a(moveDirection3, layoutParams2.x, layoutParams2.y, iArr[0], getTopMargin());
            } else if (i3 == 4) {
                i = iArr[0];
                fti ftiVar2 = this.f52039v;
                topMargin = (ftiVar2.f100748h - ftiVar2.f100746f) - getBottomMargin();
                AnimatorWrapper animatorWrapper3 = this.f52032o;
                MoveDirection moveDirection4 = MoveDirection.Bottom;
                WindowManager.LayoutParams layoutParams3 = this.f52037t;
                float f2 = layoutParams3.x;
                float f3 = layoutParams3.y;
                float f4 = iArr[0];
                fti ftiVar3 = this.f52039v;
                animatorWrapper3.m76617a(moveDirection4, f2, f3, f4, (ftiVar3.f100748h - ftiVar3.f100746f) - getBottomMargin());
            }
            i2 = i;
        } else {
            fti ftiVar4 = this.f52039v;
            int i4 = ftiVar4.f100747g;
            int i5 = ftiVar4.f100745e;
            int i6 = iArr[1];
            AnimatorWrapper animatorWrapper4 = this.f52032o;
            MoveDirection moveDirection5 = MoveDirection.Right;
            WindowManager.LayoutParams layoutParams4 = this.f52037t;
            animatorWrapper4.m76617a(moveDirection5, layoutParams4.x, layoutParams4.y, i4 - i5, i6);
            i2 = i4 - i5;
            topMargin = i6;
        }
        this.f52034q.m128086g(i2, topMargin, moveDirection.name());
        this.f52036s = moveDirection;
    }

    /* JADX INFO: renamed from: g */
    public void m76632g(float f) {
        m76633h(f);
        ViewGroup.LayoutParams layoutParams = this.f52018a.getLayoutParams();
        fti ftiVar = this.f52039v;
        layoutParams.width = ftiVar.f100741a;
        layoutParams.height = ftiVar.f100742b;
        this.f52018a.setLayoutParams(layoutParams);
        bnl0.m105509E0(this.f52022e, new View.OnClickListener() { // from class: l.ati
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73366a.m76637l(view);
            }
        });
        bnl0.m105509E0(this.f52023f, new View.OnClickListener() { // from class: l.bti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78357a.m76638q(view);
            }
        });
        post(new Runnable() { // from class: l.cti
            @Override // java.lang.Runnable
            public final void run() {
                this.f83702a.m76639r();
            }
        });
    }

    @Override // p153l.lwl
    public FrameLayout getPlayerContainer() {
        return this.f52018a;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.f52037t;
    }

    /* JADX INFO: renamed from: h */
    public final void m76633h(float f) {
        this.f52030m = getContext();
        this.f52034q = ((ifv) zrv.m221194l(htd0.f111523e)).f114710s;
        this.f52032o = new AnimatorWrapper(new z20() { // from class: l.dti
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f90597a.m76644w(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, this, 800);
        m76634i(f);
        m76635j();
    }

    /* JADX INFO: renamed from: i */
    public final void m76634i(float f) {
        this.f52039v = new fti();
        int iM105592y0 = bnl0.m105592y0();
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        if (activity == null) {
            activity = zrv.f205803e;
        }
        int iM105590x0 = bnl0.m105590x0(activity);
        int[] iArrM202673a = vti.m202673a(f);
        int i = iArrM202673a[0];
        int i2 = iArrM202673a[1];
        fti ftiVar = this.f52039v;
        ftiVar.f100741a = i;
        ftiVar.f100742b = i2;
        ftiVar.f100745e = i;
        ftiVar.f100746f = i2;
        ftiVar.f100747g = iM105592y0;
        ftiVar.f100748h = iM105590x0;
        double dM128083d = this.f52034q.m128083d();
        double dM128084e = this.f52034q.m128084e();
        String strM128082c = this.f52034q.m128082c();
        if (!TextUtils.isEmpty(strM128082c)) {
            if (TextUtils.equals(strM128082c, MoveDirection.Right.name())) {
                dM128083d = iM105592y0 - i;
            } else if (TextUtils.equals(strM128082c, MoveDirection.Bottom.name())) {
                dM128084e = iM105590x0 - (i2 + getBottomMargin());
            }
        }
        fti ftiVar2 = this.f52039v;
        ftiVar2.f100743c = dM128083d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? iM105592y0 - i : (int) dM128083d;
        ftiVar2.f100744d = dM128084e < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? zrv.m221193k().m203699p5(iM105590x0) : (int) dM128084e;
    }

    /* JADX INFO: renamed from: j */
    public final void m76635j() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        this.f52037t = layoutParams;
        layoutParams.packageName = this.f52030m.getPackageName();
        WindowManager.LayoutParams layoutParams2 = this.f52037t;
        layoutParams2.flags = 197512;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2003;
        }
        layoutParams2.format = 1;
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        fti ftiVar = this.f52039v;
        layoutParams2.width = ftiVar.f100741a;
        layoutParams2.height = ftiVar.f100742b;
        layoutParams2.x = ftiVar.f100743c;
        layoutParams2.y = ftiVar.f100744d;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m76636k() {
        float scaledTouchSlop = ViewConfiguration.get(this.f52030m).getScaledTouchSlop();
        return !((Math.abs(this.f52028k - this.f52026i) > scaledTouchSlop ? 1 : (Math.abs(this.f52028k - this.f52026i) == scaledTouchSlop ? 0 : -1)) > 0 || (Math.abs(this.f52029l - this.f52027j) > scaledTouchSlop ? 1 : (Math.abs(this.f52029l - this.f52027j) == scaledTouchSlop ? 0 : -1)) > 0) && (((System.currentTimeMillis() - this.f52031n) > ((long) ViewConfiguration.getTapTimeout()) ? 1 : ((System.currentTimeMillis() - this.f52031n) == ((long) ViewConfiguration.getTapTimeout()) ? 0 : -1)) < 0);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m76637l(View view) {
        Iterator<eti> it = this.f52040w.iterator();
        while (it.hasNext()) {
            it.next().mo120251b(true);
        }
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: m */
    public void mo74529m(boolean z) {
        if (this.f52035r == null) {
            this.f52035r = (LiveLoadingView) this.f52020c.inflate();
        }
        LiveLoadingView liveLoadingView = this.f52035r;
        if (z) {
            bnl0.m105524M(liveLoadingView, true);
            this.f52035r.m69927g();
        } else {
            liveLoadingView.m69928h();
            bnl0.m105524M(this.f52020c, false);
        }
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: n */
    public void mo74530n() {
        this.f52021d.setText("");
        bnl0.m105524M(this.f52021d, false);
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: o */
    public void mo74531o(String str) {
        bnl0.m105524M(this.f52021d, true);
        this.f52021d.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52032o.m76618b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76629d(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f52033p = false;
            this.f52032o.m76618b();
            this.f52031n = System.currentTimeMillis();
            this.f52024g = motionEvent.getX();
            this.f52025h = motionEvent.getY();
            this.f52028k = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f52029l = rawY;
            this.f52026i = this.f52028k;
            this.f52027j = rawY;
        } else if (action == 1) {
            this.f52033p = false;
            if (m76636k()) {
                Iterator<eti> it = this.f52040w.iterator();
                while (it.hasNext()) {
                    it.next().mo120250a();
                }
            } else {
                this.f52026i = motionEvent.getRawX();
                this.f52027j = motionEvent.getRawY();
                float f = this.f52026i - this.f52024g;
                fti ftiVar = this.f52039v;
                float f2 = ftiVar.f100745e / 2.0f;
                if ((f >= (-f2) && f + f2 <= ftiVar.f100747g) || this.f52040w.isEmpty()) {
                    m76631f(null);
                }
            }
        } else if (action == 2) {
            this.f52026i = motionEvent.getRawX();
            this.f52027j = motionEvent.getRawY();
            if (this.f52033p) {
                m76642u();
            } else {
                this.f52033p = !m76636k();
            }
        }
        return true;
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: p */
    public void mo74532p(boolean z) {
        bnl0.m105524M(this.f52019b, z);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m76638q(View view) {
        VImage vImage = this.f52023f;
        vImage.setSelected(!vImage.isSelected());
        Iterator<eti> it = this.f52040w.iterator();
        while (it.hasNext()) {
            it.next().mo120252c(this.f52023f.isSelected());
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m76639r() {
        fti ftiVar = this.f52039v;
        m76643v(ftiVar.f100745e, ftiVar.f100746f);
    }

    /* JADX INFO: renamed from: s */
    public void m76640s(int i, int i2) {
        m76641t(i, i2);
        fti ftiVar = this.f52039v;
        ftiVar.f100741a = i;
        ftiVar.f100745e = i;
        ftiVar.f100742b = i2;
        ftiVar.f100746f = i2;
        m76631f(this.f52036s);
    }

    public void setUpdateWindowAction(y20<WindowManager.LayoutParams> y20Var) {
        this.f52038u = y20Var;
    }

    @Override // p153l.lwl
    public void setVoiceSelected(boolean z) {
        this.f52023f.setSelected(z);
    }

    /* JADX INFO: renamed from: t */
    public void m76641t(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f52018a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f52018a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m76642u() {
        int i = (int) (this.f52026i - this.f52024g);
        int i2 = (int) (this.f52027j - this.f52025h);
        int topMargin = getTopMargin();
        if (i2 < topMargin) {
            i2 = topMargin;
        } else {
            fti ftiVar = this.f52039v;
            int i3 = ftiVar.f100748h;
            int i4 = ftiVar.f100746f;
            if (i2 > i3 - i4) {
                i2 = i3 - i4;
            }
        }
        if (i < 0) {
            i = 0;
        } else {
            fti ftiVar2 = this.f52039v;
            int i5 = ftiVar2.f100747g;
            int i6 = ftiVar2.f100745e;
            if (i > i5 - i6) {
                i = i5 - i6;
            }
        }
        m76644w(i, i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m76643v(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f52037t;
        layoutParams.width = i;
        layoutParams.height = i2;
        y20<WindowManager.LayoutParams> y20Var = this.f52038u;
        if (y20Var != null) {
            y20Var.call(layoutParams);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m76644w(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f52037t;
        layoutParams.x = i;
        layoutParams.y = i2;
        y20<WindowManager.LayoutParams> y20Var = this.f52038u;
        if (y20Var != null) {
            y20Var.call(layoutParams);
        }
    }

    public FloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatView(Context context) {
        this(context, null);
    }
}
