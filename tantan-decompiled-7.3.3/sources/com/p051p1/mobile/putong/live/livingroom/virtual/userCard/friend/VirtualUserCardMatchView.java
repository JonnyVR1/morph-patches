package com.p051p1.mobile.putong.live.livingroom.virtual.userCard.friend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLivePayGuideConfig;
import com.p051p1.mobile.putong.live.base.data.BLivePayGuideInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.i6t;
import p153l.izs;
import p153l.jyb;
import p153l.obc0;
import p153l.vak0;
import p153l.w5m0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010)\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R\"\u0010J\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010)\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006S"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/friend/VirtualUserCardMatchView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/vak0;", "profileData", "Ll/i6t;", "presenter", "", "userId", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/vak0;Ll/i6t;Ljava/lang/String;)V", "u", "Landroid/view/View;", OMSTemplateModeType.view, "p", "(Landroid/view/View;)V", "a", "Lv/VFrame;", "get_apply_layout", "()Lv/VFrame;", "set_apply_layout", "(Lv/VFrame;)V", "_apply_layout", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_apply_layout_gift_icon", "()Lv/VDraweeView;", "set_apply_layout_gift_icon", "(Lv/VDraweeView;)V", "_apply_layout_gift_icon", "Lv/VText;", "c", "Lv/VText;", "get_apply_layout_apply_text", "()Lv/VText;", "set_apply_layout_apply_text", "(Lv/VText;)V", "_apply_layout_apply_text", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_accept_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_accept_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_accept_layout", "e", "get_accept_layout_apply_gift", "set_accept_layout_apply_gift", "_accept_layout_apply_gift", "Lv/VLinear;", "f", "Lv/VLinear;", "get_accept_layout_content", "()Lv/VLinear;", "set_accept_layout_content", "(Lv/VLinear;)V", "_accept_layout_content", "g", "get_accept_layout_apply_desc", "set_accept_layout_apply_desc", "_accept_layout_apply_desc", "h", "get_accept_layout_apply_send_gift", "set_accept_layout_apply_send_gift", "_accept_layout_apply_send_gift", "Lv/VButton;", RXScreenCaptureService.KEY_INDEX, "Lv/VButton;", "get_accept_layout_accept_button", "()Lv/VButton;", "set_accept_layout_accept_button", "(Lv/VButton;)V", "_accept_layout_accept_button", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class VirtualUserCardMatchView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VFrame _apply_layout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _apply_layout_gift_icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _apply_layout_apply_text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _accept_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _accept_layout_apply_gift;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _accept_layout_content;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _accept_layout_apply_desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _accept_layout_apply_send_gift;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VButton _accept_layout_accept_button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualUserCardMatchView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @NotNull
    public final ConstraintLayout get_accept_layout() {
        ConstraintLayout constraintLayout = this._accept_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_accept_layout");
        return null;
    }

    @NotNull
    public final VButton get_accept_layout_accept_button() {
        VButton vButton = this._accept_layout_accept_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_accept_layout_accept_button");
        return null;
    }

    @NotNull
    public final VText get_accept_layout_apply_desc() {
        VText vText = this._accept_layout_apply_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_accept_layout_apply_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_accept_layout_apply_gift() {
        VDraweeView vDraweeView = this._accept_layout_apply_gift;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_accept_layout_apply_gift");
        return null;
    }

    @NotNull
    public final VText get_accept_layout_apply_send_gift() {
        VText vText = this._accept_layout_apply_send_gift;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_accept_layout_apply_send_gift");
        return null;
    }

    @NotNull
    public final VLinear get_accept_layout_content() {
        VLinear vLinear = this._accept_layout_content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_accept_layout_content");
        return null;
    }

    @NotNull
    public final VFrame get_apply_layout() {
        VFrame vFrame = this._apply_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_apply_layout");
        return null;
    }

    @NotNull
    public final VText get_apply_layout_apply_text() {
        VText vText = this._apply_layout_apply_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_apply_layout_apply_text");
        return null;
    }

    @NotNull
    public final VDraweeView get_apply_layout_gift_icon() {
        VDraweeView vDraweeView = this._apply_layout_gift_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_apply_layout_gift_icon");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78745p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m78745p(View view) {
        w5m0.m204981a(this, view);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v16, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r7v6, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: s */
    public final void m78746s(@NotNull vak0 profileData, @NotNull i6t<?, ?> presenter, @NotNull String userId) {
        profileData.getClass();
        presenter.getClass();
        userId.getClass();
        BLivePayGuideInfo bLivePayGuideInfo = profileData.m200543r().payGuideInfo;
        if (bLivePayGuideInfo != null) {
            bnl0.m105524M(get_accept_layout(), true);
            izs.m142868s("context_single_room", get_accept_layout_apply_gift(), bLivePayGuideInfo.giftIcon);
            get_accept_layout_apply_desc().setText(bLivePayGuideInfo.title);
            get_accept_layout_apply_send_gift().setText(bLivePayGuideInfo.subTitle);
            get_accept_layout_accept_button().setClickable(true);
            get_accept_layout_accept_button().setText("同意");
            get_accept_layout_accept_button().setTextColor(-1);
            get_accept_layout_accept_button().setBackgroundResource(obc0.f146434o0);
            i4g0.m138492A("e_audio_add_apply_button", "p_audio_profile", jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0()), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("liveId", presenter.m213810E2().m202191k()), jyb.m147494Y("other_user_id", userId), jyb.m147494Y("button_type", "agree"));
            return;
        }
        bnl0.m105524M(get_accept_layout(), false);
        BLivePayGuideConfig bLivePayGuideConfig = profileData.m200543r().payGuideConfig;
        if (bLivePayGuideConfig == null) {
            bnl0.m105524M(get_apply_layout(), false);
            return;
        }
        bnl0.m105524M(get_apply_layout(), true);
        get_apply_layout_apply_text().setText(bLivePayGuideConfig.buttonTitle);
        izs.m142868s("context_single_room", get_apply_layout_gift_icon(), bLivePayGuideConfig.giftIcon);
        i4g0.m138492A("e_gift", "p_audio_profile", jyb.m147494Y("giftId", Integer.valueOf(bLivePayGuideConfig.giftId)), jyb.m147494Y("module", BLiveTraceServerBiz.audio_pay_guide_profile_add));
    }

    public final void set_accept_layout(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._accept_layout = constraintLayout;
    }

    public final void set_accept_layout_accept_button(@NotNull VButton vButton) {
        vButton.getClass();
        this._accept_layout_accept_button = vButton;
    }

    public final void set_accept_layout_apply_desc(@NotNull VText vText) {
        vText.getClass();
        this._accept_layout_apply_desc = vText;
    }

    public final void set_accept_layout_apply_gift(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._accept_layout_apply_gift = vDraweeView;
    }

    public final void set_accept_layout_apply_send_gift(@NotNull VText vText) {
        vText.getClass();
        this._accept_layout_apply_send_gift = vText;
    }

    public final void set_accept_layout_content(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._accept_layout_content = vLinear;
    }

    public final void set_apply_layout(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._apply_layout = vFrame;
    }

    public final void set_apply_layout_apply_text(@NotNull VText vText) {
        vText.getClass();
        this._apply_layout_apply_text = vText;
    }

    public final void set_apply_layout_gift_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._apply_layout_gift_icon = vDraweeView;
    }

    /* JADX INFO: renamed from: u */
    public final void m78747u() {
        bnl0.m105524M(get_accept_layout(), false);
        bnl0.m105524M(get_apply_layout(), false);
    }
}
