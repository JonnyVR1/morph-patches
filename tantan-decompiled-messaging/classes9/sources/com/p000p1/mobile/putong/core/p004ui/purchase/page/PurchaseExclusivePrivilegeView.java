package com.p000p1.mobile.putong.core.p004ui.purchase.page;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b1c0;
import l.d3c0;
import l.e3b0;
import l.m6c0;
import l.sab0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.g6a;
import p006l.ura;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010/¨\u00061"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchaseExclusivePrivilegeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "b", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "d", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Ljava/lang/CharSequence;", "Landroid/widget/FrameLayout;", "get_root_view", "()Landroid/widget/FrameLayout;", "set_root_view", "(Landroid/widget/FrameLayout;)V", "_root_view", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "get_root_view_container", "()Landroid/widget/LinearLayout;", "set_root_view_container", "(Landroid/widget/LinearLayout;)V", "_root_view_container", "Lv/VText;", "Lv/VText;", "get_privilege_title", "()Lv/VText;", "set_privilege_title", "(Lv/VText;)V", "_privilege_title", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "Ljava/util/List;", "privilegeItems", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchaseExclusivePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _root_view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _root_view_container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _privilege_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<Privilege> privilegeItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseExclusivePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.privilegeItems = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m7474a(View view) {
        e3b0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Act m7475b() {
        Act context = getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m7476c(PurchaseType purchaseType) {
        if (sab0.q(purchaseType)) {
            return "SVIP会员专属特权";
        }
        if (sab0.w(purchaseType)) {
            return "VIP会员专属特权";
        }
        if (sab0.i(purchaseType)) {
            return "黑金会员专属特权";
        }
        if (sab0.g(purchaseType)) {
            return "她专享会员专属特权";
        }
        return sab0.x(purchaseType) ? "青春专享会员专属特权" : "专属特权";
    }

    /* JADX INFO: renamed from: d */
    public final void m7477d(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        get_privilege_title().setText(m7476c(purchaseType));
        if (sab0.i(purchaseType)) {
            get_privilege_title().setTextColor(Color.parseColor("#66FFDEA2"));
            get_privilege_title().setBackground(CoreModule.f1533b.getResources().getDrawable(d3c0.N6));
            get_root_view().setBackground(CoreModule.f1533b.getResources().getDrawable(d3c0.M6));
        } else {
            get_privilege_title().setTextColor(CoreModule.f1533b.getResources().getColor(b1c0.j));
            get_privilege_title().setBackground(CoreModule.f1533b.getResources().getDrawable(d3c0.O6));
            get_root_view().setBackground(CoreModule.f1533b.getResources().getDrawable(d3c0.L6));
        }
        this.privilegeItems.clear();
        if (sab0.i(purchaseType)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Privilege.immediately_match);
            arrayList.add(Privilege.oDiamondVisitor);
            arrayList.add(Privilege.oDiamondSvipSkin);
            arrayList.add(Privilege.customer_service);
            arrayList.add(Privilege.boost);
            arrayList.add(Privilege.picksMembership);
            arrayList.add(Privilege.vip_super_like);
            arrayList.add(Privilege.online_match_tickets);
            arrayList.add(Privilege.voice_quick_chat);
            arrayList.add(Privilege.oDiamondGreetings);
            arrayList.add(Privilege.live_entry_animation);
            arrayList.add(Privilege.oDiamondSvipExtra);
            this.privilegeItems.addAll(arrayList);
        } else if (sab0.q(purchaseType)) {
            Privilege privilege = Privilege.see_who_likes_me;
            ArrayList arrayListF0 = vwb.f0(new Privilege[]{privilege, Privilege.online_match_tickets, Privilege.boost, Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.liked_user, Privilege.voice_quick_chat, Privilege.say_hi_pkg, Privilege.advanced_filter, Privilege.privacy_membership, Privilege.vip_undo, Privilege.vip_location, Privilege.recover_unmatches, Privilege.message_read_state, Privilege.greet, Privilege.svip_badge});
            if (CoreModule.m1853N().Vo()) {
                arrayListF0.add(Privilege.moment_boost);
            }
            if (g6a.m15590m()) {
                arrayListF0.add(arrayListF0.indexOf(privilege) + 1, Privilege.hide_me_from_nearby);
            }
            List<Privilege> list = this.privilegeItems;
            arrayListF0.getClass();
            list.addAll(arrayListF0);
        } else if (sab0.g(purchaseType)) {
            ArrayList arrayListF1 = vwb.f0(new Privilege[]{Privilege.pick_tantan_credits_users, Privilege.unlock_learn_about_him_module, Privilege.privacy_membership, Privilege.ads_not_disturb, Privilege.block_harassing_words});
            List<Privilege> list2 = this.privilegeItems;
            arrayListF1.getClass();
            list2.addAll(arrayListF1);
        } else if (sab0.x(purchaseType)) {
            Privilege privilege2 = Privilege.youth_roaming;
            Privilege privilege3 = Privilege.youth_find_partner;
            Privilege privilege4 = Privilege.youth_blind_box;
            Privilege privilege5 = Privilege.youth_superlike;
            Privilege privilege6 = Privilege.youth_message_read;
            ArrayList arrayListF2 = vwb.f0(new Privilege[]{privilege2, privilege3, privilege4, privilege5, privilege6});
            if (ura.m25555e().m25559d().m5861t9()) {
                arrayListF2.remove(privilege6);
            }
            List<Privilege> list3 = this.privilegeItems;
            arrayListF2.getClass();
            list3.addAll(arrayListF2);
        } else if (sab0.w(purchaseType)) {
            ArrayList arrayListF3 = vwb.f0(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_badge});
            List<Privilege> list4 = this.privilegeItems;
            arrayListF3.getClass();
            list4.addAll(arrayListF3);
        }
        if (ura.m25555e().m25559d().m5861t9()) {
            this.privilegeItems.remove(Privilege.message_read_state);
        }
        for (Privilege privilege7 : this.privilegeItems) {
            View viewInflate = m7475b().inflater().inflate(m6c0.k1, (ViewGroup) get_root_view_container(), false);
            viewInflate.getClass();
            PurchaseExclusivePrivilegeItemView purchaseExclusivePrivilegeItemView = (PurchaseExclusivePrivilegeItemView) viewInflate;
            purchaseExclusivePrivilegeItemView.m7473c(purchaseType, privilege7);
            get_root_view_container().addView(purchaseExclusivePrivilegeItemView);
        }
    }

    @NotNull
    public final VText get_privilege_title() {
        VText vText = this._privilege_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_privilege_title");
        return null;
    }

    @NotNull
    public final FrameLayout get_root_view() {
        FrameLayout frameLayout = this._root_view;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_root_view");
        return null;
    }

    @NotNull
    public final LinearLayout get_root_view_container() {
        LinearLayout linearLayout = this._root_view_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_root_view_container");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7474a(this);
    }

    public final void set_privilege_title(@NotNull VText vText) {
        vText.getClass();
        this._privilege_title = vText;
    }

    public final void set_root_view(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._root_view = frameLayout;
    }

    public final void set_root_view_container(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._root_view_container = linearLayout;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PurchaseExclusivePrivilegeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PurchaseExclusivePrivilegeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
