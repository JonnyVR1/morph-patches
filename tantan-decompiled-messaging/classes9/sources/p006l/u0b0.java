package p006l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d3c0;
import l.e51;
import l.m6c0;
import l.sab0;
import l.sd0;
import l.svq;
import l.v0b0;
import l.we60;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VCheckBox;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010U\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010N\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010[R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010]R\u0016\u0010^\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010]R\u0016\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010]¨\u0006_"}, d2 = {"Ll/u0b0;", "Ll/b5;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "", "q", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "r", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "", "privilegeType", "t", "(Z)V", "purchasePageType", "u", "vipFrag", "v", "release", "view", "g", "(Landroid/view/View;)V", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "d", "Ljava/lang/String;", "e", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "p", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Lv/VCheckBox;", "Lv/VCheckBox;", "o", "()Lv/VCheckBox;", "set_check", "(Lv/VCheckBox;)V", "_check", "Lv/VText;", "h", "Lv/VText;", "n", "()Lv/VText;", "set_agreement", "(Lv/VText;)V", "_agreement", "", "i", "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "k", "getCurrentPurchaseSectionSource", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "s", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "currentPurchaseSectionSource", "Lcom/p1/mobile/putong/data/PayMethod;", "l", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/gd0;", "Ll/gd0;", "agreementTextStrategiesHelper", "Z", "privilegeStyle", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0b0 extends AbstractC0547b5 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final j5b0 mediator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VCheckBox _check;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _agreement;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<? extends d> sections;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public d currentPurchaseSection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public d currentPurchaseSectionSource;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public gd0 agreementTextStrategiesHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean purchasePageType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean privilegeStyle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean vipFrag;

    /* JADX INFO: renamed from: l.u0b0$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/u0b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1329a implements AbstractC0212a.e {
        public C1329a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends d> sections) {
            sections.getClass();
            u0b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.u0b0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/u0b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1330b implements AbstractC0212a.d {
        public C1330b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(d section, boolean scroll, boolean isClick, d sectionSource) {
            section.getClass();
            u0b0.this.currentPurchaseSection = section;
            u0b0.this.m24886s(sectionSource);
            u0b0 u0b0Var = u0b0.this;
            u0b0Var.m24881r(section, u0b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.u0b0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/u0b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C1331c implements AbstractC0212a.a {
        public C1331c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.a
        /* JADX INFO: renamed from: a */
        public void mo7379a(PayMethod payMethod) {
            payMethod.getClass();
            u0b0.this.currentPayMethod = payMethod;
            d dVar = u0b0.this.currentPurchaseSection;
            if (dVar != null) {
                u0b0 u0b0Var = u0b0.this;
                u0b0Var.m24881r(dVar, u0b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.u0b0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/u0b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C1332d implements AbstractC0212a.c {
        public C1332d() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.c
        /* JADX INFO: renamed from: a */
        public void mo7380a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            u0b0.this.m12556d(agreementState);
            d dVar = u0b0.this.currentPurchaseSection;
            if (dVar != null) {
                u0b0.this.m24881r(dVar, agreementState);
            }
        }
    }

    public u0b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m24872e(d dVar, u0b0 u0b0Var, PurchaseAgreementState purchaseAgreementState) {
        if (dVar.m() && dsa.m14212t(null, 1, null)) {
            xdl0.M(u0b0Var.m24884o(), true);
            u0b0Var.m24884o().setChecked(purchaseAgreementState == PurchaseAgreementState.CHECKED);
            u0b0Var.m24883n().setGravity(8388627);
        } else {
            xdl0.M(u0b0Var.m24884o(), false);
            u0b0Var.m24883n().setGravity(17);
        }
        if (TextUtils.equals(u0b0Var.from, "purchasePage")) {
            u0b0Var.m24885p().setGravity(8388611);
        } else {
            u0b0Var.m24885p().setGravity(17);
        }
        CharSequence charSequenceM24879m = u0b0Var.m24879m(dVar);
        if (charSequenceM24879m instanceof Spannable) {
            u0b0Var.m24883n().setOnTouchListener(new sd0((Spannable) charSequenceM24879m));
        } else {
            u0b0Var.m24883n().setOnTouchListener(null);
        }
        u0b0Var.m24883n().setText(charSequenceM24879m);
    }

    /* JADX INFO: renamed from: f */
    public static void m24873f(u0b0 u0b0Var, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        d dVar = u0b0Var.currentPurchaseSection;
        if (dVar != null) {
            PurchaseAgreementState purchaseAgreementState = z ? PurchaseAgreementState.CHECKED : PurchaseAgreementState.UNCHECKED;
            j5b0 j5b0Var = u0b0Var.mediator;
            if (j5b0Var != null) {
                d dVar2 = u0b0Var.currentPurchaseSectionSource;
                if (dVar2 != null) {
                    dVar = dVar2;
                }
                j5b0Var.m17272V(dVar, purchaseAgreementState);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final CharSequence m24879m(d section) {
        d.a aVarD;
        if (section.m()) {
            aVarD = section.b();
            aVarD.getClass();
        } else {
            aVarD = section.d();
            aVarD.getClass();
        }
        d.a aVar = aVarD;
        Merchandise merchandiseS = aVar.s();
        if (this.agreementTextStrategiesHelper == null) {
            this.agreementTextStrategiesHelper = new gd0(this.act, this.purchaseType, this.from);
        }
        merchandiseS.getClass();
        fd0 fd0Var = new fd0(aVar, merchandiseS, this.currentPayMethod, this.purchasePageType, false, this.privilegeStyle, this.vipFrag, 16, null);
        gd0 gd0Var = this.agreementTextStrategiesHelper;
        if (gd0Var == null) {
            Intrinsics.r("agreementTextStrategiesHelper");
            gd0Var = null;
        }
        return gd0Var.m15711a(fd0Var);
    }

    /* JADX INFO: renamed from: q */
    private final void m24880q() {
        Drawable drawable;
        if (TextUtils.equals(this.from, "purchasePage")) {
            m24885p().setPadding(svq.c(16), 0, svq.c(16), 0);
        }
        m24883n().setTextColor((sab0.i(this.purchaseType) && this.vipFrag && g6a.m15592o()) ? Color.parseColor("#66FFC079") : we60.Q(this.privilegeStyle));
        m24883n().setGravity(8388627);
        VCheckBox vCheckBoxM24884o = m24884o();
        boolean z = this.purchasePageType;
        PurchaseType purchaseType = this.purchaseType;
        if (z) {
            if (sab0.w(purchaseType) || sab0.q(this.purchaseType)) {
                drawable = this.act.drawable(d3c0.J6);
            } else if (sab0.i(this.purchaseType) || sab0.j(this.purchaseType) || sab0.p(this.purchaseType)) {
                drawable = this.act.drawable(d3c0.Q6);
            } else if (sab0.g(this.purchaseType)) {
                drawable = this.act.drawable(d3c0.P6);
            } else {
                boolean zX = sab0.x(this.purchaseType);
                Act act = this.act;
                drawable = zX ? act.drawable(d3c0.v7) : act.drawable(d3c0.Z7);
            }
        } else if (sab0.i(purchaseType) && this.vipFrag && g6a.m15592o()) {
            drawable = this.act.drawable(d3c0.o5);
        } else if (!this.privilegeStyle) {
            drawable = this.act.drawable(d3c0.Za);
        } else if (sab0.w(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.Z7);
        } else if (sab0.q(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.Y7);
        } else if (sab0.i(this.purchaseType) || sab0.j(this.purchaseType) || sab0.p(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.I6);
        } else if (sab0.o(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.w7);
        } else if (sab0.g(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.P6);
        } else {
            boolean zX2 = sab0.x(this.purchaseType);
            Act act2 = this.act;
            drawable = zX2 ? act2.drawable(d3c0.v7) : act2.drawable(d3c0.Z7);
        }
        vCheckBoxM24884o.setBackground(drawable);
        m24884o().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.s0b0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                u0b0.m24873f(this.f20967a, compoundButton, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m24881r(final d section, final PurchaseAgreementState agreementState) {
        e51.F(this.act, new Runnable() { // from class: l.t0b0
            @Override // java.lang.Runnable
            public final void run() {
                u0b0.m24872e(section, this, agreementState);
            }
        });
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.K1, root, false);
        viewInflate.getClass();
        m24882g(viewInflate);
        m24880q();
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public final void m24882g(View view) {
        v0b0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m24883n() {
        VText vText = this._agreement;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VCheckBox m24884o() {
        VCheckBox vCheckBox = this._check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LinearLayout m24885p() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_root");
        return null;
    }

    @Override // p006l.d1m
    public void register() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7347J(new C1329a());
            j5b0Var.m7346I(new C1330b());
            j5b0Var.m7343F(new C1331c());
            j5b0Var.m7345H(new C1332d());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m24886s(@Nullable d dVar) {
        this.currentPurchaseSectionSource = dVar;
    }

    /* JADX INFO: renamed from: t */
    public final void m24887t(boolean privilegeType) {
        this.privilegeStyle = privilegeType;
    }

    /* JADX INFO: renamed from: u */
    public final void m24888u(boolean purchasePageType) {
        this.purchasePageType = purchasePageType;
    }

    /* JADX INFO: renamed from: v */
    public final void m24889v(boolean vipFrag) {
        this.vipFrag = vipFrag;
    }

    @Override // p006l.d1m
    public void release() {
    }
}
