package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import com.p1.mobile.putong.live.base.data.BLiveSuperGodReward;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.hxs;
import l.l3f;
import l.mep0;
import l.t100;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0013R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\fR\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010;\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010?R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010R\u001a\u0004\be\u0010T\"\u0004\bf\u0010VR\"\u0010k\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010;\u001a\u0004\bi\u0010=\"\u0004\bj\u0010?R\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010w\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010-\u001a\u0004\bu\u0010/\"\u0004\bv\u0010\fR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010`\"\u0005\b\u0082\u0001\u0010bR&\u0010\u0087\u0001\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010J\u001a\u0005\b\u0085\u0001\u0010L\"\u0005\b\u0086\u0001\u0010NR*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010iR\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009a\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009c\u0001¨\u0006 \u0001"}, d2 = {"Ll/pvg0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/svg0;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/svg0;)V", "Landroid/view/View;", "view", "", "J", "(Landroid/view/View;)V", "", "Ll/awg0;", "memberItems", "h0", "(Ljava/util/List;)V", "e0", "()V", "g0", "m", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodDetail;", "detail", "f0", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodDetail;)V", "d0", "", "pos", "i0", "(I)V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "p", "Lv/VLinear;", "k", "Lv/VLinear;", "V", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "l", "Landroid/view/View;", "S", "()Landroid/view/View;", "set_empty", "_empty", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_content", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_content", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_content", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "Q", "()Lv/VDraweeView;", "set_content_bg", "(Lv/VDraweeView;)V", "_content_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "o", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "X", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_bg", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_bg", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VImage;", "q", "Lv/VImage;", "T", "()Lv/VImage;", "set_more_icon", "(Lv/VImage;)V", "_more_icon", "r", "b0", "set_user_icon", "_user_icon", "Lv/VText;", "s", "Lv/VText;", "W", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "t", "get_icon_mask", "set_icon_mask", "_icon_mask", "u", "Z", "set_tab_bg", "_tab_bg", "Lcom/google/android/material/tabs/TabLayout;", "v", "Lcom/google/android/material/tabs/TabLayout;", "Y", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "w", "a0", "set_tab_click_area", "_tab_click_area", "Lv/VPager;", "x", "Lv/VPager;", "c0", "()Lv/VPager;", "set_viewpager", "(Lv/VPager;)V", "_viewpager", "y", "R", "set_desc", "_desc", "z", "U", "set_power_title", "_power_title", "Ll/zvg0;", "A", "Ll/zvg0;", "getPagerAdapter", "()Ll/zvg0;", "setPagerAdapter", "(Ll/zvg0;)V", "pagerAdapter", "B", "Ljava/util/List;", "pageItems", "", "C", "isLoop", "Lcom/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer;", "D", "Lcom/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer;", "currentEffectContainer", "", "E", "Ljava/lang/String;", "bgUrl", "F", "tabBgUrl", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class pvg0 extends LiveMenuDialogHolder<svg0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public zvg0 pagerAdapter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public List<awg0> pageItems;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean isLoop;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public SuperGodEffectContainer currentEffectContainer;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final String bgUrl;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final String tabBgUrl;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _root;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ConstraintLayout _content;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _content_bg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public AnimEffectPlayer _svga_bg;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _more_icon;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VDraweeView _user_icon;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VImage _icon_mask;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VDraweeView _tab_bg;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TabLayout _tabLayout;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public View _tab_click_area;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VPager _viewpager;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public TextView _power_title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvg0(@Nullable Act act, @NotNull svg0 svg0Var) {
        super(t6c0.f19761Z5, act, svg0Var, j2g0.m15578d(0.4f, true));
        svg0Var.getClass();
        this.pagerAdapter = new zvg0();
        this.pageItems = new ArrayList();
        this.isLoop = true;
        this.bgUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6IkgyVU9FRE5aU1AzQ1pSWUEyNFlPTklSQ0daU0NVWDE0IiwidyI6MTEyNSwiaCI6MTU5NiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE5MDI3NTk4MzI1OX0.png";
        this.tabBgUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZTRUtNV1c1TlFQTjVRNDRZUFYyNUw0SENZNTZDQzE0IiwidyI6MTA3OSwiaCI6OTg1LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMxMDg3ODcxNzQ0NjgzMjM5NX0.png";
    }

    /* JADX INFO: renamed from: G */
    public static void m20690G(BLiveSuperGodDetail bLiveSuperGodDetail, pvg0 pvg0Var, View view) {
        if (TextUtils.isEmpty(bLiveSuperGodDetail.rulePage)) {
            return;
        }
        ((svg0) pvg0Var.f3799b).m25548F2().OpenH5Event.open().j(jp50.m16064c(7016).m16094B(bLiveSuperGodDetail.rulePage).m16098s(t100.d(10.0f)).m16093A(xdl0.y0(), t100.d(544.0f)).m16095p(CommonH5Builder.BgType.DEFAULT_BG).m16099t(80).m16096q());
    }

    /* JADX INFO: renamed from: N */
    public static final void m20696N(pvg0 pvg0Var, View view) {
        pvg0Var.mo5216p();
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m20697O(pvg0 pvg0Var, View view, MotionEvent motionEvent) {
        pvg0Var.isLoop = false;
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m20698P(pvg0 pvg0Var, View view, MotionEvent motionEvent) {
        pvg0Var.isLoop = false;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m20699g0() {
        l3f l3fVar = new l3f();
        l3fVar.n = "p_live_god_remembrance";
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m20700h0(List<awg0> memberItems) {
        this.pageItems = memberItems;
        this.pagerAdapter.m27608q(memberItems);
        View view = this.pageItems.get(0).getView();
        view.getClass();
        ((SuperGodEffectContainer) view).m8828k();
        for (int i = 0; i < 6; i++) {
            VDraweeView vDraweeView = new VDraweeView(mo5210C0());
            vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(t100.d(32.0f), t100.d(32.0f)));
            TabLayout.Tab tabAt = m20710Y().getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(vDraweeView);
            }
        }
        m20718i0(0);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return m20707V().getContext();
    }

    /* JADX INFO: renamed from: J */
    public final void m20701J(View view) {
        tvg0.m23179a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VDraweeView m20702Q() {
        VDraweeView vDraweeView = this._content_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_content_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VText m20703R() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m20704S() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VImage m20705T() {
        VImage vImage = this._more_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_more_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m20706U() {
        TextView textView = this._power_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_power_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m20707V() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m20708W() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final AnimEffectPlayer m20709X() {
        AnimEffectPlayer animEffectPlayer = this._svga_bg;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_svga_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final TabLayout m20710Y() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VDraweeView m20711Z() {
        VDraweeView vDraweeView = this._tab_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_tab_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final View m20712a0() {
        View view = this._tab_click_area;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_tab_click_area");
        return null;
    }

    @Nullable
    public Act act() {
        return ((svg0) this.f3799b).act();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VDraweeView m20713b0() {
        VDraweeView vDraweeView = this._user_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VPager m20714c0() {
        VPager vPager = this._viewpager;
        if (vPager != null) {
            return vPager;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m20715d0() {
        if (this.isLoop) {
            if (m20714c0().getCurrentItem() < m20714c0().getChildCount() - 1) {
                m20714c0().setCurrentItem(m20714c0().getCurrentItem() + 1);
            } else {
                m20714c0().setCurrentItem(0);
            }
        }
        View view = this.pageItems.get(m20714c0().getCurrentItem()).getView();
        view.getClass();
        ((SuperGodEffectContainer) view).m8828k();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m20716e0() {
        m20714c0().setAdapter(this.pagerAdapter);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: f0 */
    public final void m20717f0(@NotNull final BLiveSuperGodDetail detail) {
        String str;
        detail.getClass();
        m5211E();
        m20699g0();
        m20716e0();
        this.isLoop = true;
        VText vTextM20708W = m20708W();
        if (TextUtils.isEmpty(detail.birthday)) {
            str = "封神指日可待";
        } else {
            str = detail.birthday;
            str.getClass();
        }
        vTextM20708W.setText(str);
        hxs.s("context_livingAct", m20713b0(), detail.userImage);
        xdl0.E0(m20705T(), new View.OnClickListener() { // from class: l.ovg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pvg0.m20690G(detail, this, view);
            }
        });
        if (detail.rewards.size() >= 6) {
            m20714c0().setOffscreenPageLimit(detail.rewards.size());
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6; i++) {
                View viewInflate = LayoutInflater.from(mo5210C0()).inflate(t6c0.f19774a6, (ViewGroup) null);
                viewInflate.getClass();
                SuperGodEffectContainer superGodEffectContainer = (SuperGodEffectContainer) viewInflate;
                Object obj = detail.rewards.get(i);
                obj.getClass();
                superGodEffectContainer.m8831p(this, (BLiveSuperGodReward) obj);
                Object obj2 = detail.rewards.get(i);
                obj2.getClass();
                arrayList.add(i, new awg0((BLiveSuperGodReward) obj2, superGodEffectContainer));
            }
            m20700h0(CollectionsKt.toList(arrayList));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m20718i0(int pos) {
        int i = 0;
        while (i < 6) {
            TabLayout.Tab tabAt = m20710Y().getTabAt(i);
            View customView = tabAt != null ? tabAt.getCustomView() : null;
            customView.getClass();
            VDraweeView vDraweeView = (VDraweeView) customView;
            BLiveSuperGodReward item = this.pageItems.get(i).getItem();
            hxs.t("context_livingAct", vDraweeView, i == pos ? item.icon : item.iconGrey, t100.d(32.0f));
            i++;
        }
        m20706U().setText(this.pageItems.get(m20714c0().getCurrentItem()).getItem().title);
        m20703R().setText(this.pageItems.get(m20714c0().getCurrentItem()).getItem().desc);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: m */
    public void mo5214m(@Nullable View view) {
        if (view != null) {
            m20701J(view);
            m5207A(80);
            m5222z(LiveDialogEnum.SUPER_GOD);
            m20710Y().setupWithViewPager(m20714c0());
            m20709X().j("https://auto.tancdn.com/v1/raw/be2f6ee6-0207-434b-be0f-fe2ff22e9f0a14.so", -1);
            xdl0.E0(m20704S(), new View.OnClickListener() { // from class: l.lvg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    pvg0.m20696N(this.f15086a, view2);
                }
            });
            hxs.s("context_livingAct", m20702Q(), this.bgUrl);
            hxs.s("context_livingAct", m20711Z(), this.tabBgUrl);
            mep0.c1(m20702Q(), 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
            m20714c0().setOnTouchListener(new View.OnTouchListener() { // from class: l.mvg0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return pvg0.m20697O(this.f15670a, view2, motionEvent);
                }
            });
            m20712a0().setOnTouchListener(new View.OnTouchListener() { // from class: l.nvg0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return pvg0.m20698P(this.f16222a, view2, motionEvent);
                }
            });
            m20714c0().d(new C0761a());
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo5216p() {
        super.mo5216p();
        Iterator<awg0> it = this.pageItems.iterator();
        while (it.hasNext()) {
            View view = it.next().getView();
            view.getClass();
            ((SuperGodEffectContainer) view).m8827j();
        }
    }

    /* JADX INFO: renamed from: l.pvg0$a */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"l/pvg0$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0761a implements ViewPager.j {
        public C0761a() {
        }

        public void onPageSelected(int position) {
            pvg0.this.m20718i0(position);
            SuperGodEffectContainer superGodEffectContainer = pvg0.this.currentEffectContainer;
            if (superGodEffectContainer != null) {
                superGodEffectContainer.m8827j();
            }
            pvg0 pvg0Var = pvg0.this;
            View view = ((awg0) pvg0Var.pageItems.get(position)).getView();
            view.getClass();
            pvg0Var.currentEffectContainer = (SuperGodEffectContainer) view;
            SuperGodEffectContainer superGodEffectContainer2 = pvg0.this.currentEffectContainer;
            if (superGodEffectContainer2 != null) {
                superGodEffectContainer2.m8828k();
            }
        }

        public void onPageScrollStateChanged(int state) {
        }

        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
