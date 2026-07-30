package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreAutoPay;
import com.p046p1.mobile.putong.core.data.ContractInfo;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.OrderInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerYouthVipView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p149l.aaj;
import p149l.d30;
import p149l.dv80;
import p149l.e30;
import p149l.fb3;
import p149l.g6a;
import p149l.it80;
import p149l.j5b0;
import p149l.j6f;
import p149l.j760;
import p149l.ku80;
import p149l.mkd0;
import p149l.qib0;
import p149l.qu80;
import p149l.src0;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.wek0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J!\u0010#\u001a\u0004\u0018\u00010!2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u0010;\u001a\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerYouthVipView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListItem$a$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "R", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", j6f.LATITUDE_SOUTH, j6f.GPS_MEASUREMENT_INTERRUPTED, "()V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", j6f.GPS_DIRECTION_TRUE, "Landroid/view/View;", OMSTemplateModeType.view, "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/Privilege;)V", "onDetachedFromWindow", "q", "c", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Q", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/j5b0;", "h", "Ll/j5b0;", "mediator", "Ll/qu80;", RXScreenCaptureService.KEY_INDEX, "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "contentItems", "", "Z", "isShowing", "", BLiveStormDanmakuGiftResourceType.f44444l, "[Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivilegeRecyclerYouthVipView extends PrivilegeRecycleView implements ku80, PrivilegeDescListItem.C8988a.a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VipFrag frag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public fb3 pagerAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public j5b0 mediator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public qu80 recyclerAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<dv80> contentItems;

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
        this.privileges = upa.m194676O() ? new Privilege[]{Privilege.youth_roaming, Privilege.youth_find_partner, Privilege.youth_blind_box, Privilege.youth_superlike} : new Privilege[]{Privilege.youth_roaming, Privilege.youth_find_partner, Privilege.youth_blind_box, Privilege.youth_superlike, Privilege.youth_message_read};
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: E */
    public static j760 m57073E(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (j760) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m57074F(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.noneRenewable() && merchandise.weekly());
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m57075G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m57076H(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210050O3());
    }

    /* JADX INFO: renamed from: J */
    public static j760 m57078J(boolean z, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return j760.m140076a(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: K */
    public static void m57079K(VipFrag vipFrag, PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView) {
        vipFrag.m57432X4(privilegeRecyclerYouthVipView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: L */
    public static Boolean m57080L(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static void m57081M(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m57430V4();
    }

    /* JADX INFO: renamed from: N */
    public static void m57082N(PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView, j760 j760Var) {
        VipFrag vipFrag = privilegeRecyclerYouthVipView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57424P4(privilegeRecyclerYouthVipView.purchaseType).m56905h();
        privilegeRecyclerYouthVipView.m57088V();
        int iM200293G = vwb.m200293G(privilegeRecyclerYouthVipView.contentItems, new w9j() { // from class: l.ib90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m57087U((dv80) obj);
            }
        });
        if (Intrinsics.m87488d(j760Var.f116564a, Boolean.TRUE)) {
            if (iM200293G >= 0) {
                privilegeRecyclerYouthVipView.contentItems.remove(iM200293G);
                qu80 qu80Var = privilegeRecyclerYouthVipView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iM200293G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM200293G < 0) {
            VipFrag vipFrag3 = privilegeRecyclerYouthVipView.frag;
            if (vipFrag3 == null) {
                Intrinsics.m87502r("frag");
                vipFrag3 = null;
            }
            j5b0 j5b0VarM57425Q4 = vipFrag3.m57425Q4(privilegeRecyclerYouthVipView.purchaseType);
            if (j5b0VarM57425Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerYouthVipView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.m87502r("frag");
                    vipFrag4 = null;
                }
                j5b0VarM57425Q4.m54018P(vipFrag4.m57426R4());
            }
            Merchandise merchandiseM57089Q = privilegeRecyclerYouthVipView.m57089Q((List) j760Var.f116565b);
            PurchaseType purchaseType = privilegeRecyclerYouthVipView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerYouthVipView.frag;
            if (vipFrag5 == null) {
                Intrinsics.m87502r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            privilegeRecyclerYouthVipView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C8998a(purchaseType, merchandiseM57089Q, vipFrag2.m57426R4(), j5b0VarM57425Q4));
            qu80 qu80Var2 = privilegeRecyclerYouthVipView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m57083O(PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerYouthVipView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57423O4(purchaseType, privilege, wek0.f185947a);
    }

    /* JADX INFO: renamed from: P */
    public static Boolean m57084P(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: R */
    private final void m57085R(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM57424P4 = frag.m57424P4(this.purchaseType);
        privilegePaymentViewM57424P4.m56903f(this.purchaseType, wek0.f185947a, this.mediator);
        privilegePaymentViewM57424P4.setOnNoPrivilegeClick(new d30() { // from class: l.gb90
            @Override // p149l.d30
            public final void call() {
                PrivilegeRecyclerYouthVipView.m57079K(frag, this);
            }
        });
        privilegePaymentViewM57424P4.setOnPayTypeSelect(new e30() { // from class: l.hb90
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerYouthVipView.m57081M(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM57424P4.m56901d();
        privilegePaymentViewM57424P4.m56902e();
        privilegePaymentViewM57424P4.m56905h();
    }

    /* JADX INFO: renamed from: S */
    private final void m57086S(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m57088V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final Boolean m57087U(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C8998a);
    }

    /* JADX INFO: renamed from: V */
    private final void m57088V() {
        this.contentItems.clear();
        VipFrag vipFrag = null;
        this.contentItems.add(new PrivilegeDescListTitle.C8999a("青春专享特权", "", null));
        for (Privilege privilege : this.privileges) {
            PrivilegeDescListItem.C8988a c8988aM138185a = it80.m138185a(privilege, this.purchaseType);
            c8988aM138185a.m57132g(this);
            this.contentItems.add(c8988aM138185a);
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m176580J(this.contentItems);
        }
        VipFrag vipFrag2 = this.frag;
        if (vipFrag2 == null) {
            Intrinsics.m87502r("frag");
        } else {
            vipFrag = vipFrag2;
        }
        vipFrag.m57431W4();
    }

    /* JADX INFO: renamed from: Q */
    public final Merchandise m57089Q(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty() || g6a.m124576y()) {
            return null;
        }
        return (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.ya90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m57074F((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m57090T() {
        fb3 fb3Var = this.pagerAdapter;
        VipFrag vipFrag = null;
        if (fb3Var == null) {
            Intrinsics.m87502r("pagerAdapter");
            fb3Var = null;
        }
        VipFrag vipFrag2 = this.frag;
        if (vipFrag2 == null) {
            Intrinsics.m87502r("frag");
        } else {
            vipFrag = vipFrag2;
        }
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("youthVip"));
        final Function1 function1 = new Function1() { // from class: l.xa90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerYouthVipView.m57076H((UserPrivilege) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cM210111u3.map(new w9j() { // from class: l.ab90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m57080L(function1, obj);
            }
        }).distinctUntilChanged();
        C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("youthVip"));
        final Function1 function2 = new Function1() { // from class: l.bb90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerYouthVipView.m57084P((List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cDistinctUntilChanged2 = c22306cM30644y5.filter(new w9j() { // from class: l.cb90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m57075G(function2, obj);
            }
        }).distinctUntilChanged();
        C22306c<j760<OrderInfo, ContractInfo>> c22306cDistinctUntilChanged3 = src0.m185656r().m185671P().distinctUntilChanged();
        C22306c<CoreAutoPay.AutoPayStatus> c22306cDistinctUntilChanged4 = CoreModule.f17545c.f19591O0.m30078m3().distinctUntilChanged();
        C22306c<ArrayList<Contract>> c22306cDistinctUntilChanged5 = qib0.f154705T.m29583S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.db90
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerYouthVipView.m57078J(((Boolean) obj).booleanValue(), (List) obj2, (j760) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        fb3Var.m115452n(vipFrag, C22306c.combineLatest(c22306cDistinctUntilChanged, c22306cDistinctUntilChanged2, c22306cDistinctUntilChanged3, c22306cDistinctUntilChanged4, c22306cDistinctUntilChanged5, new aaj() { // from class: l.eb90
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerYouthVipView.m57073E(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.fb90
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerYouthVipView.m57082N(this.f96701a, (j760) obj);
            }
        }));
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
        c9008a.m57421p(this.purchaseType, new C9008a.f() { // from class: l.za90
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a.f
            /* JADX INFO: renamed from: a */
            public final void mo57422a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerYouthVipView.m57083O(this.f202334a, privilege, purchaseType, privilege2);
            }
        });
        c9008a.m57420o(privilege);
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: c */
    public void mo56928c() {
        this.isShowing = false;
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: k */
    public void mo56929k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        this.mediator = frag.m57425Q4(this.purchaseType);
        m57085R(frag);
        m57086S(frag);
        m57090T();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57424P4(this.purchaseType).m56904g();
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54013K();
        }
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: q */
    public void mo56930q() {
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
