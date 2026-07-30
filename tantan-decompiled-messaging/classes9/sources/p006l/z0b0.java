package p006l;

import android.graphics.Color;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import l.a1b0;
import l.d3c0;
import l.m6c0;
import l.sab0;
import l.sd0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010!R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010K¨\u0006M"}, d2 = {"Ll/z0b0;", "Ll/b5;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "", "p", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "q", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "l", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "release", "view", "f", "(Landroid/view/View;)V", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "d", "Ljava/lang/String;", "e", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "n", "()Landroid/widget/LinearLayout;", "set_agreement_root", "(Landroid/widget/LinearLayout;)V", "_agreement_root", "g", "Landroid/view/View;", "o", "()Landroid/view/View;", "set_check", "_check", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "m", "()Landroid/widget/TextView;", "set_agreement", "(Landroid/widget/TextView;)V", "_agreement", "", "i", "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/data/PayMethod;", "k", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/gd0;", "Ll/gd0;", "agreementTextStrategiesHelper", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z0b0 extends AbstractC0547b5 {

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
    public LinearLayout _agreement_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _check;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _agreement;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<? extends d> sections;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public d currentPurchaseSection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public gd0 agreementTextStrategiesHelper;

    /* JADX INFO: renamed from: l.z0b0$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/z0b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1506a implements AbstractC0212a.e {
        public C1506a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends d> sections) {
            sections.getClass();
            z0b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.z0b0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/z0b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1507b implements AbstractC0212a.d {
        public C1507b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(d section, boolean scroll, boolean isClick, d sectionSource) {
            section.getClass();
            z0b0.this.currentPurchaseSection = section;
            z0b0 z0b0Var = z0b0.this;
            z0b0Var.m28533q(section, z0b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.z0b0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/z0b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C1508c implements AbstractC0212a.a {
        public C1508c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.a
        /* JADX INFO: renamed from: a */
        public void mo7379a(PayMethod payMethod) {
            payMethod.getClass();
            z0b0.this.currentPayMethod = payMethod;
            d dVar = z0b0.this.currentPurchaseSection;
            if (dVar != null) {
                z0b0 z0b0Var = z0b0.this;
                z0b0Var.m28533q(dVar, z0b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.z0b0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/z0b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C1509d implements AbstractC0212a.c {
        public C1509d() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.c
        /* JADX INFO: renamed from: a */
        public void mo7380a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            z0b0.this.m12556d(agreementState);
            d dVar = z0b0.this.currentPurchaseSection;
            if (dVar != null) {
                z0b0.this.m28533q(dVar, agreementState);
            }
        }
    }

    public z0b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m28525e(z0b0 z0b0Var, View view) {
        d dVar;
        if (z0b0Var.currentPurchaseSection == null || z0b0Var.currentPayMethod == null || z0b0Var.getCurrentAgreementState() == null || (dVar = z0b0Var.currentPurchaseSection) == null) {
            return;
        }
        boolean zN = true;
        if (dsa.m14212t(null, 1, null)) {
            j5b0 j5b0Var = z0b0Var.mediator;
            if ((j5b0Var != null ? j5b0Var.getCurrentAgreementState() : null) != PurchaseAgreementState.CHECKED) {
                zN = false;
            }
        } else {
            zN = dVar.n();
        }
        if (zN) {
            PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.UNCHECKED;
            j5b0 j5b0Var2 = z0b0Var.mediator;
            if (j5b0Var2 != null) {
                j5b0Var2.m17273W(purchaseAgreementState);
                return;
            }
            return;
        }
        PurchaseAgreementState purchaseAgreementState2 = PurchaseAgreementState.CHECKED;
        j5b0 j5b0Var3 = z0b0Var.mediator;
        if (j5b0Var3 != null) {
            j5b0Var3.m17273W(purchaseAgreementState2);
        }
    }

    /* JADX INFO: renamed from: l */
    private final CharSequence m28531l(d section) {
        d.a aVarB = section.b();
        aVarB.getClass();
        Merchandise merchandiseS = aVarB.s();
        if (this.agreementTextStrategiesHelper == null) {
            gd0 gd0Var = new gd0(this.act, this.purchaseType, this.from);
            this.agreementTextStrategiesHelper = gd0Var;
            gd0Var.m15712b();
        }
        merchandiseS.getClass();
        fd0 fd0Var = new fd0(aVarB, merchandiseS, this.currentPayMethod, false, false, false, false, 120, null);
        gd0 gd0Var2 = this.agreementTextStrategiesHelper;
        if (gd0Var2 == null) {
            Intrinsics.r("agreementTextStrategiesHelper");
            gd0Var2 = null;
        }
        return gd0Var2.m15711a(fd0Var);
    }

    /* JADX INFO: renamed from: p */
    private final void m28532p() {
        m28535m().setTextColor(sab0.i(this.purchaseType) ? Color.parseColor("#ffdea2") : Color.parseColor("#33000000"));
        View viewM28537o = m28537o();
        boolean zI = sab0.i(this.purchaseType);
        Act act = this.act;
        viewM28537o.setBackground(zI ? act.drawable(d3c0.U7) : act.drawable(d3c0.V7));
        xdl0.E0(m28537o(), new View.OnClickListener() { // from class: l.y0b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z0b0.m28525e(this.f27836a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m28533q(d section, PurchaseAgreementState agreementState) {
        boolean zN = true;
        if (!dsa.m14212t(null, 1, null)) {
            zN = section.n();
        } else if (agreementState != PurchaseAgreementState.CHECKED) {
            zN = false;
        }
        m28537o().setSelected(zN);
        CharSequence charSequenceM28531l = m28531l(section);
        if (charSequenceM28531l instanceof Spannable) {
            m28535m().setOnTouchListener(new sd0((Spannable) charSequenceM28531l));
        } else {
            m28535m().setOnTouchListener(null);
        }
        m28535m().setText(charSequenceM28531l);
        j5b0 j5b0Var = this.mediator;
        xdl0.M(m28536n(), j5b0Var != null ? j5b0Var.m7355R(section, this.currentPayMethod) : false);
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.L1, root, false);
        viewInflate.getClass();
        m28534f(viewInflate);
        m28532p();
        return viewInflate;
    }

    /* JADX INFO: renamed from: f */
    public final void m28534f(View view) {
        a1b0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final TextView m28535m() {
        TextView textView = this._agreement;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LinearLayout m28536n() {
        LinearLayout linearLayout = this._agreement_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final View m28537o() {
        View view = this._check;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_check");
        return null;
    }

    @Override // p006l.d1m
    public void register() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7347J(new C1506a());
            j5b0Var.m7346I(new C1507b());
            j5b0Var.m7343F(new C1508c());
            j5b0Var.m7345H(new C1509d());
        }
    }

    @Override // p006l.d1m
    public void release() {
    }
}
