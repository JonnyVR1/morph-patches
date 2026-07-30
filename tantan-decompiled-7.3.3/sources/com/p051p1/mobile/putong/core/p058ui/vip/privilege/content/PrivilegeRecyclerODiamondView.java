package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerODiamondView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.core.p058ui.visitor.MomentVisitorsAct;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p153l.a690;
import p153l.cok0;
import p153l.dbc0;
import p153l.h390;
import p153l.i4g0;
import p153l.j690;
import p153l.joa;
import p153l.jyb;
import p153l.jz20;
import p153l.m190;
import p153l.ndb0;
import p153l.o290;
import p153l.psd0;
import p153l.qcj;
import p153l.rbb0;
import p153l.rcj;
import p153l.rj90;
import p153l.s7a;
import p153l.u290;
import p153l.ub3;
import p153l.wib0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0014¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010,J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010,R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020#0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010HR\"\u0010L\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u0012¨\u0006O"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerODiamondView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/o290;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "d0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "e0", "", "hasODiamond", "k0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondSkinItem$a;", "getDiamondSkinItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondSkinItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondServiceItem$a;", "getCustomerServiceItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListDiamondServiceItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListVisitorItem$a;", "getVisitorItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListVisitorItem$a;", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "l0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Ll/ub3;", "pageAdapter", "k", "(Ll/ub3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "f0", "()V", "onDetachedFromWindow", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/ub3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/u290;", "h", "Ll/u290;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/h390;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListPrivateCustomExtraItem$b;", "j", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListPrivateCustomExtraItem$b;", "privateCustomExtraItemData", "", "Ljava/util/List;", "privileges", BLiveStormDanmakuGiftResourceType.f45292l, "Z", "isShowing", "()Z", "setShowing", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PrivilegeRecyclerODiamondView extends PrivilegeRecycleView implements o290 {

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
    public PrivilegeDescListPrivateCustomExtraItem.C9157b privateCustomExtraItemData;

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
    public static void m58114E(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        rj90.m181695e();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        jz20.m147635c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m58115F(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static void m58116G(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58615X4(privilegeRecyclerODiamondView.purchaseType, null, cok0.f82895a);
        rj90.m181697g();
    }

    /* JADX INFO: renamed from: I */
    public static void m58118I(final PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Boolean bool) {
        int iM147476G = jyb.m147476G(privilegeRecyclerODiamondView.contentItems, new qcj() { // from class: l.sf90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m58142h0((h390) obj);
            }
        });
        VipFrag vipFrag = null;
        if (bool.booleanValue()) {
            if (iM147476G >= 0) {
                privilegeRecyclerODiamondView.privateCustomExtraItemData = null;
                privilegeRecyclerODiamondView.contentItems.remove(iM147476G);
                u290 u290Var = privilegeRecyclerODiamondView.recyclerAdapter;
                if (u290Var != null) {
                    u290Var.notifyItemRemoved(iM147476G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM147476G < 0) {
            VipFrag vipFrag2 = privilegeRecyclerODiamondView.frag;
            if (vipFrag2 == null) {
                Intrinsics.m88391r("frag");
            } else {
                vipFrag = vipFrag2;
            }
            PrivilegeDescListPrivateCustomExtraItem.C9157b c9157b = new PrivilegeDescListPrivateCustomExtraItem.C9157b(privilegeRecyclerODiamondView.purchaseType, vipFrag.m58608Q4(privilegeRecyclerODiamondView.purchaseType));
            int iM147476G2 = jyb.m147476G(privilegeRecyclerODiamondView.contentItems, new qcj() { // from class: l.tf90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PrivilegeRecyclerODiamondView.m58143i0((h390) obj);
                }
            });
            int i = iM147476G2 >= 0 ? iM147476G2 + 1 : 0;
            privilegeRecyclerODiamondView.privateCustomExtraItemData = c9157b;
            privilegeRecyclerODiamondView.contentItems.add(i, c9157b);
            u290 u290Var2 = privilegeRecyclerODiamondView.recyclerAdapter;
            if (u290Var2 != null) {
                u290Var2.notifyItemRangeChanged(i, 1);
            }
            privilegeRecyclerODiamondView.post(new Runnable() { // from class: l.uf90
                @Override // java.lang.Runnable
                public final void run() {
                    PrivilegeRecyclerODiamondView.m58144j0(this.f178743a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m58119J(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        if (joa.m146357G3()) {
            VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
            VipFrag vipFrag2 = null;
            if (vipFrag == null) {
                Intrinsics.m88391r("frag");
                vipFrag = null;
            }
            i4g0.m138520r("e_privilege_odiamond_visitor_more", vipFrag.pageId());
            VipFrag vipFrag3 = privilegeRecyclerODiamondView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m88391r("frag");
                vipFrag3 = null;
            }
            Act act = vipFrag3.act();
            VipFrag vipFrag4 = privilegeRecyclerODiamondView.frag;
            if (vipFrag4 == null) {
                Intrinsics.m88391r("frag");
            } else {
                vipFrag2 = vipFrag4;
            }
            act.startActivity(MomentVisitorsAct.m58966X1(vipFrag2.act(), CoreModule.f18264c.f20410n2.m121466L3()));
        }
    }

    /* JADX INFO: renamed from: L */
    public static Boolean m58121L(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static void m58123N(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view, Privilege privilege) {
        privilegeRecyclerODiamondView.m58147l0(privilege);
    }

    /* JADX INFO: renamed from: O */
    public static void m58124O(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        privilegeRecyclerODiamondView.m58147l0(null);
    }

    /* JADX INFO: renamed from: P */
    public static void m58125P(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view, Privilege privilege) {
        privilegeRecyclerODiamondView.m58147l0(privilege);
    }

    /* JADX INFO: renamed from: Q */
    public static Pair m58126Q(boolean z, List list) {
        list.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: S */
    public static void m58128S(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        purchaseType.getClass();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58606O4(purchaseType, privilege, cok0.f82895a);
    }

    /* JADX INFO: renamed from: T */
    public static void m58129T(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m58613V4();
    }

    /* JADX INFO: renamed from: U */
    public static void m58130U(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        if (rbb0.m180746s(null, 1, null)) {
            return;
        }
        privilegeRecyclerODiamondView.getContext().startActivity(new Intent(privilegeRecyclerODiamondView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: V */
    public static void m58131V(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, View view) {
        rj90.m181692b();
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        jz20.m147635c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: W */
    public static void m58132W(VipFrag vipFrag, PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView) {
        vipFrag.m58615X4(privilegeRecyclerODiamondView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: X */
    public static Pair m58133X(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: Y */
    public static Boolean m58134Y(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146357G3());
    }

    /* JADX INFO: renamed from: Z */
    public static Boolean m58135Z(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146360J3());
    }

    /* JADX INFO: renamed from: a0 */
    public static Boolean m58136a0(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: b0 */
    public static void m58137b0(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerODiamondView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58607P4(privilegeRecyclerODiamondView.purchaseType).m58088h();
        privilegeRecyclerODiamondView.m58146k0(((Boolean) pair.getFirst()).booleanValue());
        int iM147476G = jyb.m147476G(privilegeRecyclerODiamondView.contentItems, new qcj() { // from class: l.vf90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m58141g0((h390) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iM147476G >= 0) {
                privilegeRecyclerODiamondView.contentItems.remove(iM147476G);
                u290 u290Var = privilegeRecyclerODiamondView.recyclerAdapter;
                if (u290Var != null) {
                    u290Var.notifyItemRemoved(iM147476G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM147476G < 0) {
            VipFrag vipFrag2 = privilegeRecyclerODiamondView.frag;
            if (vipFrag2 == null) {
                Intrinsics.m88391r("frag");
                vipFrag2 = null;
            }
            ndb0 ndb0VarM58608Q4 = vipFrag2.m58608Q4(privilegeRecyclerODiamondView.purchaseType);
            if (ndb0VarM58608Q4 != null) {
                VipFrag vipFrag3 = privilegeRecyclerODiamondView.frag;
                if (vipFrag3 == null) {
                    Intrinsics.m88391r("frag");
                    vipFrag3 = null;
                }
                ndb0VarM58608Q4.m55201P(vipFrag3.m58609R4());
            }
            PurchaseType purchaseType = privilegeRecyclerODiamondView.purchaseType;
            VipFrag vipFrag4 = privilegeRecyclerODiamondView.frag;
            if (vipFrag4 == null) {
                Intrinsics.m88391r("frag");
                vipFrag4 = null;
            }
            privilegeRecyclerODiamondView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C9161a(purchaseType, null, vipFrag4.m58609R4(), ndb0VarM58608Q4));
            u290 u290Var2 = privilegeRecyclerODiamondView.recyclerAdapter;
            if (u290Var2 != null) {
                u290Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static Boolean m58138c0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    private final void m58139d0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM58607P4 = frag.m58607P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM58607P4.m58086f(purchaseType, cok0.f82895a, frag.m58608Q4(purchaseType));
        privilegePaymentViewM58607P4.setOnNoPrivilegeClick(new x20() { // from class: l.pf90
            @Override // p153l.x20
            public final void call() {
                PrivilegeRecyclerODiamondView.m58132W(frag, this);
            }
        });
        privilegePaymentViewM58607P4.setOnPayTypeSelect(new y20() { // from class: l.qf90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerODiamondView.m58129T(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM58607P4.m58084d();
        privilegePaymentViewM58607P4.m58085e();
        privilegePaymentViewM58607P4.m58088h();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m58140e0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        u290 u290Var = new u290(frag, null, this, this.purchaseType);
        this.recyclerAdapter = u290Var;
        setAdapter(u290Var);
        m58146k0(joa.m146357G3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Boolean m58141g0(h390 h390Var) {
        h390Var.getClass();
        return Boolean.valueOf(h390Var instanceof PrivilegeDescListShowcaseItem.C9161a);
    }

    private final C9166a getAdvancedFilterItem() {
        a690 a690VarM143620l = j690.m143620l(Privilege.advanced_filter);
        C9166a c9166a = new C9166a((wib0.m206565i(this.purchaseType) && s7a.m184986o()) ? dbc0.f86187Gi : dbc0.f86253Ik, a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString(), "advancing");
        c9166a.m58504f(new C9166a.a() { // from class: l.xf90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                PrivilegeRecyclerODiamondView.m58131V(this.f194017a, view);
            }
        });
        return c9166a;
    }

    private final PrivilegeDescListDiamondServiceItem.C9149a getCustomerServiceItem() {
        a690 a690VarM143620l = j690.m143620l(Privilege.customer_service);
        return new PrivilegeDescListDiamondServiceItem.C9149a(a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString(), this.purchaseType);
    }

    private final PrivilegeDescListDiamondSkinItem.C9150a getDiamondSkinItem() {
        a690 a690VarM143620l = j690.m143620l(Privilege.oDiamondSvipSkin);
        return new PrivilegeDescListDiamondSkinItem.C9150a(a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString());
    }

    private final C9166a getPrivacyItem() {
        a690 a690VarM143620l = j690.m143620l(Privilege.privacy_membership);
        C9166a c9166a = new C9166a((wib0.m206565i(this.purchaseType) && s7a.m184986o()) ? dbc0.f86315Ki : dbc0.f87092il, a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString(), "privacy");
        c9166a.m58504f(new C9166a.a() { // from class: l.yf90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                PrivilegeRecyclerODiamondView.m58114E(this.f199456a, view);
            }
        });
        return c9166a;
    }

    private final PrivilegeDescListSeeItem.C9159a getSeeItem() {
        PrivilegeDescListSeeItem.C9159a c9159a = new PrivilegeDescListSeeItem.C9159a();
        c9159a.m58419b(new PrivilegeDescListSeeItem.C9159a.a() { // from class: l.rf90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C9159a.a
            /* JADX INFO: renamed from: a */
            public final void mo58420a(View view) {
                PrivilegeRecyclerODiamondView.m58130U(this.f162769a, view);
            }
        });
        return c9159a;
    }

    private final PrivilegeDescListVisitorItem.C9164a getVisitorItem() {
        PrivilegeDescListVisitorItem.C9164a c9164a = new PrivilegeDescListVisitorItem.C9164a();
        c9164a.m58490b(new PrivilegeDescListVisitorItem.C9164a.a() { // from class: l.gf90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListVisitorItem.C9164a.a
            /* JADX INFO: renamed from: a */
            public final void mo58491a(View view) {
                PrivilegeRecyclerODiamondView.m58119J(this.f103891a, view);
            }
        });
        return c9164a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Boolean m58142h0(h390 h390Var) {
        h390Var.getClass();
        return Boolean.valueOf(h390Var instanceof PrivilegeDescListPrivateCustomExtraItem.C9157b);
    }

    /* JADX INFO: renamed from: i0 */
    public static final Boolean m58143i0(h390 h390Var) {
        h390Var.getClass();
        return Boolean.valueOf(h390Var instanceof PrivilegeDescListShowcaseItem.C9161a);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m58144j0(PrivilegeRecyclerODiamondView privilegeRecyclerODiamondView) {
        u290 u290Var = privilegeRecyclerODiamondView.recyclerAdapter;
        if (u290Var != null) {
            u290Var.notifyDataSetChanged();
        }
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: c */
    public void mo58111c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m58145f0() {
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
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.zf90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerODiamondView.m58134Y((UserPrivilege) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cM146424v3.map(new qcj() { // from class: l.ag90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m58115F(function1, obj);
            }
        }).distinctUntilChanged();
        C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("oDiamond"));
        final Function1 function2 = new Function1() { // from class: l.bg90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerODiamondView.m58136a0((List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cDistinctUntilChanged2 = c22421cM31647y5.filter(new qcj() { // from class: l.cg90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerODiamondView.m58121L(function2, obj);
            }
        }).distinctUntilChanged();
        final Function2 function3 = new Function2() { // from class: l.dg90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PrivilegeRecyclerODiamondView.m58126Q(((Boolean) obj).booleanValue(), (List) obj2);
            }
        };
        ub3Var.m153557n(vipFrag2, C22421c.combineLatest(c22421cDistinctUntilChanged, c22421cDistinctUntilChanged2, new rcj() { // from class: l.eg90
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return PrivilegeRecyclerODiamondView.m58133X(function3, obj, obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.hf90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerODiamondView.m58137b0(this.f109264a, (Pair) obj);
            }
        }));
        if (CoreModule.f18264c.f20443y2.m216799E3()) {
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
            C22421c c22421cM153557n = ub3Var2.m153557n(vipFrag, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("privateCustom")));
            final Function1 function4 = new Function1() { // from class: l.if90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PrivilegeRecyclerODiamondView.m58135Z((UserPrivilege) obj);
                }
            };
            c22421cM153557n.map(new qcj() { // from class: l.jf90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PrivilegeRecyclerODiamondView.m58138c0(function4, obj);
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.kf90
                @Override // p153l.y20
                public final void call(Object obj) {
                    PrivilegeRecyclerODiamondView.m58118I(this.f126257a, (Boolean) obj);
                }
            }));
        }
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: k */
    public void mo58112k(@NotNull ub3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m58139d0(frag);
        m58140e0(frag);
        m58145f0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m58146k0(boolean hasODiamond) {
        PrivilegeDescListPrivateCustomExtraItem.C9157b c9157b;
        this.contentItems.clear();
        if (CoreModule.f18264c.f20443y2.m216799E3() && (c9157b = this.privateCustomExtraItemData) != null) {
            this.contentItems.add(c9157b);
        }
        this.contentItems.add(new PrivilegeDescListTitle.C9162a("黑金会员特权", "查看全部", new PrivilegeDescListTitle.C9162a.a() { // from class: l.lf90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle.C9162a.a
            /* JADX INFO: renamed from: a */
            public final void mo58461a(View view) {
                PrivilegeRecyclerODiamondView.m58124O(this.f131833a, view);
            }
        }, 0, null, this.purchaseType));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C9151a c9151aM156630a = m190.m156630a(it.next(), PurchaseType.TYPE_O_DIAMOND);
            c9151aM156630a.m58315g(new PrivilegeDescListItem.C9151a.a() { // from class: l.mf90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem.C9151a.a
                /* JADX INFO: renamed from: a */
                public final void mo58110a(View view, Privilege privilege) {
                    PrivilegeRecyclerODiamondView.m58125P(this.f136621a, view, privilege);
                }
            });
            this.contentItems.add(c9151aM156630a);
        }
        if (CoreModule.m30932N().mo61513Vo()) {
            PrivilegeDescListItem.C9151a c9151aM156630a2 = m190.m156630a(Privilege.moment_boost, PurchaseType.TYPE_O_DIAMOND);
            c9151aM156630a2.m58315g(new PrivilegeDescListItem.C9151a.a() { // from class: l.nf90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem.C9151a.a
                /* JADX INFO: renamed from: a */
                public final void mo58110a(View view, Privilege privilege) {
                    PrivilegeRecyclerODiamondView.m58123N(this.f141718a, view, privilege);
                }
            });
            this.contentItems.add(c9151aM156630a2);
        }
        if (hasODiamond) {
            this.contentItems.add(new PrivilegeDescListTitle.C9162a("黑金会员尊享", "", null, 0, null, this.purchaseType));
            this.contentItems.add(getDiamondSkinItem());
            this.contentItems.add(getCustomerServiceItem());
            this.contentItems.add(getVisitorItem());
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C9162a c9162a = new PrivilegeDescListTitle.C9162a("黑金会员尊享", "", null, 0, null, this.purchaseType);
            arrayList.add(getDiamondSkinItem());
            arrayList.add(getCustomerServiceItem());
            arrayList.add(getVisitorItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C9154a(c9162a, "升级黑金会员，解锁更多特权", false, arrayList, new PrivilegeDescListNoSVipItem.C9154a.a() { // from class: l.of90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C9154a.a
                /* JADX INFO: renamed from: a */
                public final void mo58354a(View view) {
                    PrivilegeRecyclerODiamondView.m58116G(this.f147057a, view);
                }
            }));
        }
        u290 u290Var = this.recyclerAdapter;
        if (u290Var != null) {
            u290Var.m194253J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m58147l0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        C9171a c9171a = new C9171a(vipFrag);
        c9171a.m58604p(this.purchaseType, new C9171a.f() { // from class: l.wf90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a.f
            /* JADX INFO: renamed from: a */
            public final void mo58605a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerODiamondView.m58128S(this.f188776a, privilege, purchaseType, privilege2);
            }
        });
        if (privilege != null) {
            c9171a.m58603o(privilege);
        }
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
