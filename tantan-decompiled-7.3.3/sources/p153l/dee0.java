package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.ScrollerGPPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.ScrollerGPUpgradePurchaseSectionView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u001a\u0010.\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010 R\u001a\u00101\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010 R\"\u00105\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, m88121d2 = {"Ll/dee0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/eee0;", "Landroidx/recyclerview/widget/RecyclerView;", "vp", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", FirebaseAnalytics.Param.ITEMS, "Ll/y20;", "sectionClicked", "sectionPayClicked", "upgradeSections", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ll/y20;Ll/y20;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "E", "(Landroid/view/ViewGroup;I)Ll/eee0;", "position", "getItemViewType", "(I)I", c4s.C_ZONE, "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "holder", "", "D", "(Ll/eee0;I)V", "getItemCount", "()I", "a", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/util/List;", Constants.INAPP_DATA_TAG, "Ll/y20;", "e", "f", "g", "I", "getUPGARDE_TYPE", "UPGARDE_TYPE", "h", "getNORMAL_TYPE", "NORMAL_TYPE", "", RXScreenCaptureService.KEY_INDEX, "Z", "isUpgradeSelect", "()Z", "setUpgradeSelect", "(Z)V", "j", "getShowBoostTip", "G", "showBoostTip", "", "k", "Ljava/lang/String;", "getBoostPriceStr", "()Ljava/lang/String;", "F", "(Ljava/lang/String;)V", "boostPriceStr", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dee0 extends RecyclerView.Adapter<eee0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RecyclerView vp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<C8928d> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final y20<C8928d> sectionClicked;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final y20<C8928d> sectionPayClicked;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final List<C8928d> upgradeSections;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int UPGARDE_TYPE;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int NORMAL_TYPE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isUpgradeSelect;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean showBoostTip;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String boostPriceStr;

    /* JADX WARN: Multi-variable type inference failed */
    public dee0(@NotNull RecyclerView recyclerView, @NotNull PurchaseType purchaseType, @NotNull List<? extends C8928d> list, @Nullable y20<C8928d> y20Var, @Nullable y20<C8928d> y20Var2, @Nullable List<? extends C8928d> list2) {
        recyclerView.getClass();
        purchaseType.getClass();
        list.getClass();
        this.vp = recyclerView;
        this.type = purchaseType;
        this.items = list;
        this.sectionClicked = y20Var;
        this.sectionPayClicked = y20Var2;
        this.upgradeSections = list2;
        this.NORMAL_TYPE = 1;
        this.isUpgradeSelect = true;
        this.boostPriceStr = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, com.p1.mobile.putong.core.ui.purchase.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: A */
    public static void m115403A(dee0 dee0Var, int i, Ref.ObjectRef objectRef, View view) {
        dee0Var.vp.smoothScrollToPosition(i);
        List<C8928d> list = dee0Var.upgradeSections;
        list.getClass();
        for (C8928d c8928d : list) {
            if (c8928d.m54713l()) {
                objectRef.element = c8928d;
            }
        }
        if (dee0Var.isUpgradeSelect) {
            y20<C8928d> y20Var = dee0Var.sectionPayClicked;
            if (y20Var != null) {
                y20Var.call(objectRef.element);
                return;
            }
            return;
        }
        Iterator<C8928d> it = dee0Var.items.iterator();
        while (it.hasNext()) {
            it.next().m54723v(false);
        }
        dee0Var.isUpgradeSelect = true;
        y20<C8928d> y20Var2 = dee0Var.sectionClicked;
        if (y20Var2 != null) {
            y20Var2.call(objectRef.element);
        }
        dee0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public static void m115404y(C8928d c8928d, dee0 dee0Var, int i, View view) {
        if (!c8928d.m54707f() && !c8928d.m54707f() && dee0Var.type == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            o1j0.m165634h(R$string.f28129R3);
            return;
        }
        dee0Var.vp.smoothScrollToPosition(i);
        if (c8928d.m54713l()) {
            y20<C8928d> y20Var = dee0Var.sectionPayClicked;
            if (y20Var != null) {
                y20Var.call(c8928d);
                return;
            }
            return;
        }
        Iterator<C8928d> it = dee0Var.items.iterator();
        while (it.hasNext()) {
            it.next().m54723v(false);
        }
        dee0Var.isUpgradeSelect = false;
        c8928d.m54723v(true);
        c8928d.f35377k = true;
        y20<C8928d> y20Var2 = dee0Var.sectionClicked;
        if (y20Var2 != null) {
            y20Var2.call(c8928d);
        }
        dee0Var.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, com.p1.mobile.putong.core.ui.purchase.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: z */
    public static void m115405z(dee0 dee0Var, int i, Ref.ObjectRef objectRef, boolean z, C8928d c8928d, boolean z2) {
        c8928d.getClass();
        if (z2) {
            if (NullChecker.m82486a(dee0Var.sectionClicked)) {
                c8928d.f35377k = true;
                y20<C8928d> y20Var = dee0Var.sectionClicked;
                y20Var.getClass();
                y20Var.call(c8928d);
                return;
            }
            return;
        }
        dee0Var.vp.smoothScrollToPosition(i);
        List<C8928d> list = dee0Var.upgradeSections;
        list.getClass();
        for (C8928d c8928d2 : list) {
            if (c8928d2.m54713l()) {
                objectRef.element = c8928d2;
            }
        }
        if (z) {
            y20<C8928d> y20Var2 = dee0Var.sectionPayClicked;
            if (y20Var2 != null) {
                y20Var2.call(objectRef.element);
                return;
            }
            return;
        }
        Iterator<C8928d> it = dee0Var.items.iterator();
        while (it.hasNext()) {
            it.next().m54723v(false);
        }
        dee0Var.isUpgradeSelect = true;
        y20<C8928d> y20Var3 = dee0Var.sectionClicked;
        if (y20Var3 != null) {
            y20Var3.call(objectRef.element);
        }
        dee0Var.notifyDataSetChanged();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final C8928d m115406C(int position) {
        boolean zM147479J = jyb.m147479J(this.upgradeSections);
        List<C8928d> list = this.items;
        return zM147479J ? list.get(position) : list.get(position - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull eee0 holder, final int position) {
        holder.getClass();
        View view = holder.itemView;
        view.getClass();
        if (view instanceof ScrollerGPPurchaseSectionView) {
            final C8928d c8928dM115406C = m115406C(position);
            C8928d.a aVarM54705d = NullChecker.m82486a(c8928dM115406C.m54705d()) ? c8928dM115406C.m54705d() : c8928dM115406C.m54703b();
            boolean zM54713l = c8928dM115406C.m54713l();
            aVarM54705d.getClass();
            ((ScrollerGPPurchaseSectionView) view).m55573d(zM54713l, aVarM54705d, c8928dM115406C.m54708g(), this.showBoostTip, this.boostPriceStr);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.aee0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dee0.m115404y(c8928dM115406C, this, position, view2);
                }
            });
            return;
        }
        if (view instanceof ScrollerGPUpgradePurchaseSectionView) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            List<C8928d> list = this.upgradeSections;
            objectRef.element = list != null ? list.get(0) : 0;
            ((ScrollerGPUpgradePurchaseSectionView) view).m55581f(this.type, this.isUpgradeSelect, this.upgradeSections, new a30() { // from class: l.bee0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    dee0.m115405z(this.f76370a, position, objectRef, ((Boolean) obj).booleanValue(), (C8928d) obj2, ((Boolean) obj3).booleanValue());
                }
            });
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.cee0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dee0.m115403A(this.f81342a, position, objectRef, view2);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public eee0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View viewInflate;
        parent.getClass();
        if (viewType == this.NORMAL_TYPE) {
            viewInflate = p9r.m171370a(parent.getContext()).inflate(rec0.f162493T, parent, false);
            viewInflate.getClass();
        } else {
            viewInflate = p9r.m171370a(parent.getContext()).inflate(rec0.f162497U, parent, false);
            viewInflate.getClass();
        }
        return new eee0(viewInflate);
    }

    /* JADX INFO: renamed from: F */
    public final void m115409F(@NotNull String str) {
        str.getClass();
        this.boostPriceStr = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m115410G(boolean z) {
        this.showBoostTip = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        boolean zM147479J = jyb.m147479J(this.upgradeSections);
        int size = this.items.size();
        return zM147479J ? size : size + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return (position != 0 || jyb.m147479J(this.upgradeSections)) ? this.NORMAL_TYPE : this.UPGARDE_TYPE;
    }
}
