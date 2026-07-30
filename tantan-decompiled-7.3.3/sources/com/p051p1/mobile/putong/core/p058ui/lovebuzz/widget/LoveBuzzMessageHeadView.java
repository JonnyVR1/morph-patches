package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.view.ImFlowTagsView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.jyb;
import p153l.k3d0;
import p153l.psd0;
import p153l.qaw;
import p153l.qcj;
import p153l.qec0;
import p153l.uqb0;
import p153l.ux6;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010^\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010G\u001a\u0004\b\\\u0010I\"\u0004\b]\u0010KR\"\u0010a\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010?\u001a\u0004\b_\u0010A\"\u0004\b`\u0010CR\"\u0010d\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010C¨\u0006e"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMessageHeadView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "", "isNotBlur", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "", "Lcom/p1/mobile/putong/data/Tag;", "userTagsData", "k", "(Ljava/util/List;)Ljava/util/List;", "tag", "j", "(Lcom/p1/mobile/putong/data/Tag;)Landroid/view/View;", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/data/User;", "other", "textBuzz", "m", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "onlineMatchPercent", "h", "(Lcom/p1/mobile/putong/data/User;IZ)V", "Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;", "g", "()Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;", "ctx", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)Z", "Lv/VLinear;", "a", "Lv/VLinear;", "get_content", "()Lv/VLinear;", "set_content", "(Lv/VLinear;)V", "_content", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_head", "()Lv/VDraweeView;", "set_head", "(Lv/VDraweeView;)V", "_head", "Lv/VText;", "c", "Lv/VText;", "get_user_desc1", "()Lv/VText;", "set_user_desc1", "(Lv/VText;)V", "_user_desc1", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_peer_region", "()Lv/VImage;", "set_peer_region", "(Lv/VImage;)V", "_peer_region", "Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "e", "Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "get_tags", "()Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "set_tags", "(Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;)V", "_tags", "Lv/VRelative;", "Lv/VRelative;", "get_love_buzz_tips", "()Lv/VRelative;", "set_love_buzz_tips", "(Lv/VRelative;)V", "_love_buzz_tips", "get_img_tips", "set_img_tips", "_img_tips", "get_tv_tips", "set_tv_tips", "_tv_tips", "get_tips_subtitle", "set_tips_subtitle", "_tips_subtitle", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static void m48384a(LoveBuzzMessageHeadView loveBuzzMessageHeadView, User user) {
        user.getClass();
        CoreModule.m30933P().m143406b().mo36114a8(user, loveBuzzMessageHeadView.get_peer_region());
        CoreModule.m30933P().m143406b().mo36124nt(user, loveBuzzMessageHeadView.get_user_desc1());
        List<? extends Tag> listM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.oaw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LoveBuzzMessageHeadView.m48389n((Tag) obj);
            }
        });
        listM147522n.getClass();
        ArrayList arrayListM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.paw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LoveBuzzMessageHeadView.m48390o((Tag) obj);
            }
        });
        arrayListM147522n.getClass();
        if (!jyb.m147479J(listM147522n) && listM147522n.size() < 10 && !jyb.m147479J(arrayListM147522n)) {
            int size = 10 - listM147522n.size();
            if (arrayListM147522n.size() < size) {
                listM147522n.addAll(arrayListM147522n);
            } else {
                listM147522n.addAll(arrayListM147522n.subList(0, size));
            }
        }
        if (jyb.m147479J(listM147522n)) {
            bnl0.m105524M(loveBuzzMessageHeadView.get_tags(), false);
            return;
        }
        bnl0.m105524M(loveBuzzMessageHeadView.get_tags(), true);
        loveBuzzMessageHeadView.get_tags().m57300c();
        loveBuzzMessageHeadView.get_tags().setTags(loveBuzzMessageHeadView.m48396k(listM147522n));
    }

    /* JADX INFO: renamed from: b */
    public static void m48385b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m48386c(LoveBuzzMessageHeadView loveBuzzMessageHeadView, User user, View view) {
        Activity activityM105508E = bnl0.m105508E(loveBuzzMessageHeadView);
        activityM105508E.getClass();
        ((MessagesAct) activityM105508E).mo50158l().m111060w6("messages_thumbnail_left", user.f56859id);
    }

    /* JADX INFO: renamed from: n */
    public static final Boolean m48389n(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(Intrinsics.m88377d("personality", tag.category));
    }

    /* JADX INFO: renamed from: o */
    public static final Boolean m48390o(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(!Intrinsics.m88377d("personality", tag.category));
    }

    /* JADX INFO: renamed from: f */
    public final void m48391f(View view) {
        qaw.m175999a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final MessagesAct m48392g() {
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
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    public final VDraweeView get_head() {
        VDraweeView vDraweeView = this._head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_head");
        return null;
    }

    @NotNull
    public final VImage get_img_tips() {
        VImage vImage = this._img_tips;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_img_tips");
        return null;
    }

    @NotNull
    public final VRelative get_love_buzz_tips() {
        VRelative vRelative = this._love_buzz_tips;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_love_buzz_tips");
        return null;
    }

    @NotNull
    public final VImage get_peer_region() {
        VImage vImage = this._peer_region;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_peer_region");
        return null;
    }

    @NotNull
    public final ImFlowTagsView get_tags() {
        ImFlowTagsView imFlowTagsView = this._tags;
        if (imFlowTagsView != null) {
            return imFlowTagsView;
        }
        Intrinsics.m88391r("_tags");
        return null;
    }

    @NotNull
    public final VText get_tips_subtitle() {
        VText vText = this._tips_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tips_subtitle");
        return null;
    }

    @NotNull
    public final VText get_tv_tips() {
        VText vText = this._tv_tips;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_tips");
        return null;
    }

    @NotNull
    public final VText get_user_desc1() {
        VText vText = this._user_desc1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_user_desc1");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m48393h(@NotNull User other, int onlineMatchPercent, boolean isNotBlur) {
        other.getClass();
        if (NullChecker.m82486a(other) && other.inactivated) {
            uqb0.f180374G.m127138Y0(get_head(), CoreModule.m30933P().m143412i().mo180467f3());
            return;
        }
        CoreBuzzInnerService coreBuzzInnerServiceM143406b = CoreModule.m30933P().m143406b();
        VDraweeView vDraweeView = get_head();
        Picture.ImageUri imageUriProfileSmall = ux6.m198403a(other).profileSmall();
        if (isNotBlur) {
            onlineMatchPercent = 100;
        }
        coreBuzzInnerServiceM143406b.mo36135xp(vDraweeView, imageUriProfileSmall, onlineMatchPercent);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48394i(@Nullable Context ctx) {
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
    public final View m48395j(Tag tag) {
        View viewInflate = m48392g().inflater().inflate(qec0.f156938S0, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(edc0.f93190E);
        viewFindViewById.getClass();
        ((VText) viewFindViewById).setText(tag.value);
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final List<View> m48396k(List<? extends Tag> userTagsData) {
        if (!NullChecker.m82486a(userTagsData) || !m48394i(m48392g())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Tag tag : userTagsData) {
            if (NullChecker.m82486a(tag)) {
                arrayList.add(m48395j(tag));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m48397l(boolean isNotBlur) {
        get_tips_subtitle().setText(k3d0.m148007c(R$string.f21830t3));
        if (isNotBlur) {
            get_tips_subtitle().setText(R$string.f21454A3);
        }
        CoreBuzzInnerService coreBuzzInnerServiceM143406b = CoreModule.f18273l.m143406b();
        if (coreBuzzInnerServiceM143406b != null ? coreBuzzInnerServiceM143406b.mo36134xk() : false) {
            get_tips_subtitle().append(SignParameters.NEW_LINE + k3d0.m148007c(R$string.f21870y3));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m48398m(@NotNull final User other, boolean textBuzz, boolean isNotBlur) {
        other.getClass();
        bnl0.m105509E0(get_head(), new View.OnClickListener() { // from class: l.law
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoveBuzzMessageHeadView.m48386c(this.f130737a, other, view);
            }
        });
        bnl0.m105524M(get_love_buzz_tips(), textBuzz);
        if (textBuzz) {
            m48397l(isNotBlur);
        }
        m48392g().duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(other.f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.maw
            @Override // p153l.y20
            public final void call(Object obj) {
                LoveBuzzMessageHeadView.m48384a(this.f135605a, (User) obj);
            }
        }, new y20() { // from class: l.naw
            @Override // p153l.y20
            public final void call(Object obj) {
                LoveBuzzMessageHeadView.m48385b((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48391f(this);
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
