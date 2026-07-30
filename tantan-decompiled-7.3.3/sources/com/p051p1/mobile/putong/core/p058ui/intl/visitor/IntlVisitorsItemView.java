package com.p051p1.mobile.putong.core.p058ui.intl.visitor;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlVisitor;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsItemView;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Calendar;
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
import p153l.bnl0;
import p153l.cpp;
import p153l.joa;
import p153l.kcg0;
import p153l.psd0;
import p153l.rop;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0014¢\u0006\u0004\b&\u0010\"J-\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)R\"\u00100\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010X\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006l"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/IntlVisitor;", "visitorItem", "Lcom/p1/mobile/putong/data/User;", "user", "", "hasPrivilege", "isFirstItem", "f", "(Lcom/p1/mobile/putong/core/data/IntlVisitor;Lcom/p1/mobile/putong/data/User;ZZ)V", "", "date", "", "time", "", "g", "(DJ)Ljava/lang/String;", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", "onDetachedFromWindow", "userId", "h", "(Lcom/p1/mobile/putong/core/data/IntlVisitor;Ljava/lang/String;ZZ)V", "a", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsItemView;)V", "_root", "Lv/VRelative;", "b", "Lv/VRelative;", "get_comment_frame", "()Lv/VRelative;", "set_comment_frame", "(Lv/VRelative;)V", "_comment_frame", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "get_profile", "()Lv/VDraweeView;", "set_profile", "(Lv/VDraweeView;)V", "_profile", "Lv/VLinear;", "Lv/VLinear;", "get_info", "()Lv/VLinear;", "set_info", "(Lv/VLinear;)V", "_info", "get_content_container", "set_content_container", "_content_container", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_title_cover", "()Landroid/widget/ImageView;", "set_title_cover", "(Landroid/widget/ImageView;)V", "_title_cover", "Lv/VText;", "Lv/VText;", "get_visitor_detail", "()Lv/VText;", "set_visitor_detail", "(Lv/VText;)V", "_visitor_detail", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "get_button", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "set_button", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;)V", "_button", "Ll/kcg0;", "j", "Ll/kcg0;", "subscribe", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlVisitorsItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlVisitorsItemView _root;

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
    @Nullable
    public kcg0 subscribe;

    public IntlVisitorsItemView(@Nullable Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m47372a(IntlVisitorsItemView intlVisitorsItemView, IntlVisitor intlVisitor, boolean z, boolean z2, User user) {
        user.getClass();
        intlVisitorsItemView.m47377f(intlVisitor, user, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m47373b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m47374c(IntlVisitorsItemView intlVisitorsItemView, User user, View view) {
        rop ropVar = rop.INSTANCE;
        ropVar.m182434i("e_intl_visitors_list_check_btn");
        Act actM47376e = intlVisitorsItemView.m47376e();
        if (actM47376e == null || actM47376e.lifecycle_() != C4470c.f16267i) {
            return;
        }
        if (!(CoreModule.f18264c.f20414p0.m219062g3() && joa.m146392i4()) && (CoreModule.f18264c.f20414p0.m219062g3() || !joa.m146386f4())) {
            actM47376e.startActivityForResult(CoreModule.m30933P().m143405a().mo34531jr(actM47376e, user.f56859id, "from_intl_visitor", true), 18);
        } else {
            rop.m182428p(ropVar, actM47376e, "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m47375d(View view) {
        cpp.m111826a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Act m47376e() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final void m47377f(IntlVisitor visitorItem, final User user, boolean hasPrivilege, boolean isFirstItem) {
        bnl0.m105522L(this, new View.OnClickListener() { // from class: l.bpp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlVisitorsItemView.m47374c(this.f77796a, user, view);
            }
        });
        if (hasPrivilege || isFirstItem) {
            uqb0.f180374G.m127115L0(get_profile(), user.m61308fp().profileSmall().formatted());
        } else {
            uqb0.f180374G.m127120O(get_profile(), user.m61308fp().profileSmall().formatted(), 2, 20);
        }
        if (hasPrivilege) {
            get_title().setText(user.name);
            bnl0.m105524M(get_title_cover(), false);
        } else {
            bnl0.m105524M(get_title_cover(), true);
            if (visitorItem.cover_id <= 0) {
                rop ropVar = rop.INSTANCE;
                visitorItem.cover_id = ropVar.m182433h()[Random.INSTANCE.nextInt(ropVar.m182433h().length)].intValue();
            }
            get_title_cover().setImageResource(visitorItem.cover_id);
        }
        get_visitor_detail().setText(m47378g(visitorItem.accessTime, uqb0.f180376H.guessedCurrentServerTime()));
        get_button().setText(getContext().getString(R$string.f19028Yb));
        if (CoreModule.f18264c.f20414p0.m219067l3()) {
            get_button().setBackgroundColor(Color.parseColor("#9379AF"));
            get_button().setTextColor(Color.parseColor("#FFFFFF"));
        } else if (CoreModule.f18264c.f20414p0.m219064i3()) {
            get_button().setBackgroundColor(Color.parseColor("#FFDEA2"));
            get_button().setTextColor(Color.parseColor(Constants.BLACK));
        } else {
            get_button().setBackgroundColor(Color.parseColor("#FE7E1D"));
            get_button().setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m47378g(double date, long time) {
        int i;
        Application application = App.f16088e;
        application.getClass();
        Calendar calendar = Calendar.getInstance();
        long j = (long) date;
        calendar.setTimeInMillis(j);
        if (calendar.get(1) <= 1970) {
            String string = application.getString(R$string.f18998Xb, application.getString(R$string.f18481G9, "1"));
            string.getClass();
            return string;
        }
        long j2 = (time - j) / 1000;
        if (j2 > 86400) {
            j2 /= 86400;
            i = R$string.f18388D9;
        } else if (j2 > 3600) {
            j2 /= 3600;
            i = R$string.f18419E9;
        } else if (j2 > 60) {
            j2 /= 60;
            i = R$string.f18450F9;
        } else {
            if (j2 < 1) {
                j2 = 1;
            }
            i = R$string.f18481G9;
        }
        String string2 = application.getString(R$string.f18998Xb, application.getString(com.p051p1.mobile.putong.common.R$string.f18232v2, Long.valueOf(j2), application.getString(i)));
        string2.getClass();
        return string2;
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
    public final IntlVisitorsItemView get_root() {
        IntlVisitorsItemView intlVisitorsItemView = this._root;
        if (intlVisitorsItemView != null) {
            return intlVisitorsItemView;
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

    /* JADX INFO: renamed from: h */
    public final void m47379h(@NotNull final IntlVisitor visitorItem, @NotNull String userId, final boolean hasPrivilege, final boolean isFirstItem) {
        C22421c c22421cDuringCreated;
        visitorItem.getClass();
        userId.getClass();
        Act actM47376e = m47376e();
        this.subscribe = (actM47376e == null || (c22421cDuringCreated = actM47376e.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(userId))) == null) ? null : c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.zop
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlVisitorsItemView.m47372a(this.f205366a, visitorItem, hasPrivilege, isFirstItem, (User) obj);
            }
        }, new y20() { // from class: l.app
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlVisitorsItemView.m47373b((Throwable) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.subscribe);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47375d(this);
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

    public final void set_root(@NotNull IntlVisitorsItemView intlVisitorsItemView) {
        intlVisitorsItemView.getClass();
        this._root = intlVisitorsItemView;
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

    public IntlVisitorsItemView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlVisitorsItemView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
