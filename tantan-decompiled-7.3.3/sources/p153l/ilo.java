package p153l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p051p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VisitorInfo;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tJ'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Ll/ilo;", "Ll/ar2;", "Ll/tlo;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "E0", "()V", "", "liked", MatchFrom.superLiked, "fromButton", "Lcom/p1/mobile/putong/data/User;", "user", "D0", "(ZZZLcom/p1/mobile/putong/data/User;)Z", "a0", "Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "I0", "(IILandroid/content/Intent;)Z", "H0", "destroy", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "likedUser", "L0", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Lcom/p1/mobile/putong/data/User;Z)V", "hidden", "J0", "(Z)V", "a", "I", "getREQUEST_PROFILE", "()I", "REQUEST_PROFILE", "b", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "getClickedUser", "()Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "N0", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;)V", "clickedUser", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ilo extends ar2<tlo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int REQUEST_PROFILE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public IntlBaseVisitorInfo clickedUser;

    public ilo(@Nullable ner nerVar) {
        super(nerVar);
        this.REQUEST_PROFILE = 18;
    }

    /* JADX INFO: renamed from: A0 */
    public static Boolean m140638A0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: E0 */
    private final void m140640E0() {
        m140664H0();
    }

    /* JADX INFO: renamed from: G0 */
    public static final PaymentResultWrapper m140642G0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static C22421c m140644f0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return C22421c.just(paymentResultWrapper);
        }
        C22421c<List<UserPrivilege>> c22421cTake = CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.yko
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ilo.m140641F0(paymentResultWrapper, (List) obj);
            }
        };
        return c22421cTake.map(new qcj() { // from class: l.zko
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ilo.m140642G0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m140645g0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: h0 */
    public static C22421c m140646h0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m140647i0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m140648j0(ilo iloVar, Boolean bool) {
        iloVar.m140664H0();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m140649k0(ilo iloVar, Throwable th) {
        tlo tloVar = (tlo) iloVar.viewModel;
        if (tloVar != null) {
            tloVar.m191676H(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m140650l0(ilo iloVar, UserPrivilege userPrivilege) {
        if (joa.m146354D3()) {
            tlo tloVar = (tlo) iloVar.viewModel;
            if (tloVar != null) {
                tloVar.m191675G();
                return;
            }
            return;
        }
        tlo tloVar2 = (tlo) iloVar.viewModel;
        if (tloVar2 != null) {
            tloVar2.m191683n();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m140651m0(ilo iloVar, PaymentResultWrapper paymentResultWrapper) {
        tlo tloVar = (tlo) iloVar.viewModel;
        if (tloVar != null) {
            tloVar.m191673C(!joa.m146392i4(), joa.m146361M3(), joa.m146354D3());
        }
        CoreModule.f18264c.f20409n1.m35275S3();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m140652n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static void m140653o0(Intent intent, int i, ilo iloVar, C4470c c4470c) {
        String stringExtra;
        tlo tloVar;
        fko fkoVarM191688u;
        if (intent == null || (stringExtra = intent.getStringExtra("currentUserId")) == null) {
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(stringExtra);
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        if (iloVar.act() != null) {
            userM116503Pa.getClass();
            if (!iloVar.m140663D0(z, z2, true, userM116503Pa) || !z2 || (tloVar = (tlo) iloVar.viewModel) == null || (fkoVarM191688u = tloVar.getAdapter()) == null) {
                return;
            }
            fkoVarM191688u.m126035d0(userM116503Pa.f56859id);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m140654p0(ilo iloVar, Envelope envelope) {
        CoreData coreData;
        CoreData coreData2;
        List<InstantMatchUserInfo> list = null;
        List<VisitorInfo> list2 = (envelope == null || (coreData2 = (CoreData) envelope.getModuleData(CoreData.class)) == null) ? null : coreData2.visitorInfo;
        if (envelope != null && (coreData = (CoreData) envelope.getModuleData(CoreData.class)) != null) {
            list = coreData.picksInfo;
        }
        tlo tloVar = (tlo) iloVar.viewModel;
        if (tloVar != null) {
            tloVar.m191676H(list2, list);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m140655q0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m140656r0() {
        CoreModule.f18264c.f20409n1.m35275S3();
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m140657s0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
    }

    /* JADX INFO: renamed from: t0 */
    public static Boolean m140658t0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u0 */
    public static void m140659u0(ilo iloVar, Bundle bundle) {
        tlo tloVar = (tlo) iloVar.viewModel;
        if (tloVar != null) {
            tloVar.m191686r();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m140660x0(ilo iloVar, NetworkInfo networkInfo) {
        iloVar.m140640E0();
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m140661y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m140662z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m140663D0(boolean liked, boolean superLiked, boolean fromButton, User user) {
        return CoreMemberModule.m37004F().m187693b().mo36989cb(act(), Boolean.valueOf(liked), Boolean.valueOf(superLiked), Boolean.valueOf(fromButton), user);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m140664H0() {
        duringCreated(CoreModule.f18264c.f20409n1.m35276Y3()).subscribe(psd0.m173597H(new y20() { // from class: l.vko
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140654p0(this.f184509a, (Envelope) obj);
            }
        }, new y20() { // from class: l.wko
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140649k0(this.f189578a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m140665I0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != this.REQUEST_PROFILE) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.mko
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ilo.m140645g0((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.xko
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ilo.m140662z0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.alo
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140653o0(data, resultCode, this, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m140667L0(@NotNull IntlBaseVisitorInfo likedUser, @NotNull User user, boolean fromButton) {
        tlo tloVar;
        fko fkoVarM191688u;
        likedUser.getClass();
        user.getClass();
        this.clickedUser = likedUser;
        if (NullChecker.m82486a(likedUser)) {
            dkb dkbVar = CoreModule.f18264c.f20381e0;
            IntlBaseVisitorInfo intlBaseVisitorInfo = this.clickedUser;
            User userM116503Pa = dkbVar.m116503Pa(intlBaseVisitorInfo != null ? intlBaseVisitorInfo.userID : null);
            if (NullChecker.m82486a(userM116503Pa)) {
                userM116503Pa.getClass();
                if (!m140663D0(true, true, fromButton, userM116503Pa) || (tloVar = (tlo) this.viewModel) == null || (fkoVarM191688u = tloVar.getAdapter()) == null) {
                    return;
                }
                fkoVarM191688u.m126034c0(this.clickedUser);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m140668N0(@Nullable IntlBaseVisitorInfo intlBaseVisitorInfo) {
        this.clickedUser = intlBaseVisitorInfo;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m140640E0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        C22421c<Boolean> c22421cM30638L4;
        creates(new y20() { // from class: l.blo
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140659u0(this.f77203a, (Bundle) obj);
            }
        }, new x20() { // from class: l.hlo
            @Override // p153l.x20
            public final void call() {
                ilo.m140656r0();
            }
        });
        ner nerVar = this.lifecycleProviderImpl;
        C22421c<Boolean> c22421cSkip = null;
        IntlMeetVisitorFrag intlMeetVisitorFrag = nerVar instanceof IntlMeetVisitorFrag ? (IntlMeetVisitorFrag) nerVar : null;
        if (intlMeetVisitorFrag != null && (c22421cM30638L4 = intlMeetVisitorFrag.m30638L4()) != null) {
            final Function1 function1 = new Function1() { // from class: l.nko
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ilo.m140655q0((Boolean) obj);
                }
            };
            C22421c<Boolean> c22421cFilter = c22421cM30638L4.filter(new qcj() { // from class: l.oko
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ilo.m140661y0(function1, obj);
                }
            });
            if (c22421cFilter != null) {
                c22421cSkip = c22421cFilter.skip(1);
            }
        }
        duringCreated(c22421cSkip).subscribe(psd0.m173596G(new y20() { // from class: l.pko
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140648j0(this.f152869a, (Boolean) obj);
            }
        }));
        C22421c<NetworkInfo> c22421cSkip2 = ConnectivityReceiver.m82473m().skip(1);
        final Function1 function2 = new Function1() { // from class: l.qko
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ilo.m140638A0((NetworkInfo) obj);
            }
        };
        duringCreated(c22421cSkip2.filter(new qcj() { // from class: l.rko
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ilo.m140647i0(function2, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.sko
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140660x0(this.f169310a, (NetworkInfo) obj);
            }
        }));
        C22421c<PaymentResultWrapper> c22421cMo36025On = CoreModule.m30933P().m143410g().mo36025On();
        final Function1 function3 = new Function1() { // from class: l.tko
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ilo.m140657s0((PaymentResultWrapper) obj);
            }
        };
        C22421c<PaymentResultWrapper> c22421cFilter2 = c22421cMo36025On.filter(new qcj() { // from class: l.uko
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ilo.m140658t0(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.clo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ilo.m140644f0((PaymentResultWrapper) obj);
            }
        };
        duringCreated((C22421c) c22421cFilter2.switchMap(new qcj() { // from class: l.dlo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ilo.m140646h0(function4, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.elo
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140651m0(this.f94571a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.flo
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140650l0(this.f99680a, (UserPrivilege) obj);
            }
        }, new y20() { // from class: l.glo
            @Override // p153l.y20
            public final void call(Object obj) {
                ilo.m140652n0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: J0 */
    public final void m140666J0(boolean hidden) {
    }

    /* JADX INFO: renamed from: F0 */
    public static final PaymentResultWrapper m140641F0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }
}
