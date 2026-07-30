package com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceFunctionPanelViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p153l.bnl0;
import p153l.czq;
import p153l.d2m;
import p153l.gt0;
import p153l.it0;
import p153l.obc0;
import p153l.qa00;
import p153l.rwn0;
import p153l.sf60;
import p153l.yzu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0018J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0018J\u001d\u0010#\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\rJ\r\u0010(\u001a\u00020\u000b¢\u0006\u0004\b(\u0010\rJ\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\rJ\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010\rR\"\u00103\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0012R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010?\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u0018\u0010A\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106¨\u0006B"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/LiveVirtualVoiceFunctionPanelView;", "Ll/rwn0;", "D", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceFunctionPanelViewBindings;", "Ll/yzu;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "q0", "", "isManager", "t0", "(Z)V", "visible", "setSwitchViewVisible", "Landroid/view/View;", "contentView", "m0", "(Landroid/view/View;)V", "collapseView", "expandView", "", "expandViewWidth", "Ll/d2m;", "iPanelPage", "n0", "(Landroid/view/View;Landroid/view/View;ILl/d2m;)V", "z0", "o0", "p0", "(Landroid/view/View;Z)V", "supportExpand", "setSupportExpand", "destroy", "v0", "r0", "u0", "collapse", "y0", "w0", "j", "Z", "s0", "()Z", "setCollapse", "isCollapse", "Landroid/animation/Animator;", "k", "Landroid/animation/Animator;", "getCollapseArrowAnim", "()Landroid/animation/Animator;", "setCollapseArrowAnim", "(Landroid/animation/Animator;)V", "collapseArrowAnim", BLiveStormDanmakuGiftResourceType.f45292l, "getCollapseAnim", "setCollapseAnim", "collapseAnim", "m", "animator", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public class LiveVirtualVoiceFunctionPanelView<D extends rwn0> extends LiveVirtualVoiceFunctionPanelViewBindings<yzu<D>> {

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
    public static void m78757i0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView) {
        if (liveVirtualVoiceFunctionPanelView.getIsCollapse()) {
            return;
        }
        liveVirtualVoiceFunctionPanelView.m78772w0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m78758j0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView) {
        liveVirtualVoiceFunctionPanelView.f48961i.setRotation(180.0f);
        liveVirtualVoiceFunctionPanelView.f48961i.setImageResource(obc0.f146328f2);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m78759k0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView) {
        liveVirtualVoiceFunctionPanelView.f48961i.setRotation(-180.0f);
        liveVirtualVoiceFunctionPanelView.f48961i.setImageResource(obc0.f146316e2);
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m78760l0(LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView, View view) {
        view.getClass();
        liveVirtualVoiceFunctionPanelView.m78765q0();
        return Unit.INSTANCE;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceFunctionPanelViewBindings, p153l.iam
    public void destroy() {
        super.destroy();
        it0.m142009C(this.collapseAnim);
        it0.m142009C(this.animator);
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
    public final void m78761m0(@NotNull View contentView) {
        contentView.getClass();
        this.f48958f.removeAllViews();
        int i = bnl0.f77545f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        bnl0.m105524M(this.f48958f, true);
        this.f48958f.addView(contentView, layoutParams);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78762n0(@NotNull View collapseView, @NotNull View expandView, int expandViewWidth, @NotNull d2m iPanelPage) {
        Animator animatorM132169o;
        Animator animatorM132173s;
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
        int iMax = Math.max(iPanelPage.mo113712c2(), Math.max(expandView.getHeight(), expandView.getMeasuredHeight()));
        Animator animator = this.collapseAnim;
        if (animator != null) {
            it0.m142009C(animator);
        }
        if (getIsCollapse()) {
            animatorM132169o = gt0.m132169o(this, it0.f116780m, iMax, qa00.m175859d(44.0f));
            animatorM132169o.getClass();
            animatorM132173s = gt0.m132169o(this, it0.f116781n, expandViewWidth, collapseView.getMeasuredWidth()).setDuration(333L);
            animatorM132173s.getClass();
        } else {
            animatorM132169o = gt0.m132169o(this, it0.f116780m, qa00.m175859d(44.0f), iMax);
            animatorM132169o.getClass();
            Property<View, Integer> property = it0.f116781n;
            int i = expandViewWidth + 10;
            animatorM132173s = gt0.m132173s(gt0.m132180z(gt0.m132169o(this, property, collapseView.getWidth(), i)).setDuration(467L), gt0.m132169o(this, property, i, expandViewWidth).setDuration(200L));
            animatorM132173s.getClass();
        }
        Animator animatorM132180z = gt0.m132180z(animatorM132169o, animatorM132173s);
        this.collapseAnim = animatorM132180z;
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.zzu
            @Override // java.lang.Runnable
            public final void run() {
                LiveVirtualVoiceFunctionPanelView.m78757i0(this.f206743a);
            }
        });
        Animator animator2 = this.collapseAnim;
        animator2.getClass();
        animator2.start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78763o0(@NotNull View expandView) {
        ViewGroup.LayoutParams layoutParams;
        expandView.getClass();
        bnl0.m105524M(getRoot(), true);
        bnl0.m105524M(this.f48960h, ((yzu) this.f48956d).m218053g4() && !getIsCollapse());
        bnl0.m105524M(this.f48961i, true);
        clearAnimation();
        if (getLayoutParams() != null) {
            layoutParams = getLayoutParams();
            layoutParams.getClass();
        } else {
            int i = bnl0.f77545f;
            layoutParams = new FrameLayout.LayoutParams(i, i);
        }
        int i2 = bnl0.f77545f;
        layoutParams.height = i2;
        layoutParams.width = i2;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m78764p0(@NotNull View collapseView, boolean isManager) {
        collapseView.getClass();
        bnl0.m105524M(this.f48960h, false);
        bnl0.m105524M(getRoot(), isManager);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m78765q0() {
        m78773y0(getIsCollapse());
        setCollapse(!getIsCollapse());
        boolean z = ((yzu) this.f48956d).m218051e4() instanceof sf60;
        VoicePanelSwitchView voicePanelSwitchView = this.f48960h;
        boolean z2 = false;
        if (z) {
            bnl0.m105524M(voicePanelSwitchView, false);
        } else {
            if (((yzu) this.f48956d).m218053g4() && !getIsCollapse()) {
                z2 = true;
            }
            bnl0.m105524M(voicePanelSwitchView, z2);
        }
        bnl0.m105524M(this.f48961i, true);
        ((yzu) this.f48956d).m218049c4(getIsCollapse());
    }

    /* JADX INFO: renamed from: r */
    public final void m78766r() {
        VImage vImage = this.f48961i;
        vImage.getClass();
        czq.m113347c(vImage, new Function1() { // from class: l.a0v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVirtualVoiceFunctionPanelView.m78760l0(this.f67754a, (View) obj);
            }
        });
        bnl0.m105524M(getRoot(), false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m78767r0() {
        it0.m142009C(this.animator);
        Animator duration = gt0.m132168n(this, ViewGroup.ALPHA, 0.0f, 1.0f).setDuration(250L);
        this.animator = duration;
        if (duration != null) {
            duration.setInterpolator(gt0.f106346a);
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
        bnl0.m105524M(this.f48961i, supportExpand);
        this.f48961i.setTranslationY(0.0f);
    }

    public final void setSwitchViewVisible(boolean visible) {
        bnl0.m105524M(this.f48960h, (getIsCollapse() || !visible || (((yzu) this.f48956d).m218051e4() instanceof sf60)) ? false : true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m78769t0(boolean isManager) {
        bnl0.m105524M(this.f48960h, (!isManager || getIsCollapse() || (((yzu) this.f48956d).m218051e4() instanceof sf60)) ? false : true);
    }

    /* JADX INFO: renamed from: u0 */
    public void m78770u0() {
        it0.m142009C(this.animator);
        Animator animator = this.animator;
        if (animator != null) {
            animator.setInterpolator(gt0.f106346a);
        }
        Animator duration = gt0.m132168n(this, ViewGroup.ALPHA, 1.0f, 0.0f).setDuration(250L);
        this.animator = duration;
        if (duration != null) {
            duration.start();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m78771v0() {
        this.f48961i.setRotation(0.0f);
        this.f48961i.setImageResource(obc0.f146316e2);
        setCollapse(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m78772w0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = -2;
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m78773y0(boolean collapse) {
        VImage vImage = this.f48961i;
        if (collapse) {
            Animator animatorM132180z = gt0.m132180z(gt0.m132170p(vImage, "translationX", 0L, 667L, null, 0.0f, qa00.f156319f * 1.0f, qa00.f156322i * 1.0f, 0.0f), gt0.m132170p(this.f48961i, "translationY", 0L, 667L, null, 0.0f, 0.0f), gt0.m132166l(this.f48961i, View.ROTATION, 0L, 333L, null, -180.0f, 0.0f));
            this.collapseArrowAnim = animatorM132180z;
            gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.b0v
                @Override // java.lang.Runnable
                public final void run() {
                    LiveVirtualVoiceFunctionPanelView.m78759k0(this.f74294a);
                }
            });
        } else {
            Animator animatorM132180z2 = gt0.m132180z(gt0.m132170p(vImage, "translationY", 0L, 467L, null, 0.0f, 0.0f), gt0.m132166l(this.f48961i, View.ROTATION, 0L, 467L, null, 180.0f, 0.0f));
            this.collapseArrowAnim = animatorM132180z2;
            gt0.m132176v(animatorM132180z2, new Runnable() { // from class: l.c0v
                @Override // java.lang.Runnable
                public final void run() {
                    LiveVirtualVoiceFunctionPanelView.m78758j0(this.f79302a);
                }
            });
        }
        Animator animator = this.collapseArrowAnim;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m78774z0(@NotNull View collapseView) {
        collapseView.getClass();
        if (getLayoutParams() == null || !getIsCollapse()) {
            return;
        }
        collapseView.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, 0));
        bnl0.m105507D0(collapseView.getMeasuredWidth(), this);
    }
}
