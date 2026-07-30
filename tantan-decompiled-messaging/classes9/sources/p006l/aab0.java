package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
import l.bab0;
import l.m6c0;
import l.o7r;
import l.sab0;
import l.svq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Ll/aab0;", "Ll/v5;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "register", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "_root", "Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Landroid/view/ViewGroup;)Lcom/p1/mobile/putong/core/ui/purchase/showcase/AbsPurchaseSectionView;", "release", "view", "A", "(Landroid/view/View;)V", "E", "", "C", "()I", "Landroid/widget/LinearLayout;", "i", "Landroid/widget/LinearLayout;", "D", "()Landroid/widget/LinearLayout;", "set_paired_sections_root", "(Landroid/widget/LinearLayout;)V", "_paired_sections_root", "Lcom/p1/mobile/putong/data/PayMethod;", "j", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class aab0 extends AbstractC1372v5 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LinearLayout _paired_sections_root;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: l.aab0$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/aab0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0497a implements AbstractC0212a.e {
        public C0497a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends d> sections) {
            sections.getClass();
            aab0.this.m25749u(sections);
        }
    }

    /* JADX INFO: renamed from: l.aab0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/aab0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0498b implements AbstractC0212a.d {
        public C0498b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(d section, boolean scroll, boolean isClick, d sectionSource) {
            section.getClass();
            List<? extends d> listM7350M = aab0.this.getMediator().m7350M();
            if (sectionSource != null) {
                section = sectionSource;
            }
            aab0.this.m25750v(listM7350M, section);
            aab0.this.m25739j(listM7350M);
            if (scroll) {
                aab0.this.mo13886y(listM7350M.indexOf(section));
            }
        }
    }

    /* JADX INFO: renamed from: l.aab0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/aab0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0499c implements AbstractC0212a.a {
        public C0499c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.a
        /* JADX INFO: renamed from: a */
        public void mo7379a(PayMethod payMethod) {
            payMethod.getClass();
            aab0.this.currentPayMethod = payMethod;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aab0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        PayMethod payMethod = PayMethod.get("unknown_");
        payMethod.getClass();
        this.currentPayMethod = payMethod;
    }

    /* JADX INFO: renamed from: A */
    public final void m11798A(View view) {
        bab0.a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public final int m11799C() {
        return svq.c(TextUtils.equals(getFrom(), "purchasePage") ? 13 : 7);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LinearLayout m11800D() {
        LinearLayout linearLayout = this._paired_sections_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_paired_sections_root");
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m11801E() {
        int iM11799C = m11799C();
        m11800D().setPadding(iM11799C, 0, iM11799C, 0);
        m25746r(m11800D());
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = getAct().inflater().inflate(m6c0.N1, root, false);
        viewInflate.getClass();
        m11798A(viewInflate);
        m11801E();
        return viewInflate;
    }

    @Override // p006l.AbstractC1372v5
    @NotNull
    /* JADX INFO: renamed from: k */
    public AbsPurchaseSectionView mo11802k(@NotNull d section, @NotNull ViewGroup _root) {
        section.getClass();
        _root.getClass();
        if (sab0.i(getPurchaseType())) {
            View viewInflate = o7r.a(getAct()).inflate(m6c0.p0, _root, false);
            viewInflate.getClass();
            ODiamondAllPriceSectionView oDiamondAllPriceSectionView = (ODiamondAllPriceSectionView) viewInflate;
            oDiamondAllPriceSectionView.setInVipFrag(TextUtils.equals(getFrom(), "PrivilegeODiamondContent"));
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
        return (NewUITotalPricePurchaseSectionView1) viewInflate4;
    }

    @Override // p006l.d1m
    public void register() {
        j5b0 mediator = getMediator();
        if (mediator != null) {
            mediator.m7347J(new C0497a());
            mediator.m7346I(new C0498b());
            mediator.m7343F(new C0499c());
        }
    }

    @Override // p006l.d1m
    public void release() {
    }
}
