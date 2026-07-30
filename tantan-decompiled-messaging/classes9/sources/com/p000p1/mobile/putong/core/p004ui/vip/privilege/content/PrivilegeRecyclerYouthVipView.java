package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreAutoPay;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerYouthVipView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.aaj;
import l.d30;
import l.e30;
import l.j760;
import l.mcr;
import l.mkd0;
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
import p006l.qib0;
import p006l.qu80;
import p006l.src0;
import p006l.upa;
import p006l.xma;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J!\u0010#\u001a\u0004\u0018\u00010!2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u0010;\u001a\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerYouthVipView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListItem$a$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "R", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "S", "V", "()V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "T", "Landroid/view/View;", "view", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/Privilege;)V", "onDetachedFromWindow", "q", "c", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Q", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/j5b0;", "h", "Ll/j5b0;", "mediator", "Ll/qu80;", "i", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "contentItems", "", "Z", "isShowing", "", "l", "[Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivilegeRecyclerYouthVipView extends PrivilegeRecycleView implements ku80, PrivilegeDescListItem.C0424a.a {

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
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerYouthVipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        this.contentItems = new ArrayList<>();
        this.privileges = upa.m25374O() ? new Privilege[]{Privilege.youth_roaming, Privilege.youth_find_partner, Privilege.youth_blind_box, Privilege.youth_superlike} : new Privilege[]{Privilege.youth_roaming, Privilege.youth_find_partner, Privilege.youth_blind_box, Privilege.youth_superlike, Privilege.youth_message_read};
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: E */
    public static j760 m10544E(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (j760) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m10545F(Merchandise merchandise) {
        return Boolean.valueOf(merchandise.noneRenewable() && merchandise.weekly());
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m10546G(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m10547H(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27358O3());
    }

    /* JADX INFO: renamed from: J */
    public static j760 m10549J(boolean z, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return j760.a(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: K */
    public static void m10550K(VipFrag vipFrag, PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView) {
        vipFrag.m10918X4(privilegeRecyclerYouthVipView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: L */
    public static Boolean m10551L(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M */
    public static void m10552M(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m10916V4();
    }

    /* JADX INFO: renamed from: N */
    public static void m10553N(PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView, j760 j760Var) {
        VipFrag vipFrag = privilegeRecyclerYouthVipView.frag;
        VipFrag vipFrag2 = null;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10910P4(privilegeRecyclerYouthVipView.purchaseType).m10376h();
        privilegeRecyclerYouthVipView.m10559V();
        int iG = vwb.G(privilegeRecyclerYouthVipView.contentItems, new w9j() { // from class: l.ib90
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m10558U((dv80) obj);
            }
        });
        if (Intrinsics.d(j760Var.a, Boolean.TRUE)) {
            if (iG >= 0) {
                privilegeRecyclerYouthVipView.contentItems.remove(iG);
                qu80 qu80Var = privilegeRecyclerYouthVipView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iG);
                    return;
                }
                return;
            }
            return;
        }
        if (iG < 0) {
            VipFrag vipFrag3 = privilegeRecyclerYouthVipView.frag;
            if (vipFrag3 == null) {
                Intrinsics.r("frag");
                vipFrag3 = null;
            }
            j5b0 j5b0VarM10911Q4 = vipFrag3.m10911Q4(privilegeRecyclerYouthVipView.purchaseType);
            if (j5b0VarM10911Q4 != null) {
                VipFrag vipFrag4 = privilegeRecyclerYouthVipView.frag;
                if (vipFrag4 == null) {
                    Intrinsics.r("frag");
                    vipFrag4 = null;
                }
                j5b0VarM10911Q4.m7353P(vipFrag4.m10912R4());
            }
            Merchandise merchandiseM10560Q = privilegeRecyclerYouthVipView.m10560Q((List) j760Var.b);
            PurchaseType purchaseType = privilegeRecyclerYouthVipView.purchaseType;
            VipFrag vipFrag5 = privilegeRecyclerYouthVipView.frag;
            if (vipFrag5 == null) {
                Intrinsics.r("frag");
            } else {
                vipFrag2 = vipFrag5;
            }
            privilegeRecyclerYouthVipView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C0434a(purchaseType, merchandiseM10560Q, vipFrag2.m10912R4(), j5b0VarM10911Q4));
            qu80 qu80Var2 = privilegeRecyclerYouthVipView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m10554O(PrivilegeRecyclerYouthVipView privilegeRecyclerYouthVipView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerYouthVipView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10909O4(purchaseType, privilege, wek0.a);
    }

    /* JADX INFO: renamed from: P */
    public static Boolean m10555P(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: R */
    private final void m10556R(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM10910P4 = frag.m10910P4(this.purchaseType);
        privilegePaymentViewM10910P4.m10374f(this.purchaseType, wek0.a, this.mediator);
        privilegePaymentViewM10910P4.setOnNoPrivilegeClick(new d30() { // from class: l.gb90
            public final void call() {
                PrivilegeRecyclerYouthVipView.m10550K(frag, this);
            }
        });
        privilegePaymentViewM10910P4.setOnPayTypeSelect(new e30() { // from class: l.hb90
            public final void call(Object obj) {
                PrivilegeRecyclerYouthVipView.m10552M(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM10910P4.m10372d();
        privilegePaymentViewM10910P4.m10373e();
        privilegePaymentViewM10910P4.m10376h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    private final void m10557S(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m10559V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final Boolean m10558U(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C0434a);
    }

    /* JADX INFO: renamed from: V */
    private final void m10559V() {
        this.contentItems.clear();
        VipFrag vipFrag = null;
        this.contentItems.add(new PrivilegeDescListTitle.C0435a("青春专享特权", "", null));
        for (Privilege privilege : this.privileges) {
            PrivilegeDescListItem.C0424a c0424aM17027a = it80.m17027a(privilege, this.purchaseType);
            c0424aM17027a.m10603g(this);
            this.contentItems.add(c0424aM17027a);
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m22424J(this.contentItems);
        }
        VipFrag vipFrag2 = this.frag;
        if (vipFrag2 == null) {
            Intrinsics.r("frag");
        } else {
            vipFrag = vipFrag2;
        }
        vipFrag.m10917W4();
    }

    /* JADX INFO: renamed from: Q */
    public final Merchandise m10560Q(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty() || g6a.m15602y()) {
            return null;
        }
        return (Merchandise) vwb.r(list, new w9j() { // from class: l.ya90
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m10545F((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m10561T() {
        fb3 fb3Var = this.pagerAdapter;
        mcr mcrVar = null;
        if (fb3Var == null) {
            Intrinsics.r("pagerAdapter");
            fb3Var = null;
        }
        mcr mcrVar2 = this.frag;
        if (mcrVar2 == null) {
            Intrinsics.r("frag");
        } else {
            mcrVar = mcrVar2;
        }
        c<UserPrivilege> cVarM27419u3 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("youthVip"));
        final Function1 function1 = new Function1() { // from class: l.xa90
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerYouthVipView.m10547H((UserPrivilege) obj);
            }
        };
        c cVarDistinctUntilChanged = cVarM27419u3.map(new w9j() { // from class: l.ab90
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m10551L(function1, obj);
            }
        }).distinctUntilChanged();
        c<List<Merchandise>> cVarM2572y5 = CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("youthVip"));
        final Function1 function2 = new Function1() { // from class: l.bb90
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerYouthVipView.m10555P((List) obj);
            }
        };
        c cVarDistinctUntilChanged2 = cVarM2572y5.filter(new w9j() { // from class: l.cb90
            public final Object call(Object obj) {
                return PrivilegeRecyclerYouthVipView.m10546G(function2, obj);
            }
        }).distinctUntilChanged();
        c cVarDistinctUntilChanged3 = src0.m24159r().m24174P().distinctUntilChanged();
        c cVarDistinctUntilChanged4 = CoreModule.f1534c.f3580O0.m2006m3().distinctUntilChanged();
        c cVarDistinctUntilChanged5 = qib0.f19796T.m1489S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.db90
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerYouthVipView.m10549J(((Boolean) obj).booleanValue(), (List) obj2, (j760) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        fb3Var.n(mcrVar, c.combineLatest(cVarDistinctUntilChanged, cVarDistinctUntilChanged2, cVarDistinctUntilChanged3, cVarDistinctUntilChanged4, cVarDistinctUntilChanged5, new aaj() { // from class: l.eb90
            /* JADX INFO: renamed from: a */
            public final Object m14421a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerYouthVipView.m10544E(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.fb90
            public final void call(Object obj) {
                PrivilegeRecyclerYouthVipView.m10553N(this.f12636a, (j760) obj);
            }
        }));
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
        c0444a.m10904p(this.purchaseType, new C0444a.f() { // from class: l.za90
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a.f
            /* JADX INFO: renamed from: a */
            public final void mo10908a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerYouthVipView.m10554O(this.f28684a, privilege, purchaseType, privilege2);
            }
        });
        c0444a.m10903o(privilege);
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: c */
    public void mo10399c() {
        this.isShowing = false;
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: k */
    public void mo10400k(@NotNull fb3 pageAdapter, @NotNull VipFrag frag) {
        pageAdapter.getClass();
        frag.getClass();
        this.frag = frag;
        this.pagerAdapter = pageAdapter;
        this.mediator = frag.m10911Q4(this.purchaseType);
        m10556R(frag);
        m10557S(frag);
        m10561T();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10910P4(this.purchaseType).m10375g();
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7348K();
        }
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: q */
    public void mo10401q() {
        this.isShowing = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PrivilegeRecyclerYouthVipView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PrivilegeRecyclerYouthVipView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
