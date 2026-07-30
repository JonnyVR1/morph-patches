package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
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
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010U\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010N\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010[R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010]R\u0016\u0010^\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010]R\u0016\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010]¨\u0006_"}, m88121d2 = {"Ll/y8b0;", "Ll/z4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "", "q", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "r", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "", "privilegeType", Constants.KEY_T, "(Z)V", "purchasePageType", "u", "vipFrag", ResourceDirection.f39656v, "release", OMSTemplateModeType.view, "g", "(Landroid/view/View;)V", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "Ll/ndb0;", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "p", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Lv/VCheckBox;", "Lv/VCheckBox;", "o", "()Lv/VCheckBox;", "set_check", "(Lv/VCheckBox;)V", "_check", "Lv/VText;", "h", "Lv/VText;", "n", "()Lv/VText;", "set_agreement", "(Lv/VText;)V", "_agreement", "", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "k", "getCurrentPurchaseSectionSource", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "currentPurchaseSectionSource", "Lcom/p1/mobile/putong/data/PayMethod;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/cd0;", "Ll/cd0;", "agreementTextStrategiesHelper", "Z", "privilegeStyle", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class y8b0 extends AbstractC21759z4 {

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
    public LinearLayout _root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VCheckBox _check;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _agreement;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<? extends C8928d> sections;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSectionSource;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public cd0 agreementTextStrategiesHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean purchasePageType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean privilegeStyle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean vipFrag;

    /* JADX INFO: renamed from: l.y8b0$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/y8b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21541a implements AbstractC8939a.e {
        public C21541a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            y8b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.y8b0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/y8b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21542b implements AbstractC8939a.d {
        public C21542b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            y8b0.this.currentPurchaseSection = section;
            y8b0.this.m214746s(sectionSource);
            y8b0 y8b0Var = y8b0.this;
            y8b0Var.m214741r(section, y8b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.y8b0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/y8b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C21543c implements AbstractC8939a.a {
        public C21543c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            payMethod.getClass();
            y8b0.this.currentPayMethod = payMethod;
            C8928d c8928d = y8b0.this.currentPurchaseSection;
            if (c8928d != null) {
                y8b0 y8b0Var = y8b0.this;
                y8b0Var.m214741r(c8928d, y8b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.y8b0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/y8b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C21544d implements AbstractC8939a.c {
        public C21544d() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.c
        /* JADX INFO: renamed from: a */
        public void mo55228a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            y8b0.this.m218525d(agreementState);
            C8928d c8928d = y8b0.this.currentPurchaseSection;
            if (c8928d != null) {
                y8b0.this.m214741r(c8928d, agreementState);
            }
        }
    }

    public y8b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m214732e(C8928d c8928d, y8b0 y8b0Var, PurchaseAgreementState purchaseAgreementState) {
        if (c8928d.m54714m() && pta.m173727t(null, 1, null)) {
            bnl0.m105524M(y8b0Var.m214744o(), true);
            y8b0Var.m214744o().setChecked(purchaseAgreementState == PurchaseAgreementState.CHECKED);
            y8b0Var.m214743n().setGravity(8388627);
        } else {
            bnl0.m105524M(y8b0Var.m214744o(), false);
            y8b0Var.m214743n().setGravity(17);
        }
        if (TextUtils.equals(y8b0Var.from, "purchasePage")) {
            y8b0Var.m214745p().setGravity(8388611);
        } else {
            y8b0Var.m214745p().setGravity(17);
        }
        CharSequence charSequenceM214739m = y8b0Var.m214739m(c8928d);
        if (charSequenceM214739m instanceof Spannable) {
            y8b0Var.m214743n().setOnTouchListener(new od0((Spannable) charSequenceM214739m));
        } else {
            y8b0Var.m214743n().setOnTouchListener(null);
        }
        y8b0Var.m214743n().setText(charSequenceM214739m);
    }

    /* JADX INFO: renamed from: f */
    public static void m214733f(y8b0 y8b0Var, CompoundButton compoundButton, boolean z) throws Exception {
        compoundButton.getClass();
        C8928d c8928d = y8b0Var.currentPurchaseSection;
        if (c8928d != null) {
            PurchaseAgreementState purchaseAgreementState = z ? PurchaseAgreementState.CHECKED : PurchaseAgreementState.UNCHECKED;
            ndb0 ndb0Var = y8b0Var.mediator;
            if (ndb0Var != null) {
                C8928d c8928d2 = y8b0Var.currentPurchaseSectionSource;
                if (c8928d2 != null) {
                    c8928d = c8928d2;
                }
                ndb0Var.m162670V(c8928d, purchaseAgreementState);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final CharSequence m214739m(C8928d section) {
        C8928d.a aVarM54705d;
        if (section.m54714m()) {
            aVarM54705d = section.m54703b();
            aVarM54705d.getClass();
        } else {
            aVarM54705d = section.m54705d();
            aVarM54705d.getClass();
        }
        C8928d.a aVar = aVarM54705d;
        Merchandise merchandiseM54784s = aVar.m54784s();
        if (this.agreementTextStrategiesHelper == null) {
            this.agreementTextStrategiesHelper = new cd0(this.act, this.purchaseType, this.from);
        }
        merchandiseM54784s.getClass();
        bd0 bd0Var = new bd0(aVar, merchandiseM54784s, this.currentPayMethod, this.purchasePageType, false, this.privilegeStyle, this.vipFrag, 16, null);
        cd0 cd0Var = this.agreementTextStrategiesHelper;
        if (cd0Var == null) {
            Intrinsics.m88391r("agreementTextStrategiesHelper");
            cd0Var = null;
        }
        return cd0Var.m109081a(bd0Var);
    }

    /* JADX INFO: renamed from: q */
    private final void m214740q() {
        Drawable drawable;
        if (TextUtils.equals(this.from, "purchasePage")) {
            m214745p().setPadding(txq.m193530c(16), 0, txq.m193530c(16), 0);
        }
        m214743n().setTextColor((wib0.m206565i(this.purchaseType) && this.vipFrag && s7a.m184986o()) ? Color.parseColor("#66FFC079") : bn60.m105334Q(this.privilegeStyle));
        m214743n().setGravity(8388627);
        VCheckBox vCheckBoxM214744o = m214744o();
        boolean z = this.purchasePageType;
        PurchaseType purchaseType = this.purchaseType;
        if (z) {
            if (wib0.m206579w(purchaseType) || wib0.m206573q(this.purchaseType)) {
                drawable = this.act.drawable(jbc0.f119275J6);
            } else if (wib0.m206565i(this.purchaseType) || wib0.m206566j(this.purchaseType) || wib0.m206572p(this.purchaseType)) {
                drawable = this.act.drawable(jbc0.f119373Q6);
            } else if (wib0.m206563g(this.purchaseType)) {
                drawable = this.act.drawable(jbc0.f119359P6);
            } else {
                boolean zM206580x = wib0.m206580x(this.purchaseType);
                Act act = this.act;
                drawable = zM206580x ? act.drawable(jbc0.f119798v7) : act.drawable(jbc0.f119491Z7);
            }
        } else if (wib0.m206565i(purchaseType) && this.vipFrag && s7a.m184986o()) {
            drawable = this.act.drawable(jbc0.f119698o5);
        } else if (!this.privilegeStyle) {
            drawable = this.act.drawable(jbc0.f119494Za);
        } else if (wib0.m206579w(this.purchaseType)) {
            drawable = this.act.drawable(jbc0.f119491Z7);
        } else if (wib0.m206573q(this.purchaseType)) {
            drawable = this.act.drawable(jbc0.f119478Y7);
        } else if (wib0.m206565i(this.purchaseType) || wib0.m206566j(this.purchaseType) || wib0.m206572p(this.purchaseType)) {
            drawable = this.act.drawable(jbc0.f119261I6);
        } else if (wib0.m206571o(this.purchaseType)) {
            drawable = this.act.drawable(jbc0.f119812w7);
        } else if (wib0.m206563g(this.purchaseType)) {
            drawable = this.act.drawable(jbc0.f119359P6);
        } else {
            boolean zM206580x2 = wib0.m206580x(this.purchaseType);
            Act act2 = this.act;
            drawable = zM206580x2 ? act2.drawable(jbc0.f119798v7) : act2.drawable(jbc0.f119491Z7);
        }
        vCheckBoxM214744o.setBackground(drawable);
        m214744o().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.w8b0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) throws Exception {
                y8b0.m214733f(this.f187845a, compoundButton, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m214741r(final C8928d section, final PurchaseAgreementState agreementState) {
        l51.m152886F(this.act, new Runnable() { // from class: l.x8b0
            @Override // java.lang.Runnable
            public final void run() {
                y8b0.m214732e(section, this, agreementState);
            }
        });
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162459K1, root, false);
        viewInflate.getClass();
        m214742g(viewInflate);
        m214740q();
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public final void m214742g(View view) {
        z8b0.m218962a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m214743n() {
        VText vText = this._agreement;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VCheckBox m214744o() {
        VCheckBox vCheckBox = this._check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LinearLayout m214745p() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @Override // p153l.w3m
    public void register() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55195J(new C21541a());
            ndb0Var.m55194I(new C21542b());
            ndb0Var.m55191F(new C21543c());
            ndb0Var.m55193H(new C21544d());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m214746s(@Nullable C8928d c8928d) {
        this.currentPurchaseSectionSource = c8928d;
    }

    /* JADX INFO: renamed from: t */
    public final void m214747t(boolean privilegeType) {
        this.privilegeStyle = privilegeType;
    }

    /* JADX INFO: renamed from: u */
    public final void m214748u(boolean purchasePageType) {
        this.purchasePageType = purchasePageType;
    }

    /* JADX INFO: renamed from: v */
    public final void m214749v(boolean vipFrag) {
        this.vipFrag = vipFrag;
    }

    @Override // p153l.w3m
    public void release() {
    }
}
