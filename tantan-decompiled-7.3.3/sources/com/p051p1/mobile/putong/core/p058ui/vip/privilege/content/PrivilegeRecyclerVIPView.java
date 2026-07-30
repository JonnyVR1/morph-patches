package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.content.Context;
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
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerVIPView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p153l.bkj0;
import p153l.cok0;
import p153l.h390;
import p153l.j690;
import p153l.joa;
import p153l.jyb;
import p153l.m190;
import p153l.ndb0;
import p153l.o290;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.rj90;
import p153l.u290;
import p153l.ub3;
import p153l.uqb0;
import p153l.v5b0;
import p153l.vcj;
import p153l.x20;
import p153l.xzc0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ!\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0014¢\u0006\u0004\b&\u0010\u001aJ\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u001aJ\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010?\u001a\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010BR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerVIPView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/o290;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListItem$a$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "d0", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "e0", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "c0", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "showSVIP", "h0", "(Z)V", "i0", "()V", "Ll/ub3;", "pageAdapter", "k", "(Ll/ub3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "f0", "Landroid/view/View;", OMSTemplateModeType.view, "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/Privilege;)V", "onDetachedFromWindow", "", "selectCouponId", "setSelectCouponId", "(Ljava/lang/String;)V", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/ub3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/u290;", "h", "Ll/u290;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/h390;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "j", "Ljava/lang/String;", "Z", "isShowing", "", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/List;", "privileges", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegeRecyclerVIPView extends PrivilegeRecycleView implements o290, PrivilegeDescListItem.C9151a.a {

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
    public PrivilegeRecyclerVIPView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_GET_VIP;
        this.contentItems = new ArrayList<>();
        this.privileges = CollectionsKt.mutableListOf(Privilege.vip_unlimited_likes, Privilege.online_match_tickets, Privilege.boost, Privilege.vip_super_like, Privilege.liked_user);
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: E */
    public static pf60 m58225E(boolean z, boolean z2) {
        return new pf60(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m58227G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m58228H(User user) {
        user.getClass();
        return Boolean.valueOf(user.isVIP());
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m58229I(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m58230J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m58231K(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static void m58232L(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, View view) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58615X4(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, null, cok0.f82895a);
        rj90.m181699i();
    }

    /* JADX INFO: renamed from: M */
    public static void m58233M(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m58613V4();
    }

    /* JADX INFO: renamed from: N */
    public static Boolean m58234N(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(v5b0.m199798x(merchandise));
    }

    /* JADX INFO: renamed from: O */
    public static Boolean m58235O(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: P */
    public static bkj0 m58236P(boolean z, boolean z2, List list, pf60 pf60Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        pf60Var.getClass();
        return bkj0.m104818a(Boolean.valueOf(z), Boolean.valueOf(z2), list);
    }

    /* JADX INFO: renamed from: Q */
    public static Boolean m58237Q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R */
    public static Boolean m58238R(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146361M3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static void m58239S(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, bkj0 bkj0Var) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58607P4(privilegeRecyclerVIPView.purchaseType).m58088h();
        privilegeRecyclerVIPView.m58252h0(((Boolean) bkj0Var.f77081a).booleanValue() && !((Boolean) bkj0Var.f77082b).booleanValue());
        int iM147476G = jyb.m147476G(privilegeRecyclerVIPView.contentItems, new qcj() { // from class: l.qi90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58251g0((h390) obj);
            }
        });
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            if (iM147476G >= 0) {
                privilegeRecyclerVIPView.contentItems.remove(iM147476G);
                u290 u290Var = privilegeRecyclerVIPView.recyclerAdapter;
                if (u290Var != null) {
                    u290Var.notifyItemRemoved(iM147476G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM147476G < 0) {
            C c = bkj0Var.f77083c;
            c.getClass();
            Merchandise merchandiseM58253c0 = privilegeRecyclerVIPView.m58253c0((List) c);
            VipFrag vipFrag3 = privilegeRecyclerVIPView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m88391r("frag");
                vipFrag3 = null;
            }
            ndb0 ndb0VarM58608Q4 = vipFrag3.m58608Q4(privilegeRecyclerVIPView.purchaseType);
            if (ndb0VarM58608Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerVIPView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.m88391r("frag");
                    vipFrag4 = null;
                }
                ndb0VarM58608Q4.m55201P(vipFrag4.m58609R4());
            }
            PurchaseType purchaseType = privilegeRecyclerVIPView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerVIPView.frag;
            if (vipFrag5 == null) {
                Intrinsics.m88391r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            PrivilegeDescListShowcaseItem.C9161a c9161a = new PrivilegeDescListShowcaseItem.C9161a(purchaseType, merchandiseM58253c0, vipFrag2.m58609R4(), ndb0VarM58608Q4);
            if (ndb0VarM58608Q4 != null) {
                ndb0VarM58608Q4.m55202Q(privilegeRecyclerVIPView.selectCouponId);
            }
            privilegeRecyclerVIPView.contentItems.add(0, c9161a);
            u290 u290Var2 = privilegeRecyclerVIPView.recyclerAdapter;
            if (u290Var2 != null) {
                u290Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m58240T(User user) {
        user.getClass();
        return Boolean.valueOf(user.isVIP());
    }

    /* JADX INFO: renamed from: U */
    public static Boolean m58241U(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, pf60 pf60Var) {
        return Boolean.valueOf(privilegeRecyclerVIPView.isShowing);
    }

    /* JADX INFO: renamed from: V */
    public static pf60 m58242V(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: W */
    public static bkj0 m58243W(Function6 function6, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return (bkj0) function6.invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX INFO: renamed from: X */
    public static Boolean m58244X(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146361M3());
    }

    /* JADX INFO: renamed from: Y */
    public static void m58245Y(VipFrag vipFrag, PrivilegeRecyclerVIPView privilegeRecyclerVIPView) {
        vipFrag.m58615X4(privilegeRecyclerVIPView.purchaseType, null, "p_privilege,default");
    }

    /* JADX INFO: renamed from: Z */
    public static void m58246Z(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerVIPView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58606O4(purchaseType, privilege, cok0.f82895a);
    }

    /* JADX INFO: renamed from: a0 */
    public static Boolean m58247a0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m58248b0(PrivilegeRecyclerVIPView privilegeRecyclerVIPView, pf60 pf60Var) {
        privilegeRecyclerVIPView.m58255i0();
    }

    /* JADX INFO: renamed from: d0 */
    private final void m58249d0(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM58607P4 = frag.m58607P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM58607P4.m58086f(purchaseType, cok0.f82895a, frag.m58608Q4(purchaseType));
        privilegePaymentViewM58607P4.setOnNoPrivilegeClick(new x20() { // from class: l.ni90
            @Override // p153l.x20
            public final void call() {
                PrivilegeRecyclerVIPView.m58245Y(frag, this);
            }
        });
        privilegePaymentViewM58607P4.setOnPayTypeSelect(new y20() { // from class: l.pi90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m58233M(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM58607P4.m58084d();
        privilegePaymentViewM58607P4.m58085e();
        privilegePaymentViewM58607P4.m58088h();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m58250e0(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        u290 u290Var = new u290(frag, null, this, this.purchaseType);
        this.recyclerAdapter = u290Var;
        setAdapter(u290Var);
        m58252h0(CoreModule.f18264c.f20381e0.m116593na().isVIP() && !joa.m146361M3());
    }

    /* JADX INFO: renamed from: g0 */
    public static final Boolean m58251g0(h390 h390Var) {
        h390Var.getClass();
        return Boolean.valueOf(h390Var instanceof PrivilegeDescListShowcaseItem.C9161a);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m58252h0(boolean showSVIP) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C9162a(getResources().getString(R$string.f19444lt), "", null));
        Iterator<Privilege> it = j690.m143633y().iterator();
        it.getClass();
        while (it.hasNext()) {
            PrivilegeDescListItem.C9151a c9151aM156630a = m190.m156630a(it.next(), this.purchaseType);
            c9151aM156630a.m58315g(this);
            this.contentItems.add(c9151aM156630a);
        }
        if (showSVIP) {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C9162a c9162a = new PrivilegeDescListTitle.C9162a("SVIP" + getContext().getString(R$string.f19542p3), "", null);
            Iterator<Privilege> it2 = this.privileges.iterator();
            while (it2.hasNext()) {
                PrivilegeDescListItem.C9151a c9151aM156630a2 = m190.m156630a(it2.next(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
                c9151aM156630a2.getClass();
                arrayList.add(c9151aM156630a2);
            }
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C9154a(c9162a, getResources().getString(R$string.f18928V1), true, arrayList, new PrivilegeDescListNoSVipItem.C9154a.a() { // from class: l.mi90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C9154a.a
                /* JADX INFO: renamed from: a */
                public final void mo58354a(View view) {
                    PrivilegeRecyclerVIPView.m58232L(this.f136939a, view);
                }
            }));
        }
        u290 u290Var = this.recyclerAdapter;
        if (u290Var != null) {
            u290Var.m194253J(this.contentItems);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem.C9151a.a
    /* JADX INFO: renamed from: a */
    public void mo58110a(@NotNull View view, @Nullable final Privilege privilege) {
        view.getClass();
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        C9171a c9171a = new C9171a(vipFrag);
        c9171a.m58604p(this.purchaseType, new C9171a.f() { // from class: l.si90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a.f
            /* JADX INFO: renamed from: a */
            public final void mo58605a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerVIPView.m58246Z(this.f168808a, privilege, purchaseType, privilege2);
            }
        });
        c9171a.m58603o(privilege);
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: c */
    public void mo58111c() {
        this.isShowing = false;
    }

    /* JADX INFO: renamed from: c0 */
    public final Merchandise m58253c0(List<? extends Merchandise> merchandises) {
        return (Merchandise) jyb.m147529r(merchandises, new qcj() { // from class: l.ri90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58234N((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m58254f0() {
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
        C22421c<User> c22421cM116596o9 = CoreModule.f18264c.f20381e0.m116596o9();
        final Function1 function1 = new Function1() { // from class: l.di90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m58228H((User) obj);
            }
        };
        C22421c<R> map = c22421cM116596o9.map(new qcj() { // from class: l.aj90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58237Q(function1, obj);
            }
        });
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"));
        final Function1 function2 = new Function1() { // from class: l.ei90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m58244X((UserPrivilege) obj);
            }
        };
        C22421c<R> map2 = c22421cM146424v3.map(new qcj() { // from class: l.fi90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58247a0(function2, obj);
            }
        });
        final Function2 function3 = new Function2() { // from class: l.gi90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PrivilegeRecyclerVIPView.m58225E(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        C22421c c22421cSkip = ub3Var.m153557n(vipFrag2, psd0.m173625r(map, map2, new rcj() { // from class: l.hi90
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return PrivilegeRecyclerVIPView.m58242V(function3, obj, obj2);
            }
        })).distinctUntilChanged().skip(1);
        final Function1 function4 = new Function1() { // from class: l.ii90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m58241U(this.f115061a, (pf60) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.ji90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58231K(function4, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ki90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m58248b0(this.f126974a, (pf60) obj);
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
        C22421c<User> c22421cM116596o10 = CoreModule.f18264c.f20381e0.m116596o9();
        final Function1 function5 = new Function1() { // from class: l.li90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m58240T((User) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cM116596o10.map(new qcj() { // from class: l.oi90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58229I(function5, obj);
            }
        }).distinctUntilChanged();
        C22421c<UserPrivilege> c22421cM146424v4 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"));
        final Function1 function6 = new Function1() { // from class: l.ti90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m58238R((UserPrivilege) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged2 = c22421cM146424v4.map(new qcj() { // from class: l.ui90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58227G(function6, obj);
            }
        }).distinctUntilChanged();
        C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttVip));
        final Function1 function7 = new Function1() { // from class: l.vi90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerVIPView.m58235O((List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cDistinctUntilChanged3 = c22421cM31647y5.filter(new qcj() { // from class: l.wi90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerVIPView.m58230J(function7, obj);
            }
        }).distinctUntilChanged();
        C22421c<pf60<OrderInfo, ContractInfo>> c22421cDistinctUntilChanged4 = xzc0.m213720r().m213735P().distinctUntilChanged();
        C22421c<CoreAutoPay.AutoPayStatus> c22421cDistinctUntilChanged5 = CoreModule.f18264c.f20333O0.m31076m3().distinctUntilChanged();
        C22421c<ArrayList<Contract>> c22421cDistinctUntilChanged6 = uqb0.f180388T.m30581S().distinctUntilChanged();
        final Function6 function8 = new Function6() { // from class: l.xi90
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PrivilegeRecyclerVIPView.m58236P(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (List) obj3, (pf60) obj4, (CoreAutoPay.AutoPayStatus) obj5, (ArrayList) obj6);
            }
        };
        ub3Var2.m153557n(vipFrag, C22421c.combineLatest(c22421cDistinctUntilChanged, c22421cDistinctUntilChanged2, c22421cDistinctUntilChanged3, c22421cDistinctUntilChanged4, c22421cDistinctUntilChanged5, c22421cDistinctUntilChanged6, new vcj() { // from class: l.yi90
            @Override // p153l.vcj
            /* JADX INFO: renamed from: a */
            public final Object mo103927a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PrivilegeRecyclerVIPView.m58243W(function8, obj, obj2, obj3, obj4, obj5, obj6);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.zi90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerVIPView.m58239S(this.f204498a, (bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m58255i0() {
        if (!CoreModule.f18264c.f20381e0.m116593na().isVIP() || joa.m146361M3()) {
            return;
        }
        rj90.m181700j();
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: k */
    public void mo58112k(@NotNull ub3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        m58249d0(frag);
        m58250e0(frag);
        m58254f0();
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
        m58255i0();
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
