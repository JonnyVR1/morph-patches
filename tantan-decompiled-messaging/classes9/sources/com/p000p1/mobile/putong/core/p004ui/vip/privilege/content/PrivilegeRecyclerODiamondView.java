package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerODiamondView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p000p1.mobile.putong.core.p004ui.visitor.MomentVisitorsAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.PayMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.fy80;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.sab0;
import l.vwb;
import l.w9j;
import l.wek0;
import l.x9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.dv80;
import p006l.fb3;
import p006l.g6a;
import p006l.it80;
import p006l.j5b0;
import p006l.ku80;
import p006l.nb90;
import p006l.qu80;
import p006l.wx80;
import p006l.x2c0;
import p006l.xma;
import p006l.zq20;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0014¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010,J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010,R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020#0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010HR\"\u0010L\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u0012¨\u0006O"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerODiamondView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "d0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "e0", "", "hasODiamond", "k0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondSkinItem$a;", "getDiamondSkinItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondSkinItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondServiceItem$a;", "getCustomerServiceItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondServiceItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListVisitorItem$a;", "getVisitorItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListVisitorItem$a;", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "l0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "f0", "()V", "onDetachedFromWindow", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "contentItems", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListPrivateCustomExtraItem$b;", "j", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListPrivateCustomExtraItem$b;", "privateCustomExtraItemData", "", "Ljava/util/List;", "privileges", "l", "Z", "isShowing", "()Z", "setShowing", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class PrivilegeRecyclerODiamondView extends PrivilegeRecycleView implements ku80 {

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
    public PrivilegeDescListPrivateCustomExtraItem.C0430b privateCustomExtraItemData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<Privilege> privileges;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isShowing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerODiamondView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_O_DIAMOND;
        this.contentItems = new ArrayList<>();
        this.privileges = new ArrayList();
        setOverScrollMode(2);
        this.privileges.add(Privilege.immediately_match);
        this.privileges.add(Privilege.oDiamondSvipSkin);
        this.privileges.add(Privilege.oDiamondVisitor);
        this.privileges.add(Privilege.customer_service);
        this.privileges.add(Privilege.vip_super_like);
        this.privileges.add(Privilege.boost);
    }

    /* JADX INFO: renamed from: E */
    public static void m10402E(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        nb90.m20001e();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        zq20.m28789c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m10403F(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static void m10404G(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10918X4(privilegeRecyclerODiamondView.purchaseType, null, wek0.a);
        nb90.m20003g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static void m10406I(final PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Boolean bool) {
        int iG = vwb.G(privilegeRecyclerODiamondView.contentItems, new w9j() { // from class: l.o790
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m10430h0((dv80) obj);
            }
        });
        VipFrag vipFrag = null;
        if (bool.booleanValue()) {
            if (iG >= 0) {
                privilegeRecyclerODiamondView.privateCustomExtraItemData = null;
                privilegeRecyclerODiamondView.contentItems.remove(iG);
                qu80 qu80Var = privilegeRecyclerODiamondView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iG);
                    return;
                }
                return;
            }
            return;
        }
        if (iG < 0) {
            VipFrag vipFrag2 = privilegeRecyclerODiamondView.frag;
            if (vipFrag2 == null) {
                Intrinsics.r("frag");
            } else {
                vipFrag = vipFrag2;
            }
            PrivilegeDescListPrivateCustomExtraItem.C0430b c0430b = new PrivilegeDescListPrivateCustomExtraItem.C0430b(privilegeRecyclerODiamondView.purchaseType, vipFrag.m10911Q4(privilegeRecyclerODiamondView.purchaseType));
            int iG2 = vwb.G(privilegeRecyclerODiamondView.contentItems, new w9j() { // from class: l.p790
                public final Object call(Object obj) {
                    return PrivilegeRecyclerODiamondView.m10431i0((dv80) obj);
                }
            });
            int i = iG2 >= 0 ? iG2 + 1 : 0;
            privilegeRecyclerODiamondView.privateCustomExtraItemData = c0430b;
            privilegeRecyclerODiamondView.contentItems.add(i, c0430b);
            qu80 qu80Var2 = privilegeRecyclerODiamondView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemRangeChanged(i, 1);
            }
            privilegeRecyclerODiamondView.post(new Runnable() { // from class: l.q790
                @Override // java.lang.Runnable
                public final void run() {
                    PrivilegeRecyclerODiamondView.m10432j0(this.f19656a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m10407J(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        if (xma.m27351F3()) {
            VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
            VipFrag vipFrag2 = null;
            if (vipFrag == null) {
                Intrinsics.r("frag");
                vipFrag = null;
            }
            zvf0.r("e_privilege_odiamond_visitor_more", vipFrag.pageId());
            VipFrag vipFrag3 = privilegeRecyclerODiamondView.frag;
            if (vipFrag3 == null) {
                Intrinsics.r("frag");
                vipFrag3 = null;
            }
            Act act = vipFrag3.act();
            VipFrag vipFrag4 = privilegeRecyclerODiamondView.frag;
            if (vipFrag4 == null) {
                Intrinsics.r("frag");
            } else {
                vipFrag2 = vipFrag4;
            }
            act.startActivity(MomentVisitorsAct.m11283V1(vipFrag2.act(), CoreModule.f1534c.f3657n2.m22251L3()));
        }
    }

    /* JADX INFO: renamed from: L */
    public static Boolean m10409L(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static void m10411N(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view, Privilege privilege) {
        privilegeRecyclerODiamondView.m10435l0(privilege);
    }

    /* JADX INFO: renamed from: O */
    public static void m10412O(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        privilegeRecyclerODiamondView.m10435l0(null);
    }

    /* JADX INFO: renamed from: P */
    public static void m10413P(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view, Privilege privilege) {
        privilegeRecyclerODiamondView.m10435l0(privilege);
    }

    /* JADX INFO: renamed from: Q */
    public static Pair m10414Q(boolean z, List list) {
        list.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: S */
    public static void m10416S(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        purchaseType.getClass();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10909O4(purchaseType, privilege, wek0.a);
    }

    /* JADX INFO: renamed from: T */
    public static void m10417T(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m10916V4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public static void m10418U(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        if (n3b0.s((Counter) null, 1, (Object) null)) {
            return;
        }
        privilegeRecyclerODiamondView.getContext().startActivity(new Intent(privilegeRecyclerODiamondView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: V */
    public static void m10419V(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        nb90.m19998b();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        zq20.m28789c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: W */
    public static void m10420W(VipFrag vipFrag, PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView) {
        vipFrag.m10918X4(privilegeRecyclerODiamondView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: X */
    public static Pair m10421X(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: Y */
    public static Boolean m10422Y(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27351F3());
    }

    /* JADX INFO: renamed from: Z */
    public static Boolean m10423Z(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27354I3());
    }

    /* JADX INFO: renamed from: a0 */
    public static Boolean m10424a0(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m10425b0(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10910P4(privilegeRecyclerODiamondView.purchaseType).m10376h();
        privilegeRecyclerODiamondView.m10434k0(((Boolean) pair.getFirst()).booleanValue());
        int iG = vwb.G(privilegeRecyclerODiamondView.contentItems, new w9j() { // from class: l.r790
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m10429g0((dv80) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iG >= 0) {
                privilegeRecyclerODiamondView.contentItems.remove(iG);
                qu80 qu80Var = privilegeRecyclerODiamondView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iG);
                    return;
                }
                return;
            }
            return;
        }
        if (iG < 0) {
            VipFrag vipFrag2 = privilegeRecyclerODiamondView.frag;
            if (vipFrag2 == null) {
                Intrinsics.r("frag");
                vipFrag2 = null;
            }
            j5b0 j5b0VarM10911Q4 = vipFrag2.m10911Q4(privilegeRecyclerODiamondView.purchaseType);
            if (j5b0VarM10911Q4 != null) {
                VipFrag vipFrag3 = privilegeRecyclerODiamondView.frag;
                if (vipFrag3 == null) {
                    Intrinsics.r("frag");
                    vipFrag3 = null;
                }
                j5b0VarM10911Q4.m7353P(vipFrag3.m10912R4());
            }
            PurchaseType purchaseType = privilegeRecyclerODiamondView.purchaseType;
            VipFrag vipFrag4 = privilegeRecyclerODiamondView.frag;
            if (vipFrag4 == null) {
                Intrinsics.r("frag");
                vipFrag4 = null;
            }
            privilegeRecyclerODiamondView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C0434a(purchaseType, null, vipFrag4.m10912R4(), j5b0VarM10911Q4));
            qu80 qu80Var2 = privilegeRecyclerODiamondView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static Boolean m10426c0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    private final void m10427d0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM10910P4 = frag.m10910P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM10910P4.m10374f(purchaseType, wek0.a, frag.m10911Q4(purchaseType));
        privilegePaymentViewM10910P4.setOnNoPrivilegeClick(new d30() { // from class: l.l790
            public final void call() {
                PrivilegeRecyclerODiamondView.m10420W(frag, this);
            }
        });
        privilegePaymentViewM10910P4.setOnPayTypeSelect(new e30() { // from class: l.m790
            public final void call(Object obj) {
                PrivilegeRecyclerODiamondView.m10417T(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM10910P4.m10372d();
        privilegePaymentViewM10910P4.m10373e();
        privilegePaymentViewM10910P4.m10376h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    private final void m10428e0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m10434k0(xma.m27351F3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Boolean m10429g0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C0434a);
    }

    private final C0439a getAdvancedFilterItem() {
        wx80 wx80VarL = fy80.l(Privilege.advanced_filter);
        C0439a c0439a = new C0439a((sab0.i(this.purchaseType) && g6a.m15592o()) ? x2c0.f26271Sh : x2c0.f26335Uj, wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString(), "advancing");
        c0439a.m10804f(new C0439a.a() { // from class: l.t790
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                PrivilegeRecyclerODiamondView.m10419V(this.f21927a, view);
            }
        });
        return c0439a;
    }

    private final PrivilegeDescListDiamondServiceItem.C0422a getCustomerServiceItem() {
        wx80 wx80VarL = fy80.l(Privilege.customer_service);
        return new PrivilegeDescListDiamondServiceItem.C0422a(wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString(), this.purchaseType);
    }

    private final PrivilegeDescListDiamondSkinItem.C0423a getDiamondSkinItem() {
        wx80 wx80VarL = fy80.l(Privilege.oDiamondSvipSkin);
        return new PrivilegeDescListDiamondSkinItem.C0423a(wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString());
    }

    private final C0439a getPrivacyItem() {
        wx80 wx80VarL = fy80.l(Privilege.privacy_membership);
        C0439a c0439a = new C0439a((sab0.i(this.purchaseType) && g6a.m15592o()) ? x2c0.f26395Wh : x2c0.f27159uk, wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString(), "privacy");
        c0439a.m10804f(new C0439a.a() { // from class: l.u790
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                PrivilegeRecyclerODiamondView.m10402E(this.f23385a, view);
            }
        });
        return c0439a;
    }

    private final PrivilegeDescListSeeItem.C0432a getSeeItem() {
        PrivilegeDescListSeeItem.C0432a c0432a = new PrivilegeDescListSeeItem.C0432a();
        c0432a.m10713b(new PrivilegeDescListSeeItem.C0432a.a() { // from class: l.n790
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C0432a.a
            /* JADX INFO: renamed from: a */
            public final void mo10714a(View view) {
                PrivilegeRecyclerODiamondView.m10418U(this.f17523a, view);
            }
        });
        return c0432a;
    }

    private final PrivilegeDescListVisitorItem.C0437a getVisitorItem() {
        PrivilegeDescListVisitorItem.C0437a c0437a = new PrivilegeDescListVisitorItem.C0437a();
        c0437a.m10787b(new PrivilegeDescListVisitorItem.C0437a.a() { // from class: l.c790
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListVisitorItem.C0437a.a
            /* JADX INFO: renamed from: a */
            public final void mo10788a(View view) {
                PrivilegeRecyclerODiamondView.m10407J(this.f9473a, view);
            }
        });
        return c0437a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Boolean m10430h0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListPrivateCustomExtraItem.C0430b);
    }

    /* JADX INFO: renamed from: i0 */
    public static final Boolean m10431i0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C0434a);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m10432j0(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView) {
        qu80 qu80Var = privilegeRecyclerODiamondView.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.notifyDataSetChanged();
        }
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: c */
    public void mo10399c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m10433f0() {
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
        c<UserPrivilege> cVarM27419u3 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.v790
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerODiamondView.m10422Y((UserPrivilege) obj);
            }
        };
        c cVarDistinctUntilChanged = cVarM27419u3.map(new w9j() { // from class: l.w790
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m10403F(function1, obj);
            }
        }).distinctUntilChanged();
        c<List<Merchandise>> cVarM2572y5 = CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("oDiamond"));
        final Function1 function2 = new Function1() { // from class: l.x790
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerODiamondView.m10424a0((List) obj);
            }
        };
        c cVarDistinctUntilChanged2 = cVarM2572y5.filter(new w9j() { // from class: l.y790
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m10409L(function2, obj);
            }
        }).distinctUntilChanged();
        final Function2 function3 = new Function2() { // from class: l.z790
            public final Object invoke(Object obj, Object obj2) {
                return PrivilegeRecyclerODiamondView.m10414Q(((Boolean) obj).booleanValue(), (List) obj2);
            }
        };
        fb3Var.n(mcrVar2, c.combineLatest(cVarDistinctUntilChanged, cVarDistinctUntilChanged2, new x9j() { // from class: l.a890
            public final Object call(Object obj, Object obj2) {
                return PrivilegeRecyclerODiamondView.m10421X(function3, obj, obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.d790
            public final void call(Object obj) {
                PrivilegeRecyclerODiamondView.m10425b0(this.f10049a, (Pair) obj);
            }
        }));
        if (CoreModule.f1534c.f3690y2.m19347E3()) {
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
            c cVarN = fb3Var2.n(mcrVar, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("privateCustom")));
            final Function1 function4 = new Function1() { // from class: l.e790
                public final Object invoke(Object obj) {
                    return PrivilegeRecyclerODiamondView.m10423Z((UserPrivilege) obj);
                }
            };
            cVarN.map(new w9j() { // from class: l.f790
                public final Object call(Object obj) {
                    return PrivilegeRecyclerODiamondView.m10426c0(function4, obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.g790
                public final void call(Object obj) {
                    PrivilegeRecyclerODiamondView.m10406I(this.f13100a, (Boolean) obj);
                }
            }));
        }
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: k */
    public void mo10400k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m10427d0(frag);
        m10428e0(frag);
        m10433f0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m10434k0(boolean hasODiamond) {
        PrivilegeDescListPrivateCustomExtraItem.C0430b c0430b;
        this.contentItems.clear();
        if (CoreModule.f1534c.f3690y2.m19347E3() && (c0430b = this.privateCustomExtraItemData) != null) {
            this.contentItems.add(c0430b);
        }
        this.contentItems.add(new PrivilegeDescListTitle.C0435a("黑金会员特权", "查看全部", new PrivilegeDescListTitle.C0435a.a() { // from class: l.h790
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle.C0435a.a
            /* JADX INFO: renamed from: a */
            public final void mo10758a(View view) {
                PrivilegeRecyclerODiamondView.m10412O(this.f13730a, view);
            }
        }, 0, null, this.purchaseType));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C0424a c0424aM17027a = it80.m17027a(it.next(), PurchaseType.TYPE_O_DIAMOND);
            c0424aM17027a.m10603g(new PrivilegeDescListItem.C0424a.a() { // from class: l.i790
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem.C0424a.a
                /* JADX INFO: renamed from: a */
                public final void mo10398a(View view, Privilege privilege) {
                    PrivilegeRecyclerODiamondView.m10413P(this.f14275a, view, privilege);
                }
            });
            this.contentItems.add(c0424aM17027a);
        }
        if (CoreModule.m1853N().Vo()) {
            PrivilegeDescListItem.C0424a c0424aM17027a2 = it80.m17027a(Privilege.moment_boost, PurchaseType.TYPE_O_DIAMOND);
            c0424aM17027a2.m10603g(new PrivilegeDescListItem.C0424a.a() { // from class: l.j790
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem.C0424a.a
                /* JADX INFO: renamed from: a */
                public final void mo10398a(View view, Privilege privilege) {
                    PrivilegeRecyclerODiamondView.m10411N(this.f15047a, view, privilege);
                }
            });
            this.contentItems.add(c0424aM17027a2);
        }
        if (hasODiamond) {
            this.contentItems.add(new PrivilegeDescListTitle.C0435a("黑金会员尊享", "", null, 0, null, this.purchaseType));
            this.contentItems.add(getDiamondSkinItem());
            this.contentItems.add(getCustomerServiceItem());
            this.contentItems.add(getVisitorItem());
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C0435a c0435a = new PrivilegeDescListTitle.C0435a("黑金会员尊享", "", null, 0, null, this.purchaseType);
            arrayList.add(getDiamondSkinItem());
            arrayList.add(getCustomerServiceItem());
            arrayList.add(getVisitorItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C0427a(c0435a, "升级黑金会员，解锁更多特权", false, arrayList, new PrivilegeDescListNoSVipItem.C0427a.a() { // from class: l.k790
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C0427a.a
                /* JADX INFO: renamed from: a */
                public final void mo10645a(View view) {
                    PrivilegeRecyclerODiamondView.m10404G(this.f15643a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m22424J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m10435l0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        C0444a c0444a = new C0444a(vipFrag);
        c0444a.m10904p(this.purchaseType, new C0444a.f() { // from class: l.s790
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a.f
            /* JADX INFO: renamed from: a */
            public final void mo10908a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerODiamondView.m10416S(this.f21127a, privilege, purchaseType, privilege2);
            }
        });
        if (privilege != null) {
            c0444a.m10903o(privilege);
        }
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
        this.isShowing = true;
    }

    public final void setShowing(boolean z) {
        this.isShowing = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PrivilegeRecyclerODiamondView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PrivilegeRecyclerODiamondView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
