package p153l;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
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
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0013J!\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010?\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u001fR\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010W¨\u0006Z"}, m88121d2 = {"Ll/u8b0;", "Ll/z4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "register", "()V", "", "privilegeType", "w", "(Z)V", "purchasePageType", BaseSei.f14624X, "vipFrag", BaseSei.f14625Y, "release", OMSTemplateModeType.view, RXScreenCaptureService.KEY_INDEX, "(Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", ResourceDirection.f39656v, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "o", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "Ll/ndb0;", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "q", "()Landroid/widget/LinearLayout;", "set_agreement_root", "(Landroid/widget/LinearLayout;)V", "_agreement_root", "g", "Landroid/view/View;", "r", "()Landroid/view/View;", "set_check", "_check", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "p", "()Landroid/widget/TextView;", "set_agreement", "(Landroid/widget/TextView;)V", "_agreement", "", "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/data/PayMethod;", "k", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/cd0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/cd0;", "agreementTextStrategiesHelper", "m", "Z", "privilegeStyle", "n", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class u8b0 extends AbstractC21759z4 {

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

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean privilegeStyle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean purchasePageType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean vipFrag;

    /* JADX INFO: renamed from: l.u8b0$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/u8b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20519a implements AbstractC8939a.e {
        public C20519a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            u8b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.u8b0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/u8b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20520b implements AbstractC8939a.d {
        public C20520b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            u8b0.this.currentPurchaseSection = section;
            u8b0 u8b0Var = u8b0.this;
            u8b0Var.m195010v(section, u8b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.u8b0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/u8b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C20521c implements AbstractC8939a.a {
        public C20521c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            payMethod.getClass();
            u8b0.this.currentPayMethod = payMethod;
            C8928d c8928d = u8b0.this.currentPurchaseSection;
            if (c8928d != null) {
                u8b0 u8b0Var = u8b0.this;
                u8b0Var.m195010v(c8928d, u8b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.u8b0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/u8b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C20522d implements AbstractC8939a.c {
        public C20522d() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.c
        /* JADX INFO: renamed from: a */
        public void mo55228a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            u8b0.this.m218525d(agreementState);
            C8928d c8928d = u8b0.this.currentPurchaseSection;
            if (c8928d != null) {
                u8b0.this.m195010v(c8928d, agreementState);
            }
        }
    }

    public u8b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m194993e(u8b0 u8b0Var, C8928d c8928d) {
        u8b0Var.m195008r().setSelected(c8928d.m54714m());
        CharSequence charSequenceM195005o = u8b0Var.m195005o(c8928d);
        if (charSequenceM195005o instanceof Spannable) {
            u8b0Var.m195006p().setOnTouchListener(new od0((Spannable) charSequenceM195005o));
        } else {
            u8b0Var.m195006p().setOnTouchListener(null);
        }
        u8b0Var.m195006p().setText(charSequenceM195005o);
        ndb0 ndb0Var = u8b0Var.mediator;
        bnl0.m105524M(u8b0Var.m195007q(), ndb0Var != null ? ndb0Var.m55203R(c8928d, u8b0Var.currentPayMethod) : false);
    }

    /* JADX INFO: renamed from: h */
    public static void m194996h(final u8b0 u8b0Var, View view) throws Exception {
        C8928d c8928d;
        if (u8b0Var.currentPurchaseSection == null || u8b0Var.currentPayMethod == null || u8b0Var.getCurrentAgreementState() == null || (c8928d = u8b0Var.currentPurchaseSection) == null) {
            return;
        }
        if (c8928d.m54714m()) {
            bn60.m105339V(u8b0Var.act, u8b0Var.purchaseType, u8b0Var.currentPurchaseSection, new x20() { // from class: l.s8b0
                @Override // p153l.x20
                public final void call() {
                    u8b0.m195002t();
                }
            }, new x20() { // from class: l.t8b0
                @Override // p153l.x20
                public final void call() throws Exception {
                    u8b0.m195003u(this.f172518a);
                }
            });
            return;
        }
        PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.CHECKED;
        ndb0 ndb0Var = u8b0Var.mediator;
        if (ndb0Var != null) {
            ndb0Var.m162671W(purchaseAgreementState);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m195003u(u8b0 u8b0Var) throws Exception {
        PurchaseAgreementState purchaseAgreementState = PurchaseAgreementState.UNCHECKED;
        ndb0 ndb0Var = u8b0Var.mediator;
        if (ndb0Var != null) {
            ndb0Var.m162671W(purchaseAgreementState);
        }
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162455J1, root, false);
        viewInflate.getClass();
        m195004i(viewInflate);
        m195009s();
        return viewInflate;
    }

    /* JADX INFO: renamed from: i */
    public final void m195004i(View view) {
        v8b0.m200296a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final CharSequence m195005o(C8928d section) {
        C8928d.a aVarM54703b = section.m54703b();
        aVarM54703b.getClass();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        if (this.agreementTextStrategiesHelper == null) {
            cd0 cd0Var = new cd0(this.act, this.purchaseType, this.from);
            this.agreementTextStrategiesHelper = cd0Var;
            cd0Var.m109082b();
        }
        merchandiseM54784s.getClass();
        bd0 bd0Var = new bd0(aVarM54703b, merchandiseM54784s, this.currentPayMethod, this.purchasePageType, false, this.privilegeStyle, this.vipFrag, 16, null);
        cd0 cd0Var2 = this.agreementTextStrategiesHelper;
        if (cd0Var2 == null) {
            Intrinsics.m88391r("agreementTextStrategiesHelper");
            cd0Var2 = null;
        }
        return cd0Var2.m109081a(bd0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m195006p() {
        TextView textView = this._agreement;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LinearLayout m195007q() {
        LinearLayout linearLayout = this._agreement_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final View m195008r() {
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
            ndb0Var.m55195J(new C20519a());
            ndb0Var.m55194I(new C20520b());
            ndb0Var.m55191F(new C20521c());
            ndb0Var.m55193H(new C20522d());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m195009s() {
        Drawable drawable;
        if (TextUtils.equals(this.from, "purchasePage")) {
            LinearLayout linearLayoutM195007q = m195007q();
            int i = qa00.f156326m;
            linearLayoutM195007q.setPadding(i, 0, i, 0);
        }
        m195006p().setTextColor(bn60.m105334Q(this.privilegeStyle));
        View viewM195008r = m195008r();
        if (this.purchasePageType) {
            if (wib0.m206565i(this.purchaseType)) {
                drawable = this.act.drawable(jbc0.f119346O7);
            } else {
                boolean zM206573q = wib0.m206573q(this.purchaseType);
                Act act = this.act;
                drawable = zM206573q ? act.drawable(jbc0.f119360P7) : act.drawable(jbc0.f119374Q7);
            }
        } else if (!this.privilegeStyle) {
            drawable = this.act.drawable(jbc0.f119318M7);
        } else if (wib0.m206565i(this.purchaseType)) {
            drawable = this.act.drawable(jbc0.f119332N7);
        } else if (wib0.m206571o(this.purchaseType)) {
            drawable = this.act.drawable(jbc0.f119387R7);
        } else {
            drawable = (wib0.m206573q(this.purchaseType) || wib0.m206569m(this.purchaseType)) ? this.act.drawable(jbc0.f119400S7) : this.act.drawable(jbc0.f119413T7);
        }
        viewM195008r.setBackground(drawable);
        bnl0.m105509E0(m195008r(), new View.OnClickListener() { // from class: l.q8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                u8b0.m194996h(this.f156089a, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m195010v(final C8928d section, PurchaseAgreementState agreementState) {
        l51.m152886F(this.act, new Runnable() { // from class: l.r8b0
            @Override // java.lang.Runnable
            public final void run() {
                u8b0.m194993e(this.f161694a, section);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m195011w(boolean privilegeType) {
        this.privilegeStyle = privilegeType;
    }

    /* JADX INFO: renamed from: x */
    public final void m195012x(boolean purchasePageType) {
        this.purchasePageType = purchasePageType;
    }

    /* JADX INFO: renamed from: y */
    public final void m195013y(boolean vipFrag) {
        this.vipFrag = vipFrag;
    }

    /* JADX INFO: renamed from: t */
    public static final void m195002t() {
    }

    @Override // p153l.w3m
    public void release() {
    }
}
