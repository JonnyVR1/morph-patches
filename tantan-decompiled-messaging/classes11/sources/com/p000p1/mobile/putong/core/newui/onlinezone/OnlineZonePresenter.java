package com.p000p1.mobile.putong.core.newui.onlinezone;

import android.content.DialogInterface;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.onlinezone.OnlineZonePresenter;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;
import l.yvv;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ane0;
import p009l.q860;
import p009l.vo50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ-\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\fJ\u0019\u0010$\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R6\u0010<\u001a\u0016\u0012\u0004\u0012\u00020&\u0018\u000104j\n\u0012\u0004\u0012\u00020&\u0018\u0001`58\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Ll/jq2;", "Ll/vo50;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;)V", "", "H0", "()Z", "", "J0", "()V", "I0", "a0", "Lcom/p1/mobile/putong/data/Links;", "links", "needRefresh", "U0", "(Lcom/p1/mobile/putong/data/Links;Z)V", "destroy", "", "requestCode", "", "", "permissions", "", "grantResults", "X0", "(I[Ljava/lang/String;[I)V", "Y0", "S0", "R0", "E0", "Ll/d30;", "noPrivilege", "V0", "(Ll/d30;)Z", "Lcom/p1/mobile/putong/data/User;", "user", "F0", "(Lcom/p1/mobile/putong/data/User;)V", "a", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "b", "Lcom/p1/mobile/putong/data/Links;", "G0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "(Lcom/p1/mobile/putong/data/Links;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "(Ljava/util/ArrayList;)V", "userList", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class OnlineZonePresenter extends jq2<vo50> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final OnlineZoneFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Links links;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ArrayList<User> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineZonePresenter(@NotNull OnlineZoneFrag onlineZoneFrag) {
        super(onlineZoneFrag);
        onlineZoneFrag.getClass();
        this.frag = onlineZoneFrag;
    }

    /* JADX INFO: renamed from: C0 */
    public static j760 m7267C0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m7268D0(OnlineZonePresenter onlineZonePresenter, PurchaseType purchaseType) {
        onlineZonePresenter.m7306Y0();
    }

    /* JADX INFO: renamed from: H0 */
    private final boolean m7269H0() {
        if (CoreModule.P().g().D9()) {
            return xma.L3();
        }
        return CoreModule.P().g().bg() ? xma.H3() : xma.N3();
    }

    /* JADX INFO: renamed from: I0 */
    private final void m7270I0() {
        if (PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            if (NullChecker.a(((jq2) this).viewModel) && vwb.J(this.userList)) {
                ((vo50) ((jq2) this).viewModel).m23469N();
            }
            m7303U0(null, true);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m7271J0() {
        if (PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && NullChecker.a(((jq2) this).viewModel) && vwb.J(this.userList)) {
            ((vo50) ((jq2) this).viewModel).m23469N();
            m7303U0(null, true);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m7272L0(OnlineZonePresenter onlineZonePresenter, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        permissionDeniedReason.getClass();
        if (z) {
            onlineZonePresenter.m7270I0();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m7273N0(DialogInterface dialogInterface) {
        new Function0() { // from class: l.co50
            public final Object invoke() {
                return OnlineZonePresenter.m7274O0();
            }
        };
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m7274O0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m7275P0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public static final void m7276Q0() {
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m7277W0(OnlineZonePresenter onlineZonePresenter, d30 d30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d30Var = null;
        }
        return onlineZonePresenter.m7304V0(d30Var);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m7278e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m7279f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m7280g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static String m7282i0(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static String m7283j0(User user) {
        user.getClass();
        return ((Media) user.fp()).url;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m7285l0(final OnlineZonePresenter onlineZonePresenter, Bundle bundle) {
        if (yvv.b(onlineZonePresenter.act(), new PermissionHelper.InterfaceC0531b() { // from class: l.yn50
            @Override // com.p000p1.mobile.putong.p004ui.permission.PermissionHelper.InterfaceC0531b
            /* JADX INFO: renamed from: a */
            public final void mo10235a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                OnlineZonePresenter.m7272L0(this.f23153a, z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.zn50
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OnlineZonePresenter.m7273N0(dialogInterface);
            }
        }, new Runnable() { // from class: l.ao50
            @Override // java.lang.Runnable
            public final void run() {
                OnlineZonePresenter.m7275P0();
            }
        }, new d30() { // from class: l.bo50
            public final void call() {
                OnlineZonePresenter.m7276Q0();
            }
        })) {
            onlineZonePresenter.m7270I0();
        } else {
            ((vo50) ((jq2) onlineZonePresenter).viewModel).m23470O();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m7286m0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: n0 */
    public static void m7287n0(OnlineZonePresenter onlineZonePresenter, Throwable th) {
        if (vwb.J(onlineZonePresenter.userList)) {
            ((vo50) ((jq2) onlineZonePresenter).viewModel).m23468M();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m7289p0(User user, OnlineZonePresenter onlineZonePresenter, Relationship relationship) {
        CoreModule.c.m2.r3(user);
        onlineZonePresenter.frag.m7255R4().m12591L(user);
        if (vwb.J(onlineZonePresenter.frag.m7255R4().m12590K())) {
            onlineZonePresenter.m7306Y0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m7290q0(OnlineZonePresenter onlineZonePresenter, String str) {
        Picture picture = new Picture();
        str.getClass();
        ((Media) picture).url = str;
        ((vo50) ((jq2) onlineZonePresenter).viewModel).m23471P(picture);
    }

    /* JADX INFO: renamed from: r0 */
    public static Boolean m7291r0(User user) {
        user.getClass();
        return Boolean.valueOf(user.hasPic());
    }

    /* JADX INFO: renamed from: s0 */
    public static void m7292s0(OnlineZonePresenter onlineZonePresenter, Throwable th) {
        ((vo50) ((jq2) onlineZonePresenter).viewModel).m23468M();
        ((vo50) ((jq2) onlineZonePresenter).viewModel).m23476k();
    }

    /* JADX INFO: renamed from: t0 */
    public static void m7293t0(OnlineZonePresenter onlineZonePresenter, PurchaseType purchaseType) {
        onlineZonePresenter.m7306Y0();
    }

    /* JADX INFO: renamed from: x0 */
    public static void m7295x0(OnlineZonePresenter onlineZonePresenter, NetworkInfo networkInfo) {
        onlineZonePresenter.m7270I0();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m7296y0(OnlineZonePresenter onlineZonePresenter, j760 j760Var) {
        Object obj = j760Var.b;
        obj.getClass();
        DbLinks dbLinks = ((q860) obj).f19069b;
        dbLinks.getClass();
        onlineZonePresenter.links = dbLinks.links;
        Object obj2 = j760Var.b;
        obj2.getClass();
        ArrayList<User> arrayList = new ArrayList<>((Collection<? extends User>) ((q860) obj2).f19068a);
        onlineZonePresenter.userList = arrayList;
        if (onlineZonePresenter.m7269H0() || arrayList.size() <= 8 || arrayList.size() % 2 != 1) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<User> arrayList2 = onlineZonePresenter.userList;
            arrayList.remove((arrayList2 != null ? arrayList2.size() : 0) - 1);
        }
        boolean zJ = vwb.J(onlineZonePresenter.userList);
        s7m s7mVar = ((jq2) onlineZonePresenter).viewModel;
        if (zJ) {
            ((vo50) s7mVar).m23467L();
        } else {
            ArrayList<User> arrayList3 = onlineZonePresenter.userList;
            arrayList3.getClass();
            ((vo50) s7mVar).m23466K(arrayList3, onlineZonePresenter.m7269H0());
        }
        ((vo50) ((jq2) onlineZonePresenter).viewModel).m23476k();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m7297z0(OnlineZonePresenter onlineZonePresenter, c cVar) {
        cVar.getClass();
        if (cVar == c.i) {
            onlineZonePresenter.m7271J0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m7298E0() {
        m7277W0(this, null, 1, null);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m7299F0(@NotNull final User user) {
        user.getClass();
        zvf0.r("e_superlikeButton", this.frag.pageId());
        CoreMemberModule.F().b().Ml(this.frag.act(), user, true, true, false, "p_home_nearby,superlike", new e30() { // from class: l.eo50
            public final void call(Object obj) {
                OnlineZonePresenter.m7289p0(user, this, (Relationship) obj);
            }
        }, (e30) null, this.frag.pageId(), (LikeExtraData) null, (String) null, (String) null);
    }

    @Nullable
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m7301R0() {
        CoreModule.c.f2.w3(act());
    }

    /* JADX INFO: renamed from: S0 */
    public final void m7302S0() {
        ane0.m11527x(act());
    }

    /* JADX INFO: renamed from: U0 */
    public final void m7303U0(@Nullable Links links, boolean needRefresh) {
        CoreModule.c.m2.E3(links, 20, needRefresh, "online");
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m7304V0(@Nullable d30 noPrivilege) {
        if (CoreModule.P().g().D9()) {
            if (xma.L3()) {
                return false;
            }
            CoreModule.P().a().qm(act(), "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.fo50
                public final void call(Object obj) {
                    OnlineZonePresenter.m7293t0(this.f13112a, (PurchaseType) obj);
                }
            });
            if (noPrivilege != null) {
                noPrivilege.call();
            }
            return true;
        }
        if (CoreModule.P().g().bg()) {
            if (xma.H3()) {
                return false;
            }
            CoreModule.P().g().Ds(act(), "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.go50
                public final void call(Object obj) {
                    OnlineZonePresenter.m7268D0(this.f13651a, (PurchaseType) obj);
                }
            }, (d30) null);
            if (noPrivilege != null) {
                noPrivilege.call();
            }
            return true;
        }
        if (xma.N3()) {
            return false;
        }
        m7301R0();
        if (noPrivilege != null) {
            noPrivilege.call();
        }
        return true;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m7305X0(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m7270I0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m7306Y0() {
        m7270I0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m7307a0() {
        rx.c cVarDistinctUntilChanged;
        super.a0();
        creates(new e30() { // from class: l.sn50
            public final void call(Object obj) {
                OnlineZonePresenter.m7285l0(this.f20373a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.lo50
            public final void call(Object obj) {
                OnlineZonePresenter.m7297z0(this.f16272a, (c) obj);
            }
        }));
        rx.c cVarSkip = duringCreated(ConnectivityReceiver.m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.mo50
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m7286m0((NetworkInfo) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.no50
            public final Object call(Object obj) {
                return OnlineZonePresenter.m7279f0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.oo50
            public final void call(Object obj) {
                OnlineZonePresenter.m7295x0(this.f18189a, (NetworkInfo) obj);
            }
        }));
        rx.c cVarO9 = CoreModule.c.e0.o9();
        final Function1 function2 = new Function1() { // from class: l.tn50
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m7291r0((User) obj);
            }
        };
        rx.c cVarFilter = cVarO9.filter(new w9j() { // from class: l.un50
            public final Object call(Object obj) {
                return OnlineZonePresenter.m7280g0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.vn50
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m7283j0((User) obj);
            }
        };
        duringCreated(cVarFilter.map(new w9j() { // from class: l.wn50
            public final Object call(Object obj) {
                return OnlineZonePresenter.m7282i0(function3, obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.xn50
            public final void call(Object obj) {
                OnlineZonePresenter.m7290q0(this.f22652a, (String) obj);
            }
        }, new e30() { // from class: l.do50
            public final void call(Object obj) {
                OnlineZonePresenter.m7278e0((Throwable) obj);
            }
        }));
        if (CoreModule.P().g().D9()) {
            cVarDistinctUntilChanged = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged();
        } else {
            cVarDistinctUntilChanged = CoreModule.P().g().bg() ? CoreModule.c.C0.u3(SummarizedPrivilegesId.get("platinum")).distinctUntilChanged() : CoreModule.c.C0.u3(SummarizedPrivilegesId.get("supremePartner")).distinctUntilChanged();
        }
        rx.c cVarL3 = CoreModule.c.m2.L3();
        final OnlineZonePresenter$initSubscription$9 onlineZonePresenter$initSubscription$9 = OnlineZonePresenter$initSubscription$9.INSTANCE;
        duringCreated(mkd0.r(cVarDistinctUntilChanged, cVarL3, new x9j() { // from class: l.ho50
            public final Object call(Object obj, Object obj2) {
                return OnlineZonePresenter.m7267C0(onlineZonePresenter$initSubscription$9, obj, obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.io50
            public final void call(Object obj) {
                OnlineZonePresenter.m7296y0(this.f14728a, (j760) obj);
            }
        }, new e30() { // from class: l.jo50
            public final void call(Object obj) {
                OnlineZonePresenter.m7292s0(this.f15245a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.m2.M3()).subscribe(mkd0.G(new e30() { // from class: l.ko50
            public final void call(Object obj) {
                OnlineZonePresenter.m7287n0(this.f15783a, (Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
