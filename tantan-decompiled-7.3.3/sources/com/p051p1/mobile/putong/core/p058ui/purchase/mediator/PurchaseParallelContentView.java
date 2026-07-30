package com.p051p1.mobile.putong.core.p058ui.purchase.mediator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.PurchaseParallelContentView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.view.PreviousTouchLinearLayout;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VScroll_Fill_BottomAligned;
import p153l.a30;
import p153l.a690;
import p153l.abb0;
import p153l.afb0;
import p153l.c4s;
import p153l.eib0;
import p153l.gq60;
import p153l.heb0;
import p153l.hib0;
import p153l.j690;
import p153l.jn60;
import p153l.jyb;
import p153l.l3m;
import p153l.l4g0;
import p153l.l51;
import p153l.lib0;
import p153l.mib0;
import p153l.ndb0;
import p153l.oud0;
import p153l.pab0;
import p153l.qcj;
import p153l.s7a;
import p153l.tab0;
import p153l.txq;
import p153l.u8b0;
import p153l.w1e;
import p153l.w3m;
import p153l.wib0;
import p153l.y20;
import p153l.y8b0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u001d\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u000eJ1\u0010%\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\n2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\n2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010-¢\u0006\u0004\b3\u00101J+\u00106\u001a\u00020\n2\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u000104¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\n2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bD\u0010\u000eJ\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u0010\u000eJ\r\u0010F\u001a\u00020\n¢\u0006\u0004\bF\u0010\u000eJ\r\u0010G\u001a\u00020\n¢\u0006\u0004\bG\u0010\u000eJ\r\u0010H\u001a\u00020\n¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\u000eR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\\R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010,R\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR,\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010kR\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010oR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00180e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010hR\u0016\u0010u\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010tR\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010tR\u0018\u0010x\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010w¨\u0006y"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView;", "Lv/VScroll_Fill_BottomAligned;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "k", "(Landroid/view/View;)V", "A", "()V", c4s.C_ZONE, "", "Ll/a690;", "r", "()Ljava/util/List;", "D", "B", BaseSei.f14626Z, "w", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "F", "(Ljava/util/List;)V", "onFinishInflate", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "", "from", ResourceDirection.f39656v, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;)V", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ll/ndb0;", "mediator", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/ndb0;)V", "Ll/y20;", "", "dialogStateAction", "setDialogStateAction", "(Ll/y20;)V", "onNegativeClick", "setOnNegativeClick", "Ll/a30;", "onPaymentSuccess", "setOnPaymentSuccess", "(Ll/a30;)V", "Landroid/view/ViewGroup;", "_agreement_root", "setAgreementRoot", "(Landroid/view/ViewGroup;)V", "", "isInitSelectTab", "setInitSelectTab", "(Z)V", "Ll/lib0;", "purchasePageTrack", "setPurchasePageTrack", "(Ll/lib0;)V", "onDetachedFromWindow", BaseSei.f14625Y, BaseSei.f14624X, "u", Constants.KEY_T, "E", "Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;", "f", "Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;", "get_content", "()Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;", "set_content", "(Lcom/p1/mobile/putong/newui/view/PreviousTouchLinearLayout;)V", "_content", "g", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/putong/core/data/PurchaseType;", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "j", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "Ll/l3m;", "Ll/l3m;", "privilegeComponent", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/lib0;", "m", "Ll/ndb0;", "getMediator", "()Ll/ndb0;", "setMediator", "", "Ll/w3m;", "n", "Ljava/util/List;", "purchaseComponentsList", "o", "Ll/y20;", "p", "Ll/a30;", "q", "Landroid/view/ViewGroup;", "Ll/l4g0;", "Ll/l4g0;", "statisticsPageHelper", "purchaseSections", "Z", "isDialogPageShow", "Ll/afb0;", "Ll/afb0;", "paymentNegativeComponent", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PurchaseParallelContentView extends VScroll_Fill_BottomAligned {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public PreviousTouchLinearLayout _content;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Privilege firstPrivilege;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public l3m privilegeComponent;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public lib0 purchasePageTrack;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ndb0 mediator;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public List<w3m> purchaseComponentsList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public y20<PurchaseType> onNegativeClick;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ViewGroup _agreement_root;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final List<C8928d> purchaseSections;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isDialogPageShow;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isInitSelectTab;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public afb0 paymentNegativeComponent;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.PurchaseParallelContentView$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8936a implements AbstractC8939a.e {
        public C8936a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            PurchaseParallelContentView.this.purchaseSections.clear();
            PurchaseParallelContentView.this.purchaseSections.addAll(sections);
            if (PurchaseParallelContentView.this.isInitSelectTab && !PurchaseParallelContentView.this.isDialogPageShow && !jyb.m147479J(PurchaseParallelContentView.this.purchaseSections)) {
                PurchaseParallelContentView.this.isDialogPageShow = true;
                PurchaseParallelContentView purchaseParallelContentView = PurchaseParallelContentView.this;
                purchaseParallelContentView.m55168F(purchaseParallelContentView.purchaseSections);
            }
            if (PurchaseParallelContentView.this.isDialogPageShow) {
                PurchaseParallelContentView.this.m55167E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.PurchaseParallelContentView$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8937b implements AbstractC8939a.d {
        public C8937b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            lib0 lib0Var;
            section.getClass();
            if (!isClick || (lib0Var = PurchaseParallelContentView.this.purchasePageTrack) == null) {
                return;
            }
            lib0Var.m154333B(section);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.PurchaseParallelContentView$c */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/PurchaseParallelContentView$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/jn60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8938c implements AbstractC8939a.b {
        public C8938c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.b
        /* JADX INFO: renamed from: a */
        public void mo55181a(jn60 paymentHandlerData, PurchaseType purchaseType) {
            gq60 paymentTextResponseData;
            lib0 lib0Var;
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer paymentTrackSource = paymentHandlerData.getPaymentTrackSource();
            if ((paymentTrackSource != null && paymentTrackSource.intValue() == 4) || (paymentTrackSource != null && paymentTrackSource.intValue() == 3)) {
                lib0 lib0Var2 = PurchaseParallelContentView.this.purchasePageTrack;
                if (lib0Var2 != null) {
                    lib0Var2.m154342s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                lib0 lib0Var3 = PurchaseParallelContentView.this.purchasePageTrack;
                if (lib0Var3 != null) {
                    lib0.m154331u(lib0Var3, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            lib0 lib0Var4 = PurchaseParallelContentView.this.purchasePageTrack;
            if (lib0Var4 != null) {
                lib0Var4.m154346x(paymentHandlerData, purchaseType);
            }
            if (!s7a.m184991t() || (paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData()) == null || !paymentTextResponseData.getNeedTrackSticker() || (lib0Var = PurchaseParallelContentView.this.purchasePageTrack) == null) {
                return;
            }
            lib0Var.m154347y(paymentHandlerData, purchaseType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseParallelContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.from = "";
        this.purchaseComponentsList = new ArrayList();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_page", PurchaseParallelContentView.class.getName());
        l4g0VarM204399c.getClass();
        this.statisticsPageHelper = l4g0VarM204399c;
        this.purchaseSections = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    private final void m55153A() {
        m55165C();
        m55166D();
        m55164B();
        m55178z();
        m55175w();
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.mo55223w();
        }
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo152867b();
        }
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m55154g(C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54711j());
    }

    /* JADX INFO: renamed from: h */
    public static void m55155h(PurchaseParallelContentView purchaseParallelContentView) {
        purchaseParallelContentView.m55153A();
    }

    /* JADX INFO: renamed from: i */
    public static void m55156i(PurchaseParallelContentView purchaseParallelContentView, List list, List list2, Privilege privilege) {
        privilege.getClass();
        Privilege privilege2 = purchaseParallelContentView.firstPrivilege;
        PurchaseType purchaseType = null;
        if (privilege2 != null && !CollectionsKt.contains(list, privilege2) && privilege == Privilege.oDiamondSvipExtra) {
            PurchaseType purchaseType2 = purchaseParallelContentView.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m88391r("purchaseType");
            } else {
                purchaseType = purchaseType2;
            }
            a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
            a690VarM143621m.getClass();
            list2.add(0, a690VarM143621m);
            return;
        }
        Privilege privilege3 = purchaseParallelContentView.firstPrivilege;
        if (privilege3 != null && CollectionsKt.contains(list, privilege3) && privilege == purchaseParallelContentView.firstPrivilege) {
            PurchaseType purchaseType3 = purchaseParallelContentView.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.m88391r("purchaseType");
            } else {
                purchaseType = purchaseType3;
            }
            a690 a690VarM143621m2 = j690.m143621m(purchaseType, privilege);
            a690VarM143621m2.getClass();
            list2.add(0, a690VarM143621m2);
            return;
        }
        PurchaseType purchaseType4 = purchaseParallelContentView.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType = purchaseType4;
        }
        a690 a690VarM143621m3 = j690.m143621m(purchaseType, privilege);
        a690VarM143621m3.getClass();
        list2.add(a690VarM143621m3);
    }

    /* JADX INFO: renamed from: j */
    public static void m55157j(PurchaseParallelContentView purchaseParallelContentView, List list, Privilege privilege) {
        privilege.getClass();
        Privilege privilege2 = purchaseParallelContentView.firstPrivilege;
        PurchaseType purchaseType = purchaseParallelContentView.purchaseType;
        if (privilege == privilege2) {
            if (purchaseType == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType = null;
            }
            a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
            a690VarM143621m.getClass();
            list.add(0, a690VarM143621m);
            return;
        }
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        a690 a690VarM143621m2 = j690.m143621m(purchaseType, privilege);
        a690VarM143621m2.getClass();
        list.add(a690VarM143621m2);
    }

    /* JADX INFO: renamed from: B */
    public final void m55164B() {
        Act act = this.act;
        PurchaseType purchaseType = null;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType = purchaseType2;
        }
        afb0 afb0Var = new afb0(act, purchaseType, this.from, this.mediator);
        get_content().addView(afb0Var.mo96551a(get_content()));
        afb0Var.m152862Q(this.onPaymentSuccess);
        afb0Var.m152861P(this.firstPrivilege);
        afb0Var.m152860O(this.dialogStateAction);
        afb0Var.m97332r0(this.onNegativeClick);
        afb0Var.register();
        this.paymentNegativeComponent = afb0Var;
        this.purchaseComponentsList.add(afb0Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m55165C() {
        Act act = this.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        l3m l3mVarM171416b = pab0.m171416b(act, purchaseType, this.from, false, true);
        this.privilegeComponent = l3mVarM171416b;
        View viewMo116073a = l3mVarM171416b != null ? l3mVarM171416b.mo116073a(get_content(), false) : null;
        l3m l3mVar = this.privilegeComponent;
        if (l3mVar != null) {
            l3mVar.mo116075c(m55170r());
        }
        get_content().addView(viewMo116073a, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: D */
    public final void m55166D() {
        w3m eib0Var;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206565i(purchaseType)) {
            int iM193530c = txq.m193530c(1);
            layoutParams.leftMargin = iM193530c;
            layoutParams.rightMargin = iM193530c;
        }
        if (tab0.m189811h().m189835z()) {
            Act act = this.act;
            if (act == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act = null;
            }
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.m88391r("purchaseType");
            } else {
                purchaseType2 = purchaseType3;
            }
            eib0Var = new hib0(act, purchaseType2, this.from, this.mediator);
        } else {
            Act act2 = this.act;
            if (act2 == null) {
                Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                act2 = null;
            }
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.m88391r("purchaseType");
            } else {
                purchaseType2 = purchaseType4;
            }
            eib0Var = new eib0(act2, purchaseType2, this.from, this.mediator);
        }
        get_content().addView(eib0Var.mo96551a(get_content()), layoutParams);
        eib0Var.register();
        this.purchaseComponentsList.add(eib0Var);
    }

    /* JADX INFO: renamed from: E */
    public final void m55167E() {
        lib0 lib0Var;
        if (jyb.m147479J(this.purchaseSections) || (lib0Var = this.purchasePageTrack) == null) {
            return;
        }
        lib0Var.m154334C(this.purchaseSections);
    }

    /* JADX INFO: renamed from: F */
    public final void m55168F(List<? extends C8928d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.from));
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType = null;
            }
            ProductCategory productCategory = purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", jyb.m147490U(mib0.m158481j(sections), Constants.SEPARATOR_COMMA));
            jSONObject.put("default_product", tab0.m189811h().m189817g("vip").toString());
            jSONObject.put("default_duration", tab0.m189811h().m189825p(productCategory));
            boolean zM82486a = NullChecker.m82486a(jyb.m147529r(sections, new qcj() { // from class: l.deb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PurchaseParallelContentView.m55154g((C8928d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zM82486a ? "yes" : "no");
            jSONObject.put("if_discount", zM82486a);
            boolean z = true;
            jSONObject.put("if_double_tab", true);
            jSONObject.put("function_type", mib0.m158477f(this.firstPrivilege, this.from));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31086w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m30933P().m143412i().mo180364N()) {
                if (!CoreModule.f18264c.f20381e0.m116537Z7() || CoreModule.f18264c.f20381e0.m116525W7() || CoreModule.f18264c.f20381e0.m116579k8()) {
                    z = false;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.statisticsPageHelper.m152780o(jSONObject);
        w1e.m204402f(this.statisticsPageHelper);
    }

    @Nullable
    public final ndb0 getMediator() {
        return this.mediator;
    }

    @NotNull
    public final PurchaseType getPurchaseType() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType != null) {
            return purchaseType;
        }
        Intrinsics.m88391r("purchaseType");
        return null;
    }

    @NotNull
    public final PreviousTouchLinearLayout get_content() {
        PreviousTouchLinearLayout previousTouchLinearLayout = this._content;
        if (previousTouchLinearLayout != null) {
            return previousTouchLinearLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m55169k(View view) {
        heb0.m134629a(this, view);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55176x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55169k(this);
    }

    /* JADX INFO: renamed from: r */
    public final List<a690> m55170r() {
        final ArrayList arrayList = new ArrayList();
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206573q(purchaseType)) {
            jyb.m147537z(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null), new y20() { // from class: l.feb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    PurchaseParallelContentView.m55157j(this.f98652a, arrayList, (Privilege) obj);
                }
            });
            return arrayList;
        }
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType3 = null;
        }
        if (wib0.m206565i(purchaseType3)) {
            final ArrayList<Privilege> privilegeData = PurchaseType.TYPE_O_DIAMOND.getPrivilegeData(null);
            privilegeData.getClass();
            jyb.m147537z(privilegeData, new y20() { // from class: l.geb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    PurchaseParallelContentView.m55156i(this.f103779a, privilegeData, arrayList, (Privilege) obj);
                }
            });
            return arrayList;
        }
        PurchaseType purchaseType4 = this.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType2 = purchaseType4;
        }
        List<a690> listM143622n = j690.m143622n(purchaseType2, this.firstPrivilege, false);
        listM143622n.getClass();
        arrayList.addAll(listM143622n);
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public final void m55171s(@Nullable ndb0 mediator) {
        this.mediator = mediator;
    }

    public final void setAgreementRoot(@NotNull ViewGroup _agreement_root) {
        _agreement_root.getClass();
        this._agreement_root = _agreement_root;
    }

    public final void setDialogStateAction(@Nullable y20<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setInitSelectTab(boolean isInitSelectTab) {
        this.isInitSelectTab = isInitSelectTab;
    }

    public final void setMediator(@Nullable ndb0 ndb0Var) {
        this.mediator = ndb0Var;
    }

    public final void setOnNegativeClick(@Nullable y20<PurchaseType> onNegativeClick) {
        this.onNegativeClick = onNegativeClick;
    }

    public final void setOnPaymentSuccess(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    public final void setPurchasePageTrack(@NotNull lib0 purchasePageTrack) {
        purchasePageTrack.getClass();
        this.purchasePageTrack = purchasePageTrack;
    }

    public final void set_content(@NotNull PreviousTouchLinearLayout previousTouchLinearLayout) {
        previousTouchLinearLayout.getClass();
        this._content = previousTouchLinearLayout;
    }

    /* JADX INFO: renamed from: t */
    public final void m55172t() {
        l3m l3mVar = this.privilegeComponent;
        oud0 oud0Var = l3mVar instanceof oud0 ? (oud0) l3mVar : null;
        if (oud0Var != null) {
            oud0Var.m169295l();
        }
        if (this.isDialogPageShow) {
            w1e.m204401e(this.statisticsPageHelper);
        }
        this.isDialogPageShow = false;
        afb0 afb0Var = this.paymentNegativeComponent;
        if (afb0Var != null) {
            afb0Var.m97333s0(false);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m55173u() {
        l3m l3mVar = this.privilegeComponent;
        oud0 oud0Var = l3mVar instanceof oud0 ? (oud0) l3mVar : null;
        if (oud0Var != null) {
            oud0Var.m169291g();
        }
        if (!jyb.m147479J(this.purchaseSections) && !this.isDialogPageShow) {
            this.isDialogPageShow = true;
            m55168F(this.purchaseSections);
        }
        afb0 afb0Var = this.paymentNegativeComponent;
        if (afb0Var != null) {
            afb0Var.m97333s0(true);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m55174v(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable Privilege privilege, @Nullable String from) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.firstPrivilege = privilege;
        this.from = from;
    }

    /* JADX INFO: renamed from: w */
    public final void m55175w() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55195J(new C8936a());
            ndb0Var.m55194I(new C8937b());
            ndb0Var.m55192G(new C8938c());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m55176x() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55196K();
        }
        l3m l3mVar = this.privilegeComponent;
        if (l3mVar != null) {
            l3mVar.release();
        }
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m55177y() {
        Runnable runnable = new Runnable() { // from class: l.eeb0
            @Override // java.lang.Runnable
            public final void run() {
                PurchaseParallelContentView.m55155h(this.f93630a);
            }
        };
        if (this.isInitSelectTab) {
            runnable.run();
            return;
        }
        Act act = this.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        l51.m152888H(act, runnable, 500L);
    }

    /* JADX INFO: renamed from: z */
    public final void m55178z() {
        w3m u8b0Var;
        PurchaseType purchaseType = this.purchaseType;
        ViewGroup viewGroup = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206560d(purchaseType)) {
            boolean zM189835z = tab0.m189811h().m189835z();
            Act act = this.act;
            if (zM189835z) {
                if (act == null) {
                    Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                    act = null;
                }
                PurchaseType purchaseType2 = this.purchaseType;
                if (purchaseType2 == null) {
                    Intrinsics.m88391r("purchaseType");
                    purchaseType2 = null;
                }
                u8b0Var = new y8b0(act, purchaseType2, this.from, this.mediator);
            } else {
                if (act == null) {
                    Intrinsics.m88391r(SocialConstants.PARAM_ACT);
                    act = null;
                }
                PurchaseType purchaseType3 = this.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.m88391r("purchaseType");
                    purchaseType3 = null;
                }
                u8b0Var = new u8b0(act, purchaseType3, this.from, this.mediator);
            }
            ViewGroup viewGroup2 = this._agreement_root;
            if (viewGroup2 == null) {
                Intrinsics.m88391r("_agreement_root");
                viewGroup2 = null;
            }
            ViewGroup viewGroup3 = this._agreement_root;
            if (viewGroup3 == null) {
                Intrinsics.m88391r("_agreement_root");
            } else {
                viewGroup = viewGroup3;
            }
            viewGroup2.addView(u8b0Var.mo96551a(viewGroup));
            u8b0Var.register();
            this.purchaseComponentsList.add(u8b0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchaseParallelContentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PurchaseParallelContentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
