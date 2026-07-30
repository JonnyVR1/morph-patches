package com.p000p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.util.view.RoundTextView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import l.ako;
import l.c4g0;
import l.e30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.rtl;
import p009l.smp;
import v.VDraweeView;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010\u001bJ-\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010D\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020 0m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006q"}, d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "d", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "visitorItem", "Lcom/p1/mobile/putong/data/User;", "user", "", "isFirstItem", "canVisitor", "f", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Lcom/p1/mobile/putong/data/User;ZZ)V", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", "onDetachedFromWindow", "", "userId", "g", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Ljava/lang/String;ZZ)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsItemView;)V", "_root", "Lv/VRelative;", "b", "Lv/VRelative;", "get_comment_frame", "()Lv/VRelative;", "set_comment_frame", "(Lv/VRelative;)V", "_comment_frame", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "get_profile", "()Lv/VDraweeView;", "set_profile", "(Lv/VDraweeView;)V", "_profile", "Lv/VLinear;", "Lv/VLinear;", "get_info", "()Lv/VLinear;", "set_info", "(Lv/VLinear;)V", "_info", "get_content_container", "set_content_container", "_content_container", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_title_cover", "()Landroid/widget/ImageView;", "set_title_cover", "(Landroid/widget/ImageView;)V", "_title_cover", "Lv/VText;", "h", "Lv/VText;", "get_visitor_detail", "()Lv/VText;", "set_visitor_detail", "(Lv/VText;)V", "_visitor_detail", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "i", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "get_button", "()Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "set_button", "(Lcom/p1/mobile/putong/core/util/view/RoundTextView;)V", "_button", "j", "I", "REQUEST_PROFILE", "k", "Ljava/lang/String;", "FROM_INTL_VISITOR", "Ll/c4g0;", "l", "Ll/c4g0;", "subscribe", "Ljava/util/HashSet;", "m", "Ljava/util/HashSet;", "mapMV", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public c4g0 subscribe;

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
    public static void m3573a(IntlMeetVisitorsItemView intlMeetVisitorsItemView, IntlBaseVisitorInfo intlBaseVisitorInfo, boolean z, boolean z2, User user) {
        user.getClass();
        intlMeetVisitorsItemView.m3578f(intlBaseVisitorInfo, user, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m3574b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m3575c(User user, IntlMeetVisitorsItemView intlMeetVisitorsItemView, boolean z, View view) {
        zvf0.u("e_intl_meet_visitors", "p_intl_meet_view", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
        Act actM3577e = intlMeetVisitorsItemView.m3577e();
        if (actM3577e == null || actM3577e.lifecycle_() != c.i) {
            return;
        }
        rtl.m21803j(actM3577e.pageId());
        if (z) {
            actM3577e.startActivityForResult(CoreModule.P().a().jr(actM3577e, ((DbObject) user).id, intlMeetVisitorsItemView.FROM_INTL_VISITOR, true), intlMeetVisitorsItemView.REQUEST_PROFILE);
            return;
        }
        if (CoreModule.c.p0.i3()) {
            smp.INSTANCE.m22299h(actM3577e, "p_intl_meet_view,e_intl_meet_visitors,click", Privilege.intl_visitor);
        } else if (CoreModule.c.p0.j3()) {
            smp.INSTANCE.m22301p(actM3577e, "p_intl_meet_view,e_intl_meet_visitors,click", Privilege.intl_visitor);
        } else {
            smp.m22293l(smp.INSTANCE, actM3577e, "p_intl_meet_view,e_intl_meet_visitors,click", Privilege.intl_visitor, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3576d(View view) {
        ako.a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Act m3577e() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final void m3578f(IntlBaseVisitorInfo visitorItem, final User user, boolean isFirstItem, final boolean canVisitor) {
        if (!this.mapMV.contains(((DbObject) user).id)) {
            this.mapMV.add(((DbObject) user).id);
            zvf0.A("e_intl_meet_visitors", "p_intl_meet_view", new j760[]{vwb.Y("is_privileged", Boolean.valueOf(canVisitor))});
        }
        xdl0.L(this, new View.OnClickListener() { // from class: l.zjo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMeetVisitorsItemView.m3575c(user, this, canVisitor, view);
            }
        });
        if (canVisitor || isFirstItem) {
            qib0.G.L0(get_profile(), user.fp().profileSmall().formatted());
        } else {
            qib0.G.O(get_profile(), user.fp().profileSmall().formatted(), 2, 20);
        }
        if (canVisitor) {
            get_title().setText(user.name);
            xdl0.M(get_title_cover(), false);
        } else {
            xdl0.M(get_title_cover(), true);
            ImageView imageView = get_title_cover();
            smp smpVar = smp.INSTANCE;
            imageView.setImageResource(smpVar.m22297f()[Random.Default.nextInt(smpVar.m22297f().length)].intValue());
        }
        get_visitor_detail().setText(visitorItem.describe);
        get_button().setText(getContext().getString(R.string.e0));
        if (CoreModule.c.p0.i3()) {
            get_button().setBackgroundColor(Color.parseColor("#FFDEA2"));
            get_button().setTextColor(Color.parseColor("#000000"));
        } else if (CoreModule.c.p0.j3()) {
            get_button().setBackgroundColor(Color.parseColor("#FE7E1D"));
            get_button().setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            get_button().setBackgroundColor(Color.parseColor("#9379AF"));
            get_button().setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3579g(@NotNull final IntlBaseVisitorInfo visitorItem, @NotNull String userId, final boolean isFirstItem, final boolean canVisitor) {
        rx.c cVarDuringCreated;
        visitorItem.getClass();
        userId.getClass();
        Act actM3577e = m3577e();
        this.subscribe = (actM3577e == null || (cVarDuringCreated = actM3577e.duringCreated(CoreModule.c.e0.Ka(userId))) == null) ? null : cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.xjo
            public final void call(Object obj) {
                IntlMeetVisitorsItemView.m3573a(this.f22628a, visitorItem, isFirstItem, canVisitor, (User) obj);
            }
        }, new e30() { // from class: l.yjo
            public final void call(Object obj) {
                IntlMeetVisitorsItemView.m3574b((Throwable) obj);
            }
        }));
    }

    @NotNull
    public final RoundTextView get_button() {
        RoundTextView roundTextView = this._button;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.r("_button");
        return null;
    }

    @NotNull
    public final VRelative get_comment_frame() {
        VRelative vRelative = this._comment_frame;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_comment_frame");
        return null;
    }

    @NotNull
    public final VLinear get_content_container() {
        VLinear vLinear = this._content_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_content_container");
        return null;
    }

    @NotNull
    public final VLinear get_info() {
        VLinear vLinear = this._info;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_info");
        return null;
    }

    @NotNull
    public final VDraweeView get_profile() {
        VDraweeView vDraweeView = this._profile;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_profile");
        return null;
    }

    @NotNull
    public final IntlMeetVisitorsItemView get_root() {
        IntlMeetVisitorsItemView intlMeetVisitorsItemView = this._root;
        if (intlMeetVisitorsItemView != null) {
            return intlMeetVisitorsItemView;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    @NotNull
    public final ImageView get_title_cover() {
        ImageView imageView = this._title_cover;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_title_cover");
        return null;
    }

    @NotNull
    public final VText get_visitor_detail() {
        VText vText = this._visitor_detail;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_visitor_detail");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.subscribe);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3576d(this);
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
