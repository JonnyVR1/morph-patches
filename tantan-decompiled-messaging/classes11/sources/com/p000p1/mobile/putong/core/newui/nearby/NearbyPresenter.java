package com.p000p1.mobile.putong.core.newui.nearby;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.nearby.NearbyPresenter;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.DbLinks;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.f30;
import l.gr9;
import l.j760;
import l.jq2;
import l.mkd0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;
import l.yvv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ane0;
import p009l.l920;
import p009l.q860;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001d\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\fJ-\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00102\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\fJ\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\fJ\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\fJ\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0012¢\u0006\u0004\b5\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010@j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ll/jq2;", "Ll/l920;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;)V", "", "D0", "()Z", "", "F0", "()V", "liked", "superliked", "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "C0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "a0", "E0", "Lcom/p1/mobile/putong/data/Links;", "links", "needRefresh", "I0", "(Lcom/p1/mobile/putong/data/Links;Z)V", "destroy", "requestCode", "", "permissions", "", "grantResults", "N0", "(I[Ljava/lang/String;[I)V", "Q0", "H0", "G0", "z0", "(Lcom/p1/mobile/putong/data/User;)V", "Ll/d30;", "noPrivilege", "J0", "(Ll/d30;)Z", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "O0", "()Ljava/lang/String;", "P0", "a", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "b", "Lcom/p1/mobile/putong/data/Links;", "A0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "(Lcom/p1/mobile/putong/data/Links;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "(Ljava/util/ArrayList;)V", "userList", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class NearbyPresenter extends jq2<l920> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NearbyFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Links links;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ArrayList<User> userList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyPresenter(@NotNull NearbyFrag nearbyFrag) {
        super(nearbyFrag);
        nearbyFrag.getClass();
        this.frag = nearbyFrag;
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ boolean m6889L0(NearbyPresenter nearbyPresenter, d30 d30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d30Var = null;
        }
        return nearbyPresenter.m6918J0(d30Var);
    }

    /* JADX INFO: renamed from: e0 */
    public static String m6890e0(User user) {
        user.getClass();
        return ((Media) user.fp()).url;
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m6891f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static j760 m6892g0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m6893h0(User user, NearbyPresenter nearbyPresenter) {
        CoreModule.c.m2.s3(user);
        nearbyPresenter.frag.m6873Y4().m15426L(user);
        if (vwb.J(nearbyPresenter.frag.m6873Y4().m15425K())) {
            nearbyPresenter.m6922Q0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m6894i0(User user) {
        user.getClass();
        return Boolean.valueOf(user.hasPic());
    }

    /* JADX INFO: renamed from: j0 */
    public static void m6895j0(NearbyPresenter nearbyPresenter, Throwable th) {
        if (vwb.J(nearbyPresenter.userList)) {
            ((l920) ((jq2) nearbyPresenter).viewModel).m17756S();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m6896k0(NearbyPresenter nearbyPresenter, c cVar) {
        cVar.getClass();
        if (cVar == c.i) {
            nearbyPresenter.m6914F0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m6897l0(NearbyPresenter nearbyPresenter, User user, Relationship relationship, int i) {
        relationship.getClass();
        Intent intentN8 = CoreModule.P().a().n8(nearbyPresenter.act(), vwb.f0(new String[]{relationship.id}), i, new ArrayList(), nearbyPresenter.frag.pageId());
        Act act = nearbyPresenter.act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentN8, CoreModule.P().a().hg(nearbyPresenter.act()));
        }
        CoreModule.c.m2.s3(user);
        nearbyPresenter.frag.m6873Y4().m15426L(user);
        if (vwb.J(nearbyPresenter.frag.m6873Y4().m15425K())) {
            nearbyPresenter.m6922Q0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m6898m0(NearbyPresenter nearbyPresenter, j760 j760Var) {
        Object obj = j760Var.b;
        obj.getClass();
        DbLinks dbLinks = ((q860) obj).f19069b;
        dbLinks.getClass();
        nearbyPresenter.links = dbLinks.links;
        Object obj2 = j760Var.b;
        obj2.getClass();
        ArrayList<User> arrayList = new ArrayList<>((Collection<? extends User>) ((q860) obj2).f19068a);
        nearbyPresenter.userList = arrayList;
        if (nearbyPresenter.m6911D0() || arrayList.size() <= 8 || arrayList.size() % 2 != 1) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<User> arrayList2 = nearbyPresenter.userList;
            arrayList.remove((arrayList2 != null ? arrayList2.size() : 0) - 1);
        }
        boolean zJ = vwb.J(nearbyPresenter.userList);
        s7m s7mVar = ((jq2) nearbyPresenter).viewModel;
        if (zJ) {
            ((l920) s7mVar).m17755R();
        } else {
            ArrayList<User> arrayList3 = nearbyPresenter.userList;
            arrayList3.getClass();
            ((l920) s7mVar).m17754Q(arrayList3, nearbyPresenter.m6911D0());
        }
        ((l920) ((jq2) nearbyPresenter).viewModel).m17765m();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m6899n0(NearbyPresenter nearbyPresenter, String str) {
        Picture picture = new Picture();
        str.getClass();
        ((Media) picture).url = str;
        ((l920) ((jq2) nearbyPresenter).viewModel).m17759V(picture);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m6900o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m6901p0(NearbyPresenter nearbyPresenter, PurchaseType purchaseType) {
        nearbyPresenter.m6922Q0();
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m6902q0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m6903r0(NearbyPresenter nearbyPresenter, Throwable th) {
        ((l920) ((jq2) nearbyPresenter).viewModel).m17756S();
        ((l920) ((jq2) nearbyPresenter).viewModel).m17765m();
    }

    /* JADX INFO: renamed from: s0 */
    public static String m6904s0(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m6905t0(NearbyPresenter nearbyPresenter, Bundle bundle) {
        if (yvv.c()) {
            nearbyPresenter.m6913E0();
        } else {
            ((l920) ((jq2) nearbyPresenter).viewModel).m17758U();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m6906u0(NearbyPresenter nearbyPresenter, PurchaseType purchaseType) {
        nearbyPresenter.m6922Q0();
    }

    /* JADX INFO: renamed from: x0 */
    public static Boolean m6907x0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: y0 */
    public static void m6908y0(NearbyPresenter nearbyPresenter, NetworkInfo networkInfo) {
        nearbyPresenter.m6913E0();
    }

    @Nullable
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m6910C0(boolean liked, boolean superliked, boolean fromButton, int picIndex, String picUrl, final User user) {
        return CoreMemberModule.F().b().Pb(liked, superliked, fromButton, picIndex, picUrl, user, act(), this.frag.pageId(), new f30() { // from class: l.r820
            public final void call(Object obj, Object obj2) {
                NearbyPresenter.m6897l0(this.f19691a, user, (Relationship) obj, ((Integer) obj2).intValue());
            }
        }, new d30() { // from class: l.s820
            public final void call() {
                NearbyPresenter.m6893h0(user, this);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m6911D0() {
        if (CoreModule.P().g().D9()) {
            return xma.L3();
        }
        return CoreModule.P().g().bg() ? xma.H3() : xma.N3();
    }

    /* JADX INFO: renamed from: E */
    public final void m6912E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        String str = ((Media) clickedUser.pictures.get(0)).url;
        str.getClass();
        if (!m6910C0(liked, false, fromButton, 0, str, clickedUser)) {
            this.frag.m6873Y4().notifyDataSetChanged();
        }
        CoreMemberModule.F().b().An(clickedUser);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m6913E0() {
        if (PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            if (NullChecker.a(((jq2) this).viewModel) && vwb.J(this.userList)) {
                ((l920) ((jq2) this).viewModel).m17757T();
            }
            m6917I0(null, true);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m6914F0() {
        if (PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && NullChecker.a(((jq2) this).viewModel) && vwb.J(this.userList)) {
            ((l920) ((jq2) this).viewModel).m17757T();
            m6917I0(null, true);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m6915G0() {
        CoreModule.c.f2.w3(act());
    }

    /* JADX INFO: renamed from: H0 */
    public final void m6916H0() {
        ane0.m11527x(act());
    }

    /* JADX INFO: renamed from: I0 */
    public final void m6917I0(@Nullable Links links, boolean needRefresh) {
        CoreModule.c.m2.E3(links, 20, needRefresh, gr9.Companion.c() ? "offline" : "");
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m6918J0(@Nullable d30 noPrivilege) {
        if (CoreModule.P().g().D9()) {
            if (xma.L3()) {
                return false;
            }
            CoreModule.P().a().qm(act(), m6920O0(), Privilege.nearby_people, new e30() { // from class: l.t820
                public final void call(Object obj) {
                    NearbyPresenter.m6906u0(this.f20577a, (PurchaseType) obj);
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
            CoreModule.P().g().Ds(act(), m6920O0(), Privilege.nearby_people, new e30() { // from class: l.u820
                public final void call(Object obj) {
                    NearbyPresenter.m6901p0(this.f21012a, (PurchaseType) obj);
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
        m6915G0();
        if (noPrivilege != null) {
            noPrivilege.call();
        }
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m6919N0(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m6913E0();
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final String m6920O0() {
        if (TextUtils.equals(this.frag.getFrom(), "nearby_meet")) {
            return "p_meet_nearby,distance";
        }
        return TextUtils.equals(this.frag.getFrom(), "from_my_tab") ? "p_navigation_nearby,distance" : "p_home_nearby,distance";
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final String m6921P0() {
        if (TextUtils.equals(this.frag.getFrom(), "nearby_meet")) {
            return "p_meet_nearby,odiamond_sayhi";
        }
        return TextUtils.equals(this.frag.getFrom(), "from_my_tab") ? "p_navigation_nearby,odiamond_sayhi" : "p_home_nearby,odiamond_sayhi";
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m6922Q0() {
        m6913E0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m6923a0() {
        rx.c cVarDistinctUntilChanged;
        super.a0();
        creates(new e30() { // from class: l.l820
            public final void call(Object obj) {
                NearbyPresenter.m6905t0(this.f15982a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.a920
            public final void call(Object obj) {
                NearbyPresenter.m6896k0(this.f9331a, (c) obj);
            }
        }));
        rx.c cVarSkip = duringCreated(ConnectivityReceiver.m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.b920
            public final Object invoke(Object obj) {
                return NearbyPresenter.m6907x0((NetworkInfo) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.c920
            public final Object call(Object obj) {
                return NearbyPresenter.m6891f0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.d920
            public final void call(Object obj) {
                NearbyPresenter.m6908y0(this.f11674a, (NetworkInfo) obj);
            }
        }));
        rx.c cVarO9 = CoreModule.c.e0.o9();
        final Function1 function2 = new Function1() { // from class: l.m820
            public final Object invoke(Object obj) {
                return NearbyPresenter.m6894i0((User) obj);
            }
        };
        rx.c cVarFilter = cVarO9.filter(new w9j() { // from class: l.n820
            public final Object call(Object obj) {
                return NearbyPresenter.m6902q0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.o820
            public final Object invoke(Object obj) {
                return NearbyPresenter.m6890e0((User) obj);
            }
        };
        duringCreated(cVarFilter.map(new w9j() { // from class: l.p820
            public final Object call(Object obj) {
                return NearbyPresenter.m6904s0(function3, obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.q820
            public final void call(Object obj) {
                NearbyPresenter.m6899n0(this.f19064a, (String) obj);
            }
        }, new e30() { // from class: l.v820
            public final void call(Object obj) {
                NearbyPresenter.m6900o0((Throwable) obj);
            }
        }));
        if (CoreModule.P().g().D9()) {
            cVarDistinctUntilChanged = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged();
        } else {
            cVarDistinctUntilChanged = CoreModule.P().g().bg() ? CoreModule.c.C0.u3(SummarizedPrivilegesId.get("platinum")).distinctUntilChanged() : CoreModule.c.C0.u3(SummarizedPrivilegesId.get("supremePartner")).distinctUntilChanged();
        }
        rx.c cVarJ3 = CoreModule.c.m2.J3();
        final NearbyPresenter$initSubscription$9 nearbyPresenter$initSubscription$9 = NearbyPresenter$initSubscription$9.INSTANCE;
        duringCreated(mkd0.r(cVarDistinctUntilChanged, cVarJ3, new x9j() { // from class: l.w820
            public final Object call(Object obj, Object obj2) {
                return NearbyPresenter.m6892g0(nearbyPresenter$initSubscription$9, obj, obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.x820
            public final void call(Object obj) {
                NearbyPresenter.m6898m0(this.f22459a, (j760) obj);
            }
        }, new e30() { // from class: l.y820
            public final void call(Object obj) {
                NearbyPresenter.m6903r0(this.f22928a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.m2.G3()).subscribe(mkd0.G(new e30() { // from class: l.z820
            public final void call(Object obj) {
                NearbyPresenter.m6895j0(this.f23510a, (Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: z0 */
    public final void m6924z0(@NotNull User user) {
        user.getClass();
        if (m6889L0(this, null, 1, null)) {
            return;
        }
        CoreModule.P().a().I9(this.frag, user);
    }
}
