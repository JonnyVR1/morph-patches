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
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerPlatinumView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
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
import kotlin.jvm.internal.SourceDebugExtension;
import l.aaj;
import l.d30;
import l.e30;
import l.fy80;
import l.j760;
import l.mcr;
import l.mkd0;
import l.n3b0;
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
import p006l.xma;
import p006l.zq20;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0014¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010&R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010<\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010B\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0012¨\u0006E"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerPlatinumView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "W", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "X", "", "hasPlatinum", "a0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListTopChatItem$a;", "getPlatinumItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListTopChatItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "Y", "()V", "onDetachedFromWindow", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "contentItems", "", "j", "Ljava/util/List;", "privileges", "Z", "isShowing", "()Z", "setShowing", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class PrivilegeRecyclerPlatinumView extends PrivilegeRecycleView implements ku80 {

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
    @NotNull
    public List<Privilege> privileges;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isShowing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeRecyclerPlatinumView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.purchaseType = PurchaseType.TYPE_O_PLATINUM;
        this.contentItems = new ArrayList<>();
        Privilege privilege = Privilege.top_like;
        Privilege privilege2 = Privilege.top_chat;
        Privilege privilege3 = Privilege.see_who_likes_me;
        Privilege privilege4 = Privilege.online_match_tickets;
        Privilege privilege5 = Privilege.say_hi_pkg;
        this.privileges = CollectionsKt.mutableListOf(new Privilege[]{privilege, privilege2, privilege3, privilege4, privilege5});
        setOverScrollMode(2);
        if (g6a.m15596s()) {
            this.privileges.clear();
            this.privileges.addAll(CollectionsKt.listOf(new Privilege[]{Privilege.confession_first, privilege2, privilege3, privilege4, privilege5}));
        } else if (g6a.m15594q()) {
            this.privileges.clear();
            this.privileges.addAll(CollectionsKt.listOf(new Privilege[]{privilege, Privilege.accelerate_pairing, privilege2, privilege3, privilege4}));
        }
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m10436E(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: F */
    public static void m10437F(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10918X4(PurchaseType.TYPE_O_PLATINUM, null, wek0.a);
    }

    /* JADX INFO: renamed from: G */
    public static Pair m10438G(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (Pair) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: H */
    public static void m10439H(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10910P4(privilegeRecyclerPlatinumView.purchaseType).m10376h();
        privilegeRecyclerPlatinumView.m10457a0(((Boolean) pair.getFirst()).booleanValue());
        int iG = vwb.G(privilegeRecyclerPlatinumView.contentItems, new w9j() { // from class: l.i890
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m10456Z((dv80) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iG >= 0) {
                privilegeRecyclerPlatinumView.contentItems.remove(iG);
                qu80 qu80Var = privilegeRecyclerPlatinumView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iG);
                    return;
                }
                return;
            }
            return;
        }
        if (iG < 0) {
            VipFrag vipFrag2 = privilegeRecyclerPlatinumView.frag;
            if (vipFrag2 == null) {
                Intrinsics.r("frag");
                vipFrag2 = null;
            }
            j5b0 j5b0VarM10911Q4 = vipFrag2.m10911Q4(privilegeRecyclerPlatinumView.purchaseType);
            if (j5b0VarM10911Q4 != null) {
                VipFrag vipFrag3 = privilegeRecyclerPlatinumView.frag;
                if (vipFrag3 == null) {
                    Intrinsics.r("frag");
                    vipFrag3 = null;
                }
                j5b0VarM10911Q4.m7353P(vipFrag3.m10912R4());
            }
            PurchaseType purchaseType = privilegeRecyclerPlatinumView.purchaseType;
            VipFrag vipFrag4 = privilegeRecyclerPlatinumView.frag;
            if (vipFrag4 == null) {
                Intrinsics.r("frag");
                vipFrag4 = null;
            }
            privilegeRecyclerPlatinumView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C0434a(purchaseType, null, vipFrag4.m10912R4(), j5b0VarM10911Q4));
            qu80 qu80Var2 = privilegeRecyclerPlatinumView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m10440I(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        nb90.m19998b();
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        zq20.m28789c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m10441J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m10442K(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27353H3());
    }

    /* JADX INFO: renamed from: L */
    public static void m10443L(VipFrag vipFrag, PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView) {
        vipFrag.m10918X4(privilegeRecyclerPlatinumView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: M */
    public static Pair m10444M(boolean z, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: N */
    public static void m10445N(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        nb90.m20001e();
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        zq20.m28789c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: O */
    public static void m10446O(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view, Privilege privilege) {
        privilegeRecyclerPlatinumView.m10458b0(privilege);
    }

    /* JADX INFO: renamed from: P */
    public static void m10447P(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        privilegeRecyclerPlatinumView.m10458b0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public static void m10448Q(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        if (n3b0.s((Counter) null, 1, (Object) null)) {
            return;
        }
        privilegeRecyclerPlatinumView.getContext().startActivity(new Intent(privilegeRecyclerPlatinumView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: R */
    public static void m10449R(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        vipFrag.m10909O4(purchaseType, privilege, wek0.a);
    }

    /* JADX INFO: renamed from: S */
    public static void m10450S(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m10916V4();
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m10451T(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static void m10452U(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view, Privilege privilege) {
        privilegeRecyclerPlatinumView.m10458b0(privilege);
    }

    /* JADX INFO: renamed from: W */
    private final void m10454W(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM10910P4 = frag.m10910P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM10910P4.m10374f(purchaseType, wek0.a, frag.m10911Q4(purchaseType));
        privilegePaymentViewM10910P4.setOnNoPrivilegeClick(new d30() { // from class: l.g890
            public final void call() {
                PrivilegeRecyclerPlatinumView.m10443L(frag, this);
            }
        });
        privilegePaymentViewM10910P4.setOnPayTypeSelect(new e30() { // from class: l.h890
            public final void call(Object obj) {
                PrivilegeRecyclerPlatinumView.m10450S(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM10910P4.m10372d();
        privilegePaymentViewM10910P4.m10373e();
        privilegePaymentViewM10910P4.m10376h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    private final void m10455X(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m10457a0(xma.m27353H3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final Boolean m10456Z(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C0434a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    private final void m10457a0(boolean hasPlatinum) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C0435a("白金会员特权", getResources().getString(R$string.f2632jk), new PrivilegeDescListTitle.C0435a.a() { // from class: l.d890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle.C0435a.a
            /* JADX INFO: renamed from: a */
            public final void mo10758a(View view) {
                PrivilegeRecyclerPlatinumView.m10447P(this.f10062a, view);
            }
        }));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C0424a c0424aM17027a = it80.m17027a(it.next(), PurchaseType.TYPE_O_PLATINUM);
            c0424aM17027a.m10603g(new PrivilegeDescListItem.C0424a.a() { // from class: l.e890
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem.C0424a.a
                /* JADX INFO: renamed from: a */
                public final void mo10398a(View view, Privilege privilege) {
                    PrivilegeRecyclerPlatinumView.m10452U(this.f10842a, view, privilege);
                }
            });
            this.contentItems.add(c0424aM17027a);
        }
        if (hasPlatinum) {
            this.contentItems.add(new PrivilegeDescListTitle.C0435a("白金会员尊享", "", null));
            this.contentItems.add(getPlatinumItem());
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C0435a c0435a = new PrivilegeDescListTitle.C0435a("白金会员尊享", "", null);
            arrayList.add(getPlatinumItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C0427a(c0435a, "解锁白金会员特权", false, arrayList, new PrivilegeDescListNoSVipItem.C0427a.a() { // from class: l.f890
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C0427a.a
                /* JADX INFO: renamed from: a */
                public final void mo10645a(View view) {
                    PrivilegeRecyclerPlatinumView.m10437F(this.f12553a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m22424J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m10458b0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.r("frag");
            vipFrag = null;
        }
        C0444a c0444a = new C0444a(vipFrag);
        c0444a.m10904p(PurchaseType.TYPE_O_PLATINUM, new C0444a.f() { // from class: l.j890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a.f
            /* JADX INFO: renamed from: a */
            public final void mo10908a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerPlatinumView.m10449R(this.f15053a, privilege, purchaseType, privilege2);
            }
        });
        if (privilege != null) {
            c0444a.m10903o(privilege);
        }
    }

    private final C0439a getAdvancedFilterItem() {
        Privilege privilege = Privilege.advanced_filter;
        wx80 wx80VarL = fy80.l(privilege);
        C0439a c0439a = new C0439a(it80.m17030d(privilege), wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString(), "advancing");
        c0439a.m10804f(new C0439a.a() { // from class: l.b890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                PrivilegeRecyclerPlatinumView.m10440I(this.f8773a, view);
            }
        });
        return c0439a;
    }

    private final PrivilegeDescListTopChatItem.C0436a getPlatinumItem() {
        return new PrivilegeDescListTopChatItem.C0436a(new PrivilegeDescListItem.C0424a.a() { // from class: l.k890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem.C0424a.a
            /* JADX INFO: renamed from: a */
            public final void mo10398a(View view, Privilege privilege) {
                PrivilegeRecyclerPlatinumView.m10446O(this.f15649a, view, privilege);
            }
        });
    }

    private final C0439a getPrivacyItem() {
        Privilege privilege = Privilege.privacy_membership;
        wx80 wx80VarL = fy80.l(privilege);
        C0439a c0439a = new C0439a(it80.m17030d(privilege), wx80VarL.m26849t().toString(), wx80VarL.m26846q().toString(), "privacy");
        c0439a.m10804f(new C0439a.a() { // from class: l.m890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                PrivilegeRecyclerPlatinumView.m10445N(this.f16851a, view);
            }
        });
        return c0439a;
    }

    private final PrivilegeDescListSeeItem.C0432a getSeeItem() {
        PrivilegeDescListSeeItem.C0432a c0432a = new PrivilegeDescListSeeItem.C0432a();
        c0432a.m10713b(new PrivilegeDescListSeeItem.C0432a.a() { // from class: l.l890
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C0432a.a
            /* JADX INFO: renamed from: a */
            public final void mo10714a(View view) {
                PrivilegeRecyclerPlatinumView.m10448Q(this.f16264a, view);
            }
        });
        return c0432a;
    }

    /* JADX INFO: renamed from: Y */
    public void m10459Y() {
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
        c<UserPrivilege> cVarM27419u3 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("platinum"));
        final Function1 function1 = new Function1() { // from class: l.n890
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerPlatinumView.m10442K((UserPrivilege) obj);
            }
        };
        c cVarDistinctUntilChanged = cVarM27419u3.map(new w9j() { // from class: l.o890
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m10441J(function1, obj);
            }
        }).distinctUntilChanged();
        c<List<Merchandise>> cVarM2572y5 = CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("platinum"));
        final Function1 function2 = new Function1() { // from class: l.p890
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerPlatinumView.m10436E((List) obj);
            }
        };
        c cVarDistinctUntilChanged2 = cVarM2572y5.filter(new w9j() { // from class: l.q890
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m10451T(function2, obj);
            }
        }).distinctUntilChanged();
        c cVarDistinctUntilChanged3 = src0.m24159r().m24174P().distinctUntilChanged();
        c cVarDistinctUntilChanged4 = CoreModule.f1534c.f3580O0.m2006m3().distinctUntilChanged();
        c cVarDistinctUntilChanged5 = qib0.f19796T.m1489S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.r890
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerPlatinumView.m10444M(((Boolean) obj).booleanValue(), (List) obj2, (j760) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        fb3Var.n(mcrVar, c.combineLatest(cVarDistinctUntilChanged, cVarDistinctUntilChanged2, cVarDistinctUntilChanged3, cVarDistinctUntilChanged4, cVarDistinctUntilChanged5, new aaj() { // from class: l.s890
            /* JADX INFO: renamed from: a */
            public final Object m23519a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerPlatinumView.m10438G(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.c890
            public final void call(Object obj) {
                PrivilegeRecyclerPlatinumView.m10439H(this.f9487a, (Pair) obj);
            }
        }));
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
        m10454W(frag);
        m10455X(frag);
        m10459Y();
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
    public PrivilegeRecyclerPlatinumView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PrivilegeRecyclerPlatinumView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
