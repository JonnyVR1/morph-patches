package p153l;

import android.graphics.Color;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010!R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010K¨\u0006M"}, m88121d2 = {"Ll/d9b0;", "Ll/z4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "", "p", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "q", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "release", OMSTemplateModeType.view, "f", "(Landroid/view/View;)V", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "Ll/ndb0;", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "n", "()Landroid/widget/LinearLayout;", "set_agreement_root", "(Landroid/widget/LinearLayout;)V", "_agreement_root", "g", "Landroid/view/View;", "o", "()Landroid/view/View;", "set_check", "_check", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "m", "()Landroid/widget/TextView;", "set_agreement", "(Landroid/widget/TextView;)V", "_agreement", "", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/data/PayMethod;", "k", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/cd0;", "Ll/cd0;", "agreementTextStrategiesHelper", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d9b0 extends AbstractC21759z4 {

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
    public final ndb0 mediator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _agreement_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _check;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _agreement;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<? extends C8928d> sections;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public cd0 agreementTextStrategiesHelper;

    /* JADX INFO: renamed from: l.d9b0$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/d9b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16485a implements AbstractC8939a.e {
        public C16485a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            d9b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.d9b0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/d9b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16486b implements AbstractC8939a.d {
        public C16486b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            d9b0.this.currentPurchaseSection = section;
            d9b0 d9b0Var = d9b0.this;
            d9b0Var.m115006q(section, d9b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.d9b0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/d9b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C16487c implements AbstractC8939a.a {
        public C16487c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            payMethod.getClass();
            d9b0.this.currentPayMethod = payMethod;
            C8928d c8928d = d9b0.this.currentPurchaseSection;
            if (c8928d != null) {
                d9b0 d9b0Var = d9b0.this;
                d9b0Var.m115006q(c8928d, d9b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.d9b0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/d9b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C16488d implements AbstractC8939a.c {
        public C16488d() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.c
        /* JADX INFO: renamed from: a */
        public void mo55228a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            d9b0.this.m218525d(agreementState);
            C8928d c8928d = d9b0.this.currentPurchaseSection;
            if (c8928d != null) {
                d9b0.this.m115006q(c8928d, agreementState);
            }
        }
    }

    public d9b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m114998e(d9b0 d9b0Var, View view) throws Exception {
        C8928d c8928d;
        if (d9b0Var.currentPurchaseSection == null || d9b0Var.currentPayMethod == null || d9b0Var.getCurrentAgreementState() == null || (c8928d = d9b0Var.currentPurchaseSection) == null) {
            return;
        }
        boolean zM54715n = true;
        if (pta.m173727t(null, 1, null)) {
            ndb0 ndb0Var = d9b0Var.mediator;
            if ((ndb0Var != null ? ndb0Var.getCurrentAgreementState() : null) != PurchaseAgreementState.CHECKED) {
                zM54715n = false;
            }
        } else {
            zM54715n = c8928d.m54715n();
        }
        if (zM54715n) {
            PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.UNCHECKED;
            ndb0 ndb0Var2 = d9b0Var.mediator;
            if (ndb0Var2 != null) {
                ndb0Var2.m162671W(purchaseAgreementState);
                return;
            }
            return;
        }
        PurchaseAgreementState purchaseAgreementState2 = PurchaseAgreementState.CHECKED;
        ndb0 ndb0Var3 = d9b0Var.mediator;
        if (ndb0Var3 != null) {
            ndb0Var3.m162671W(purchaseAgreementState2);
        }
    }

    /* JADX INFO: renamed from: l */
    private final CharSequence m115004l(C8928d section) {
        C8928d.a aVarM54703b = section.m54703b();
        aVarM54703b.getClass();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        if (this.agreementTextStrategiesHelper == null) {
            cd0 cd0Var = new cd0(this.act, this.purchaseType, this.from);
            this.agreementTextStrategiesHelper = cd0Var;
            cd0Var.m109082b();
        }
        merchandiseM54784s.getClass();
        bd0 bd0Var = new bd0(aVarM54703b, merchandiseM54784s, this.currentPayMethod, false, false, false, false, 120, null);
        cd0 cd0Var2 = this.agreementTextStrategiesHelper;
        if (cd0Var2 == null) {
            Intrinsics.m88391r("agreementTextStrategiesHelper");
            cd0Var2 = null;
        }
        return cd0Var2.m109081a(bd0Var);
    }

    /* JADX INFO: renamed from: p */
    private final void m115005p() {
        m115008m().setTextColor(wib0.m206565i(this.purchaseType) ? Color.parseColor("#ffdea2") : Color.parseColor("#33000000"));
        View viewM115010o = m115010o();
        boolean zM206565i = wib0.m206565i(this.purchaseType);
        Act act = this.act;
        viewM115010o.setBackground(zM206565i ? act.drawable(jbc0.f119426U7) : act.drawable(jbc0.f119439V7));
        bnl0.m105509E0(m115010o(), new View.OnClickListener() { // from class: l.c9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                d9b0.m114998e(this.f80317a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m115006q(C8928d section, PurchaseAgreementState agreementState) {
        boolean zM54715n = true;
        if (!pta.m173727t(null, 1, null)) {
            zM54715n = section.m54715n();
        } else if (agreementState != PurchaseAgreementState.CHECKED) {
            zM54715n = false;
        }
        m115010o().setSelected(zM54715n);
        CharSequence charSequenceM115004l = m115004l(section);
        if (charSequenceM115004l instanceof Spannable) {
            m115008m().setOnTouchListener(new od0((Spannable) charSequenceM115004l));
        } else {
            m115008m().setOnTouchListener(null);
        }
        m115008m().setText(charSequenceM115004l);
        ndb0 ndb0Var = this.mediator;
        bnl0.m105524M(m115009n(), ndb0Var != null ? ndb0Var.m55203R(section, this.currentPayMethod) : false);
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162463L1, root, false);
        viewInflate.getClass();
        m115007f(viewInflate);
        m115005p();
        return viewInflate;
    }

    /* JADX INFO: renamed from: f */
    public final void m115007f(View view) {
        e9b0.m119881a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final TextView m115008m() {
        TextView textView = this._agreement;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LinearLayout m115009n() {
        LinearLayout linearLayout = this._agreement_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final View m115010o() {
        View view = this._check;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_check");
        return null;
    }

    @Override // p153l.w3m
    public void register() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55195J(new C16485a());
            ndb0Var.m55194I(new C16486b());
            ndb0Var.m55191F(new C16487c());
            ndb0Var.m55193H(new C16488d());
        }
    }

    @Override // p153l.w3m
    public void release() {
    }
}
