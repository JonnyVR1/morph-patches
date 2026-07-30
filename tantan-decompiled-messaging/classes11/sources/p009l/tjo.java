package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.VisitorInfo;
import com.p1.mobile.putong.core.util.view.RoundTextView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.e30;
import l.j760;
import l.mkd0;
import l.s7m;
import l.ujo;
import l.vwb;
import l.xdl0;
import l.xma;
import l.z0c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\nJ\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\nJ\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\nJ\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b)\u0010 J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\nJ\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J-\u00106\u001a\u00020\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u000101¢\u0006\u0004\b6\u00107J%\u0010;\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0011¢\u0006\u0004\b;\u0010<J\u001f\u0010A\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020?H\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0011¢\u0006\u0004\bG\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010L\u001a\u0004\bc\u0010N\"\u0004\bd\u0010PR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010T\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u00109\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001f\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010\u0013\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u00108\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b$\u0010\u0090\u0001\u001a\u0005\b\u0094\u0001\u0010\u0013\"\u0006\b\u0095\u0001\u0010\u0093\u0001R'\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0090\u0001\u001a\u0005\b\u0097\u0001\u0010\u0013\"\u0006\b\u0098\u0001\u0010\u0093\u0001R\u001b\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u009a\u0001R'\u0010\u009c\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0090\u0001\u001a\u0005\b\u009c\u0001\u0010\u0013\"\u0006\b\u009d\u0001\u0010\u0093\u0001¨\u0006\u009e\u0001"}, d2 = {"Ll/tjo;", "Ll/s7m;", "Ll/ijo;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;)V", "", "F", "()V", "B", "K", "J", "N", "L", "O", "", "I", "()Z", "", "from", "Lkotlin/Function0;", "onDismiss", "M", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "m", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "p", "E", "n", "G", "presenter", "q", "(Ll/ijo;)V", "inflateView", "Lcom/p1/mobile/android/app/Act;", "act", "()Lcom/p1/mobile/android/app/Act;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/core/data/VisitorInfo;", "visitorItems", "Lcom/p1/mobile/putong/core/data/InstantMatchUserInfo;", "instantMatchItems", "H", "(Ljava/util/List;Ljava/util/List;)V", "hasSee", "hasSvip", "hasUltra", "C", "(ZZZ)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "s", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "y", "()Landroid/widget/FrameLayout;", "set_intl_meet_visitor_discount_banner_container", "(Landroid/widget/FrameLayout;)V", "_intl_meet_visitor_discount_banner_container", "Lv/VLinear;", "c", "Lv/VLinear;", "A", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VRecyclerView;", "d", "Lv/VRecyclerView;", "z", "()Lv/VRecyclerView;", "set_visitors", "(Lv/VRecyclerView;)V", "_visitors", "e", "v", "set_bottom_bg", "_bottom_bg", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "f", "Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "w", "()Lcom/p1/mobile/putong/core/util/view/RoundTextView;", "set_bottom_bg_get_privilege", "(Lcom/p1/mobile/putong/core/util/view/RoundTextView;)V", "_bottom_bg_get_privilege", "g", "x", "set_empty", "_empty", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "get_empty_empty_img", "()Landroid/widget/ImageView;", "set_empty_empty_img", "(Landroid/widget/ImageView;)V", "_empty_empty_img", "Lv/VText;", "i", "Lv/VText;", "get_empty_empty_tv", "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "Ll/fio;", "j", "Ll/fio;", "u", "()Ll/fio;", "setAdapter", "(Ll/fio;)V", "adapter", "k", "Ll/ijo;", "Ll/kio;", "l", "Ll/kio;", "intlMeetVisitorAffiliateDiscountBannerHost", "Z", "getHasSvip", "setHasSvip", "(Z)V", "getHasSee", "setHasSee", "o", "getHasUltra", "setHasUltra", "Ll/c4g0;", "Ll/c4g0;", "loadSub", "isShow", "setShow", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class tjo extends RecyclerView.t implements s7m<ijo> {

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
        this.hasSvip = xma.L3();
        this.hasSee = !xma.h4();
        this.hasUltra = xma.C3();
    }

    /* JADX INFO: renamed from: F */
    private final void m22549F() {
        kio kioVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kioVar != null) {
            kioVar.m17518m();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m22550J() {
        if (CoreModule.c.p0.i3()) {
            m22570L();
        } else if (CoreModule.c.p0.j3()) {
            m22572N();
        } else {
            m22573O();
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m22551K() {
        zvf0.y("e_intl_meet_null_toast", "p_intl_meet_view", MapsKt.mapOf(new Pair("null_view", "visitor_view")));
        m22584x().setVisibility(0);
        m22562A().setVisibility(8);
        xdl0.M(m22583w(), false);
        xdl0.M(m22582v(), false);
    }

    /* JADX INFO: renamed from: a */
    public static void m22552a(tjo tjoVar, View view) {
        CoreModule.P().a().eh(tjoVar.act());
    }

    /* JADX INFO: renamed from: b */
    public static void m22553b(tjo tjoVar, View view) {
        if (NullChecker.a(view)) {
            IntlBaseVisitorInfo intlBaseVisitorInfoNew_ = IntlBaseVisitorInfo.new_();
            intlBaseVisitorInfoNew_.userID = "fake_visitor_list_admob_id";
            fio fioVar = tjoVar.adapter;
            if (fioVar != null) {
                fioVar.m14461R(intlBaseVisitorInfoNew_, view);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m22554c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m22555d(tjo tjoVar, View view) {
        CoreModule.P().a().eh(tjoVar.act());
    }

    /* JADX INFO: renamed from: e */
    public static void m22556e(tjo tjoVar, View view) {
        smp smpVar = smp.INSTANCE;
        smpVar.m22298g("e_intl_meet_visitor_unlock_btn");
        smp.m22293l(smpVar, tjoVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor, null, 8, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m22557f(tjo tjoVar, View view) {
        smp smpVar = smp.INSTANCE;
        smpVar.m22298g("e_intl_meet_visitor_unlock_btn");
        smpVar.m22301p(tjoVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor);
    }

    /* JADX INFO: renamed from: i */
    public static void m22558i(tjo tjoVar, View view) {
        smp smpVar = smp.INSTANCE;
        smpVar.m22298g("e_intl_meet_visitor_unlock_btn");
        smpVar.m22299h(tjoVar.frag.act(), "p_intl_meet_view,e_intl_meet_visitor_unlock_btn,click", Privilege.intl_visitor);
    }

    /* JADX INFO: renamed from: j */
    public static Unit m22559j(tjo tjoVar) {
        tjoVar.isShow = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m22560k(tjo tjoVar) {
        tjoVar.isShow = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static void m22561l(tjo tjoVar, View view) {
        CoreModule.P().a().eh(tjoVar.act());
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VLinear m22562A() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_visitors_ll");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m22563B() {
        if (NullChecker.a(this.loadSub)) {
            return;
        }
        c cVarLr = CoreModule.l.a().lr(this.frag.act());
        this.loadSub = cVarLr != null ? cVarLr.subscribe(mkd0.H(new e30() { // from class: l.pjo
            public final void call(Object obj) {
                tjo.m22553b(this.f18757a, (View) obj);
            }
        }, new e30() { // from class: l.qjo
            public final void call(Object obj) {
                tjo.m22554c((Throwable) obj);
            }
        })) : null;
    }

    /* JADX INFO: renamed from: C */
    public final void m22564C(boolean hasSee, boolean hasSvip, boolean hasUltra) {
        this.hasSee = hasSee;
        this.hasSvip = hasSvip;
        this.hasUltra = hasUltra;
        m22550J();
        fio fioVar = this.adapter;
        if (fioVar != null) {
            fioVar.m14471b0(m22580s(), hasUltra);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m22565C0() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: E */
    public final void m22566E() {
        kio kioVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kioVar != null) {
            kioVar.m17516k();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m22567G() {
        m22586z().removeOnScrollListener(this);
    }

    /* JADX INFO: renamed from: H */
    public final void m22568H(@Nullable List<? extends VisitorInfo> visitorItems, @Nullable List<? extends InstantMatchUserInfo> instantMatchItems) {
        fio fioVar;
        fio fioVar2;
        fio fioVar3;
        List<? extends VisitorInfo> list = visitorItems;
        if (vwb.J(list) && vwb.J(instantMatchItems)) {
            m22551K();
            return;
        }
        m22584x().setVisibility(8);
        m22562A().setVisibility(0);
        fio fioVar4 = this.adapter;
        if (fioVar4 != null) {
            fioVar4.m14474e0(visitorItems, instantMatchItems);
        }
        if (!vwb.J(list)) {
            m22563B();
        }
        this.hasSee = !xma.h4();
        this.hasSvip = xma.L3();
        this.hasUltra = xma.C3();
        if (!m22580s() && !vwb.J(list) && (fioVar3 = this.adapter) != null) {
            fioVar3.m14459P();
        }
        if (m22580s() && !vwb.J(list) && !vwb.J(instantMatchItems) && (fioVar2 = this.adapter) != null) {
            fioVar2.m14462S();
        }
        if (vwb.J(list) && (fioVar = this.adapter) != null) {
            fioVar.m14460Q();
        }
        m22550J();
        m22549F();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m22569I() {
        if (CoreModule.c.p0.i3()) {
            return !m22580s();
        }
        if (CoreModule.c.p0.j3()) {
            return !m22580s();
        }
        return xma.j4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (l.vwb.J(r0 != null ? r0.m14469Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22570L() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.tjo.m22570L():void");
    }

    /* JADX INFO: renamed from: M */
    public final void m22571M(String from, Function0<Unit> onDismiss) {
        if (CoreModule.c.p0.i3() && !m22580s()) {
            smp.INSTANCE.m22299h(act(), from, Privilege.intl_visitor);
            onDismiss.invoke();
        } else if (CoreModule.c.p0.j3() && !m22580s()) {
            smp.INSTANCE.m22301p(act(), from, Privilege.intl_visitor);
            onDismiss.invoke();
        } else if (xma.h4() && xma.e4()) {
            smp.INSTANCE.m22300k(act(), from, Privilege.intl_visitor, onDismiss);
        } else {
            smp.INSTANCE.m22300k(act(), from, Privilege.ultra_premium_badge, onDismiss);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (l.vwb.J(r0 != null ? r0.m14469Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22572N() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.tjo.m22572N():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (l.vwb.J(r0 != null ? r0.m14469Z() : null) == false) goto L31;
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22573O() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.tjo.m22573O():void");
    }

    @NotNull
    public Act act() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    public void destroy() {
        kio kioVar = this.intlMeetVisitorAffiliateDiscountBannerHost;
        if (kioVar != null) {
            kioVar.m17514i();
        }
        this.intlMeetVisitorAffiliateDiscountBannerHost = null;
        c4g0 c4g0Var = this.loadSub;
        if (c4g0Var != null) {
            mkd0.z(c4g0Var);
        }
        fio fioVar = this.adapter;
        if (fioVar != null) {
            fioVar.m14466W();
        }
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM22575m = m22575m(inflater, parent);
        viewM22575m.setBackgroundColor(this.frag.act().getResources().getColor(z0c0.m));
        return viewM22575m;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final View m22575m(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = ujo.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: n */
    public final void m22576n() {
        m22586z().addOnScrollListener(this);
    }

    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == 0) {
            LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            LinearLayoutManager linearLayoutManager = layoutManager;
            if (linearLayoutManager.findLastVisibleItemPosition() < linearLayoutManager.getItemCount() - 1 || recyclerView.canScrollVertically(1) || this.isShow || !m22569I()) {
                return;
            }
            zvf0.D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", new j760[]{vwb.Y("tab_view", "visitor")});
            this.isShow = true;
            m22571M("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new Function0() { // from class: l.jjo
                public final Object invoke() {
                    return tjo.m22559j(this.f15212a);
                }
            });
        }
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, dx, dy);
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = layoutManager;
        if (linearLayoutManager.findLastVisibleItemPosition() < linearLayoutManager.getItemCount() - 1 || recyclerView.canScrollVertically(1)) {
            return;
        }
        if (m22580s()) {
            fio fioVar = this.adapter;
            if (vwb.J(fioVar != null ? fioVar.m14467X() : null)) {
                fio fioVar2 = this.adapter;
                if (!vwb.J(fioVar2 != null ? fioVar2.m14469Z() : null)) {
                    return;
                }
            }
        }
        if (this.isShow || !m22569I() || dy <= 0) {
            return;
        }
        zvf0.D("e_intl_meet_view_swipe_bottom", "p_intl_meet_view", new j760[]{vwb.Y("tab_view", "visitor")});
        this.isShow = true;
        m22571M("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new Function0() { // from class: l.kjo
            public final Object invoke() {
                return tjo.m22560k(this.f15737a);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m22577p() {
        if (this.intlMeetVisitorAffiliateDiscountBannerHost != null) {
            return;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = this.frag;
        ijo ijoVar = this.presenter;
        if (ijoVar == null) {
            Intrinsics.r("presenter");
            ijoVar = null;
        }
        kio kioVar = new kio(intlMeetVisitorFrag, ijoVar);
        this.intlMeetVisitorAffiliateDiscountBannerHost = kioVar;
        kioVar.m17512g(m22585y());
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m22574i1(@NotNull ijo presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: r */
    public final void m22579r() {
        Act act = this.frag.act();
        act.getClass();
        ijo ijoVar = this.presenter;
        if (ijoVar == null) {
            Intrinsics.r("presenter");
            ijoVar = null;
        }
        this.adapter = new fio(act, ijoVar);
        m22586z().setLayoutManager(new LinearLayoutManager(m22565C0()));
        m22586z().setAdapter(this.adapter);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22580s() {
        return CoreModule.c.p0.g3() ? this.hasSee : this.hasSvip;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final fio getAdapter() {
        return this.adapter;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FrameLayout m22582v() {
        FrameLayout frameLayout = this._bottom_bg;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_bottom_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final RoundTextView m22583w() {
        RoundTextView roundTextView = this._bottom_bg_get_privilege;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.r("_bottom_bg_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VLinear m22584x() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final FrameLayout m22585y() {
        FrameLayout frameLayout = this._intl_meet_visitor_discount_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_intl_meet_visitor_discount_banner_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VRecyclerView m22586z() {
        VRecyclerView vRecyclerView = this._visitors;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_visitors");
        return null;
    }
}
