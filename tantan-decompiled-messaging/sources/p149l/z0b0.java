package p149l;

import android.graphics.Color;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010!R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010K¨\u0006M"}, m87232d2 = {"Ll/z0b0;", "Ll/b5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "", "p", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "q", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "release", OMSTemplateModeType.view, "f", "(Landroid/view/View;)V", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "n", "()Landroid/widget/LinearLayout;", "set_agreement_root", "(Landroid/widget/LinearLayout;)V", "_agreement_root", "g", "Landroid/view/View;", "o", "()Landroid/view/View;", "set_check", "_check", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "m", "()Landroid/widget/TextView;", "set_agreement", "(Landroid/widget/TextView;)V", "_agreement", "", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/data/PayMethod;", "k", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/gd0;", "Ll/gd0;", "agreementTextStrategiesHelper", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class z0b0 extends AbstractC15802b5 {

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
    public List<? extends C8765d> sections;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public gd0 agreementTextStrategiesHelper;

    /* JADX INFO: renamed from: l.z0b0$a */
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/z0b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21590a implements AbstractC8776a.e {
        public C21590a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.e
        /* JADX INFO: renamed from: a */
        public void mo53996a(List<? extends C8765d> sections) {
            sections.getClass();
            z0b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.z0b0$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/z0b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21591b implements AbstractC8776a.d {
        public C21591b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.d
        /* JADX INFO: renamed from: a */
        public void mo53997a(C8765d section, boolean scroll, boolean isClick, C8765d sectionSource) {
            section.getClass();
            z0b0.this.currentPurchaseSection = section;
            z0b0 z0b0Var = z0b0.this;
            z0b0Var.m216728q(section, z0b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.z0b0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/z0b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C21592c implements AbstractC8776a.a {
        public C21592c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.a
        /* JADX INFO: renamed from: a */
        public void mo54044a(PayMethod payMethod) {
            payMethod.getClass();
            z0b0.this.currentPayMethod = payMethod;
            C8765d c8765d = z0b0.this.currentPurchaseSection;
            if (c8765d != null) {
                z0b0 z0b0Var = z0b0.this;
                z0b0Var.m216728q(c8765d, z0b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.z0b0$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/z0b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C21593d implements AbstractC8776a.c {
        public C21593d() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.c
        /* JADX INFO: renamed from: a */
        public void mo54045a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            z0b0.this.m100280d(agreementState);
            C8765d c8765d = z0b0.this.currentPurchaseSection;
            if (c8765d != null) {
                z0b0.this.m216728q(c8765d, agreementState);
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
    public static void m216720e(z0b0 z0b0Var, View view) throws Exception {
        C8765d c8765d;
        if (z0b0Var.currentPurchaseSection == null || z0b0Var.currentPayMethod == null || z0b0Var.getCurrentAgreementState() == null || (c8765d = z0b0Var.currentPurchaseSection) == null) {
            return;
        }
        boolean zM53532n = true;
        if (dsa.m113447t(null, 1, null)) {
            j5b0 j5b0Var = z0b0Var.mediator;
            if ((j5b0Var != null ? j5b0Var.getCurrentAgreementState() : null) != PurchaseAgreementState.CHECKED) {
                zM53532n = false;
            }
        } else {
            zM53532n = c8765d.m53532n();
        }
        if (zM53532n) {
            PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.UNCHECKED;
            j5b0 j5b0Var2 = z0b0Var.mediator;
            if (j5b0Var2 != null) {
                j5b0Var2.m139827W(purchaseAgreementState);
                return;
            }
            return;
        }
        PurchaseAgreementState purchaseAgreementState2 = PurchaseAgreementState.CHECKED;
        j5b0 j5b0Var3 = z0b0Var.mediator;
        if (j5b0Var3 != null) {
            j5b0Var3.m139827W(purchaseAgreementState2);
        }
    }

    /* JADX INFO: renamed from: l */
    private final CharSequence m216726l(C8765d section) {
        C8765d.a aVarM53520b = section.m53520b();
        aVarM53520b.getClass();
        Merchandise merchandiseM53601s = aVarM53520b.m53601s();
        if (this.agreementTextStrategiesHelper == null) {
            gd0 gd0Var = new gd0(this.act, this.purchaseType, this.from);
            this.agreementTextStrategiesHelper = gd0Var;
            gd0Var.m125529b();
        }
        merchandiseM53601s.getClass();
        fd0 fd0Var = new fd0(aVarM53520b, merchandiseM53601s, this.currentPayMethod, false, false, false, false, 120, null);
        gd0 gd0Var2 = this.agreementTextStrategiesHelper;
        if (gd0Var2 == null) {
            Intrinsics.m87502r("agreementTextStrategiesHelper");
            gd0Var2 = null;
        }
        return gd0Var2.m125528a(fd0Var);
    }

    /* JADX INFO: renamed from: p */
    private final void m216727p() {
        m216730m().setTextColor(sab0.m182891i(this.purchaseType) ? Color.parseColor("#ffdea2") : Color.parseColor("#33000000"));
        View viewM216732o = m216732o();
        boolean zM182891i = sab0.m182891i(this.purchaseType);
        Act act = this.act;
        viewM216732o.setBackground(zM182891i ? act.drawable(d3c0.f83771U7) : act.drawable(d3c0.f83784V7));
        xdl0.m208329E0(m216732o(), new View.OnClickListener() { // from class: l.y0b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                z0b0.m216720e(this.f195288a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m216728q(C8765d section, PurchaseAgreementState agreementState) {
        boolean zM53532n = true;
        if (!dsa.m113447t(null, 1, null)) {
            zM53532n = section.m53532n();
        } else if (agreementState != PurchaseAgreementState.CHECKED) {
            zM53532n = false;
        }
        m216732o().setSelected(zM53532n);
        CharSequence charSequenceM216726l = m216726l(section);
        if (charSequenceM216726l instanceof Spannable) {
            m216730m().setOnTouchListener(new sd0((Spannable) charSequenceM216726l));
        } else {
            m216730m().setOnTouchListener(null);
        }
        m216730m().setText(charSequenceM216726l);
        j5b0 j5b0Var = this.mediator;
        xdl0.m208344M(m216731n(), j5b0Var != null ? j5b0Var.m54020R(section, this.currentPayMethod) : false);
    }

    @Override // p149l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo95244a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.f131503L1, root, false);
        viewInflate.getClass();
        m216729f(viewInflate);
        m216727p();
        return viewInflate;
    }

    /* JADX INFO: renamed from: f */
    public final void m216729f(View view) {
        a1b0.m94547a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final TextView m216730m() {
        TextView textView = this._agreement;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LinearLayout m216731n() {
        LinearLayout linearLayout = this._agreement_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final View m216732o() {
        View view = this._check;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_check");
        return null;
    }

    @Override // p149l.d1m
    public void register() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54012J(new C21590a());
            j5b0Var.m54011I(new C21591b());
            j5b0Var.m54008F(new C21592c());
            j5b0Var.m54010H(new C21593d());
        }
    }

    @Override // p149l.d1m
    public void release() {
    }
}
