package com.p051p1.mobile.putong.core.newui.onlinezone;

import android.content.DialogInterface;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.onlinezone.OnlineZonePresenter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.ar2;
import p153l.bx50;
import p153l.hve0;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.vg60;
import p153l.x20;
import p153l.y20;
import p153l.zxv;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ-\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\fJ\u0019\u0010$\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R6\u0010<\u001a\u0016\u0012\u0004\u0012\u00020&\u0018\u000104j\n\u0012\u0004\u0012\u00020&\u0018\u0001`58\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006="}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Ll/ar2;", "Ll/bx50;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;)V", "", "H0", "()Z", "", "J0", "()V", "I0", "a0", "Lcom/p1/mobile/putong/data/Links;", "links", "needRefresh", "U0", "(Lcom/p1/mobile/putong/data/Links;Z)V", "destroy", "", "requestCode", "", "", Permissions.TYPE, "", "grantResults", "X0", "(I[Ljava/lang/String;[I)V", "Y0", "S0", "R0", "E0", "Ll/x20;", "noPrivilege", "V0", "(Ll/x20;)Z", "Lcom/p1/mobile/putong/data/User;", "user", "F0", "(Lcom/p1/mobile/putong/data/User;)V", "a", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "b", "Lcom/p1/mobile/putong/data/Links;", "G0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "(Lcom/p1/mobile/putong/data/Links;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "(Ljava/util/ArrayList;)V", "userList", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class OnlineZonePresenter extends ar2<bx50> {

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
    public static pf60 m44073C0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m44074D0(OnlineZonePresenter onlineZonePresenter, PurchaseType purchaseType) {
        onlineZonePresenter.m44112Y0();
    }

    /* JADX INFO: renamed from: H0 */
    private final boolean m44075H0() {
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            return joa.m146361M3();
        }
        return CoreModule.m30933P().m143410g().mo36053bg() ? joa.m146359I3() : joa.m146363O3();
    }

    /* JADX INFO: renamed from: I0 */
    private final void m44076I0() {
        if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            if (NullChecker.m82486a(this.viewModel) && jyb.m147479J(this.userList)) {
                ((bx50) this.viewModel).m106847N();
            }
            m44109U0(null, true);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m44077J0() {
        if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && NullChecker.m82486a(this.viewModel) && jyb.m147479J(this.userList)) {
            ((bx50) this.viewModel).m106847N();
            m44109U0(null, true);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m44078L0(OnlineZonePresenter onlineZonePresenter, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        permissionDeniedReason.getClass();
        if (z) {
            onlineZonePresenter.m44076I0();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m44079N0(DialogInterface dialogInterface) {
        new Function0() { // from class: l.iw50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OnlineZonePresenter.m44080O0();
            }
        };
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m44080O0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m44081P0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public static final void m44082Q0() {
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m44083W0(OnlineZonePresenter onlineZonePresenter, x20 x20Var, int i, Object obj) {
        if ((i & 1) != 0) {
            x20Var = null;
        }
        return onlineZonePresenter.m44110V0(x20Var);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m44084e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m44085f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m44086g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static String m44088i0(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static String m44089j0(User user) {
        user.getClass();
        return user.m61308fp().url;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m44091l0(final OnlineZonePresenter onlineZonePresenter, Bundle bundle) {
        if (zxv.m222085b(onlineZonePresenter.act(), new PermissionHelper.InterfaceC13292b() { // from class: l.ew50
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                OnlineZonePresenter.m44078L0(this.f96093a, z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.fw50
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OnlineZonePresenter.m44079N0(dialogInterface);
            }
        }, new Runnable() { // from class: l.gw50
            @Override // java.lang.Runnable
            public final void run() {
                OnlineZonePresenter.m44081P0();
            }
        }, new x20() { // from class: l.hw50
            @Override // p153l.x20
            public final void call() {
                OnlineZonePresenter.m44082Q0();
            }
        })) {
            onlineZonePresenter.m44076I0();
        } else {
            ((bx50) onlineZonePresenter.viewModel).m106848O();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m44092m0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: n0 */
    public static void m44093n0(OnlineZonePresenter onlineZonePresenter, Throwable th) {
        if (jyb.m147479J(onlineZonePresenter.userList)) {
            ((bx50) onlineZonePresenter.viewModel).m106846M();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m44095p0(User user, OnlineZonePresenter onlineZonePresenter, Relationship relationship) {
        CoreModule.f18264c.f20407m2.m123966r3(user);
        onlineZonePresenter.frag.m44062R4().m141656L(user);
        if (jyb.m147479J(onlineZonePresenter.frag.m44062R4().m141655K())) {
            onlineZonePresenter.m44112Y0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m44096q0(OnlineZonePresenter onlineZonePresenter, String str) {
        Picture picture = new Picture();
        str.getClass();
        picture.url = str;
        ((bx50) onlineZonePresenter.viewModel).m106849P(picture);
    }

    /* JADX INFO: renamed from: r0 */
    public static Boolean m44097r0(User user) {
        user.getClass();
        return Boolean.valueOf(user.hasPic());
    }

    /* JADX INFO: renamed from: s0 */
    public static void m44098s0(OnlineZonePresenter onlineZonePresenter, Throwable th) {
        ((bx50) onlineZonePresenter.viewModel).m106846M();
        ((bx50) onlineZonePresenter.viewModel).m106853k();
    }

    /* JADX INFO: renamed from: t0 */
    public static void m44099t0(OnlineZonePresenter onlineZonePresenter, PurchaseType purchaseType) {
        onlineZonePresenter.m44112Y0();
    }

    /* JADX INFO: renamed from: x0 */
    public static void m44101x0(OnlineZonePresenter onlineZonePresenter, NetworkInfo networkInfo) {
        onlineZonePresenter.m44076I0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public static void m44102y0(OnlineZonePresenter onlineZonePresenter, pf60 pf60Var) {
        S s = pf60Var.f152157b;
        s.getClass();
        DbLinks dbLinks = ((vg60) s).f184002b;
        dbLinks.getClass();
        onlineZonePresenter.links = dbLinks.links;
        S s2 = pf60Var.f152157b;
        s2.getClass();
        ArrayList<User> arrayList = new ArrayList<>((Collection<? extends User>) ((vg60) s2).f184001a);
        onlineZonePresenter.userList = arrayList;
        if (onlineZonePresenter.m44075H0() || arrayList.size() <= 8 || arrayList.size() % 2 != 1) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<User> arrayList2 = onlineZonePresenter.userList;
            arrayList.remove((arrayList2 != null ? arrayList2.size() : 0) - 1);
        }
        boolean zM147479J = jyb.m147479J(onlineZonePresenter.userList);
        V v2 = onlineZonePresenter.viewModel;
        if (zM147479J) {
            ((bx50) v2).m106845L();
        } else {
            ArrayList<User> arrayList3 = onlineZonePresenter.userList;
            arrayList3.getClass();
            ((bx50) v2).m106844K(arrayList3, onlineZonePresenter.m44075H0());
        }
        ((bx50) onlineZonePresenter.viewModel).m106853k();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m44103z0(OnlineZonePresenter onlineZonePresenter, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16267i) {
            onlineZonePresenter.m44077J0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m44104E0() {
        m44083W0(this, null, 1, null);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m44105F0(@NotNull final User user) {
        user.getClass();
        i4g0.m138520r(MatchScData.ModuleId.mid_e_superlikeButton, this.frag.pageId());
        CoreMemberModule.m37004F().m187693b().m37091o0(this.frag.act(), user, true, true, false, "p_home_nearby,superlike", new y20() { // from class: l.kw50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44095p0(user, this, (Relationship) obj);
            }
        }, null, this.frag.pageId(), null, null, null);
    }

    @Nullable
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m44107R0() {
        CoreModule.f18264c.f20386f2.m214443w3(act());
    }

    /* JADX INFO: renamed from: S0 */
    public final void m44108S0() {
        hve0.m137322x(act());
    }

    /* JADX INFO: renamed from: U0 */
    public final void m44109U0(@Nullable Links links, boolean needRefresh) {
        CoreModule.f18264c.f20407m2.m123955E3(links, 20, needRefresh, "online");
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m44110V0(@Nullable x20 noPrivilege) {
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            if (joa.m146361M3()) {
                return false;
            }
            CoreModule.m30933P().m143405a().mo34575qm(act(), "p_home_nearby,online", Privilege.nearby_people, new y20() { // from class: l.lw50
                @Override // p153l.y20
                public final void call(Object obj) {
                    OnlineZonePresenter.m44099t0(this.f133778a, (PurchaseType) obj);
                }
            });
            if (noPrivilege != null) {
                noPrivilege.call();
            }
            return true;
        }
        if (CoreModule.m30933P().m143410g().mo36053bg()) {
            if (joa.m146359I3()) {
                return false;
            }
            CoreModule.m30933P().m143410g().mo36009Ds(act(), "p_home_nearby,online", Privilege.nearby_people, new y20() { // from class: l.mw50
                @Override // p153l.y20
                public final void call(Object obj) {
                    OnlineZonePresenter.m44074D0(this.f139028a, (PurchaseType) obj);
                }
            }, null);
            if (noPrivilege != null) {
                noPrivilege.call();
            }
            return true;
        }
        if (joa.m146363O3()) {
            return false;
        }
        m44107R0();
        if (noPrivilege != null) {
            noPrivilege.call();
        }
        return true;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m44111X0(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m44076I0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m44112Y0() {
        m44076I0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        C22421c<UserPrivilege> c22421cDistinctUntilChanged;
        super.mo40473a0();
        creates(new y20() { // from class: l.yv50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44091l0(this.f201680a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.rw50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44103z0(this.f165108a, (C4470c) obj);
            }
        }));
        C22421c c22421cSkip = duringCreated(ConnectivityReceiver.m82473m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.sw50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m44092m0((NetworkInfo) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.tw50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return OnlineZonePresenter.m44085f0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.uw50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44101x0(this.f181241a, (NetworkInfo) obj);
            }
        }));
        C22421c<User> c22421cM116596o9 = CoreModule.f18264c.f20381e0.m116596o9();
        final Function1 function2 = new Function1() { // from class: l.zv50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m44097r0((User) obj);
            }
        };
        C22421c<User> c22421cFilter = c22421cM116596o9.filter(new qcj() { // from class: l.aw50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return OnlineZonePresenter.m44086g0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.bw50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m44089j0((User) obj);
            }
        };
        duringCreated(c22421cFilter.map(new qcj() { // from class: l.cw50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return OnlineZonePresenter.m44088i0(function3, obj);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.dw50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44096q0(this.f90993a, (String) obj);
            }
        }, new y20() { // from class: l.jw50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44084e0((Throwable) obj);
            }
        }));
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            c22421cDistinctUntilChanged = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged();
        } else {
            c22421cDistinctUntilChanged = CoreModule.m30933P().m143410g().mo36053bg() ? CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("platinum")).distinctUntilChanged() : CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        }
        C22421c<vg60<User>> c22421cM123962L3 = CoreModule.f18264c.f20407m2.m123962L3();
        final OnlineZonePresenter$initSubscription$9 onlineZonePresenter$initSubscription$9 = OnlineZonePresenter$initSubscription$9.INSTANCE;
        duringCreated(psd0.m173625r(c22421cDistinctUntilChanged, c22421cM123962L3, new rcj() { // from class: l.nw50
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return OnlineZonePresenter.m44073C0(onlineZonePresenter$initSubscription$9, obj, obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.ow50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44102y0(this.f149454a, (pf60) obj);
            }
        }, new y20() { // from class: l.pw50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44098s0(this.f154374a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20407m2.m123963M3()).subscribe(psd0.m173596G(new y20() { // from class: l.qw50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineZonePresenter.m44093n0(this.f159862a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
