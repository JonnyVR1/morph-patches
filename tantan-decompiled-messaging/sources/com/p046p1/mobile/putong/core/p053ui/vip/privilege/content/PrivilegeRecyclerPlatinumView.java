package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
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
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerPlatinumView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.aaj;
import p149l.d30;
import p149l.dv80;
import p149l.e30;
import p149l.fb3;
import p149l.fy80;
import p149l.g6a;
import p149l.it80;
import p149l.j5b0;
import p149l.j760;
import p149l.ku80;
import p149l.mkd0;
import p149l.n3b0;
import p149l.nb90;
import p149l.qib0;
import p149l.qu80;
import p149l.src0;
import p149l.vwb;
import p149l.w9j;
import p149l.wek0;
import p149l.wx80;
import p149l.xma;
import p149l.zq20;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0014¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010&R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010<\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010B\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0012¨\u0006E"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerPlatinumView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/ku80;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "W", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "X", "", "hasPlatinum", "a0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListTopChatItem$a;", "getPlatinumItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListTopChatItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Ll/fb3;", "pageAdapter", "k", "(Ll/fb3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "Y", "()V", "onDetachedFromWindow", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/fb3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/qu80;", "h", "Ll/qu80;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/dv80;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "", "j", "Ljava/util/List;", "privileges", "Z", "isShowing", "()Z", "setShowing", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        this.privileges = CollectionsKt.mutableListOf(privilege, privilege2, privilege3, privilege4, privilege5);
        setOverScrollMode(2);
        if (g6a.m124570s()) {
            this.privileges.clear();
            this.privileges.addAll(CollectionsKt.listOf((Object[]) new Privilege[]{Privilege.confession_first, privilege2, privilege3, privilege4, privilege5}));
        } else if (g6a.m124568q()) {
            this.privileges.clear();
            this.privileges.addAll(CollectionsKt.listOf((Object[]) new Privilege[]{privilege, Privilege.accelerate_pairing, privilege2, privilege3, privilege4}));
        }
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m56965E(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: F */
    public static void m56966F(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57432X4(PurchaseType.TYPE_O_PLATINUM, null, wek0.f185947a);
    }

    /* JADX INFO: renamed from: G */
    public static Pair m56967G(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (Pair) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: H */
    public static void m56968H(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57424P4(privilegeRecyclerPlatinumView.purchaseType).m56905h();
        privilegeRecyclerPlatinumView.m56986a0(((Boolean) pair.getFirst()).booleanValue());
        int iM200293G = vwb.m200293G(privilegeRecyclerPlatinumView.contentItems, new w9j() { // from class: l.i890
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m56985Z((dv80) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iM200293G >= 0) {
                privilegeRecyclerPlatinumView.contentItems.remove(iM200293G);
                qu80 qu80Var = privilegeRecyclerPlatinumView.recyclerAdapter;
                if (qu80Var != null) {
                    qu80Var.notifyItemRemoved(iM200293G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM200293G < 0) {
            VipFrag vipFrag2 = privilegeRecyclerPlatinumView.frag;
            if (vipFrag2 == null) {
                Intrinsics.m87502r("frag");
                vipFrag2 = null;
            }
            j5b0 j5b0VarM57425Q4 = vipFrag2.m57425Q4(privilegeRecyclerPlatinumView.purchaseType);
            if (j5b0VarM57425Q4 != null) {
                VipFrag vipFrag3 = privilegeRecyclerPlatinumView.frag;
                if (vipFrag3 == null) {
                    Intrinsics.m87502r("frag");
                    vipFrag3 = null;
                }
                j5b0VarM57425Q4.m54018P(vipFrag3.m57426R4());
            }
            PurchaseType purchaseType = privilegeRecyclerPlatinumView.purchaseType;
            VipFrag vipFrag4 = privilegeRecyclerPlatinumView.frag;
            if (vipFrag4 == null) {
                Intrinsics.m87502r("frag");
                vipFrag4 = null;
            }
            privilegeRecyclerPlatinumView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C8998a(purchaseType, null, vipFrag4.m57426R4(), j5b0VarM57425Q4));
            qu80 qu80Var2 = privilegeRecyclerPlatinumView.recyclerAdapter;
            if (qu80Var2 != null) {
                qu80Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m56969I(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        nb90.m158764b();
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        zq20.m219838c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m56970J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m56971K(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210045H3());
    }

    /* JADX INFO: renamed from: L */
    public static void m56972L(VipFrag vipFrag, PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView) {
        vipFrag.m57432X4(privilegeRecyclerPlatinumView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: M */
    public static Pair m56973M(boolean z, List list, j760 j760Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        j760Var.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: N */
    public static void m56974N(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        nb90.m158767e();
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        zq20.m219838c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: O */
    public static void m56975O(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view, Privilege privilege) {
        privilegeRecyclerPlatinumView.m56987b0(privilege);
    }

    /* JADX INFO: renamed from: P */
    public static void m56976P(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        privilegeRecyclerPlatinumView.m56987b0(null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m56977Q(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        if (n3b0.m157744s(null, 1, null)) {
            return;
        }
        privilegeRecyclerPlatinumView.getContext().startActivity(new Intent(privilegeRecyclerPlatinumView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: R */
    public static void m56978R(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        vipFrag.m57423O4(purchaseType, privilege, wek0.f185947a);
    }

    /* JADX INFO: renamed from: S */
    public static void m56979S(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m57430V4();
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m56980T(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static void m56981U(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view, Privilege privilege) {
        privilegeRecyclerPlatinumView.m56987b0(privilege);
    }

    /* JADX INFO: renamed from: W */
    private final void m56983W(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM57424P4 = frag.m57424P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM57424P4.m56903f(purchaseType, wek0.f185947a, frag.m57425Q4(purchaseType));
        privilegePaymentViewM57424P4.setOnNoPrivilegeClick(new d30() { // from class: l.g890
            @Override // p149l.d30
            public final void call() {
                PrivilegeRecyclerPlatinumView.m56972L(frag, this);
            }
        });
        privilegePaymentViewM57424P4.setOnPayTypeSelect(new e30() { // from class: l.h890
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerPlatinumView.m56979S(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM57424P4.m56901d();
        privilegePaymentViewM57424P4.m56902e();
        privilegePaymentViewM57424P4.m56905h();
    }

    /* JADX INFO: renamed from: X */
    private final void m56984X(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(frag, null, this, this.purchaseType);
        this.recyclerAdapter = qu80Var;
        setAdapter(qu80Var);
        m56986a0(xma.m210045H3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final Boolean m56985Z(dv80 dv80Var) {
        dv80Var.getClass();
        return Boolean.valueOf(dv80Var instanceof PrivilegeDescListShowcaseItem.C8998a);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m56986a0(boolean hasPlatinum) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C8999a("白金会员特权", getResources().getString(R$string.f18643jk), new PrivilegeDescListTitle.C8999a.a() { // from class: l.d890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle.C8999a.a
            /* JADX INFO: renamed from: a */
            public final void mo57278a(View view) {
                PrivilegeRecyclerPlatinumView.m56976P(this.f84839a, view);
            }
        }));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C8988a c8988aM138185a = it80.m138185a(it.next(), PurchaseType.TYPE_O_PLATINUM);
            c8988aM138185a.m57132g(new PrivilegeDescListItem.C8988a.a() { // from class: l.e890
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem.C8988a.a
                /* JADX INFO: renamed from: a */
                public final void mo56927a(View view, Privilege privilege) {
                    PrivilegeRecyclerPlatinumView.m56981U(this.f89813a, view, privilege);
                }
            });
            this.contentItems.add(c8988aM138185a);
        }
        if (hasPlatinum) {
            this.contentItems.add(new PrivilegeDescListTitle.C8999a("白金会员尊享", "", null));
            this.contentItems.add(getPlatinumItem());
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C8999a c8999a = new PrivilegeDescListTitle.C8999a("白金会员尊享", "", null);
            arrayList.add(getPlatinumItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C8991a(c8999a, "解锁白金会员特权", false, arrayList, new PrivilegeDescListNoSVipItem.C8991a.a() { // from class: l.f890
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C8991a.a
                /* JADX INFO: renamed from: a */
                public final void mo57171a(View view) {
                    PrivilegeRecyclerPlatinumView.m56966F(this.f96325a, view);
                }
            }));
        }
        qu80 qu80Var = this.recyclerAdapter;
        if (qu80Var != null) {
            qu80Var.m176580J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m56987b0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m87502r("frag");
            vipFrag = null;
        }
        C9008a c9008a = new C9008a(vipFrag);
        c9008a.m57421p(PurchaseType.TYPE_O_PLATINUM, new C9008a.f() { // from class: l.j890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a.f
            /* JADX INFO: renamed from: a */
            public final void mo57422a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerPlatinumView.m56978R(this.f116688a, privilege, purchaseType, privilege2);
            }
        });
        if (privilege != null) {
            c9008a.m57420o(privilege);
        }
    }

    private final C9003a getAdvancedFilterItem() {
        Privilege privilege = Privilege.advanced_filter;
        wx80 wx80VarM123716l = fy80.m123716l(privilege);
        C9003a c9003a = new C9003a(it80.m138188d(privilege), wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString(), "advancing");
        c9003a.m57321f(new C9003a.a() { // from class: l.b890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                PrivilegeRecyclerPlatinumView.m56969I(this.f74077a, view);
            }
        });
        return c9003a;
    }

    private final PrivilegeDescListTopChatItem.C9000a getPlatinumItem() {
        return new PrivilegeDescListTopChatItem.C9000a(new PrivilegeDescListItem.C8988a.a() { // from class: l.k890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem.C8988a.a
            /* JADX INFO: renamed from: a */
            public final void mo56927a(View view, Privilege privilege) {
                PrivilegeRecyclerPlatinumView.m56975O(this.f121789a, view, privilege);
            }
        });
    }

    private final C9003a getPrivacyItem() {
        Privilege privilege = Privilege.privacy_membership;
        wx80 wx80VarM123716l = fy80.m123716l(privilege);
        C9003a c9003a = new C9003a(it80.m138188d(privilege), wx80VarM123716l.m205968t().toString(), wx80VarM123716l.m205965q().toString(), "privacy");
        c9003a.m57321f(new C9003a.a() { // from class: l.m890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                PrivilegeRecyclerPlatinumView.m56974N(this.f132549a, view);
            }
        });
        return c9003a;
    }

    private final PrivilegeDescListSeeItem.C8996a getSeeItem() {
        PrivilegeDescListSeeItem.C8996a c8996a = new PrivilegeDescListSeeItem.C8996a();
        c8996a.m57236b(new PrivilegeDescListSeeItem.C8996a.a() { // from class: l.l890
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C8996a.a
            /* JADX INFO: renamed from: a */
            public final void mo57237a(View view) {
                PrivilegeRecyclerPlatinumView.m56977Q(this.f126797a, view);
            }
        });
        return c8996a;
    }

    /* JADX INFO: renamed from: Y */
    public void m56988Y() {
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
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("platinum"));
        final Function1 function1 = new Function1() { // from class: l.n890
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerPlatinumView.m56971K((UserPrivilege) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cM210111u3.map(new w9j() { // from class: l.o890
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m56970J(function1, obj);
            }
        }).distinctUntilChanged();
        C22306c<List<Merchandise>> c22306cM30644y5 = CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("platinum"));
        final Function1 function2 = new Function1() { // from class: l.p890
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerPlatinumView.m56965E((List) obj);
            }
        };
        C22306c<List<Merchandise>> c22306cDistinctUntilChanged2 = c22306cM30644y5.filter(new w9j() { // from class: l.q890
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m56980T(function2, obj);
            }
        }).distinctUntilChanged();
        C22306c<j760<OrderInfo, ContractInfo>> c22306cDistinctUntilChanged3 = src0.m185656r().m185671P().distinctUntilChanged();
        C22306c<CoreAutoPay.AutoPayStatus> c22306cDistinctUntilChanged4 = CoreModule.f17545c.f19591O0.m30078m3().distinctUntilChanged();
        C22306c<ArrayList<Contract>> c22306cDistinctUntilChanged5 = qib0.f154705T.m29583S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.r890
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerPlatinumView.m56973M(((Boolean) obj).booleanValue(), (List) obj2, (j760) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        fb3Var.m115452n(vipFrag, C22306c.combineLatest(c22306cDistinctUntilChanged, c22306cDistinctUntilChanged2, c22306cDistinctUntilChanged3, c22306cDistinctUntilChanged4, c22306cDistinctUntilChanged5, new aaj() { // from class: l.s890
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerPlatinumView.m56967G(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.c890
            @Override // p149l.e30
            public final void call(Object obj) {
                PrivilegeRecyclerPlatinumView.m56968H(this.f79725a, (Pair) obj);
            }
        }));
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
        m56983W(frag);
        m56984X(frag);
        m56988Y();
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
    public PrivilegeRecyclerPlatinumView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegeRecyclerPlatinumView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
