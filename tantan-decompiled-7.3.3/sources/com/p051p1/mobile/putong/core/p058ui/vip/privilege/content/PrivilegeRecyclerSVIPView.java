package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreAutoPay;
import com.p051p1.mobile.putong.core.data.ContractInfo;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.OrderInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerSVIPView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.a690;
import p153l.cok0;
import p153l.dbc0;
import p153l.deh0;
import p153l.h390;
import p153l.j690;
import p153l.joa;
import p153l.jyb;
import p153l.jz20;
import p153l.m190;
import p153l.ndb0;
import p153l.o290;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rbb0;
import p153l.rj90;
import p153l.s7a;
import p153l.u290;
import p153l.ub3;
import p153l.ucj;
import p153l.uqb0;
import p153l.v5b0;
import p153l.x20;
import p153l.xzc0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u000bH\u0014¢\u0006\u0004\b*\u0010$J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010$J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010$R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0>j\b\u0012\u0004\u0012\u00020?`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010FR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001f0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerSVIPView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/o290;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "b0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "c0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "hasSVIP", "f0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "g0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "h0", "()V", "Ll/ub3;", "pageAdapter", "k", "(Ll/ub3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "d0", "onDetachedFromWindow", "", "selectCouponId", "setSelectCouponId", "(Ljava/lang/String;)V", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/ub3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/u290;", "h", "Ll/u290;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/h390;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "j", "Ljava/lang/String;", "Z", "isShowing", "", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/List;", "privileges", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegeRecyclerSVIPView extends PrivilegeRecycleView implements o290 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VipFrag frag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ub3 pagerAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public u290 recyclerAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<h390> contentItems;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public String selectCouponId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isShowing;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public List<Privilege> privileges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeRecyclerSVIPView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        this.contentItems = new ArrayList<>();
        Privilege privilege = Privilege.see_who_likes_me;
        this.privileges = CollectionsKt.mutableListOf(privilege, Privilege.online_match_tickets, Privilege.boost, Privilege.vip_unlimited_likes, Privilege.vip_super_like);
        setOverScrollMode(2);
        if (s7a.m184984m()) {
            this.privileges.add(this.privileges.indexOf(privilege) + 1, Privilege.hide_me_from_nearby);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m58172E(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        rj90.m181692b();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        jz20.m147635c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m58173F(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static Pair m58174G(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (Pair) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m58175H(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146361M3());
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m58176I(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146361M3());
    }

    /* JADX INFO: renamed from: K */
    public static void m58178K(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58607P4(privilegeRecyclerSVIPView.purchaseType).m58088h();
        privilegeRecyclerSVIPView.m58198f0(((Boolean) pair.getFirst()).booleanValue());
        int iM147476G = jyb.m147476G(privilegeRecyclerSVIPView.contentItems, new qcj() { // from class: l.jh90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m58197e0((h390) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iM147476G >= 0) {
                privilegeRecyclerSVIPView.contentItems.remove(iM147476G);
                u290 u290Var = privilegeRecyclerSVIPView.recyclerAdapter;
                if (u290Var != null) {
                    u290Var.notifyItemRemoved(iM147476G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM147476G < 0) {
            VipFrag vipFrag3 = privilegeRecyclerSVIPView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m88391r("frag");
                vipFrag3 = null;
            }
            ndb0 ndb0VarM58608Q4 = vipFrag3.m58608Q4(privilegeRecyclerSVIPView.purchaseType);
            if (ndb0VarM58608Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerSVIPView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.m88391r("frag");
                    vipFrag4 = null;
                }
                ndb0VarM58608Q4.m55201P(vipFrag4.m58609R4());
            }
            Merchandise merchandiseM58194a0 = privilegeRecyclerSVIPView.m58194a0((List) pair.getSecond());
            PurchaseType purchaseType = privilegeRecyclerSVIPView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerSVIPView.frag;
            if (vipFrag5 == null) {
                Intrinsics.m88391r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            PrivilegeDescListShowcaseItem.C9161a c9161a = new PrivilegeDescListShowcaseItem.C9161a(purchaseType, merchandiseM58194a0, vipFrag2.m58609R4(), ndb0VarM58608Q4);
            if (ndb0VarM58608Q4 != null) {
                ndb0VarM58608Q4.m55202Q(privilegeRecyclerSVIPView.selectCouponId);
            }
            privilegeRecyclerSVIPView.contentItems.add(0, c9161a);
            u290 u290Var2 = privilegeRecyclerSVIPView.recyclerAdapter;
            if (u290Var2 != null) {
                u290Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m58179L(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view, Privilege privilege) {
        privilegeRecyclerSVIPView.m58199g0(privilege);
    }

    /* JADX INFO: renamed from: M */
    public static void m58180M(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        privilegeRecyclerSVIPView.m58199g0(null);
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m58181N(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static void m58182O(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Boolean bool) {
        privilegeRecyclerSVIPView.m58201h0();
    }

    /* JADX INFO: renamed from: P */
    public static void m58183P(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        if (rbb0.m180746s(null, 1, null)) {
            return;
        }
        privilegeRecyclerSVIPView.getContext().startActivity(new Intent(privilegeRecyclerSVIPView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: Q */
    public static void m58184Q(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        purchaseType.getClass();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58606O4(purchaseType, privilege, cok0.f82895a);
    }

    /* JADX INFO: renamed from: R */
    public static void m58185R(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m58613V4();
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m58186S(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static Pair m58187T(boolean z, List list, pf60 pf60Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        pf60Var.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m58188U(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: V */
    public static void m58189V(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        rj90.m181695e();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        jz20.m147635c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: W */
    public static void m58190W(VipFrag vipFrag, PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView) {
        vipFrag.m58615X4(privilegeRecyclerSVIPView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: X */
    public static Boolean m58191X(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Boolean bool) {
        return Boolean.valueOf(privilegeRecyclerSVIPView.isShowing);
    }

    /* JADX INFO: renamed from: Y */
    public static Boolean m58192Y(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static void m58193Z(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58615X4(privilegeRecyclerSVIPView.purchaseType, null, cok0.f82895a);
        rj90.m181697g();
    }

    /* JADX INFO: renamed from: a0 */
    private final Merchandise m58194a0(List<? extends Merchandise> merchandises) {
        Merchandise merchandise = null;
        if (jyb.m147479J(merchandises)) {
            return null;
        }
        merchandises.getClass();
        int i = -1;
        for (Merchandise merchandise2 : merchandises) {
            if (s7a.m184977f() && merchandise2.autoRenewable() && merchandise2.monthType() && merchandise2.quantity == 6 && deh0.m115415f(merchandise2)) {
                return merchandise2;
            }
            if (s7a.m184993v()) {
                if (merchandise2.autoRenewable() && merchandise2.monthType() && v5b0.m199793s(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                    i = merchandise2.quantity;
                    merchandise = merchandise2;
                }
            } else if (merchandise2.autoRenewable() && merchandise2.monthType() && v5b0.m199797w(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                i = merchandise2.quantity;
                merchandise = merchandise2;
            }
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m58195b0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM58607P4 = frag.m58607P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM58607P4.m58086f(purchaseType, cok0.f82895a, frag.m58608Q4(purchaseType));
        privilegePaymentViewM58607P4.setOnNoPrivilegeClick(new x20() { // from class: l.gh90
            @Override // p153l.x20
            public final void call() {
                PrivilegeRecyclerSVIPView.m58190W(frag, this);
            }
        });
        privilegePaymentViewM58607P4.setOnPayTypeSelect(new y20() { // from class: l.hh90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m58185R(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM58607P4.m58084d();
        privilegePaymentViewM58607P4.m58085e();
        privilegePaymentViewM58607P4.m58088h();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m58196c0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        u290 u290Var = new u290(frag, null, this, this.purchaseType);
        this.recyclerAdapter = u290Var;
        setAdapter(u290Var);
        m58198f0(joa.m146361M3());
    }

    /* JADX INFO: renamed from: e0 */
    public static final Boolean m58197e0(h390 h390Var) {
        h390Var.getClass();
        return Boolean.valueOf(h390Var instanceof PrivilegeDescListShowcaseItem.C9161a);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m58198f0(boolean hasSVIP) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C9162a(getResources().getString(R$string.f18523Hk), getResources().getString(R$string.f18461Fk), new PrivilegeDescListTitle.C9162a.a() { // from class: l.dh90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle.C9162a.a
            /* JADX INFO: renamed from: a */
            public final void mo58461a(View view) {
                PrivilegeRecyclerSVIPView.m58180M(this.f88428a, view);
            }
        }));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C9151a c9151aM156630a = m190.m156630a(it.next(), this.purchaseType);
            c9151aM156630a.m58315g(new PrivilegeDescListItem.C9151a.a() { // from class: l.eh90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem.C9151a.a
                /* JADX INFO: renamed from: a */
                public final void mo58110a(View view, Privilege privilege) {
                    PrivilegeRecyclerSVIPView.m58179L(this.f94012a, view, privilege);
                }
            });
            this.contentItems.add(c9151aM156630a);
        }
        if (hasSVIP) {
            String string = getContext().getString(R$string.f18492Gk);
            string.getClass();
            this.contentItems.add(new PrivilegeDescListTitle.C9162a(string, "", null));
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            String string2 = getContext().getString(R$string.f18492Gk);
            string2.getClass();
            PrivilegeDescListTitle.C9162a c9162a = new PrivilegeDescListTitle.C9162a(string2, "", null);
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C9154a(c9162a, getResources().getString(R$string.f18898U1), false, arrayList, new PrivilegeDescListNoSVipItem.C9154a.a() { // from class: l.fh90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C9154a.a
                /* JADX INFO: renamed from: a */
                public final void mo58354a(View view) {
                    PrivilegeRecyclerSVIPView.m58193Z(this.f99021a, view);
                }
            }));
        }
        u290 u290Var = this.recyclerAdapter;
        if (u290Var != null) {
            u290Var.m194253J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m58199g0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        C9171a c9171a = new C9171a(vipFrag);
        c9171a.m58604p(this.purchaseType, new C9171a.f() { // from class: l.kh90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a.f
            /* JADX INFO: renamed from: a */
            public final void mo58605a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerSVIPView.m58184Q(this.f126705a, privilege, purchaseType, privilege2);
            }
        });
        if (NullChecker.m82486a(privilege)) {
            c9171a.m58603o(privilege);
        }
    }

    private final C9166a getAdvancedFilterItem() {
        a690 a690VarM143620l = j690.m143620l(Privilege.advanced_filter);
        C9166a c9166a = new C9166a(dbc0.f86349Lk, a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString(), "advancing");
        c9166a.m58504f(new C9166a.a() { // from class: l.lh90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                PrivilegeRecyclerSVIPView.m58172E(this.f132079a, view);
            }
        });
        return c9166a;
    }

    private final C9166a getPrivacyItem() {
        a690 a690VarM143620l = j690.m143620l(Privilege.privacy_membership);
        C9166a c9166a = new C9166a(dbc0.f87157kl, a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString(), "privacy");
        c9166a.m58504f(new C9166a.a() { // from class: l.xg90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                PrivilegeRecyclerSVIPView.m58189V(this.f194161a, view);
            }
        });
        return c9166a;
    }

    private final PrivilegeDescListSeeItem.C9159a getSeeItem() {
        PrivilegeDescListSeeItem.C9159a c9159a = new PrivilegeDescListSeeItem.C9159a();
        c9159a.m58419b(new PrivilegeDescListSeeItem.C9159a.a() { // from class: l.ih90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C9159a.a
            /* JADX INFO: renamed from: a */
            public final void mo58420a(View view) {
                PrivilegeRecyclerSVIPView.m58183P(this.f114879a, view);
            }
        });
        return c9159a;
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: c */
    public void mo58111c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m58200d0() {
        ub3 ub3Var = this.pagerAdapter;
        VipFrag vipFrag = null;
        if (ub3Var == null) {
            Intrinsics.m88391r("pagerAdapter");
            ub3Var = null;
        }
        VipFrag vipFrag2 = this.frag;
        if (vipFrag2 == null) {
            Intrinsics.m88391r("frag");
            vipFrag2 = null;
        }
        C22421c c22421cM153557n = ub3Var.m153557n(vipFrag2, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")));
        final Function1 function1 = new Function1() { // from class: l.mh90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m58175H((UserPrivilege) obj);
            }
        };
        C22421c c22421cSkip = c22421cM153557n.map(new qcj() { // from class: l.ph90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m58181N(function1, obj);
            }
        }).distinctUntilChanged().skip(1);
        final Function1 function2 = new Function1() { // from class: l.qh90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m58191X(this.f157521a, (Boolean) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.rh90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m58186S(function2, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.sh90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m58182O(this.f168603a, (Boolean) obj);
            }
        }));
        ub3 ub3Var2 = this.pagerAdapter;
        if (ub3Var2 == null) {
            Intrinsics.m88391r("pagerAdapter");
            ub3Var2 = null;
        }
        VipFrag vipFrag3 = this.frag;
        if (vipFrag3 == null) {
            Intrinsics.m88391r("frag");
        } else {
            vipFrag = vipFrag3;
        }
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"));
        final Function1 function3 = new Function1() { // from class: l.yg90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m58176I((UserPrivilege) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cM146424v3.map(new qcj() { // from class: l.zg90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m58192Y(function3, obj);
            }
        }).distinctUntilChanged();
        C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("svip"));
        final Function1 function4 = new Function1() { // from class: l.ah90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m58188U((List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cDistinctUntilChanged2 = c22421cM31647y5.filter(new qcj() { // from class: l.bh90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m58173F(function4, obj);
            }
        }).distinctUntilChanged();
        C22421c<pf60<OrderInfo, ContractInfo>> c22421cDistinctUntilChanged3 = xzc0.m213720r().m213735P().distinctUntilChanged();
        C22421c<CoreAutoPay.AutoPayStatus> c22421cDistinctUntilChanged4 = CoreModule.f18264c.f20333O0.m31076m3().distinctUntilChanged();
        C22421c<ArrayList<Contract>> c22421cDistinctUntilChanged5 = uqb0.f180388T.m30581S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.ch90
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerSVIPView.m58187T(((Boolean) obj).booleanValue(), (List) obj2, (pf60) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        ub3Var2.m153557n(vipFrag, C22421c.combineLatest(c22421cDistinctUntilChanged, c22421cDistinctUntilChanged2, c22421cDistinctUntilChanged3, c22421cDistinctUntilChanged4, c22421cDistinctUntilChanged5, new ucj() { // from class: l.nh90
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerSVIPView.m58174G(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.oh90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m58178K(this.f147350a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m58201h0() {
        if (joa.m146361M3()) {
            return;
        }
        rj90.m181698h();
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: k */
    public void mo58112k(@NotNull ub3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m58195b0(frag);
        m58196c0(frag);
        m58200d0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VipFrag vipFrag = this.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58607P4(this.purchaseType).m58087g();
        VipFrag vipFrag3 = this.frag;
        if (vipFrag3 == null) {
            Intrinsics.m88391r("frag");
        } else {
            vipFrag2 = vipFrag3;
        }
        ndb0 ndb0VarM58608Q4 = vipFrag2.m58608Q4(this.purchaseType);
        if (ndb0VarM58608Q4 != null) {
            ndb0VarM58608Q4.m55196K();
        }
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: q */
    public void mo58113q() {
        m58201h0();
        this.isShowing = true;
    }

    public final void setSelectCouponId(@NotNull String selectCouponId) {
        selectCouponId.getClass();
        this.selectCouponId = selectCouponId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerSVIPView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegeRecyclerSVIPView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
