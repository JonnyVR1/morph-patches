package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperGodDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperGodReward;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0013R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\fR\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010;\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010?R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010R\u001a\u0004\be\u0010T\"\u0004\bf\u0010VR\"\u0010k\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010;\u001a\u0004\bi\u0010=\"\u0004\bj\u0010?R\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010w\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010-\u001a\u0004\bu\u0010/\"\u0004\bv\u0010\fR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010`\"\u0005\b\u0082\u0001\u0010bR&\u0010\u0087\u0001\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010J\u001a\u0005\b\u0085\u0001\u0010L\"\u0005\b\u0086\u0001\u0010NR*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010iR\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009a\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009c\u0001¨\u0006 \u0001"}, m88121d2 = {"Ll/x3h0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/a4h0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/a4h0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "J", "(Landroid/view/View;)V", "", "Ll/i4h0;", "memberItems", "h0", "(Ljava/util/List;)V", "e0", "()V", "g0", "m", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodDetail;", "detail", "f0", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodDetail;)V", "d0", "", Constants.INAPP_POSITION, "i0", "(I)V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "()Lcom/p1/mobile/android/app/Act;", "p", "Lv/VLinear;", "k", "Lv/VLinear;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", p7f.LATITUDE_SOUTH, "()Landroid/view/View;", "set_empty", "_empty", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_content", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_content", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_content", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "Q", "()Lv/VDraweeView;", "set_content_bg", "(Lv/VDraweeView;)V", "_content_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "o", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "X", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_bg", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_bg", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VImage;", "q", "Lv/VImage;", p7f.GPS_DIRECTION_TRUE, "()Lv/VImage;", "set_more_icon", "(Lv/VImage;)V", "_more_icon", "r", "b0", "set_user_icon", "_user_icon", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VText;", "W", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", Constants.KEY_T, "get_icon_mask", "set_icon_mask", "_icon_mask", "u", "Z", "set_tab_bg", "_tab_bg", "Lcom/google/android/material/tabs/TabLayout;", ResourceDirection.f39656v, "Lcom/google/android/material/tabs/TabLayout;", "Y", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabLayout", "w", "a0", "set_tab_click_area", "_tab_click_area", "Lv/VPager;", BaseSei.f14624X, "Lv/VPager;", "c0", "()Lv/VPager;", "set_viewpager", "(Lv/VPager;)V", "_viewpager", BaseSei.f14625Y, "R", "set_desc", "_desc", BaseSei.f14626Z, "U", "set_power_title", "_power_title", "Ll/h4h0;", "A", "Ll/h4h0;", "getPagerAdapter", "()Ll/h4h0;", "setPagerAdapter", "(Ll/h4h0;)V", "pagerAdapter", "B", "Ljava/util/List;", "pageItems", "", c4s.C_ZONE, "isLoop", "Lcom/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer;", "D", "Lcom/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer;", "currentEffectContainer", "", "E", "Ljava/lang/String;", "bgUrl", "F", "tabBgUrl", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class x3h0 extends LiveMenuDialogHolder<a4h0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public h4h0 pagerAdapter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public List<i4h0> pageItems;

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
    public x3h0(@Nullable Act act, @NotNull a4h0 a4h0Var) {
        super(yec0.f198997Z5, act, a4h0Var, qag0.m175923d(0.4f, true));
        a4h0Var.getClass();
        this.pagerAdapter = new h4h0();
        this.pageItems = new ArrayList();
        this.isLoop = true;
        this.bgUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6IkgyVU9FRE5aU1AzQ1pSWUEyNFlPTklSQ0daU0NVWDE0IiwidyI6MTEyNSwiaCI6MTU5NiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE5MDI3NTk4MzI1OX0.png";
        this.tabBgUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZTRUtNV1c1TlFQTjVRNDRZUFYyNUw0SENZNTZDQzE0IiwidyI6MTA3OSwiaCI6OTg1LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMxMDg3ODcxNzQ0NjgzMjM5NX0.png";
    }

    /* JADX INFO: renamed from: G */
    public static void m209215G(BLiveSuperGodDetail bLiveSuperGodDetail, x3h0 x3h0Var, View view) {
        if (TextUtils.isEmpty(bLiveSuperGodDetail.rulePage)) {
            return;
        }
        ((a4h0) x3h0Var.f48605b).m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7016).m174141B(bLiveSuperGodDetail.rulePage).m174145s(qa00.m175859d(10.0f)).m174140A(bnl0.m105592y0(), qa00.m175859d(544.0f)).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174146t(80).m174143q());
    }

    /* JADX INFO: renamed from: N */
    public static final void m209221N(x3h0 x3h0Var, View view) {
        x3h0Var.mo73021p();
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m209222O(x3h0 x3h0Var, View view, MotionEvent motionEvent) {
        x3h0Var.isLoop = false;
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m209223P(x3h0 x3h0Var, View view, MotionEvent motionEvent) {
        x3h0Var.isLoop = false;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m209224g0() {
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_live_god_remembrance";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m209225h0(List<i4h0> memberItems) {
        this.pageItems = memberItems;
        this.pagerAdapter.m133575q(memberItems);
        View view = this.pageItems.get(0).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
        view.getClass();
        ((SuperGodEffectContainer) view).m76395k();
        for (int i = 0; i < 6; i++) {
            VDraweeView vDraweeView = new VDraweeView(getContext());
            vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(qa00.m175859d(32.0f), qa00.m175859d(32.0f)));
            TabLayout.Tab tabAt = m209235Y().getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(vDraweeView);
            }
        }
        m209243i0(0);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m209232V().getContext();
    }

    /* JADX INFO: renamed from: J */
    public final void m209226J(View view) {
        b4h0.m102467a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VDraweeView m209227Q() {
        VDraweeView vDraweeView = this._content_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_content_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VText m209228R() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m209229S() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VImage m209230T() {
        VImage vImage = this._more_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_more_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m209231U() {
        TextView textView = this._power_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_power_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m209232V() {
        VLinear vLinear = this._root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m209233W() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final AnimEffectPlayer m209234X() {
        AnimEffectPlayer animEffectPlayer = this._svga_bg;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_svga_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final TabLayout m209235Y() {
        TabLayout tabLayout = this._tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VDraweeView m209236Z() {
        VDraweeView vDraweeView = this._tab_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_tab_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final View m209237a0() {
        View view = this._tab_click_area;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_tab_click_area");
        return null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return ((a4h0) this.f48605b).act();
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VDraweeView m209238b0() {
        VDraweeView vDraweeView = this._user_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_user_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VPager m209239c0() {
        VPager vPager = this._viewpager;
        if (vPager != null) {
            return vPager;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m209240d0() {
        if (this.isLoop) {
            if (m209239c0().getCurrentItem() < m209239c0().getChildCount() - 1) {
                m209239c0().setCurrentItem(m209239c0().getCurrentItem() + 1);
            } else {
                m209239c0().setCurrentItem(0);
            }
        }
        View view = this.pageItems.get(m209239c0().getCurrentItem()).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
        view.getClass();
        ((SuperGodEffectContainer) view).m76395k();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m209241e0() {
        m209239c0().setAdapter(this.pagerAdapter);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: f0 */
    public final void m209242f0(@NotNull final BLiveSuperGodDetail detail) {
        String str;
        detail.getClass();
        m73017E();
        m209224g0();
        m209241e0();
        this.isLoop = true;
        VText vTextM209233W = m209233W();
        if (TextUtils.isEmpty(detail.birthday)) {
            str = "封神指日可待";
        } else {
            str = detail.birthday;
            str.getClass();
        }
        vTextM209233W.setText(str);
        izs.m142868s("context_livingAct", m209238b0(), detail.userImage);
        bnl0.m105509E0(m209230T(), new View.OnClickListener() { // from class: l.w3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x3h0.m209215G(detail, this, view);
            }
        });
        if (detail.rewards.size() >= 6) {
            m209239c0().setOffscreenPageLimit(detail.rewards.size());
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6; i++) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(yec0.f199010a6, (ViewGroup) null);
                viewInflate.getClass();
                SuperGodEffectContainer superGodEffectContainer = (SuperGodEffectContainer) viewInflate;
                BLiveSuperGodReward bLiveSuperGodReward = detail.rewards.get(i);
                bLiveSuperGodReward.getClass();
                superGodEffectContainer.m76398p(this, bLiveSuperGodReward);
                BLiveSuperGodReward bLiveSuperGodReward2 = detail.rewards.get(i);
                bLiveSuperGodReward2.getClass();
                arrayList.add(i, new i4h0(bLiveSuperGodReward2, superGodEffectContainer));
            }
            m209225h0(CollectionsKt.toList(arrayList));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m209243i0(int pos) {
        int i = 0;
        while (i < 6) {
            TabLayout.Tab tabAt = m209235Y().getTabAt(i);
            View customView = tabAt != null ? tabAt.getCustomView() : null;
            customView.getClass();
            VDraweeView vDraweeView = (VDraweeView) customView;
            BLiveSuperGodReward bLiveSuperGodReward = this.pageItems.get(i).getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String();
            izs.m142869t("context_livingAct", vDraweeView, i == pos ? bLiveSuperGodReward.icon : bLiveSuperGodReward.iconGrey, qa00.m175859d(32.0f));
            i++;
        }
        m209231U().setText(this.pageItems.get(m209239c0().getCurrentItem()).getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().title);
        m209228R().setText(this.pageItems.get(m209239c0().getCurrentItem()).getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().desc);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: m */
    public void mo73019m(@Nullable View view) {
        if (view != null) {
            m209226J(view);
            m73014A(80);
            m73027z(LiveDialogEnum.SUPER_GOD);
            m209235Y().setupWithViewPager(m209239c0());
            m209234X().m69683j("https://auto.tancdn.com/v1/raw/be2f6ee6-0207-434b-be0f-fe2ff22e9f0a14.so", -1);
            bnl0.m105509E0(m209229S(), new View.OnClickListener() { // from class: l.t3h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    x3h0.m209221N(this.f171921a, view2);
                }
            });
            izs.m142868s("context_livingAct", m209227Q(), this.bgUrl);
            izs.m142868s("context_livingAct", m209236Z(), this.tabBgUrl);
            qnp0.m177260c1(m209227Q(), 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            m209239c0().setOnTouchListener(new View.OnTouchListener() { // from class: l.u3h0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return x3h0.m209222O(this.f177345a, view2, motionEvent);
                }
            });
            m209237a0().setOnTouchListener(new View.OnTouchListener() { // from class: l.v3h0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return x3h0.m209223P(this.f182211a, view2, motionEvent);
                }
            });
            m209239c0().m4187d(new C21244a());
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: p */
    public void mo73021p() {
        super.mo73021p();
        Iterator<i4h0> it = this.pageItems.iterator();
        while (it.hasNext()) {
            View view = it.next().getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
            view.getClass();
            ((SuperGodEffectContainer) view).m76394j();
        }
    }

    /* JADX INFO: renamed from: l.x3h0$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"l/x3h0$a", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21244a implements ViewPager.InterfaceC0718j {
        public C21244a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            x3h0.this.m209243i0(position);
            SuperGodEffectContainer superGodEffectContainer = x3h0.this.currentEffectContainer;
            if (superGodEffectContainer != null) {
                superGodEffectContainer.m76394j();
            }
            x3h0 x3h0Var = x3h0.this;
            View view = ((i4h0) x3h0Var.pageItems.get(position)).getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String();
            view.getClass();
            x3h0Var.currentEffectContainer = (SuperGodEffectContainer) view;
            SuperGodEffectContainer superGodEffectContainer2 = x3h0.this.currentEffectContainer;
            if (superGodEffectContainer2 != null) {
                superGodEffectContainer2.m76395k();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
