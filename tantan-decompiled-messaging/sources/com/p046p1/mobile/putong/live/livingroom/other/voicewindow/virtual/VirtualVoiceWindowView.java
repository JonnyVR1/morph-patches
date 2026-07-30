package com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.other.floatwindow.AnimatorWrapper;
import com.p046p1.mobile.putong.live.livingroom.other.floatwindow.MoveDirection;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p149l.a5m0;
import p149l.b2c0;
import p149l.e30;
import p149l.e8m;
import p149l.f30;
import p149l.ho2;
import p149l.hxn0;
import p149l.i3c0;
import p149l.jqi;
import p149l.nnn0;
import p149l.re50;
import p149l.t100;
import p149l.uep0;
import p149l.v9j;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceWindowView extends FrameLayout implements e8m {

    /* JADX INFO: renamed from: a */
    public VirtualWaveView f51318a;

    /* JADX INFO: renamed from: b */
    public CommonAnimMaskAvatarView f51319b;

    /* JADX INFO: renamed from: c */
    public float f51320c;

    /* JADX INFO: renamed from: d */
    public float f51321d;

    /* JADX INFO: renamed from: e */
    public float f51322e;

    /* JADX INFO: renamed from: f */
    public float f51323f;

    /* JADX INFO: renamed from: g */
    public float f51324g;

    /* JADX INFO: renamed from: h */
    public float f51325h;

    /* JADX INFO: renamed from: i */
    public Context f51326i;

    /* JADX INFO: renamed from: j */
    public AnimatorWrapper f51327j;

    /* JADX INFO: renamed from: k */
    public boolean f51328k;

    /* JADX INFO: renamed from: l */
    public WindowManager.LayoutParams f51329l;

    /* JADX INFO: renamed from: m */
    public e30<WindowManager.LayoutParams> f51330m;

    /* JADX INFO: renamed from: n */
    public jqi f51331n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f51332o;

    /* JADX INFO: renamed from: p */
    public boolean f51333p;

    /* JADX INFO: renamed from: q */
    public boolean f51334q;

    /* JADX INFO: renamed from: r */
    public final Runnable f51335r;

    /* JADX INFO: renamed from: s */
    public v9j<Boolean> f51336s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualVoiceWindowView$a */
    public static /* synthetic */ class C12895a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51337a;

        static {
            int[] iArr = new int[MoveDirection.values().length];
            f51337a = iArr;
            try {
                iArr[MoveDirection.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51337a[MoveDirection.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51328k = false;
        this.f51335r = new Runnable() { // from class: l.w4m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184575a.m75632o();
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

    /* JADX INFO: renamed from: j */
    private void m75627j() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f = iArr[0];
        jqi jqiVar = this.f51331n;
        int i = C12895a.f51337a[(f < (((float) jqiVar.f119290g) - f) - ((float) jqiVar.f119288e) ? MoveDirection.Left : MoveDirection.Right).ordinal()];
        if (i == 1) {
            AnimatorWrapper animatorWrapper = this.f51327j;
            MoveDirection moveDirection = MoveDirection.Left;
            WindowManager.LayoutParams layoutParams = this.f51329l;
            animatorWrapper.m75434a(moveDirection, layoutParams.x, layoutParams.y, 0.0f, iArr[1]);
            return;
        }
        if (i != 2) {
            return;
        }
        AnimatorWrapper animatorWrapper2 = this.f51327j;
        MoveDirection moveDirection2 = MoveDirection.Right;
        WindowManager.LayoutParams layoutParams2 = this.f51329l;
        float f2 = layoutParams2.x;
        float f3 = layoutParams2.y;
        jqi jqiVar2 = this.f51331n;
        animatorWrapper2.m75434a(moveDirection2, f2, f3, jqiVar2.f119290g - jqiVar2.f119288e, iArr[1]);
    }

    /* JADX INFO: renamed from: k */
    private void m75628k() {
        this.f51318a.m75663y();
        xdl0.m208344M(this.f51318a, false);
    }

    /* JADX INFO: renamed from: l */
    private void m75629l() {
        this.f51331n = new jqi();
        int iM208412y0 = xdl0.m208412y0();
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        if (activity == null) {
            activity = ypv.f199497e;
        }
        int iM208410x0 = xdl0.m208410x0(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(b2c0.f72686d);
        int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(b2c0.f72685c);
        jqi jqiVar = this.f51331n;
        jqiVar.f119284a = dimensionPixelSize;
        jqiVar.f119285b = dimensionPixelSize2;
        jqiVar.f119288e = dimensionPixelSize;
        jqiVar.f119289f = dimensionPixelSize2;
        jqiVar.f119290g = iM208412y0;
        jqiVar.f119291h = iM208410x0;
        jqiVar.f119286c = iM208412y0 - dimensionPixelSize;
        jqiVar.f119287d = t100.m186890d(116.0f);
    }

    /* JADX INFO: renamed from: m */
    private void m75630m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2);
        this.f51329l = layoutParams;
        layoutParams.packageName = this.f51326i.getPackageName();
        WindowManager.LayoutParams layoutParams2 = this.f51329l;
        layoutParams2.flags = 197512;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2003;
        }
        layoutParams2.format = 1;
        layoutParams2.gravity = BadgeDrawable.TOP_START;
        jqi jqiVar = this.f51331n;
        layoutParams2.width = jqiVar.f119284a;
        layoutParams2.height = jqiVar.f119285b;
        layoutParams2.x = jqiVar.f119286c;
        layoutParams2.y = jqiVar.f119287d;
    }

    /* JADX INFO: renamed from: n */
    private boolean m75631n() {
        float scaledTouchSlop = ViewConfiguration.get(this.f51326i).getScaledTouchSlop();
        return !(Math.abs(this.f51324g - this.f51322e) > scaledTouchSlop || Math.abs(this.f51325h - this.f51323f) > scaledTouchSlop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m75632o() {
        this.f51334q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m75633p() {
        jqi jqiVar = this.f51331n;
        m75636s(jqiVar.f119288e, jqiVar.f119289f);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x004d, please report this as an issue */
    /* JADX INFO: renamed from: q */
    private void m75634q() {
        jqi jqiVar;
        int i;
        int i2;
        int i3;
        float f;
        int i4 = (int) (this.f51322e - this.f51320c);
        int i5 = (int) (this.f51323f - this.f51321d);
        int topMargin = getTopMargin();
        int bottomMargin = getBottomMargin();
        if (!this.f51336s.call().booleanValue()) {
            bottomMargin += ypv.f199497e.getResources().getDimensionPixelOffset(b2c0.f72683a);
        }
        if (i5 < topMargin) {
            i5 = topMargin;
        } else {
            jqi jqiVar2 = this.f51331n;
            int i6 = jqiVar2.f119291h;
            int i7 = jqiVar2.f119289f;
            if (i5 > i6 - (i7 + bottomMargin)) {
                i5 = i6 - (i7 + bottomMargin);
            }
        }
        if (i4 >= 0) {
            jqi jqiVar3 = this.f51331n;
            if (jqiVar3.f119288e + i4 > jqiVar3.f119290g) {
                jqiVar = this.f51331n;
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
            jqiVar = this.f51331n;
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
        m75637t(i4, i5);
    }

    /* JADX INFO: renamed from: r */
    private void m75635r() {
        post(new Runnable() { // from class: l.y4m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196305a.m75633p();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    private void m75636s(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f51329l;
        layoutParams.width = i;
        layoutParams.height = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f51330m;
        if (e30Var != null) {
            e30Var.call(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m75637t(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f51329l;
        layoutParams.x = i;
        layoutParams.y = i2;
        e30<WindowManager.LayoutParams> e30Var = this.f51330m;
        if (e30Var != null) {
            e30Var.call(layoutParams);
        }
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: a */
    public void mo75605a() {
        m75628k();
        this.f51333p = false;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: b */
    public void mo75606b(View.OnClickListener onClickListener) {
        this.f51332o = onClickListener;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: c */
    public void mo75607c() {
        xdl0.m208344M(this.f51318a, true);
        this.f51318a.m75663y();
        this.f51318a.m75662x();
        this.f51333p = true;
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: d */
    public void mo75608d(ho2 ho2Var, String str) {
        if (!(ho2Var instanceof nnn0)) {
            this.f51319b.setImageResID(i3c0.f110754J8);
            return;
        }
        nnn0 nnn0Var = (nnn0) ho2Var;
        BLiveUserMask bLiveUserMaskM132143k0 = nnn0Var.m132143k0();
        if (bLiveUserMaskM132143k0 != null) {
            this.f51319b.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_common").m72113c(bLiveUserMaskM132143k0.avatar).m72112b(bLiveUserMaskM132143k0.avatarResourceType).m72111a());
            return;
        }
        BLiveUserMask bLiveUserMask = hxn0.m133350c(nnn0Var.m160249P2().m102064m(ho2Var.m132146l0().f56011id)).f109896b;
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this.f51319b;
        if (bLiveUserMask == null) {
            commonAnimMaskAvatarView.setImageResID(i3c0.f110754J8);
        } else {
            commonAnimMaskAvatarView.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_common").m72113c(bLiveUserMask.avatar).m72112b(bLiveUserMask.avatarResourceType).m72111a());
        }
    }

    @Override // p149l.e8m
    /* JADX INFO: renamed from: e */
    public boolean mo75609e() {
        return this.f51333p;
    }

    @NotNull
    public View getOriginView() {
        return this;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.f51329l;
    }

    /* JADX INFO: renamed from: i */
    public final void m75638i(View view) {
        a5m0.m95055a(this, view);
    }

    @Override // p149l.e8m
    public void init() {
        this.f51326i = getContext();
        this.f51327j = new AnimatorWrapper(new f30() { // from class: l.x4m0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f191042a.m75637t(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, this, MMConstants.ERR_VCM_UNKNOWN_ERROR);
        m75629l();
        m75630m();
        m75635r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f51327j.m75435b();
        m75628k();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75638i(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m75628k();
            this.f51328k = false;
            this.f51327j.m75435b();
            this.f51320c = motionEvent.getX();
            this.f51321d = motionEvent.getY();
            this.f51324g = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            this.f51325h = rawY;
            this.f51322e = this.f51324g;
            this.f51323f = rawY;
            postDelayed(this.f51335r, ViewConfiguration.getTapTimeout());
        } else if (action == 1) {
            removeCallbacks(this.f51335r);
            if (this.f51334q && NullChecker.m81303a(null)) {
                throw null;
            }
            this.f51334q = false;
            this.f51328k = false;
            if (m75631n()) {
                this.f51332o.onClick(this);
            } else {
                this.f51322e = motionEvent.getRawX();
                this.f51323f = motionEvent.getRawY();
                m75627j();
                if (this.f51333p) {
                    mo75607c();
                }
            }
        } else if (action == 2) {
            this.f51322e = motionEvent.getRawX();
            this.f51323f = motionEvent.getRawY();
            if (this.f51328k) {
                m75634q();
            } else {
                this.f51328k = !m75631n();
            }
            if (this.f51334q && NullChecker.m81303a(null)) {
                throw null;
            }
        }
        return true;
    }

    @Override // p149l.e8m
    public void setShowExitAreaFunc(v9j<Boolean> v9jVar) {
        this.f51336s = v9jVar;
    }

    public void setUpdateWindowAction(e30<WindowManager.LayoutParams> e30Var) {
        this.f51330m = e30Var;
    }

    public VirtualVoiceWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VirtualVoiceWindowView(@NonNull Context context) {
        this(context, null);
    }

    public void setOnTouchListenerNative(@NotNull re50 re50Var) {
    }
}
