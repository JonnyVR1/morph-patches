package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p046p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.VisitorInfo;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p046p1.mobile.putong.core.util.view.RoundTextView;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\nJ\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\nJ\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b)\u0010 J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\nJ\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J-\u00106\u001a\u00020\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u000101¢\u0006\u0004\b6\u00107J%\u0010;\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0011¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020?H\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0011¢\u0006\u0004\bG\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010L\u001a\u0004\bc\u0010N\"\u0004\bd\u0010PR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010T\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u00109\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001f\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010\u0013\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u00108\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b$\u0010\u0090\u0001\u001a\u0005\b\u0094\u0001\u0010\u0013\"\u0006\b\u0095\u0001\u0010\u0093\u0001R'\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0090\u0001\u001a\u0005\b\u0097\u0001\u0010\u0013\"\u0006\b\u0098\u0001\u0010\u0093\u0001R\u001b\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u009a\u0001R'\u0010\u009c\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0090\u0001\u001a\u0005\b\u009c\u0001\u0010\u0013\"\u0006\b\u009d\u0001\u0010\u0093\u0001¨\u0006\u009e\u0001"}, m87232d2 = {"Ll/tjo;", "Ll/s7m;", "Ll/ijo;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;)V", "", "F", "()V", "B", "K", "J", "N", "L", BloodType.f38728O, "", "I", "()Z", "", "from", "Lkotlin/Function0;", "onDismiss", "M", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "m", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "p", "E", "n", "G", "presenter", "q", "(Ll/ijo;)V", "inflateView", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/core/data/VisitorInfo;", "visitorItems", "Lcom/p1/mobile/putong/core/data/InstantMatchUserInfo;", "instantMatchItems", "H", "(Ljava/util/List;Ljava/util/List;)V", "hasSee", "hasSvip", "hasUltra", b2s.C_ZONE, "(ZZZ)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", BLiveStormDanmakuGiftResourceType.f44446s, "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", BaseSei.f13931Y, "()Landroid/widget/FrameLayout;", "set_intl_meet_visitor_discount_banner_container", "(Landroid/widget/FrameLayout;)V", "_intl_meet_visitor_discount_banner_container", "Lv/VLinear;", "c", "Lv/VLinear;", "A", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VRecyclerView;", Constants.INAPP_DATA_TAG, "Lv/VRecyclerView;", BaseSei.f13932Z, "()Lv/VRecyclerView;", "set_visitors", "(Lv/VRecyclerView;)V", "_visitors", "e", ResourceDirection.f38808v, "set_bottom_bg", "_bottom_bg", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "f", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "w", "()Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "set_bottom_bg_get_privilege", "(Lcom/p1/mobile/putong/core/util/view/RoundTextView;)V", "_bottom_bg_get_privilege", "g", BaseSei.f13930X, "set_empty", "_empty", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "get_empty_empty_img", "()Landroid/widget/ImageView;", "set_empty_empty_img", "(Landroid/widget/ImageView;)V", "_empty_empty_img", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_empty_empty_tv", "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "Ll/fio;", "j", "Ll/fio;", "u", "()Ll/fio;", "setAdapter", "(Ll/fio;)V", "adapter", "k", "Ll/ijo;", "Ll/kio;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/kio;", "intlMeetVisitorAffiliateDiscountBannerHost", "Z", "getHasSvip", "setHasSvip", "(Z)V", "getHasSee", "setHasSee", "o", "getHasUltra", "setHasUltra", "Ll/c4g0;", "Ll/c4g0;", "loadSub", "isShow", "setShow", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class tjo extends RecyclerView.AbstractC0582t implements s7m<ijo> {

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
    public fio adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ijo presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public kio intlMeetVisitorAffiliateDiscountBannerHost;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean hasSvip;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean hasSee;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean hasUltra;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public c4g0 loadSub;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean isShow;

    public tjo(@NotNull IntlMeetVisitorFrag intlMeetVisitorFrag) {
        intlMeetVisitorFrag.getClass();
        this.frag = intlMeetVisitorFrag;
        this.hasSvip = xma.m210047L3();
        this.hasSee = !xma.m210077h4();
        this.hasUltra = xma.m210040C3();
    }

    /* JADX INFO: renamed from: F */
    private final void m189358F() {
        kio kioVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kioVar != null) {
            kioVar.m146111m();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m189359J() {
        if (CoreModule.f17545c.f19672p0.m173361i3()) {
            m189378L();
        } else if (CoreModule.f17545c.f19672p0.m173362j3()) {
            m189380N();
        } else {
            m189381O();
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m189360K() {
        zvf0.m220403y("e_intl_meet_null_toast", "p_intl_meet_view", MapsKt.mapOf(new Pair("null_view", "visitor_view")));
        m189391x().setVisibility(0);
        m189371A().setVisibility(8);
        xdl0.m208344M(m189390w(), false);
        xdl0.m208344M(m189389v(), false);
    }

    /* JADX INFO: renamed from: a */
    public static void m189361a(tjo tjoVar, View view) {
        CoreModule.m29935P().m94651a().mo33492eh(tjoVar.act());
    }

    /* JADX INFO: renamed from: b */
    public static void m189362b(tjo tjoVar, View view) {
        if (NullChecker.m81303a(view)) {
            IntlBaseVisitorInfo intlBaseVisitorInfoNew_ = IntlBaseVisitorInfo.new_();
            intlBaseVisitorInfoNew_.userID = "fake_visitor_list_admob_id";
            fio fioVar = tjoVar.adapter;
            if (fioVar != null) {
                fioVar.m121541R(intlBaseVisitorInfoNew_, view);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m189363c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m189364d(tjo tjoVar, View view) {
        CoreModule.m29935P().m94651a().mo33492eh(tjoVar.act());
    }

    /* JADX INFO: renamed from: e */
    public static void m189365e(tjo tjoVar, View view) {
        smp smpVar = smp.INSTANCE;
        smpVar.m185021g("e_intl_meet_visitor_unlock_btn");
        smp.m185016l(smpVar, tjoVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor, null, 8, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m189366f(tjo tjoVar, View view) {
        smp smpVar = smp.INSTANCE;
        smpVar.m185021g("e_intl_meet_visitor_unlock_btn");
        smpVar.m185024p(tjoVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor);
    }

    /* JADX INFO: renamed from: i */
    public static void m189367i(tjo tjoVar, View view) {
        smp smpVar = smp.INSTANCE;
        smpVar.m185021g("e_intl_meet_visitor_unlock_btn");
        smpVar.m185022h(tjoVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor);
    }

    /* JADX INFO: renamed from: j */
    public static Unit m189368j(tjo tjoVar) {
        tjoVar.isShow = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m189369k(tjo tjoVar) {
        tjoVar.isShow = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static void m189370l(tjo tjoVar, View view) {
        CoreModule.m29935P().m94651a().mo33492eh(tjoVar.act());
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VLinear m189371A() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_visitors_ll");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m189372B() {
        if (NullChecker.m81303a(this.loadSub)) {
            return;
        }
        C22306c<View> c22306cMo33539lr = CoreModule.f17554l.m94651a().mo33539lr(this.frag.act());
        this.loadSub = c22306cMo33539lr != null ? c22306cMo33539lr.subscribe(mkd0.m154956H(new e30() { // from class: l.pjo
            @Override // p149l.e30
            public final void call(Object obj) {
                tjo.m189362b(this.f149852a, (View) obj);
            }
        }, new e30() { // from class: l.qjo
            @Override // p149l.e30
            public final void call(Object obj) {
                tjo.m189363c((Throwable) obj);
            }
        })) : null;
    }

    /* JADX INFO: renamed from: C */
    public final void m189373C(boolean hasSee, boolean hasSvip, boolean hasUltra) {
        this.hasSee = hasSee;
        this.hasSvip = hasSvip;
        this.hasUltra = hasUltra;
        m189359J();
        fio fioVar = this.adapter;
        if (fioVar != null) {
            fioVar.m121551b0(m189387s(), hasUltra);
        }
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: E */
    public final void m189374E() {
        kio kioVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kioVar != null) {
            kioVar.m146109k();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m189375G() {
        m189393z().removeOnScrollListener(this);
    }

    /* JADX INFO: renamed from: H */
    public final void m189376H(@Nullable List<? extends VisitorInfo> visitorItems, @Nullable List<? extends InstantMatchUserInfo> instantMatchItems) {
        fio fioVar;
        fio fioVar2;
        fio fioVar3;
        List<? extends VisitorInfo> list = visitorItems;
        if (vwb.m200296J(list) && vwb.m200296J(instantMatchItems)) {
            m189360K();
            return;
        }
        m189391x().setVisibility(8);
        m189371A().setVisibility(0);
        fio fioVar4 = this.adapter;
        if (fioVar4 != null) {
            fioVar4.m121554e0(visitorItems, instantMatchItems);
        }
        if (!vwb.m200296J(list)) {
            m189372B();
        }
        this.hasSee = !xma.m210077h4();
        this.hasSvip = xma.m210047L3();
        this.hasUltra = xma.m210040C3();
        if (!m189387s() && !vwb.m200296J(list) && (fioVar3 = this.adapter) != null) {
            fioVar3.m121539P();
        }
        if (m189387s() && !vwb.m200296J(list) && !vwb.m200296J(instantMatchItems) && (fioVar2 = this.adapter) != null) {
            fioVar2.m121542S();
        }
        if (vwb.m200296J(list) && (fioVar = this.adapter) != null) {
            fioVar.m121540Q();
        }
        m189359J();
        m189358F();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m189377I() {
        if (CoreModule.f17545c.f19672p0.m173361i3()) {
            return !m189387s();
        }
        if (CoreModule.f17545c.f19672p0.m173362j3()) {
            return !m189387s();
        }
        return xma.m210081j4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (p149l.vwb.m200296J(r0 != null ? r0.m121549Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m189378L() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.tjo.m189378L():void");
    }

    /* JADX INFO: renamed from: M */
    public final void m189379M(String from, Function0<Unit> onDismiss) {
        if (CoreModule.f17545c.f19672p0.m173361i3() && !m189387s()) {
            smp.INSTANCE.m185022h(act(), from, Privilege.intl_visitor);
            onDismiss.invoke();
        } else if (CoreModule.f17545c.f19672p0.m173362j3() && !m189387s()) {
            smp.INSTANCE.m185024p(act(), from, Privilege.intl_visitor);
            onDismiss.invoke();
        } else if (xma.m210077h4() && xma.m210071e4()) {
            smp.INSTANCE.m185023k(act(), from, Privilege.intl_visitor, onDismiss);
        } else {
            smp.INSTANCE.m185023k(act(), from, Privilege.ultra_premium_badge, onDismiss);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (p149l.vwb.m200296J(r0 != null ? r0.m121549Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m189380N() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.tjo.m189380N():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (p149l.vwb.m200296J(r0 != null ? r0.m121549Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m189381O() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.tjo.m189381O():void");
    }

    @Override // p149l.s7m
    @NotNull
    public Act act() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @Override // p149l.s7m
    public void destroy() {
        kio kioVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kioVar != null) {
            kioVar.m146107i();
        }
        this.intlMeetVisitorAffiliateDiscountBannerHost = null;
        c4g0 c4g0Var = this.loadSub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        fio fioVar = this.adapter;
        if (fioVar != null) {
            fioVar.m121546W();
        }
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM189382m = m189382m(inflater, parent);
        viewM189382m.setBackgroundColor(this.frag.act().getResources().getColor(z0c0.f200985m));
        return viewM189382m;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final View m189382m(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM194017b = ujo.m194017b(this, inflater, parent);
        viewM194017b.getClass();
        return viewM194017b;
    }

    /* JADX INFO: renamed from: n */
    public final void m189383n() {
        m189393z().addOnScrollListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == 0) {
            RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.findLastVisibleItemPosition() < linearLayoutManager.getItemCount() - 1 || recyclerView.canScrollVertically(1) || this.isShow || !m189377I()) {
                return;
            }
            zvf0.m220371D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", vwb.m200311Y("tab_view", Visitor.TYPE));
            this.isShow = true;
            m189379M("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new Function0() { // from class: l.jjo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return tjo.m189368j(this.f118308a);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, dx, dy);
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.findLastVisibleItemPosition() < linearLayoutManager.getItemCount() - 1 || recyclerView.canScrollVertically(1)) {
            return;
        }
        if (m189387s()) {
            fio fioVar = this.adapter;
            if (vwb.m200296J(fioVar != null ? fioVar.m121547X() : null)) {
                fio fioVar2 = this.adapter;
                if (!vwb.m200296J(fioVar2 != null ? fioVar2.m121549Z() : null)) {
                    return;
                }
            }
        }
        if (this.isShow || !m189377I() || dy <= 0) {
            return;
        }
        zvf0.m220371D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", vwb.m200311Y("tab_view", Visitor.TYPE));
        this.isShow = true;
        m189379M("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new Function0() { // from class: l.kjo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tjo.m189369k(this.f123491a);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m189384p() {
        if (this.intlMeetVisitorAffiliateDiscountBannerHost != null) {
            return;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = this.frag;
        ijo ijoVar = this.presenter;
        if (ijoVar == null) {
            Intrinsics.m87502r("presenter");
            ijoVar = null;
        }
        kio kioVar = new kio(intlMeetVisitorFrag, ijoVar);
        this.intlMeetVisitorAffiliateDiscountBannerHost = kioVar;
        kioVar.m146105g(m189392y());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull ijo presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: r */
    public final void m189386r() {
        Act act = this.frag.act();
        act.getClass();
        ijo ijoVar = this.presenter;
        if (ijoVar == null) {
            Intrinsics.m87502r("presenter");
            ijoVar = null;
        }
        this.adapter = new fio(act, ijoVar);
        m189393z().setLayoutManager(new LinearLayoutManager(getContext()));
        m189393z().setAdapter(this.adapter);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m189387s() {
        return CoreModule.f17545c.f19672p0.m173359g3() ? this.hasSee : this.hasSvip;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final fio getAdapter() {
        return this.adapter;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FrameLayout m189389v() {
        FrameLayout frameLayout = this._bottom_bg;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_bottom_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RoundTextView m189390w() {
        RoundTextView roundTextView = this._bottom_bg_get_privilege;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.m87502r("_bottom_bg_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VLinear m189391x() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final FrameLayout m189392y() {
        FrameLayout frameLayout = this._intl_meet_visitor_discount_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_intl_meet_visitor_discount_banner_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VRecyclerView m189393z() {
        VRecyclerView vRecyclerView = this._visitors;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_visitors");
        return null;
    }
}
