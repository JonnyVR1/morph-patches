package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content;

import android.content.Context;
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
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerVIPView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.baj;
import p149l.d30;
import p149l.dv80;
import p149l.e30;
import p149l.fb3;
import p149l.fy80;
import p149l.it80;
import p149l.j5b0;
import p149l.j760;
import p149l.ku80;
import p149l.mkd0;
import p149l.nb90;
import p149l.qib0;
import p149l.qu80;
import p149l.rxa0;
import p149l.src0;
import p149l.vwb;
import p149l.w9j;
import p149l.wek0;
import p149l.x9j;
import p149l.xaj0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ!\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0014¢\u0006\u0004\b&\u0010\u001aJ\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u001aJ\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010?\u001a\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010BR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerVIPView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListItem$a$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "d0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "e0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "c0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "showSVIP", "h0", "(Z)V", "i0", "()V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "f0", "Landroid/view/View;", OMSTemplateModeType.view, "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/Privilege;)V", "onDetachedFromWindow", "", "selectCouponId", "setSelectCouponId", "(Ljava/lang/String;)V", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "j", "Ljava/lang/String;", "Z", "isShowing", "", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/List;", "privileges", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivilegeRecyclerVIPView extends PrivilegeRecycleView implements ku80, PrivilegeDescListItem.C8988a.a {

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
    public PrivilegeRecyclerVIPView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_GET_VIP;
        this.contentItems = new ArrayList<>();
        this.privileges = CollectionsKt.mutableListOf(Privilege.vip_unlimited_likes, Privilege.online_match_tickets, Privilege.boost, Privilege.vip_super_like, Privilege.liked_user);
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: E */
    public static j760 m57042E(boolean z, boolean z2) {
        return new j760(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m57044G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m57045H(User user) {
        user.getClass();
        return Boolean.valueOf(user.isVIP());
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m57046I(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m57047J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m57048K(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static void m57049L(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, View view) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57432X4(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, null, wek0.f185947a);
        nb90.m158771i();
    }

    /* JADX INFO: renamed from: M */
    public static void m57050M(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m57430V4();
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m57051N(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(rxa0.m181503x(merchandise));
    }

    /* JADX INFO: renamed from: O */
    public static Boolean m57052O(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: P */
    public static xaj0 m57053P(boolean z, boolean z2, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return xaj0.m207578a(Boolean.valueOf(z), Boolean.valueOf(z2), list);
    }

    /* JADX INFO: renamed from: Q */
    public static Boolean m57054Q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R */
    public static Boolean m57055R(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210047L3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static void m57056S(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, xaj0 xaj0Var) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57424P4(privilegeRecyclerVIPView.purchaseType).m56905h();
        privilegeRecyclerVIPView.m57069h0(((Boolean) xaj0Var.f191751a).booleanValue() && !((Boolean) xaj0Var.f191752b).booleanValue());
        int iM200293G = vwb.m200293G(privilegeRecyclerVIPView.contentItems, new w9j() { // from class: l.ma90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57068g0((dv80) obj);
            }
        });
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            if (iM200293G >= 0) {
                privilegeRecyclerVIPView.contentItems.remove(iM200293G);
                qu80 qu80Var = privilegeRecyclerVIPView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iM200293G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM200293G < 0) {
            C c = xaj0Var.f191753c;
            c.getClass();
            Merchandise merchandiseM57070c0 = privilegeRecyclerVIPView.m57070c0((List) c);
            VipFrag vipFrag3 = privilegeRecyclerVIPView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m87502r("frag");
                vipFrag3 = null;
            }
            j5b0 j5b0VarM57425Q4 = vipFrag3.m57425Q4(privilegeRecyclerVIPView.purchaseType);
            if (j5b0VarM57425Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerVIPView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.m87502r("frag");
                    vipFrag4 = null;
                }
                j5b0VarM57425Q4.m54018P(vipFrag4.m57426R4());
            }
            PurchaseType purchaseType = privilegeRecyclerVIPView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerVIPView.frag;
            if (vipFrag5 == null) {
                Intrinsics.m87502r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            PrivilegeDescListShowcaseItem.C8998a c8998a = new PrivilegeDescListShowcaseItem.C8998a(purchaseType, merchandiseM57070c0, vipFrag2.m57426R4(), j5b0VarM57425Q4);
            if (j5b0VarM57425Q4 != null) {
                j5b0VarM57425Q4.m54019Q(privilegeRecyclerVIPView.selectCouponId);
            }
            privilegeRecyclerVIPView.contentItems.add(0, c8998a);
            qu80 qu80Var2 = privilegeRecyclerVIPView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m57057T(User user) {
        user.getClass();
        return Boolean.valueOf(user.isVIP());
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m57058U(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, j760 j760Var) {
        return Boolean.valueOf(privilegeRecyclerVIPView.isShowing);
    }

    /* JADX INFO: renamed from: V */
    public static j760 m57059V(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: W */
    public static xaj0 m57060W(Function6 function6, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return (xaj0) function6.invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX INFO: renamed from: X */
    public static Boolean m57061X(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210047L3());
    }

    /* JADX INFO: renamed from: Y */
    public static void m57062Y(VipFrag vipFrag, PrivilegeRecyclerVIPView privilegeRecyclerVIPView) {
        vipFrag.m57432X4(privilegeRecyclerVIPView.purchaseType, null, "p_privilege,default");
    }

    /* JADX INFO: renamed from: Z */
    public static void m57063Z(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57423O4(purchaseType, privilege, wek0.f185947a);
    }

    /* JADX INFO: renamed from: a0 */
    public static Boolean m57064a0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m57065b0(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, j760 j760Var) {
        privilegeRecyclerVIPView.m57072i0();
    }

    /* JADX INFO: renamed from: d0 */
    private final void m57066d0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM57424P4 = frag.m57424P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM57424P4.m56903f(purchaseType, wek0.f185947a, frag.m57425Q4(purchaseType));
        privilegePaymentViewM57424P4.setOnNoPrivilegeClick(new d30() { // from class: l.ja90
            @Override // p149l.d30
            public final void call() {
                PrivilegeRecyclerVIPView.m57062Y(frag, this);
            }
        });
        privilegePaymentViewM57424P4.setOnPayTypeSelect(new e30() { // from class: l.la90
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m57050M(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM57424P4.m56901d();
        privilegePaymentViewM57424P4.m56902e();
        privilegePaymentViewM57424P4.m56905h();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m57067e0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m57069h0(CoreModule.f17545c.f19639e0.m169520na().isVIP() && !xma.m210047L3());
    }

    /* JADX INFO: renamed from: g0 */
    public static final Boolean m57068g0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C8998a);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m57069h0(boolean showSVIP) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C8999a(getResources().getString(R$string.f18015Os), "", null));
        Iterator<Privilege> it = fy80.m123729y().iterator();
        it.getClass();
        while (it.hasNext()) {
            PrivilegeDescListItem.C8988a c8988aM138185a = it80.m138185a(it.next(), this.purchaseType);
            c8988aM138185a.m57132g(this);
            this.contentItems.add(c8988aM138185a);
        }
        if (showSVIP) {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C8999a c8999a = new PrivilegeDescListTitle.C8999a("SVIP" + getContext().getString(R$string.f18750n3), "", null);
            Iterator<Privilege> it2 = this.privileges.iterator();
            while (it2.hasNext()) {
                PrivilegeDescListItem.C8988a c8988aM138185a2 = it80.m138185a(it2.next(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
                c8988aM138185a2.getClass();
                arrayList.add(c8988aM138185a2);
            }
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C8991a(c8999a, getResources().getString(R$string.f18198V1), true, arrayList, new PrivilegeDescListNoSVipItem.C8991a.a() { // from class: l.ia90
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C8991a.a
                /* JADX INFO: renamed from: a */
                public final void mo57171a(View view) {
                    PrivilegeRecyclerVIPView.m57049L(this.f112292a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m176580J(this.contentItems);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem.C8988a.a
    /* JADX INFO: renamed from: a */
    public void mo56927a(@NotNull View view, @Nullable final Privilege privilege) {
        view.getClass();
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        C9008a c9008a = new C9008a(vipFrag);
        c9008a.m57421p(this.purchaseType, new C9008a.f() { // from class: l.oa90
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a.f
            /* JADX INFO: renamed from: a */
            public final void mo57422a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerVIPView.m57063Z(this.f142794a, privilege, purchaseType, privilege2);
            }
        });
        c9008a.m57420o(privilege);
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: c */
    public void mo56928c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: c0 */
    public final Merchandise m57070c0(List<? extends Merchandise> merchandises) {
        return (Merchandise) vwb.m200346r(merchandises, new w9j() { // from class: l.na90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57051N((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m57071f0() {
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
        C22306c<User> c22306cM169523o9 = CoreModule.f17545c.f19639e0.m169523o9();
        final Function1 function1 = new Function1() { // from class: l.z990
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m57045H((User) obj);
            }
        };
        C22306c<R> map = c22306cM169523o9.map(new w9j() { // from class: l.wa90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57054Q(function1, obj);
            }
        });
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"));
        final Function1 function2 = new Function1() { // from class: l.aa90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m57061X((UserPrivilege) obj);
            }
        };
        C22306c<R> map2 = c22306cM210111u3.map(new w9j() { // from class: l.ba90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57064a0(function2, obj);
            }
        });
        final Function2 function3 = new Function2() { // from class: l.ca90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PrivilegeRecyclerVIPView.m57042E(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        C22306c c22306cSkip = fb3Var.m115452n(vipFrag2, mkd0.m154984r(map, map2, new x9j() { // from class: l.da90
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return PrivilegeRecyclerVIPView.m57059V(function3, obj, obj2);
            }
        })).distinctUntilChanged().skip(1);
        final Function1 function4 = new Function1() { // from class: l.ea90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m57058U(this.f90180a, (j760) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.fa90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57048K(function4, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ga90
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m57065b0(this.f101652a, (j760) obj);
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
        C22306c<User> c22306cM169523o10 = CoreModule.f17545c.f19639e0.m169523o9();
        final Function1 function5 = new Function1() { // from class: l.ha90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m57057T((User) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cM169523o10.map(new w9j() { // from class: l.ka90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57046I(function5, obj);
            }
        }).distinctUntilChanged();
        C22306c<UserPrivilege> c22306cM210111u4 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"));
        final Function1 function6 = new Function1() { // from class: l.pa90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m57055R((UserPrivilege) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged2 = c22306cM210111u4.map(new w9j() { // from class: l.qa90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57044G(function6, obj);
            }
        }).distinctUntilChanged();
        C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttVip));
        final Function1 function7 = new Function1() { // from class: l.ra90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m57052O((List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cDistinctUntilChanged3 = c22306cM30644y5.filter(new w9j() { // from class: l.sa90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m57047J(function7, obj);
            }
        }).distinctUntilChanged();
        C22306c<j760<OrderInfo, ContractInfo>> c22306cDistinctUntilChanged4 = src0.m185656r().m185671P().distinctUntilChanged();
        C22306c<CoreAutoPay.AutoPayStatus> c22306cDistinctUntilChanged5 = CoreModule.f17545c.f19591O0.m30078m3().distinctUntilChanged();
        C22306c<ArrayList<Contract>> c22306cDistinctUntilChanged6 = qib0.f154705T.m29583S().distinctUntilChanged();
        final Function6 function8 = new Function6() { // from class: l.ta90
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PrivilegeRecyclerVIPView.m57053P(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (List) obj3, (j760) obj4, (CoreAutoPay.AutoPayStatus) obj5, (ArrayList) obj6);
            }
        };
        fb3Var2.m115452n(vipFrag, C22306c.combineLatest(c22306cDistinctUntilChanged, c22306cDistinctUntilChanged2, c22306cDistinctUntilChanged3, c22306cDistinctUntilChanged4, c22306cDistinctUntilChanged5, c22306cDistinctUntilChanged6, new baj() { // from class: l.ua90
            @Override // p149l.baj
            /* JADX INFO: renamed from: a */
            public final Object mo100908a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PrivilegeRecyclerVIPView.m57060W(function8, obj, obj2, obj3, obj4, obj5, obj6);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.va90
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m57056S(this.f180723a, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m57072i0() {
        if (!CoreModule.f17545c.f19639e0.m169520na().isVIP() || xma.m210047L3()) {
            return;
        }
        nb90.m158772j();
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: k */
    public void mo56929k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m57066d0(frag);
        m57067e0(frag);
        m57071f0();
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
        m57072i0();
        this.isShowing = true;
    }

    public final void setSelectCouponId(@NotNull String selectCouponId) {
        selectCouponId.getClass();
        this.selectCouponId = selectCouponId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerVIPView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegeRecyclerVIPView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
