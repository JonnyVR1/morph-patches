package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/kbp;", "Ll/x6s;", "Ll/ho2;", "Ll/ebp;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "a4", "Z3", "b4", "Ll/upn;", "j", "Lkotlin/Lazy;", "Y3", "()Ll/upn;", "intlInviteFriendToSharePresenter", "Ll/ucn;", "k", "X3", "()Ll/ucn;", "intlFamilyChatSharePresenter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class kbp extends x6s<ho2, ebp> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy intlInviteFriendToSharePresenter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy intlFamilyChatSharePresenter;

    public kbp(@Nullable final bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.intlInviteFriendToSharePresenter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.gbp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kbp.m145313W3(bsmVar, this);
            }
        });
        this.intlFamilyChatSharePresenter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.hbp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kbp.m145309S3(bsmVar, this);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static ucn m145309S3(bsm bsmVar, kbp kbpVar) {
        ucn ucnVar = new ucn(bsmVar);
        kbpVar.m144512z2(ucnVar);
        return ucnVar;
    }

    /* JADX INFO: renamed from: T3 */
    public static void m145310T3(kbp kbpVar, Boolean bool) {
        if (kbpVar.viewModel == 0) {
            Act act = kbpVar.f188512e.f77095a;
            act.getClass();
            ebp ebpVar = new ebp(act, kbpVar);
            kbpVar.viewModel = ebpVar;
            kbpVar.mo51532C(ebpVar);
        }
        ebp ebpVar2 = (ebp) kbpVar.viewModel;
        if (ebpVar2 != null) {
            bool.getClass();
            ebpVar2.m115523M(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m145311U3(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m145312V3(kbp kbpVar, soj0 soj0Var) {
        kbpVar.m145318b4();
    }

    /* JADX INFO: renamed from: W3 */
    public static upn m145313W3(bsm bsmVar, kbp kbpVar) {
        upn upnVar = new upn(bsmVar);
        kbpVar.m144512z2(upnVar);
        return upnVar;
    }

    /* JADX INFO: renamed from: X3 */
    public final ucn m145314X3() {
        return (ucn) this.intlFamilyChatSharePresenter.getValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public final upn m145315Y3() {
        return (upn) this.intlInviteFriendToSharePresenter.getValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m145316Z3() {
        if (m206027E2() == 0) {
            return;
        }
        m145314X3().m193101W3();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m145317a4() {
        if (m206027E2() == 0) {
            return;
        }
        m145315Y3().m194899Z3();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m145318b4() {
        duringCreated(k9o.m145107g()).subscribe(ffw.m121194e(new e30() { // from class: l.ibp
            @Override // p149l.e30
            public final void call(Object obj) {
                kbp.m145310T3(this.f112375a, (Boolean) obj);
            }
        }, new e30() { // from class: l.jbp
            @Override // p149l.e30
            public final void call(Object obj) {
                kbp.m145311U3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().IntlVoiceLiveEvent.openSharePanelDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.fbp
            @Override // p149l.e30
            public final void call(Object obj) {
                kbp.m145312V3(this.f96739a, (soj0) obj);
            }
        }));
    }
}
