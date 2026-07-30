package com.p046p1.mobile.putong.core.p053ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.MemberZoneFilter;
import com.p046p1.mobile.putong.core.p053ui.home.member.likeme.LikeMeFilterView;
import com.p046p1.mobile.putong.core.p053ui.view.LikersFilterItemView;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.C8963a;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.b2s;
import p149l.d30;
import p149l.e30;
import p149l.mkd0;
import p149l.oir;
import p149l.t100;
import p149l.xdl0;
import p149l.ygq0;
import p149l.zgq0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/view/LikersFilterItemView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "onFinishInflate", "Ll/d30;", "interceptAction", BaseSei.f13932Z, "(Ll/d30;)V", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "memberZoneFilter", "E", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;)V", "Lcom/p1/mobile/putong/core/ui/vip/likers/a;", "likersAdapter", "B", "(Lcom/p1/mobile/putong/core/ui/vip/likers/a;)V", "", "count", "setSeeCount", "(Ljava/lang/String;)V", b2s.C_ZONE, "Landroid/view/View;", OMSTemplateModeType.view, ResourceDirection.f38808v, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView;", "a", "Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView;", "get_like_me_filter", "()Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView;", "set_like_me_filter", "(Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView;)V", "_like_me_filter", "Lv/VLinear;", "b", "Lv/VLinear;", "get_shadow", "()Lv/VLinear;", "set_shadow", "(Lv/VLinear;)V", "_shadow", "Lv/VIcon;", "c", "Lv/VIcon;", "get_filter", "()Lv/VIcon;", "set_filter", "(Lv/VIcon;)V", "_filter", Constants.INAPP_DATA_TAG, "get_filter_tip", "set_filter_tip", "_filter_tip", "Lv/VText;", "e", "Lv/VText;", "get_filter_tip_title", "()Lv/VText;", "set_filter_tip_title", "(Lv/VText;)V", "_filter_tip_title", "f", "Ll/d30;", "Lcom/p1/mobile/android/app/Act;", "g", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LikersFilterItemView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LikeMeFilterView _like_me_filter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _shadow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VIcon _filter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _filter_tip;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _filter_tip_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public d30 interceptAction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.LikersFilterItemView$a */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/p1/mobile/putong/core/ui/view/LikersFilterItemView$a", "Lcom/p1/mobile/putong/core/ui/home/member/likeme/LikeMeFilterView$a;", "", "type", "Landroid/view/View;", OMSTemplateModeType.view, "", "a", "(Ljava/lang/String;Landroid/view/View;)Z", "", "b", "(Ljava/lang/String;Landroid/view/View;)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C8929a implements LikeMeFilterView.InterfaceC8372a {
        public C8929a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.home.member.likeme.LikeMeFilterView.InterfaceC8372a
        /* JADX INFO: renamed from: a */
        public boolean mo46092a(String type, View view) {
            type.getClass();
            view.getClass();
            d30 d30Var = LikersFilterItemView.this.interceptAction;
            if (d30Var != null) {
                d30Var.call();
            }
            return LikersFilterItemView.this.interceptAction == null;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.p046p1.mobile.putong.core.p053ui.home.member.likeme.LikeMeFilterView.InterfaceC8372a
        /* JADX INFO: renamed from: b */
        public void mo46093b(String type, View view) {
            type.getClass();
            view.getClass();
            zgq0.Companion companion = zgq0.INSTANCE;
            MemberZoneFilter memberZoneFilterM218677i = companion.m218685c().m218677i();
            switch (type.hashCode()) {
                case -1666779075:
                    if (type.equals("REAL_AVATAR_FILTER")) {
                        memberZoneFilterM218677i.realFace = view.isSelected();
                    }
                    break;
                case -1417978554:
                    if (type.equals("POP_FILTER")) {
                        memberZoneFilterM218677i.popular = view.isSelected();
                    }
                    break;
                case -1293615921:
                    if (type.equals("VERIFIED_FILTER")) {
                        memberZoneFilterM218677i.certification = view.isSelected();
                    }
                    break;
                case 419192548:
                    if (type.equals("ONLINE_FILTER")) {
                        memberZoneFilterM218677i.online = view.isSelected();
                    }
                    break;
                case 1079910712:
                    if (type.equals("NEARBY_FILTER")) {
                        boolean zIsSelected = view.isSelected();
                        memberZoneFilterM218677i.nearby = zIsSelected;
                        if (!zIsSelected) {
                            memberZoneFilterM218677i.radius = companion.m218686d();
                        } else {
                            memberZoneFilterM218677i.radius = companion.m218687e();
                        }
                    }
                    break;
                case 1743721002:
                    if (type.equals("INFO_RICH_FILTER")) {
                        memberZoneFilterM218677i.richMedia = view.isSelected();
                    }
                    break;
            }
            companion.m218685c().m218681o(memberZoneFilterM218677i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikersFilterItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Activity activityM208328E = xdl0.m208328E(this);
        activityM208328E.getClass();
        this.act = (Act) activityM208328E;
    }

    /* JADX INFO: renamed from: p */
    public static void m56124p(LikersFilterItemView likersFilterItemView, View view) {
        d30 d30Var = likersFilterItemView.interceptAction;
        if (d30Var != null) {
            d30Var.call();
            return;
        }
        ygq0.Companion companion = ygq0.INSTANCE;
        Activity activityM208328E = xdl0.m208328E(likersFilterItemView);
        activityM208328E.getClass();
        companion.m214748a((Act) activityM208328E, false);
    }

    /* JADX INFO: renamed from: r */
    private final void m56125r() {
        xdl0.m208344M(get_like_me_filter().get_match_filter(), false);
        xdl0.m208370d0(get_like_me_filter().get_linear(), t100.f167259h);
        xdl0.m208372e0(get_like_me_filter().get_linear(), t100.f167255d);
        xdl0.m208329E0(get_filter(), new View.OnClickListener() { // from class: l.lir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LikersFilterItemView.m56124p(this.f128245a, view);
            }
        });
        get_like_me_filter().m46089b(new C8929a());
        get_like_me_filter().setOnScrollChangeBottom(new e30() { // from class: l.mir
            @Override // p149l.e30
            public final void call(Object obj) {
                LikersFilterItemView.m56127u(this.f134031a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static void m56126s(LikersFilterItemView likersFilterItemView, MemberZoneFilter memberZoneFilter) {
        memberZoneFilter.getClass();
        likersFilterItemView.m56131E(memberZoneFilter);
    }

    /* JADX INFO: renamed from: u */
    public static void m56127u(LikersFilterItemView likersFilterItemView, Boolean bool) {
        xdl0.m208344M(likersFilterItemView.get_shadow(), !bool.booleanValue());
    }

    /* JADX INFO: renamed from: B */
    public final void m56129B(@NotNull C8963a likersAdapter) {
        likersAdapter.getClass();
        likersAdapter.mo67374c(this.act, zgq0.INSTANCE.m218685c().m218676h()).subscribe(mkd0.m154955G(new e30() { // from class: l.nir
            @Override // p149l.e30
            public final void call(Object obj) {
                LikersFilterItemView.m56126s(this.f139124a, (MemberZoneFilter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final void m56130C() {
        xdl0.m208344M(get_filter_tip(), false);
    }

    /* JADX INFO: renamed from: E */
    public final void m56131E(@NotNull MemberZoneFilter memberZoneFilter) {
        memberZoneFilter.getClass();
        get_like_me_filter().m46091d(new Pair("NEARBY_FILTER", Boolean.valueOf(memberZoneFilter.nearby)), new Pair("ONLINE_FILTER", Boolean.valueOf(memberZoneFilter.online)), new Pair("POP_FILTER", Boolean.valueOf(memberZoneFilter.popular)), new Pair("VERIFIED_FILTER", Boolean.valueOf(memberZoneFilter.certification)), new Pair("REAL_AVATAR_FILTER", Boolean.valueOf(memberZoneFilter.realFace)), new Pair("INFO_RICH_FILTER", Boolean.valueOf(memberZoneFilter.richMedia)));
    }

    @NotNull
    public final VIcon get_filter() {
        VIcon vIcon = this._filter;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.m87502r("_filter");
        return null;
    }

    @NotNull
    public final VLinear get_filter_tip() {
        VLinear vLinear = this._filter_tip;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_filter_tip");
        return null;
    }

    @NotNull
    public final VText get_filter_tip_title() {
        VText vText = this._filter_tip_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_filter_tip_title");
        return null;
    }

    @NotNull
    public final LikeMeFilterView get_like_me_filter() {
        LikeMeFilterView likeMeFilterView = this._like_me_filter;
        if (likeMeFilterView != null) {
            return likeMeFilterView;
        }
        Intrinsics.m87502r("_like_me_filter");
        return null;
    }

    @NotNull
    public final VLinear get_shadow() {
        VLinear vLinear = this._shadow;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_shadow");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56132v(this);
        m56125r();
    }

    public final void setSeeCount(@NotNull String count) {
        count.getClass();
        get_filter_tip_title().setText("有" + count + "人正在等待你的回应！");
    }

    public final void set_filter(@NotNull VIcon vIcon) {
        vIcon.getClass();
        this._filter = vIcon;
    }

    public final void set_filter_tip(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._filter_tip = vLinear;
    }

    public final void set_filter_tip_title(@NotNull VText vText) {
        vText.getClass();
        this._filter_tip_title = vText;
    }

    public final void set_like_me_filter(@NotNull LikeMeFilterView likeMeFilterView) {
        likeMeFilterView.getClass();
        this._like_me_filter = likeMeFilterView;
    }

    public final void set_shadow(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._shadow = vLinear;
    }

    /* JADX INFO: renamed from: v */
    public final void m56132v(View view) {
        oir.m164547a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public final void m56133z(@NotNull d30 interceptAction) {
        interceptAction.getClass();
        this.interceptAction = interceptAction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikersFilterItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikersFilterItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ LikersFilterItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
