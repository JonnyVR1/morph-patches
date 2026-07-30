package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b1c0;
import l.d3c0;
import l.dyo;
import l.m6c0;
import l.o4p;
import l.sab0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\nR\"\u0010$\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010:R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0018\u0010@\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "b", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "d", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "isWeeklySelected", "needGuide", "e", "(ZZ)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Ljava/lang/CharSequence;", "f", "Landroid/widget/FrameLayout;", "get_root_view", "()Landroid/widget/FrameLayout;", "set_root_view", "(Landroid/widget/FrameLayout;)V", "_root_view", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "get_root_view_container", "()Landroid/widget/LinearLayout;", "set_root_view_container", "(Landroid/widget/LinearLayout;)V", "_root_view_container", "Lv/VText;", "Lv/VText;", "get_privilege_title", "()Lv/VText;", "set_privilege_title", "(Lv/VText;)V", "_privilege_title", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "Ljava/util/List;", "privilegeItems", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeItemView;", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeItemView;", "premiumBoostItemView", "Z", "isPremiumWeeklySelected", "g", "premiumWeeklyBoostNeedGuide", "h", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "currentPurchaseType", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlPurchaseExclusivePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _root_view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _root_view_container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _privilege_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<Privilege> privilegeItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public IntlPurchaseExclusivePrivilegeItemView premiumBoostItemView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isPremiumWeeklySelected;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean premiumWeeklyBoostNeedGuide;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public PurchaseType currentPurchaseType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchaseExclusivePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.privilegeItems = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m4402a(View view) {
        o4p.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Act m4403b() {
        Act context = getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m4404c(PurchaseType purchaseType) {
        if (sab0.q(purchaseType)) {
            String string = m4403b().getString(R.string.i4);
            string.getClass();
            return string;
        }
        if (sab0.v(purchaseType)) {
            String string2 = m4403b().getString(R.string.P5);
            string2.getClass();
            return string2;
        }
        String string3 = m4403b().getString(R.string.V4);
        string3.getClass();
        return string3;
    }

    /* JADX INFO: renamed from: d */
    public final void m4405d(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        this.currentPurchaseType = purchaseType;
        get_privilege_title().setText(m4404c(purchaseType));
        if (sab0.q(purchaseType)) {
            get_privilege_title().setTextColor(Color.parseColor("#66FFDEA2"));
            get_privilege_title().setBackground(CoreModule.b.getResources().getDrawable(d3c0.l1));
            get_root_view().setBackground(CoreModule.b.getResources().getDrawable(d3c0.k1));
        } else if (sab0.v(purchaseType)) {
            get_privilege_title().setTextColor(Color.parseColor("#432053"));
            get_privilege_title().setBackground(CoreModule.b.getResources().getDrawable(d3c0.o1));
            get_root_view().setBackground(CoreModule.b.getResources().getDrawable(d3c0.n1));
        } else {
            get_privilege_title().setTextColor(CoreModule.b.getResources().getColor(b1c0.d));
            get_privilege_title().setBackground(CoreModule.b.getResources().getDrawable(d3c0.m1));
            get_root_view().setBackground(CoreModule.b.getResources().getDrawable(d3c0.j1));
        }
        this.privilegeItems.clear();
        this.premiumBoostItemView = null;
        if (sab0.q(purchaseType)) {
            List listE = dyo.e();
            List<Privilege> list = this.privilegeItems;
            listE.getClass();
            list.addAll(listE);
        } else if (sab0.w(purchaseType)) {
            ArrayList arrayListD = dyo.d();
            List<Privilege> list2 = this.privilegeItems;
            arrayListD.getClass();
            list2.addAll(arrayListD);
        } else if (sab0.v(purchaseType)) {
            List listC = dyo.c();
            List<Privilege> list3 = this.privilegeItems;
            listC.getClass();
            list3.addAll(listC);
        }
        for (Privilege privilege : this.privilegeItems) {
            View viewInflate = m4403b().inflater().inflate(m6c0.O, (ViewGroup) get_root_view_container(), false);
            viewInflate.getClass();
            IntlPurchaseExclusivePrivilegeItemView intlPurchaseExclusivePrivilegeItemView = (IntlPurchaseExclusivePrivilegeItemView) viewInflate;
            intlPurchaseExclusivePrivilegeItemView.m4398b(purchaseType, privilege);
            if (sab0.q(purchaseType) && privilege == Privilege.boost) {
                this.premiumBoostItemView = intlPurchaseExclusivePrivilegeItemView;
            }
            get_root_view_container().addView(intlPurchaseExclusivePrivilegeItemView);
        }
        if (sab0.q(purchaseType)) {
            View viewInflate2 = m4403b().inflater().inflate(m6c0.O, (ViewGroup) get_root_view_container(), false);
            viewInflate2.getClass();
            IntlPurchaseExclusivePrivilegeItemView intlPurchaseExclusivePrivilegeItemView2 = (IntlPurchaseExclusivePrivilegeItemView) viewInflate2;
            intlPurchaseExclusivePrivilegeItemView2.m4399c();
            get_root_view_container().addView(intlPurchaseExclusivePrivilegeItemView2);
        } else if (sab0.v(purchaseType)) {
            View viewInflate3 = m4403b().inflater().inflate(m6c0.O, (ViewGroup) get_root_view_container(), false);
            viewInflate3.getClass();
            IntlPurchaseExclusivePrivilegeItemView intlPurchaseExclusivePrivilegeItemView3 = (IntlPurchaseExclusivePrivilegeItemView) viewInflate3;
            intlPurchaseExclusivePrivilegeItemView3.m4400d();
            get_root_view_container().addView(intlPurchaseExclusivePrivilegeItemView3);
        }
        m4407f();
    }

    /* JADX INFO: renamed from: e */
    public final void m4406e(boolean isWeeklySelected, boolean needGuide) {
        this.isPremiumWeeklySelected = isWeeklySelected;
        this.premiumWeeklyBoostNeedGuide = needGuide;
        m4407f();
    }

    /* JADX INFO: renamed from: f */
    public final void m4407f() {
        IntlPurchaseExclusivePrivilegeItemView intlPurchaseExclusivePrivilegeItemView = this.premiumBoostItemView;
        if (intlPurchaseExclusivePrivilegeItemView == null) {
            return;
        }
        PurchaseType purchaseType = this.currentPurchaseType;
        if (purchaseType == null) {
            purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        CharSequence charSequenceD = dyo.b(purchaseType, Privilege.boost).d();
        String string = charSequenceD != null ? charSequenceD.toString() : null;
        if (string == null) {
            string = "";
        }
        if (this.isPremiumWeeklySelected) {
            string = getContext().getString(R.string.z6);
        }
        string.getClass();
        intlPurchaseExclusivePrivilegeItemView.m4401e(string, true, this.isPremiumWeeklySelected);
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
        m4402a(this);
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
    public IntlPurchaseExclusivePrivilegeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ IntlPurchaseExclusivePrivilegeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
