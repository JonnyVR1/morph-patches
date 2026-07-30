package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.VisitorInfo;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p051p1.mobile.putong.core.util.view.RoundTextView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\nJ\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\nJ\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b)\u0010 J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\nJ\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J-\u00106\u001a\u00020\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u000101¢\u0006\u0004\b6\u00107J%\u0010;\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0011¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020?H\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0011¢\u0006\u0004\bG\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010L\u001a\u0004\bc\u0010N\"\u0004\bd\u0010PR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010T\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u00109\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001f\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010\u0013\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u00108\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b$\u0010\u0090\u0001\u001a\u0005\b\u0094\u0001\u0010\u0013\"\u0006\b\u0095\u0001\u0010\u0093\u0001R'\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0090\u0001\u001a\u0005\b\u0097\u0001\u0010\u0013\"\u0006\b\u0098\u0001\u0010\u0093\u0001R\u001b\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u009a\u0001R'\u0010\u009c\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0090\u0001\u001a\u0005\b\u009c\u0001\u0010\u0013\"\u0006\b\u009d\u0001\u0010\u0093\u0001¨\u0006\u009e\u0001"}, m88121d2 = {"Ll/tlo;", "Ll/iam;", "Ll/ilo;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;)V", "", "F", "()V", "B", "K", "J", "N", "L", BloodType.f39576O, "", "I", "()Z", "", "from", "Lkotlin/Function0;", "onDismiss", "M", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "m", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "p", "E", "n", "G", "presenter", "q", "(Ll/ilo;)V", "inflateView", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/core/data/VisitorInfo;", "visitorItems", "Lcom/p1/mobile/putong/core/data/InstantMatchUserInfo;", "instantMatchItems", "H", "(Ljava/util/List;Ljava/util/List;)V", "hasSee", "hasSvip", "hasUltra", c4s.C_ZONE, "(ZZZ)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", BLiveStormDanmakuGiftResourceType.f45294s, "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", BaseSei.f14625Y, "()Landroid/widget/FrameLayout;", "set_intl_meet_visitor_discount_banner_container", "(Landroid/widget/FrameLayout;)V", "_intl_meet_visitor_discount_banner_container", "Lv/VLinear;", "c", "Lv/VLinear;", "A", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VRecyclerView;", Constants.INAPP_DATA_TAG, "Lv/VRecyclerView;", BaseSei.f14626Z, "()Lv/VRecyclerView;", "set_visitors", "(Lv/VRecyclerView;)V", "_visitors", "e", ResourceDirection.f39656v, "set_bottom_bg", "_bottom_bg", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "f", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "w", "()Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "set_bottom_bg_get_privilege", "(Lcom/p1/mobile/putong/core/util/view/RoundTextView;)V", "_bottom_bg_get_privilege", "g", BaseSei.f14624X, "set_empty", "_empty", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "get_empty_empty_img", "()Landroid/widget/ImageView;", "set_empty_empty_img", "(Landroid/widget/ImageView;)V", "_empty_empty_img", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_empty_empty_tv", "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "Ll/fko;", "j", "Ll/fko;", "u", "()Ll/fko;", "setAdapter", "(Ll/fko;)V", "adapter", "k", "Ll/ilo;", "Ll/kko;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/kko;", "intlMeetVisitorAffiliateDiscountBannerHost", "Z", "getHasSvip", "setHasSvip", "(Z)V", "getHasSee", "setHasSee", "o", "getHasUltra", "setHasUltra", "Ll/kcg0;", "Ll/kcg0;", "loadSub", "isShow", "setShow", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class tlo extends RecyclerView.AbstractC0584t implements iam<ilo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetVisitorFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _intl_meet_visitor_discount_banner_container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _visitors_ll;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VRecyclerView _visitors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public FrameLayout _bottom_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public RoundTextView _bottom_bg_get_privilege;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ImageView _empty_empty_img;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _empty_empty_tv;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public fko adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ilo presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public kko intlMeetVisitorAffiliateDiscountBannerHost;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean hasSvip;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean hasSee;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean hasUltra;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public kcg0 loadSub;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean isShow;

    public tlo(@NotNull IntlMeetVisitorFrag intlMeetVisitorFrag) {
        intlMeetVisitorFrag.getClass();
        this.frag = intlMeetVisitorFrag;
        this.hasSvip = joa.m146361M3();
        this.hasSee = !joa.m146392i4();
        this.hasUltra = joa.m146354D3();
    }

    /* JADX INFO: renamed from: F */
    private final void m191658F() {
        kko kkoVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kkoVar != null) {
            kkoVar.m150312m();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m191659J() {
        if (CoreModule.f18264c.f20414p0.m219064i3()) {
            m191678L();
        } else if (CoreModule.f18264c.f20414p0.m219065j3()) {
            m191680N();
        } else {
            m191681O();
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m191660K() {
        i4g0.m138527y("e_intl_meet_null_toast", "p_intl_meet_view", MapsKt.mapOf(new Pair("null_view", "visitor_view")));
        m191691x().setVisibility(0);
        m191671A().setVisibility(8);
        bnl0.m105524M(m191690w(), false);
        bnl0.m105524M(m191689v(), false);
    }

    /* JADX INFO: renamed from: a */
    public static void m191661a(tlo tloVar, View view) {
        CoreModule.m30933P().m143405a().mo34495eh(tloVar.act());
    }

    /* JADX INFO: renamed from: b */
    public static void m191662b(tlo tloVar, View view) {
        if (NullChecker.m82486a(view)) {
            IntlBaseVisitorInfo intlBaseVisitorInfoNew_ = IntlBaseVisitorInfo.new_();
            intlBaseVisitorInfoNew_.userID = "fake_visitor_list_admob_id";
            fko fkoVar = tloVar.adapter;
            if (fkoVar != null) {
                fkoVar.m126023R(intlBaseVisitorInfoNew_, view);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m191663c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m191664d(tlo tloVar, View view) {
        CoreModule.m30933P().m143405a().mo34495eh(tloVar.act());
    }

    /* JADX INFO: renamed from: e */
    public static void m191665e(tlo tloVar, View view) {
        sop sopVar = sop.INSTANCE;
        sopVar.m187269g("e_intl_meet_visitor_unlock_btn");
        sop.m187264l(sopVar, tloVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor, null, 8, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m191666f(tlo tloVar, View view) {
        sop sopVar = sop.INSTANCE;
        sopVar.m187269g("e_intl_meet_visitor_unlock_btn");
        sopVar.m187272p(tloVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor);
    }

    /* JADX INFO: renamed from: i */
    public static void m191667i(tlo tloVar, View view) {
        sop sopVar = sop.INSTANCE;
        sopVar.m187269g("e_intl_meet_visitor_unlock_btn");
        sopVar.m187270h(tloVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor);
    }

    /* JADX INFO: renamed from: j */
    public static Unit m191668j(tlo tloVar) {
        tloVar.isShow = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m191669k(tlo tloVar) {
        tloVar.isShow = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static void m191670l(tlo tloVar, View view) {
        CoreModule.m30933P().m143405a().mo34495eh(tloVar.act());
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VLinear m191671A() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_visitors_ll");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m191672B() {
        if (NullChecker.m82486a(this.loadSub)) {
            return;
        }
        C22421c<View> c22421cMo34542lr = CoreModule.f18273l.m143405a().mo34542lr(this.frag.act());
        this.loadSub = c22421cMo34542lr != null ? c22421cMo34542lr.subscribe(psd0.m173597H(new y20() { // from class: l.plo
            @Override // p153l.y20
            public final void call(Object obj) {
                tlo.m191662b(this.f153052a, (View) obj);
            }
        }, new y20() { // from class: l.qlo
            @Override // p153l.y20
            public final void call(Object obj) {
                tlo.m191663c((Throwable) obj);
            }
        })) : null;
    }

    /* JADX INFO: renamed from: C */
    public final void m191673C(boolean hasSee, boolean hasSvip, boolean hasUltra) {
        this.hasSee = hasSee;
        this.hasSvip = hasSvip;
        this.hasUltra = hasUltra;
        m191659J();
        fko fkoVar = this.adapter;
        if (fkoVar != null) {
            fkoVar.m126033b0(m191687s(), hasUltra);
        }
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: E */
    public final void m191674E() {
        kko kkoVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kkoVar != null) {
            kkoVar.m150310k();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m191675G() {
        m191693z().removeOnScrollListener(this);
    }

    /* JADX INFO: renamed from: H */
    public final void m191676H(@Nullable List<? extends VisitorInfo> visitorItems, @Nullable List<? extends InstantMatchUserInfo> instantMatchItems) {
        fko fkoVar;
        fko fkoVar2;
        fko fkoVar3;
        List<? extends VisitorInfo> list = visitorItems;
        if (jyb.m147479J(list) && jyb.m147479J(instantMatchItems)) {
            m191660K();
            return;
        }
        m191691x().setVisibility(8);
        m191671A().setVisibility(0);
        fko fkoVar4 = this.adapter;
        if (fkoVar4 != null) {
            fkoVar4.m126036e0(visitorItems, instantMatchItems);
        }
        if (!jyb.m147479J(list)) {
            m191672B();
        }
        this.hasSee = !joa.m146392i4();
        this.hasSvip = joa.m146361M3();
        this.hasUltra = joa.m146354D3();
        if (!m191687s() && !jyb.m147479J(list) && (fkoVar3 = this.adapter) != null) {
            fkoVar3.m126021P();
        }
        if (m191687s() && !jyb.m147479J(list) && !jyb.m147479J(instantMatchItems) && (fkoVar2 = this.adapter) != null) {
            fkoVar2.m126024S();
        }
        if (jyb.m147479J(list) && (fkoVar = this.adapter) != null) {
            fkoVar.m126022Q();
        }
        m191659J();
        m191658F();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m191677I() {
        if (CoreModule.f18264c.f20414p0.m219064i3()) {
            return !m191687s();
        }
        if (CoreModule.f18264c.f20414p0.m219065j3()) {
            return !m191687s();
        }
        return joa.m146396k4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (p153l.jyb.m147479J(r0 != null ? r0.m126031Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m191678L() {
        m191690w().setBackgroundResource(gbc0.f103183Q);
        m191690w().setTextColor(Color.parseColor(Constants.BLACK));
        if (m191687s()) {
            fko fkoVar = this.adapter;
            if (jyb.m147479J(fkoVar != null ? fkoVar.m126029X() : null)) {
                fko fkoVar2 = this.adapter;
                if (!jyb.m147479J(fkoVar2 != null ? fkoVar2.m126031Z() : null)) {
                    bnl0.m105524M(m191690w(), true);
                    bnl0.m105524M(m191689v(), true);
                    m191690w().setText(R$string.f21376c0);
                    bnl0.m105509E0(m191690w(), new View.OnClickListener() { // from class: l.nlo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tlo.m191670l(this.f142575a, view);
                        }
                    });
                    bnl0.m105548c0(m191693z(), qa00.f156306S);
                    return;
                }
            }
        }
        if (!m191687s()) {
            fko fkoVar3 = this.adapter;
            if (jyb.m147479J(fkoVar3 != null ? fkoVar3.m126029X() : null)) {
                fko fkoVar4 = this.adapter;
            }
            bnl0.m105524M(m191690w(), true);
            bnl0.m105524M(m191689v(), true);
            bnl0.m105548c0(m191693z(), qa00.f156306S);
            m191690w().setText(R$string.f21373b0);
            bnl0.m105509E0(m191690w(), new View.OnClickListener() { // from class: l.olo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tlo.m191667i(this.f147858a, view);
                }
            });
            return;
        }
        bnl0.m105524M(m191690w(), false);
        bnl0.m105524M(m191689v(), false);
        bnl0.m105548c0(m191693z(), qa00.f156328o);
    }

    /* JADX INFO: renamed from: M */
    public final void m191679M(String from, Function0<Unit> onDismiss) {
        if (CoreModule.f18264c.f20414p0.m219064i3() && !m191687s()) {
            sop.INSTANCE.m187270h(act(), from, Privilege.intl_visitor);
            onDismiss.invoke();
        } else if (CoreModule.f18264c.f20414p0.m219065j3() && !m191687s()) {
            sop.INSTANCE.m187272p(act(), from, Privilege.intl_visitor);
            onDismiss.invoke();
        } else if (joa.m146392i4() && joa.m146386f4()) {
            sop.INSTANCE.m187271k(act(), from, Privilege.intl_visitor, onDismiss);
        } else {
            sop.INSTANCE.m187271k(act(), from, Privilege.ultra_premium_badge, onDismiss);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (p153l.jyb.m147479J(r0 != null ? r0.m126031Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m191680N() {
        m191690w().setBackgroundResource(gbc0.f103176P);
        m191690w().setTextColor(Color.parseColor("#FFFFFF"));
        if (this.hasSee) {
            fko fkoVar = this.adapter;
            if (jyb.m147479J(fkoVar != null ? fkoVar.m126029X() : null)) {
                fko fkoVar2 = this.adapter;
                if (!jyb.m147479J(fkoVar2 != null ? fkoVar2.m126031Z() : null)) {
                    bnl0.m105524M(m191690w(), true);
                    bnl0.m105524M(m191689v(), true);
                    m191690w().setText(R$string.f21376c0);
                    m191689v();
                    bnl0.m105509E0(m191690w(), new View.OnClickListener() { // from class: l.llo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tlo.m191661a(this.f132581a, view);
                        }
                    });
                    bnl0.m105548c0(m191693z(), qa00.f156306S);
                    return;
                }
            }
        }
        if (!this.hasSee) {
            fko fkoVar3 = this.adapter;
            if (jyb.m147479J(fkoVar3 != null ? fkoVar3.m126029X() : null)) {
                fko fkoVar4 = this.adapter;
            }
            bnl0.m105524M(m191690w(), true);
            bnl0.m105524M(m191689v(), true);
            bnl0.m105548c0(m191693z(), qa00.f156306S);
            m191690w().setText(R$string.f21373b0);
            bnl0.m105509E0(m191690w(), new View.OnClickListener() { // from class: l.mlo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tlo.m191666f(this.f137430a, view);
                }
            });
            return;
        }
        bnl0.m105524M(m191690w(), false);
        bnl0.m105524M(m191689v(), false);
        bnl0.m105548c0(m191693z(), qa00.f156328o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (p153l.jyb.m147479J(r0 != null ? r0.m126031Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m191681O() {
        m191690w().setBackgroundResource(gbc0.f103169O);
        m191690w().setTextColor(Color.parseColor("#F9E7FF"));
        if (this.hasSvip) {
            fko fkoVar = this.adapter;
            if (jyb.m147479J(fkoVar != null ? fkoVar.m126029X() : null)) {
                fko fkoVar2 = this.adapter;
                if (!jyb.m147479J(fkoVar2 != null ? fkoVar2.m126031Z() : null)) {
                    bnl0.m105524M(m191690w(), true);
                    bnl0.m105524M(m191689v(), true);
                    m191690w().setText(R$string.f21376c0);
                    bnl0.m105509E0(m191690w(), new View.OnClickListener() { // from class: l.rlo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tlo.m191664d(this.f163775a, view);
                        }
                    });
                    bnl0.m105548c0(m191693z(), qa00.f156306S);
                    return;
                }
            }
        }
        if (!this.hasSvip) {
            fko fkoVar3 = this.adapter;
            if (jyb.m147479J(fkoVar3 != null ? fkoVar3.m126029X() : null)) {
                fko fkoVar4 = this.adapter;
            }
            bnl0.m105524M(m191690w(), true);
            bnl0.m105524M(m191689v(), true);
            bnl0.m105548c0(m191693z(), qa00.f156306S);
            m191690w().setText(R$string.f21373b0);
            bnl0.m105509E0(m191690w(), new View.OnClickListener() { // from class: l.slo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tlo.m191665e(this.f169409a, view);
                }
            });
            return;
        }
        bnl0.m105524M(m191690w(), false);
        bnl0.m105524M(m191689v(), false);
        bnl0.m105548c0(m191693z(), qa00.f156328o);
    }

    @Override // p153l.iam
    @NotNull
    public Act act() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @Override // p153l.iam
    public void destroy() {
        kko kkoVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kkoVar != null) {
            kkoVar.m150308i();
        }
        this.intlMeetVisitorAffiliateDiscountBannerHost = null;
        kcg0 kcg0Var = this.loadSub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        fko fkoVar = this.adapter;
        if (fkoVar != null) {
            fkoVar.m126028W();
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM191682m = m191682m(inflater, parent);
        viewM191682m.setBackgroundColor(this.frag.act().getResources().getColor(f9c0.f97868m));
        return viewM191682m;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final View m191682m(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM196561b = ulo.m196561b(this, inflater, parent);
        viewM196561b.getClass();
        return viewM196561b;
    }

    /* JADX INFO: renamed from: n */
    public final void m191683n() {
        m191693z().addOnScrollListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == 0) {
            RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.findLastVisibleItemPosition() < linearLayoutManager.getItemCount() - 1 || recyclerView.canScrollVertically(1) || this.isShow || !m191677I()) {
                return;
            }
            i4g0.m138495D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", jyb.m147494Y("tab_view", Visitor.TYPE));
            this.isShow = true;
            m191679M("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new Function0() { // from class: l.jlo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return tlo.m191668j(this.f121585a);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, dx, dy);
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.findLastVisibleItemPosition() < linearLayoutManager.getItemCount() - 1 || recyclerView.canScrollVertically(1)) {
            return;
        }
        if (m191687s()) {
            fko fkoVar = this.adapter;
            if (jyb.m147479J(fkoVar != null ? fkoVar.m126029X() : null)) {
                fko fkoVar2 = this.adapter;
                if (!jyb.m147479J(fkoVar2 != null ? fkoVar2.m126031Z() : null)) {
                    return;
                }
            }
        }
        if (this.isShow || !m191677I() || dy <= 0) {
            return;
        }
        i4g0.m138495D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", jyb.m147494Y("tab_view", Visitor.TYPE));
        this.isShow = true;
        m191679M("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new Function0() { // from class: l.klo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tlo.m191669k(this.f127400a);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m191684p() {
        if (this.intlMeetVisitorAffiliateDiscountBannerHost != null) {
            return;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = this.frag;
        ilo iloVar = this.presenter;
        if (iloVar == null) {
            Intrinsics.m88391r("presenter");
            iloVar = null;
        }
        kko kkoVar = new kko(intlMeetVisitorFrag, iloVar);
        this.intlMeetVisitorAffiliateDiscountBannerHost = kkoVar;
        kkoVar.m150306g(m191692y());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull ilo presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: r */
    public final void m191686r() {
        Act act = this.frag.act();
        act.getClass();
        ilo iloVar = this.presenter;
        if (iloVar == null) {
            Intrinsics.m88391r("presenter");
            iloVar = null;
        }
        this.adapter = new fko(act, iloVar);
        m191693z().setLayoutManager(new LinearLayoutManager(getContext()));
        m191693z().setAdapter(this.adapter);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m191687s() {
        return CoreModule.f18264c.f20414p0.m219062g3() ? this.hasSee : this.hasSvip;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final fko getAdapter() {
        return this.adapter;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FrameLayout m191689v() {
        FrameLayout frameLayout = this._bottom_bg;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_bottom_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RoundTextView m191690w() {
        RoundTextView roundTextView = this._bottom_bg_get_privilege;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.m88391r("_bottom_bg_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VLinear m191691x() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final FrameLayout m191692y() {
        FrameLayout frameLayout = this._intl_meet_visitor_discount_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_intl_meet_visitor_discount_banner_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VRecyclerView m191693z() {
        VRecyclerView vRecyclerView = this._visitors;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_visitors");
        return null;
    }
}
