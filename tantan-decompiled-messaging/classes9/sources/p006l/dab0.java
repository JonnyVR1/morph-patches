package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.BoostPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUIPurchaseSectionViewAutoPay;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUITotalPricePurchaseSectionView1;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.ODiamondAllPriceSectionView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.e51;
import l.eab0;
import l.m6c0;
import l.mqi0;
import l.o7r;
import l.sab0;
import l.svq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Ll/dab0;", "Ll/v5;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "", "G", "()V", "", "D", "()I", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "_root", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "index", "y", "(I)V", "release", "view", "B", "(Landroid/view/View;)V", "Landroid/widget/HorizontalScrollView;", "i", "Landroid/widget/HorizontalScrollView;", "F", "()Landroid/widget/HorizontalScrollView;", "set_scroll", "(Landroid/widget/HorizontalScrollView;)V", "_scroll", "Landroid/widget/LinearLayout;", "j", "Landroid/widget/LinearLayout;", "E", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", "Lcom/p1/mobile/putong/data/PayMethod;", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "", "l", "J", "preTimeMillis", "m", "I", "ANIMATED_SCROLL_GAP", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dab0 extends AbstractC1372v5 {

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

    /* JADX INFO: renamed from: l.dab0$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/dab0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0633a implements AbstractC0212a.e {
        public C0633a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends d> sections) {
            sections.getClass();
            dab0.this.m25749u(sections);
        }
    }

    /* JADX INFO: renamed from: l.dab0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/dab0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0634b implements AbstractC0212a.d {
        public C0634b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(d section, boolean scroll, boolean isClick, d sectionSource) {
            section.getClass();
            List<? extends d> listM7350M = dab0.this.getMediator().m7350M();
            if (sectionSource != null) {
                section = sectionSource;
            }
            dab0.this.m25750v(listM7350M, section);
            dab0.this.m25739j(listM7350M);
            if (scroll) {
                dab0.this.mo13886y(listM7350M.indexOf(section));
            }
        }
    }

    /* JADX INFO: renamed from: l.dab0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/dab0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0635c implements AbstractC0212a.a {
        public C0635c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.a
        /* JADX INFO: renamed from: a */
        public void mo7379a(PayMethod payMethod) {
            payMethod.getClass();
            dab0.this.currentPayMethod = payMethod;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dab0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        PayMethod payMethod = PayMethod.get("unknown_");
        payMethod.getClass();
        this.currentPayMethod = payMethod;
        this.ANIMATED_SCROLL_GAP = 250;
    }

    /* JADX INFO: renamed from: A */
    public static void m13879A(dab0 dab0Var, int i) {
        int normalWidth = (int) (dab0Var.getNormalWidth() * Math.max(0, i - 1));
        if (mqi0.o() - dab0Var.preTimeMillis > dab0Var.ANIMATED_SCROLL_GAP) {
            dab0Var.preTimeMillis = mqi0.o();
            dab0Var.m13885F().smoothScrollTo(normalWidth, 0);
        }
    }

    /* JADX INFO: renamed from: D */
    private final int m13881D() {
        return svq.c(TextUtils.equals(getFrom(), "purchasePage") ? 13 : 7);
    }

    /* JADX INFO: renamed from: G */
    private final void m13882G() {
        LinearLayout linearLayout = new LinearLayout(getAct());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.setOrientation(0);
        m13884E().addView(linearLayout, layoutParams);
        int iM13881D = m13881D();
        m13884E().setPadding(iM13881D, 0, iM13881D, 0);
        m25746r(linearLayout);
    }

    /* JADX INFO: renamed from: B */
    public final void m13883B(View view) {
        eab0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LinearLayout m13884E() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final HorizontalScrollView m13885F() {
        HorizontalScrollView horizontalScrollView = this._scroll;
        if (horizontalScrollView != null) {
            return horizontalScrollView;
        }
        Intrinsics.r("_scroll");
        return null;
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = getAct().inflater().inflate(m6c0.O1, root, false);
        viewInflate.getClass();
        m13883B(viewInflate);
        m13882G();
        return viewInflate;
    }

    @Override // p006l.AbstractC1372v5
    @NotNull
    /* JADX INFO: renamed from: k */
    public AbsPurchaseSectionView mo11802k(@NotNull d section, @NotNull ViewGroup _root) {
        section.getClass();
        _root.getClass();
        if (sab0.i(getPurchaseType()) || sab0.p(getPurchaseType()) || sab0.j(getPurchaseType())) {
            View viewInflate = o7r.a(getAct()).inflate(m6c0.p0, _root, false);
            viewInflate.getClass();
            ODiamondAllPriceSectionView oDiamondAllPriceSectionView = (ODiamondAllPriceSectionView) viewInflate;
            oDiamondAllPriceSectionView.setInVipFrag(TextUtils.equals(getFrom(), "PrivilegeODiamondContent"));
            oDiamondAllPriceSectionView.m7718n(TextUtils.equals(getFrom(), "purchasePage"));
            return oDiamondAllPriceSectionView;
        }
        if (sab0.e(getPurchaseType()) || sab0.c(getPurchaseType())) {
            View viewInflate2 = o7r.a(getAct()).inflate(m6c0.o0, _root, false);
            viewInflate2.getClass();
            return (BoostPurchaseSectionView) viewInflate2;
        }
        if (CoreModule.m1854P().m11706a().m5461j3() && TEnum.equals(this.currentPayMethod, "alipay") && CoreModule.f1534c.f3580O0.m2014u3(getPurchaseType())) {
            View viewInflate3 = o7r.a(getAct()).inflate(m6c0.q0, _root, false);
            viewInflate3.getClass();
            return (NewUIPurchaseSectionViewAutoPay) viewInflate3;
        }
        View viewInflate4 = o7r.a(getAct()).inflate(m6c0.r0, _root, false);
        viewInflate4.getClass();
        NewUITotalPricePurchaseSectionView1 newUITotalPricePurchaseSectionView1 = (NewUITotalPricePurchaseSectionView1) viewInflate4;
        newUITotalPricePurchaseSectionView1.m7687o(TextUtils.equals(getFrom(), "purchasePage"));
        return newUITotalPricePurchaseSectionView1;
    }

    @Override // p006l.d1m
    public void register() {
        j5b0 mediator = getMediator();
        if (mediator != null) {
            mediator.m7347J(new C0633a());
            mediator.m7346I(new C0634b());
            mediator.m7343F(new C0635c());
        }
    }

    @Override // p006l.AbstractC1372v5
    /* JADX INFO: renamed from: y */
    public void mo13886y(final int index) {
        if (this._scroll == null) {
            return;
        }
        e51.H(getAct(), new Runnable() { // from class: l.cab0
            @Override // java.lang.Runnable
            public final void run() {
                dab0.m13879A(this.f9560a, index);
            }
        }, 100L);
    }

    @Override // p006l.d1m
    public void release() {
    }
}
