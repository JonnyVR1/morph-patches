package com.p046p1.mobile.putong.core.newui.nearby;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Permissions;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyPresenter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ane0;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.gr9;
import p149l.j760;
import p149l.jq2;
import p149l.l920;
import p149l.mkd0;
import p149l.q860;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xma;
import p149l.yvv;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001d\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\fJ-\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00102\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\fJ\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\fJ\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\fJ\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0012¢\u0006\u0004\b5\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010@j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ll/jq2;", "Ll/l920;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;)V", "", "D0", "()Z", "", "F0", "()V", "liked", "superliked", "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "C0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "a0", "E0", "Lcom/p1/mobile/putong/data/Links;", "links", "needRefresh", "I0", "(Lcom/p1/mobile/putong/data/Links;Z)V", "destroy", "requestCode", "", Permissions.TYPE, "", "grantResults", "N0", "(I[Ljava/lang/String;[I)V", "Q0", "H0", "G0", "z0", "(Lcom/p1/mobile/putong/data/User;)V", "Ll/d30;", "noPrivilege", "J0", "(Ll/d30;)Z", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "O0", "()Ljava/lang/String;", "P0", "a", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "b", "Lcom/p1/mobile/putong/data/Links;", "A0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "(Lcom/p1/mobile/putong/data/Links;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "(Ljava/util/ArrayList;)V", "userList", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static /* synthetic */ boolean m42718L0(NearbyPresenter nearbyPresenter, d30 d30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            d30Var = null;
        }
        return nearbyPresenter.m42747J0(d30Var);
    }

    /* JADX INFO: renamed from: e0 */
    public static String m42719e0(User user) {
        user.getClass();
        return user.m60124fp().url;
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m42720f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static j760 m42721g0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m42722h0(User user, NearbyPresenter nearbyPresenter) {
        CoreModule.f17545c.f19665m2.m191476s3(user);
        nearbyPresenter.frag.m42705Y4().m129869L(user);
        if (vwb.m200296J(nearbyPresenter.frag.m42705Y4().m129868K())) {
            nearbyPresenter.m42751Q0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m42723i0(User user) {
        user.getClass();
        return Boolean.valueOf(user.hasPic());
    }

    /* JADX INFO: renamed from: j0 */
    public static void m42724j0(NearbyPresenter nearbyPresenter, Throwable th) {
        if (vwb.m200296J(nearbyPresenter.userList)) {
            ((l920) nearbyPresenter.viewModel).m148978S();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m42725k0(NearbyPresenter nearbyPresenter, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15548i) {
            nearbyPresenter.m42743F0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m42726l0(NearbyPresenter nearbyPresenter, User user, Relationship relationship, int i) {
        relationship.getClass();
        Intent intentMo33551n8 = CoreModule.m29935P().m94651a().mo33551n8(nearbyPresenter.act(), vwb.m200324f0(relationship.f38806id), i, new ArrayList<>(), nearbyPresenter.frag.pageId());
        Act act = nearbyPresenter.act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentMo33551n8, CoreModule.m29935P().m94651a().mo33512hg(nearbyPresenter.act()));
        }
        CoreModule.f17545c.f19665m2.m191476s3(user);
        nearbyPresenter.frag.m42705Y4().m129869L(user);
        if (vwb.m200296J(nearbyPresenter.frag.m42705Y4().m129868K())) {
            nearbyPresenter.m42751Q0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static void m42727m0(NearbyPresenter nearbyPresenter, j760 j760Var) {
        S s = j760Var.f116565b;
        s.getClass();
        DbLinks dbLinks = ((q860) s).f153136b;
        dbLinks.getClass();
        nearbyPresenter.links = dbLinks.links;
        S s2 = j760Var.f116565b;
        s2.getClass();
        ArrayList<User> arrayList = new ArrayList<>((Collection<? extends User>) ((q860) s2).f153135a);
        nearbyPresenter.userList = arrayList;
        if (nearbyPresenter.m42740D0() || arrayList.size() <= 8 || arrayList.size() % 2 != 1) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<User> arrayList2 = nearbyPresenter.userList;
            arrayList.remove((arrayList2 != null ? arrayList2.size() : 0) - 1);
        }
        boolean zM200296J = vwb.m200296J(nearbyPresenter.userList);
        V v2 = nearbyPresenter.viewModel;
        if (zM200296J) {
            ((l920) v2).m148977R();
        } else {
            ArrayList<User> arrayList3 = nearbyPresenter.userList;
            arrayList3.getClass();
            ((l920) v2).m148976Q(arrayList3, nearbyPresenter.m42740D0());
        }
        ((l920) nearbyPresenter.viewModel).m148986m();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m42728n0(NearbyPresenter nearbyPresenter, String str) {
        Picture picture = new Picture();
        str.getClass();
        picture.url = str;
        ((l920) nearbyPresenter.viewModel).m148981V(picture);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m42729o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m42730p0(NearbyPresenter nearbyPresenter, PurchaseType purchaseType) {
        nearbyPresenter.m42751Q0();
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m42731q0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m42732r0(NearbyPresenter nearbyPresenter, Throwable th) {
        ((l920) nearbyPresenter.viewModel).m148978S();
        ((l920) nearbyPresenter.viewModel).m148986m();
    }

    /* JADX INFO: renamed from: s0 */
    public static String m42733s0(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m42734t0(NearbyPresenter nearbyPresenter, Bundle bundle) {
        if (yvv.m216242c()) {
            nearbyPresenter.m42742E0();
        } else {
            ((l920) nearbyPresenter.viewModel).m148980U();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m42735u0(NearbyPresenter nearbyPresenter, PurchaseType purchaseType) {
        nearbyPresenter.m42751Q0();
    }

    /* JADX INFO: renamed from: x0 */
    public static Boolean m42736x0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: y0 */
    public static void m42737y0(NearbyPresenter nearbyPresenter, NetworkInfo networkInfo) {
        nearbyPresenter.m42742E0();
    }

    @Nullable
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m42739C0(boolean liked, boolean superliked, boolean fromButton, int picIndex, String picUrl, final User user) {
        return CoreMemberModule.m36001F().m132651b().mo35975Pb(liked, superliked, fromButton, picIndex, picUrl, user, act(), this.frag.pageId(), new f30() { // from class: l.r820
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                NearbyPresenter.m42726l0(this.f158116a, user, (Relationship) obj, ((Integer) obj2).intValue());
            }
        }, new d30() { // from class: l.s820
            @Override // p149l.d30
            public final void call() {
                NearbyPresenter.m42722h0(user, this);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m42740D0() {
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            return xma.m210047L3();
        }
        return CoreModule.m29935P().m94656g().mo35050bg() ? xma.m210045H3() : xma.m210049N3();
    }

    /* JADX INFO: renamed from: E */
    public final void m42741E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        String str = clickedUser.pictures.get(0).url;
        str.getClass();
        if (!m42739C0(liked, false, fromButton, 0, str, clickedUser)) {
            this.frag.m42705Y4().notifyDataSetChanged();
        }
        CoreMemberModule.m36001F().m132651b().mo35969An(clickedUser);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m42742E0() {
        if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            if (NullChecker.m81303a(this.viewModel) && vwb.m200296J(this.userList)) {
                ((l920) this.viewModel).m148979T();
            }
            m42746I0(null, true);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m42743F0() {
        if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && NullChecker.m81303a(this.viewModel) && vwb.m200296J(this.userList)) {
            ((l920) this.viewModel).m148979T();
            m42746I0(null, true);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m42744G0() {
        CoreModule.f17545c.f19644f2.m148615w3(act());
    }

    /* JADX INFO: renamed from: H0 */
    public final void m42745H0() {
        ane0.m97752x(act());
    }

    /* JADX INFO: renamed from: I0 */
    public final void m42746I0(@Nullable Links links, boolean needRefresh) {
        CoreModule.f17545c.f19665m2.m191464E3(links, 20, needRefresh, gr9.INSTANCE.m127687c() ? UserBanAppealSwitch.offline : "");
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m42747J0(@Nullable d30 noPrivilege) {
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            if (xma.m210047L3()) {
                return false;
            }
            CoreModule.m29935P().m94651a().mo33572qm(act(), m42749O0(), Privilege.nearby_people, new e30() { // from class: l.t820
                @Override // p149l.e30
                public final void call(Object obj) {
                    NearbyPresenter.m42735u0(this.f168799a, (PurchaseType) obj);
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
            CoreModule.m29935P().m94656g().mo35006Ds(act(), m42749O0(), Privilege.nearby_people, new e30() { // from class: l.u820
                @Override // p149l.e30
                public final void call(Object obj) {
                    NearbyPresenter.m42730p0(this.f175092a, (PurchaseType) obj);
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
        m42744G0();
        if (noPrivilege != null) {
            noPrivilege.call();
        }
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m42748N0(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m42742E0();
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final String m42749O0() {
        if (TextUtils.equals(this.frag.getFrom(), "nearby_meet")) {
            return "p_meet_nearby,distance";
        }
        return TextUtils.equals(this.frag.getFrom(), "from_my_tab") ? "p_navigation_nearby,distance" : "p_home_nearby,distance";
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final String m42750P0() {
        if (TextUtils.equals(this.frag.getFrom(), "nearby_meet")) {
            return "p_meet_nearby,odiamond_sayhi";
        }
        return TextUtils.equals(this.frag.getFrom(), "from_my_tab") ? "p_navigation_nearby,odiamond_sayhi" : "p_home_nearby,odiamond_sayhi";
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m42751Q0() {
        m42742E0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        C22306c<UserPrivilege> c22306cDistinctUntilChanged;
        super.mo39470a0();
        creates(new e30() { // from class: l.l820
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42734t0(this.f126782a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.a920
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42725k0(this.f68106a, (C4319c) obj);
            }
        }));
        C22306c c22306cSkip = duringCreated(ConnectivityReceiver.m81290m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.b920
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NearbyPresenter.m42736x0((NetworkInfo) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.c920
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NearbyPresenter.m42720f0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.d920
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42737y0(this.f84932a, (NetworkInfo) obj);
            }
        }));
        C22306c<User> c22306cM169523o9 = CoreModule.f17545c.f19639e0.m169523o9();
        final Function1 function2 = new Function1() { // from class: l.m820
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NearbyPresenter.m42723i0((User) obj);
            }
        };
        C22306c<User> c22306cFilter = c22306cM169523o9.filter(new w9j() { // from class: l.n820
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NearbyPresenter.m42731q0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.o820
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NearbyPresenter.m42719e0((User) obj);
            }
        };
        duringCreated(c22306cFilter.map(new w9j() { // from class: l.p820
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NearbyPresenter.m42733s0(function3, obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.q820
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42728n0(this.f153113a, (String) obj);
            }
        }, new e30() { // from class: l.v820
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42729o0((Throwable) obj);
            }
        }));
        if (CoreModule.m29935P().m94656g().mo35004D9()) {
            c22306cDistinctUntilChanged = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged();
        } else {
            c22306cDistinctUntilChanged = CoreModule.m29935P().m94656g().mo35050bg() ? CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("platinum")).distinctUntilChanged() : CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        }
        C22306c<q860<User>> c22306cM191469J3 = CoreModule.f17545c.f19665m2.m191469J3();
        final NearbyPresenter$initSubscription$9 nearbyPresenter$initSubscription$9 = NearbyPresenter$initSubscription$9.INSTANCE;
        duringCreated(mkd0.m154984r(c22306cDistinctUntilChanged, c22306cM191469J3, new x9j() { // from class: l.w820
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return NearbyPresenter.m42721g0(nearbyPresenter$initSubscription$9, obj, obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.x820
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42727m0(this.f191426a, (j760) obj);
            }
        }, new e30() { // from class: l.y820
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42732r0(this.f196760a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19665m2.m191466G3()).subscribe(mkd0.m154955G(new e30() { // from class: l.z820
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyPresenter.m42724j0(this.f202097a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: z0 */
    public final void m42752z0(@NotNull User user) {
        user.getClass();
        if (m42718L0(this, null, 1, null)) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33338I9(this.frag, user);
    }
}
