package com.p046p1.mobile.putong.core.newui.onlinezone;

import android.content.DialogInterface;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Permissions;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.onlinezone.OnlineZonePresenter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
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
import p133rx.C22306c;
import p149l.ane0;
import p149l.d30;
import p149l.e30;
import p149l.j760;
import p149l.jq2;
import p149l.mkd0;
import p149l.q860;
import p149l.vo50;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xma;
import p149l.yvv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ-\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\fJ\u0019\u0010$\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R6\u0010<\u001a\u0016\u0012\u0004\u0012\u00020&\u0018\u000104j\n\u0012\u0004\u0012\u00020&\u0018\u0001`58\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006="}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZonePresenter;", "Ll/jq2;", "Ll/vo50;", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;)V", "", "H0", "()Z", "", "J0", "()V", "I0", "a0", "Lcom/p1/mobile/putong/data/Links;", "links", "needRefresh", "U0", "(Lcom/p1/mobile/putong/data/Links;Z)V", "destroy", "", "requestCode", "", "", Permissions.TYPE, "", "grantResults", "X0", "(I[Ljava/lang/String;[I)V", "Y0", "S0", "R0", "E0", "Ll/d30;", "noPrivilege", "V0", "(Ll/d30;)Z", "Lcom/p1/mobile/putong/data/User;", "user", "F0", "(Lcom/p1/mobile/putong/data/User;)V", "a", "Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneFrag;", "b", "Lcom/p1/mobile/putong/data/Links;", "G0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "(Lcom/p1/mobile/putong/data/Links;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "(Ljava/util/ArrayList;)V", "userList", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static j760 m43062C0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m43063D0(OnlineZonePresenter onlineZonePresenter, PurchaseType purchaseType) {
        onlineZonePresenter.m43101Y0();
    }

    /* JADX INFO: renamed from: H0 */
    private final boolean m43064H0() {
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            return xma.m210047L3();
        }
        return CoreModule.m29935P().m94656g().mo35050bg() ? xma.m210045H3() : xma.m210049N3();
    }

    /* JADX INFO: renamed from: I0 */
    private final void m43065I0() {
        if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            if (NullChecker.m81303a(this.viewModel) && vwb.m200296J(this.userList)) {
                ((vo50) this.viewModel).m199114N();
            }
            m43098U0(null, true);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m43066J0() {
        if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && NullChecker.m81303a(this.viewModel) && vwb.m200296J(this.userList)) {
            ((vo50) this.viewModel).m199114N();
            m43098U0(null, true);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m43067L0(OnlineZonePresenter onlineZonePresenter, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        permissionDeniedReason.getClass();
        if (z) {
            onlineZonePresenter.m43065I0();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m43068N0(DialogInterface dialogInterface) {
        new Function0() { // from class: l.co50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OnlineZonePresenter.m43069O0();
            }
        };
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m43069O0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m43070P0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public static final void m43071Q0() {
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m43072W0(OnlineZonePresenter onlineZonePresenter, d30 d30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d30Var = null;
        }
        return onlineZonePresenter.m43099V0(d30Var);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m43073e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m43074f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m43075g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static String m43077i0(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static String m43078j0(User user) {
        user.getClass();
        return user.m60124fp().url;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m43080l0(final OnlineZonePresenter onlineZonePresenter, Bundle bundle) {
        if (yvv.m216241b(onlineZonePresenter.act(), new PermissionHelper.InterfaceC13129b() { // from class: l.yn50
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                OnlineZonePresenter.m43067L0(this.f199145a, z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.zn50
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OnlineZonePresenter.m43068N0(dialogInterface);
            }
        }, new Runnable() { // from class: l.ao50
            @Override // java.lang.Runnable
            public final void run() {
                OnlineZonePresenter.m43070P0();
            }
        }, new d30() { // from class: l.bo50
            @Override // p149l.d30
            public final void call() {
                OnlineZonePresenter.m43071Q0();
            }
        })) {
            onlineZonePresenter.m43065I0();
        } else {
            ((vo50) onlineZonePresenter.viewModel).m199115O();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static Boolean m43081m0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: n0 */
    public static void m43082n0(OnlineZonePresenter onlineZonePresenter, Throwable th) {
        if (vwb.m200296J(onlineZonePresenter.userList)) {
            ((vo50) onlineZonePresenter.viewModel).m199113M();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m43084p0(User user, OnlineZonePresenter onlineZonePresenter, Relationship relationship) {
        CoreModule.f17545c.f19665m2.m191475r3(user);
        onlineZonePresenter.frag.m43051R4().m107046L(user);
        if (vwb.m200296J(onlineZonePresenter.frag.m43051R4().m107045K())) {
            onlineZonePresenter.m43101Y0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m43085q0(OnlineZonePresenter onlineZonePresenter, String str) {
        Picture picture = new Picture();
        str.getClass();
        picture.url = str;
        ((vo50) onlineZonePresenter.viewModel).m199116P(picture);
    }

    /* JADX INFO: renamed from: r0 */
    public static Boolean m43086r0(User user) {
        user.getClass();
        return Boolean.valueOf(user.hasPic());
    }

    /* JADX INFO: renamed from: s0 */
    public static void m43087s0(OnlineZonePresenter onlineZonePresenter, Throwable th) {
        ((vo50) onlineZonePresenter.viewModel).m199113M();
        ((vo50) onlineZonePresenter.viewModel).m199120k();
    }

    /* JADX INFO: renamed from: t0 */
    public static void m43088t0(OnlineZonePresenter onlineZonePresenter, PurchaseType purchaseType) {
        onlineZonePresenter.m43101Y0();
    }

    /* JADX INFO: renamed from: x0 */
    public static void m43090x0(OnlineZonePresenter onlineZonePresenter, NetworkInfo networkInfo) {
        onlineZonePresenter.m43065I0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public static void m43091y0(OnlineZonePresenter onlineZonePresenter, j760 j760Var) {
        S s = j760Var.f116565b;
        s.getClass();
        DbLinks dbLinks = ((q860) s).f153136b;
        dbLinks.getClass();
        onlineZonePresenter.links = dbLinks.links;
        S s2 = j760Var.f116565b;
        s2.getClass();
        ArrayList<User> arrayList = new ArrayList<>((Collection<? extends User>) ((q860) s2).f153135a);
        onlineZonePresenter.userList = arrayList;
        if (onlineZonePresenter.m43064H0() || arrayList.size() <= 8 || arrayList.size() % 2 != 1) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<User> arrayList2 = onlineZonePresenter.userList;
            arrayList.remove((arrayList2 != null ? arrayList2.size() : 0) - 1);
        }
        boolean zM200296J = vwb.m200296J(onlineZonePresenter.userList);
        V v2 = onlineZonePresenter.viewModel;
        if (zM200296J) {
            ((vo50) v2).m199112L();
        } else {
            ArrayList<User> arrayList3 = onlineZonePresenter.userList;
            arrayList3.getClass();
            ((vo50) v2).m199111K(arrayList3, onlineZonePresenter.m43064H0());
        }
        ((vo50) onlineZonePresenter.viewModel).m199120k();
    }

    /* JADX INFO: renamed from: z0 */
    public static void m43092z0(OnlineZonePresenter onlineZonePresenter, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15548i) {
            onlineZonePresenter.m43066J0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m43093E0() {
        m43072W0(this, null, 1, null);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m43094F0(@NotNull final User user) {
        user.getClass();
        zvf0.m220396r(MatchScData.ModuleId.mid_e_superlikeButton, this.frag.pageId());
        CoreMemberModule.m36001F().m132651b().m36088o0(this.frag.act(), user, true, true, false, "p_home_nearby,superlike", new e30() { // from class: l.eo50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43084p0(user, this, (Relationship) obj);
            }
        }, null, this.frag.pageId(), null, null, null);
    }

    @Nullable
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m43096R0() {
        CoreModule.f17545c.f19644f2.m148615w3(act());
    }

    /* JADX INFO: renamed from: S0 */
    public final void m43097S0() {
        ane0.m97752x(act());
    }

    /* JADX INFO: renamed from: U0 */
    public final void m43098U0(@Nullable Links links, boolean needRefresh) {
        CoreModule.f17545c.f19665m2.m191464E3(links, 20, needRefresh, "online");
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m43099V0(@Nullable d30 noPrivilege) {
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            if (xma.m210047L3()) {
                return false;
            }
            CoreModule.m29935P().m94651a().mo33572qm(act(), "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.fo50
                @Override // p149l.e30
                public final void call(Object obj) {
                    OnlineZonePresenter.m43088t0(this.f98507a, (PurchaseType) obj);
                }
            });
            if (noPrivilege != null) {
                noPrivilege.call();
            }
            return true;
        }
        if (CoreModule.m29935P().m94656g().mo35050bg()) {
            if (xma.m210045H3()) {
                return false;
            }
            CoreModule.m29935P().m94656g().mo35006Ds(act(), "p_home_nearby,online", Privilege.nearby_people, new e30() { // from class: l.go50
                @Override // p149l.e30
                public final void call(Object obj) {
                    OnlineZonePresenter.m43063D0(this.f103654a, (PurchaseType) obj);
                }
            }, null);
            if (noPrivilege != null) {
                noPrivilege.call();
            }
            return true;
        }
        if (xma.m210049N3()) {
            return false;
        }
        m43096R0();
        if (noPrivilege != null) {
            noPrivilege.call();
        }
        return true;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m43100X0(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m43065I0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m43101Y0() {
        m43065I0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        C22306c<UserPrivilege> c22306cDistinctUntilChanged;
        super.mo39470a0();
        creates(new e30() { // from class: l.sn50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43080l0(this.f165412a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.lo50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43092z0(this.f129070a, (C4319c) obj);
            }
        }));
        C22306c c22306cSkip = duringCreated(ConnectivityReceiver.m81290m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.mo50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m43081m0((NetworkInfo) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.no50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return OnlineZonePresenter.m43074f0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.oo50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43090x0(this.f144847a, (NetworkInfo) obj);
            }
        }));
        C22306c<User> c22306cM169523o9 = CoreModule.f17545c.f19639e0.m169523o9();
        final Function1 function2 = new Function1() { // from class: l.tn50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m43086r0((User) obj);
            }
        };
        C22306c<User> c22306cFilter = c22306cM169523o9.filter(new w9j() { // from class: l.un50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return OnlineZonePresenter.m43075g0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.vn50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnlineZonePresenter.m43078j0((User) obj);
            }
        };
        duringCreated(c22306cFilter.map(new w9j() { // from class: l.wn50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return OnlineZonePresenter.m43077i0(function3, obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.xn50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43085q0(this.f193641a, (String) obj);
            }
        }, new e30() { // from class: l.do50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43073e0((Throwable) obj);
            }
        }));
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            c22306cDistinctUntilChanged = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged();
        } else {
            c22306cDistinctUntilChanged = CoreModule.m29935P().m94656g().mo35050bg() ? CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("platinum")).distinctUntilChanged() : CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        }
        C22306c<q860<User>> c22306cM191471L3 = CoreModule.f17545c.f19665m2.m191471L3();
        final OnlineZonePresenter$initSubscription$9 onlineZonePresenter$initSubscription$9 = OnlineZonePresenter$initSubscription$9.INSTANCE;
        duringCreated(mkd0.m154984r(c22306cDistinctUntilChanged, c22306cM191471L3, new x9j() { // from class: l.ho50
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return OnlineZonePresenter.m43062C0(onlineZonePresenter$initSubscription$9, obj, obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.io50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43091y0(this.f114105a, (j760) obj);
            }
        }, new e30() { // from class: l.jo50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43087s0(this.f118916a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19665m2.m191472M3()).subscribe(mkd0.m154955G(new e30() { // from class: l.ko50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineZonePresenter.m43082n0(this.f123961a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
