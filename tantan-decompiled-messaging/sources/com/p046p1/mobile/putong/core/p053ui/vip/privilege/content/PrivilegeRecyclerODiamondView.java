package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerODiamondView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.core.p053ui.visitor.MomentVisitorsAct;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.d30;
import p149l.dv80;
import p149l.e30;
import p149l.fb3;
import p149l.fy80;
import p149l.g6a;
import p149l.it80;
import p149l.j5b0;
import p149l.ku80;
import p149l.mkd0;
import p149l.n3b0;
import p149l.nb90;
import p149l.qu80;
import p149l.sab0;
import p149l.vwb;
import p149l.w9j;
import p149l.wek0;
import p149l.wx80;
import p149l.x2c0;
import p149l.x9j;
import p149l.xma;
import p149l.zq20;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0014¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010,J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010,R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020#0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010HR\"\u0010L\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u0012¨\u0006O"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerODiamondView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "d0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "e0", "", "hasODiamond", "k0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondSkinItem$a;", "getDiamondSkinItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondSkinItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondServiceItem$a;", "getCustomerServiceItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondServiceItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListVisitorItem$a;", "getVisitorItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListVisitorItem$a;", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "l0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "f0", "()V", "onDetachedFromWindow", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListPrivateCustomExtraItem$b;", "j", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListPrivateCustomExtraItem$b;", "privateCustomExtraItemData", "", "Ljava/util/List;", "privileges", BLiveStormDanmakuGiftResourceType.f44444l, "Z", "isShowing", "()Z", "setShowing", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public PrivilegeDescListPrivateCustomExtraItem.C8994b privateCustomExtraItemData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<Privilege> privileges;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isShowing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
    public static void m56931E(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        nb90.m158767e();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        zq20.m219838c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m56932F(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static void m56933G(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57432X4(privilegeRecyclerODiamondView.purchaseType, null, wek0.f185947a);
        nb90.m158769g();
    }

    /* JADX INFO: renamed from: I */
    public static void m56935I(final PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Boolean bool) {
        int iM200293G = vwb.m200293G(privilegeRecyclerODiamondView.contentItems, new w9j() { // from class: l.o790
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m56959h0((dv80) obj);
            }
        });
        VipFrag vipFrag = null;
        if (bool.booleanValue()) {
            if (iM200293G >= 0) {
                privilegeRecyclerODiamondView.privateCustomExtraItemData = null;
                privilegeRecyclerODiamondView.contentItems.remove(iM200293G);
                qu80 qu80Var = privilegeRecyclerODiamondView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iM200293G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM200293G < 0) {
            VipFrag vipFrag2 = privilegeRecyclerODiamondView.frag;
            if (vipFrag2 == null) {
                Intrinsics.m87502r("frag");
            } else {
                vipFrag = vipFrag2;
            }
            PrivilegeDescListPrivateCustomExtraItem.C8994b c8994b = new PrivilegeDescListPrivateCustomExtraItem.C8994b(privilegeRecyclerODiamondView.purchaseType, vipFrag.m57425Q4(privilegeRecyclerODiamondView.purchaseType));
            int iM200293G2 = vwb.m200293G(privilegeRecyclerODiamondView.contentItems, new w9j() { // from class: l.p790
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PrivilegeRecyclerODiamondView.m56960i0((dv80) obj);
                }
            });
            int i = iM200293G2 >= 0 ? iM200293G2 + 1 : 0;
            privilegeRecyclerODiamondView.privateCustomExtraItemData = c8994b;
            privilegeRecyclerODiamondView.contentItems.add(i, c8994b);
            qu80 qu80Var2 = privilegeRecyclerODiamondView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemRangeChanged(i, 1);
            }
            privilegeRecyclerODiamondView.post(new Runnable() { // from class: l.q790
                @Override // java.lang.Runnable
                public final void run() {
                    PrivilegeRecyclerODiamondView.m56961j0(this.f153022a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m56936J(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        if (xma.m210043F3()) {
            VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
            VipFrag vipFrag2 = null;
            if (vipFrag == null) {
                Intrinsics.m87502r("frag");
                vipFrag = null;
            }
            zvf0.m220396r("e_privilege_odiamond_visitor_more", vipFrag.pageId());
            VipFrag vipFrag3 = privilegeRecyclerODiamondView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m87502r("frag");
                vipFrag3 = null;
            }
            Act act = vipFrag3.act();
            VipFrag vipFrag4 = privilegeRecyclerODiamondView.frag;
            if (vipFrag4 == null) {
                Intrinsics.m87502r("frag");
            } else {
                vipFrag2 = vipFrag4;
            }
            act.startActivity(MomentVisitorsAct.m57783V1(vipFrag2.act(), CoreModule.f17545c.f19668n2.m175435L3()));
        }
    }

    /* JADX INFO: renamed from: L */
    public static Boolean m56938L(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static void m56940N(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view, Privilege privilege) {
        privilegeRecyclerODiamondView.m56964l0(privilege);
    }

    /* JADX INFO: renamed from: O */
    public static void m56941O(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        privilegeRecyclerODiamondView.m56964l0(null);
    }

    /* JADX INFO: renamed from: P */
    public static void m56942P(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view, Privilege privilege) {
        privilegeRecyclerODiamondView.m56964l0(privilege);
    }

    /* JADX INFO: renamed from: Q */
    public static Pair m56943Q(boolean z, List list) {
        list.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: S */
    public static void m56945S(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        purchaseType.getClass();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57423O4(purchaseType, privilege, wek0.f185947a);
    }

    /* JADX INFO: renamed from: T */
    public static void m56946T(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m57430V4();
    }

    /* JADX INFO: renamed from: U */
    public static void m56947U(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        if (n3b0.m157744s(null, 1, null)) {
            return;
        }
        privilegeRecyclerODiamondView.getContext().startActivity(new Intent(privilegeRecyclerODiamondView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: V */
    public static void m56948V(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        nb90.m158764b();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        zq20.m219838c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: W */
    public static void m56949W(VipFrag vipFrag, PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView) {
        vipFrag.m57432X4(privilegeRecyclerODiamondView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: X */
    public static Pair m56950X(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: Y */
    public static Boolean m56951Y(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210043F3());
    }

    /* JADX INFO: renamed from: Z */
    public static Boolean m56952Z(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210046I3());
    }

    /* JADX INFO: renamed from: a0 */
    public static Boolean m56953a0(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m56954b0(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57424P4(privilegeRecyclerODiamondView.purchaseType).m56905h();
        privilegeRecyclerODiamondView.m56963k0(((Boolean) pair.getFirst()).booleanValue());
        int iM200293G = vwb.m200293G(privilegeRecyclerODiamondView.contentItems, new w9j() { // from class: l.r790
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m56958g0((dv80) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iM200293G >= 0) {
                privilegeRecyclerODiamondView.contentItems.remove(iM200293G);
                qu80 qu80Var = privilegeRecyclerODiamondView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iM200293G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM200293G < 0) {
            VipFrag vipFrag2 = privilegeRecyclerODiamondView.frag;
            if (vipFrag2 == null) {
                Intrinsics.m87502r("frag");
                vipFrag2 = null;
            }
            j5b0 j5b0VarM57425Q4 = vipFrag2.m57425Q4(privilegeRecyclerODiamondView.purchaseType);
            if (j5b0VarM57425Q4 != null) {
                VipFrag vipFrag3 = privilegeRecyclerODiamondView.frag;
                if (vipFrag3 == null) {
                    Intrinsics.m87502r("frag");
                    vipFrag3 = null;
                }
                j5b0VarM57425Q4.m54018P(vipFrag3.m57426R4());
            }
            PurchaseType purchaseType = privilegeRecyclerODiamondView.purchaseType;
            VipFrag vipFrag4 = privilegeRecyclerODiamondView.frag;
            if (vipFrag4 == null) {
                Intrinsics.m87502r("frag");
                vipFrag4 = null;
            }
            privilegeRecyclerODiamondView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C8998a(purchaseType, null, vipFrag4.m57426R4(), j5b0VarM57425Q4));
            qu80 qu80Var2 = privilegeRecyclerODiamondView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static Boolean m56955c0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    private final void m56956d0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM57424P4 = frag.m57424P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM57424P4.m56903f(purchaseType, wek0.f185947a, frag.m57425Q4(purchaseType));
        privilegePaymentViewM57424P4.setOnNoPrivilegeClick(new d30() { // from class: l.l790
            @Override // p149l.d30
            public final void call() {
                PrivilegeRecyclerODiamondView.m56949W(frag, this);
            }
        });
        privilegePaymentViewM57424P4.setOnPayTypeSelect(new e30() { // from class: l.m790
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerODiamondView.m56946T(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM57424P4.m56901d();
        privilegePaymentViewM57424P4.m56902e();
        privilegePaymentViewM57424P4.m56905h();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m56957e0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m56963k0(xma.m210043F3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Boolean m56958g0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C8998a);
    }

    private final C9003a getAdvancedFilterItem() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.advanced_filter);
        C9003a c9003a = new C9003a((sab0.m182891i(this.purchaseType) && g6a.m124566o()) ? x2c0.f189735Sh : x2c0.f189799Uj, wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString(), "advancing");
        c9003a.m57321f(new C9003a.a() { // from class: l.t790
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                PrivilegeRecyclerODiamondView.m56948V(this.f168679a, view);
            }
        });
        return c9003a;
    }

    private final PrivilegeDescListDiamondServiceItem.C8986a getCustomerServiceItem() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.customer_service);
        return new PrivilegeDescListDiamondServiceItem.C8986a(wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString(), this.purchaseType);
    }

    private final PrivilegeDescListDiamondSkinItem.C8987a getDiamondSkinItem() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.oDiamondSvipSkin);
        return new PrivilegeDescListDiamondSkinItem.C8987a(wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString());
    }

    private final C9003a getPrivacyItem() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.privacy_membership);
        C9003a c9003a = new C9003a((sab0.m182891i(this.purchaseType) && g6a.m124566o()) ? x2c0.f189859Wh : x2c0.f190623uk, wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString(), "privacy");
        c9003a.m57321f(new C9003a.a() { // from class: l.u790
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                PrivilegeRecyclerODiamondView.m56931E(this.f174950a, view);
            }
        });
        return c9003a;
    }

    private final PrivilegeDescListSeeItem.C8996a getSeeItem() {
        PrivilegeDescListSeeItem.C8996a c8996a = new PrivilegeDescListSeeItem.C8996a();
        c8996a.m57236b(new PrivilegeDescListSeeItem.C8996a.a() { // from class: l.n790
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C8996a.a
            /* JADX INFO: renamed from: a */
            public final void mo57237a(View view) {
                PrivilegeRecyclerODiamondView.m56947U(this.f137491a, view);
            }
        });
        return c8996a;
    }

    private final PrivilegeDescListVisitorItem.C9001a getVisitorItem() {
        PrivilegeDescListVisitorItem.C9001a c9001a = new PrivilegeDescListVisitorItem.C9001a();
        c9001a.m57307b(new PrivilegeDescListVisitorItem.C9001a.a() { // from class: l.c790
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListVisitorItem.C9001a.a
            /* JADX INFO: renamed from: a */
            public final void mo57308a(View view) {
                PrivilegeRecyclerODiamondView.m56936J(this.f79601a, view);
            }
        });
        return c9001a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Boolean m56959h0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListPrivateCustomExtraItem.C8994b);
    }

    /* JADX INFO: renamed from: i0 */
    public static final Boolean m56960i0(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C8998a);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m56961j0(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView) {
        qu80 qu80Var = privilegeRecyclerODiamondView.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.notifyDataSetChanged();
        }
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: c */
    public void mo56928c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m56962f0() {
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
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.v790
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerODiamondView.m56951Y((UserPrivilege) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cM210111u3.map(new w9j() { // from class: l.w790
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m56932F(function1, obj);
            }
        }).distinctUntilChanged();
        C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("oDiamond"));
        final Function1 function2 = new Function1() { // from class: l.x790
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerODiamondView.m56953a0((List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cDistinctUntilChanged2 = c22306cM30644y5.filter(new w9j() { // from class: l.y790
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m56938L(function2, obj);
            }
        }).distinctUntilChanged();
        final Function2 function3 = new Function2() { // from class: l.z790
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PrivilegeRecyclerODiamondView.m56943Q(((Boolean) obj).booleanValue(), (List) obj2);
            }
        };
        fb3Var.m115452n(vipFrag2, C22306c.combineLatest(c22306cDistinctUntilChanged, c22306cDistinctUntilChanged2, new x9j() { // from class: l.a890
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return PrivilegeRecyclerODiamondView.m56950X(function3, obj, obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.d790
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerODiamondView.m56954b0(this.f84718a, (Pair) obj);
            }
        }));
        if (CoreModule.f17545c.f19701y2.m155330E3()) {
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
            C22306c c22306cM115452n = fb3Var2.m115452n(vipFrag, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("privateCustom")));
            final Function1 function4 = new Function1() { // from class: l.e790
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PrivilegeRecyclerODiamondView.m56952Z((UserPrivilege) obj);
                }
            };
            c22306cM115452n.map(new w9j() { // from class: l.f790
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PrivilegeRecyclerODiamondView.m56955c0(function4, obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.g790
                @Override // p149l.e30
                public final void call(Object obj) {
                    PrivilegeRecyclerODiamondView.m56935I(this.f101339a, (Boolean) obj);
                }
            }));
        }
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: k */
    public void mo56929k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m56956d0(frag);
        m56957e0(frag);
        m56962f0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m56963k0(boolean hasODiamond) {
        PrivilegeDescListPrivateCustomExtraItem.C8994b c8994b;
        this.contentItems.clear();
        if (CoreModule.f17545c.f19701y2.m155330E3() && (c8994b = this.privateCustomExtraItemData) != null) {
            this.contentItems.add(c8994b);
        }
        this.contentItems.add(new PrivilegeDescListTitle.C8999a("黑金会员特权", "查看全部", new PrivilegeDescListTitle.C8999a.a() { // from class: l.h790
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle.C8999a.a
            /* JADX INFO: renamed from: a */
            public final void mo57278a(View view) {
                PrivilegeRecyclerODiamondView.m56941O(this.f106206a, view);
            }
        }, 0, null, this.purchaseType));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C8988a c8988aM138185a = it80.m138185a(it.next(), PurchaseType.TYPE_O_DIAMOND);
            c8988aM138185a.m57132g(new PrivilegeDescListItem.C8988a.a() { // from class: l.i790
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem.C8988a.a
                /* JADX INFO: renamed from: a */
                public final void mo56927a(View view, Privilege privilege) {
                    PrivilegeRecyclerODiamondView.m56942P(this.f111841a, view, privilege);
                }
            });
            this.contentItems.add(c8988aM138185a);
        }
        if (CoreModule.m29934N().mo60329Vo()) {
            PrivilegeDescListItem.C8988a c8988aM138185a2 = it80.m138185a(Privilege.moment_boost, PurchaseType.TYPE_O_DIAMOND);
            c8988aM138185a2.m57132g(new PrivilegeDescListItem.C8988a.a() { // from class: l.j790
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem.C8988a.a
                /* JADX INFO: renamed from: a */
                public final void mo56927a(View view, Privilege privilege) {
                    PrivilegeRecyclerODiamondView.m56940N(this.f116575a, view, privilege);
                }
            });
            this.contentItems.add(c8988aM138185a2);
        }
        if (hasODiamond) {
            this.contentItems.add(new PrivilegeDescListTitle.C8999a("黑金会员尊享", "", null, 0, null, this.purchaseType));
            this.contentItems.add(getDiamondSkinItem());
            this.contentItems.add(getCustomerServiceItem());
            this.contentItems.add(getVisitorItem());
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C8999a c8999a = new PrivilegeDescListTitle.C8999a("黑金会员尊享", "", null, 0, null, this.purchaseType);
            arrayList.add(getDiamondSkinItem());
            arrayList.add(getCustomerServiceItem());
            arrayList.add(getVisitorItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C8991a(c8999a, "升级黑金会员，解锁更多特权", false, arrayList, new PrivilegeDescListNoSVipItem.C8991a.a() { // from class: l.k790
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C8991a.a
                /* JADX INFO: renamed from: a */
                public final void mo57171a(View view) {
                    PrivilegeRecyclerODiamondView.m56933G(this.f121559a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m176580J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m56964l0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        C9008a c9008a = new C9008a(vipFrag);
        c9008a.m57421p(this.purchaseType, new C9008a.f() { // from class: l.s790
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a.f
            /* JADX INFO: renamed from: a */
            public final void mo57422a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerODiamondView.m56945S(this.f162899a, privilege, purchaseType, privilege2);
            }
        });
        if (privilege != null) {
            c9008a.m57420o(privilege);
        }
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
        this.isShowing = true;
    }

    public final void setShowing(boolean z) {
        this.isShowing = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerODiamondView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegeRecyclerODiamondView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
