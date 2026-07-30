package com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.lsi0;
import p149l.nvb0;
import p149l.qib0;
import p149l.svq;
import p149l.wwb0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010G\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00103\u001a\u0004\bE\u00105\"\u0004\bF\u00107R\"\u0010J\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010+\u001a\u0004\bH\u0010-\"\u0004\bI\u0010/R\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010T\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\\¨\u0006^"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "e", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "g", "(Lcom/p1/mobile/android/app/Act;)V", "j", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "videoChatSecondFloorSummary", "setVideoData", "(Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;)V", "", "type", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "able", "h", "(Z)V", "Lv/VLinear;", "a", "Lv/VLinear;", "get_rootView", "()Lv/VLinear;", "set_rootView", "(Lv/VLinear;)V", "_rootView", "Lv/VImage;", "b", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "Lv/VText;", "c", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", Constants.INAPP_DATA_TAG, "get_sub_title", "set_sub_title", "_sub_title", "get_head_icon", "set_head_icon", "_head_icon", "get_real_head_icon", "set_real_head_icon", "_real_head_icon", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "get_user_model_1", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "set_user_model_1", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;)V", "_user_model_1", "get_user_model_2", "set_user_model_2", "_user_model_2", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_user_model_3", "()Lv/VDraweeView;", "set_user_model_3", "(Lv/VDraweeView;)V", "_user_model_3", "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "_videoChatSecondFloorSummary", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class QuickChatPageItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VLinear _rootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _head_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _real_head_icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageXfermodeView _user_model_1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ImageXfermodeView _user_model_2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _user_model_3;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public VideoChatSecondFloorSummary _videoChatSecondFloorSummary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickChatPageItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        m54530f(layoutInflaterFrom, this);
    }

    /* JADX INFO: renamed from: a */
    public static void m54525a(QuickChatPageItem quickChatPageItem, Act act) {
        quickChatPageItem.m54531g(act);
    }

    /* JADX INFO: renamed from: b */
    public static void m54526b(Act act, Boolean bool) {
        nvb0.m161582m(act, "voice_quick_chat");
    }

    /* JADX INFO: renamed from: c */
    public static void m54527c(Act act, View view) {
        zvf0.m220396r("e_videochat_button", act.pageId());
        if (Network.isConnected(CoreModule.f17544b)) {
            nvb0.m161584o(act, "");
        } else {
            lsi0.m151579i(R$string.f18813p4, true);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m54528d(Act act, QuickChatPageItem quickChatPageItem, View view) {
        zvf0.m220396r("e_voicechat_button", act.pageId());
        if (Network.isConnected(CoreModule.f17544b)) {
            quickChatPageItem.m54531g(act);
        } else {
            lsi0.m151579i(R$string.f18813p4, true);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m54529e(View view) {
        wwb0.m205853a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m54530f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM205854b = wwb0.m205854b(this, inflater, parent);
        viewM205854b.getClass();
        return viewM205854b;
    }

    /* JADX INFO: renamed from: g */
    public final void m54531g(final Act act) {
        if (nvb0.m161579h(act, new d30() { // from class: l.uwb0
            @Override // p149l.d30
            public final void call() {
                QuickChatPageItem.m54525a(this.f178638a, act);
            }
        })) {
            nvb0.INSTANCE.m161587g(act, "p_quickchat,voicechat_button", new e30() { // from class: l.vwb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    QuickChatPageItem.m54526b(act, (Boolean) obj);
                }
            });
        }
    }

    @NotNull
    public final VImage get_head_icon() {
        VImage vImage = this._head_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_head_icon");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_icon");
        return null;
    }

    @NotNull
    public final VLinear get_real_head_icon() {
        VLinear vLinear = this._real_head_icon;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_real_head_icon");
        return null;
    }

    @NotNull
    public final VLinear get_rootView() {
        VLinear vLinear = this._rootView;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_rootView");
        return null;
    }

    @NotNull
    public final VText get_sub_title() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @NotNull
    public final ImageXfermodeView get_user_model_1() {
        ImageXfermodeView imageXfermodeView = this._user_model_1;
        if (imageXfermodeView != null) {
            return imageXfermodeView;
        }
        Intrinsics.m87502r("_user_model_1");
        return null;
    }

    @NotNull
    public final ImageXfermodeView get_user_model_2() {
        ImageXfermodeView imageXfermodeView = this._user_model_2;
        if (imageXfermodeView != null) {
            return imageXfermodeView;
        }
        Intrinsics.m87502r("_user_model_2");
        return null;
    }

    @NotNull
    public final VDraweeView get_user_model_3() {
        VDraweeView vDraweeView = this._user_model_3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_user_model_3");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m54532h(boolean able) {
        get_rootView().setClickable(able);
    }

    /* JADX INFO: renamed from: i */
    public final void m54533i(@NotNull final Act act, @NotNull String type) {
        String str;
        act.getClass();
        type.getClass();
        m54529e(this);
        if (Intrinsics.m87488d(type, "voice")) {
            get_icon().setImageResource(x2c0.f189273Dn);
            get_title().setText("语音闪聊");
            VText vText = get_sub_title();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText.setText(String.format("%s人在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.INSTANCE.nextInt(2000, 10000))}, 1)));
            get_rootView().setBackgroundResource(x2c0.f189241Cn);
            get_head_icon().setImageResource(zz6.m221004u0() ? x2c0.f189337Fn : x2c0.f189305En);
            xdl0.m208329E0(get_rootView(), new View.OnClickListener() { // from class: l.swb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickChatPageItem.m54528d(act, this, view);
                }
            });
            return;
        }
        if (Intrinsics.m87488d(type, "video")) {
            get_icon().setImageResource(x2c0.f189209Bn);
            get_title().setText("视频闪聊");
            VText vText2 = get_sub_title();
            VideoChatSecondFloorSummary videoChatSecondFloorSummary = this._videoChatSecondFloorSummary;
            if (videoChatSecondFloorSummary == null || (str = videoChatSecondFloorSummary.subtitle) == null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("面对面聊天", Arrays.copyOf(new Object[0], 0));
            }
            vText2.setText(str);
            get_rootView().setBackgroundResource(x2c0.f189177An);
            m54534j();
            get_rootView().setOnClickListener(new View.OnClickListener() { // from class: l.twb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickChatPageItem.m54527c(act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m54534j() {
        List<String> list;
        xdl0.m208344M(get_head_icon(), false);
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = this._videoChatSecondFloorSummary;
        if (videoChatSecondFloorSummary == null || (list = videoChatSecondFloorSummary.userAvatars) == null || list.size() != 3) {
            return;
        }
        xdl0.m208344M(get_head_icon(), false);
        qib0.f154691G.m102331L0(get_user_model_1(), list.get(0));
        qib0.f154691G.m102331L0(get_user_model_2(), list.get(1));
        get_user_model_1().setProgress(svq.m186103c(24) * 0.85f);
        get_user_model_2().setProgress(svq.m186103c(24) * 0.85f);
        qib0.f154691G.m102331L0(get_user_model_3(), list.get(2));
        xdl0.m208344M(get_real_head_icon(), true);
    }

    public final void setVideoData(@NotNull VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
        videoChatSecondFloorSummary.getClass();
        this._videoChatSecondFloorSummary = videoChatSecondFloorSummary;
    }

    public final void set_head_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._head_icon = vImage;
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    public final void set_real_head_icon(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._real_head_icon = vLinear;
    }

    public final void set_rootView(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._rootView = vLinear;
    }

    public final void set_sub_title(@NotNull VText vText) {
        vText.getClass();
        this._sub_title = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    public final void set_user_model_1(@NotNull ImageXfermodeView imageXfermodeView) {
        imageXfermodeView.getClass();
        this._user_model_1 = imageXfermodeView;
    }

    public final void set_user_model_2(@NotNull ImageXfermodeView imageXfermodeView) {
        imageXfermodeView.getClass();
        this._user_model_2 = imageXfermodeView;
    }

    public final void set_user_model_3(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._user_model_3 = vDraweeView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickChatPageItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickChatPageItem(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
