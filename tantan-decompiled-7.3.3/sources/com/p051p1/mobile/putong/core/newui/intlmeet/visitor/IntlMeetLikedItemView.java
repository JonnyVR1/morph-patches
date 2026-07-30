package com.p051p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetLikedItemView;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c4s;
import p153l.cgo;
import p153l.fko;
import p153l.fwl;
import p153l.gbc0;
import p153l.joa;
import p153l.jyb;
import p153l.psd0;
import p153l.qa00;
import p153l.sop;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JY\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J_\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0004\b+\u0010,R\"\u00103\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0010R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010D\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010L\u001a\u0004\bk\u0010N\"\u0004\bl\u0010PR\"\u0010q\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010X\u001a\u0004\bo\u0010Z\"\u0004\bp\u0010\\R\"\u0010u\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010<\u001a\u0004\bs\u0010>\"\u0004\bt\u0010@R\"\u0010y\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010D\u001a\u0004\bw\u0010F\"\u0004\bx\u0010HR\"\u0010}\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010X\u001a\u0004\b{\u0010Z\"\u0004\b|\u0010\\R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0086\u0001\u00105\u001a\u0005\b\u0087\u0001\u00107\"\u0005\b\u0088\u0001\u0010\u0010R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetLikedItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BaseSei.f14626Z, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "visitorItem", "Lcom/p1/mobile/putong/data/User;", "user", "", "hasPrivilege", "isFirstItem", "Ll/y20;", "onClick", "onSuperLikeSend", "onInstantMatchSend", "B", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Lcom/p1/mobile/putong/data/User;ZZLl/y20;Ll/y20;Ll/y20;)V", "", "", "texts", "E", "(Ljava/util/List;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "Ll/fko;", "adapter", "userId", c4s.C_ZONE, "(Ll/fko;Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Ljava/lang/String;ZZLl/y20;Ll/y20;Ll/y20;)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetLikedItemView;", "get_root", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetLikedItemView;", "set_root", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetLikedItemView;)V", "_root", "b", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "_divider", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "get_header_pic", "()Lv/VDraweeView;", "set_header_pic", "(Lv/VDraweeView;)V", "_header_pic", "Lv/VLinear;", Constants.INAPP_DATA_TAG, "Lv/VLinear;", "get_content", "()Lv/VLinear;", "set_content", "(Lv/VLinear;)V", "_content", "Lv/VText;", "e", "Lv/VText;", "get_title_big", "()Lv/VText;", "set_title_big", "(Lv/VText;)V", "_title_big", "f", "get_pic_tag_big", "set_pic_tag_big", "_pic_tag_big", "Lv/VImage;", "g", "Lv/VImage;", "get_pic_tag_big_pic_verify_logo", "()Lv/VImage;", "set_pic_tag_big_pic_verify_logo", "(Lv/VImage;)V", "_pic_tag_big_pic_verify_logo", "h", "get_pic_tag_big_svip_tag", "set_pic_tag_big_svip_tag", "_pic_tag_big_svip_tag", "Landroid/widget/RelativeLayout;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/RelativeLayout;", "get_like", "()Landroid/widget/RelativeLayout;", "set_like", "(Landroid/widget/RelativeLayout;)V", "_like", "j", "get_subtitle", "set_subtitle", "_subtitle", "k", "get_action_btn", "set_action_btn", "_action_btn", BLiveStormDanmakuGiftResourceType.f45292l, "get_image", "set_image", "_image", "m", "get_match", "set_match", "_match", "n", "get_match_icon", "set_match_icon", "_match_icon", "Lcom/p1/mobile/putong/core/ui/vip/widget/LetterRemainingSwitcherView;", "o", "Lcom/p1/mobile/putong/core/ui/vip/widget/LetterRemainingSwitcherView;", "get_match_remaining_switch", "()Lcom/p1/mobile/putong/core/ui/vip/widget/LetterRemainingSwitcherView;", "set_match_remaining_switch", "(Lcom/p1/mobile/putong/core/ui/vip/widget/LetterRemainingSwitcherView;)V", "_match_remaining_switch", "p", "get_maskView", "set_maskView", "_maskView", "q", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "likedUser", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlMeetLikedItemView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlMeetLikedItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View _divider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _header_pic;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _title_big;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _pic_tag_big;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _pic_tag_big_pic_verify_logo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _pic_tag_big_svip_tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public RelativeLayout _like;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _action_btn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VLinear _match;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _match_icon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LetterRemainingSwitcherView _match_remaining_switch;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public View _maskView;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public IntlBaseVisitorInfo likedUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetLikedItemView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: E */
    private final void m40497E(List<String> texts) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(14));
        Iterator<String> it = texts.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        ViewGroup.LayoutParams layoutParams = get_match_remaining_switch().getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = ((int) fMax) + qa00.m175859d(2.0f);
        get_match_remaining_switch().setLayoutParams(layoutParams);
        bnl0.m105524M(get_match_remaining_switch(), true);
        get_match_remaining_switch().m58909i();
        get_match_remaining_switch().setTextList(texts);
        get_match_remaining_switch().setOutTranslateY(0.5f);
        get_match_remaining_switch().setAnimateDirection(false);
        get_match_remaining_switch().setInOutAnimation(300L);
        get_match_remaining_switch().m58908h();
    }

    /* JADX INFO: renamed from: p */
    public static void m40498p(Throwable th) {
    }

    /* JADX INFO: renamed from: s */
    public static void m40499s(IntlMeetLikedItemView intlMeetLikedItemView, User user, boolean z, y20 y20Var, View view) {
        Act act = intlMeetLikedItemView.act();
        act.getClass();
        if (act.lifecycle_() != C4470c.f16267i) {
            return;
        }
        Act act2 = intlMeetLikedItemView.act();
        fwl.m127807m(act2 != null ? act2.pageId() : null, user.f56859id);
        if (z) {
            y20Var.call(Boolean.FALSE);
        } else {
            sop.m187264l(sop.INSTANCE, intlMeetLikedItemView.act(), "p_intl_meet_view,e_intl_instantmatch_btn,click", Privilege.immediately_match, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m40500u(IntlMeetLikedItemView intlMeetLikedItemView, IntlBaseVisitorInfo intlBaseVisitorInfo, boolean z, boolean z2, y20 y20Var, y20 y20Var2, y20 y20Var3, User user) {
        user.getClass();
        intlMeetLikedItemView.m40503B(intlBaseVisitorInfo, user, z, z2, y20Var, y20Var2, y20Var3);
    }

    /* JADX INFO: renamed from: v */
    public static void m40501v(IntlMeetLikedItemView intlMeetLikedItemView, User user, boolean z, y20 y20Var, View view) {
        Act act = intlMeetLikedItemView.act();
        act.getClass();
        if (act.lifecycle_() != C4470c.f16267i) {
            return;
        }
        Act act2 = intlMeetLikedItemView.act();
        fwl.m127805k(act2 != null ? act2.pageId() : null, user.f56859id);
        if (z || joa.m146366R3() > 0) {
            y20Var.call(Boolean.FALSE);
        } else {
            sop.m187264l(sop.INSTANCE, intlMeetLikedItemView.act(), "p_intl_meet_view,e_intl_instantmatch_btn,click", Privilege.immediately_match, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m40502w(IntlMeetLikedItemView intlMeetLikedItemView, boolean z, y20 y20Var, View view) {
        Act act = intlMeetLikedItemView.act();
        act.getClass();
        if (act.lifecycle_() != C4470c.f16267i) {
            return;
        }
        Act act2 = intlMeetLikedItemView.act();
        fwl.m127806l(act2 != null ? act2.pageId() : null);
        if (!z) {
            sop.m187264l(sop.INSTANCE, intlMeetLikedItemView.act(), "p_intl_meet_view,e_intl_instantmatch_btn,click", Privilege.immediately_match, null, 8, null);
        } else if (NullChecker.m82486a(y20Var)) {
            y20Var.call(intlMeetLikedItemView.likedUser);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m40503B(IntlBaseVisitorInfo visitorItem, final User user, final boolean hasPrivilege, boolean isFirstItem, final y20<IntlBaseVisitorInfo> onClick, final y20<Boolean> onSuperLikeSend, final y20<Boolean> onInstantMatchSend) {
        bnl0.m105522L(get_action_btn(), new View.OnClickListener() { // from class: l.zfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMeetLikedItemView.m40499s(this.f204176a, user, hasPrivilege, onSuperLikeSend, view);
            }
        });
        bnl0.m105522L(get_match(), new View.OnClickListener() { // from class: l.ago
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMeetLikedItemView.m40501v(this.f71266a, user, hasPrivilege, onInstantMatchSend, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.bgo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMeetLikedItemView.m40502w(this.f76673a, hasPrivilege, onClick, view);
            }
        };
        bnl0.m105522L(get_image(), onClickListener);
        bnl0.m105522L(get_header_pic(), onClickListener);
        bnl0.m105522L(get_content(), onClickListener);
        bnl0.m105524M(get_maskView(), !hasPrivilege);
        get_maskView().setClickable(false);
        get_maskView().setFocusable(false);
        if (isFirstItem) {
            get_maskView().setBackgroundColor(Color.parseColor("#00000000"));
        } else {
            get_maskView().setBackgroundColor(Color.parseColor("#88ffffff"));
        }
        if (hasPrivilege || isFirstItem) {
            get_match().setAlpha(1.0f);
        } else {
            get_match().setAlpha(0.5f);
        }
        uqb0.f180374G.m127115L0(get_header_pic(), user.m61308fp().profileSmall().formatted());
        uqb0.f180374G.m127115L0(get_image(), user.m61308fp().profileBig().formatted());
        get_title_big().setText(visitorItem.title);
        ArrayList arrayListM147507f0 = jyb.m147507f0(getContext().getString(R$string.f21430u0));
        arrayListM147507f0.getClass();
        m40497E(arrayListM147507f0);
        get_subtitle().setText(visitorItem.describe);
        get_action_btn().setImageResource(IntlCountryCodeController.m29125v() ? gbc0.f103162N : gbc0.f103155M);
    }

    /* JADX INFO: renamed from: C */
    public final void m40504C(@NotNull fko adapter, @NotNull final IntlBaseVisitorInfo visitorItem, @NotNull String userId, final boolean isFirstItem, final boolean hasPrivilege, @NotNull final y20<IntlBaseVisitorInfo> onClick, @NotNull final y20<Boolean> onSuperLikeSend, @NotNull final y20<Boolean> onInstantMatchSend) {
        adapter.getClass();
        visitorItem.getClass();
        userId.getClass();
        onClick.getClass();
        onSuperLikeSend.getClass();
        onInstantMatchSend.getClass();
        bnl0.m105524M(get_divider(), !isFirstItem);
        this.likedUser = visitorItem;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userId);
        if (userM116503Pa != null) {
            m40503B(visitorItem, userM116503Pa, hasPrivilege, isFirstItem, onClick, onSuperLikeSend, onInstantMatchSend);
            return;
        }
        C22421c<V> c22421cMo68557c = adapter.mo68557c(act(), CoreModule.f18264c.f20381e0.m116483Ka(userId));
        if (c22421cMo68557c != 0) {
            c22421cMo68557c.subscribe(psd0.m173597H(new y20() { // from class: l.xfo
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlMeetLikedItemView.m40500u(this.f194075a, visitorItem, hasPrivilege, isFirstItem, onClick, onSuperLikeSend, onInstantMatchSend, (User) obj);
                }
            }, new y20() { // from class: l.yfo
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlMeetLikedItemView.m40498p((Throwable) obj);
                }
            }));
        }
    }

    @Nullable
    public final Act act() {
        return (Act) bnl0.m105506D(getContext());
    }

    @NotNull
    public final VImage get_action_btn() {
        VImage vImage = this._action_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_action_btn");
        return null;
    }

    @NotNull
    public final VLinear get_content() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    public final View get_divider() {
        View view = this._divider;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_divider");
        return null;
    }

    @NotNull
    public final VDraweeView get_header_pic() {
        VDraweeView vDraweeView = this._header_pic;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_header_pic");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    public final RelativeLayout get_like() {
        RelativeLayout relativeLayout = this._like;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_like");
        return null;
    }

    @NotNull
    public final View get_maskView() {
        View view = this._maskView;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_maskView");
        return null;
    }

    @NotNull
    public final VLinear get_match() {
        VLinear vLinear = this._match;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_match");
        return null;
    }

    @NotNull
    public final VImage get_match_icon() {
        VImage vImage = this._match_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_match_icon");
        return null;
    }

    @NotNull
    public final LetterRemainingSwitcherView get_match_remaining_switch() {
        LetterRemainingSwitcherView letterRemainingSwitcherView = this._match_remaining_switch;
        if (letterRemainingSwitcherView != null) {
            return letterRemainingSwitcherView;
        }
        Intrinsics.m88391r("_match_remaining_switch");
        return null;
    }

    @NotNull
    public final VLinear get_pic_tag_big() {
        VLinear vLinear = this._pic_tag_big;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_pic_tag_big");
        return null;
    }

    @NotNull
    public final VImage get_pic_tag_big_pic_verify_logo() {
        VImage vImage = this._pic_tag_big_pic_verify_logo;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pic_tag_big_pic_verify_logo");
        return null;
    }

    @NotNull
    public final VImage get_pic_tag_big_svip_tag() {
        VImage vImage = this._pic_tag_big_svip_tag;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pic_tag_big_svip_tag");
        return null;
    }

    @NotNull
    public final IntlMeetLikedItemView get_root() {
        IntlMeetLikedItemView intlMeetLikedItemView = this._root;
        if (intlMeetLikedItemView != null) {
            return intlMeetLikedItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    public final VText get_title_big() {
        VText vText = this._title_big;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title_big");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40505z(this);
    }

    public final void set_action_btn(@NotNull VImage vImage) {
        vImage.getClass();
        this._action_btn = vImage;
    }

    public final void set_content(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._content = vLinear;
    }

    public final void set_divider(@NotNull View view) {
        view.getClass();
        this._divider = view;
    }

    public final void set_header_pic(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._header_pic = vDraweeView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_like(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._like = relativeLayout;
    }

    public final void set_maskView(@NotNull View view) {
        view.getClass();
        this._maskView = view;
    }

    public final void set_match(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._match = vLinear;
    }

    public final void set_match_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._match_icon = vImage;
    }

    public final void set_match_remaining_switch(@NotNull LetterRemainingSwitcherView letterRemainingSwitcherView) {
        letterRemainingSwitcherView.getClass();
        this._match_remaining_switch = letterRemainingSwitcherView;
    }

    public final void set_pic_tag_big(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._pic_tag_big = vLinear;
    }

    public final void set_pic_tag_big_pic_verify_logo(@NotNull VImage vImage) {
        vImage.getClass();
        this._pic_tag_big_pic_verify_logo = vImage;
    }

    public final void set_pic_tag_big_svip_tag(@NotNull VImage vImage) {
        vImage.getClass();
        this._pic_tag_big_svip_tag = vImage;
    }

    public final void set_root(@NotNull IntlMeetLikedItemView intlMeetLikedItemView) {
        intlMeetLikedItemView.getClass();
        this._root = intlMeetLikedItemView;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title_big(@NotNull VText vText) {
        vText.getClass();
        this._title_big = vText;
    }

    /* JADX INFO: renamed from: z */
    public final void m40505z(View view) {
        cgo.m109711a(this, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetLikedItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetLikedItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
