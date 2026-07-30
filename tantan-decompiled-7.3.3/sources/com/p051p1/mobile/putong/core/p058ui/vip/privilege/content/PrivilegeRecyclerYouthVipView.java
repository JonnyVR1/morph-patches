package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreAutoPay;
import com.p051p1.mobile.putong.core.data.ContractInfo;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.OrderInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerYouthVipView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.cok0;
import p153l.gra;
import p153l.h390;
import p153l.joa;
import p153l.jyb;
import p153l.m190;
import p153l.ndb0;
import p153l.o290;
import p153l.p7f;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.s7a;
import p153l.u290;
import p153l.ub3;
import p153l.ucj;
import p153l.uqb0;
import p153l.x20;
import p153l.xzc0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J!\u0010#\u001a\u0004\u0018\u00010!2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u0010;\u001a\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerYouthVipView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/o290;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListItem$a$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "R", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", p7f.LATITUDE_SOUTH, p7f.GPS_MEASUREMENT_INTERRUPTED, "()V", "Ll/ub3;", "pageAdapter", "k", "(Ll/ub3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", p7f.GPS_DIRECTION_TRUE, "Landroid/view/View;", OMSTemplateModeType.view, "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/Privilege;)V", "onDetachedFromWindow", "q", "c", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Q", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/ub3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/ndb0;", "h", "Ll/ndb0;", "mediator", "Ll/u290;", RXScreenCaptureService.KEY_INDEX, "Ll/u290;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/h390;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "contentItems", "", "Z", "isShowing", "", BLiveStormDanmakuGiftResourceType.f45292l, "[Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegeRecyclerYouthVipView extends PrivilegeRecycleView implements o290, PrivilegeDescListItem.C9151a.a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VipFrag frag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ub3 pagerAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public ndb0 mediator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public u290 recyclerAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<h390> contentItems;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isShowing;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public Privilege[] privileges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeRecyclerYouthVipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        this.contentItems = new ArrayList<>();
        this.privileges = gra.m131607O() ? new Privilege[]{Privilege.youth_roaming, Privilege.youth_find_partner, Privilege.youth_blind_box, Privilege.youth_superlike} : new Privilege[]{Privilege.youth_roaming, Privilege.youth_find_partner, Privilege.youth_blind_box, Privilege.youth_superlike, Privilege.youth_message_read};
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: E */
    public static pf60 m58256E(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (pf60) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m58257F(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.noneRenewable() && merchandise.weekly());
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m58258G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m58259H(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146364P3());
    }

    /* JADX INFO: renamed from: J */
    public static pf60 m58261J(boolean z, List list, pf60 pf60Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        pf60Var.getClass();
        return pf60.m172085a(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: K */
    public static void m58262K(VipFrag vipFrag, PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView) {
        vipFrag.m58615X4(privilegeRecyclerYouthVipView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: L */
    public static Boolean m58263L(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static void m58264M(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m58613V4();
    }

    /* JADX INFO: renamed from: N */
    public static void m58265N(PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView, pf60 pf60Var) {
        VipFrag vipFrag = privilegeRecyclerYouthVipView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58607P4(privilegeRecyclerYouthVipView.purchaseType).m58088h();
        privilegeRecyclerYouthVipView.m58271V();
        int iM147476G = jyb.m147476G(privilegeRecyclerYouthVipView.contentItems, new qcj() { // from class: l.mj90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m58270U((h390) obj);
            }
        });
        if (Intrinsics.m88377d(pf60Var.f152156a, Boolean.TRUE)) {
            if (iM147476G >= 0) {
                privilegeRecyclerYouthVipView.contentItems.remove(iM147476G);
                u290 u290Var = privilegeRecyclerYouthVipView.recyclerAdapter;
                if (u290Var != null) {
                    u290Var.notifyItemRemoved(iM147476G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM147476G < 0) {
            VipFrag vipFrag3 = privilegeRecyclerYouthVipView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m88391r("frag");
                vipFrag3 = null;
            }
            ndb0 ndb0VarM58608Q4 = vipFrag3.m58608Q4(privilegeRecyclerYouthVipView.purchaseType);
            if (ndb0VarM58608Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerYouthVipView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.m88391r("frag");
                    vipFrag4 = null;
                }
                ndb0VarM58608Q4.m55201P(vipFrag4.m58609R4());
            }
            Merchandise merchandiseM58272Q = privilegeRecyclerYouthVipView.m58272Q((List) pf60Var.f152157b);
            PurchaseType purchaseType = privilegeRecyclerYouthVipView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerYouthVipView.frag;
            if (vipFrag5 == null) {
                Intrinsics.m88391r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            privilegeRecyclerYouthVipView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C9161a(purchaseType, merchandiseM58272Q, vipFrag2.m58609R4(), ndb0VarM58608Q4));
            u290 u290Var2 = privilegeRecyclerYouthVipView.recyclerAdapter;
            if (u290Var2 != null) {
                u290Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m58266O(PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerYouthVipView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58606O4(purchaseType, privilege, cok0.f82895a);
    }

    /* JADX INFO: renamed from: P */
    public static Boolean m58267P(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: R */
    private final void m58268R(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM58607P4 = frag.m58607P4(this.purchaseType);
        privilegePaymentViewM58607P4.m58086f(this.purchaseType, cok0.f82895a, this.mediator);
        privilegePaymentViewM58607P4.setOnNoPrivilegeClick(new x20() { // from class: l.kj90
            @Override // p153l.x20
            public final void call() {
                PrivilegeRecyclerYouthVipView.m58262K(frag, this);
            }
        });
        privilegePaymentViewM58607P4.setOnPayTypeSelect(new y20() { // from class: l.lj90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerYouthVipView.m58264M(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM58607P4.m58084d();
        privilegePaymentViewM58607P4.m58085e();
        privilegePaymentViewM58607P4.m58088h();
    }

    /* JADX INFO: renamed from: S */
    private final void m58269S(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        u290 u290Var = new u290(frag, null, this, this.purchaseType);
        this.recyclerAdapter = u290Var;
        setAdapter(u290Var);
        m58271V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final Boolean m58270U(h390 h390Var) {
        h390Var.getClass();
        return Boolean.valueOf(h390Var instanceof PrivilegeDescListShowcaseItem.C9161a);
    }

    /* JADX INFO: renamed from: V */
    private final void m58271V() {
        this.contentItems.clear();
        VipFrag vipFrag = null;
        this.contentItems.add(new PrivilegeDescListTitle.C9162a("青春专享特权", "", null));
        for (Privilege privilege : this.privileges) {
            PrivilegeDescListItem.C9151a c9151aM156630a = m190.m156630a(privilege, this.purchaseType);
            c9151aM156630a.m58315g(this);
            this.contentItems.add(c9151aM156630a);
        }
        u290 u290Var = this.recyclerAdapter;
        if (u290Var != null) {
            u290Var.m194253J(this.contentItems);
        }
        VipFrag vipFrag2 = this.frag;
        if (vipFrag2 == null) {
            Intrinsics.m88391r("frag");
        } else {
            vipFrag = vipFrag2;
        }
        vipFrag.m58614W4();
    }

    /* JADX INFO: renamed from: Q */
    public final Merchandise m58272Q(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty() || s7a.m184996y()) {
            return null;
        }
        return (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.cj90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m58257F((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m58273T() {
        ub3 ub3Var = this.pagerAdapter;
        VipFrag vipFrag = null;
        if (ub3Var == null) {
            Intrinsics.m88391r("pagerAdapter");
            ub3Var = null;
        }
        VipFrag vipFrag2 = this.frag;
        if (vipFrag2 == null) {
            Intrinsics.m88391r("frag");
        } else {
            vipFrag = vipFrag2;
        }
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("youthVip"));
        final Function1 function1 = new Function1() { // from class: l.bj90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerYouthVipView.m58259H((UserPrivilege) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cM146424v3.map(new qcj() { // from class: l.ej90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m58263L(function1, obj);
            }
        }).distinctUntilChanged();
        C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("youthVip"));
        final Function1 function2 = new Function1() { // from class: l.fj90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerYouthVipView.m58267P((List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cDistinctUntilChanged2 = c22421cM31647y5.filter(new qcj() { // from class: l.gj90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m58258G(function2, obj);
            }
        }).distinctUntilChanged();
        C22421c<pf60<OrderInfo, ContractInfo>> c22421cDistinctUntilChanged3 = xzc0.m213720r().m213735P().distinctUntilChanged();
        C22421c<CoreAutoPay.AutoPayStatus> c22421cDistinctUntilChanged4 = CoreModule.f18264c.f20333O0.m31076m3().distinctUntilChanged();
        C22421c<ArrayList<Contract>> c22421cDistinctUntilChanged5 = uqb0.f180388T.m30581S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.hj90
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerYouthVipView.m58261J(((Boolean) obj).booleanValue(), (List) obj2, (pf60) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        ub3Var.m153557n(vipFrag, C22421c.combineLatest(c22421cDistinctUntilChanged, c22421cDistinctUntilChanged2, c22421cDistinctUntilChanged3, c22421cDistinctUntilChanged4, c22421cDistinctUntilChanged5, new ucj() { // from class: l.ij90
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerYouthVipView.m58256E(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.jj90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerYouthVipView.m58265N(this.f121155a, (pf60) obj);
            }
        }));
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
        c9171a.m58604p(this.purchaseType, new C9171a.f() { // from class: l.dj90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a.f
            /* JADX INFO: renamed from: a */
            public final void mo58605a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerYouthVipView.m58266O(this.f88822a, privilege, purchaseType, privilege2);
            }
        });
        c9171a.m58603o(privilege);
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: c */
    public void mo58111c() {
        this.isShowing = false;
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: k */
    public void mo58112k(@NotNull ub3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        this.mediator = frag.m58608Q4(this.purchaseType);
        m58268R(frag);
        m58269S(frag);
        m58273T();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58607P4(this.purchaseType).m58087g();
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55196K();
        }
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: q */
    public void mo58113q() {
        this.isShowing = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerYouthVipView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegeRecyclerYouthVipView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
