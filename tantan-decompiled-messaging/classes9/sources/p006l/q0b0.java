package p006l;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
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
import l.d30;
import l.d3c0;
import l.e51;
import l.m6c0;
import l.r0b0;
import l.sab0;
import l.sd0;
import l.t100;
import l.we60;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0013J!\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u001fR\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010W¨\u0006Z"}, d2 = {"Ll/q0b0;", "Ll/b5;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "register", "()V", "", "privilegeType", "w", "(Z)V", "purchasePageType", "x", "vipFrag", "y", "release", "view", "i", "(Landroid/view/View;)V", "s", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "v", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "o", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "d", "Ljava/lang/String;", "e", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "q", "()Landroid/widget/LinearLayout;", "set_agreement_root", "(Landroid/widget/LinearLayout;)V", "_agreement_root", "g", "Landroid/view/View;", "r", "()Landroid/view/View;", "set_check", "_check", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "p", "()Landroid/widget/TextView;", "set_agreement", "(Landroid/widget/TextView;)V", "_agreement", "", "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/data/PayMethod;", "k", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/gd0;", "l", "Ll/gd0;", "agreementTextStrategiesHelper", "m", "Z", "privilegeStyle", "n", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0b0 extends AbstractC0547b5 {

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

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean privilegeStyle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean purchasePageType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean vipFrag;

    /* JADX INFO: renamed from: l.q0b0$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/q0b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1158a implements AbstractC0212a.e {
        public C1158a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends d> sections) {
            sections.getClass();
            q0b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.q0b0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/q0b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1159b implements AbstractC0212a.d {
        public C1159b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(d section, boolean scroll, boolean isClick, d sectionSource) {
            section.getClass();
            q0b0.this.currentPurchaseSection = section;
            q0b0 q0b0Var = q0b0.this;
            q0b0Var.m21912v(section, q0b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.q0b0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/q0b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C1160c implements AbstractC0212a.a {
        public C1160c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.a
        /* JADX INFO: renamed from: a */
        public void mo7379a(PayMethod payMethod) {
            payMethod.getClass();
            q0b0.this.currentPayMethod = payMethod;
            d dVar = q0b0.this.currentPurchaseSection;
            if (dVar != null) {
                q0b0 q0b0Var = q0b0.this;
                q0b0Var.m21912v(dVar, q0b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.q0b0$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/q0b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C1161d implements AbstractC0212a.c {
        public C1161d() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.c
        /* JADX INFO: renamed from: a */
        public void mo7380a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            q0b0.this.m12556d(agreementState);
            d dVar = q0b0.this.currentPurchaseSection;
            if (dVar != null) {
                q0b0.this.m21912v(dVar, agreementState);
            }
        }
    }

    public q0b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m21895e(q0b0 q0b0Var, d dVar) {
        q0b0Var.m21910r().setSelected(dVar.m());
        CharSequence charSequenceM21907o = q0b0Var.m21907o(dVar);
        if (charSequenceM21907o instanceof Spannable) {
            q0b0Var.m21908p().setOnTouchListener(new sd0((Spannable) charSequenceM21907o));
        } else {
            q0b0Var.m21908p().setOnTouchListener(null);
        }
        q0b0Var.m21908p().setText(charSequenceM21907o);
        j5b0 j5b0Var = q0b0Var.mediator;
        xdl0.M(q0b0Var.m21909q(), j5b0Var != null ? j5b0Var.m7355R(dVar, q0b0Var.currentPayMethod) : false);
    }

    /* JADX INFO: renamed from: h */
    public static void m21898h(final q0b0 q0b0Var, View view) {
        d dVar;
        if (q0b0Var.currentPurchaseSection == null || q0b0Var.currentPayMethod == null || q0b0Var.getCurrentAgreementState() == null || (dVar = q0b0Var.currentPurchaseSection) == null) {
            return;
        }
        if (dVar.m()) {
            we60.V(q0b0Var.act, q0b0Var.purchaseType, q0b0Var.currentPurchaseSection, new d30() { // from class: l.o0b0
                public final void call() {
                    q0b0.m21904t();
                }
            }, new d30() { // from class: l.p0b0
                public final void call() {
                    q0b0.m21905u(this.f18533a);
                }
            });
            return;
        }
        PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.CHECKED;
        j5b0 j5b0Var = q0b0Var.mediator;
        if (j5b0Var != null) {
            j5b0Var.m17273W(purchaseAgreementState);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m21905u(q0b0 q0b0Var) {
        PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.UNCHECKED;
        j5b0 j5b0Var = q0b0Var.mediator;
        if (j5b0Var != null) {
            j5b0Var.m17273W(purchaseAgreementState);
        }
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.J1, root, false);
        viewInflate.getClass();
        m21906i(viewInflate);
        m21911s();
        return viewInflate;
    }

    /* JADX INFO: renamed from: i */
    public final void m21906i(View view) {
        r0b0.a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final CharSequence m21907o(d section) {
        d.a aVarB = section.b();
        aVarB.getClass();
        Merchandise merchandiseS = aVarB.s();
        if (this.agreementTextStrategiesHelper == null) {
            gd0 gd0Var = new gd0(this.act, this.purchaseType, this.from);
            this.agreementTextStrategiesHelper = gd0Var;
            gd0Var.m15712b();
        }
        merchandiseS.getClass();
        fd0 fd0Var = new fd0(aVarB, merchandiseS, this.currentPayMethod, this.purchasePageType, false, this.privilegeStyle, this.vipFrag, 16, null);
        gd0 gd0Var2 = this.agreementTextStrategiesHelper;
        if (gd0Var2 == null) {
            Intrinsics.r("agreementTextStrategiesHelper");
            gd0Var2 = null;
        }
        return gd0Var2.m15711a(fd0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m21908p() {
        TextView textView = this._agreement;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LinearLayout m21909q() {
        LinearLayout linearLayout = this._agreement_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final View m21910r() {
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
            j5b0Var.m7347J(new C1158a());
            j5b0Var.m7346I(new C1159b());
            j5b0Var.m7343F(new C1160c());
            j5b0Var.m7345H(new C1161d());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m21911s() {
        Drawable drawable;
        if (TextUtils.equals(this.from, "purchasePage")) {
            LinearLayout linearLayoutM21909q = m21909q();
            int i = t100.m;
            linearLayoutM21909q.setPadding(i, 0, i, 0);
        }
        m21908p().setTextColor(we60.Q(this.privilegeStyle));
        View viewM21910r = m21910r();
        if (this.purchasePageType) {
            if (sab0.i(this.purchaseType)) {
                drawable = this.act.drawable(d3c0.O7);
            } else {
                boolean zQ = sab0.q(this.purchaseType);
                Act act = this.act;
                drawable = zQ ? act.drawable(d3c0.P7) : act.drawable(d3c0.Q7);
            }
        } else if (!this.privilegeStyle) {
            drawable = this.act.drawable(d3c0.M7);
        } else if (sab0.i(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.N7);
        } else if (sab0.o(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.R7);
        } else {
            drawable = (sab0.q(this.purchaseType) || sab0.m(this.purchaseType)) ? this.act.drawable(d3c0.S7) : this.act.drawable(d3c0.T7);
        }
        viewM21910r.setBackground(drawable);
        xdl0.E0(m21910r(), new View.OnClickListener() { // from class: l.m0b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q0b0.m21898h(this.f16741a, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m21912v(final d section, PurchaseAgreementState agreementState) {
        e51.F(this.act, new Runnable() { // from class: l.n0b0
            @Override // java.lang.Runnable
            public final void run() {
                q0b0.m21895e(this.f17429a, section);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m21913w(boolean privilegeType) {
        this.privilegeStyle = privilegeType;
    }

    /* JADX INFO: renamed from: x */
    public final void m21914x(boolean purchasePageType) {
        this.purchasePageType = purchasePageType;
    }

    /* JADX INFO: renamed from: y */
    public final void m21915y(boolean vipFrag) {
        this.vipFrag = vipFrag;
    }

    /* JADX INFO: renamed from: t */
    public static final void m21904t() {
    }

    @Override // p006l.d1m
    public void release() {
    }
}
