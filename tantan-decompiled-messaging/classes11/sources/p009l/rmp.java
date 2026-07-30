package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.d30;
import l.e30;
import l.e51;
import l.x2c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ1\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J1\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J1\u0010\u0013\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0010R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll/rmp;", "", "<init>", "()V", "", "eid", "", "i", "(Ljava/lang/String;)V", "j", "Lcom/p1/mobile/android/app/Act;", "act", "from", "Lkotlin/Function0;", "onDismiss", "o", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "q", "k", "s", "", "", "a", "[Ljava/lang/Integer;", "h", "()[Ljava/lang/Integer;", "TITLE_COVER", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rmp {

    @NotNull
    public static final rmp INSTANCE = new rmp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Integer[] TITLE_COVER = {Integer.valueOf(x2c0.Uc), Integer.valueOf(x2c0.Vc), Integer.valueOf(x2c0.Wc), Integer.valueOf(x2c0.Xc), Integer.valueOf(x2c0.Yc)};

    /* JADX INFO: renamed from: l */
    public static final void m21744l(Act act, PurchaseType purchaseType) {
        e51.H(act, new Runnable() { // from class: l.qmp
            @Override // java.lang.Runnable
            public final void run() {
                rmp.m21745m();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public static final void m21745m() {
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: n */
    public static final void m21746n(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m21747p(rmp rmpVar, Act act, String str, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        rmpVar.m21756o(act, str, function0);
    }

    /* JADX INFO: renamed from: r */
    public static final void m21748r(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: t */
    public static final void m21749t(Act act, PurchaseType purchaseType) {
        e51.H(act, new Runnable() { // from class: l.pmp
            @Override // java.lang.Runnable
            public final void run() {
                rmp.m21750u();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: u */
    public static final void m21750u() {
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: v */
    public static final void m21751v(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Integer[] m21752h() {
        return TITLE_COVER;
    }

    /* JADX INFO: renamed from: i */
    public final void m21753i(@NotNull String eid) {
        eid.getClass();
        zvf0.r(eid, "p_intl_visitors_list");
    }

    /* JADX INFO: renamed from: j */
    public final void m21754j(@NotNull String eid) {
        eid.getClass();
        zvf0.x(eid, "p_intl_visitors_list");
    }

    /* JADX INFO: renamed from: k */
    public final void m21755k(@Nullable final Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            c.D0(act, from, Privilege.intl_visitor, (PurchaseType) null, new e30() { // from class: l.hmp
                public final void call(Object obj) {
                    rmp.m21744l(act, (PurchaseType) obj);
                }
            }, 0, onDismiss != null ? new d30() { // from class: l.jmp
                public final void call() {
                    rmp.m21746n(onDismiss);
                }
            } : null, (d30) null, (String) null, (Object) null, false, false, 4008, (Object) null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m21756o(@Nullable Act act, @NotNull String from, @Nullable Function0<Unit> onDismiss) {
        from.getClass();
        if (CoreModule.c.p0.l3()) {
            m21758s(act, from, onDismiss);
        } else if (CoreModule.c.p0.j3()) {
            m21757q(act, from, onDismiss);
        } else {
            m21755k(act, from, onDismiss);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m21757q(@Nullable Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            c.E1(act, from, Privilege.intl_visitor, onDismiss != null ? new d30() { // from class: l.fmp
                public final void call() {
                    rmp.m21748r(onDismiss);
                }
            } : null, (Object) null, 16, (Object) null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m21758s(@Nullable final Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            c.N0(act, from, new e30() { // from class: l.lmp
                public final void call(Object obj) {
                    rmp.m21749t(act, (PurchaseType) obj);
                }
            }, onDismiss != null ? new d30() { // from class: l.nmp
                public final void call() {
                    rmp.m21751v(onDismiss);
                }
            } : null, (d30) null, Privilege.intl_visitor, (String) null, 64, (Object) null);
        }
    }
}
