package com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.data.TextCardData;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.e30;
import p149l.etb0;
import p149l.hvb0;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010\u0018J\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u0010/J#\u00104\u001a\u00020\f2\u0006\u00101\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020002¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\fH\u0014¢\u0006\u0004\b8\u0010\u000eR\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010O\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010q\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010i\u001a\u0004\bo\u0010k\"\u0004\bp\u0010mR\"\u0010t\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010i\u001a\u0004\br\u0010k\"\u0004\bs\u0010mR\u0014\u0010w\u001a\u00020u8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010vR\u0014\u0010x\u001a\u00020u8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010v¨\u0006y"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatLoftChatItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "p", "()V", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/core/data/TextCardData;", "card", "Lcom/p1/mobile/putong/data/User;", "user", "", "j", "(Lcom/p1/mobile/putong/core/data/TextCardData;Lcom/p1/mobile/putong/data/User;)Ljava/lang/CharSequence;", "n", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/CharSequence;", "distance", "", "k", "(I)Ljava/lang/String;", ProfileLikeCategoryType.friendPurpose, BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;)Ljava/lang/String;", "", "isFemale", "m", "(Z)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "fitReason", "o", "h", "(Ljava/lang/String;)I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/etb0;", "cardData", "Ll/e30;", "clickAction", "q", "(Ll/etb0;Ll/e30;)V", "r", Constants.KEY_T, "onDetachedFromWindow", "Lv/VFrame;", "a", "Lv/VFrame;", "get_rootView", "()Lv/VFrame;", "set_rootView", "(Lv/VFrame;)V", "_rootView", "Lcom/tantan/library/svga/SVGAnimationView;", "b", "Lcom/tantan/library/svga/SVGAnimationView;", "get_svg_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svg_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svg_anim", "c", "Landroid/view/View;", "get_click_area", "()Landroid/view/View;", "set_click_area", "(Landroid/view/View;)V", "_click_area", "Lv/VLinear;", Constants.INAPP_DATA_TAG, "Lv/VLinear;", "get_layout", "()Lv/VLinear;", "set_layout", "(Lv/VLinear;)V", "_layout", "Landroid/widget/FrameLayout;", "e", "Landroid/widget/FrameLayout;", "get_header", "()Landroid/widget/FrameLayout;", "set_header", "(Landroid/widget/FrameLayout;)V", "_header", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "f", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "get_header_content", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "set_header_content", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;)V", "_header_content", "Lv/VText;", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "get_describe", "set_describe", "_describe", "get_button", "set_button", "_button", "", "J", "ANIMATION_DURATION", "ANIMATION_DIFF_TIME", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class QuickChatLoftChatItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VFrame _rootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public SVGAnimationView _svg_anim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _click_area;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public FrameLayout _header;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageXfermodeView _header_content;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _describe;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _button;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final long ANIMATION_DURATION;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long ANIMATION_DIFF_TIME;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickChatLoftChatItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ANIMATION_DURATION = 500L;
        this.ANIMATION_DIFF_TIME = 175L;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        m54511g(layoutInflaterFrom, this);
        m54520p();
    }

    /* JADX INFO: renamed from: a */
    public static void m54505a(e30 e30Var, etb0 etb0Var, View view) {
        e30Var.call(etb0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m54506b() {
    }

    /* JADX INFO: renamed from: c */
    public static void m54507c(e30 e30Var, etb0 etb0Var, View view) {
        e30Var.call(etb0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m54508d(QuickChatLoftChatItem quickChatLoftChatItem) {
        xdl0.m208344M(quickChatLoftChatItem, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m54509e(QuickChatLoftChatItem quickChatLoftChatItem) {
        quickChatLoftChatItem.get_svg_anim().setAlpha(1.0f);
        quickChatLoftChatItem.bringToFront();
    }

    /* JADX INFO: renamed from: f */
    public static void m54510f(QuickChatLoftChatItem quickChatLoftChatItem) {
        xdl0.m208344M(quickChatLoftChatItem, true);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m54511g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM133153b = hvb0.m133153b(this, inflater, parent);
        viewM133153b.getClass();
        return viewM133153b;
    }

    @NotNull
    public final VText get_button() {
        VText vText = this._button;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_button");
        return null;
    }

    @NotNull
    public final View get_click_area() {
        View view = this._click_area;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_click_area");
        return null;
    }

    @NotNull
    public final VText get_describe() {
        VText vText = this._describe;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_describe");
        return null;
    }

    @NotNull
    public final FrameLayout get_header() {
        FrameLayout frameLayout = this._header;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_header");
        return null;
    }

    @NotNull
    public final ImageXfermodeView get_header_content() {
        ImageXfermodeView imageXfermodeView = this._header_content;
        if (imageXfermodeView != null) {
            return imageXfermodeView;
        }
        Intrinsics.m87502r("_header_content");
        return null;
    }

    @NotNull
    public final VLinear get_layout() {
        VLinear vLinear = this._layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_layout");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final VFrame get_rootView() {
        VFrame vFrame = this._rootView;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_rootView");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_svg_anim() {
        SVGAnimationView sVGAnimationView = this._svg_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_svg_anim");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final int m54512h(String fitReason) {
        if (Intrinsics.m87488d(fitReason, "distance")) {
            return x2c0.f190754yn;
        }
        return Intrinsics.m87488d(fitReason, ProfileLikeCategoryType.friendPurpose) ? x2c0.f190786zn : x2c0.f190722xn;
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m54513i(User user) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("立即和%s聊", Arrays.copyOf(new Object[]{m54517m(user.isFemale())}, 1));
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m54514j(TextCardData card, User user) {
        String str = card.fitReason;
        int iHashCode = str.hashCode();
        if (iHashCode != -2021065568) {
            if (iHashCode == 288459765 && str.equals("distance")) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return String.format("与你相距%s", Arrays.copyOf(new Object[]{m54515k(user.location.distance)}, 1));
            }
        } else if (str.equals(ProfileLikeCategoryType.friendPurpose)) {
            String str2 = card.friendPurpose;
            str2.getClass();
            return m54516l(str2);
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format("附近的%s刚发来一条消息", Arrays.copyOf(new Object[]{m54517m(user.isFemale())}, 1));
    }

    /* JADX INFO: renamed from: k */
    public final String m54515k(int distance) {
        String strValueOf;
        String str = "km";
        if (distance >= 10000) {
            strValueOf = com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        } else if (distance >= 1000) {
            strValueOf = String.valueOf(distance / 1000);
        } else {
            str = "m";
            strValueOf = distance >= 100 ? String.valueOf(distance) : "100";
        }
        return strValueOf + str;
    }

    /* JADX INFO: renamed from: l */
    public final String m54516l(String friendPurpose) {
        switch (friendPurpose.hashCode()) {
            case -1266283874:
                friendPurpose.equals("friend");
                return "你们都想交个朋友";
            case -894477624:
                return !friendPurpose.equals(Purpose.fall_in_love) ? "你们都想交个朋友" : "你们都想谈个恋爱";
            case 3076014:
                return !friendPurpose.equals("date") ? "你们都想交个朋友" : "你们都想出来约会";
            case 253538506:
                return !friendPurpose.equals("marriage") ? "你们都想交个朋友" : "你们都在找结婚对象";
            default:
                return "你们都想交个朋友";
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m54517m(boolean isFemale) {
        return isFemale ? "她" : "他";
    }

    /* JADX INFO: renamed from: n */
    public final CharSequence m54518n(User user) {
        String strConcat = user.name;
        if (strConcat.length() > 12) {
            strConcat = strConcat.substring(0, 12).concat("...");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s · %s", Arrays.copyOf(new Object[]{strConcat, user.age}, 2));
    }

    /* JADX INFO: renamed from: o */
    public final String m54519o(String fitReason) {
        if (Intrinsics.m87488d(fitReason, "distance")) {
            return "https://fe-static.tancdn.com/v1/raw/4475f01c-8dd0-40b9-851d-f60f578c08db14.svga";
        }
        return Intrinsics.m87488d(fitReason, ProfileLikeCategoryType.friendPurpose) ? "https://fe-static.tancdn.com/v1/raw/3fde0b7d-f6d7-410d-9454-59d1b7d1783014.svga" : "https://fe-static.tancdn.com/v1/raw/b63ed4a9-0bbb-4a36-b6ea-91dbb32addd814.svga";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        get_svg_anim().stopAnimation(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m54520p() {
        int iM208412y0 = xdl0.m208412y0();
        if (iM208412y0 > 0) {
            int iMin = Math.min(t100.m186890d(375.0f), iM208412y0);
            ViewGroup.LayoutParams layoutParams = get_svg_anim().getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = iMin;
            layoutParams.width = iMin;
            get_svg_anim().setLayoutParams(layoutParams);
            int i = (int) (iMin * 0.7f);
            ViewGroup.LayoutParams layoutParams2 = get_click_area().getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.height = i;
            layoutParams2.width = i;
            get_click_area().setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m54521q(@NotNull final etb0 cardData, @NotNull final e30<etb0> clickAction) {
        cardData.getClass();
        clickAction.getClass();
        TextCardData textCardData = cardData.getTextCardData();
        User user = cardData.getUser();
        qib0.f154691G.m102336O(get_header_content(), user.m60124fp().profileSmall().formatted(), 5, 7);
        get_header_content().setCustomXYAndRadius(true);
        get_name().setText(m54518n(user));
        get_describe().setText(m54514j(textCardData, user));
        get_button().setText(m54513i(user));
        VText vText = get_button();
        String str = textCardData.fitReason;
        str.getClass();
        vText.setBackgroundResource(m54512h(str));
        xdl0.m208360X(get_describe(), t100.f167254c);
        xdl0.m208329E0(get_button(), new View.OnClickListener() { // from class: l.fvb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatLoftChatItem.m54505a(clickAction, cardData, view);
            }
        });
        xdl0.m208329E0(get_click_area(), new View.OnClickListener() { // from class: l.gvb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatLoftChatItem.m54507c(clickAction, cardData, view);
            }
        });
        xdl0.m208344M(get_header(), true);
        Context context = getContext();
        context.getClass();
        SVGALoader.SVGARequestBuilder sVGARequestBuilderAutoPlay = SVGALoader.with(context).repeatCount(-1).autoPlay(true);
        String str2 = textCardData.fitReason;
        str2.getClass();
        sVGARequestBuilderAutoPlay.from(m54519o(str2)).into(get_svg_anim());
        get_svg_anim().setAlpha(0.0f);
        xdl0.m208344M(get_button(), true);
        xdl0.m208344M(get_click_area(), true);
        xdl0.m208344M(get_header(), true);
        m54523s();
    }

    /* JADX INFO: renamed from: r */
    public final void m54522r() {
        get_name().setText("暂无匹配用户");
        get_describe().setText("点击下方按钮，随机匹配");
        xdl0.m208360X(get_describe(), t100.f167256e);
        xdl0.m208344M(get_header(), false);
        xdl0.m208344M(get_button(), false);
        xdl0.m208344M(get_click_area(), false);
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).repeatCount(-1).autoPlay(true).from(m54519o(ProfileLikeCategoryType.friendPurpose)).into(get_svg_anim());
        m54523s();
    }

    /* JADX INFO: renamed from: s */
    public final void m54523s() {
        Property property = LinearLayout.ALPHA;
        Animator animatorM103739l = bt0.m103739l(get_header(), property, this.ANIMATION_DIFF_TIME, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        Animator animatorM103739l2 = bt0.m103739l(get_name(), property, this.ANIMATION_DIFF_TIME, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        Animator animatorM103739l3 = bt0.m103739l(get_describe(), property, this.ANIMATION_DIFF_TIME, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        Animator animatorM103739l4 = bt0.m103739l(get_button(), property, this.ANIMATION_DIFF_TIME, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        Animator animatorM103739l5 = bt0.m103739l(get_svg_anim(), property, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 0.0f, 1.0f);
        FrameLayout frameLayout = get_header();
        long j = this.ANIMATION_DIFF_TIME;
        long j2 = this.ANIMATION_DURATION;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        float[] fArr = {t100.m186890d(10.0f), 0.0f};
        Property property2 = LinearLayout.TRANSLATION_Y;
        bt0.m103750w(bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, animatorM103739l4, animatorM103739l5, bt0.m103739l(frameLayout, property2, j, j2, accelerateDecelerateInterpolator, fArr), bt0.m103739l(get_name(), property2, this.ANIMATION_DIFF_TIME, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), t100.m186890d(10.0f), 0.0f), bt0.m103739l(get_describe(), property2, this.ANIMATION_DIFF_TIME, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), t100.m186890d(10.0f), 0.0f)), new Runnable() { // from class: l.bvb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatLoftChatItem.m54510f(this.f77419a);
            }
        }, new Runnable() { // from class: l.cvb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatLoftChatItem.m54509e(this.f82655a);
            }
        }).start();
    }

    public final void set_button(@NotNull VText vText) {
        vText.getClass();
        this._button = vText;
    }

    public final void set_click_area(@NotNull View view) {
        view.getClass();
        this._click_area = view;
    }

    public final void set_describe(@NotNull VText vText) {
        vText.getClass();
        this._describe = vText;
    }

    public final void set_header(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._header = frameLayout;
    }

    public final void set_header_content(@NotNull ImageXfermodeView imageXfermodeView) {
        imageXfermodeView.getClass();
        this._header_content = imageXfermodeView;
    }

    public final void set_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._layout = vLinear;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_rootView(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._rootView = vFrame;
    }

    public final void set_svg_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._svg_anim = sVGAnimationView;
    }

    /* JADX INFO: renamed from: t */
    public final void m54524t() {
        Property property = LinearLayout.ALPHA;
        Animator animatorM103739l = bt0.m103739l(get_header(), property, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        Animator animatorM103739l2 = bt0.m103739l(get_name(), property, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        Animator animatorM103739l3 = bt0.m103739l(get_describe(), property, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        Animator animatorM103739l4 = bt0.m103739l(get_button(), property, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        Animator animatorM103739l5 = bt0.m103739l(get_svg_anim(), property, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 1.0f, 0.0f);
        FrameLayout frameLayout = get_header();
        long j = this.ANIMATION_DURATION;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        float[] fArr = {0.0f, -t100.m186890d(10.0f)};
        Property property2 = LinearLayout.TRANSLATION_Y;
        bt0.m103750w(bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, animatorM103739l4, animatorM103739l5, bt0.m103739l(frameLayout, property2, 0L, j, accelerateDecelerateInterpolator, fArr), bt0.m103739l(get_name(), property2, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 0.0f, -t100.m186890d(10.0f)), bt0.m103739l(get_describe(), property2, 0L, this.ANIMATION_DURATION, new AccelerateDecelerateInterpolator(), 0.0f, -t100.m186890d(10.0f))), new Runnable() { // from class: l.dvb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatLoftChatItem.m54506b();
            }
        }, new Runnable() { // from class: l.evb0
            @Override // java.lang.Runnable
            public final void run() {
                QuickChatLoftChatItem.m54508d(this.f93328a);
            }
        }).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickChatLoftChatItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickChatLoftChatItem(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
