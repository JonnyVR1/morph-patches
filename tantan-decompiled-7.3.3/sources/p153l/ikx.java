package p153l;

import android.content.Intent;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.BoostStatus;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.FreeTrialData;
import com.p051p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabIapType;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampMemberCardHelper;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsAct;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersAct;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CurrencyTypeData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0010J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J;\u0010)\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u0010J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0010J\u000f\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0010J\u000f\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\u0010J\u000f\u0010/\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010\u0010J\u000f\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010\u0010J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010\u0010J\u000f\u00106\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010\u0010J%\u0010:\u001a\u00020\t2\u0006\u00102\u001a\u0002012\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b:\u0010;J#\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b072\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bB\u0010\u0010J\u000f\u0010C\u001a\u00020>H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0007H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010\u0010J\u000f\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bH\u0010\u0010J\u0017\u0010I\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bI\u0010\u001eJ\u001f\u0010J\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\bJ\u0010KJ-\u0010O\u001a\u00020\t2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020\f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010\u0010J\u000f\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u0010\u0010J\u000f\u0010S\u001a\u00020\u0007H\u0002¢\u0006\u0004\bS\u0010FJ\u000f\u0010T\u001a\u00020\u0007H\u0002¢\u0006\u0004\bT\u0010FJ\u000f\u0010U\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010\u0010J!\u0010Y\u001a\u00020\t2\u0010\u0010X\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010W0VH\u0002¢\u0006\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010\\R\u0016\u0010c\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\\R\u0016\u0010f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010\\R\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010eR\u0016\u0010p\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010e¨\u0006q"}, m88121d2 = {"Ll/ikx;", "Ll/u1b0;", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/test1/MeTabRevampTest1ViewModel;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "hidden", "", "g0", "(Z)V", "", "pageId", "()Ljava/lang/String;", "a0", "()V", "H1", "C1", "I1", "F1", "E1", "L1", "z1", "J1", "B1", "D1", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;", "type", "u1", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)V", "", OMSTemplateModeType.page, "v1", "(I)V", "cardType", "isInstantMatch", "isLocked", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "privilegeTitle", "t1", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;ZZLcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;)V", "x1", "destroy", "T1", "S1", "U1", "r1", "Lcom/p1/mobile/putong/data/User;", "user", "W1", "(Lcom/p1/mobile/putong/data/User;)V", "R1", "X1", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "Y1", "(Lcom/p1/mobile/putong/data/User;Ljava/util/List;)V", "O1", "(Ljava/util/List;)Ljava/util/List;", "", "newCount", "l1", "(J)V", "V1", "a2", "()J", "c2", "()Z", "Z1", "N1", "g2", "f2", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "from", "d2", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;)V", "s1", "h2", "b2", "m1", "Q1", "Ljava/lang/Class;", "Lcom/p1/mobile/putong/app/PutongFrag;", "fragment", "P1", "(Ljava/lang/Class;)V", "a", "J", "visitorsCount", "b", "likesSentCount", "c", "likesYouTotalCount", Constants.INAPP_DATA_TAG, "seeBadgeCount", "e", "Z", "visitorDotDismissed", "f", "visitorCountAtDismiss", "Ll/jxd0;", "g", "Ll/jxd0;", "subDotShown", "h", "dotCurrentlyVisible", RXScreenCaptureService.KEY_INDEX, "visitorAllCountInit", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ikx extends u1b0<MeTabRevampTest1ViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long visitorsCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long likesSentCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long likesYouTotalCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long seeBadgeCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean visitorDotDismissed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long visitorCountAtDismiss;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final jxd0 subDotShown;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean dotCurrentlyVisible;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean visitorAllCountInit;

    /* JADX INFO: renamed from: l.ikx$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C17733a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f115464a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f115465b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f115466c;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115464a = iArr;
            int[] iArr2 = new int[MeTabRevampMemberCardHelper.CardType.values().length];
            try {
                iArr2[MeTabRevampMemberCardHelper.CardType.VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MeTabRevampMemberCardHelper.CardType.SEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MeTabRevampMemberCardHelper.CardType.PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MeTabRevampMemberCardHelper.CardType.ULTRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f115465b = iArr2;
            int[] iArr3 = new int[Privilege.values().length];
            try {
                iArr3[Privilege.immediately_match.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Privilege.boost.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f115466c = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikx(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.subDotShown = new jxd0("me_tab_sub_dot_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: A0 */
    public static C22421c m140429A0() {
        return CoreModule.f18264c.f20396j0.m31581D4().distinctUntilChanged();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m140430C0(ikx ikxVar, TabName tabName) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            ikxVar.m140497R1();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m140431D0(Throwable th) {
    }

    /* JADX INFO: renamed from: E0 */
    public static C22421c m140432E0(List list) {
        return t7a.m189547c() ? CoreModule.f18264c.f20311G2.m153661s3() : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: F0 */
    public static Unit m140433F0(ikx ikxVar) {
        ikxVar.m140494N1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static void m140434G0(ikx ikxVar, IntlTabMePayGuide intlTabMePayGuide) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44451q1(intlTabMePayGuide);
    }

    /* JADX INFO: renamed from: H0 */
    public static void m140435H0(ikx ikxVar, Long l2) {
        l2.getClass();
        ikxVar.m140512l1(l2.longValue());
    }

    /* JADX INFO: renamed from: I0 */
    public static void m140436I0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static void m140437J0(ikx ikxVar, Long l2) {
        ikxVar.m140497R1();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44390M1();
    }

    /* JADX INFO: renamed from: L0 */
    public static void m140438L0(ikx ikxVar, Object obj) {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (ikxVar.m140513m1() && ikxVar.dotCurrentlyVisible) {
            ikxVar.subDotShown.put(Boolean.TRUE);
        }
        ikxVar.m140497R1();
        ikxVar.m140514r1();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
        userM116593na.getClass();
        meTabRevampTest1ViewModel.m44458t1(userM116593na);
        ikxVar.m140511h2();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44442m1(userM116593na);
        ikxVar.m140501V1();
    }

    /* JADX INFO: renamed from: N0 */
    public static void m140439N0(ikx ikxVar, User user) {
        user.getClass();
        ikxVar.m140449W1(user);
        ikxVar.m140501V1();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
    }

    /* JADX INFO: renamed from: O0 */
    public static void m140440O0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: P0 */
    public static void m140441P0(Throwable th) {
    }

    /* JADX INFO: renamed from: P1 */
    private final void m140442P1(Class<? extends PutongFrag> fragment) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", fragment.getSimpleName());
        ((MeTabRevampTest1ViewModel) this.viewModel).m44400Q1(intent);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m140443Q0(final ikx ikxVar, Boolean bool) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).getIntlMeTabDiscountEntryHost().m219359d();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44422a1();
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        meTabRevampTest1ViewModel.m44458t1(userM116593na);
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel2 = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
        User userM116593na2 = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na2.getClass();
        meTabRevampTest1ViewModel2.m44442m1(userM116593na2);
        if (CoreModule.f18264c.f20438x0.m31177I3() != null) {
            ikxVar.m140497R1();
        }
        if (CoreModule.f18264c.f20438x0.m31188T3()) {
            CoreModule.f18264c.f20396j0.m31587G4().subscribe(psd0.m173597H(new y20() { // from class: l.qjx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140475p1(this.f158062a, (FreeTrialEnvelope) obj);
                }
            }, new y20() { // from class: l.rjx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140477q1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static Boolean m140444R0(Coin coin) {
        return Boolean.valueOf(!CoreModule.m30930K().mo31838xf());
    }

    /* JADX INFO: renamed from: S0 */
    public static Boolean m140445S0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W0 */
    public static void m140448W0(Throwable th) {
    }

    /* JADX INFO: renamed from: W1 */
    private final void m140449W1(User user) {
        ((MeTabRevampTest1ViewModel) this.viewModel).m44460u1(user);
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) this.viewModel;
        Picture.ImageUri imageUriCalculatedWidth = user.m61308fp().calculatedWidth(qa00.f156298K);
        imageUriCalculatedWidth.getClass();
        meTabRevampTest1ViewModel.m44440l1(imageUriCalculatedWidth);
        ((MeTabRevampTest1ViewModel) this.viewModel).m44462v1(user);
        ((MeTabRevampTest1ViewModel) this.viewModel).m44458t1(user);
        m140511h2();
        ((MeTabRevampTest1ViewModel) this.viewModel).m44468y1();
        ((MeTabRevampTest1ViewModel) this.viewModel).m44406S1();
        m140497R1();
        ((MeTabRevampTest1ViewModel) this.viewModel).m44442m1(user);
    }

    /* JADX INFO: renamed from: X0 */
    public static void m140450X0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m140451Y0(ikx ikxVar, C8928d c8928d) {
        C8928d.a aVarM54703b = c8928d.m54703b();
        if (!NullChecker.m82486a(aVarM54703b)) {
            aVarM54703b = c8928d.m54705d();
        }
        if (NullChecker.m82486a(aVarM54703b)) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(2);
            int iM218877t0 = z7a.m218877t0(aVarM54703b.m54784s());
            String str = iM218877t0 > 0 ? numberFormat.format(aVarM54703b.m54785t() / ((double) iM218877t0)) : numberFormat.format(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44374E1(aVarM54703b.m54766h() + str);
            MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            userM116593na.getClass();
            meTabRevampTest1ViewModel.m44442m1(userM116593na);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static void m140452a1(ikx ikxVar, C4470c c4470c) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44468y1();
        ikxVar.m140500U1();
        ikxVar.m140499T1();
        ikxVar.m140498S1();
    }

    /* JADX INFO: renamed from: b1 */
    public static void m140453b1(ikx ikxVar, Boolean bool) {
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        meTabRevampTest1ViewModel.m44458t1(userM116593na);
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel2 = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
        User userM116593na2 = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na2.getClass();
        meTabRevampTest1ViewModel2.m44442m1(userM116593na2);
    }

    /* JADX INFO: renamed from: c1 */
    public static void m140454c1(ikx ikxVar, Pair pair) {
        ikxVar.likesSentCount = kix.INSTANCE.m149985b(pair != null ? (List) pair.first : null);
        ikxVar.m140501V1();
    }

    /* JADX INFO: renamed from: d1 */
    public static void m140455d1(ikx ikxVar, CurrencyTypeData currencyTypeData) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44468y1();
    }

    /* JADX INFO: renamed from: e1 */
    public static void m140456e1(ikx ikxVar, PaymentResultWrapper paymentResultWrapper) {
        CoreModule.f18264c.f20297C0.m146425v4().subscribe(psd0.m173597H(new y20() { // from class: l.tjx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140471n1((List) obj);
            }
        }, new y20() { // from class: l.ujx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140473o1((Throwable) obj);
            }
        }));
        CoreModule.f18264c.f20396j0.f20036g0 = true;
        Act act = ikxVar.act();
        NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
        if (newMainAct != null) {
            newMainAct.m40812e6();
        }
        ikxVar.m140514r1();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        meTabRevampTest1ViewModel.m44442m1(userM116593na);
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m140457e2(ikx ikxVar, Act act, String str, Privilege privilege, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "p_navigation_view,e_intl_me_subscription_card,click";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        ikxVar.m140508d2(act, str, privilege);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    /* JADX INFO: renamed from: f1 */
    public static void m140458f1(ikx ikxVar, Pair pair) {
        boolean z;
        Integer num = (Integer) pair.first;
        if (num != null) {
            z = num.intValue() == 1;
        }
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44388L1(z);
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
    }

    /* JADX INFO: renamed from: g1 */
    public static void m140459g1(ikx ikxVar, uxj0 uxj0Var) {
        ikxVar.m140501V1();
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m140460h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static C22421c m140462i0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i1 */
    public static Boolean m140463i1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static Boolean m140464j0(C4470c c4470c) {
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m140466k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k1 */
    public static void m140467k1(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m140468l0(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Boolean.valueOf(CoreModule.m30930K().mo31838xf());
    }

    /* JADX INFO: renamed from: m0 */
    public static void m140469m0(ikx ikxVar, Long l2) {
        if (l2.longValue() > 0) {
            ikxVar.m140499T1();
        }
        ikxVar.m140501V1();
    }

    /* JADX INFO: renamed from: n0 */
    public static Boolean m140470n0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m140472o0(ikx ikxVar, IntlCurrencyDiamond intlCurrencyDiamond) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44468y1();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
    }

    /* JADX INFO: renamed from: p0 */
    public static void m140474p0(ikx ikxVar, Coin coin) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44468y1();
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
    }

    /* JADX INFO: renamed from: p1 */
    public static final void m140475p1(ikx ikxVar, FreeTrialEnvelope freeTrialEnvelope) {
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) ikxVar.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        meTabRevampTest1ViewModel.m44442m1(userM116593na);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m140476q0(ikx ikxVar, Integer num) {
        long jIntValue = num.intValue();
        if (jIntValue > 0 && jIntValue != ikxVar.visitorCountAtDismiss) {
            ikxVar.visitorDotDismissed = false;
        }
        ikxVar.visitorsCount = jIntValue;
        ikxVar.m140501V1();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m140478r0(ikx ikxVar, Throwable th) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).getIntlMeTabDiscountEntryHost().m219359d();
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m140479s0(TabName tabName) {
        return Boolean.valueOf(tabName == TabName.Me);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m140480t0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static void m140481u0(ikx ikxVar, Counter counter) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
    }

    /* JADX INFO: renamed from: x0 */
    public static void m140482x0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m140483y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m140484z0(ikx ikxVar, Optional optional) {
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44388L1(optional.isPresent() && ((BoostStatus) optional.get()).active);
        ((MeTabRevampTest1ViewModel) ikxVar.viewModel).m44447o1();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m140485B1() {
        Act act = act();
        if (act == null) {
            return;
        }
        fix.INSTANCE.m125763a(act, MeTabIapType.COMPLIMENT, "grid_4");
    }

    /* JADX INFO: renamed from: C1 */
    public final void m140486C1() {
        box.INSTANCE.m105725n();
        Intent intentM51922q2 = ProfileAct.m51922q2(act(), uqb0.f180396b0.f170324a.userId(), "profile_frag_menu", false, true);
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) this.viewModel;
        intentM51922q2.getClass();
        meTabRevampTest1ViewModel.m44400Q1(intentM51922q2);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m140487D1() {
        Act act = act();
        if (act == null) {
            return;
        }
        fix.INSTANCE.m125763a(act, MeTabIapType.INSTANT_MATCH, "grid_4");
    }

    /* JADX INFO: renamed from: E1 */
    public final void m140488E1() {
        ((MeTabRevampTest1ViewModel) this.viewModel).m44400Q1(new Intent(act(), (Class<?>) IntlLikedUsersAct.class));
    }

    /* JADX INFO: renamed from: F1 */
    public final void m140489F1() {
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
        m140501V1();
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (NullChecker.m82486a(counterM32487o3)) {
            int i = counterM32487o3.likersLimit.remaining;
        }
        if (!NullChecker.m82486a(counterM32487o3) || counterM32487o3.likersLimit.remaining <= 0) {
            FakeLikersAct.m56139Z1(act(), "p_navigation_view,e_see_banner,intl_click");
            return;
        }
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) this.viewModel;
        Intent intentM57727Y1 = LikersAct.m57727Y1(act(), "");
        intentM57727Y1.getClass();
        meTabRevampTest1ViewModel.m44400Q1(intentM57727Y1);
    }

    /* JADX INFO: renamed from: H1 */
    public final void m140490H1() {
        m140442P1(ProfileListFrag.class);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m140491I1() {
        m140442P1(SettingsFragOld.class);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m140492J1() {
        Act act = act();
        if (act == null) {
            return;
        }
        fix.INSTANCE.m125763a(act, MeTabIapType.SUPER_LIKE, "grid_4");
    }

    /* JADX INFO: renamed from: L1 */
    public final void m140493L1() {
        this.visitorDotDismissed = true;
        this.visitorCountAtDismiss = this.visitorsCount;
        m140501V1();
        if (kix.INSTANCE.m149986c()) {
            m140494N1();
        } else {
            rop.INSTANCE.m182437o(act(), "p_navigation_view,e_intl_tab_me_visitors,click", new Function0() { // from class: l.bkx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ikx.m140433F0(this.f77127a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final void m140494N1() {
        ((MeTabRevampTest1ViewModel) this.viewModel).m44400Q1(new Intent(act(), (Class<?>) IntlVisitorsAct.class));
    }

    /* JADX INFO: renamed from: O1 */
    public final List<MeTabRevampMemberCardHelper.CardType> m140495O1(List<? extends PurchaseType> purchaseTypes) {
        MeTabRevampMemberCardHelper.CardType cardType;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = purchaseTypes.iterator();
        while (it.hasNext()) {
            int i = C17733a.f115464a[((PurchaseType) it.next()).ordinal()];
            if (i == 1) {
                cardType = MeTabRevampMemberCardHelper.CardType.VIP;
            } else if (i == 2) {
                cardType = MeTabRevampMemberCardHelper.CardType.SEE;
            } else if (i != 3) {
                cardType = i != 4 ? null : MeTabRevampMemberCardHelper.CardType.ULTRA;
            } else {
                cardType = MeTabRevampMemberCardHelper.CardType.PREMIUM;
            }
            if (cardType != null) {
                arrayList.add(cardType);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m140496Q1() {
        Integer num;
        Pair<Integer, bkj0<String, Integer, Long>> pairM222761e = y63.m214366j().m214371o().m222761e();
        boolean z = false;
        if (pairM222761e != null && (num = (Integer) pairM222761e.first) != null && num.intValue() == 1) {
            z = true;
        }
        ((MeTabRevampTest1ViewModel) this.viewModel).m44388L1(z);
    }

    /* JADX INFO: renamed from: R1 */
    public final void m140497R1() {
        List<? extends PurchaseType> listMutableListOf;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return;
        }
        if (userM116600p9.isUltraPremium()) {
            listMutableListOf = CollectionsKt.mutableListOf(PurchaseType.TYPE_ULTRA_PREMIUM);
        } else if (userM116600p9.isSVIP()) {
            lc9 lc9Var = CoreModule.f18264c.f20311G2;
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            listMutableListOf = (lc9Var.m153654l3(purchaseType) && CoreModule.f18264c.f20396j0.m31605P4()) ? CollectionsKt.mutableListOf(purchaseType, PurchaseType.TYPE_ULTRA_PREMIUM) : CollectionsKt.mutableListOf(PurchaseType.TYPE_ULTRA_PREMIUM);
        } else if (!userM116600p9.isVIP() || joa.m146392i4()) {
            listMutableListOf = (userM116600p9.isVIP() || !joa.m146392i4()) ? CollectionsKt.mutableListOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, PurchaseType.TYPE_ULTRA_PREMIUM) : CollectionsKt.toMutableList((Collection) yyh0.INSTANCE.m217990f(userM116600p9));
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        ((MeTabRevampTest1ViewModel) this.viewModel).m44403R1(m140495O1(listMutableListOf));
        m140503Y1(userM116600p9, listMutableListOf);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m140498S1() {
        CoreModule.f18264c.f20370a1.m180095j();
        CoreModule.f18264c.f20370a1.m180096k();
        CoreModule.f18264c.f20370a1.m180109x(1, 20);
    }

    /* JADX INFO: renamed from: T1 */
    public final void m140499T1() {
        C4883c c4883c = CoreModule.f18264c;
        l99 l99Var = c4883c.f20432v0;
        Long l2 = c4883c.f20429u0.f19996l0.get();
        l2.getClass();
        l99Var.m153371C3("", l2.longValue(), null).subscribe(psd0.m173597H(new y20() { // from class: l.ojx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140440O0((uxj0) obj);
            }
        }, new y20() { // from class: l.pjx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140448W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public final void m140500U1() {
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3().subscribe(psd0.m173597H(new y20() { // from class: l.vjx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140450X0((uxj0) obj);
                }
            }, new y20() { // from class: l.wjx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140436I0((Throwable) obj);
                }
            }));
        } else {
            CoreModule.f18264c.f20312H0.m155449k5().subscribe(psd0.m173597H(new y20() { // from class: l.xjx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140482x0((uxj0) obj);
                }
            }, new y20() { // from class: l.yjx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140467k1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final void m140501V1() {
        long likesYouTotalCount = getLikesYouTotalCount();
        this.seeBadgeCount = CoreModule.f18264c.f20429u0.m31375A5() ? 1L : 0L;
        ((MeTabRevampTest1ViewModel) this.viewModel).m44456s1(likesYouTotalCount, this.likesSentCount, kix.INSTANCE.m149987d(this.visitorsCount), this.seeBadgeCount, m140507c2());
    }

    /* JADX INFO: renamed from: X1 */
    public final void m140502X1() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return;
        }
        m140503Y1(userM116600p9, yyh0.INSTANCE.m217990f(userM116600p9));
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m140503Y1(User user, List<? extends PurchaseType> purchaseTypes) {
        IapAffiliatePromotion iapAffiliatePromotionM31177I3 = CoreModule.f18264c.f20438x0.m31177I3();
        int iIndexOf = purchaseTypes.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (iapAffiliatePromotionM31177I3 == null || iIndexOf < 0) {
            iIndexOf = C15274a.m88486b(yyh0.INSTANCE.m217988d(user), 0);
        }
        ((MeTabRevampTest1ViewModel) this.viewModel).m44369C1(iIndexOf);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m140504Z1() {
        CoreModule.f18264c.f20304E1.m109151G3();
        if (this.visitorAllCountInit) {
            CoreModule.f18264c.f20304E1.m109149E3();
        } else {
            this.visitorAllCountInit = true;
            duringCreated(CoreModule.f18264c.f20304E1.m109149E3()).subscribe(psd0.m173596G(new y20() { // from class: l.njx
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140459g1(this.f142365a, (uxj0) obj);
                }
            }));
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        C22421c<TabName> c22421cDistinctUntilChanged = ji30.m144967k().distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: l.lix
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ikx.m140479s0((TabName) obj);
            }
        };
        duringCreated(c22421cDistinctUntilChanged.filter(new qcj() { // from class: l.nix
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ikx.m140483y0(function1, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.zix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140430C0(this.f204628a, (TabName) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.fjx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140439N0(this.f99440a, (User) obj);
            }
        }));
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function2 = new Function1() { // from class: l.gjx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ikx.m140464j0((C4470c) obj);
            }
        };
        duringCreated(c22421cLifecycle.filter(new qcj() { // from class: l.ijx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ikx.m140463i1(function2, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.jjx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140452a1(this.f121253a, (C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116508R7().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.kjx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140455d1(this.f127150a, (CurrencyTypeData) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20312H0.m155437a5().distinctUntilChanged());
        final Function1 function3 = new Function1() { // from class: l.ljx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ikx.m140444R0((Coin) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.mjx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ikx.m140466k0(function3, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.wix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140474p0(this.f189401a, (Coin) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(CoreModule.f18264c.f20315I0.m144056M3().distinctUntilChanged());
        final Function1 function4 = new Function1() { // from class: l.hjx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ikx.m140468l0((IntlCurrencyDiamond) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.sjx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ikx.m140445S0(function4, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ckx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140472o0(this.f82326a, (IntlCurrencyDiamond) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.m32486n3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.dkx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140481u0(this.f89476a, (Counter) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20304E1.m109152H3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ekx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140476q0(this.f94460a, (Integer) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20432v0.m153372D3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.fkx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140435H0(this.f99571a, (Long) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20429u0.m31497z5().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.gkx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140469m0(this.f104777a, (Long) obj);
            }
        }));
        C22421c<List<UserPrivilege>> c22421cDistinctUntilChanged2 = CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged();
        final Function1 function5 = new Function1() { // from class: l.hkx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ikx.m140432E0((List) obj);
            }
        };
        duringCreated((C22421c) c22421cDistinctUntilChanged2.flatMap(new qcj() { // from class: l.mix
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ikx.m140462i0(function5, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.oix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140438L0(this.f147592a, obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20370a1.m180097l()).subscribe(psd0.m173596G(new y20() { // from class: l.pix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140454c1(this.f152625a, (Pair) obj);
            }
        }));
        CoreModule.f18264c.f20370a1.m180109x(1, 20);
        duringCreated(fp60.m126543E()).subscribe(psd0.m173596G(new y20() { // from class: l.qix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140456e1(this.f157895a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(y63.m214366j().m214371o()).subscribe(psd0.m173596G(new y20() { // from class: l.rix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140458f1(this.f163402a, (Pair) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20318J0.m156793t3().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.six
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140484z0(this.f168884a, (Optional) obj);
            }
        }));
        if (!IntlCountryCodeController.m29114k()) {
            duringCreated(new pcj() { // from class: l.tix
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return ikx.m140429A0();
                }
            }, false).subscribe(psd0.m173596G(new y20() { // from class: l.uix
                @Override // p153l.y20
                public final void call(Object obj) {
                    ikx.m140434G0(this.f179156a, (IntlTabMePayGuide) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20438x0.m31210q4()).subscribe(psd0.m173597H(new y20() { // from class: l.vix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140443Q0(this.f184329a, (Boolean) obj);
            }
        }, new y20() { // from class: l.xix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140478r0(this.f194526a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20438x0.m31212r4()).subscribe(psd0.m173597H(new y20() { // from class: l.yix
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140437J0(this.f200251a, (Long) obj);
            }
        }, new y20() { // from class: l.ajx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140480t0((Throwable) obj);
            }
        }));
        Act act = act();
        act.getClass();
        C22421c<T> c22421cDuringCreated3 = duringCreated(((NewMainAct) act).m40798W5());
        final Function1 function6 = new Function1() { // from class: l.bjx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ikx.m140470n0((Boolean) obj);
            }
        };
        c22421cDuringCreated3.filter(new qcj() { // from class: l.cjx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ikx.m140460h0(function6, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.djx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140453b1(this.f88952a, (Boolean) obj);
            }
        }, new y20() { // from class: l.ejx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140441P0((Throwable) obj);
            }
        }));
        m140514r1();
    }

    /* JADX INFO: renamed from: a2, reason: from getter */
    public final long getLikesYouTotalCount() {
        return this.likesYouTotalCount;
    }

    /* JADX INFO: renamed from: b2 */
    public final boolean m140506b2() {
        return false;
    }

    /* JADX INFO: renamed from: c2 */
    public final boolean m140507c2() {
        return this.visitorsCount > 0 && !this.visitorDotDismissed;
    }

    /* JADX INFO: renamed from: d2 */
    public final void m140508d2(Act act, String from, Privilege privilege) {
        C8927c.m54567D0(act, from, privilege, PurchaseType.TYPE_GET_VIP, null, 0, null, null, null, null, false, false, 4048, null);
    }

    /* JADX INFO: renamed from: f2 */
    public final void m140509f2(MeTabRevampMemberCardHelper.CardType cardType, String privilegeTitle) {
        String str;
        int i = C17733a.f115465b[cardType.ordinal()];
        String str2 = "vip";
        if (i == 1) {
            str = "vip";
        } else if (i == 2) {
            str = "see";
        } else if (i == 3) {
            str = "premium";
        } else {
            if (i != 4) {
                nbr.m162172a();
                return;
            }
            str = "ultra_premium";
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return;
        }
        if (userM116600p9.isUltraPremium()) {
            str2 = "ultra_premium";
        } else if (userM116600p9.isSVIP()) {
            str2 = "premium";
        } else if (!rbb0.m180746s(null, 1, null)) {
            str2 = "see";
        } else if (!userM116600p9.isVIP()) {
            str2 = "free";
        }
        box.INSTANCE.m105728q(str, str2, privilegeTitle);
    }

    @Override // p153l.u1b0
    /* JADX INFO: renamed from: g0 */
    public void mo121680g0(boolean hidden) {
        if (hidden) {
            return;
        }
        m140504Z1();
        m140499T1();
        m140498S1();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        m140501V1();
        ((MeTabRevampTest1ViewModel) this.viewModel).m44447o1();
        ((MeTabRevampTest1ViewModel) this.viewModel).m44433h1();
        MeTabRevampTest1ViewModel meTabRevampTest1ViewModel = (MeTabRevampTest1ViewModel) this.viewModel;
        userM116593na.getClass();
        meTabRevampTest1ViewModel.m44458t1(userM116593na);
        m140511h2();
        ((MeTabRevampTest1ViewModel) this.viewModel).m44442m1(userM116593na);
        ((MeTabRevampTest1ViewModel) this.viewModel).m44406S1();
        ((MeTabRevampTest1ViewModel) this.viewModel).m44436j1();
        m140496Q1();
        m140502X1();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m140510g2(MeTabRevampMemberCardHelper.CardType type) {
        String str;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return;
        }
        int i = C17733a.f115465b[type.ordinal()];
        String str2 = "vip";
        if (i == 1) {
            str = "vip";
        } else if (i == 2) {
            str = "see";
        } else if (i == 3) {
            str = "premium";
        } else {
            if (i != 4) {
                nbr.m162172a();
                return;
            }
            str = "ultra_premium";
        }
        if (userM116600p9.isUltraPremium()) {
            str2 = "ultra_premium";
        } else if (userM116600p9.isSVIP()) {
            str2 = "premium";
        } else if (!rbb0.m180746s(null, 1, null)) {
            str2 = "see";
        } else if (!userM116600p9.isVIP()) {
            str2 = "free";
        }
        box.INSTANCE.m105727p(str, str2);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m140511h2() {
        boolean zM140506b2 = m140506b2();
        this.dotCurrentlyVisible = zM140506b2;
        ((MeTabRevampTest1ViewModel) this.viewModel).m44394O1(zM140506b2);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m140512l1(long newCount) {
        long j = this.likesYouTotalCount;
        if (newCount == j) {
            return;
        }
        if (newCount >= j || !CoreModule.f18264c.f20429u0.m31375A5()) {
            this.likesYouTotalCount = newCount;
            m140501V1();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final boolean m140513m1() {
        return (joa.m146401n4() && joa.m146386f4() && joa.m146396k4() && joa.m146392i4()) ? false : true;
    }

    @Override // p153l.u1b0
    @NotNull
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m140514r1() {
        Act act = act();
        if (act == null) {
            return;
        }
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        if (!lc9Var.m153654l3(purchaseType)) {
            lc9 lc9Var2 = CoreModule.f18264c.f20311G2;
            purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
            if (!lc9Var2.m153654l3(purchaseType)) {
                return;
            }
        }
        duringCreated(C8929e.m54827r(act, purchaseType)).subscribe(psd0.m173597H(new y20() { // from class: l.zjx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140451Y0(this.f204710a, (C8928d) obj);
            }
        }, new y20() { // from class: l.akx
            @Override // p153l.y20
            public final void call(Object obj) {
                ikx.m140431D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s1 */
    public final void m140515s1() {
        Act act = act();
        if (act == null) {
            return;
        }
        xib0 j0pVar = d79.m114653L() ? new j0p() : new ful0();
        PurchaseType purchaseType = (CoreModule.f18264c.f20438x0.m31177I3() == null && !CoreModule.f18264c.f20396j0.m31646y4()) ? null : PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        ge90.m129971e(act, "MINE_SUB_ITEM", purchaseType, j0pVar);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m140516t1(@NotNull MeTabRevampMemberCardHelper.CardType cardType, boolean isInstantMatch, boolean isLocked, @Nullable Privilege privilege, @NotNull String privilegeTitle) {
        Privilege privilege2;
        Privilege privilege3;
        Privilege privilege4 = privilege;
        cardType.getClass();
        privilegeTitle.getClass();
        Act act = act();
        if (act == null) {
            return;
        }
        m140509f2(cardType, privilegeTitle);
        int i = C17733a.f115465b[cardType.ordinal()];
        if (i == 1) {
            if (isInstantMatch) {
                C8927c.m54597N0(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", null, null, null, privilege4 == Privilege.immediately_match ? privilege4 : null, null, 92, null);
                return;
            } else if (isLocked) {
                C8927c.m54567D0(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", privilege4, null, null, 0, null, null, null, null, false, false, 4088, null);
                return;
            } else {
                m140508d2(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", privilege4);
                return;
            }
        }
        if (i == 2) {
            if (isInstantMatch) {
                C8927c.m54597N0(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", null, null, null, privilege4 == Privilege.immediately_match ? privilege4 : null, null, 92, null);
                return;
            } else {
                if (isLocked) {
                    C8927c.m54567D0(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", privilege4, null, null, 0, null, null, null, null, false, false, 4088, null);
                    return;
                }
                if (privilege4 == null) {
                    privilege4 = Privilege.see_who_likes_me;
                }
                C8927c.m54571E1(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", privilege4, null, null, 24, null);
                return;
            }
        }
        if (i == 3) {
            if (isInstantMatch) {
                C8927c.m54597N0(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", null, null, null, privilege4 == Privilege.immediately_match ? privilege4 : null, null, 92, null);
                return;
            } else {
                C8927c.m54567D0(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", privilege4, null, null, 0, null, null, null, null, false, false, 4088, null);
                return;
            }
        }
        if (i != 4) {
            nbr.m162172a();
            return;
        }
        if (!joa.m146396k4()) {
            m140515s1();
            return;
        }
        int i2 = privilege4 == null ? -1 : C17733a.f115466c[privilege4.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                privilege3 = Privilege.full_boost;
            } else if (i2 != 3) {
                privilege2 = null;
            } else {
                privilege3 = Privilege.unlimit_free_super_like;
            }
            privilege2 = privilege3;
        } else {
            privilege2 = privilege4;
        }
        C8927c.m54597N0(act, "p_navigation_view,e_intl_me_tab_sub_privilege_list_click,click", null, null, null, privilege2, null, 92, null);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m140517u1(@NotNull MeTabRevampMemberCardHelper.CardType type) {
        type.getClass();
        Act act = act();
        if (act == null) {
            return;
        }
        int i = C17733a.f115465b[type.ordinal()];
        if (i == 1) {
            m140457e2(this, act, null, null, 6, null);
            return;
        }
        if (i == 2) {
            C8927c.m54571E1(act, "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, 28, null);
            return;
        }
        if (i == 3) {
            C8927c.m54567D0(act, "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, 0, null, null, null, null, false, false, 4092, null);
            return;
        }
        if (i != 4) {
            nbr.m162172a();
        } else if (joa.m146396k4() || CoreModule.f18264c.f20311G2.m153654l3(PurchaseType.TYPE_ULTRA_PREMIUM)) {
            C8927c.m54597N0(act, "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, null, null, 124, null);
        } else {
            m140515s1();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m140518v1(int page) {
        Act act;
        String str;
        MeTabRevampMemberCardHelper.CardType cardTypeM44421a0 = ((MeTabRevampTest1ViewModel) this.viewModel).m44421a0();
        if (cardTypeM44421a0 == null || (act = act()) == null) {
            return;
        }
        m140510g2(cardTypeM44421a0);
        int i = C17733a.f115465b[cardTypeM44421a0.ordinal()];
        if (i == 1) {
            m140457e2(this, act, "p_navigation_view,e_intl_me_tab_sub_btn_click,click", null, 4, null);
            return;
        }
        if (i == 2) {
            C8927c.m54571E1(act, "p_navigation_view,e_intl_me_tab_sub_btn_click,click", null, null, null, 28, null);
            return;
        }
        if (i == 3) {
            String str2 = "p_navigation_view,e_intl_me_tab_sub_btn_click,click";
            FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
            if (freeTrialDataM31579C4 != null && (str = freeTrialDataM31579C4.skuId) != null && str.length() != 0) {
                str2 = "p_suggest_users_home_view,e_premium_promo_50off_card,click";
            }
            C8927c.m54567D0(act, str2, null, null, null, 0, null, null, null, null, false, false, 4092, null);
            return;
        }
        if (i != 4) {
            nbr.m162172a();
        } else if (joa.m146396k4() || CoreModule.f18264c.f20311G2.m153654l3(PurchaseType.TYPE_ULTRA_PREMIUM)) {
            C8927c.m54597N0(act, "p_navigation_view,e_intl_me_tab_sub_btn_click,click", null, null, null, null, null, 124, null);
        } else {
            m140515s1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m140519x1() {
        this.subDotShown.put(Boolean.TRUE);
        this.dotCurrentlyVisible = false;
        ((MeTabRevampTest1ViewModel) this.viewModel).m44394O1(false);
        m140515s1();
    }

    /* JADX INFO: renamed from: z1 */
    public final void m140520z1() {
        Act act = act();
        if (act == null) {
            return;
        }
        fix.INSTANCE.m125763a(act, MeTabIapType.BOOST, "grid_4");
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: n1 */
    public static final void m140471n1(List list) {
    }

    /* JADX INFO: renamed from: o1 */
    public static final void m140473o1(Throwable th) {
    }

    /* JADX INFO: renamed from: q1 */
    public static final void m140477q1(Throwable th) {
    }
}
