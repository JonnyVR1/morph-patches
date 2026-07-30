package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.CoreAutoPay;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerVIPView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
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
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.baj;
import l.d30;
import l.e30;
import l.fy80;
import l.j760;
import l.mcr;
import l.mkd0;
import l.rxa0;
import l.vwb;
import l.w9j;
import l.wek0;
import l.x9j;
import l.xaj0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.dv80;
import p006l.fb3;
import p006l.it80;
import p006l.j5b0;
import p006l.ku80;
import p006l.nb90;
import p006l.qib0;
import p006l.qu80;
import p006l.src0;
import p006l.xma;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ!\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0014¢\u0006\u0004\b&\u0010\u001aJ\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u001aJ\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010?\u001a\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010BR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerVIPView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListItem$a$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "d0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "e0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "c0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "showSVIP", "h0", "(Z)V", "i0", "()V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "f0", "Landroid/view/View;", "view", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/Privilege;)V", "onDetachedFromWindow", "", "selectCouponId", "setSelectCouponId", "(Ljava/lang/String;)V", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "contentItems", "j", "Ljava/lang/String;", "Z", "isShowing", "", "l", "Ljava/util/List;", "privileges", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivilegeRecyclerVIPView extends PrivilegeRecycleView implements ku80, PrivilegeDescListItem.C0424a.a {

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
    public PrivilegeRecyclerVIPView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_GET_VIP;
        this.contentItems = new ArrayList<>();
        this.privileges = CollectionsKt.mutableListOf(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.online_match_tickets, Privilege.boost, Privilege.vip_super_like, Privilege.liked_user});
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: E */
    public static j760 m10513E(boolean z, boolean z2) {
        return new j760(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m10515G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m10516H(User user) {
        user.getClass();
        return Boolean.valueOf(user.isVIP());
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m10517I(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m10518J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m10519K(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static void m10520L(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, View view) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10918X4(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, null, wek0.a);
        nb90.m20005i();
    }

    /* JADX INFO: renamed from: M */
    public static void m10521M(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m10916V4();
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m10522N(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(rxa0.x(merchandise));
    }

    /* JADX INFO: renamed from: O */
    public static Boolean m10523O(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: P */
    public static xaj0 m10524P(boolean z, boolean z2, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return xaj0.a(Boolean.valueOf(z), Boolean.valueOf(z2), list);
    }

    /* JADX INFO: renamed from: Q */
    public static Boolean m10525Q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R */
    public static Boolean m10526R(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27355L3());
    }

    /* JADX INFO: renamed from: S */
    public static void m10527S(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, xaj0 xaj0Var) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10910P4(privilegeRecyclerVIPView.purchaseType).m10376h();
        privilegeRecyclerVIPView.m10540h0(((Boolean) xaj0Var.a).booleanValue() && !((Boolean) xaj0Var.b).booleanValue());
        int iG = vwb.G(privilegeRecyclerVIPView.contentItems, new w9j() { // from class: l.ma90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10539g0((dv80) obj);
            }
        });
        if (((Boolean) xaj0Var.a).booleanValue()) {
            if (iG >= 0) {
                privilegeRecyclerVIPView.contentItems.remove(iG);
                qu80 qu80Var = privilegeRecyclerVIPView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iG);
                    return;
                }
                return;
            }
            return;
        }
        if (iG < 0) {
            Object obj = xaj0Var.c;
            obj.getClass();
            Merchandise merchandiseM10541c0 = privilegeRecyclerVIPView.m10541c0((List) obj);
            VipFrag vipFrag3 = privilegeRecyclerVIPView.frag;
            if (vipFrag3 == null) {
                Intrinsics.r("frag");
                vipFrag3 = null;
            }
            j5b0 j5b0VarM10911Q4 = vipFrag3.m10911Q4(privilegeRecyclerVIPView.purchaseType);
            if (j5b0VarM10911Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerVIPView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.r("frag");
                    vipFrag4 = null;
                }
                j5b0VarM10911Q4.m7353P(vipFrag4.m10912R4());
            }
            PurchaseType purchaseType = privilegeRecyclerVIPView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerVIPView.frag;
            if (vipFrag5 == null) {
                Intrinsics.r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            PrivilegeDescListShowcaseItem.C0434a c0434a = new PrivilegeDescListShowcaseItem.C0434a(purchaseType, merchandiseM10541c0, vipFrag2.m10912R4(), j5b0VarM10911Q4);
            if (j5b0VarM10911Q4 != null) {
                j5b0VarM10911Q4.m7354Q(privilegeRecyclerVIPView.selectCouponId);
            }
            privilegeRecyclerVIPView.contentItems.add(0, c0434a);
            qu80 qu80Var2 = privilegeRecyclerVIPView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m10528T(User user) {
        user.getClass();
        return Boolean.valueOf(user.isVIP());
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m10529U(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, j760 j760Var) {
        return Boolean.valueOf(privilegeRecyclerVIPView.isShowing);
    }

    /* JADX INFO: renamed from: V */
    public static j760 m10530V(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: W */
    public static xaj0 m10531W(Function6 function6, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return (xaj0) function6.invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX INFO: renamed from: X */
    public static Boolean m10532X(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27355L3());
    }

    /* JADX INFO: renamed from: Y */
    public static void m10533Y(VipFrag vipFrag, PrivilegeRecyclerVIPView privilegeRecyclerVIPView) {
        vipFrag.m10918X4(privilegeRecyclerVIPView.purchaseType, null, "p_privilege,default");
    }

    /* JADX INFO: renamed from: Z */
    public static void m10534Z(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10909O4(purchaseType, privilege, wek0.a);
    }

    /* JADX INFO: renamed from: a0 */
    public static Boolean m10535a0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m10536b0(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, j760 j760Var) {
        privilegeRecyclerVIPView.m10543i0();
    }

    /* JADX INFO: renamed from: d0 */
    private final void m10537d0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM10910P4 = frag.m10910P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM10910P4.m10374f(purchaseType, wek0.a, frag.m10911Q4(purchaseType));
        privilegePaymentViewM10910P4.setOnNoPrivilegeClick(new d30() { // from class: l.ja90
            public final void call() {
                PrivilegeRecyclerVIPView.m10533Y(frag, this);
            }
        });
        privilegePaymentViewM10910P4.setOnPayTypeSelect(new e30() { // from class: l.la90
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m10521M(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM10910P4.m10372d();
        privilegePaymentViewM10910P4.m10373e();
        privilegePaymentViewM10910P4.m10376h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    private final void m10538e0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m10540h0(CoreModule.f1534c.f3628e0.m21483na().isVIP() && !xma.m27355L3());
    }

    /* JADX INFO: renamed from: g0 */
    public static final Boolean m10539g0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C0434a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    private final void m10540h0(boolean showSVIP) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C0435a(getResources().getString(R$string.f2004Os), "", null));
        Iterator it = fy80.y().iterator();
        it.getClass();
        while (it.hasNext()) {
            PrivilegeDescListItem.C0424a c0424aM17027a = it80.m17027a((Privilege) it.next(), this.purchaseType);
            c0424aM17027a.m10603g(this);
            this.contentItems.add(c0424aM17027a);
        }
        if (showSVIP) {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C0435a c0435a = new PrivilegeDescListTitle.C0435a("SVIP" + getContext().getString(R$string.f2739n3), "", null);
            Iterator<Privilege> it2 = this.privileges.iterator();
            while (it2.hasNext()) {
                PrivilegeDescListItem.C0424a c0424aM17027a2 = it80.m17027a(it2.next(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
                c0424aM17027a2.getClass();
                arrayList.add(c0424aM17027a2);
            }
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C0427a(c0435a, getResources().getString(R$string.f2187V1), true, arrayList, new PrivilegeDescListNoSVipItem.C0427a.a() { // from class: l.ia90
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C0427a.a
                /* JADX INFO: renamed from: a */
                public final void mo10645a(View view) {
                    PrivilegeRecyclerVIPView.m10520L(this.f14342a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m22424J(this.contentItems);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem.C0424a.a
    /* JADX INFO: renamed from: a */
    public void mo10398a(@NotNull View view, @Nullable final Privilege privilege) {
        view.getClass();
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        C0444a c0444a = new C0444a(vipFrag);
        c0444a.m10904p(this.purchaseType, new C0444a.f() { // from class: l.oa90
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a.f
            /* JADX INFO: renamed from: a */
            public final void mo10908a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerVIPView.m10534Z(this.f18104a, privilege, purchaseType, privilege2);
            }
        });
        c0444a.m10903o(privilege);
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: c */
    public void mo10399c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: c0 */
    public final Merchandise m10541c0(List<? extends Merchandise> merchandises) {
        return (Merchandise) vwb.r(merchandises, new w9j() { // from class: l.na90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10522N((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m10542f0() {
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
        c<User> cVarM21486o9 = CoreModule.f1534c.f3628e0.m21486o9();
        final Function1 function1 = new Function1() { // from class: l.z990
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m10516H((User) obj);
            }
        };
        c map = cVarM21486o9.map(new w9j() { // from class: l.wa90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10525Q(function1, obj);
            }
        });
        c<UserPrivilege> cVarM27419u3 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"));
        final Function1 function2 = new Function1() { // from class: l.aa90
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m10532X((UserPrivilege) obj);
            }
        };
        c map2 = cVarM27419u3.map(new w9j() { // from class: l.ba90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10535a0(function2, obj);
            }
        });
        final Function2 function3 = new Function2() { // from class: l.ca90
            public final Object invoke(Object obj, Object obj2) {
                return PrivilegeRecyclerVIPView.m10513E(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        c cVarSkip = fb3Var.n(mcrVar2, mkd0.r(map, map2, new x9j() { // from class: l.da90
            public final Object call(Object obj, Object obj2) {
                return PrivilegeRecyclerVIPView.m10530V(function3, obj, obj2);
            }
        })).distinctUntilChanged().skip(1);
        final Function1 function4 = new Function1() { // from class: l.ea90
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m10529U(this.f11030a, (j760) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.fa90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10519K(function4, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ga90
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m10536b0(this.f13131a, (j760) obj);
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
        c<User> cVarM21486o10 = CoreModule.f1534c.f3628e0.m21486o9();
        final Function1 function5 = new Function1() { // from class: l.ha90
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m10528T((User) obj);
            }
        };
        c cVarDistinctUntilChanged = cVarM21486o10.map(new w9j() { // from class: l.ka90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10517I(function5, obj);
            }
        }).distinctUntilChanged();
        c<UserPrivilege> cVarM27419u4 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"));
        final Function1 function6 = new Function1() { // from class: l.pa90
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m10526R((UserPrivilege) obj);
            }
        };
        c cVarDistinctUntilChanged2 = cVarM27419u4.map(new w9j() { // from class: l.qa90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10515G(function6, obj);
            }
        }).distinctUntilChanged();
        c<List<Merchandise>> cVarM2572y5 = CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("tttVip"));
        final Function1 function7 = new Function1() { // from class: l.ra90
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m10523O((List) obj);
            }
        };
        c cVarDistinctUntilChanged3 = cVarM2572y5.filter(new w9j() { // from class: l.sa90
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m10518J(function7, obj);
            }
        }).distinctUntilChanged();
        c cVarDistinctUntilChanged4 = src0.m24159r().m24174P().distinctUntilChanged();
        c cVarDistinctUntilChanged5 = CoreModule.f1534c.f3580O0.m2006m3().distinctUntilChanged();
        c cVarDistinctUntilChanged6 = qib0.f19796T.m1489S().distinctUntilChanged();
        final Function6 function8 = new Function6() { // from class: l.ta90
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PrivilegeRecyclerVIPView.m10524P(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (List) obj3, (j760) obj4, (CoreAutoPay.AutoPayStatus) obj5, (ArrayList) obj6);
            }
        };
        fb3Var2.n(mcrVar, c.combineLatest(cVarDistinctUntilChanged, cVarDistinctUntilChanged2, cVarDistinctUntilChanged3, cVarDistinctUntilChanged4, cVarDistinctUntilChanged5, cVarDistinctUntilChanged6, new baj() { // from class: l.ua90
            /* JADX INFO: renamed from: a */
            public final Object m25166a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PrivilegeRecyclerVIPView.m10531W(function8, obj, obj2, obj3, obj4, obj5, obj6);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.va90
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m10527S(this.f24236a, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10543i0() {
        if (!CoreModule.f1534c.f3628e0.m21483na().isVIP() || xma.m27355L3()) {
            return;
        }
        nb90.m20006j();
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: k */
    public void mo10400k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m10537d0(frag);
        m10538e0(frag);
        m10542f0();
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
        m10543i0();
        this.isShowing = true;
    }

    public final void setSelectCouponId(@NotNull String selectCouponId) {
        selectCouponId.getClass();
        this.selectCouponId = selectCouponId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PrivilegeRecyclerVIPView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PrivilegeRecyclerVIPView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
