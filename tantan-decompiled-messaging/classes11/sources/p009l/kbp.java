package p009l;

import com.p1.mobile.android.app.Act;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.ho2;
import l.k9o;
import l.soj0;
import l.wxs;
import l.x6s;
import l.xtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ll/kbp;", "Ll/x6s;", "Ll/ho2;", "Ll/ebp;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "a4", "Z3", "b4", "Ll/upn;", "j", "Lkotlin/Lazy;", "Y3", "()Ll/upn;", "intlInviteFriendToSharePresenter", "Ll/ucn;", "k", "X3", "()Ll/ucn;", "intlFamilyChatSharePresenter", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.intlInviteFriendToSharePresenter = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.gbp
            public final Object invoke() {
                return kbp.m17435W3(bsmVar, this);
            }
        });
        this.intlFamilyChatSharePresenter = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.hbp
            public final Object invoke() {
                return kbp.m17431S3(bsmVar, this);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static ucn m17431S3(bsm bsmVar, kbp kbpVar) {
        ucn ucnVar = new ucn(bsmVar);
        kbpVar.z2(ucnVar);
        return ucnVar;
    }

    /* JADX INFO: renamed from: T3 */
    public static void m17432T3(kbp kbpVar, Boolean bool) {
        if (((bwr) kbpVar).viewModel == null) {
            Act act = ((wxs) kbpVar).e.a;
            act.getClass();
            ebp ebpVar = new ebp(act, kbpVar);
            ((bwr) kbpVar).viewModel = ebpVar;
            kbpVar.C(ebpVar);
        }
        ebp ebpVar2 = ((bwr) kbpVar).viewModel;
        if (ebpVar2 != null) {
            bool.getClass();
            ebpVar2.m13803M(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m17433U3(Throwable th) {
        xtr.c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m17434V3(kbp kbpVar, soj0 soj0Var) {
        kbpVar.m17440b4();
    }

    /* JADX INFO: renamed from: W3 */
    public static upn m17435W3(bsm bsmVar, kbp kbpVar) {
        upn upnVar = new upn(bsmVar);
        kbpVar.z2(upnVar);
        return upnVar;
    }

    /* JADX INFO: renamed from: X3 */
    public final ucn m17436X3() {
        return (ucn) this.intlFamilyChatSharePresenter.getValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public final upn m17437Y3() {
        return (upn) this.intlInviteFriendToSharePresenter.getValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m17438Z3() {
        if (E2() == null) {
            return;
        }
        m17436X3().m22795W3();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m17439a4() {
        if (E2() == null) {
            return;
        }
        m17437Y3().m23123Z3();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m17440b4() {
        duringCreated(k9o.g()).subscribe(ffw.e(new e30() { // from class: l.ibp
            public final void call(Object obj) {
                kbp.m17432T3(this.f14473a, (Boolean) obj);
            }
        }, new e30() { // from class: l.jbp
            public final void call(Object obj) {
                kbp.m17433U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m17441t() {
        super/*l.k4t*/.t();
        duringCreated((c) F2().IntlVoiceLiveEvent.openSharePanelDialog().g()).subscribe(ffw.h(new e30() { // from class: l.fbp
            public final void call(Object obj) {
                kbp.m17434V3(this.f12909a, (soj0) obj);
            }
        }));
    }
}
