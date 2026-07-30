package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.b3c0;
import l.d30;
import l.e30;
import l.e51;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ll/smp;", "", "<init>", "()V", "", "eid", "", "g", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "act", "from", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "Lkotlin/Function0;", "onDismiss", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Lkotlin/jvm/functions/Function0;)V", "h", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;)V", "p", "", "", "a", "[Ljava/lang/Integer;", "f", "()[Ljava/lang/Integer;", "TITLE_COVER", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class smp {

    @NotNull
    public static final smp INSTANCE = new smp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Integer[] TITLE_COVER = {Integer.valueOf(b3c0.k0), Integer.valueOf(b3c0.l0), Integer.valueOf(b3c0.m0), Integer.valueOf(b3c0.n0), Integer.valueOf(b3c0.o0)};

    /* JADX INFO: renamed from: i */
    public static final void m22291i(Act act, PurchaseType purchaseType) {
        e51.H(act, new Runnable() { // from class: l.omp
            @Override // java.lang.Runnable
            public final void run() {
                smp.m22292j();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: j */
    public static final void m22292j() {
        CoreModule.c.C0.u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m22293l(smp smpVar, Act act, String str, Privilege privilege, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        smpVar.m22300k(act, str, privilege, function0);
    }

    /* JADX INFO: renamed from: m */
    public static final void m22294m(Act act, PurchaseType purchaseType) {
        e51.H(act, new Runnable() { // from class: l.mmp
            @Override // java.lang.Runnable
            public final void run() {
                smp.m22295n();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n */
    public static final void m22295n() {
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: o */
    public static final void m22296o(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Integer[] m22297f() {
        return TITLE_COVER;
    }

    /* JADX INFO: renamed from: g */
    public final void m22298g(@NotNull String eid) {
        eid.getClass();
        zvf0.r(eid, "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: h */
    public final void m22299h(@Nullable final Act act, @NotNull String from, @NotNull Privilege firstPrivilege) {
        from.getClass();
        firstPrivilege.getClass();
        if (act != null) {
            CoreModule.P().a().qm(act, from, firstPrivilege, new e30() { // from class: l.kmp
                public final void call(Object obj) {
                    smp.m22291i(act, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m22300k(@Nullable final Act act, @NotNull String from, @NotNull Privilege firstPrivilege, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        firstPrivilege.getClass();
        if (act != null) {
            CoreModule.P().a().r6(act, from, firstPrivilege, new e30() { // from class: l.gmp
                public final void call(Object obj) {
                    smp.m22294m(act, (PurchaseType) obj);
                }
            }, onDismiss != null ? new d30() { // from class: l.imp
                public final void call() {
                    smp.m22296o(onDismiss);
                }
            } : null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m22301p(@Nullable Act act, @NotNull String from, @NotNull Privilege firstPrivilege) {
        from.getClass();
        firstPrivilege.getClass();
        if (act != null) {
            CoreModule.P().a().wr(act, from, firstPrivilege);
        }
    }
}
