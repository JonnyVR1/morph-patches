package com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.secondfloor.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p1.mobile.putong.core.newui.messages.anim.view.widget.ImageXfermodeView;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import l.d30;
import l.e30;
import l.lsi0;
import l.svq;
import l.wwb0;
import l.xdl0;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.nvb0;
import p006l.qib0;
import p006l.x2c0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010G\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00103\u001a\u0004\bE\u00105\"\u0004\bF\u00107R\"\u0010J\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010+\u001a\u0004\bH\u0010-\"\u0004\bI\u0010/R\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010T\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\\¨\u0006^"}, d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/secondfloor/item/QuickChatPageItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "e", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", "act", "g", "(Lcom/p1/mobile/android/app/Act;)V", "j", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "videoChatSecondFloorSummary", "setVideoData", "(Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;)V", "", "type", "i", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "able", "h", "(Z)V", "Lv/VLinear;", "a", "Lv/VLinear;", "get_rootView", "()Lv/VLinear;", "set_rootView", "(Lv/VLinear;)V", "_rootView", "Lv/VImage;", "b", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "Lv/VText;", "c", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "d", "get_sub_title", "set_sub_title", "_sub_title", "get_head_icon", "set_head_icon", "_head_icon", "get_real_head_icon", "set_real_head_icon", "_real_head_icon", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "get_user_model_1", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;", "set_user_model_1", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/widget/ImageXfermodeView;)V", "_user_model_1", "get_user_model_2", "set_user_model_2", "_user_model_2", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_user_model_3", "()Lv/VDraweeView;", "set_user_model_3", "(Lv/VDraweeView;)V", "_user_model_3", "Lcom/p1/mobile/putong/core/data/VideoChatSecondFloorSummary;", "_videoChatSecondFloorSummary", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        m7873f(layoutInflaterFrom, this);
    }

    /* JADX INFO: renamed from: a */
    public static void m7868a(QuickChatPageItem quickChatPageItem, Act act) {
        quickChatPageItem.m7874g(act);
    }

    /* JADX INFO: renamed from: b */
    public static void m7869b(Act act, Boolean bool) {
        nvb0.m20213m(act, "voice_quick_chat");
    }

    /* JADX INFO: renamed from: c */
    public static void m7870c(Act act, View view) {
        zvf0.r("e_videochat_button", act.pageId());
        if (Network.isConnected(CoreModule.f1533b)) {
            nvb0.m20215o(act, "");
        } else {
            lsi0.i(R$string.f2802p4, true);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7871d(Act act, QuickChatPageItem quickChatPageItem, View view) {
        zvf0.r("e_voicechat_button", act.pageId());
        if (Network.isConnected(CoreModule.f1533b)) {
            quickChatPageItem.m7874g(act);
        } else {
            lsi0.i(R$string.f2802p4, true);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7872e(View view) {
        wwb0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m7873f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = wwb0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: g */
    public final void m7874g(final Act act) {
        if (nvb0.m20210h(act, new d30() { // from class: l.uwb0
            public final void call() {
                QuickChatPageItem.m7868a(this.f23779a, act);
            }
        })) {
            nvb0.INSTANCE.m20218g(act, "p_quickchat,voicechat_button", new e30() { // from class: l.vwb0
                public final void call(Object obj) {
                    QuickChatPageItem.m7869b(act, (Boolean) obj);
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
        Intrinsics.r("_head_icon");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_icon");
        return null;
    }

    @NotNull
    public final VLinear get_real_head_icon() {
        VLinear vLinear = this._real_head_icon;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_real_head_icon");
        return null;
    }

    @NotNull
    public final VLinear get_rootView() {
        VLinear vLinear = this._rootView;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_rootView");
        return null;
    }

    @NotNull
    public final VText get_sub_title() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    @NotNull
    public final ImageXfermodeView get_user_model_1() {
        ImageXfermodeView imageXfermodeView = this._user_model_1;
        if (imageXfermodeView != null) {
            return imageXfermodeView;
        }
        Intrinsics.r("_user_model_1");
        return null;
    }

    @NotNull
    public final ImageXfermodeView get_user_model_2() {
        ImageXfermodeView imageXfermodeView = this._user_model_2;
        if (imageXfermodeView != null) {
            return imageXfermodeView;
        }
        Intrinsics.r("_user_model_2");
        return null;
    }

    @NotNull
    public final VDraweeView get_user_model_3() {
        VDraweeView vDraweeView = this._user_model_3;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_model_3");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m7875h(boolean able) {
        get_rootView().setClickable(able);
    }

    /* JADX INFO: renamed from: i */
    public final void m7876i(@NotNull final Act act, @NotNull String type) {
        String str;
        act.getClass();
        type.getClass();
        m7872e(this);
        if (Intrinsics.d(type, "voice")) {
            get_icon().setImageResource(x2c0.f25809Dn);
            get_title().setText("语音闪聊");
            VText vText = get_sub_title();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText.setText(String.format("%s人在线", Arrays.copyOf(new Object[]{Integer.valueOf(Random.Default.nextInt(2000, 10000))}, 1)));
            get_rootView().setBackgroundResource(x2c0.f25777Cn);
            get_head_icon().setImageResource(zz6.u0() ? x2c0.f25873Fn : x2c0.f25841En);
            xdl0.E0(get_rootView(), new View.OnClickListener() { // from class: l.swb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickChatPageItem.m7871d(act, this, view);
                }
            });
            return;
        }
        if (Intrinsics.d(type, "video")) {
            get_icon().setImageResource(x2c0.f25745Bn);
            get_title().setText("视频闪聊");
            VText vText2 = get_sub_title();
            VideoChatSecondFloorSummary videoChatSecondFloorSummary = this._videoChatSecondFloorSummary;
            if (videoChatSecondFloorSummary == null || (str = videoChatSecondFloorSummary.subtitle) == null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("面对面聊天", Arrays.copyOf(new Object[0], 0));
            }
            vText2.setText(str);
            get_rootView().setBackgroundResource(x2c0.f25713An);
            m7877j();
            get_rootView().setOnClickListener(new View.OnClickListener() { // from class: l.twb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickChatPageItem.m7870c(act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7877j() {
        List list;
        xdl0.M(get_head_icon(), false);
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = this._videoChatSecondFloorSummary;
        if (videoChatSecondFloorSummary == null || (list = videoChatSecondFloorSummary.userAvatars) == null || list.size() != 3) {
            return;
        }
        xdl0.M(get_head_icon(), false);
        qib0.f19782G.m12744L0(get_user_model_1(), (String) list.get(0));
        qib0.f19782G.m12744L0(get_user_model_2(), (String) list.get(1));
        get_user_model_1().setProgress(svq.c(24) * 0.85f);
        get_user_model_2().setProgress(svq.c(24) * 0.85f);
        qib0.f19782G.m12744L0(get_user_model_3(), (String) list.get(2));
        xdl0.M(get_real_head_icon(), true);
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
