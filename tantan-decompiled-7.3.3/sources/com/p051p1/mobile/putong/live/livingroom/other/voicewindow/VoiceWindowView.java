package com.p051p1.mobile.putong.live.livingroom.other.voicewindow;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.other.floatwindow.AnimatorWrapper;
import com.p051p1.mobile.putong.live.livingroom.other.floatwindow.MoveDirection;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.fti;
import p153l.iac0;
import p153l.izs;
import p153l.l6o0;
import p153l.obc0;
import p153l.oo2;
import p153l.pcj;
import p153l.qa00;
import p153l.r7c0;
import p153l.rwn0;
import p153l.tmp0;
import p153l.uam;
import p153l.y20;
import p153l.ym50;
import p153l.ynp0;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceWindowView extends FrameLayout implements uam {

    /* JADX INFO: renamed from: a */
    public View f52135a;

    /* JADX INFO: renamed from: b */
    public View f52136b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52137c;

    /* JADX INFO: renamed from: d */
    public VText f52138d;

    /* JADX INFO: renamed from: e */
    public float f52139e;

    /* JADX INFO: renamed from: f */
    public float f52140f;

    /* JADX INFO: renamed from: g */
    public float f52141g;

    /* JADX INFO: renamed from: h */
    public float f52142h;

    /* JADX INFO: renamed from: i */
    public float f52143i;

    /* JADX INFO: renamed from: j */
    public float f52144j;

    /* JADX INFO: renamed from: k */
    public Context f52145k;

    /* JADX INFO: renamed from: l */
    public long f52146l;

    /* JADX INFO: renamed from: m */
    public AnimatorWrapper f52147m;

    /* JADX INFO: renamed from: n */
    public boolean f52148n;

    /* JADX INFO: renamed from: o */
    public WindowManager.LayoutParams f52149o;

    /* JADX INFO: renamed from: p */
    public y20<WindowManager.LayoutParams> f52150p;

    /* JADX INFO: renamed from: q */
    public fti f52151q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f52152r;

    /* JADX INFO: renamed from: s */
    public boolean f52153s;

    /* JADX INFO: renamed from: t */
    public Animation f52154t;

    /* JADX INFO: renamed from: u */
    public Animation f52155u;

    /* JADX INFO: renamed from: v */
    public boolean f52156v;

    /* JADX INFO: renamed from: w */
    public Runnable f52157w;

    /* JADX INFO: renamed from: x */
    public pcj<Boolean> f52158x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.voicewindow.VoiceWindowView$a */
    public static /* synthetic */ class C13057a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52159a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f52159a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52159a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52148n = false;
        this.f52157w = new Runnable() { // from class: l.imp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f115822a.m76799o();
            }
        };
    }

    public static int getBottomMargin() {
        if (ynp0.m216948y(zrv.f205803e)) {
            return bnl0.m105516I(zrv.f205803e);
        }
        return 0;
    }

    private int getTopMargin() {
        return bnl0.m105511F0();
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: a */
    public void mo76788a() {
        m76795k();
        this.f52153s = false;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: b */
    public void mo76789b(View.OnClickListener onClickListener) {
        this.f52152r = onClickListener;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: c */
    public void mo76790c() {
        if (this.f52154t == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), r7c0.f161602c);
            this.f52154t = animationLoadAnimation;
            animationLoadAnimation.setStartOffset(1330L);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), r7c0.f161602c);
            this.f52155u = animationLoadAnimation2;
            animationLoadAnimation2.setStartOffset(1000L);
        }
        mo76788a();
        ynp0.m216932i(true, this.f52136b, this.f52135a);
        this.f52135a.startAnimation(this.f52155u);
        this.f52136b.startAnimation(this.f52154t);
        this.f52153s = true;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: d */
    public void mo76791d(oo2 oo2Var, String str) {
        if (oo2Var instanceof rwn0) {
            rwn0 rwn0Var = (rwn0) oo2Var;
            BLiveUserMask bLiveUserMaskM168529k0 = rwn0Var.m168529k0();
            if (bLiveUserMaskM168529k0 != null) {
                izs.m142860k("context_common", this.f52137c, bLiveUserMaskM168529k0.avatar);
            } else {
                BLiveUserMask bLiveUserMask = l6o0.m153068c(rwn0Var.m183411P2().m136874m(oo2Var.m168532l0().f56859id)).f130275b;
                VDraweeView vDraweeView = this.f52137c;
                if (bLiveUserMask == null) {
                    vDraweeView.setImageResource(obc0.f146082J8);
                } else {
                    izs.m142860k("context_common", vDraweeView, bLiveUserMask.avatar);
                }
            }
        } else {
            this.f52137c.setImageResource(obc0.f146082J8);
        }
        this.f52138d.setText(str);
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: e */
    public boolean mo76792e() {
        return this.f52153s;
    }

    @NotNull
    public View getOriginView() {
        return this;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.f52149o;
    }

    /* JADX INFO: renamed from: i */
    public final void m76793i(View view) {
        tmp0.m191806a(this, view);
    }

    @Override // p153l.uam
    public void init() {
        this.f52145k = getContext();
        this.f52147m = new AnimatorWrapper(new z20() { // from class: l.jmp0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f121694a.m76804t(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, this, MMConstants.ERR_VCM_UNKNOWN_ERROR);
        m76796l();
        m76797m();
        m76802r();
    }

    /* JADX INFO: renamed from: j */
    public final void m76794j() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f = iArr[0];
        fti ftiVar = this.f52151q;
        int i = C13057a.f52159a[(f < (((float) ftiVar.f100747g) - f) - ((float) ftiVar.f100745e) ? MoveDirection.Left : MoveDirection.Right).ordinal()];
        if (i == 1) {
            AnimatorWrapper animatorWrapper = this.f52147m;
            MoveDirection moveDirection = MoveDirection.Left;
            WindowManager.LayoutParams layoutParams = this.f52149o;
            animatorWrapper.m76617a(moveDirection, layoutParams.x, layoutParams.y, 0.0f, iArr[1]);
            return;
        }
        if (i != 2) {
            return;
        }
        AnimatorWrapper animatorWrapper2 = this.f52147m;
        MoveDirection moveDirection2 = MoveDirection.Right;
        WindowManager.LayoutParams layoutParams2 = this.f52149o;
        float f2 = layoutParams2.x;
        float f3 = layoutParams2.y;
        fti ftiVar2 = this.f52151q;
        animatorWrapper2.m76617a(moveDirection2, f2, f3, ftiVar2.f100747g - ftiVar2.f100745e, iArr[1]);
    }

    /* JADX INFO: renamed from: k */
    public final void m76795k() {
        ynp0.m216932i(false, this.f52136b, this.f52135a);
        this.f52136b.clearAnimation();
        this.f52135a.clearAnimation();
    }

    /* JADX INFO: renamed from: l */
    public final void m76796l() {
        this.f52151q = new fti();
        int iM105592y0 = bnl0.m105592y0();
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        if (activity == null) {
            activity = zrv.f205803e;
        }
        int iM105590x0 = bnl0.m105590x0(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(iac0.f113583e);
        fti ftiVar = this.f52151q;
        ftiVar.f100741a = dimensionPixelSize;
        ftiVar.f100742b = dimensionPixelSize;
        ftiVar.f100745e = dimensionPixelSize;
        ftiVar.f100746f = dimensionPixelSize;
        ftiVar.f100747g = iM105592y0;
        ftiVar.f100748h = iM105590x0;
        ftiVar.f100743c = iM105592y0 - dimensionPixelSize;
        ftiVar.f100744d = qa00.m175859d(88.0f);
    }

    /* JADX INFO: renamed from: m */
    public final void m76797m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        this.f52149o = layoutParams;
        layoutParams.packageName = this.f52145k.getPackageName();
        WindowManager.LayoutParams layoutParams2 = this.f52149o;
        layoutParams2.flags = 197512;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2003;
        }
        layoutParams2.format = 1;
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        fti ftiVar = this.f52151q;
        layoutParams2.width = ftiVar.f100741a;
        layoutParams2.height = ftiVar.f100742b;
        layoutParams2.x = ftiVar.f100743c;
        layoutParams2.y = ftiVar.f100744d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m76798n() {
        float scaledTouchSlop = ViewConfiguration.get(this.f52145k).getScaledTouchSlop();
        return !(Math.abs(this.f52143i - this.f52141g) > scaledTouchSlop || Math.abs(this.f52144j - this.f52142h) > scaledTouchSlop);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m76799o() {
        this.f52156v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f52153s) {
            return;
        }
        mo76790c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f52147m.m76618b();
        mo76788a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76793i(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m76795k();
            this.f52148n = false;
            this.f52147m.m76618b();
            this.f52146l = System.currentTimeMillis();
            this.f52139e = motionEvent.getX();
            this.f52140f = motionEvent.getY();
            this.f52143i = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f52144j = rawY;
            this.f52141g = this.f52143i;
            this.f52142h = rawY;
            postDelayed(this.f52157w, ViewConfiguration.getTapTimeout());
        } else if (action == 1) {
            removeCallbacks(this.f52157w);
            if (this.f52156v && NullChecker.m82486a(null)) {
                throw null;
            }
            this.f52156v = false;
            this.f52148n = false;
            if (m76798n()) {
                this.f52152r.onClick(this);
            } else {
                this.f52141g = motionEvent.getRawX();
                this.f52142h = motionEvent.getRawY();
                m76794j();
                if (this.f52153s) {
                    mo76790c();
                }
            }
        } else if (action == 2) {
            this.f52141g = motionEvent.getRawX();
            this.f52142h = motionEvent.getRawY();
            if (this.f52148n) {
                m76801q();
            } else {
                this.f52148n = !m76798n();
            }
            if (this.f52156v && NullChecker.m82486a(null)) {
                throw null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m76800p() {
        fti ftiVar = this.f52151q;
        m76803s(ftiVar.f100745e, ftiVar.f100746f);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x004d, please report this as an issue */
    /* JADX INFO: renamed from: q */
    public final void m76801q() {
        fti ftiVar;
        int i;
        int i2;
        int i3;
        float f;
        int i4 = (int) (this.f52141g - this.f52139e);
        int i5 = (int) (this.f52142h - this.f52140f);
        int topMargin = getTopMargin();
        int bottomMargin = getBottomMargin();
        if (!this.f52158x.call().booleanValue()) {
            bottomMargin += zrv.f205803e.getResources().getDimensionPixelOffset(iac0.f113579a);
        }
        if (i5 < topMargin) {
            i5 = topMargin;
        } else {
            fti ftiVar2 = this.f52151q;
            int i6 = ftiVar2.f100748h;
            int i7 = ftiVar2.f100746f;
            if (i5 > i6 - (i7 + bottomMargin)) {
                i5 = i6 - (i7 + bottomMargin);
            }
        }
        if (i4 >= 0) {
            fti ftiVar3 = this.f52151q;
            if (ftiVar3.f100745e + i4 > ftiVar3.f100747g) {
                ftiVar = this.f52151q;
                if (i4 < 0) {
                    f = (i4 / ftiVar.f100745e) + 1.0f;
                } else {
                    i = ftiVar.f100745e;
                    i2 = i4 + i;
                    i3 = ftiVar.f100747g;
                    if (i2 > i3) {
                        f = 1.0f - (((i4 + i) - i3) / i);
                    } else {
                        f = 0.5f;
                    }
                }
                setAlpha(f >= 0.5f ? f : 0.5f);
            }
        } else {
            ftiVar = this.f52151q;
            if (i4 < 0) {
                f = (i4 / ftiVar.f100745e) + 1.0f;
            } else {
                i = ftiVar.f100745e;
                i2 = i4 + i;
                i3 = ftiVar.f100747g;
                if (i2 > i3) {
                    f = 1.0f - (((i4 + i) - i3) / i);
                } else {
                    f = 0.5f;
                }
            }
            setAlpha(f >= 0.5f ? f : 0.5f);
        }
        m76804t(i4, i5);
    }

    /* JADX INFO: renamed from: r */
    public final void m76802r() {
        post(new Runnable() { // from class: l.kmp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127527a.m76800p();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m76803s(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f52149o;
        layoutParams.width = i;
        layoutParams.height = i2;
        y20<WindowManager.LayoutParams> y20Var = this.f52150p;
        if (y20Var != null) {
            y20Var.call(layoutParams);
        }
    }

    @Override // p153l.uam
    public void setShowExitAreaFunc(pcj<Boolean> pcjVar) {
        this.f52158x = pcjVar;
    }

    public void setUpdateWindowAction(y20<WindowManager.LayoutParams> y20Var) {
        this.f52150p = y20Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m76804t(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f52149o;
        layoutParams.x = i;
        layoutParams.y = i2;
        y20<WindowManager.LayoutParams> y20Var = this.f52150p;
        if (y20Var != null) {
            y20Var.call(layoutParams);
        }
    }

    public VoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceWindowView(@NonNull Context context) {
        this(context, null);
    }

    public void setOnTouchListenerNative(@NotNull ym50 ym50Var) {
    }
}
