package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreAutoPay;
import com.p046p1.mobile.putong.core.data.ContractInfo;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.OrderInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerSVIPView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p149l.aaj;
import p149l.d30;
import p149l.dv80;
import p149l.e30;
import p149l.fb3;
import p149l.fy80;
import p149l.g6a;
import p149l.it80;
import p149l.j5b0;
import p149l.j760;
import p149l.ku80;
import p149l.mkd0;
import p149l.n3b0;
import p149l.nb90;
import p149l.qib0;
import p149l.qu80;
import p149l.rxa0;
import p149l.src0;
import p149l.v5h0;
import p149l.vwb;
import p149l.w9j;
import p149l.wek0;
import p149l.wx80;
import p149l.x2c0;
import p149l.xma;
import p149l.zq20;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u000bH\u0014¢\u0006\u0004\b*\u0010$J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010$J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010$R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0>j\b\u0012\u0004\u0012\u00020?`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010FR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001f0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerSVIPView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "b0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "c0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "hasSVIP", "f0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "g0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "h0", "()V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "d0", "onDetachedFromWindow", "", "selectCouponId", "setSelectCouponId", "(Ljava/lang/String;)V", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "j", "Ljava/lang/String;", "Z", "isShowing", "", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/List;", "privileges", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivilegeRecyclerSVIPView extends PrivilegeRecycleView implements ku80 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VipFrag frag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public fb3 pagerAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public qu80 recyclerAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<dv80> contentItems;

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
        if (g6a.m124564m()) {
            this.privileges.add(this.privileges.indexOf(privilege) + 1, Privilege.hide_me_from_nearby);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m56989E(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        nb90.m158764b();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        zq20.m219838c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m56990F(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static Pair m56991G(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (Pair) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m56992H(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210047L3());
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m56993I(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210047L3());
    }

    /* JADX INFO: renamed from: K */
    public static void m56995K(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57424P4(privilegeRecyclerSVIPView.purchaseType).m56905h();
        privilegeRecyclerSVIPView.m57015f0(((Boolean) pair.getFirst()).booleanValue());
        int iM200293G = vwb.m200293G(privilegeRecyclerSVIPView.contentItems, new w9j() { // from class: l.f990
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m57014e0((dv80) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iM200293G >= 0) {
                privilegeRecyclerSVIPView.contentItems.remove(iM200293G);
                qu80 qu80Var = privilegeRecyclerSVIPView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iM200293G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM200293G < 0) {
            VipFrag vipFrag3 = privilegeRecyclerSVIPView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m87502r("frag");
                vipFrag3 = null;
            }
            j5b0 j5b0VarM57425Q4 = vipFrag3.m57425Q4(privilegeRecyclerSVIPView.purchaseType);
            if (j5b0VarM57425Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerSVIPView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.m87502r("frag");
                    vipFrag4 = null;
                }
                j5b0VarM57425Q4.m54018P(vipFrag4.m57426R4());
            }
            Merchandise merchandiseM57011a0 = privilegeRecyclerSVIPView.m57011a0((List) pair.getSecond());
            PurchaseType purchaseType = privilegeRecyclerSVIPView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerSVIPView.frag;
            if (vipFrag5 == null) {
                Intrinsics.m87502r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            PrivilegeDescListShowcaseItem.C8998a c8998a = new PrivilegeDescListShowcaseItem.C8998a(purchaseType, merchandiseM57011a0, vipFrag2.m57426R4(), j5b0VarM57425Q4);
            if (j5b0VarM57425Q4 != null) {
                j5b0VarM57425Q4.m54019Q(privilegeRecyclerSVIPView.selectCouponId);
            }
            privilegeRecyclerSVIPView.contentItems.add(0, c8998a);
            qu80 qu80Var2 = privilegeRecyclerSVIPView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m56996L(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view, Privilege privilege) {
        privilegeRecyclerSVIPView.m57016g0(privilege);
    }

    /* JADX INFO: renamed from: M */
    public static void m56997M(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        privilegeRecyclerSVIPView.m57016g0(null);
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m56998N(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static void m56999O(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Boolean bool) {
        privilegeRecyclerSVIPView.m57018h0();
    }

    /* JADX INFO: renamed from: P */
    public static void m57000P(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        if (n3b0.m157744s(null, 1, null)) {
            return;
        }
        privilegeRecyclerSVIPView.getContext().startActivity(new Intent(privilegeRecyclerSVIPView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: Q */
    public static void m57001Q(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        purchaseType.getClass();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57423O4(purchaseType, privilege, wek0.f185947a);
    }

    /* JADX INFO: renamed from: R */
    public static void m57002R(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m57430V4();
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m57003S(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static Pair m57004T(boolean z, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m57005U(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: V */
    public static void m57006V(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        nb90.m158767e();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        zq20.m219838c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: W */
    public static void m57007W(VipFrag vipFrag, PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView) {
        vipFrag.m57432X4(privilegeRecyclerSVIPView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: X */
    public static Boolean m57008X(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Boolean bool) {
        return Boolean.valueOf(privilegeRecyclerSVIPView.isShowing);
    }

    /* JADX INFO: renamed from: Y */
    public static Boolean m57009Y(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static void m57010Z(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57432X4(privilegeRecyclerSVIPView.purchaseType, null, wek0.f185947a);
        nb90.m158769g();
    }

    /* JADX INFO: renamed from: a0 */
    private final Merchandise m57011a0(List<? extends Merchandise> merchandises) {
        Merchandise merchandise = null;
        if (vwb.m200296J(merchandises)) {
            return null;
        }
        merchandises.getClass();
        int i = -1;
        for (Merchandise merchandise2 : merchandises) {
            if (g6a.m124557f() && merchandise2.autoRenewable() && merchandise2.monthType() && merchandise2.quantity == 6 && v5h0.m197115f(merchandise2)) {
                return merchandise2;
            }
            if (g6a.m124573v()) {
                if (merchandise2.autoRenewable() && merchandise2.monthType() && rxa0.m181498s(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                    i = merchandise2.quantity;
                    merchandise = merchandise2;
                }
            } else if (merchandise2.autoRenewable() && merchandise2.monthType() && rxa0.m181502w(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                i = merchandise2.quantity;
                merchandise = merchandise2;
            }
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m57012b0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM57424P4 = frag.m57424P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM57424P4.m56903f(purchaseType, wek0.f185947a, frag.m57425Q4(purchaseType));
        privilegePaymentViewM57424P4.setOnNoPrivilegeClick(new d30() { // from class: l.c990
            @Override // p149l.d30
            public final void call() {
                PrivilegeRecyclerSVIPView.m57007W(frag, this);
            }
        });
        privilegePaymentViewM57424P4.setOnPayTypeSelect(new e30() { // from class: l.d990
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m57002R(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM57424P4.m56901d();
        privilegePaymentViewM57424P4.m56902e();
        privilegePaymentViewM57424P4.m56905h();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m57013c0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m57015f0(xma.m210047L3());
    }

    /* JADX INFO: renamed from: e0 */
    public static final Boolean m57014e0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C8998a);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m57015f0(boolean hasSVIP) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C8999a(getResources().getString(R$string.f18705lk), getResources().getString(R$string.f18643jk), new PrivilegeDescListTitle.C8999a.a() { // from class: l.z890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle.C8999a.a
            /* JADX INFO: renamed from: a */
            public final void mo57278a(View view) {
                PrivilegeRecyclerSVIPView.m56997M(this.f202112a, view);
            }
        }));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C8988a c8988aM138185a = it80.m138185a(it.next(), this.purchaseType);
            c8988aM138185a.m57132g(new PrivilegeDescListItem.C8988a.a() { // from class: l.a990
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem.C8988a.a
                /* JADX INFO: renamed from: a */
                public final void mo56927a(View view, Privilege privilege) {
                    PrivilegeRecyclerSVIPView.m56996L(this.f68123a, view, privilege);
                }
            });
            this.contentItems.add(c8988aM138185a);
        }
        if (hasSVIP) {
            String string = getContext().getString(R$string.f18674kk);
            string.getClass();
            this.contentItems.add(new PrivilegeDescListTitle.C8999a(string, "", null));
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            String string2 = getContext().getString(R$string.f18674kk);
            string2.getClass();
            PrivilegeDescListTitle.C8999a c8999a = new PrivilegeDescListTitle.C8999a(string2, "", null);
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C8991a(c8999a, getResources().getString(R$string.f18168U1), false, arrayList, new PrivilegeDescListNoSVipItem.C8991a.a() { // from class: l.b990
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C8991a.a
                /* JADX INFO: renamed from: a */
                public final void mo57171a(View view) {
                    PrivilegeRecyclerSVIPView.m57010Z(this.f74210a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m176580J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m57016g0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        C9008a c9008a = new C9008a(vipFrag);
        c9008a.m57421p(this.purchaseType, new C9008a.f() { // from class: l.g990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a.f
            /* JADX INFO: renamed from: a */
            public final void mo57422a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerSVIPView.m57001Q(this.f101552a, privilege, purchaseType, privilege2);
            }
        });
        if (NullChecker.m81303a(privilege)) {
            c9008a.m57420o(privilege);
        }
    }

    private final C9003a getAdvancedFilterItem() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.advanced_filter);
        C9003a c9003a = new C9003a(x2c0.f189892Xj, wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString(), "advancing");
        c9003a.m57321f(new C9003a.a() { // from class: l.h990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                PrivilegeRecyclerSVIPView.m56989E(this.f106522a, view);
            }
        });
        return c9003a;
    }

    private final C9003a getPrivacyItem() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.privacy_membership);
        C9003a c9003a = new C9003a(x2c0.f190687wk, wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString(), "privacy");
        c9003a.m57321f(new C9003a.a() { // from class: l.t890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                PrivilegeRecyclerSVIPView.m57006V(this.f168809a, view);
            }
        });
        return c9003a;
    }

    private final PrivilegeDescListSeeItem.C8996a getSeeItem() {
        PrivilegeDescListSeeItem.C8996a c8996a = new PrivilegeDescListSeeItem.C8996a();
        c8996a.m57236b(new PrivilegeDescListSeeItem.C8996a.a() { // from class: l.e990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C8996a.a
            /* JADX INFO: renamed from: a */
            public final void mo57237a(View view) {
                PrivilegeRecyclerSVIPView.m57000P(this.f89931a, view);
            }
        });
        return c8996a;
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: c */
    public void mo56928c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m57017d0() {
        fb3 fb3Var = this.pagerAdapter;
        VipFrag vipFrag = null;
        if (fb3Var == null) {
            Intrinsics.m87502r("pagerAdapter");
            fb3Var = null;
        }
        VipFrag vipFrag2 = this.frag;
        if (vipFrag2 == null) {
            Intrinsics.m87502r("frag");
            vipFrag2 = null;
        }
        C22306c c22306cM115452n = fb3Var.m115452n(vipFrag2, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")));
        final Function1 function1 = new Function1() { // from class: l.i990
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m56992H((UserPrivilege) obj);
            }
        };
        C22306c c22306cSkip = c22306cM115452n.map(new w9j() { // from class: l.l990
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m56998N(function1, obj);
            }
        }).distinctUntilChanged().skip(1);
        final Function1 function2 = new Function1() { // from class: l.m990
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m57008X(this.f132685a, (Boolean) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.n990
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m57003S(function2, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.o990
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m56999O(this.f142700a, (Boolean) obj);
            }
        }));
        fb3 fb3Var2 = this.pagerAdapter;
        if (fb3Var2 == null) {
            Intrinsics.m87502r("pagerAdapter");
            fb3Var2 = null;
        }
        VipFrag vipFrag3 = this.frag;
        if (vipFrag3 == null) {
            Intrinsics.m87502r("frag");
        } else {
            vipFrag = vipFrag3;
        }
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"));
        final Function1 function3 = new Function1() { // from class: l.u890
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m56993I((UserPrivilege) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cM210111u3.map(new w9j() { // from class: l.v890
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m57009Y(function3, obj);
            }
        }).distinctUntilChanged();
        C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("svip"));
        final Function1 function4 = new Function1() { // from class: l.w890
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m57005U((List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cDistinctUntilChanged2 = c22306cM30644y5.filter(new w9j() { // from class: l.x890
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m56990F(function4, obj);
            }
        }).distinctUntilChanged();
        C22306c<j760<OrderInfo, ContractInfo>> c22306cDistinctUntilChanged3 = src0.m185656r().m185671P().distinctUntilChanged();
        C22306c<CoreAutoPay.AutoPayStatus> c22306cDistinctUntilChanged4 = CoreModule.f17545c.f19591O0.m30078m3().distinctUntilChanged();
        C22306c<ArrayList<Contract>> c22306cDistinctUntilChanged5 = qib0.f154705T.m29583S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.y890
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerSVIPView.m57004T(((Boolean) obj).booleanValue(), (List) obj2, (j760) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        fb3Var2.m115452n(vipFrag, C22306c.combineLatest(c22306cDistinctUntilChanged, c22306cDistinctUntilChanged2, c22306cDistinctUntilChanged3, c22306cDistinctUntilChanged4, c22306cDistinctUntilChanged5, new aaj() { // from class: l.j990
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerSVIPView.m56991G(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.k990
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m56995K(this.f121922a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m57018h0() {
        if (xma.m210047L3()) {
            return;
        }
        nb90.m158770h();
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: k */
    public void mo56929k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m57012b0(frag);
        m57013c0(frag);
        m57017d0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VipFrag vipFrag = this.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57424P4(this.purchaseType).m56904g();
        VipFrag vipFrag3 = this.frag;
        if (vipFrag3 == null) {
            Intrinsics.m87502r("frag");
        } else {
            vipFrag2 = vipFrag3;
        }
        j5b0 j5b0VarM57425Q4 = vipFrag2.m57425Q4(this.purchaseType);
        if (j5b0VarM57425Q4 != null) {
            j5b0VarM57425Q4.m54013K();
        }
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: q */
    public void mo56930q() {
        m57018h0();
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
