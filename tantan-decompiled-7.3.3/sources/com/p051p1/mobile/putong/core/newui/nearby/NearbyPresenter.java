package com.p051p1.mobile.putong.core.newui.nearby;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyPresenter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
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
import p137rx.C22421c;
import p153l.ar2;
import p153l.hve0;
import p153l.joa;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.rs9;
import p153l.th20;
import p153l.vg60;
import p153l.x20;
import p153l.y20;
import p153l.z20;
import p153l.zxv;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001d\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\fJ-\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00102\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\fJ\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\fJ\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\fJ\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0012¢\u0006\u0004\b5\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010@j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ll/ar2;", "Ll/th20;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;)V", "", "D0", "()Z", "", "F0", "()V", "liked", "superliked", "fromButton", "", "picIndex", "", "picUrl", "Lcom/p1/mobile/putong/data/User;", "user", "C0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;)Z", "a0", "E0", "Lcom/p1/mobile/putong/data/Links;", "links", "needRefresh", "I0", "(Lcom/p1/mobile/putong/data/Links;Z)V", "destroy", "requestCode", "", Permissions.TYPE, "", "grantResults", "N0", "(I[Ljava/lang/String;[I)V", "Q0", "H0", "G0", "z0", "(Lcom/p1/mobile/putong/data/User;)V", "Ll/x20;", "noPrivilege", "J0", "(Ll/x20;)Z", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "O0", "()Ljava/lang/String;", "P0", "a", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "b", "Lcom/p1/mobile/putong/data/Links;", "A0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "(Lcom/p1/mobile/putong/data/Links;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "(Ljava/util/ArrayList;)V", "userList", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class NearbyPresenter extends ar2<th20> {

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
    public static /* synthetic */ boolean m43729L0(NearbyPresenter nearbyPresenter, x20 x20Var, int i, Object obj) {
        if ((i & 1) != 0) {
            x20Var = null;
        }
        return nearbyPresenter.m43758J0(x20Var);
    }

    /* JADX INFO: renamed from: e0 */
    public static String m43730e0(User user) {
        user.getClass();
        return user.m61308fp().url;
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m43731f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static pf60 m43732g0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m43733h0(User user, NearbyPresenter nearbyPresenter) {
        CoreModule.f18264c.f20407m2.m123967s3(user);
        nearbyPresenter.frag.m43716Y4().m172208L(user);
        if (jyb.m147479J(nearbyPresenter.frag.m43716Y4().m172207K())) {
            nearbyPresenter.m43762Q0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m43734i0(User user) {
        user.getClass();
        return Boolean.valueOf(user.hasPic());
    }

    /* JADX INFO: renamed from: j0 */
    public static void m43735j0(NearbyPresenter nearbyPresenter, Throwable th) {
        if (jyb.m147479J(nearbyPresenter.userList)) {
            ((th20) nearbyPresenter.viewModel).m191186S();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m43736k0(NearbyPresenter nearbyPresenter, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16267i) {
            nearbyPresenter.m43754F0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m43737l0(NearbyPresenter nearbyPresenter, User user, Relationship relationship, int i) {
        relationship.getClass();
        Intent intentMo34554n8 = CoreModule.m30933P().m143405a().mo34554n8(nearbyPresenter.act(), jyb.m147507f0(relationship.f39654id), i, new ArrayList<>(), nearbyPresenter.frag.pageId());
        Act act = nearbyPresenter.act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentMo34554n8, CoreModule.m30933P().m143405a().mo34515hg(nearbyPresenter.act()));
        }
        CoreModule.f18264c.f20407m2.m123967s3(user);
        nearbyPresenter.frag.m43716Y4().m172208L(user);
        if (jyb.m147479J(nearbyPresenter.frag.m43716Y4().m172207K())) {
            nearbyPresenter.m43762Q0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static void m43738m0(NearbyPresenter nearbyPresenter, pf60 pf60Var) {
        S s = pf60Var.f152157b;
        s.getClass();
        DbLinks dbLinks = ((vg60) s).f184002b;
        dbLinks.getClass();
        nearbyPresenter.links = dbLinks.links;
        S s2 = pf60Var.f152157b;
        s2.getClass();
        ArrayList<User> arrayList = new ArrayList<>((Collection<? extends User>) ((vg60) s2).f184001a);
        nearbyPresenter.userList = arrayList;
        if (nearbyPresenter.m43751D0() || arrayList.size() <= 8 || arrayList.size() % 2 != 1) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList<User> arrayList2 = nearbyPresenter.userList;
            arrayList.remove((arrayList2 != null ? arrayList2.size() : 0) - 1);
        }
        boolean zM147479J = jyb.m147479J(nearbyPresenter.userList);
        V v2 = nearbyPresenter.viewModel;
        if (zM147479J) {
            ((th20) v2).m191185R();
        } else {
            ArrayList<User> arrayList3 = nearbyPresenter.userList;
            arrayList3.getClass();
            ((th20) v2).m191184Q(arrayList3, nearbyPresenter.m43751D0());
        }
        ((th20) nearbyPresenter.viewModel).m191194m();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m43739n0(NearbyPresenter nearbyPresenter, String str) {
        Picture picture = new Picture();
        str.getClass();
        picture.url = str;
        ((th20) nearbyPresenter.viewModel).m191189V(picture);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m43740o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m43741p0(NearbyPresenter nearbyPresenter, PurchaseType purchaseType) {
        nearbyPresenter.m43762Q0();
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m43742q0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static void m43743r0(NearbyPresenter nearbyPresenter, Throwable th) {
        ((th20) nearbyPresenter.viewModel).m191186S();
        ((th20) nearbyPresenter.viewModel).m191194m();
    }

    /* JADX INFO: renamed from: s0 */
    public static String m43744s0(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m43745t0(NearbyPresenter nearbyPresenter, Bundle bundle) {
        if (zxv.m222086c()) {
            nearbyPresenter.m43753E0();
        } else {
            ((th20) nearbyPresenter.viewModel).m191188U();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static void m43746u0(NearbyPresenter nearbyPresenter, PurchaseType purchaseType) {
        nearbyPresenter.m43762Q0();
    }

    /* JADX INFO: renamed from: x0 */
    public static Boolean m43747x0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: y0 */
    public static void m43748y0(NearbyPresenter nearbyPresenter, NetworkInfo networkInfo) {
        nearbyPresenter.m43753E0();
    }

    @Nullable
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m43750C0(boolean liked, boolean superliked, boolean fromButton, int picIndex, String picUrl, final User user) {
        return CoreMemberModule.m37004F().m187693b().mo36978Pb(liked, superliked, fromButton, picIndex, picUrl, user, act(), this.frag.pageId(), new z20() { // from class: l.zg20
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                NearbyPresenter.m43737l0(this.f204252a, user, (Relationship) obj, ((Integer) obj2).intValue());
            }
        }, new x20() { // from class: l.ah20
            @Override // p153l.x20
            public final void call() {
                NearbyPresenter.m43733h0(user, this);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m43751D0() {
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            return joa.m146361M3();
        }
        return CoreModule.m30933P().m143410g().mo36053bg() ? joa.m146359I3() : joa.m146363O3();
    }

    /* JADX INFO: renamed from: E */
    public final void m43752E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        String str = clickedUser.pictures.get(0).url;
        str.getClass();
        if (!m43750C0(liked, false, fromButton, 0, str, clickedUser)) {
            this.frag.m43716Y4().notifyDataSetChanged();
        }
        CoreMemberModule.m37004F().m187693b().mo36972An(clickedUser);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m43753E0() {
        if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            if (NullChecker.m82486a(this.viewModel) && jyb.m147479J(this.userList)) {
                ((th20) this.viewModel).m191187T();
            }
            m43757I0(null, true);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m43754F0() {
        if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION") && NullChecker.m82486a(this.viewModel) && jyb.m147479J(this.userList)) {
            ((th20) this.viewModel).m191187T();
            m43757I0(null, true);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m43755G0() {
        CoreModule.f18264c.f20386f2.m214443w3(act());
    }

    /* JADX INFO: renamed from: H0 */
    public final void m43756H0() {
        hve0.m137322x(act());
    }

    /* JADX INFO: renamed from: I0 */
    public final void m43757I0(@Nullable Links links, boolean needRefresh) {
        CoreModule.f18264c.f20407m2.m123955E3(links, 20, needRefresh, rs9.INSTANCE.m182943c() ? UserBanAppealSwitch.offline : "");
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m43758J0(@Nullable x20 noPrivilege) {
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            if (joa.m146361M3()) {
                return false;
            }
            CoreModule.m30933P().m143405a().mo34575qm(act(), m43760O0(), Privilege.nearby_people, new y20() { // from class: l.bh20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NearbyPresenter.m43746u0(this.f76708a, (PurchaseType) obj);
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
            CoreModule.m30933P().m143410g().mo36009Ds(act(), m43760O0(), Privilege.nearby_people, new y20() { // from class: l.ch20
                @Override // p153l.y20
                public final void call(Object obj) {
                    NearbyPresenter.m43741p0(this.f81756a, (PurchaseType) obj);
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
        m43755G0();
        if (noPrivilege != null) {
            noPrivilege.call();
        }
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m43759N0(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m43753E0();
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final String m43760O0() {
        if (TextUtils.equals(this.frag.getFrom(), "nearby_meet")) {
            return "p_meet_nearby,distance";
        }
        return TextUtils.equals(this.frag.getFrom(), "from_my_tab") ? "p_navigation_nearby,distance" : "p_home_nearby,distance";
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final String m43761P0() {
        if (TextUtils.equals(this.frag.getFrom(), "nearby_meet")) {
            return "p_meet_nearby,odiamond_sayhi";
        }
        return TextUtils.equals(this.frag.getFrom(), "from_my_tab") ? "p_navigation_nearby,odiamond_sayhi" : "p_home_nearby,odiamond_sayhi";
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m43762Q0() {
        m43753E0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        C22421c<UserPrivilege> c22421cDistinctUntilChanged;
        super.mo40473a0();
        creates(new y20() { // from class: l.tg20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43745t0(this.f174036a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ih20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43736k0(this.f114862a, (C4470c) obj);
            }
        }));
        C22421c c22421cSkip = duringCreated(ConnectivityReceiver.m82473m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.jh20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NearbyPresenter.m43747x0((NetworkInfo) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.kh20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NearbyPresenter.m43731f0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.lh20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43748y0(this.f132065a, (NetworkInfo) obj);
            }
        }));
        C22421c<User> c22421cM116596o9 = CoreModule.f18264c.f20381e0.m116596o9();
        final Function1 function2 = new Function1() { // from class: l.ug20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NearbyPresenter.m43734i0((User) obj);
            }
        };
        C22421c<User> c22421cFilter = c22421cM116596o9.filter(new qcj() { // from class: l.vg20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NearbyPresenter.m43742q0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.wg20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NearbyPresenter.m43730e0((User) obj);
            }
        };
        duringCreated(c22421cFilter.map(new qcj() { // from class: l.xg20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NearbyPresenter.m43744s0(function3, obj);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.yg20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43739n0(this.f199698a, (String) obj);
            }
        }, new y20() { // from class: l.dh20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43740o0((Throwable) obj);
            }
        }));
        if (CoreModule.m30933P().m143410g().mo36007D9()) {
            c22421cDistinctUntilChanged = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).distinctUntilChanged();
        } else {
            c22421cDistinctUntilChanged = CoreModule.m30933P().m143410g().mo36053bg() ? CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("platinum")).distinctUntilChanged() : CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged();
        }
        C22421c<vg60<User>> c22421cM123960J3 = CoreModule.f18264c.f20407m2.m123960J3();
        final NearbyPresenter$initSubscription$9 nearbyPresenter$initSubscription$9 = NearbyPresenter$initSubscription$9.INSTANCE;
        duringCreated(psd0.m173625r(c22421cDistinctUntilChanged, c22421cM123960J3, new rcj() { // from class: l.eh20
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return NearbyPresenter.m43732g0(nearbyPresenter$initSubscription$9, obj, obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.fh20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43738m0(this.f99006a, (pf60) obj);
            }
        }, new y20() { // from class: l.gh20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43743r0(this.f104064a, (Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20407m2.m123957G3()).subscribe(psd0.m173596G(new y20() { // from class: l.hh20
            @Override // p153l.y20
            public final void call(Object obj) {
                NearbyPresenter.m43735j0(this.f109473a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: z0 */
    public final void m43763z0(@NotNull User user) {
        user.getClass();
        if (m43729L0(this, null, 1, null)) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34341I9(this.frag, user);
    }
}
