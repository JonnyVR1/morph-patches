package com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeDrawable;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.other.floatwindow.AnimatorWrapper;
import com.p051p1.mobile.putong.live.livingroom.other.floatwindow.MoveDirection;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.eem0;
import p153l.fti;
import p153l.iac0;
import p153l.l6o0;
import p153l.obc0;
import p153l.oo2;
import p153l.pcj;
import p153l.qa00;
import p153l.rwn0;
import p153l.uam;
import p153l.y20;
import p153l.ym50;
import p153l.ynp0;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceWindowView extends FrameLayout implements uam {

    /* JADX INFO: renamed from: a */
    public VirtualWaveView f52166a;

    /* JADX INFO: renamed from: b */
    public CommonAnimMaskAvatarView f52167b;

    /* JADX INFO: renamed from: c */
    public float f52168c;

    /* JADX INFO: renamed from: d */
    public float f52169d;

    /* JADX INFO: renamed from: e */
    public float f52170e;

    /* JADX INFO: renamed from: f */
    public float f52171f;

    /* JADX INFO: renamed from: g */
    public float f52172g;

    /* JADX INFO: renamed from: h */
    public float f52173h;

    /* JADX INFO: renamed from: i */
    public Context f52174i;

    /* JADX INFO: renamed from: j */
    public AnimatorWrapper f52175j;

    /* JADX INFO: renamed from: k */
    public boolean f52176k;

    /* JADX INFO: renamed from: l */
    public WindowManager.LayoutParams f52177l;

    /* JADX INFO: renamed from: m */
    public y20<WindowManager.LayoutParams> f52178m;

    /* JADX INFO: renamed from: n */
    public fti f52179n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f52180o;

    /* JADX INFO: renamed from: p */
    public boolean f52181p;

    /* JADX INFO: renamed from: q */
    public boolean f52182q;

    /* JADX INFO: renamed from: r */
    public final Runnable f52183r;

    /* JADX INFO: renamed from: s */
    public pcj<Boolean> f52184s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualVoiceWindowView$a */
    public static /* synthetic */ class C13058a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52185a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f52185a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52185a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52176k = false;
        this.f52183r = new Runnable() { // from class: l.aem0
            @Override // java.lang.Runnable
            public final void run() {
                this.f70814a.m76815o();
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

    /* JADX INFO: renamed from: j */
    private void m76810j() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f = iArr[0];
        fti ftiVar = this.f52179n;
        int i = C13058a.f52185a[(f < (((float) ftiVar.f100747g) - f) - ((float) ftiVar.f100745e) ? MoveDirection.Left : MoveDirection.Right).ordinal()];
        if (i == 1) {
            AnimatorWrapper animatorWrapper = this.f52175j;
            MoveDirection moveDirection = MoveDirection.Left;
            WindowManager.LayoutParams layoutParams = this.f52177l;
            animatorWrapper.m76617a(moveDirection, layoutParams.x, layoutParams.y, 0.0f, iArr[1]);
            return;
        }
        if (i != 2) {
            return;
        }
        AnimatorWrapper animatorWrapper2 = this.f52175j;
        MoveDirection moveDirection2 = MoveDirection.Right;
        WindowManager.LayoutParams layoutParams2 = this.f52177l;
        float f2 = layoutParams2.x;
        float f3 = layoutParams2.y;
        fti ftiVar2 = this.f52179n;
        animatorWrapper2.m76617a(moveDirection2, f2, f3, ftiVar2.f100747g - ftiVar2.f100745e, iArr[1]);
    }

    /* JADX INFO: renamed from: k */
    private void m76811k() {
        this.f52166a.m76846y();
        bnl0.m105524M(this.f52166a, false);
    }

    /* JADX INFO: renamed from: l */
    private void m76812l() {
        this.f52179n = new fti();
        int iM105592y0 = bnl0.m105592y0();
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        if (activity == null) {
            activity = zrv.f205803e;
        }
        int iM105590x0 = bnl0.m105590x0(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(iac0.f113582d);
        int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(iac0.f113581c);
        fti ftiVar = this.f52179n;
        ftiVar.f100741a = dimensionPixelSize;
        ftiVar.f100742b = dimensionPixelSize2;
        ftiVar.f100745e = dimensionPixelSize;
        ftiVar.f100746f = dimensionPixelSize2;
        ftiVar.f100747g = iM105592y0;
        ftiVar.f100748h = iM105590x0;
        ftiVar.f100743c = iM105592y0 - dimensionPixelSize;
        ftiVar.f100744d = qa00.m175859d(116.0f);
    }

    /* JADX INFO: renamed from: m */
    private void m76813m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        this.f52177l = layoutParams;
        layoutParams.packageName = this.f52174i.getPackageName();
        WindowManager.LayoutParams layoutParams2 = this.f52177l;
        layoutParams2.flags = 197512;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2003;
        }
        layoutParams2.format = 1;
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        fti ftiVar = this.f52179n;
        layoutParams2.width = ftiVar.f100741a;
        layoutParams2.height = ftiVar.f100742b;
        layoutParams2.x = ftiVar.f100743c;
        layoutParams2.y = ftiVar.f100744d;
    }

    /* JADX INFO: renamed from: n */
    private boolean m76814n() {
        float scaledTouchSlop = ViewConfiguration.get(this.f52174i).getScaledTouchSlop();
        return !(Math.abs(this.f52172g - this.f52170e) > scaledTouchSlop || Math.abs(this.f52173h - this.f52171f) > scaledTouchSlop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m76815o() {
        this.f52182q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m76816p() {
        fti ftiVar = this.f52179n;
        m76819s(ftiVar.f100745e, ftiVar.f100746f);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x004d, please report this as an issue */
    /* JADX INFO: renamed from: q */
    private void m76817q() {
        fti ftiVar;
        int i;
        int i2;
        int i3;
        float f;
        int i4 = (int) (this.f52170e - this.f52168c);
        int i5 = (int) (this.f52171f - this.f52169d);
        int topMargin = getTopMargin();
        int bottomMargin = getBottomMargin();
        if (!this.f52184s.call().booleanValue()) {
            bottomMargin += zrv.f205803e.getResources().getDimensionPixelOffset(iac0.f113579a);
        }
        if (i5 < topMargin) {
            i5 = topMargin;
        } else {
            fti ftiVar2 = this.f52179n;
            int i6 = ftiVar2.f100748h;
            int i7 = ftiVar2.f100746f;
            if (i5 > i6 - (i7 + bottomMargin)) {
                i5 = i6 - (i7 + bottomMargin);
            }
        }
        if (i4 >= 0) {
            fti ftiVar3 = this.f52179n;
            if (ftiVar3.f100745e + i4 > ftiVar3.f100747g) {
                ftiVar = this.f52179n;
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
            ftiVar = this.f52179n;
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
        m76820t(i4, i5);
    }

    /* JADX INFO: renamed from: r */
    private void m76818r() {
        post(new Runnable() { // from class: l.cem0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81371a.m76816p();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    private void m76819s(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f52177l;
        layoutParams.width = i;
        layoutParams.height = i2;
        y20<WindowManager.LayoutParams> y20Var = this.f52178m;
        if (y20Var != null) {
            y20Var.call(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m76820t(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f52177l;
        layoutParams.x = i;
        layoutParams.y = i2;
        y20<WindowManager.LayoutParams> y20Var = this.f52178m;
        if (y20Var != null) {
            y20Var.call(layoutParams);
        }
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: a */
    public void mo76788a() {
        m76811k();
        this.f52181p = false;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: b */
    public void mo76789b(View.OnClickListener onClickListener) {
        this.f52180o = onClickListener;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: c */
    public void mo76790c() {
        bnl0.m105524M(this.f52166a, true);
        this.f52166a.m76846y();
        this.f52166a.m76845x();
        this.f52181p = true;
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: d */
    public void mo76791d(oo2 oo2Var, String str) {
        if (!(oo2Var instanceof rwn0)) {
            this.f52167b.setImageResID(obc0.f146082J8);
            return;
        }
        rwn0 rwn0Var = (rwn0) oo2Var;
        BLiveUserMask bLiveUserMaskM168529k0 = rwn0Var.m168529k0();
        if (bLiveUserMaskM168529k0 != null) {
            this.f52167b.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_common").m73296c(bLiveUserMaskM168529k0.avatar).m73295b(bLiveUserMaskM168529k0.avatarResourceType).m73294a());
            return;
        }
        BLiveUserMask bLiveUserMask = l6o0.m153068c(rwn0Var.m183411P2().m136874m(oo2Var.m168532l0().f56859id)).f130275b;
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this.f52167b;
        if (bLiveUserMask == null) {
            commonAnimMaskAvatarView.setImageResID(obc0.f146082J8);
        } else {
            commonAnimMaskAvatarView.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_common").m73296c(bLiveUserMask.avatar).m73295b(bLiveUserMask.avatarResourceType).m73294a());
        }
    }

    @Override // p153l.uam
    /* JADX INFO: renamed from: e */
    public boolean mo76792e() {
        return this.f52181p;
    }

    @NotNull
    public View getOriginView() {
        return this;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.f52177l;
    }

    /* JADX INFO: renamed from: i */
    public final void m76821i(View view) {
        eem0.m120552a(this, view);
    }

    @Override // p153l.uam
    public void init() {
        this.f52174i = getContext();
        this.f52175j = new AnimatorWrapper(new z20() { // from class: l.bem0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f76401a.m76820t(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, this, MMConstants.ERR_VCM_UNKNOWN_ERROR);
        m76812l();
        m76813m();
        m76818r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f52175j.m76618b();
        m76811k();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76821i(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m76811k();
            this.f52176k = false;
            this.f52175j.m76618b();
            this.f52168c = motionEvent.getX();
            this.f52169d = motionEvent.getY();
            this.f52172g = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f52173h = rawY;
            this.f52170e = this.f52172g;
            this.f52171f = rawY;
            postDelayed(this.f52183r, ViewConfiguration.getTapTimeout());
        } else if (action == 1) {
            removeCallbacks(this.f52183r);
            if (this.f52182q && NullChecker.m82486a(null)) {
                throw null;
            }
            this.f52182q = false;
            this.f52176k = false;
            if (m76814n()) {
                this.f52180o.onClick(this);
            } else {
                this.f52170e = motionEvent.getRawX();
                this.f52171f = motionEvent.getRawY();
                m76810j();
                if (this.f52181p) {
                    mo76790c();
                }
            }
        } else if (action == 2) {
            this.f52170e = motionEvent.getRawX();
            this.f52171f = motionEvent.getRawY();
            if (this.f52176k) {
                m76817q();
            } else {
                this.f52176k = !m76814n();
            }
            if (this.f52182q && NullChecker.m82486a(null)) {
                throw null;
            }
        }
        return true;
    }

    @Override // p153l.uam
    public void setShowExitAreaFunc(pcj<Boolean> pcjVar) {
        this.f52184s = pcjVar;
    }

    public void setUpdateWindowAction(y20<WindowManager.LayoutParams> y20Var) {
        this.f52178m = y20Var;
    }

    public VirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VirtualVoiceWindowView(@NonNull Context context) {
        this(context, null);
    }

    public void setOnTouchListenerNative(@NotNull ym50 ym50Var) {
    }
}
