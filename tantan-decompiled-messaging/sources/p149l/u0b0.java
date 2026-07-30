package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010U\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010N\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010[R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010]R\u0016\u0010^\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010]R\u0016\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010]¨\u0006_"}, m87232d2 = {"Ll/u0b0;", "Ll/b5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "", "q", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "r", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "register", "", "privilegeType", Constants.KEY_T, "(Z)V", "purchasePageType", "u", "vipFrag", ResourceDirection.f38808v, "release", OMSTemplateModeType.view, "g", "(Landroid/view/View;)V", "b", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/putong/core/data/PurchaseType;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "p", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Lv/VCheckBox;", "Lv/VCheckBox;", "o", "()Lv/VCheckBox;", "set_check", "(Lv/VCheckBox;)V", "_check", "Lv/VText;", "h", "Lv/VText;", "n", "()Lv/VText;", "set_agreement", "(Lv/VText;)V", "_agreement", "", RXScreenCaptureService.KEY_INDEX, "Ljava/util/List;", "sections", "j", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "k", "getCurrentPurchaseSectionSource", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "currentPurchaseSectionSource", "Lcom/p1/mobile/putong/data/PayMethod;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "Ll/gd0;", "Ll/gd0;", "agreementTextStrategiesHelper", "Z", "privilegeStyle", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class u0b0 extends AbstractC15802b5 {

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
    public List<? extends C8765d> sections;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSectionSource;

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
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/u0b0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20325a implements AbstractC8776a.e {
        public C20325a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.e
        /* JADX INFO: renamed from: a */
        public void mo53996a(List<? extends C8765d> sections) {
            sections.getClass();
            u0b0.this.sections = sections;
        }
    }

    /* JADX INFO: renamed from: l.u0b0$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/u0b0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20326b implements AbstractC8776a.d {
        public C20326b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.d
        /* JADX INFO: renamed from: a */
        public void mo53997a(C8765d section, boolean scroll, boolean isClick, C8765d sectionSource) {
            section.getClass();
            u0b0.this.currentPurchaseSection = section;
            u0b0.this.m191328s(sectionSource);
            u0b0 u0b0Var = u0b0.this;
            u0b0Var.m191323r(section, u0b0Var.getCurrentAgreementState());
        }
    }

    /* JADX INFO: renamed from: l.u0b0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/u0b0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C20327c implements AbstractC8776a.a {
        public C20327c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.a
        /* JADX INFO: renamed from: a */
        public void mo54044a(PayMethod payMethod) {
            payMethod.getClass();
            u0b0.this.currentPayMethod = payMethod;
            C8765d c8765d = u0b0.this.currentPurchaseSection;
            if (c8765d != null) {
                u0b0 u0b0Var = u0b0.this;
                u0b0Var.m191323r(c8765d, u0b0Var.getCurrentAgreementState());
            }
        }
    }

    /* JADX INFO: renamed from: l.u0b0$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/u0b0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C20328d implements AbstractC8776a.c {
        public C20328d() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.c
        /* JADX INFO: renamed from: a */
        public void mo54045a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            u0b0.this.m100280d(agreementState);
            C8765d c8765d = u0b0.this.currentPurchaseSection;
            if (c8765d != null) {
                u0b0.this.m191323r(c8765d, agreementState);
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
    public static void m191314e(C8765d c8765d, u0b0 u0b0Var, PurchaseAgreementState purchaseAgreementState) {
        if (c8765d.m53531m() && dsa.m113447t(null, 1, null)) {
            xdl0.m208344M(u0b0Var.m191326o(), true);
            u0b0Var.m191326o().setChecked(purchaseAgreementState == PurchaseAgreementState.CHECKED);
            u0b0Var.m191325n().setGravity(8388627);
        } else {
            xdl0.m208344M(u0b0Var.m191326o(), false);
            u0b0Var.m191325n().setGravity(17);
        }
        if (TextUtils.equals(u0b0Var.from, "purchasePage")) {
            u0b0Var.m191327p().setGravity(8388611);
        } else {
            u0b0Var.m191327p().setGravity(17);
        }
        CharSequence charSequenceM191321m = u0b0Var.m191321m(c8765d);
        if (charSequenceM191321m instanceof Spannable) {
            u0b0Var.m191325n().setOnTouchListener(new sd0((Spannable) charSequenceM191321m));
        } else {
            u0b0Var.m191325n().setOnTouchListener(null);
        }
        u0b0Var.m191325n().setText(charSequenceM191321m);
    }

    /* JADX INFO: renamed from: f */
    public static void m191315f(u0b0 u0b0Var, CompoundButton compoundButton, boolean z) throws Exception {
        compoundButton.getClass();
        C8765d c8765d = u0b0Var.currentPurchaseSection;
        if (c8765d != null) {
            PurchaseAgreementState purchaseAgreementState = z ? PurchaseAgreementState.CHECKED : PurchaseAgreementState.UNCHECKED;
            j5b0 j5b0Var = u0b0Var.mediator;
            if (j5b0Var != null) {
                C8765d c8765d2 = u0b0Var.currentPurchaseSectionSource;
                if (c8765d2 != null) {
                    c8765d = c8765d2;
                }
                j5b0Var.m139826V(c8765d, purchaseAgreementState);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final CharSequence m191321m(C8765d section) {
        C8765d.a aVarM53522d;
        if (section.m53531m()) {
            aVarM53522d = section.m53520b();
            aVarM53522d.getClass();
        } else {
            aVarM53522d = section.m53522d();
            aVarM53522d.getClass();
        }
        C8765d.a aVar = aVarM53522d;
        Merchandise merchandiseM53601s = aVar.m53601s();
        if (this.agreementTextStrategiesHelper == null) {
            this.agreementTextStrategiesHelper = new gd0(this.act, this.purchaseType, this.from);
        }
        merchandiseM53601s.getClass();
        fd0 fd0Var = new fd0(aVar, merchandiseM53601s, this.currentPayMethod, this.purchasePageType, false, this.privilegeStyle, this.vipFrag, 16, null);
        gd0 gd0Var = this.agreementTextStrategiesHelper;
        if (gd0Var == null) {
            Intrinsics.m87502r("agreementTextStrategiesHelper");
            gd0Var = null;
        }
        return gd0Var.m125528a(fd0Var);
    }

    /* JADX INFO: renamed from: q */
    private final void m191322q() {
        Drawable drawable;
        if (TextUtils.equals(this.from, "purchasePage")) {
            m191327p().setPadding(svq.m186103c(16), 0, svq.m186103c(16), 0);
        }
        m191325n().setTextColor((sab0.m182891i(this.purchaseType) && this.vipFrag && g6a.m124566o()) ? Color.parseColor("#66FFC079") : we60.m202852Q(this.privilegeStyle));
        m191325n().setGravity(8388627);
        VCheckBox vCheckBoxM191326o = m191326o();
        boolean z = this.purchasePageType;
        PurchaseType purchaseType = this.purchaseType;
        if (z) {
            if (sab0.m182905w(purchaseType) || sab0.m182899q(this.purchaseType)) {
                drawable = this.act.drawable(d3c0.f83620J6);
            } else if (sab0.m182891i(this.purchaseType) || sab0.m182892j(this.purchaseType) || sab0.m182898p(this.purchaseType)) {
                drawable = this.act.drawable(d3c0.f83718Q6);
            } else if (sab0.m182889g(this.purchaseType)) {
                drawable = this.act.drawable(d3c0.f83704P6);
            } else {
                boolean zM182906x = sab0.m182906x(this.purchaseType);
                Act act = this.act;
                drawable = zM182906x ? act.drawable(d3c0.f84143v7) : act.drawable(d3c0.f83836Z7);
            }
        } else if (sab0.m182891i(purchaseType) && this.vipFrag && g6a.m124566o()) {
            drawable = this.act.drawable(d3c0.f84043o5);
        } else if (!this.privilegeStyle) {
            drawable = this.act.drawable(d3c0.f83839Za);
        } else if (sab0.m182905w(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.f83836Z7);
        } else if (sab0.m182899q(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.f83823Y7);
        } else if (sab0.m182891i(this.purchaseType) || sab0.m182892j(this.purchaseType) || sab0.m182898p(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.f83606I6);
        } else if (sab0.m182897o(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.f84157w7);
        } else if (sab0.m182889g(this.purchaseType)) {
            drawable = this.act.drawable(d3c0.f83704P6);
        } else {
            boolean zM182906x2 = sab0.m182906x(this.purchaseType);
            Act act2 = this.act;
            drawable = zM182906x2 ? act2.drawable(d3c0.f84143v7) : act2.drawable(d3c0.f83836Z7);
        }
        vCheckBoxM191326o.setBackground(drawable);
        m191326o().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.s0b0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) throws Exception {
                u0b0.m191315f(this.f161764a, compoundButton, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m191323r(final C8765d section, final PurchaseAgreementState agreementState) {
        e51.m114741F(this.act, new Runnable() { // from class: l.t0b0
            @Override // java.lang.Runnable
            public final void run() {
                u0b0.m191314e(section, this, agreementState);
            }
        });
    }

    @Override // p149l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo95244a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.f131499K1, root, false);
        viewInflate.getClass();
        m191324g(viewInflate);
        m191322q();
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public final void m191324g(View view) {
        v0b0.m196481a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m191325n() {
        VText vText = this._agreement;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VCheckBox m191326o() {
        VCheckBox vCheckBox = this._check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m87502r("_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LinearLayout m191327p() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @Override // p149l.d1m
    public void register() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54012J(new C20325a());
            j5b0Var.m54011I(new C20326b());
            j5b0Var.m54008F(new C20327c());
            j5b0Var.m54010H(new C20328d());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m191328s(@Nullable C8765d c8765d) {
        this.currentPurchaseSectionSource = c8765d;
    }

    /* JADX INFO: renamed from: t */
    public final void m191329t(boolean privilegeType) {
        this.privilegeStyle = privilegeType;
    }

    /* JADX INFO: renamed from: u */
    public final void m191330u(boolean purchasePageType) {
        this.purchasePageType = purchasePageType;
    }

    /* JADX INFO: renamed from: v */
    public final void m191331v(boolean vipFrag) {
        this.vipFrag = vipFrag;
    }

    @Override // p149l.d1m
    public void release() {
    }
}
