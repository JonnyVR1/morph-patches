package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.BoostPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUIPurchaseSectionViewAutoPay;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUITotalPricePurchaseSectionView1;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.ODiamondAllPriceSectionView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m88121d2 = {"Ll/hib0;", "Ll/t5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "", "G", "()V", "", "D", "()I", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "_root", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", FirebaseAnalytics.Param.INDEX, BaseSei.f14625Y, "(I)V", "release", OMSTemplateModeType.view, "B", "(Landroid/view/View;)V", "Landroid/widget/HorizontalScrollView;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/HorizontalScrollView;", "F", "()Landroid/widget/HorizontalScrollView;", "set_scroll", "(Landroid/widget/HorizontalScrollView;)V", "_scroll", "Landroid/widget/LinearLayout;", "j", "Landroid/widget/LinearLayout;", "E", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", "Lcom/p1/mobile/putong/data/PayMethod;", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", BLiveStormDanmakuGiftResourceType.f45292l, "J", "preTimeMillis", "m", "I", "ANIMATED_SCROLL_GAP", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hib0 extends AbstractC20237t5 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public HorizontalScrollView _scroll;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public LinearLayout _content;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public long preTimeMillis;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int ANIMATED_SCROLL_GAP;

    /* JADX INFO: renamed from: l.hib0$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/hib0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17466a implements AbstractC8939a.e {
        public C17466a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            hib0.this.m189350u(sections);
        }
    }

    /* JADX INFO: renamed from: l.hib0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/hib0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17467b implements AbstractC8939a.d {
        public C17467b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            List<C8928d> listM55198M = hib0.this.getMediator().m55198M();
            if (sectionSource != null) {
                section = sectionSource;
            }
            hib0.this.m189351v(listM55198M, section);
            hib0.this.m189340j(listM55198M);
            if (scroll) {
                hib0.this.mo135119y(listM55198M.indexOf(section));
            }
        }
    }

    /* JADX INFO: renamed from: l.hib0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/hib0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17468c implements AbstractC8939a.a {
        public C17468c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            payMethod.getClass();
            hib0.this.currentPayMethod = payMethod;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hib0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        PayMethod payMethod = PayMethod.get("unknown_");
        payMethod.getClass();
        this.currentPayMethod = payMethod;
        this.ANIMATED_SCROLL_GAP = 250;
    }

    /* JADX INFO: renamed from: A */
    public static void m135112A(hib0 hib0Var, int i) {
        int normalWidth = (int) (hib0Var.getNormalWidth() * Math.max(0, i - 1));
        if (pzi0.m174454o() - hib0Var.preTimeMillis > hib0Var.ANIMATED_SCROLL_GAP) {
            hib0Var.preTimeMillis = pzi0.m174454o();
            hib0Var.m135118F().smoothScrollTo(normalWidth, 0);
        }
    }

    /* JADX INFO: renamed from: D */
    private final int m135114D() {
        return txq.m193530c(TextUtils.equals(getFrom(), "purchasePage") ? 13 : 7);
    }

    /* JADX INFO: renamed from: G */
    private final void m135115G() {
        LinearLayout linearLayout = new LinearLayout(getAct());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.setOrientation(0);
        m135117E().addView(linearLayout, layoutParams);
        int iM135114D = m135114D();
        m135117E().setPadding(iM135114D, 0, iM135114D, 0);
        m189347r(linearLayout);
    }

    /* JADX INFO: renamed from: B */
    public final void m135116B(View view) {
        iib0.m140062a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LinearLayout m135117E() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final HorizontalScrollView m135118F() {
        HorizontalScrollView horizontalScrollView = this._scroll;
        if (horizontalScrollView != null) {
            return horizontalScrollView;
        }
        Intrinsics.m88391r("_scroll");
        return null;
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = getAct().inflater().inflate(rec0.f162475O1, root, false);
        viewInflate.getClass();
        m135116B(viewInflate);
        m135115G();
        return viewInflate;
    }

    @Override // p153l.AbstractC20237t5
    @NotNull
    /* JADX INFO: renamed from: k */
    public AbsPurchaseSectionView mo120887k(@NotNull C8928d section, @NotNull ViewGroup _root) {
        section.getClass();
        _root.getClass();
        if (wib0.m206565i(getPurchaseType()) || wib0.m206572p(getPurchaseType()) || wib0.m206566j(getPurchaseType())) {
            View viewInflate = p9r.m171370a(getAct()).inflate(rec0.f162590p0, _root, false);
            viewInflate.getClass();
            ODiamondAllPriceSectionView oDiamondAllPriceSectionView = (ODiamondAllPriceSectionView) viewInflate;
            oDiamondAllPriceSectionView.setInVipFrag(TextUtils.equals(getFrom(), "PrivilegeODiamondContent"));
            oDiamondAllPriceSectionView.m55566n(TextUtils.equals(getFrom(), "purchasePage"));
            return oDiamondAllPriceSectionView;
        }
        if (wib0.m206561e(getPurchaseType()) || wib0.m206559c(getPurchaseType())) {
            View viewInflate2 = p9r.m171370a(getAct()).inflate(rec0.f162586o0, _root, false);
            viewInflate2.getClass();
            return (BoostPurchaseSectionView) viewInflate2;
        }
        if (CoreModule.m30933P().m143405a().mo34527j3() && TEnum.equals(this.currentPayMethod, "alipay") && CoreModule.f18264c.f20333O0.m31084u3(getPurchaseType())) {
            View viewInflate3 = p9r.m171370a(getAct()).inflate(rec0.f162594q0, _root, false);
            viewInflate3.getClass();
            return (NewUIPurchaseSectionViewAutoPay) viewInflate3;
        }
        View viewInflate4 = p9r.m171370a(getAct()).inflate(rec0.f162598r0, _root, false);
        viewInflate4.getClass();
        NewUITotalPricePurchaseSectionView1 newUITotalPricePurchaseSectionView1 = (NewUITotalPricePurchaseSectionView1) viewInflate4;
        newUITotalPricePurchaseSectionView1.m55535o(TextUtils.equals(getFrom(), "purchasePage"));
        return newUITotalPricePurchaseSectionView1;
    }

    @Override // p153l.w3m
    public void register() {
        ndb0 mediator = getMediator();
        if (mediator != null) {
            mediator.m55195J(new C17466a());
            mediator.m55194I(new C17467b());
            mediator.m55191F(new C17468c());
        }
    }

    @Override // p153l.AbstractC20237t5
    /* JADX INFO: renamed from: y */
    public void mo135119y(final int index) {
        if (this._scroll == null) {
            return;
        }
        l51.m152888H(getAct(), new Runnable() { // from class: l.gib0
            @Override // java.lang.Runnable
            public final void run() {
                hib0.m135112A(this.f104216a, index);
            }
        }, 100L);
    }

    @Override // p153l.w3m
    public void release() {
    }
}
