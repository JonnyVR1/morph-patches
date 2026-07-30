package p153l;

import android.content.Intent;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.BoostStatus;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabIapType;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsAct;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersAct;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CurrencyTypeData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ\u000f\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\tJ!\u0010'\u001a\u00020\u00072\u0010\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\tJ\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\tJ\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\tJ\r\u00102\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\tJ\r\u00103\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\tJ\r\u00104\u001a\u00020\u0007¢\u0006\u0004\b4\u0010\tJ\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\tJ\u0015\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\tJ\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010\tR\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0016\u0010E\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010@R\u0016\u0010G\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010@R\u0016\u0010J\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010@R\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010IR\u0016\u0010T\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010I¨\u0006U"}, m88121d2 = {"Ll/enx;", "Ll/u1b0;", "Ll/xnx;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "E1", "()V", "D1", "F1", "Lcom/p1/mobile/putong/data/User;", "user", "I1", "(Lcom/p1/mobile/putong/data/User;)V", "", "newCount", "j1", "(J)V", "H1", "N1", "()J", "", "P1", "()Z", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "L1", "(Lcom/p1/mobile/putong/data/User;)Ljava/util/List;", "J1", "p1", "Q1", "O1", "k1", "C1", "Ljava/lang/Class;", "Lcom/p1/mobile/putong/app/PutongFrag;", "fragment", "B1", "(Ljava/lang/Class;)V", "hidden", "g0", "(Z)V", "", "pageId", "()Ljava/lang/String;", "a0", "v1", "s1", "x1", "u1", "t1", "z1", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;", "type", "q1", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabIapType;)V", "r1", "destroy", "a", "Ljava/util/List;", "purchaseTypes", "b", "J", "visitorsCount", "c", "likesSentCount", Constants.INAPP_DATA_TAG, "likesYouTotalCount", "e", "seeBadgeCount", "f", "Z", "visitorDotDismissed", "g", "visitorCountAtDismiss", "Ll/jxd0;", "h", "Ll/jxd0;", "subDotShown", RXScreenCaptureService.KEY_INDEX, "dotCurrentlyVisible", "j", "visitorAllCountInit", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class enx extends u1b0<xnx> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long visitorsCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long likesSentCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long likesYouTotalCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long seeBadgeCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean visitorDotDismissed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long visitorCountAtDismiss;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final jxd0 subDotShown;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean dotCurrentlyVisible;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean visitorAllCountInit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enx(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.purchaseTypes = new ArrayList();
        this.subDotShown = new jxd0("me_tab_sub_dot_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: A0 */
    public static void m121613A0(enx enxVar, uxj0 uxj0Var) {
        enxVar.m121625H1();
    }

    /* JADX INFO: renamed from: B1 */
    private final void m121614B1(Class<? extends PutongFrag> fragment) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", fragment.getSimpleName());
        ((xnx) this.viewModel).m212388G0(intent);
    }

    /* JADX INFO: renamed from: C0 */
    public static void m121615C0(enx enxVar, Optional optional) {
        ((xnx) enxVar.viewModel).m212383B0(optional.isPresent() && ((BoostStatus) optional.get()).active);
        ((xnx) enxVar.viewModel).m212420n0();
    }

    /* JADX INFO: renamed from: C1 */
    private final void m121616C1() {
        Integer num;
        Pair<Integer, bkj0<String, Integer, Long>> pairM222761e = y63.m214366j().m214371o().m222761e();
        boolean z = false;
        if (pairM222761e != null && (num = (Integer) pairM222761e.first) != null && num.intValue() == 1) {
            z = true;
        }
        ((xnx) this.viewModel).m212383B0(z);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m121617D0(Throwable th) {
    }

    /* JADX INFO: renamed from: D1 */
    private final void m121618D1() {
        CoreModule.f18264c.f20370a1.m180095j();
        CoreModule.f18264c.f20370a1.m180096k();
        CoreModule.f18264c.f20370a1.m180109x(1, 20);
    }

    /* JADX INFO: renamed from: E0 */
    public static Boolean m121619E0(TabName tabName) {
        return Boolean.valueOf(tabName == TabName.Me);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m121620E1() {
        C4883c c4883c = CoreModule.f18264c;
        l99 l99Var = c4883c.f20432v0;
        Long l2 = c4883c.f20429u0.f19996l0.get();
        l2.getClass();
        l99Var.m153371C3("", l2.longValue(), null).subscribe(psd0.m173597H(new y20() { // from class: l.mmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121675u0((uxj0) obj);
            }
        }, new y20() { // from class: l.nmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121649d1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public static void m121621F0(enx enxVar, Integer num) {
        long jIntValue = num.intValue();
        if (jIntValue > 0 && jIntValue != enxVar.visitorCountAtDismiss) {
            enxVar.visitorDotDismissed = false;
        }
        enxVar.visitorsCount = jIntValue;
        enxVar.m121625H1();
    }

    /* JADX INFO: renamed from: F1 */
    private final void m121622F1() {
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3().subscribe(psd0.m173597H(new y20() { // from class: l.rmx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121639R0((uxj0) obj);
                }
            }, new y20() { // from class: l.smx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121669p0((Throwable) obj);
                }
            }));
        } else {
            CoreModule.f18264c.f20312H0.m155449k5().subscribe(psd0.m173597H(new y20() { // from class: l.tmx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121628J0((uxj0) obj);
                }
            }, new y20() { // from class: l.umx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121640S0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static Boolean m121623G0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H0 */
    public static void m121624H0(final enx enxVar, Boolean bool) {
        ((xnx) enxVar.viewModel).getIntlMeTabDiscountEntryHost().m219359d();
        ((xnx) enxVar.viewModel).m212416h0();
        xnx xnxVar = (xnx) enxVar.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        xnxVar.m212426u0(userM116593na);
        if (CoreModule.f18264c.f20438x0.m31177I3() != null && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            List<PurchaseType> listM121679L1 = enxVar.m121679L1(userM116600p9);
            enxVar.purchaseTypes = listM121679L1;
            ((xnx) enxVar.viewModel).m212423q0(listM121679L1, true);
        }
        if (CoreModule.f18264c.f20438x0.m31188T3()) {
            CoreModule.f18264c.f20396j0.m31587G4().subscribe(psd0.m173597H(new y20() { // from class: l.omx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121666n1(this.f148041a, (FreeTrialEnvelope) obj);
                }
            }, new y20() { // from class: l.pmx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121668o1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H1 */
    private final void m121625H1() {
        long likesYouTotalCount = getLikesYouTotalCount();
        this.seeBadgeCount = CoreModule.f18264c.f20429u0.m31375A5() ? 1L : 0L;
        ((xnx) this.viewModel).m212425t0(likesYouTotalCount, this.likesSentCount, kix.INSTANCE.m149987d(this.visitorsCount), this.seeBadgeCount, m121636P1());
    }

    /* JADX INFO: renamed from: I0 */
    public static void m121626I0(enx enxVar, C4470c c4470c) {
        ((xnx) enxVar.viewModel).m212430x0();
        enxVar.m121622F1();
        enxVar.m121620E1();
        enxVar.m121618D1();
    }

    /* JADX INFO: renamed from: I1 */
    private final void m121627I1(User user) {
        ((xnx) this.viewModel).m212427v0(user);
        xnx xnxVar = (xnx) this.viewModel;
        Picture.ImageUri imageUriCalculatedWidth = user.m61308fp().calculatedWidth(qa00.f156298K);
        imageUriCalculatedWidth.getClass();
        xnxVar.m212419m0(imageUriCalculatedWidth);
        ((xnx) this.viewModel).m212428w0(user);
        ((xnx) this.viewModel).m212426u0(user);
        m121638Q1();
        ((xnx) this.viewModel).m212430x0();
        ((xnx) this.viewModel).m212390H0();
    }

    /* JADX INFO: renamed from: J0 */
    public static void m121628J0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: J1 */
    private final void m121629J1() {
        CoreModule.f18264c.f20304E1.m109151G3();
        if (this.visitorAllCountInit) {
            CoreModule.f18264c.f20304E1.m109149E3();
        } else {
            this.visitorAllCountInit = true;
            duringCreated(CoreModule.f18264c.f20304E1.m109149E3()).subscribe(psd0.m173596G(new y20() { // from class: l.lmx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121613A0(this.f132724a, (uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static void m121630L0(enx enxVar, Object obj) {
        if (enxVar.m121660k1() && enxVar.dotCurrentlyVisible) {
            enxVar.subDotShown.put(Boolean.TRUE);
        }
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            List<PurchaseType> listM121679L1 = enxVar.m121679L1(userM116600p9);
            enxVar.purchaseTypes = listM121679L1;
            ((xnx) enxVar.viewModel).m212423q0(listM121679L1, true);
            ((xnx) enxVar.viewModel).m212426u0(userM116600p9);
            enxVar.m121638Q1();
        }
        ((xnx) enxVar.viewModel).m212420n0();
        enxVar.m121625H1();
    }

    /* JADX INFO: renamed from: N0 */
    public static void m121631N0(enx enxVar, PaymentResultWrapper paymentResultWrapper) {
        CoreModule.f18264c.f20297C0.m146425v4().subscribe(psd0.m173597H(new y20() { // from class: l.vmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121662l1((List) obj);
            }
        }, new y20() { // from class: l.wmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121664m1((Throwable) obj);
            }
        }));
        CoreModule.f18264c.f20396j0.f20036g0 = true;
        Act act = enxVar.act();
        NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
        if (newMainAct != null) {
            newMainAct.m40812e6();
        }
        ((xnx) enxVar.viewModel).m212420n0();
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    private final long getLikesYouTotalCount() {
        return this.likesYouTotalCount;
    }

    /* JADX INFO: renamed from: O0 */
    public static Unit m121633O0(enx enxVar) {
        ((xnx) enxVar.viewModel).m212388G0(new Intent(enxVar.act(), (Class<?>) IntlVisitorsAct.class));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O1 */
    private final boolean m121634O1() {
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public static void m121635P0(enx enxVar, Pair pair) {
        enxVar.likesSentCount = kix.INSTANCE.m149985b(pair != null ? (List) pair.first : null);
        enxVar.m121625H1();
    }

    /* JADX INFO: renamed from: P1 */
    private final boolean m121636P1() {
        return this.visitorsCount > 0 && !this.visitorDotDismissed;
    }

    /* JADX INFO: renamed from: Q1 */
    private final void m121638Q1() {
        boolean zM121634O1 = m121634O1();
        this.dotCurrentlyVisible = zM121634O1;
        ((xnx) this.viewModel).m212387E0(zM121634O1);
    }

    /* JADX INFO: renamed from: R0 */
    public static void m121639R0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: S0 */
    public static void m121640S0(Throwable th) {
    }

    /* JADX INFO: renamed from: U0 */
    public static void m121641U0(enx enxVar, TabName tabName) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            IapAffiliatePromotion iapAffiliatePromotionM31177I3 = CoreModule.f18264c.f20438x0.m31177I3();
            int iIndexOf = enxVar.purchaseTypes.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (iapAffiliatePromotionM31177I3 != null && iIndexOf >= 0) {
                ((xnx) enxVar.viewModel).m212389H(iIndexOf);
                return;
            }
            xnx xnxVar = (xnx) enxVar.viewModel;
            yyh0 yyh0Var = yyh0.INSTANCE;
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            xnxVar.m212389H(yyh0Var.m217988d(userM116600p9));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static Boolean m121642V0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    /* JADX INFO: renamed from: W0 */
    public static void m121643W0(enx enxVar, Pair pair) {
        boolean z;
        Integer num = (Integer) pair.first;
        if (num != null) {
            z = num.intValue() == 1;
        }
        ((xnx) enxVar.viewModel).m212383B0(z);
        ((xnx) enxVar.viewModel).m212420n0();
    }

    /* JADX INFO: renamed from: X0 */
    public static void m121644X0(enx enxVar, Counter counter) {
        ((xnx) enxVar.viewModel).m212420n0();
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m121645Y0(enx enxVar, User user) {
        user.getClass();
        enxVar.m121627I1(user);
        enxVar.m121625H1();
        ((xnx) enxVar.viewModel).m212420n0();
        List<PurchaseType> listM121679L1 = enxVar.m121679L1(user);
        enxVar.purchaseTypes = listM121679L1;
        ((xnx) enxVar.viewModel).m212423q0(listM121679L1, false);
    }

    /* JADX INFO: renamed from: a1 */
    public static void m121646a1(enx enxVar, Long l2) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            List<PurchaseType> listM121679L1 = enxVar.m121679L1(userM116600p9);
            enxVar.purchaseTypes = listM121679L1;
            ((xnx) enxVar.viewModel).m212423q0(listM121679L1, true);
        }
        ((xnx) enxVar.viewModel).m212385D0();
    }

    /* JADX INFO: renamed from: b1 */
    public static Boolean m121647b1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c1 */
    public static void m121648c1(enx enxVar, CurrencyTypeData currencyTypeData) {
        ((xnx) enxVar.viewModel).m212430x0();
    }

    /* JADX INFO: renamed from: d1 */
    public static void m121649d1(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    public static C22421c m121650e1() {
        return CoreModule.f18264c.f20396j0.m31581D4().distinctUntilChanged();
    }

    /* JADX INFO: renamed from: f1 */
    public static C22421c m121651f1(List list) {
        return t7a.m189547c() ? CoreModule.f18264c.f20311G2.m153661s3() : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: g1 */
    public static Boolean m121652g1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m121653h0(Coin coin) {
        return Boolean.valueOf(!CoreModule.m30930K().mo31838xf());
    }

    /* JADX INFO: renamed from: h1 */
    public static C22421c m121654h1(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i1 */
    public static void m121656i1(enx enxVar, Long l2) {
        l2.getClass();
        enxVar.m121658j1(l2.longValue());
    }

    /* JADX INFO: renamed from: j0 */
    public static void m121657j0(enx enxVar, Long l2) {
        if (l2.longValue() > 0) {
            enxVar.m121620E1();
        }
        enxVar.m121625H1();
    }

    /* JADX INFO: renamed from: j1 */
    private final void m121658j1(long newCount) {
        long j = this.likesYouTotalCount;
        if (newCount == j) {
            return;
        }
        if (newCount >= j || !CoreModule.f18264c.f20429u0.m31375A5()) {
            this.likesYouTotalCount = newCount;
            m121625H1();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m121659k0(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Boolean.valueOf(CoreModule.m30930K().mo31838xf());
    }

    /* JADX INFO: renamed from: k1 */
    private final boolean m121660k1() {
        return (joa.m146401n4() && joa.m146386f4() && joa.m146396k4() && joa.m146392i4()) ? false : true;
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m121661l0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m121663m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static void m121665n0(enx enxVar, Coin coin) {
        ((xnx) enxVar.viewModel).m212430x0();
        ((xnx) enxVar.viewModel).m212420n0();
    }

    /* JADX INFO: renamed from: n1 */
    public static final void m121666n1(enx enxVar, FreeTrialEnvelope freeTrialEnvelope) {
        xnx xnxVar = (xnx) enxVar.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        xnxVar.m212426u0(userM116593na);
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            List<PurchaseType> listM121679L1 = enxVar.m121679L1(userM116600p9);
            enxVar.purchaseTypes = listM121679L1;
            ((xnx) enxVar.viewModel).m212423q0(listM121679L1, true);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m121667o0(enx enxVar, Throwable th) {
        ((xnx) enxVar.viewModel).getIntlMeTabDiscountEntryHost().m219359d();
    }

    /* JADX INFO: renamed from: p0 */
    public static void m121669p0(Throwable th) {
    }

    /* JADX INFO: renamed from: p1 */
    private final void m121670p1() {
        Act act = act();
        if (act == null) {
            return;
        }
        xib0 j0pVar = d79.m114653L() ? new j0p() : new ful0();
        PurchaseType purchaseType = (CoreModule.f18264c.f20438x0.m31177I3() == null && !CoreModule.f18264c.f20396j0.m31646y4()) ? null : PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        ge90.m129971e(act, "MINE_SUB_ITEM", purchaseType, j0pVar);
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m121671q0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m121672r0(enx enxVar, Boolean bool) {
        xnx xnxVar = (xnx) enxVar.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        xnxVar.m212426u0(userM116593na);
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m121673s0(C4470c c4470c) {
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: u0 */
    public static void m121675u0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: y0 */
    public static void m121677y0(enx enxVar, IntlTabMePayGuide intlTabMePayGuide) {
        ((xnx) enxVar.viewModel).m212424r0(intlTabMePayGuide);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m121678z0(enx enxVar, IntlCurrencyDiamond intlCurrencyDiamond) {
        ((xnx) enxVar.viewModel).m212430x0();
        ((xnx) enxVar.viewModel).m212420n0();
    }

    /* JADX INFO: renamed from: L1 */
    public final List<PurchaseType> m121679L1(User user) {
        if (user.isUltraPremium()) {
            return CollectionsKt.mutableListOf(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        if (user.isSVIP()) {
            lc9 lc9Var = CoreModule.f18264c.f20311G2;
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            return (lc9Var.m153654l3(purchaseType) && CoreModule.f18264c.f20396j0.m31605P4()) ? CollectionsKt.mutableListOf(purchaseType, PurchaseType.TYPE_ULTRA_PREMIUM) : CollectionsKt.mutableListOf(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        if (!user.isVIP() || joa.m146392i4()) {
            return (user.isVIP() || !joa.m146392i4()) ? CollectionsKt.mutableListOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, PurchaseType.TYPE_ULTRA_PREMIUM) : yyh0.INSTANCE.m217990f(user);
        }
        return CollectionsKt.mutableListOf(PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        C22421c<TabName> c22421cDistinctUntilChanged = ji30.m144967k().distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: l.jlx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return enx.m121619E0((TabName) obj);
            }
        };
        duringCreated(c22421cDistinctUntilChanged.filter(new qcj() { // from class: l.llx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enx.m121671q0(function1, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.xlx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121641U0(this.f195022a, (TabName) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.dmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121645Y0(this.f89743a, (User) obj);
            }
        }));
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function2 = new Function1() { // from class: l.emx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return enx.m121673s0((C4470c) obj);
            }
        };
        duringCreated(c22421cLifecycle.filter(new qcj() { // from class: l.gmx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enx.m121623G0(function2, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.hmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121626I0(this.f110678a, (C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116508R7().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.imx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121648c1(this.f115844a, (CurrencyTypeData) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20312H0.m155437a5().distinctUntilChanged());
        final Function1 function3 = new Function1() { // from class: l.jmx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return enx.m121653h0((Coin) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.kmx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enx.m121647b1(function3, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ulx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121665n0(this.f179583a, (Coin) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(CoreModule.f18264c.f20315I0.m144056M3().distinctUntilChanged());
        final Function1 function4 = new Function1() { // from class: l.fmx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return enx.m121659k0((IntlCurrencyDiamond) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.qmx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enx.m121661l0(function4, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ymx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121678z0(this.f200721a, (IntlCurrencyDiamond) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.m32486n3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.zmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121644X0(this.f205145a, (Counter) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20304E1.m109152H3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.anx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121621F0(this.f72396a, (Integer) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20432v0.m153372D3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.bnx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121656i1(this.f77602a, (Long) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20429u0.m31497z5().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.cnx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121657j0(this.f82795a, (Long) obj);
            }
        }));
        C22421c<List<UserPrivilege>> c22421cDistinctUntilChanged2 = CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged();
        final Function1 function5 = new Function1() { // from class: l.dnx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return enx.m121651f1((List) obj);
            }
        };
        duringCreated((C22421c) c22421cDistinctUntilChanged2.flatMap(new qcj() { // from class: l.klx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enx.m121654h1(function5, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.mlx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121630L0(this.f137454a, obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20370a1.m180097l()).subscribe(psd0.m173596G(new y20() { // from class: l.nlx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121635P0(this.f142599a, (Pair) obj);
            }
        }));
        CoreModule.f18264c.f20370a1.m180109x(1, 20);
        duringCreated(fp60.m126543E()).subscribe(psd0.m173596G(new y20() { // from class: l.olx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121631N0(this.f147880a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(y63.m214366j().m214371o()).subscribe(psd0.m173596G(new y20() { // from class: l.plx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121643W0(this.f153098a, (Pair) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20318J0.m156793t3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.qlx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121615C0(this.f158276a, (Optional) obj);
            }
        }));
        if (!IntlCountryCodeController.m29114k()) {
            duringCreated(new pcj() { // from class: l.rlx
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return enx.m121650e1();
                }
            }, false).subscribe(psd0.m173596G(new y20() { // from class: l.slx
                @Override // p153l.y20
                public final void call(Object obj) {
                    enx.m121677y0(this.f169463a, (IntlTabMePayGuide) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20438x0.m31210q4()).subscribe(psd0.m173597H(new y20() { // from class: l.tlx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121624H0(this.f174869a, (Boolean) obj);
            }
        }, new y20() { // from class: l.vlx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121667o0(this.f184650a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20438x0.m31212r4()).subscribe(psd0.m173597H(new y20() { // from class: l.wlx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121646a1(this.f189746a, (Long) obj);
            }
        }, new y20() { // from class: l.ylx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121663m0((Throwable) obj);
            }
        }));
        Act act = act();
        act.getClass();
        C22421c<T> c22421cDuringCreated3 = duringCreated(((NewMainAct) act).m40798W5());
        final Function1 function6 = new Function1() { // from class: l.zlx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return enx.m121652g1((Boolean) obj);
            }
        };
        c22421cDuringCreated3.filter(new qcj() { // from class: l.amx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enx.m121642V0(function6, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.bmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121672r0(this.f77414a, (Boolean) obj);
            }
        }, new y20() { // from class: l.cmx
            @Override // p153l.y20
            public final void call(Object obj) {
                enx.m121617D0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.u1b0
    /* JADX INFO: renamed from: g0 */
    public void mo121680g0(boolean hidden) {
        if (hidden) {
            return;
        }
        m121629J1();
        m121620E1();
        m121618D1();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        m121625H1();
        ((xnx) this.viewModel).m212420n0();
        xnx xnxVar = (xnx) this.viewModel;
        userM116593na.getClass();
        xnxVar.m212426u0(userM116593na);
        m121638Q1();
        ((xnx) this.viewModel).m212390H0();
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            IapAffiliatePromotion iapAffiliatePromotionM31177I3 = CoreModule.f18264c.f20438x0.m31177I3();
            int iIndexOf = this.purchaseTypes.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (iapAffiliatePromotionM31177I3 == null || iIndexOf < 0) {
                xnx xnxVar2 = (xnx) this.viewModel;
                yyh0 yyh0Var = yyh0.INSTANCE;
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                userM116600p9.getClass();
                xnxVar2.m212389H(yyh0Var.m217988d(userM116600p9));
            } else {
                ((xnx) this.viewModel).m212389H(iIndexOf);
            }
        }
        ((xnx) this.viewModel).m212418l0();
        m121616C1();
    }

    @Override // p153l.u1b0
    @NotNull
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m121681q1(@NotNull MeTabIapType type) {
        type.getClass();
        Act act = act();
        if (act == null) {
            return;
        }
        fix.INSTANCE.m125763a(act, type, "independent_cell");
    }

    /* JADX INFO: renamed from: r1 */
    public final void m121682r1() {
        this.subDotShown.put(Boolean.TRUE);
        this.dotCurrentlyVisible = false;
        ((xnx) this.viewModel).m212387E0(false);
        m121670p1();
    }

    /* JADX INFO: renamed from: s1 */
    public final void m121683s1() {
        box.INSTANCE.m105725n();
        Intent intentM51922q2 = ProfileAct.m51922q2(act(), uqb0.f180396b0.f170324a.userId(), "profile_frag_menu", false, true);
        xnx xnxVar = (xnx) this.viewModel;
        intentM51922q2.getClass();
        xnxVar.m212388G0(intentM51922q2);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m121684t1() {
        ((xnx) this.viewModel).m212388G0(new Intent(act(), (Class<?>) IntlLikedUsersAct.class));
    }

    /* JADX INFO: renamed from: u1 */
    public final void m121685u1() {
        aw90.m100562F().m100636z(CoreModule.f18264c.f20381e0.f89257j3);
        CoreModule.f18264c.f20429u0.m31473r5();
        Act act = act();
        NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
        if (newMainAct != null) {
            newMainAct.m40836t7();
        }
        if (rbb0.m180746s(null, 1, null)) {
            CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
            CoreModule.f18264c.f20429u0.m31435c7();
            CoreModule.f18264c.f20429u0.m31470q5();
        }
        this.seeBadgeCount = 0L;
        m121625H1();
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (NullChecker.m82486a(counterM32487o3)) {
            int i = counterM32487o3.likersLimit.remaining;
        }
        if (!NullChecker.m82486a(counterM32487o3) || counterM32487o3.likersLimit.remaining <= 0) {
            FakeLikersAct.m56139Z1(act(), "p_navigation_view,e_see_banner,intl_click");
            return;
        }
        xnx xnxVar = (xnx) this.viewModel;
        Intent intentM57727Y1 = LikersAct.m57727Y1(act(), "");
        intentM57727Y1.getClass();
        xnxVar.m212388G0(intentM57727Y1);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m121686v1() {
        m121614B1(ProfileListFrag.class);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m121687x1() {
        m121614B1(SettingsFragOld.class);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m121688z1() {
        this.visitorDotDismissed = true;
        this.visitorCountAtDismiss = this.visitorsCount;
        m121625H1();
        if (kix.INSTANCE.m149986c()) {
            ((xnx) this.viewModel).m212388G0(new Intent(act(), (Class<?>) IntlVisitorsAct.class));
        } else {
            rop.INSTANCE.m182437o(act(), "p_navigation_view,e_intl_tab_me_visitors,click", new Function0() { // from class: l.xmx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return enx.m121633O0(this.f195335a);
                }
            });
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m121662l1(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m121664m1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final void m121668o1(Throwable th) {
    }
}
