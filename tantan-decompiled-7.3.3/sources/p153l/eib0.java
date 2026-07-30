package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m88121d2 = {"Ll/eib0;", "Ll/t5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "register", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "_root", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "release", OMSTemplateModeType.view, "A", "(Landroid/view/View;)V", "E", "", c4s.C_ZONE, "()I", "Landroid/widget/LinearLayout;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/LinearLayout;", "D", "()Landroid/widget/LinearLayout;", "set_paired_sections_root", "(Landroid/widget/LinearLayout;)V", "_paired_sections_root", "Lcom/p1/mobile/putong/data/PayMethod;", "j", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class eib0 extends AbstractC20237t5 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LinearLayout _paired_sections_root;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: l.eib0$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/eib0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16774a implements AbstractC8939a.e {
        public C16774a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            eib0.this.m189350u(sections);
        }
    }

    /* JADX INFO: renamed from: l.eib0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/eib0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16775b implements AbstractC8939a.d {
        public C16775b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            List<C8928d> listM55198M = eib0.this.getMediator().m55198M();
            if (sectionSource != null) {
                section = sectionSource;
            }
            eib0.this.m189351v(listM55198M, section);
            eib0.this.m189340j(listM55198M);
            if (scroll) {
                eib0.this.mo135119y(listM55198M.indexOf(section));
            }
        }
    }

    /* JADX INFO: renamed from: l.eib0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/eib0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16776c implements AbstractC8939a.a {
        public C16776c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            payMethod.getClass();
            eib0.this.currentPayMethod = payMethod;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eib0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        PayMethod payMethod = PayMethod.get("unknown_");
        payMethod.getClass();
        this.currentPayMethod = payMethod;
    }

    /* JADX INFO: renamed from: A */
    public final void m120883A(View view) {
        fib0.m125676a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public final int m120884C() {
        return txq.m193530c(TextUtils.equals(getFrom(), "purchasePage") ? 13 : 7);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LinearLayout m120885D() {
        LinearLayout linearLayout = this._paired_sections_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_paired_sections_root");
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m120886E() {
        int iM120884C = m120884C();
        m120885D().setPadding(iM120884C, 0, iM120884C, 0);
        m189347r(m120885D());
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = getAct().inflater().inflate(rec0.f162471N1, root, false);
        viewInflate.getClass();
        m120883A(viewInflate);
        m120886E();
        return viewInflate;
    }

    @Override // p153l.AbstractC20237t5
    @NotNull
    /* JADX INFO: renamed from: k */
    public AbsPurchaseSectionView mo120887k(@NotNull C8928d section, @NotNull ViewGroup _root) {
        section.getClass();
        _root.getClass();
        if (wib0.m206565i(getPurchaseType())) {
            View viewInflate = p9r.m171370a(getAct()).inflate(rec0.f162590p0, _root, false);
            viewInflate.getClass();
            ODiamondAllPriceSectionView oDiamondAllPriceSectionView = (ODiamondAllPriceSectionView) viewInflate;
            oDiamondAllPriceSectionView.setInVipFrag(TextUtils.equals(getFrom(), "PrivilegeODiamondContent"));
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
        return (NewUITotalPricePurchaseSectionView1) viewInflate4;
    }

    @Override // p153l.w3m
    public void register() {
        ndb0 mediator = getMediator();
        if (mediator != null) {
            mediator.m55195J(new C16774a());
            mediator.m55194I(new C16775b());
            mediator.m55191F(new C16776c());
        }
    }

    @Override // p153l.w3m
    public void release() {
    }
}
