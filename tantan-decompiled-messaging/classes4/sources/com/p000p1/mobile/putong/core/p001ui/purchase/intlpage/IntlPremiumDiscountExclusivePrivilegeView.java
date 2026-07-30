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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import l.b1c0;
import l.d3c0;
import l.dyo;
import l.jto;
import l.m6c0;
import l.sab0;
import l.t100;
import l.z4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.nto;
import p002l.oto;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J5\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u001b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0011J5\u0010%\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0011J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0011J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010\u0011R\"\u0010/\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountExclusivePrivilegeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "b", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "f", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "h", "", "Ll/oto$a;", "groups", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Ll/oto$b;", "e", "(Ljava/util/List;)Ljava/util/ArrayList;", "j", "title", "privileges", "", "isLastGroup", "g", "(Ljava/lang/String;Ljava/util/List;Lcom/p1/mobile/putong/core/data/PurchaseType;Z)V", "c", "i", "d", "Landroid/widget/FrameLayout;", "get_root_view", "()Landroid/widget/FrameLayout;", "set_root_view", "(Landroid/widget/FrameLayout;)V", "_root_view", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "get_container", "()Landroid/widget/LinearLayout;", "set_container", "(Landroid/widget/LinearLayout;)V", "_container", "Lv/VText;", "Lv/VText;", "get_privilege_title", "()Lv/VText;", "set_privilege_title", "(Lv/VText;)V", "_privilege_title", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlPremiumDiscountExclusivePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _root_view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _privilege_title;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPremiumDiscountExclusivePrivilegeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m4286a(View view) {
        jto.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Act m4287b() {
        Act context = getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: c */
    public final void m4288c(PurchaseType purchaseType) {
        if (sab0.v(purchaseType)) {
            View viewInflate = m4287b().inflater().inflate(m6c0.A, (ViewGroup) get_container(), false);
            viewInflate.getClass();
            IntlPremiumDiscountExclusivePrivilegeItemView intlPremiumDiscountExclusivePrivilegeItemView = (IntlPremiumDiscountExclusivePrivilegeItemView) viewInflate;
            intlPremiumDiscountExclusivePrivilegeItemView.m4285c();
            get_container().addView(intlPremiumDiscountExclusivePrivilegeItemView);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4289d(PurchaseType purchaseType) {
        if (sab0.q(purchaseType)) {
            ViewGroup.LayoutParams layoutParams = get_root_view().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.topMargin = t100.d(12.0f);
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.bottomMargin = t100.d(12.0f);
            get_root_view().setLayoutParams(marginLayoutParams);
            get_root_view().setBackground(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList<Pair<String, List<oto.b>>> m4290e(List<oto.a> groups) {
        HashSet hashSet = new HashSet();
        ArrayList<Pair<String, List<oto.b>>> arrayList = new ArrayList<>();
        for (oto.a aVar : groups) {
            ArrayList arrayList2 = new ArrayList();
            for (oto.b bVar : aVar.a()) {
                if (bVar.b() && !hashSet.contains(bVar.a())) {
                    arrayList2.add(bVar);
                    hashSet.add(bVar.a());
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new Pair<>(aVar.b(), arrayList2));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m4291f(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        get_container().removeAllViews();
        if (sab0.q(purchaseType) || sab0.v(purchaseType)) {
            m4293h(purchaseType);
        } else {
            m4294i(purchaseType);
        }
        m4289d(purchaseType);
    }

    /* JADX INFO: renamed from: g */
    public final void m4292g(String title, List<oto.b> privileges, PurchaseType purchaseType, boolean isLastGroup) {
        View viewInflate = m4287b().inflater().inflate(m6c0.D, (ViewGroup) get_container(), false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = isLastGroup ? 0 : sab0.q(purchaseType) ? t100.d(12.0f) : t100.d(20.0f);
        viewInflate.setLayoutParams(layoutParams);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(z4c0.U);
        ViewGroup viewGroup = (LinearLayout) viewInflate.findViewById(z4c0.T);
        VText_NoTopPadding vText_NoTopPaddingFindViewById = viewInflate.findViewById(z4c0.V);
        vText_NoTopPaddingFindViewById.setText(title);
        nto ntoVar = nto.INSTANCE;
        frameLayout.setBackground(ntoVar.m19008b());
        vText_NoTopPaddingFindViewById.setTextColor(Color.parseColor("#E6CF9C"));
        vText_NoTopPaddingFindViewById.setBackground(ntoVar.m19007a());
        int size = privileges.size();
        for (int i = 0; i < size; i++) {
            View viewInflate2 = m4287b().inflater().inflate(m6c0.A, viewGroup, false);
            viewInflate2.getClass();
            IntlPremiumDiscountExclusivePrivilegeItemView intlPremiumDiscountExclusivePrivilegeItemView = (IntlPremiumDiscountExclusivePrivilegeItemView) viewInflate2;
            if (i == privileges.size() - 1) {
                ViewGroup.LayoutParams layoutParams2 = intlPremiumDiscountExclusivePrivilegeItemView.getLayoutParams();
                layoutParams2.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.bottomMargin = 0;
                intlPremiumDiscountExclusivePrivilegeItemView.setLayoutParams(marginLayoutParams);
            }
            intlPremiumDiscountExclusivePrivilegeItemView.m4284b(purchaseType, privileges.get(i).a());
            viewGroup.addView(intlPremiumDiscountExclusivePrivilegeItemView);
        }
        get_container().addView(viewInflate);
    }

    @NotNull
    public final LinearLayout get_container() {
        LinearLayout linearLayout = this._container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_container");
        return null;
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

    /* JADX INFO: renamed from: h */
    public final void m4293h(PurchaseType purchaseType) {
        m4295j(purchaseType);
        oto otoVar = new oto(m4287b());
        ArrayList<Pair<String, List<oto.b>>> arrayListM4290e = m4290e(otoVar.m19748b(purchaseType, otoVar.m19749c(purchaseType)));
        int i = 0;
        for (Object obj : arrayListM4290e) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            String str = (String) pair.getFirst();
            List<oto.b> list = (List) pair.getSecond();
            boolean z = true;
            if (i != arrayListM4290e.size() - 1) {
                z = false;
            }
            m4292g(str, list, purchaseType, z);
            i = i2;
        }
        m4288c(purchaseType);
    }

    /* JADX INFO: renamed from: i */
    public final void m4294i(PurchaseType purchaseType) {
        get_privilege_title().setVisibility(0);
        get_privilege_title().setText(m4287b().getString(R.string.V4));
        get_privilege_title().setTextColor(CoreModule.b.getResources().getColor(b1c0.d));
        get_privilege_title().setBackground(CoreModule.b.getResources().getDrawable(d3c0.m1));
        get_root_view().setBackground(CoreModule.b.getResources().getDrawable(d3c0.j1));
        ViewGroup.LayoutParams layoutParams = get_root_view().getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = t100.d(16.0f);
        marginLayoutParams.rightMargin = t100.d(16.0f);
        marginLayoutParams.topMargin = t100.d(15.0f);
        marginLayoutParams.bottomMargin = t100.d(18.0f);
        get_root_view().setLayoutParams(marginLayoutParams);
        ArrayList arrayListD = dyo.d();
        List<oto.b> listM19749c = new oto(m4287b()).m19749c(purchaseType);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM19749c, 10)), 16));
        for (oto.b bVar : listM19749c) {
            Pair pairA = TuplesKt.a(bVar.a(), Boolean.valueOf(bVar.b()));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        Iterator it = arrayListD.iterator();
        it.getClass();
        while (it.hasNext()) {
            Privilege privilege = (Privilege) it.next();
            if (Intrinsics.d(linkedHashMap.get(privilege), Boolean.TRUE)) {
                View viewInflate = m4287b().inflater().inflate(m6c0.A, (ViewGroup) get_container(), false);
                viewInflate.getClass();
                IntlPremiumDiscountExclusivePrivilegeItemView intlPremiumDiscountExclusivePrivilegeItemView = (IntlPremiumDiscountExclusivePrivilegeItemView) viewInflate;
                privilege.getClass();
                intlPremiumDiscountExclusivePrivilegeItemView.m4284b(purchaseType, privilege);
                get_container().addView(intlPremiumDiscountExclusivePrivilegeItemView);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4295j(PurchaseType purchaseType) {
        if (sab0.q(purchaseType)) {
            get_privilege_title().setVisibility(8);
            ViewGroup.LayoutParams layoutParams = get_container().getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = t100.d(12.0f);
            marginLayoutParams.bottomMargin = t100.d(16.0f);
            get_container().setLayoutParams(marginLayoutParams);
            return;
        }
        get_privilege_title().setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = get_container().getLayoutParams();
        layoutParams2.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = t100.d(30.0f);
        marginLayoutParams2.bottomMargin = t100.d(20.0f);
        get_container().setLayoutParams(marginLayoutParams2);
        get_privilege_title().setText(m4287b().getString(R.string.P5));
        get_privilege_title().setTextColor(Color.parseColor("#432053"));
        get_privilege_title().setBackground(m4287b().getResources().getDrawable(d3c0.o1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4286a(this);
    }

    public final void set_container(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._container = linearLayout;
    }

    public final void set_privilege_title(@NotNull VText vText) {
        vText.getClass();
        this._privilege_title = vText;
    }

    public final void set_root_view(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._root_view = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPremiumDiscountExclusivePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlPremiumDiscountExclusivePrivilegeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
