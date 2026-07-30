package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.ScrollerGPPurchaseSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.ScrollerGPUpgradePurchaseSectionView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u001a\u0010.\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010 R\u001a\u00101\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010 R\"\u00105\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, m87232d2 = {"Ll/y5e0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/z5e0;", "Landroidx/recyclerview/widget/RecyclerView;", "vp", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", FirebaseAnalytics.Param.ITEMS, "Ll/e30;", "sectionClicked", "sectionPayClicked", "upgradeSections", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ll/e30;Ll/e30;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "E", "(Landroid/view/ViewGroup;I)Ll/z5e0;", "position", "getItemViewType", "(I)I", b2s.C_ZONE, "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "holder", "", "D", "(Ll/z5e0;I)V", "getItemCount", "()I", "a", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/util/List;", Constants.INAPP_DATA_TAG, "Ll/e30;", "e", "f", "g", "I", "getUPGARDE_TYPE", "UPGARDE_TYPE", "h", "getNORMAL_TYPE", "NORMAL_TYPE", "", RXScreenCaptureService.KEY_INDEX, "Z", "isUpgradeSelect", "()Z", "setUpgradeSelect", "(Z)V", "j", "getShowBoostTip", "G", "showBoostTip", "", "k", "Ljava/lang/String;", "getBoostPriceStr", "()Ljava/lang/String;", "F", "(Ljava/lang/String;)V", "boostPriceStr", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class y5e0 extends RecyclerView.Adapter<z5e0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RecyclerView vp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<C8765d> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final e30<C8765d> sectionClicked;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final e30<C8765d> sectionPayClicked;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final List<C8765d> upgradeSections;

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
    public y5e0(@NotNull RecyclerView recyclerView, @NotNull PurchaseType purchaseType, @NotNull List<? extends C8765d> list, @Nullable e30<C8765d> e30Var, @Nullable e30<C8765d> e30Var2, @Nullable List<? extends C8765d> list2) {
        recyclerView.getClass();
        purchaseType.getClass();
        list.getClass();
        this.vp = recyclerView;
        this.type = purchaseType;
        this.items = list;
        this.sectionClicked = e30Var;
        this.sectionPayClicked = e30Var2;
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
    public static void m212975A(y5e0 y5e0Var, int i, Ref.ObjectRef objectRef, View view) {
        y5e0Var.vp.smoothScrollToPosition(i);
        List<C8765d> list = y5e0Var.upgradeSections;
        list.getClass();
        for (C8765d c8765d : list) {
            if (c8765d.m53530l()) {
                objectRef.element = c8765d;
            }
        }
        if (y5e0Var.isUpgradeSelect) {
            e30<C8765d> e30Var = y5e0Var.sectionPayClicked;
            if (e30Var != null) {
                e30Var.call(objectRef.element);
                return;
            }
            return;
        }
        Iterator<C8765d> it = y5e0Var.items.iterator();
        while (it.hasNext()) {
            it.next().m53540v(false);
        }
        y5e0Var.isUpgradeSelect = true;
        e30<C8765d> e30Var2 = y5e0Var.sectionClicked;
        if (e30Var2 != null) {
            e30Var2.call(objectRef.element);
        }
        y5e0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public static void m212976y(C8765d c8765d, y5e0 y5e0Var, int i, View view) {
        if (!c8765d.m53524f() && !c8765d.m53524f() && y5e0Var.type == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            lsi0.m151578h(R$string.f27281R3);
            return;
        }
        y5e0Var.vp.smoothScrollToPosition(i);
        if (c8765d.m53530l()) {
            e30<C8765d> e30Var = y5e0Var.sectionPayClicked;
            if (e30Var != null) {
                e30Var.call(c8765d);
                return;
            }
            return;
        }
        Iterator<C8765d> it = y5e0Var.items.iterator();
        while (it.hasNext()) {
            it.next().m53540v(false);
        }
        y5e0Var.isUpgradeSelect = false;
        c8765d.m53540v(true);
        c8765d.f34529k = true;
        e30<C8765d> e30Var2 = y5e0Var.sectionClicked;
        if (e30Var2 != null) {
            e30Var2.call(c8765d);
        }
        y5e0Var.notifyDataSetChanged();
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
    public static void m212977z(y5e0 y5e0Var, int i, Ref.ObjectRef objectRef, boolean z, C8765d c8765d, boolean z2) {
        c8765d.getClass();
        if (z2) {
            if (NullChecker.m81303a(y5e0Var.sectionClicked)) {
                c8765d.f34529k = true;
                e30<C8765d> e30Var = y5e0Var.sectionClicked;
                e30Var.getClass();
                e30Var.call(c8765d);
                return;
            }
            return;
        }
        y5e0Var.vp.smoothScrollToPosition(i);
        List<C8765d> list = y5e0Var.upgradeSections;
        list.getClass();
        for (C8765d c8765d2 : list) {
            if (c8765d2.m53530l()) {
                objectRef.element = c8765d2;
            }
        }
        if (z) {
            e30<C8765d> e30Var2 = y5e0Var.sectionPayClicked;
            if (e30Var2 != null) {
                e30Var2.call(objectRef.element);
                return;
            }
            return;
        }
        Iterator<C8765d> it = y5e0Var.items.iterator();
        while (it.hasNext()) {
            it.next().m53540v(false);
        }
        y5e0Var.isUpgradeSelect = true;
        e30<C8765d> e30Var3 = y5e0Var.sectionClicked;
        if (e30Var3 != null) {
            e30Var3.call(objectRef.element);
        }
        y5e0Var.notifyDataSetChanged();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final C8765d m212978C(int position) {
        boolean zM200296J = vwb.m200296J(this.upgradeSections);
        List<C8765d> list = this.items;
        return zM200296J ? list.get(position) : list.get(position - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull z5e0 holder, final int position) {
        holder.getClass();
        View view = holder.itemView;
        view.getClass();
        if (view instanceof ScrollerGPPurchaseSectionView) {
            final C8765d c8765dM212978C = m212978C(position);
            C8765d.a aVarM53522d = NullChecker.m81303a(c8765dM212978C.m53522d()) ? c8765dM212978C.m53522d() : c8765dM212978C.m53520b();
            boolean zM53530l = c8765dM212978C.m53530l();
            aVarM53522d.getClass();
            ((ScrollerGPPurchaseSectionView) view).m54390d(zM53530l, aVarM53522d, c8765dM212978C.m53525g(), this.showBoostTip, this.boostPriceStr);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.v5e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    y5e0.m212976y(c8765dM212978C, this, position, view2);
                }
            });
            return;
        }
        if (view instanceof ScrollerGPUpgradePurchaseSectionView) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            List<C8765d> list = this.upgradeSections;
            objectRef.element = list != null ? list.get(0) : 0;
            ((ScrollerGPUpgradePurchaseSectionView) view).m54398f(this.type, this.isUpgradeSelect, this.upgradeSections, new g30() { // from class: l.w5e0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    y5e0.m212977z(this.f184671a, position, objectRef, ((Boolean) obj).booleanValue(), (C8765d) obj2, ((Boolean) obj3).booleanValue());
                }
            });
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.x5e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    y5e0.m212975A(this.f191132a, position, objectRef, view2);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public z5e0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View viewInflate;
        parent.getClass();
        if (viewType == this.NORMAL_TYPE) {
            viewInflate = o7r.m163037a(parent.getContext()).inflate(m6c0.f131533T, parent, false);
            viewInflate.getClass();
        } else {
            viewInflate = o7r.m163037a(parent.getContext()).inflate(m6c0.f131537U, parent, false);
            viewInflate.getClass();
        }
        return new z5e0(viewInflate);
    }

    /* JADX INFO: renamed from: F */
    public final void m212981F(@NotNull String str) {
        str.getClass();
        this.boostPriceStr = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m212982G(boolean z) {
        this.showBoostTip = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        boolean zM200296J = vwb.m200296J(this.upgradeSections);
        int size = this.items.size();
        return zM200296J ? size : size + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return (position != 0 || vwb.m200296J(this.upgradeSections)) ? this.NORMAL_TYPE : this.UPGARDE_TYPE;
    }
}
