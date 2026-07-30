package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
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
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerPlatinumView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p153l.a690;
import p153l.cok0;
import p153l.h390;
import p153l.j690;
import p153l.joa;
import p153l.jyb;
import p153l.jz20;
import p153l.m190;
import p153l.ndb0;
import p153l.o290;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rbb0;
import p153l.rj90;
import p153l.s7a;
import p153l.u290;
import p153l.ub3;
import p153l.ucj;
import p153l.uqb0;
import p153l.x20;
import p153l.xzc0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0014¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010&R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010<\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010B\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0012¨\u0006E"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecyclerPlatinumView;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegeRecycleView;", "Ll/o290;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "frag", "", "W", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "X", "", "hasPlatinum", "a0", "(Z)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListTopChatItem$a;", "getPlatinumItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListTopChatItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "getSeeItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/PrivilegeDescListSeeItem$a;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getPrivacyItem", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/content/item/a;", "getAdvancedFilterItem", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b0", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "Ll/ub3;", "pageAdapter", "k", "(Ll/ub3;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;)V", "Y", "()V", "onDetachedFromWindow", "q", "c", "e", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/VipFrag;", "f", "Ll/ub3;", "pagerAdapter", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/u290;", "h", "Ll/u290;", "recyclerAdapter", "Ljava/util/ArrayList;", "Ll/h390;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/ArrayList;", "contentItems", "", "j", "Ljava/util/List;", "privileges", "Z", "isShowing", "()Z", "setShowing", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PrivilegeRecyclerPlatinumView extends PrivilegeRecycleView implements o290 {

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
        if (s7a.m184990s()) {
            this.privileges.clear();
            this.privileges.addAll(CollectionsKt.listOf((Object[]) new Privilege[]{Privilege.confession_first, privilege2, privilege3, privilege4, privilege5}));
        } else if (s7a.m184988q()) {
            this.privileges.clear();
            this.privileges.addAll(CollectionsKt.listOf((Object[]) new Privilege[]{privilege, Privilege.accelerate_pairing, privilege2, privilege3, privilege4}));
        }
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m58148E(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: F */
    public static void m58149F(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58615X4(PurchaseType.TYPE_O_PLATINUM, null, cok0.f82895a);
    }

    /* JADX INFO: renamed from: G */
    public static Pair m58150G(Function5 function5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (Pair) function5.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: H */
    public static void m58151H(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, Pair pair) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58607P4(privilegeRecyclerPlatinumView.purchaseType).m58088h();
        privilegeRecyclerPlatinumView.m58169a0(((Boolean) pair.getFirst()).booleanValue());
        int iM147476G = jyb.m147476G(privilegeRecyclerPlatinumView.contentItems, new qcj() { // from class: l.mg90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m58168Z((h390) obj);
            }
        });
        if (((Boolean) pair.getFirst()).booleanValue()) {
            if (iM147476G >= 0) {
                privilegeRecyclerPlatinumView.contentItems.remove(iM147476G);
                u290 u290Var = privilegeRecyclerPlatinumView.recyclerAdapter;
                if (u290Var != null) {
                    u290Var.notifyItemRemoved(iM147476G);
                    return;
                }
                return;
            }
            return;
        }
        if (iM147476G < 0) {
            VipFrag vipFrag2 = privilegeRecyclerPlatinumView.frag;
            if (vipFrag2 == null) {
                Intrinsics.m88391r("frag");
                vipFrag2 = null;
            }
            ndb0 ndb0VarM58608Q4 = vipFrag2.m58608Q4(privilegeRecyclerPlatinumView.purchaseType);
            if (ndb0VarM58608Q4 != null) {
                VipFrag vipFrag3 = privilegeRecyclerPlatinumView.frag;
                if (vipFrag3 == null) {
                    Intrinsics.m88391r("frag");
                    vipFrag3 = null;
                }
                ndb0VarM58608Q4.m55201P(vipFrag3.m58609R4());
            }
            PurchaseType purchaseType = privilegeRecyclerPlatinumView.purchaseType;
            VipFrag vipFrag4 = privilegeRecyclerPlatinumView.frag;
            if (vipFrag4 == null) {
                Intrinsics.m88391r("frag");
                vipFrag4 = null;
            }
            privilegeRecyclerPlatinumView.contentItems.add(0, new PrivilegeDescListShowcaseItem.C9161a(purchaseType, null, vipFrag4.m58609R4(), ndb0VarM58608Q4));
            u290 u290Var2 = privilegeRecyclerPlatinumView.recyclerAdapter;
            if (u290Var2 != null) {
                u290Var2.notifyItemInserted(0);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m58152I(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        rj90.m181692b();
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        jz20.m147635c(vipFrag.act(), 1);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m58153J(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Boolean m58154K(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146359I3());
    }

    /* JADX INFO: renamed from: L */
    public static void m58155L(VipFrag vipFrag, PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView) {
        vipFrag.m58615X4(privilegeRecyclerPlatinumView.purchaseType, null, "");
    }

    /* JADX INFO: renamed from: M */
    public static Pair m58156M(boolean z, List list, pf60 pf60Var, CoreAutoPay.AutoPayStatus autoPayStatus, ArrayList arrayList) {
        list.getClass();
        pf60Var.getClass();
        return new Pair(Boolean.valueOf(z), list);
    }

    /* JADX INFO: renamed from: N */
    public static void m58157N(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        rj90.m181695e();
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        jz20.m147635c(vipFrag.act(), 2);
    }

    /* JADX INFO: renamed from: O */
    public static void m58158O(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view, Privilege privilege) {
        privilegeRecyclerPlatinumView.m58170b0(privilege);
    }

    /* JADX INFO: renamed from: P */
    public static void m58159P(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        privilegeRecyclerPlatinumView.m58170b0(null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m58160Q(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view) {
        if (rbb0.m180746s(null, 1, null)) {
            return;
        }
        privilegeRecyclerPlatinumView.getContext().startActivity(new Intent(privilegeRecyclerPlatinumView.getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: R */
    public static void m58161R(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, Privilege privilege, PurchaseType purchaseType, Privilege privilege2) {
        VipFrag vipFrag = privilegeRecyclerPlatinumView.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        vipFrag.m58606O4(purchaseType, privilege, cok0.f82895a);
    }

    /* JADX INFO: renamed from: S */
    public static void m58162S(VipFrag vipFrag, PayMethod payMethod) {
        vipFrag.m58613V4();
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m58163T(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static void m58164U(PrivilegeRecyclerPlatinumView privilegeRecyclerPlatinumView, View view, Privilege privilege) {
        privilegeRecyclerPlatinumView.m58170b0(privilege);
    }

    /* JADX INFO: renamed from: W */
    private final void m58166W(final VipFrag frag) {
        PrivilegePaymentView privilegePaymentViewM58607P4 = frag.m58607P4(this.purchaseType);
        PurchaseType purchaseType = this.purchaseType;
        privilegePaymentViewM58607P4.m58086f(purchaseType, cok0.f82895a, frag.m58608Q4(purchaseType));
        privilegePaymentViewM58607P4.setOnNoPrivilegeClick(new x20() { // from class: l.kg90
            @Override // p153l.x20
            public final void call() {
                PrivilegeRecyclerPlatinumView.m58155L(frag, this);
            }
        });
        privilegePaymentViewM58607P4.setOnPayTypeSelect(new y20() { // from class: l.lg90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerPlatinumView.m58162S(frag, (PayMethod) obj);
            }
        });
        privilegePaymentViewM58607P4.m58084d();
        privilegePaymentViewM58607P4.m58085e();
        privilegePaymentViewM58607P4.m58088h();
    }

    /* JADX INFO: renamed from: X */
    private final void m58167X(VipFrag frag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        u290 u290Var = new u290(frag, null, this, this.purchaseType);
        this.recyclerAdapter = u290Var;
        setAdapter(u290Var);
        m58169a0(joa.m146359I3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final Boolean m58168Z(h390 h390Var) {
        h390Var.getClass();
        return Boolean.valueOf(h390Var instanceof PrivilegeDescListShowcaseItem.C9161a);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m58169a0(boolean hasPlatinum) {
        this.contentItems.clear();
        this.contentItems.add(new PrivilegeDescListTitle.C9162a("白金会员特权", getResources().getString(R$string.f18461Fk), new PrivilegeDescListTitle.C9162a.a() { // from class: l.hg90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle.C9162a.a
            /* JADX INFO: renamed from: a */
            public final void mo58461a(View view) {
                PrivilegeRecyclerPlatinumView.m58159P(this.f109379a, view);
            }
        }));
        Iterator<Privilege> it = this.privileges.iterator();
        while (it.hasNext()) {
            PrivilegeDescListItem.C9151a c9151aM156630a = m190.m156630a(it.next(), PurchaseType.TYPE_O_PLATINUM);
            c9151aM156630a.m58315g(new PrivilegeDescListItem.C9151a.a() { // from class: l.ig90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem.C9151a.a
                /* JADX INFO: renamed from: a */
                public final void mo58110a(View view, Privilege privilege) {
                    PrivilegeRecyclerPlatinumView.m58164U(this.f114771a, view, privilege);
                }
            });
            this.contentItems.add(c9151aM156630a);
        }
        if (hasPlatinum) {
            this.contentItems.add(new PrivilegeDescListTitle.C9162a("白金会员尊享", "", null));
            this.contentItems.add(getPlatinumItem());
            this.contentItems.add(getSeeItem());
            this.contentItems.add(getPrivacyItem());
            this.contentItems.add(getAdvancedFilterItem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C9162a c9162a = new PrivilegeDescListTitle.C9162a("白金会员尊享", "", null);
            arrayList.add(getPlatinumItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFilterItem());
            this.contentItems.add(new PrivilegeDescListNoSVipItem.C9154a(c9162a, "解锁白金会员特权", false, arrayList, new PrivilegeDescListNoSVipItem.C9154a.a() { // from class: l.jg90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C9154a.a
                /* JADX INFO: renamed from: a */
                public final void mo58354a(View view) {
                    PrivilegeRecyclerPlatinumView.m58149F(this.f120689a, view);
                }
            }));
        }
        u290 u290Var = this.recyclerAdapter;
        if (u290Var != null) {
            u290Var.m194253J(this.contentItems);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m58170b0(final Privilege privilege) {
        VipFrag vipFrag = this.frag;
        if (vipFrag == null) {
            Intrinsics.m88391r("frag");
            vipFrag = null;
        }
        C9171a c9171a = new C9171a(vipFrag);
        c9171a.m58604p(PurchaseType.TYPE_O_PLATINUM, new C9171a.f() { // from class: l.ng90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a.f
            /* JADX INFO: renamed from: a */
            public final void mo58605a(PurchaseType purchaseType, Privilege privilege2) {
                PrivilegeRecyclerPlatinumView.m58161R(this.f141799a, privilege, purchaseType, privilege2);
            }
        });
        if (privilege != null) {
            c9171a.m58603o(privilege);
        }
    }

    private final C9166a getAdvancedFilterItem() {
        Privilege privilege = Privilege.advanced_filter;
        a690 a690VarM143620l = j690.m143620l(privilege);
        C9166a c9166a = new C9166a(m190.m156633d(privilege), a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString(), "advancing");
        c9166a.m58504f(new C9166a.a() { // from class: l.fg90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                PrivilegeRecyclerPlatinumView.m58152I(this.f98894a, view);
            }
        });
        return c9166a;
    }

    private final PrivilegeDescListTopChatItem.C9163a getPlatinumItem() {
        return new PrivilegeDescListTopChatItem.C9163a(new PrivilegeDescListItem.C9151a.a() { // from class: l.og90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem.C9151a.a
            /* JADX INFO: renamed from: a */
            public final void mo58110a(View view, Privilege privilege) {
                PrivilegeRecyclerPlatinumView.m58158O(this.f147198a, view, privilege);
            }
        });
    }

    private final C9166a getPrivacyItem() {
        Privilege privilege = Privilege.privacy_membership;
        a690 a690VarM143620l = j690.m143620l(privilege);
        C9166a c9166a = new C9166a(m190.m156633d(privilege), a690VarM143620l.m96314t().toString(), a690VarM143620l.m96311q().toString(), "privacy");
        c9166a.m58504f(new C9166a.a() { // from class: l.qg90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                PrivilegeRecyclerPlatinumView.m58157N(this.f157391a, view);
            }
        });
        return c9166a;
    }

    private final PrivilegeDescListSeeItem.C9159a getSeeItem() {
        PrivilegeDescListSeeItem.C9159a c9159a = new PrivilegeDescListSeeItem.C9159a();
        c9159a.m58419b(new PrivilegeDescListSeeItem.C9159a.a() { // from class: l.pg90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C9159a.a
            /* JADX INFO: renamed from: a */
            public final void mo58420a(View view) {
                PrivilegeRecyclerPlatinumView.m58160Q(this.f152244a, view);
            }
        });
        return c9159a;
    }

    /* JADX INFO: renamed from: Y */
    public void m58171Y() {
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
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("platinum"));
        final Function1 function1 = new Function1() { // from class: l.rg90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerPlatinumView.m58154K((UserPrivilege) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cM146424v3.map(new qcj() { // from class: l.sg90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m58153J(function1, obj);
            }
        }).distinctUntilChanged();
        C22421c<List<Merchandise>> c22421cM31647y5 = CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("platinum"));
        final Function1 function2 = new Function1() { // from class: l.tg90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivilegeRecyclerPlatinumView.m58148E((List) obj);
            }
        };
        C22421c<List<Merchandise>> c22421cDistinctUntilChanged2 = c22421cM31647y5.filter(new qcj() { // from class: l.ug90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeRecyclerPlatinumView.m58163T(function2, obj);
            }
        }).distinctUntilChanged();
        C22421c<pf60<OrderInfo, ContractInfo>> c22421cDistinctUntilChanged3 = xzc0.m213720r().m213735P().distinctUntilChanged();
        C22421c<CoreAutoPay.AutoPayStatus> c22421cDistinctUntilChanged4 = CoreModule.f18264c.f20333O0.m31076m3().distinctUntilChanged();
        C22421c<ArrayList<Contract>> c22421cDistinctUntilChanged5 = uqb0.f180388T.m30581S().distinctUntilChanged();
        final Function5 function5 = new Function5() { // from class: l.vg90
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerPlatinumView.m58156M(((Boolean) obj).booleanValue(), (List) obj2, (pf60) obj3, (CoreAutoPay.AutoPayStatus) obj4, (ArrayList) obj5);
            }
        };
        ub3Var.m153557n(vipFrag, C22421c.combineLatest(c22421cDistinctUntilChanged, c22421cDistinctUntilChanged2, c22421cDistinctUntilChanged3, c22421cDistinctUntilChanged4, c22421cDistinctUntilChanged5, new ucj() { // from class: l.wg90
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return PrivilegeRecyclerPlatinumView.m58150G(function5, obj, obj2, obj3, obj4, obj5);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.gg90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegeRecyclerPlatinumView.m58151H(this.f104000a, (Pair) obj);
            }
        }));
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
        m58166W(frag);
        m58167X(frag);
        m58171Y();
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
    public PrivilegeRecyclerPlatinumView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegeRecyclerPlatinumView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
