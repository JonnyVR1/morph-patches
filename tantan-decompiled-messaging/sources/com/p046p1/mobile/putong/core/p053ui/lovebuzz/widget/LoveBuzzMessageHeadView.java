package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.view.ImFlowTagsView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.e30;
import p149l.hvc0;
import p149l.l6c0;
import p149l.mkd0;
import p149l.qib0;
import p149l.rw6;
import p149l.s8w;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010^\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010G\u001a\u0004\b\\\u0010I\"\u0004\b]\u0010KR\"\u0010a\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010?\u001a\u0004\b_\u0010A\"\u0004\b`\u0010CR\"\u0010d\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010C¨\u0006e"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMessageHeadView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "", "isNotBlur", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)V", "", "Lcom/p1/mobile/putong/data/Tag;", "userTagsData", "k", "(Ljava/util/List;)Ljava/util/List;", "tag", "j", "(Lcom/p1/mobile/putong/data/Tag;)Landroid/view/View;", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/data/User;", "other", "textBuzz", "m", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "onlineMatchPercent", "h", "(Lcom/p1/mobile/putong/data/User;IZ)V", "Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;", "g", "()Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;", "ctx", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)Z", "Lv/VLinear;", "a", "Lv/VLinear;", "get_content", "()Lv/VLinear;", "set_content", "(Lv/VLinear;)V", "_content", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_head", "()Lv/VDraweeView;", "set_head", "(Lv/VDraweeView;)V", "_head", "Lv/VText;", "c", "Lv/VText;", "get_user_desc1", "()Lv/VText;", "set_user_desc1", "(Lv/VText;)V", "_user_desc1", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_peer_region", "()Lv/VImage;", "set_peer_region", "(Lv/VImage;)V", "_peer_region", "Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "e", "Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "get_tags", "()Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "set_tags", "(Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;)V", "_tags", "Lv/VRelative;", "Lv/VRelative;", "get_love_buzz_tips", "()Lv/VRelative;", "set_love_buzz_tips", "(Lv/VRelative;)V", "_love_buzz_tips", "get_img_tips", "set_img_tips", "_img_tips", "get_tv_tips", "set_tv_tips", "_tv_tips", "get_tips_subtitle", "set_tips_subtitle", "_tips_subtitle", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LoveBuzzMessageHeadView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VLinear _content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _head;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _user_desc1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _peer_region;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ImFlowTagsView _tags;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VRelative _love_buzz_tips;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _img_tips;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _tv_tips;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _tips_subtitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzMessageHeadView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m47201a(LoveBuzzMessageHeadView loveBuzzMessageHeadView, User user) {
        user.getClass();
        CoreModule.m29935P().m94652b().mo35111a8(user, loveBuzzMessageHeadView.get_peer_region());
        CoreModule.m29935P().m94652b().mo35121nt(user, loveBuzzMessageHeadView.get_user_desc1());
        List<? extends Tag> listM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.q8w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LoveBuzzMessageHeadView.m47206n((Tag) obj);
            }
        });
        listM200339n.getClass();
        ArrayList arrayListM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.r8w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LoveBuzzMessageHeadView.m47207o((Tag) obj);
            }
        });
        arrayListM200339n.getClass();
        if (!vwb.m200296J(listM200339n) && listM200339n.size() < 10 && !vwb.m200296J(arrayListM200339n)) {
            int size = 10 - listM200339n.size();
            if (arrayListM200339n.size() < size) {
                listM200339n.addAll(arrayListM200339n);
            } else {
                listM200339n.addAll(arrayListM200339n.subList(0, size));
            }
        }
        if (vwb.m200296J(listM200339n)) {
            xdl0.m208344M(loveBuzzMessageHeadView.get_tags(), false);
            return;
        }
        xdl0.m208344M(loveBuzzMessageHeadView.get_tags(), true);
        loveBuzzMessageHeadView.get_tags().m56117c();
        loveBuzzMessageHeadView.get_tags().setTags(loveBuzzMessageHeadView.m47213k(listM200339n));
    }

    /* JADX INFO: renamed from: b */
    public static void m47202b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m47203c(LoveBuzzMessageHeadView loveBuzzMessageHeadView, User user, View view) {
        Activity activityM208328E = xdl0.m208328E(loveBuzzMessageHeadView);
        activityM208328E.getClass();
        ((MessagesAct) activityM208328E).mo48974l().m120854w6("messages_thumbnail_left", user.f56011id);
    }

    /* JADX INFO: renamed from: n */
    public static final Boolean m47206n(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(Intrinsics.m87488d("personality", tag.category));
    }

    /* JADX INFO: renamed from: o */
    public static final Boolean m47207o(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(!Intrinsics.m87488d("personality", tag.category));
    }

    /* JADX INFO: renamed from: f */
    public final void m47208f(View view) {
        s8w.m182665a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final MessagesAct m47209g() {
        Context context = getContext();
        context.getClass();
        return (MessagesAct) context;
    }

    @NotNull
    public final VLinear get_content() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    public final VDraweeView get_head() {
        VDraweeView vDraweeView = this._head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_head");
        return null;
    }

    @NotNull
    public final VImage get_img_tips() {
        VImage vImage = this._img_tips;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_img_tips");
        return null;
    }

    @NotNull
    public final VRelative get_love_buzz_tips() {
        VRelative vRelative = this._love_buzz_tips;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_love_buzz_tips");
        return null;
    }

    @NotNull
    public final VImage get_peer_region() {
        VImage vImage = this._peer_region;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_peer_region");
        return null;
    }

    @NotNull
    public final ImFlowTagsView get_tags() {
        ImFlowTagsView imFlowTagsView = this._tags;
        if (imFlowTagsView != null) {
            return imFlowTagsView;
        }
        Intrinsics.m87502r("_tags");
        return null;
    }

    @NotNull
    public final VText get_tips_subtitle() {
        VText vText = this._tips_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tips_subtitle");
        return null;
    }

    @NotNull
    public final VText get_tv_tips() {
        VText vText = this._tv_tips;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_tips");
        return null;
    }

    @NotNull
    public final VText get_user_desc1() {
        VText vText = this._user_desc1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_user_desc1");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m47210h(@NotNull User other, int onlineMatchPercent, boolean isNotBlur) {
        other.getClass();
        if (NullChecker.m81303a(other) && other.inactivated) {
            qib0.f154691G.m102354Y0(get_head(), CoreModule.m29935P().m94658i().mo158375f3());
            return;
        }
        CoreBuzzInnerService coreBuzzInnerServiceM94652b = CoreModule.m29935P().m94652b();
        VDraweeView vDraweeView = get_head();
        Picture.ImageUri imageUriProfileSmall = rw6.m181385a(other).profileSmall();
        if (isNotBlur) {
            onlineMatchPercent = 100;
        }
        coreBuzzInnerServiceM94652b.mo35132xp(vDraweeView, imageUriProfileSmall, onlineMatchPercent);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47211i(@Nullable Context ctx) {
        if (ctx == null) {
            return false;
        }
        if (!(ctx instanceof Act)) {
            return true;
        }
        Act act = (Act) ctx;
        return (act.isFinishing() || act.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final View m47212j(Tag tag) {
        View viewInflate = m47209g().inflater().inflate(l6c0.f126382S0, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(y4c0.f195955E);
        viewFindViewById.getClass();
        ((VText) viewFindViewById).setText(tag.value);
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final List<View> m47213k(List<? extends Tag> userTagsData) {
        if (!NullChecker.m81303a(userTagsData) || !m47211i(m47209g())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Tag tag : userTagsData) {
            if (NullChecker.m81303a(tag)) {
                arrayList.add(m47212j(tag));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m47214l(boolean isNotBlur) {
        get_tips_subtitle().setText(hvc0.m133156c(R$string.f21088t3));
        if (isNotBlur) {
            get_tips_subtitle().setText(R$string.f20712A3);
        }
        CoreBuzzInnerService coreBuzzInnerServiceM94652b = CoreModule.f17554l.m94652b();
        if (coreBuzzInnerServiceM94652b != null ? coreBuzzInnerServiceM94652b.mo35131xk() : false) {
            get_tips_subtitle().append(SignParameters.NEW_LINE + hvc0.m133156c(R$string.f21128y3));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m47215m(@NotNull final User other, boolean textBuzz, boolean isNotBlur) {
        other.getClass();
        xdl0.m208329E0(get_head(), new View.OnClickListener() { // from class: l.n8w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoveBuzzMessageHeadView.m47203c(this.f137695a, other, view);
            }
        });
        xdl0.m208344M(get_love_buzz_tips(), textBuzz);
        if (textBuzz) {
            m47214l(isNotBlur);
        }
        m47209g().duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(other.f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.o8w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoveBuzzMessageHeadView.m47201a(this.f142679a, (User) obj);
            }
        }, new e30() { // from class: l.p8w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoveBuzzMessageHeadView.m47202b((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47208f(this);
    }

    public final void set_content(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._content = vLinear;
    }

    public final void set_head(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._head = vDraweeView;
    }

    public final void set_img_tips(@NotNull VImage vImage) {
        vImage.getClass();
        this._img_tips = vImage;
    }

    public final void set_love_buzz_tips(@NotNull VRelative vRelative) {
        vRelative.getClass();
        this._love_buzz_tips = vRelative;
    }

    public final void set_peer_region(@NotNull VImage vImage) {
        vImage.getClass();
        this._peer_region = vImage;
    }

    public final void set_tags(@NotNull ImFlowTagsView imFlowTagsView) {
        imFlowTagsView.getClass();
        this._tags = imFlowTagsView;
    }

    public final void set_tips_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._tips_subtitle = vText;
    }

    public final void set_tv_tips(@NotNull VText vText) {
        vText.getClass();
        this._tv_tips = vText;
    }

    public final void set_user_desc1(@NotNull VText vText) {
        vText.getClass();
        this._user_desc1 = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzMessageHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoveBuzzMessageHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
