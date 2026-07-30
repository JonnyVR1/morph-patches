package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/sop;", "", "<init>", "()V", "", "eid", "", "g", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "from", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "Lkotlin/Function0;", "onDismiss", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Lkotlin/jvm/functions/Function0;)V", "h", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;)V", "p", "", "", "a", "[Ljava/lang/Integer;", "f", "()[Ljava/lang/Integer;", "TITLE_COVER", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sop {

    @NotNull
    public static final sop INSTANCE = new sop();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Integer[] TITLE_COVER = {Integer.valueOf(gbc0.f103334k0), Integer.valueOf(gbc0.f103342l0), Integer.valueOf(gbc0.f103350m0), Integer.valueOf(gbc0.f103358n0), Integer.valueOf(gbc0.f103366o0)};

    /* JADX INFO: renamed from: i */
    public static final void m187262i(Act act, PurchaseType purchaseType) {
        l51.m152888H(act, new Runnable() { // from class: l.oop
            @Override // java.lang.Runnable
            public final void run() {
                sop.m187263j();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: j */
    public static final void m187263j() {
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m187264l(sop sopVar, Act act, String str, Privilege privilege, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        sopVar.m187271k(act, str, privilege, function0);
    }

    /* JADX INFO: renamed from: m */
    public static final void m187265m(Act act, PurchaseType purchaseType) {
        l51.m152888H(act, new Runnable() { // from class: l.mop
            @Override // java.lang.Runnable
            public final void run() {
                sop.m187266n();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n */
    public static final void m187266n() {
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: o */
    public static final void m187267o(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Integer[] m187268f() {
        return TITLE_COVER;
    }

    /* JADX INFO: renamed from: g */
    public final void m187269g(@NotNull String eid) {
        eid.getClass();
        i4g0.m138520r(eid, "p_intl_meet_view");
    }

    /* JADX INFO: renamed from: h */
    public final void m187270h(@Nullable final Act act, @NotNull String from, @NotNull Privilege firstPrivilege) {
        from.getClass();
        firstPrivilege.getClass();
        if (act != null) {
            CoreModule.m30933P().m143405a().mo34575qm(act, from, firstPrivilege, new y20() { // from class: l.kop
                @Override // p153l.y20
                public final void call(Object obj) {
                    sop.m187262i(act, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m187271k(@Nullable final Act act, @NotNull String from, @NotNull Privilege firstPrivilege, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        firstPrivilege.getClass();
        if (act != null) {
            CoreModule.m30933P().m143405a().mo34577r6(act, from, firstPrivilege, new y20() { // from class: l.gop
                @Override // p153l.y20
                public final void call(Object obj) {
                    sop.m187265m(act, (PurchaseType) obj);
                }
            }, onDismiss != null ? new x20() { // from class: l.iop
                @Override // p153l.x20
                public final void call() {
                    sop.m187267o(onDismiss);
                }
            } : null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m187272p(@Nullable Act act, @NotNull String from, @NotNull Privilege firstPrivilege) {
        from.getClass();
        firstPrivilege.getClass();
        if (act != null) {
            CoreModule.m30933P().m143405a().mo34625wr(act, from, firstPrivilege);
        }
    }
}
