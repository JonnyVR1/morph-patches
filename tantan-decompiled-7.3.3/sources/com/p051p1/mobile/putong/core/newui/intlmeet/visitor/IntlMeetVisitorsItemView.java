package com.p051p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsItemView;
import com.p051p1.mobile.putong.core.util.view.RoundTextView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.amo;
import p153l.bnl0;
import p153l.fwl;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.psd0;
import p153l.sop;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010\u001bJ-\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010D\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020 0m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006q"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "visitorItem", "Lcom/p1/mobile/putong/data/User;", "user", "", "isFirstItem", "canVisitor", "f", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Lcom/p1/mobile/putong/data/User;ZZ)V", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", "onDetachedFromWindow", "", "userId", "g", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Ljava/lang/String;ZZ)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;)V", "_root", "Lv/VRelative;", "b", "Lv/VRelative;", "get_comment_frame", "()Lv/VRelative;", "set_comment_frame", "(Lv/VRelative;)V", "_comment_frame", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "get_profile", "()Lv/VDraweeView;", "set_profile", "(Lv/VDraweeView;)V", "_profile", "Lv/VLinear;", "Lv/VLinear;", "get_info", "()Lv/VLinear;", "set_info", "(Lv/VLinear;)V", "_info", "get_content_container", "set_content_container", "_content_container", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_title_cover", "()Landroid/widget/ImageView;", "set_title_cover", "(Landroid/widget/ImageView;)V", "_title_cover", "Lv/VText;", "h", "Lv/VText;", "get_visitor_detail", "()Lv/VText;", "set_visitor_detail", "(Lv/VText;)V", "_visitor_detail", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "get_button", "()Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "set_button", "(Lcom/p1/mobile/putong/core/util/view/RoundTextView;)V", "_button", "j", "I", "REQUEST_PROFILE", "k", "Ljava/lang/String;", "FROM_INTL_VISITOR", "Ll/kcg0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/kcg0;", "subscribe", "Ljava/util/HashSet;", "m", "Ljava/util/HashSet;", "mapMV", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlMeetVisitorsItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlMeetVisitorsItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRelative _comment_frame;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _profile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _content_container;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageView _title_cover;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _visitor_detail;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public RoundTextView _button;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int REQUEST_PROFILE;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String FROM_INTL_VISITOR;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscribe;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public HashSet<String> mapMV;

    public IntlMeetVisitorsItemView(@Nullable Context context) {
        super(context);
        this.REQUEST_PROFILE = 18;
        this.FROM_INTL_VISITOR = "from_intl_visitor";
        this.mapMV = new HashSet<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m40514a(IntlMeetVisitorsItemView intlMeetVisitorsItemView, IntlBaseVisitorInfo intlBaseVisitorInfo, boolean z, boolean z2, User user) {
        user.getClass();
        intlMeetVisitorsItemView.m40519f(intlBaseVisitorInfo, user, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m40515b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m40516c(User user, IntlMeetVisitorsItemView intlMeetVisitorsItemView, boolean z, View view) {
        i4g0.m138523u("e_intl_meet_visitors", "p_intl_meet_view", jyb.m147494Y("other_user_id", user.f56859id));
        Act actM40518e = intlMeetVisitorsItemView.m40518e();
        if (actM40518e == null || actM40518e.lifecycle_() != C4470c.f16267i) {
            return;
        }
        fwl.m127804j(actM40518e.pageId());
        if (z) {
            actM40518e.startActivityForResult(CoreModule.m30933P().m143405a().mo34531jr(actM40518e, user.f56859id, intlMeetVisitorsItemView.FROM_INTL_VISITOR, true), intlMeetVisitorsItemView.REQUEST_PROFILE);
            return;
        }
        if (CoreModule.f18264c.f20414p0.m219064i3()) {
            sop.INSTANCE.m187270h(actM40518e, "p_intl_meet_view,e_intl_meet_visitors,click", Privilege.intl_visitor);
        } else if (CoreModule.f18264c.f20414p0.m219065j3()) {
            sop.INSTANCE.m187272p(actM40518e, "p_intl_meet_view,e_intl_meet_visitors,click", Privilege.intl_visitor);
        } else {
            sop.m187264l(sop.INSTANCE, actM40518e, "p_intl_meet_view,e_intl_meet_visitors,click", Privilege.intl_visitor, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m40517d(View view) {
        amo.m98852a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Act m40518e() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final void m40519f(IntlBaseVisitorInfo visitorItem, final User user, boolean isFirstItem, final boolean canVisitor) {
        if (!this.mapMV.contains(user.f56859id)) {
            this.mapMV.add(user.f56859id);
            i4g0.m138492A("e_intl_meet_visitors", "p_intl_meet_view", jyb.m147494Y("is_privileged", Boolean.valueOf(canVisitor)));
        }
        bnl0.m105522L(this, new View.OnClickListener() { // from class: l.zlo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMeetVisitorsItemView.m40516c(user, this, canVisitor, view);
            }
        });
        if (canVisitor || isFirstItem) {
            uqb0.f180374G.m127115L0(get_profile(), user.m61308fp().profileSmall().formatted());
        } else {
            uqb0.f180374G.m127120O(get_profile(), user.m61308fp().profileSmall().formatted(), 2, 20);
        }
        if (canVisitor) {
            get_title().setText(user.name);
            bnl0.m105524M(get_title_cover(), false);
        } else {
            bnl0.m105524M(get_title_cover(), true);
            ImageView imageView = get_title_cover();
            sop sopVar = sop.INSTANCE;
            imageView.setImageResource(sopVar.m187268f()[Random.INSTANCE.nextInt(sopVar.m187268f().length)].intValue());
        }
        get_visitor_detail().setText(visitorItem.describe);
        get_button().setText(getContext().getString(R$string.f21382e0));
        if (CoreModule.f18264c.f20414p0.m219064i3()) {
            get_button().setBackgroundColor(Color.parseColor("#FFDEA2"));
            get_button().setTextColor(Color.parseColor(Constants.BLACK));
        } else if (CoreModule.f18264c.f20414p0.m219065j3()) {
            get_button().setBackgroundColor(Color.parseColor("#FE7E1D"));
            get_button().setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            get_button().setBackgroundColor(Color.parseColor("#9379AF"));
            get_button().setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m40520g(@NotNull final IntlBaseVisitorInfo visitorItem, @NotNull String userId, final boolean isFirstItem, final boolean canVisitor) {
        C22421c c22421cDuringCreated;
        visitorItem.getClass();
        userId.getClass();
        Act actM40518e = m40518e();
        this.subscribe = (actM40518e == null || (c22421cDuringCreated = actM40518e.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(userId))) == null) ? null : c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.xlo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlMeetVisitorsItemView.m40514a(this.f195004a, visitorItem, isFirstItem, canVisitor, (User) obj);
            }
        }, new y20() { // from class: l.ylo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlMeetVisitorsItemView.m40515b((Throwable) obj);
            }
        }));
    }

    @NotNull
    public final RoundTextView get_button() {
        RoundTextView roundTextView = this._button;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.m88391r("_button");
        return null;
    }

    @NotNull
    public final VRelative get_comment_frame() {
        VRelative vRelative = this._comment_frame;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_comment_frame");
        return null;
    }

    @NotNull
    public final VLinear get_content_container() {
        VLinear vLinear = this._content_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content_container");
        return null;
    }

    @NotNull
    public final VLinear get_info() {
        VLinear vLinear = this._info;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_info");
        return null;
    }

    @NotNull
    public final VDraweeView get_profile() {
        VDraweeView vDraweeView = this._profile;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_profile");
        return null;
    }

    @NotNull
    public final IntlMeetVisitorsItemView get_root() {
        IntlMeetVisitorsItemView intlMeetVisitorsItemView = this._root;
        if (intlMeetVisitorsItemView != null) {
            return intlMeetVisitorsItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @NotNull
    public final ImageView get_title_cover() {
        ImageView imageView = this._title_cover;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_title_cover");
        return null;
    }

    @NotNull
    public final VText get_visitor_detail() {
        VText vText = this._visitor_detail;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_visitor_detail");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.subscribe);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40517d(this);
    }

    public final void set_button(@NotNull RoundTextView roundTextView) {
        roundTextView.getClass();
        this._button = roundTextView;
    }

    public final void set_comment_frame(@NotNull VRelative vRelative) {
        vRelative.getClass();
        this._comment_frame = vRelative;
    }

    public final void set_content_container(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._content_container = vLinear;
    }

    public final void set_info(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._info = vLinear;
    }

    public final void set_profile(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._profile = vDraweeView;
    }

    public final void set_root(@NotNull IntlMeetVisitorsItemView intlMeetVisitorsItemView) {
        intlMeetVisitorsItemView.getClass();
        this._root = intlMeetVisitorsItemView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    public final void set_title_cover(@NotNull ImageView imageView) {
        imageView.getClass();
        this._title_cover = imageView;
    }

    public final void set_visitor_detail(@NotNull VText vText) {
        vText.getClass();
        this._visitor_detail = vText;
    }

    public IntlMeetVisitorsItemView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.REQUEST_PROFILE = 18;
        this.FROM_INTL_VISITOR = "from_intl_visitor";
        this.mapMV = new HashSet<>();
    }

    public IntlMeetVisitorsItemView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.REQUEST_PROFILE = 18;
        this.FROM_INTL_VISITOR = "from_intl_visitor";
        this.mapMV = new HashSet<>();
    }
}
