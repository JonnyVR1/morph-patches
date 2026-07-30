package com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceFunctionPanelViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p149l.bt0;
import p149l.cxq;
import p149l.dt0;
import p149l.i3c0;
import p149l.jzl;
import p149l.m760;
import p149l.nnn0;
import p149l.t100;
import p149l.xdl0;
import p149l.xxu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0018J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0018J\u001d\u0010#\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\rJ\r\u0010(\u001a\u00020\u000b¢\u0006\u0004\b(\u0010\rJ\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\rJ\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010\rR\"\u00103\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0012R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010?\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u0018\u0010A\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106¨\u0006B"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/LiveVirtualVoiceFunctionPanelView;", "Ll/nnn0;", "D", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceFunctionPanelViewBindings;", "Ll/xxu;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "q0", "", "isManager", "t0", "(Z)V", "visible", "setSwitchViewVisible", "Landroid/view/View;", "contentView", "m0", "(Landroid/view/View;)V", "collapseView", "expandView", "", "expandViewWidth", "Ll/jzl;", "iPanelPage", "n0", "(Landroid/view/View;Landroid/view/View;ILl/jzl;)V", "z0", "o0", "p0", "(Landroid/view/View;Z)V", "supportExpand", "setSupportExpand", "destroy", "v0", "r0", "u0", "collapse", "y0", "w0", "j", "Z", "s0", "()Z", "setCollapse", "isCollapse", "Landroid/animation/Animator;", "k", "Landroid/animation/Animator;", "getCollapseArrowAnim", "()Landroid/animation/Animator;", "setCollapseArrowAnim", "(Landroid/animation/Animator;)V", "collapseArrowAnim", BLiveStormDanmakuGiftResourceType.f44444l, "getCollapseAnim", "setCollapseAnim", "collapseAnim", "m", "animator", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class LiveVirtualVoiceFunctionPanelView<D extends nnn0> extends LiveVirtualVoiceFunctionPanelViewBindings<xxu<D>> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isCollapse;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Animator collapseArrowAnim;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Animator collapseAnim;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Animator animator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVirtualVoiceFunctionPanelView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m77574i0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView) {
        if (liveVirtualVoiceFunctionPanelView.getIsCollapse()) {
            return;
        }
        liveVirtualVoiceFunctionPanelView.m77589w0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m77575j0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView) {
        liveVirtualVoiceFunctionPanelView.f48113i.setRotation(180.0f);
        liveVirtualVoiceFunctionPanelView.f48113i.setImageResource(i3c0.f111000f2);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m77576k0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView) {
        liveVirtualVoiceFunctionPanelView.f48113i.setRotation(-180.0f);
        liveVirtualVoiceFunctionPanelView.f48113i.setImageResource(i3c0.f110988e2);
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m77577l0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView, View view) {
        view.getClass();
        liveVirtualVoiceFunctionPanelView.m77582q0();
        return Unit.INSTANCE;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceFunctionPanelViewBindings, p149l.s7m
    public void destroy() {
        super.destroy();
        dt0.m113503C(this.collapseAnim);
        dt0.m113503C(this.animator);
    }

    @Nullable
    public final Animator getCollapseAnim() {
        return this.collapseAnim;
    }

    @Nullable
    public final Animator getCollapseArrowAnim() {
        return this.collapseArrowAnim;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77578m0(@NotNull View contentView) {
        contentView.getClass();
        this.f48110f.removeAllViews();
        int i = xdl0.f192404f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        xdl0.m208344M(this.f48110f, true);
        this.f48110f.addView(contentView, layoutParams);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77579n0(@NotNull View collapseView, @NotNull View expandView, int expandViewWidth, @NotNull jzl iPanelPage) {
        Animator animatorM103742o;
        Animator animatorM103746s;
        collapseView.getClass();
        expandView.getClass();
        iPanelPage.getClass();
        if (getLayoutParams() == null) {
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(1073741823, 0);
        collapseView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        expandView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMax = Math.max(iPanelPage.mo104858c2(), Math.max(expandView.getHeight(), expandView.getMeasuredHeight()));
        Animator animator = this.collapseAnim;
        if (animator != null) {
            dt0.m113503C(animator);
        }
        if (getIsCollapse()) {
            animatorM103742o = bt0.m103742o(this, dt0.f87801m, iMax, t100.m186890d(44.0f));
            animatorM103742o.getClass();
            animatorM103746s = bt0.m103742o(this, dt0.f87802n, expandViewWidth, collapseView.getMeasuredWidth()).setDuration(333L);
            animatorM103746s.getClass();
        } else {
            animatorM103742o = bt0.m103742o(this, dt0.f87801m, t100.m186890d(44.0f), iMax);
            animatorM103742o.getClass();
            Property<View, Integer> property = dt0.f87802n;
            int i = expandViewWidth + 10;
            animatorM103746s = bt0.m103746s(bt0.m103753z(bt0.m103742o(this, property, collapseView.getWidth(), i)).setDuration(467L), bt0.m103742o(this, property, i, expandViewWidth).setDuration(200L));
            animatorM103746s.getClass();
        }
        Animator animatorM103753z = bt0.m103753z(animatorM103742o, animatorM103746s);
        this.collapseAnim = animatorM103753z;
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.yxu
            @Override // java.lang.Runnable
            public final void run() {
                LiveVirtualVoiceFunctionPanelView.m77574i0(this.f200664a);
            }
        });
        Animator animator2 = this.collapseAnim;
        animator2.getClass();
        animator2.start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77580o0(@NotNull View expandView) {
        ViewGroup.LayoutParams layoutParams;
        expandView.getClass();
        xdl0.m208344M(getRoot(), true);
        xdl0.m208344M(this.f48112h, ((xxu) this.f48108d).m211565g4() && !getIsCollapse());
        xdl0.m208344M(this.f48113i, true);
        clearAnimation();
        if (getLayoutParams() != null) {
            layoutParams = getLayoutParams();
            layoutParams.getClass();
        } else {
            int i = xdl0.f192404f;
            layoutParams = new FrameLayout.LayoutParams(i, i);
        }
        int i2 = xdl0.f192404f;
        layoutParams.height = i2;
        layoutParams.width = i2;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m77581p0(@NotNull View collapseView, boolean isManager) {
        collapseView.getClass();
        xdl0.m208344M(this.f48112h, false);
        xdl0.m208344M(getRoot(), isManager);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m77582q0() {
        m77590y0(getIsCollapse());
        setCollapse(!getIsCollapse());
        boolean z = ((xxu) this.f48108d).m211563e4() instanceof m760;
        VoicePanelSwitchView voicePanelSwitchView = this.f48112h;
        boolean z2 = false;
        if (z) {
            xdl0.m208344M(voicePanelSwitchView, false);
        } else {
            if (((xxu) this.f48108d).m211565g4() && !getIsCollapse()) {
                z2 = true;
            }
            xdl0.m208344M(voicePanelSwitchView, z2);
        }
        xdl0.m208344M(this.f48113i, true);
        ((xxu) this.f48108d).m211561c4(getIsCollapse());
    }

    /* JADX INFO: renamed from: r */
    public final void m77583r() {
        VImage vImage = this.f48113i;
        vImage.getClass();
        cxq.m109105c(vImage, new Function1() { // from class: l.zxu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVirtualVoiceFunctionPanelView.m77577l0(this.f205486a, (View) obj);
            }
        });
        xdl0.m208344M(getRoot(), false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m77584r0() {
        dt0.m113503C(this.animator);
        Animator duration = bt0.m103741n(this, ViewGroup.ALPHA, 0.0f, 1.0f).setDuration(250L);
        this.animator = duration;
        if (duration != null) {
            duration.setInterpolator(bt0.f77154a);
        }
        Animator animator = this.animator;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public boolean getIsCollapse() {
        return this.isCollapse;
    }

    public void setCollapse(boolean z) {
        this.isCollapse = z;
    }

    public final void setCollapseAnim(@Nullable Animator animator) {
        this.collapseAnim = animator;
    }

    public final void setCollapseArrowAnim(@Nullable Animator animator) {
        this.collapseArrowAnim = animator;
    }

    public final void setSupportExpand(boolean supportExpand) {
        xdl0.m208344M(this.f48113i, supportExpand);
        this.f48113i.setTranslationY(0.0f);
    }

    public final void setSwitchViewVisible(boolean visible) {
        xdl0.m208344M(this.f48112h, (getIsCollapse() || !visible || (((xxu) this.f48108d).m211563e4() instanceof m760)) ? false : true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m77586t0(boolean isManager) {
        xdl0.m208344M(this.f48112h, (!isManager || getIsCollapse() || (((xxu) this.f48108d).m211563e4() instanceof m760)) ? false : true);
    }

    /* JADX INFO: renamed from: u0 */
    public void m77587u0() {
        dt0.m113503C(this.animator);
        Animator animator = this.animator;
        if (animator != null) {
            animator.setInterpolator(bt0.f77154a);
        }
        Animator duration = bt0.m103741n(this, ViewGroup.ALPHA, 1.0f, 0.0f).setDuration(250L);
        this.animator = duration;
        if (duration != null) {
            duration.start();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m77588v0() {
        this.f48113i.setRotation(0.0f);
        this.f48113i.setImageResource(i3c0.f110988e2);
        setCollapse(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m77589w0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = -2;
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m77590y0(boolean collapse) {
        VImage vImage = this.f48113i;
        if (collapse) {
            Animator animatorM103753z = bt0.m103753z(bt0.m103743p(vImage, "translationX", 0L, 667L, null, 0.0f, t100.f167257f * 1.0f, t100.f167260i * 1.0f, 0.0f), bt0.m103743p(this.f48113i, "translationY", 0L, 667L, null, 0.0f, 0.0f), bt0.m103739l(this.f48113i, View.ROTATION, 0L, 333L, null, -180.0f, 0.0f));
            this.collapseArrowAnim = animatorM103753z;
            bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.ayu
                @Override // java.lang.Runnable
                public final void run() {
                    LiveVirtualVoiceFunctionPanelView.m77576k0(this.f72307a);
                }
            });
        } else {
            Animator animatorM103753z2 = bt0.m103753z(bt0.m103743p(vImage, "translationY", 0L, 467L, null, 0.0f, 0.0f), bt0.m103739l(this.f48113i, View.ROTATION, 0L, 467L, null, 180.0f, 0.0f));
            this.collapseArrowAnim = animatorM103753z2;
            bt0.m103749v(animatorM103753z2, new Runnable() { // from class: l.byu
                @Override // java.lang.Runnable
                public final void run() {
                    LiveVirtualVoiceFunctionPanelView.m77575j0(this.f77966a);
                }
            });
        }
        Animator animator = this.collapseArrowAnim;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m77591z0(@NotNull View collapseView) {
        collapseView.getClass();
        if (getLayoutParams() == null || !getIsCollapse()) {
            return;
        }
        collapseView.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, 0));
        xdl0.m208327D0(collapseView.getMeasuredWidth(), this);
    }
}
