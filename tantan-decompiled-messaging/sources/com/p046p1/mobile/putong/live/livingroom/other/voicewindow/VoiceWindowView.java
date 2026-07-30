package com.p046p1.mobile.putong.live.livingroom.other.voicewindow;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeDrawable;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.other.floatwindow.AnimatorWrapper;
import com.p046p1.mobile.putong.live.livingroom.other.floatwindow.MoveDirection;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VText;
import p149l.b2c0;
import p149l.e30;
import p149l.e8m;
import p149l.f30;
import p149l.ho2;
import p149l.hxn0;
import p149l.hxs;
import p149l.i3c0;
import p149l.jqi;
import p149l.mzb0;
import p149l.nnn0;
import p149l.pdp0;
import p149l.re50;
import p149l.t100;
import p149l.uep0;
import p149l.v9j;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceWindowView extends FrameLayout implements e8m {

    /* JADX INFO: renamed from: a */
    public View f51287a;

    /* JADX INFO: renamed from: b */
    public View f51288b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51289c;

    /* JADX INFO: renamed from: d */
    public VText f51290d;

    /* JADX INFO: renamed from: e */
    public float f51291e;

    /* JADX INFO: renamed from: f */
    public float f51292f;

    /* JADX INFO: renamed from: g */
    public float f51293g;

    /* JADX INFO: renamed from: h */
    public float f51294h;

    /* JADX INFO: renamed from: i */
    public float f51295i;

    /* JADX INFO: renamed from: j */
    public float f51296j;

    /* JADX INFO: renamed from: k */
    public Context f51297k;

    /* JADX INFO: renamed from: l */
    public long f51298l;

    /* JADX INFO: renamed from: m */
    public AnimatorWrapper f51299m;

    /* JADX INFO: renamed from: n */
    public boolean f51300n;

    /* JADX INFO: renamed from: o */
    public WindowManager.LayoutParams f51301o;

    /* JADX INFO: renamed from: p */
    public e30<WindowManager.LayoutParams> f51302p;

    /* JADX INFO: renamed from: q */
    public jqi f51303q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f51304r;

    /* JADX INFO: renamed from: s */
    public boolean f51305s;

    /* JADX INFO: renamed from: t */
    public Animation f51306t;

    /* JADX INFO: renamed from: u */
    public Animation f51307u;

    /* JADX INFO: renamed from: v */
    public boolean f51308v;

    /* JADX INFO: renamed from: w */
    public Runnable f51309w;

    /* JADX INFO: renamed from: x */
    public v9j<Boolean> f51310x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.voicewindow.VoiceWindowView$a */
    public static /* synthetic */ class C12894a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51311a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f51311a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51311a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51300n = false;
        this.f51309w = new Runnable() { // from class: l.edp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90637a.m75616o();
            }
        };
    }

    public static int getBottomMargin() {
        if (uep0.m193338y(ypv.f199497e)) {
            return xdl0.m208336I(ypv.f199497e);
        }
        return 0;
    }

    private int getTopMargin() {
        return xdl0.m208331F0();
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: a */
    public void mo75605a() {
        m75612k();
        this.f51305s = false;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: b */
    public void mo75606b(View.OnClickListener onClickListener) {
        this.f51304r = onClickListener;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: c */
    public void mo75607c() {
        if (this.f51306t == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), mzb0.f136367c);
            this.f51306t = animationLoadAnimation;
            animationLoadAnimation.setStartOffset(1330L);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), mzb0.f136367c);
            this.f51307u = animationLoadAnimation2;
            animationLoadAnimation2.setStartOffset(1000L);
        }
        mo75605a();
        uep0.m193322i(true, this.f51288b, this.f51287a);
        this.f51287a.startAnimation(this.f51307u);
        this.f51288b.startAnimation(this.f51306t);
        this.f51305s = true;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: d */
    public void mo75608d(ho2 ho2Var, String str) {
        if (ho2Var instanceof nnn0) {
            nnn0 nnn0Var = (nnn0) ho2Var;
            BLiveUserMask bLiveUserMaskM132143k0 = nnn0Var.m132143k0();
            if (bLiveUserMaskM132143k0 != null) {
                hxs.m133398k("context_common", this.f51289c, bLiveUserMaskM132143k0.avatar);
            } else {
                BLiveUserMask bLiveUserMask = hxn0.m133350c(nnn0Var.m160249P2().m102064m(ho2Var.m132146l0().f56011id)).f109896b;
                VDraweeView vDraweeView = this.f51289c;
                if (bLiveUserMask == null) {
                    vDraweeView.setImageResource(i3c0.f110754J8);
                } else {
                    hxs.m133398k("context_common", vDraweeView, bLiveUserMask.avatar);
                }
            }
        } else {
            this.f51289c.setImageResource(i3c0.f110754J8);
        }
        this.f51290d.setText(str);
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: e */
    public boolean mo75609e() {
        return this.f51305s;
    }

    @NotNull
    public View getOriginView() {
        return this;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.f51301o;
    }

    /* JADX INFO: renamed from: i */
    public final void m75610i(View view) {
        pdp0.m168389a(this, view);
    }

    @Override // p149l.e8m
    public void init() {
        this.f51297k = getContext();
        this.f51299m = new AnimatorWrapper(new f30() { // from class: l.fdp0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f97065a.m75621t(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, this, MMConstants.ERR_VCM_UNKNOWN_ERROR);
        m75613l();
        m75614m();
        m75619r();
    }

    /* JADX INFO: renamed from: j */
    public final void m75611j() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f = iArr[0];
        jqi jqiVar = this.f51303q;
        int i = C12894a.f51311a[(f < (((float) jqiVar.f119290g) - f) - ((float) jqiVar.f119288e) ? MoveDirection.Left : MoveDirection.Right).ordinal()];
        if (i == 1) {
            AnimatorWrapper animatorWrapper = this.f51299m;
            MoveDirection moveDirection = MoveDirection.Left;
            WindowManager.LayoutParams layoutParams = this.f51301o;
            animatorWrapper.m75434a(moveDirection, layoutParams.x, layoutParams.y, 0.0f, iArr[1]);
            return;
        }
        if (i != 2) {
            return;
        }
        AnimatorWrapper animatorWrapper2 = this.f51299m;
        MoveDirection moveDirection2 = MoveDirection.Right;
        WindowManager.LayoutParams layoutParams2 = this.f51301o;
        float f2 = layoutParams2.x;
        float f3 = layoutParams2.y;
        jqi jqiVar2 = this.f51303q;
        animatorWrapper2.m75434a(moveDirection2, f2, f3, jqiVar2.f119290g - jqiVar2.f119288e, iArr[1]);
    }

    /* JADX INFO: renamed from: k */
    public final void m75612k() {
        uep0.m193322i(false, this.f51288b, this.f51287a);
        this.f51288b.clearAnimation();
        this.f51287a.clearAnimation();
    }

    /* JADX INFO: renamed from: l */
    public final void m75613l() {
        this.f51303q = new jqi();
        int iM208412y0 = xdl0.m208412y0();
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        if (activity == null) {
            activity = ypv.f199497e;
        }
        int iM208410x0 = xdl0.m208410x0(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(b2c0.f72687e);
        jqi jqiVar = this.f51303q;
        jqiVar.f119284a = dimensionPixelSize;
        jqiVar.f119285b = dimensionPixelSize;
        jqiVar.f119288e = dimensionPixelSize;
        jqiVar.f119289f = dimensionPixelSize;
        jqiVar.f119290g = iM208412y0;
        jqiVar.f119291h = iM208410x0;
        jqiVar.f119286c = iM208412y0 - dimensionPixelSize;
        jqiVar.f119287d = t100.m186890d(88.0f);
    }

    /* JADX INFO: renamed from: m */
    public final void m75614m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        this.f51301o = layoutParams;
        layoutParams.packageName = this.f51297k.getPackageName();
        WindowManager.LayoutParams layoutParams2 = this.f51301o;
        layoutParams2.flags = 197512;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2003;
        }
        layoutParams2.format = 1;
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        jqi jqiVar = this.f51303q;
        layoutParams2.width = jqiVar.f119284a;
        layoutParams2.height = jqiVar.f119285b;
        layoutParams2.x = jqiVar.f119286c;
        layoutParams2.y = jqiVar.f119287d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m75615n() {
        float scaledTouchSlop = ViewConfiguration.get(this.f51297k).getScaledTouchSlop();
        return !(Math.abs(this.f51295i - this.f51293g) > scaledTouchSlop || Math.abs(this.f51296j - this.f51294h) > scaledTouchSlop);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m75616o() {
        this.f51308v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51305s) {
            return;
        }
        mo75607c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f51299m.m75435b();
        mo75605a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75610i(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m75612k();
            this.f51300n = false;
            this.f51299m.m75435b();
            this.f51298l = System.currentTimeMillis();
            this.f51291e = motionEvent.getX();
            this.f51292f = motionEvent.getY();
            this.f51295i = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f51296j = rawY;
            this.f51293g = this.f51295i;
            this.f51294h = rawY;
            postDelayed(this.f51309w, ViewConfiguration.getTapTimeout());
        } else if (action == 1) {
            removeCallbacks(this.f51309w);
            if (this.f51308v && NullChecker.m81303a(null)) {
                throw null;
            }
            this.f51308v = false;
            this.f51300n = false;
            if (m75615n()) {
                this.f51304r.onClick(this);
            } else {
                this.f51293g = motionEvent.getRawX();
                this.f51294h = motionEvent.getRawY();
                m75611j();
                if (this.f51305s) {
                    mo75607c();
                }
            }
        } else if (action == 2) {
            this.f51293g = motionEvent.getRawX();
            this.f51294h = motionEvent.getRawY();
            if (this.f51300n) {
                m75618q();
            } else {
                this.f51300n = !m75615n();
            }
            if (this.f51308v && NullChecker.m81303a(null)) {
                throw null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m75617p() {
        jqi jqiVar = this.f51303q;
        m75620s(jqiVar.f119288e, jqiVar.f119289f);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x004d, please report this as an issue */
    /* JADX INFO: renamed from: q */
    public final void m75618q() {
        jqi jqiVar;
        int i;
        int i2;
        int i3;
        float f;
        int i4 = (int) (this.f51293g - this.f51291e);
        int i5 = (int) (this.f51294h - this.f51292f);
        int topMargin = getTopMargin();
        int bottomMargin = getBottomMargin();
        if (!this.f51310x.call().booleanValue()) {
            bottomMargin += ypv.f199497e.getResources().getDimensionPixelOffset(b2c0.f72683a);
        }
        if (i5 < topMargin) {
            i5 = topMargin;
        } else {
            jqi jqiVar2 = this.f51303q;
            int i6 = jqiVar2.f119291h;
            int i7 = jqiVar2.f119289f;
            if (i5 > i6 - (i7 + bottomMargin)) {
                i5 = i6 - (i7 + bottomMargin);
            }
        }
        if (i4 >= 0) {
            jqi jqiVar3 = this.f51303q;
            if (jqiVar3.f119288e + i4 > jqiVar3.f119290g) {
                jqiVar = this.f51303q;
                if (i4 < 0) {
                    f = (i4 / jqiVar.f119288e) + 1.0f;
                } else {
                    i = jqiVar.f119288e;
                    i2 = i4 + i;
                    i3 = jqiVar.f119290g;
                    if (i2 > i3) {
                        f = 1.0f - (((i4 + i) - i3) / i);
                    } else {
                        f = 0.5f;
                    }
                }
                setAlpha(f >= 0.5f ? f : 0.5f);
            }
        } else {
            jqiVar = this.f51303q;
            if (i4 < 0) {
                f = (i4 / jqiVar.f119288e) + 1.0f;
            } else {
                i = jqiVar.f119288e;
                i2 = i4 + i;
                i3 = jqiVar.f119290g;
                if (i2 > i3) {
                    f = 1.0f - (((i4 + i) - i3) / i);
                } else {
                    f = 0.5f;
                }
            }
            setAlpha(f >= 0.5f ? f : 0.5f);
        }
        m75621t(i4, i5);
    }

    /* JADX INFO: renamed from: r */
    public final void m75619r() {
        post(new Runnable() { // from class: l.gdp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f102128a.m75617p();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m75620s(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f51301o;
        layoutParams.width = i;
        layoutParams.height = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f51302p;
        if (e30Var != null) {
            e30Var.call(layoutParams);
        }
    }

    @Override // p149l.e8m
    public void setShowExitAreaFunc(v9j<Boolean> v9jVar) {
        this.f51310x = v9jVar;
    }

    public void setUpdateWindowAction(e30<WindowManager.LayoutParams> e30Var) {
        this.f51302p = e30Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m75621t(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f51301o;
        layoutParams.x = i;
        layoutParams.y = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f51302p;
        if (e30Var != null) {
            e30Var.call(layoutParams);
        }
    }

    public VoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceWindowView(@NonNull Context context) {
        this(context, null);
    }

    public void setOnTouchListenerNative(@NotNull re50 re50Var) {
    }
}
