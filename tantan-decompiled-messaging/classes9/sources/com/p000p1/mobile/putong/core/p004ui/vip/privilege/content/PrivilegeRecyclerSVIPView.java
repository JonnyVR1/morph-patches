package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.CoreAutoPay;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerSVIPView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.PayMethod;
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
import l.aaj;
import l.d30;
import l.e30;
import l.fy80;
import l.j760;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.rxa0;
import l.v5h0;
import l.vwb;
import l.w9j;
import l.wek0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.dv80;
import p006l.fb3;
import p006l.g6a;
import p006l.it80;
import p006l.j5b0;
import p006l.ku80;
import p006l.nb90;
import p006l.qib0;
import p006l.qu80;
import p006l.src0;
import p006l.wx80;
import p006l.x2c0;
import p006l.xma;
import p006l.zq20;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u000bH\u0014¢\u0006\u0004\b*\u0010$J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010$J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010$R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020?0>j\b\u0012\u0004\u0012\u00020?`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010FR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001f0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerSVIPView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "b0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "c0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "a0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "hasSVIP", "f0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "g0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "h0", "()V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "d0", "onDetachedFromWindow", "", "selectCouponId", "setSelectCouponId", "(Ljava/lang/String;)V", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "contentItems", "j", "Ljava/lang/String;", "Z", "isShowing", "", "l", "Ljava/util/List;", "privileges", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerSVIPView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        this.contentItems = new ArrayList<>();
        Privilege privilege = Privilege.see_who_likes_me;
        this.privileges = CollectionsKt.mutableListOf(new Privilege[]{privilege, Privilege.online_match_tickets, Privilege.boost, Privilege.vip_unlimited_likes, Privilege.vip_super_like});
        setOverScrollMode(2);
        if (g6a.m15590m()) {
            this.privileges.add(this.privileges.indexOf(privilege) + 1, Privilege.hide_me_from_nearby);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m10460E(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        nb90.m19998b();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        zq20.m28789c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m10461F(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static Pair m10462G(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (Pair) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m10463H(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27355L3());
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m10464I(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27355L3());
    }

    /* JADX INFO: renamed from: K */
    public static void m10466K(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10910P4(privilegeRecyclerSVIPView.purchaseType).m10376h();
        privilegeRecyclerSVIPView.m10486f0(((Boolean) pair.getFirst()).booleanValue());
        int iG = vwb.G(privilegeRecyclerSVIPView.contentItems, new w9j() { // from class: l.f990
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m10485e0((dv80) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iG >= 0) {
                privilegeRecyclerSVIPView.contentItems.remove(iG);
                qu80 qu80Var = privilegeRecyclerSVIPView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iG);
                    return;
                }
                return;
            }
            return;
        }
        if (iG < 0) {
            VipFrag vipFrag3 = privilegeRecyclerSVIPView.frag;
            if (vipFrag3 == null) {
                Intrinsics.r("frag");
                vipFrag3 = null;
            }
            j5b0 j5b0VarM10911Q4 = vipFrag3.m10911Q4(privilegeRecyclerSVIPView.purchaseType);
            if (j5b0VarM10911Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerSVIPView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.r("frag");
                    vipFrag4 = null;
                }
                j5b0VarM10911Q4.m7353P(vipFrag4.m10912R4());
            }
            Merchandise merchandiseM10482a0 = privilegeRecyclerSVIPView.m10482a0((List) pair.getSecond());
            PurchaseType purchaseType = privilegeRecyclerSVIPView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerSVIPView.frag;
            if (vipFrag5 == null) {
                Intrinsics.r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            PrivilegeDescListShowcaseItem.C0434a c0434a = new PrivilegeDescListShowcaseItem.C0434a(purchaseType, merchandiseM10482a0, vipFrag2.m10912R4(), j5b0VarM10911Q4);
            if (j5b0VarM10911Q4 != null) {
                j5b0VarM10911Q4.m7354Q(privilegeRecyclerSVIPView.selectCouponId);
            }
            privilegeRecyclerSVIPView.contentItems.add(0, c0434a);
            qu80 qu80Var2 = privilegeRecyclerSVIPView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m10467L(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view, Privilege privilege) {
        privilegeRecyclerSVIPView.m10487g0(privilege);
    }

    /* JADX INFO: renamed from: M */
    public static void m10468M(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        privilegeRecyclerSVIPView.m10487g0(null);
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m10469N(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static void m10470O(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Boolean bool) {
        privilegeRecyclerSVIPView.m10489h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static void m10471P(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        if (n3b0.s((Counter) null, 1, (Object) null)) {
            return;
        }
        privilegeRecyclerSVIPView.getContext().startActivity(new Intent(privilegeRecyclerSVIPView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: Q */
    public static void m10472Q(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        purchaseType.getClass();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10909O4(purchaseType, privilege, wek0.a);
    }

    /* JADX INFO: renamed from: R */
    public static void m10473R(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m10916V4();
    }

    /* JADX INFO: renamed from: S */
    public static Boolean m10474S(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T */
    public static Pair m10475T(boolean z, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m10476U(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: V */
    public static void m10477V(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        nb90.m20001e();
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        zq20.m28789c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: W */
    public static void m10478W(VipFrag vipFrag, PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView) {
        vipFrag.m10918X4(privilegeRecyclerSVIPView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: X */
    public static Boolean m10479X(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, Boolean bool) {
        return Boolean.valueOf(privilegeRecyclerSVIPView.isShowing);
    }

    /* JADX INFO: renamed from: Y */
    public static Boolean m10480Y(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static void m10481Z(PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView, View view) {
        VipFrag vipFrag = privilegeRecyclerSVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10918X4(privilegeRecyclerSVIPView.purchaseType, null, wek0.a);
        nb90.m20003g();
    }

    /* JADX INFO: renamed from: a0 */
    private final Merchandise m10482a0(List<? extends Merchandise> merchandises) {
        Merchandise merchandise = null;
        if (vwb.J(merchandises)) {
            return null;
        }
        merchandises.getClass();
        int i = -1;
        for (Merchandise merchandise2 : merchandises) {
            if (g6a.m15583f() && merchandise2.autoRenewable() && merchandise2.monthType() && merchandise2.quantity == 6 && v5h0.f(merchandise2)) {
                return merchandise2;
            }
            if (g6a.m15599v()) {
                if (merchandise2.autoRenewable() && merchandise2.monthType() && rxa0.s(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                    i = merchandise2.quantity;
                    merchandise = merchandise2;
                }
            } else if (merchandise2.autoRenewable() && merchandise2.monthType() && rxa0.w(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                i = merchandise2.quantity;
                merchandise = merchandise2;
            }
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m10483b0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM10910P4 = frag.m10910P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM10910P4.m10374f(purchaseType, wek0.a, frag.m10911Q4(purchaseType));
        privilegePaymentViewM10910P4.setOnNoPrivilegeClick(new d30() { // from class: l.c990
            public final void call() {
                PrivilegeRecyclerSVIPView.m10478W(frag, this);
            }
        });
        privilegePaymentViewM10910P4.setOnPayTypeSelect(new e30() { // from class: l.d990
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m10473R(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM10910P4.m10372d();
        privilegePaymentViewM10910P4.m10373e();
        privilegePaymentViewM10910P4.m10376h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    private final void m10484c0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m10486f0(xma.m27355L3());
    }

    /* JADX INFO: renamed from: e0 */
    public static final Boolean m10485e0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C0434a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    private final void m10486f0(boolean hasSVIP) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C0435a(getResources().getString(R$string.f2694lk), getResources().getString(R$string.f2632jk), new PrivilegeDescListTitle.C0435a.a() { // from class: l.z890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle.C0435a.a
            /* JADX INFO: renamed from: a */
            public final void mo10758a(View view) {
                PrivilegeRecyclerSVIPView.m10468M(this.f28668a, view);
            }
        }));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C0424a c0424aM17027a = it80.m17027a(it.next(), this.purchaseType);
            c0424aM17027a.m10603g(new PrivilegeDescListItem.C0424a.a() { // from class: l.a990
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem.C0424a.a
                /* JADX INFO: renamed from: a */
                public final void mo10398a(View view, Privilege privilege) {
                    PrivilegeRecyclerSVIPView.m10467L(this.f8165a, view, privilege);
                }
            });
            this.contentItems.add(c0424aM17027a);
        }
        if (hasSVIP) {
            String string = getContext().getString(R$string.f2663kk);
            string.getClass();
            this.contentItems.add(new PrivilegeDescListTitle.C0435a(string, "", null));
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            String string2 = getContext().getString(R$string.f2663kk);
            string2.getClass();
            PrivilegeDescListTitle.C0435a c0435a = new PrivilegeDescListTitle.C0435a(string2, "", null);
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C0427a(c0435a, getResources().getString(R$string.f2157U1), false, arrayList, new PrivilegeDescListNoSVipItem.C0427a.a() { // from class: l.b990
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C0427a.a
                /* JADX INFO: renamed from: a */
                public final void mo10645a(View view) {
                    PrivilegeRecyclerSVIPView.m10481Z(this.f8780a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m22424J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m10487g0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        C0444a c0444a = new C0444a(vipFrag);
        c0444a.m10904p(this.purchaseType, new C0444a.f() { // from class: l.g990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a.f
            /* JADX INFO: renamed from: a */
            public final void mo10908a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerSVIPView.m10472Q(this.f13113a, privilege, purchaseType, privilege2);
            }
        });
        if (NullChecker.a(privilege)) {
            c0444a.m10903o(privilege);
        }
    }

    private final C0439a getAdvancedFilterItem() {
        wx80 wx80VarL = fy80.l(Privilege.advanced_filter);
        C0439a c0439a = new C0439a(x2c0.f26428Xj, wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString(), "advancing");
        c0439a.m10804f(new C0439a.a() { // from class: l.h990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                PrivilegeRecyclerSVIPView.m10460E(this.f13749a, view);
            }
        });
        return c0439a;
    }

    private final C0439a getPrivacyItem() {
        wx80 wx80VarL = fy80.l(Privilege.privacy_membership);
        C0439a c0439a = new C0439a(x2c0.f27223wk, wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString(), "privacy");
        c0439a.m10804f(new C0439a.a() { // from class: l.t890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                PrivilegeRecyclerSVIPView.m10477V(this.f21949a, view);
            }
        });
        return c0439a;
    }

    private final PrivilegeDescListSeeItem.C0432a getSeeItem() {
        PrivilegeDescListSeeItem.C0432a c0432a = new PrivilegeDescListSeeItem.C0432a();
        c0432a.m10713b(new PrivilegeDescListSeeItem.C0432a.a() { // from class: l.e990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C0432a.a
            /* JADX INFO: renamed from: a */
            public final void mo10714a(View view) {
                PrivilegeRecyclerSVIPView.m10471P(this.f10862a, view);
            }
        });
        return c0432a;
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: c */
    public void mo10399c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: d0 */
    public void m10488d0() {
        fb3 fb3Var = this.pagerAdapter;
        mcr mcrVar = null;
        if (fb3Var == null) {
            Intrinsics.r("pagerAdapter");
            fb3Var = null;
        }
        mcr mcrVar2 = this.frag;
        if (mcrVar2 == null) {
            Intrinsics.r("frag");
            mcrVar2 = null;
        }
        c cVarN = fb3Var.n(mcrVar2, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip")));
        final Function1 function1 = new Function1() { // from class: l.i990
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m10463H((UserPrivilege) obj);
            }
        };
        c cVarSkip = cVarN.map(new w9j() { // from class: l.l990
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m10469N(function1, obj);
            }
        }).distinctUntilChanged().skip(1);
        final Function1 function2 = new Function1() { // from class: l.m990
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m10479X(this.f16871a, (Boolean) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.n990
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m10474S(function2, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.o990
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m10470O(this.f18080a, (Boolean) obj);
            }
        }));
        fb3 fb3Var2 = this.pagerAdapter;
        if (fb3Var2 == null) {
            Intrinsics.r("pagerAdapter");
            fb3Var2 = null;
        }
        mcr mcrVar3 = this.frag;
        if (mcrVar3 == null) {
            Intrinsics.r("frag");
        } else {
            mcrVar = mcrVar3;
        }
        c<UserPrivilege> cVarM27419u3 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"));
        final Function1 function3 = new Function1() { // from class: l.u890
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m10464I((UserPrivilege) obj);
            }
        };
        c cVarDistinctUntilChanged = cVarM27419u3.map(new w9j() { // from class: l.v890
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m10480Y(function3, obj);
            }
        }).distinctUntilChanged();
        c<List<Merchandise>> cVarM2572y5 = CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("svip"));
        final Function1 function4 = new Function1() { // from class: l.w890
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerSVIPView.m10476U((List) obj);
            }
        };
        c cVarDistinctUntilChanged2 = cVarM2572y5.filter(new w9j() { // from class: l.x890
            public final Object call(Object obj) {
                return PrivilegeRecyclerSVIPView.m10461F(function4, obj);
            }
        }).distinctUntilChanged();
        c cVarDistinctUntilChanged3 = src0.m24159r().m24174P().distinctUntilChanged();
        c cVarDistinctUntilChanged4 = CoreModule.f1534c.f3580O0.m2006m3().distinctUntilChanged();
        c cVarDistinctUntilChanged5 = qib0.f19796T.m1489S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.y890
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerSVIPView.m10475T(((Boolean) obj).booleanValue(), (List) obj2, (j760) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        fb3Var2.n(mcrVar, c.combineLatest(cVarDistinctUntilChanged, cVarDistinctUntilChanged2, cVarDistinctUntilChanged3, cVarDistinctUntilChanged4, cVarDistinctUntilChanged5, new aaj() { // from class: l.j990
            /* JADX INFO: renamed from: a */
            public final Object m17405a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerSVIPView.m10462G(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.k990
            public final void call(Object obj) {
                PrivilegeRecyclerSVIPView.m10466K(this.f15660a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m10489h0() {
        if (xma.m27355L3()) {
            return;
        }
        nb90.m20004h();
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: k */
    public void mo10400k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m10483b0(frag);
        m10484c0(frag);
        m10488d0();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VipFrag vipFrag = this.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10910P4(this.purchaseType).m10375g();
        VipFrag vipFrag3 = this.frag;
        if (vipFrag3 == null) {
            Intrinsics.r("frag");
        } else {
            vipFrag2 = vipFrag3;
        }
        j5b0 j5b0VarM10911Q4 = vipFrag2.m10911Q4(this.purchaseType);
        if (j5b0VarM10911Q4 != null) {
            j5b0VarM10911Q4.m7348K();
        }
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: q */
    public void mo10401q() {
        m10489h0();
        this.isShowing = true;
    }

    public final void setSelectCouponId(@NotNull String selectCouponId) {
        selectCouponId.getClass();
        this.selectCouponId = selectCouponId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PrivilegeRecyclerSVIPView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PrivilegeRecyclerSVIPView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
