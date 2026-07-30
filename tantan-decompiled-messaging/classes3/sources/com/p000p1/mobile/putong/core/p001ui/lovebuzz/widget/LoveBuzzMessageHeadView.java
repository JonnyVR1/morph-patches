package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.view.ImFlowTagsView;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.hvc0;
import l.l6c0;
import l.mkd0;
import l.qib0;
import l.rw6;
import l.s8w;
import l.vwb;
import l.xdl0;
import l.y4c0;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p003l.e30;
import p003l.m250;
import p003l.w9j;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010^\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010G\u001a\u0004\b\\\u0010I\"\u0004\b]\u0010KR\"\u0010a\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010?\u001a\u0004\b_\u0010A\"\u0004\b`\u0010CR\"\u0010d\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010C¨\u0006e"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMessageHeadView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "f", "(Landroid/view/View;)V", "", "isNotBlur", "l", "(Z)V", "", "Lcom/p1/mobile/putong/data/Tag;", "userTagsData", "k", "(Ljava/util/List;)Ljava/util/List;", "tag", "j", "(Lcom/p1/mobile/putong/data/Tag;)Landroid/view/View;", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/data/User;", "other", "textBuzz", MessageElement.XPATH_PREFIX, "(Lcom/p1/mobile/putong/data/User;ZZ)V", "onlineMatchPercent", XHTMLElement.XPATH_PREFIX, "(Lcom/p1/mobile/putong/data/User;IZ)V", "Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;", "g", "()Lcom/p1/mobile/putong/core/ui/messages/MessagesAct;", "ctx", "i", "(Landroid/content/Context;)Z", "Lv/VLinear;", "a", "Lv/VLinear;", "get_content", "()Lv/VLinear;", "set_content", "(Lv/VLinear;)V", "_content", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "get_head", "()Lv/VDraweeView;", "set_head", "(Lv/VDraweeView;)V", "_head", "Lv/VText;", "c", "Lv/VText;", "get_user_desc1", "()Lv/VText;", "set_user_desc1", "(Lv/VText;)V", "_user_desc1", "Lv/VImage;", "d", "Lv/VImage;", "get_peer_region", "()Lv/VImage;", "set_peer_region", "(Lv/VImage;)V", "_peer_region", "Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "e", "Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "get_tags", "()Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;", "set_tags", "(Lcom/p1/mobile/putong/core/ui/view/ImFlowTagsView;)V", "_tags", "Lv/VRelative;", "Lv/VRelative;", "get_love_buzz_tips", "()Lv/VRelative;", "set_love_buzz_tips", "(Lv/VRelative;)V", "_love_buzz_tips", "get_img_tips", "set_img_tips", "_img_tips", "get_tv_tips", "set_tv_tips", "_tv_tips", "get_tips_subtitle", "set_tips_subtitle", "_tips_subtitle", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m230a(LoveBuzzMessageHeadView loveBuzzMessageHeadView, User user) {
        user.getClass();
        CoreModule.P().b().a8(user, loveBuzzMessageHeadView.get_peer_region());
        CoreModule.P().b().nt(user, loveBuzzMessageHeadView.get_user_desc1());
        List<? extends Tag> listN = vwb.n(user.profile.tags, new w9j() { // from class: l.q8w
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return LoveBuzzMessageHeadView.m235n((Tag) obj);
            }
        });
        listN.getClass();
        ArrayList arrayListN = vwb.n(user.profile.tags, new w9j() { // from class: l.r8w
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return LoveBuzzMessageHeadView.m236o((Tag) obj);
            }
        });
        arrayListN.getClass();
        if (!vwb.J(listN) && listN.size() < 10 && !vwb.J(arrayListN)) {
            int size = 10 - listN.size();
            if (arrayListN.size() < size) {
                listN.addAll(arrayListN);
            } else {
                listN.addAll(arrayListN.subList(0, size));
            }
        }
        if (vwb.J(listN)) {
            xdl0.M(loveBuzzMessageHeadView.get_tags(), false);
            return;
        }
        xdl0.M(loveBuzzMessageHeadView.get_tags(), true);
        loveBuzzMessageHeadView.get_tags().c();
        loveBuzzMessageHeadView.get_tags().setTags(loveBuzzMessageHeadView.m242k(listN));
    }

    /* JADX INFO: renamed from: b */
    public static void m231b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m232c(LoveBuzzMessageHeadView loveBuzzMessageHeadView, User user, View view) {
        Object objE = xdl0.E(loveBuzzMessageHeadView);
        objE.getClass();
        ((MessagesAct) objE).mo2066l().m4321w6("messages_thumbnail_left", ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: n */
    public static final Boolean m235n(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(Intrinsics.d("personality", tag.category));
    }

    /* JADX INFO: renamed from: o */
    public static final Boolean m236o(Tag tag) {
        tag.getClass();
        return Boolean.valueOf(!Intrinsics.d("personality", tag.category));
    }

    /* JADX INFO: renamed from: f */
    public final void m237f(View view) {
        s8w.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final MessagesAct m238g() {
        Object context = getContext();
        context.getClass();
        return (MessagesAct) context;
    }

    @NotNull
    public final VLinear get_content() {
        VLinear vLinear = this._content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    public final VDraweeView get_head() {
        VDraweeView vDraweeView = this._head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_head");
        return null;
    }

    @NotNull
    public final VImage get_img_tips() {
        VImage vImage = this._img_tips;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_img_tips");
        return null;
    }

    @NotNull
    public final VRelative get_love_buzz_tips() {
        VRelative vRelative = this._love_buzz_tips;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_love_buzz_tips");
        return null;
    }

    @NotNull
    public final VImage get_peer_region() {
        VImage vImage = this._peer_region;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_peer_region");
        return null;
    }

    @NotNull
    public final ImFlowTagsView get_tags() {
        ImFlowTagsView imFlowTagsView = this._tags;
        if (imFlowTagsView != null) {
            return imFlowTagsView;
        }
        Intrinsics.r("_tags");
        return null;
    }

    @NotNull
    public final VText get_tips_subtitle() {
        VText vText = this._tips_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tips_subtitle");
        return null;
    }

    @NotNull
    public final VText get_tv_tips() {
        VText vText = this._tv_tips;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_tips");
        return null;
    }

    @NotNull
    public final VText get_user_desc1() {
        VText vText = this._user_desc1;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_user_desc1");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m239h(@NotNull User other, int onlineMatchPercent, boolean isNotBlur) {
        other.getClass();
        if (NullChecker.a(other) && other.inactivated) {
            qib0.G.Y0(get_head(), CoreModule.P().i().f3());
            return;
        }
        CoreBuzzInnerService coreBuzzInnerServiceB = CoreModule.P().b();
        VDraweeView vDraweeView = get_head();
        Picture.ImageUri imageUriProfileSmall = rw6.a(other).profileSmall();
        if (isNotBlur) {
            onlineMatchPercent = 100;
        }
        coreBuzzInnerServiceB.xp(vDraweeView, imageUriProfileSmall, onlineMatchPercent);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m240i(@Nullable Context ctx) {
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
    public final View m241j(Tag tag) {
        View viewInflate = m238g().inflater().inflate(l6c0.S0, (ViewGroup) null);
        viewInflate.getClass();
        AppCompatTextView appCompatTextViewFindViewById = viewInflate.findViewById(y4c0.E);
        appCompatTextViewFindViewById.getClass();
        ((VText) appCompatTextViewFindViewById).setText(tag.value);
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public final List<View> m242k(List<? extends Tag> userTagsData) {
        if (!NullChecker.a(userTagsData) || !m240i(m238g())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Tag tag : userTagsData) {
            if (NullChecker.a(tag)) {
                arrayList.add(m241j(tag));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m243l(boolean isNotBlur) {
        get_tips_subtitle().setText(hvc0.c(R.string.t3));
        if (isNotBlur) {
            get_tips_subtitle().setText(R.string.A3);
        }
        CoreBuzzInnerService coreBuzzInnerServiceB = CoreModule.l.b();
        if (coreBuzzInnerServiceB != null ? coreBuzzInnerServiceB.xk() : false) {
            get_tips_subtitle().append("\n" + hvc0.c(R.string.y3));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m244m(@NotNull final User other, boolean textBuzz, boolean isNotBlur) {
        other.getClass();
        xdl0.E0(get_head(), new View.OnClickListener() { // from class: l.n8w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoveBuzzMessageHeadView.m232c(this.f5844a, other, view);
            }
        });
        xdl0.M(get_love_buzz_tips(), textBuzz);
        if (textBuzz) {
            m243l(isNotBlur);
        }
        m238g().duringCreated(CoreModule.c.e0.Ka(((DbObject) other).id)).subscribe((m250) mkd0.H(new e30() { // from class: l.o8w
            @Override // p003l.e30
            public final void call(Object obj) {
                LoveBuzzMessageHeadView.m230a(this.f6061a, (User) obj);
            }
        }, new e30() { // from class: l.p8w
            @Override // p003l.e30
            public final void call(Object obj) {
                LoveBuzzMessageHeadView.m231b((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m237f(this);
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
