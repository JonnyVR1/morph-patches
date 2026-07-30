package p006l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.ScrollerGPPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.ScrollerGPUpgradePurchaseSectionView;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import l.e30;
import l.g30;
import l.lsi0;
import l.m6c0;
import l.o7r;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u001a\u0010.\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010 R\u001a\u00101\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010 R\"\u00105\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, d2 = {"Ll/y5e0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/z5e0;", "Landroidx/recyclerview/widget/RecyclerView;", "vp", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "items", "Ll/e30;", "sectionClicked", "sectionPayClicked", "upgradeSections", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;Ll/e30;Ll/e30;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "E", "(Landroid/view/ViewGroup;I)Ll/z5e0;", "position", "getItemViewType", "(I)I", "C", "(I)Lcom/p1/mobile/putong/core/ui/purchase/d;", "holder", "", "D", "(Ll/z5e0;I)V", "getItemCount", "()I", "a", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/util/List;", "d", "Ll/e30;", "e", "f", "g", "I", "getUPGARDE_TYPE", "UPGARDE_TYPE", "h", "getNORMAL_TYPE", "NORMAL_TYPE", "", "i", "Z", "isUpgradeSelect", "()Z", "setUpgradeSelect", "(Z)V", "j", "getShowBoostTip", "G", "showBoostTip", "", "k", "Ljava/lang/String;", "getBoostPriceStr", "()Ljava/lang/String;", "F", "(Ljava/lang/String;)V", "boostPriceStr", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y5e0 extends RecyclerView.Adapter<z5e0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RecyclerView vp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<d> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final e30<d> sectionClicked;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final e30<d> sectionPayClicked;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final List<d> upgradeSections;

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

    public y5e0(@NotNull RecyclerView recyclerView, @NotNull PurchaseType purchaseType, @NotNull List<? extends d> list, @Nullable e30<d> e30Var, @Nullable e30<d> e30Var2, @Nullable List<? extends d> list2) {
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

    /* JADX INFO: renamed from: A */
    public static void m28078A(y5e0 y5e0Var, int i, Ref.ObjectRef objectRef, View view) {
        y5e0Var.vp.smoothScrollToPosition(i);
        List<d> list = y5e0Var.upgradeSections;
        list.getClass();
        for (d dVar : list) {
            if (dVar.l()) {
                objectRef.element = dVar;
            }
        }
        if (y5e0Var.isUpgradeSelect) {
            e30<d> e30Var = y5e0Var.sectionPayClicked;
            if (e30Var != null) {
                e30Var.call(objectRef.element);
                return;
            }
            return;
        }
        Iterator<d> it = y5e0Var.items.iterator();
        while (it.hasNext()) {
            it.next().v(false);
        }
        y5e0Var.isUpgradeSelect = true;
        e30<d> e30Var2 = y5e0Var.sectionClicked;
        if (e30Var2 != null) {
            e30Var2.call(objectRef.element);
        }
        y5e0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public static void m28079y(d dVar, y5e0 y5e0Var, int i, View view) {
        if (!dVar.f() && !dVar.f() && y5e0Var.type == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            lsi0.h(R.string.R3);
            return;
        }
        y5e0Var.vp.smoothScrollToPosition(i);
        if (dVar.l()) {
            e30<d> e30Var = y5e0Var.sectionPayClicked;
            if (e30Var != null) {
                e30Var.call(dVar);
                return;
            }
            return;
        }
        Iterator<d> it = y5e0Var.items.iterator();
        while (it.hasNext()) {
            it.next().v(false);
        }
        y5e0Var.isUpgradeSelect = false;
        dVar.v(true);
        dVar.k = true;
        e30<d> e30Var2 = y5e0Var.sectionClicked;
        if (e30Var2 != null) {
            e30Var2.call(dVar);
        }
        y5e0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: z */
    public static void m28080z(y5e0 y5e0Var, int i, Ref.ObjectRef objectRef, boolean z, d dVar, boolean z2) {
        dVar.getClass();
        if (z2) {
            if (NullChecker.a(y5e0Var.sectionClicked)) {
                dVar.k = true;
                e30<d> e30Var = y5e0Var.sectionClicked;
                e30Var.getClass();
                e30Var.call(dVar);
                return;
            }
            return;
        }
        y5e0Var.vp.smoothScrollToPosition(i);
        List<d> list = y5e0Var.upgradeSections;
        list.getClass();
        for (d dVar2 : list) {
            if (dVar2.l()) {
                objectRef.element = dVar2;
            }
        }
        if (z) {
            e30<d> e30Var2 = y5e0Var.sectionPayClicked;
            if (e30Var2 != null) {
                e30Var2.call(objectRef.element);
                return;
            }
            return;
        }
        Iterator<d> it = y5e0Var.items.iterator();
        while (it.hasNext()) {
            it.next().v(false);
        }
        y5e0Var.isUpgradeSelect = true;
        e30<d> e30Var3 = y5e0Var.sectionClicked;
        if (e30Var3 != null) {
            e30Var3.call(objectRef.element);
        }
        y5e0Var.notifyDataSetChanged();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final d m28081C(int position) {
        boolean zJ = vwb.J(this.upgradeSections);
        List<d> list = this.items;
        return zJ ? list.get(position) : list.get(position - 1);
    }

    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull z5e0 holder, final int position) {
        holder.getClass();
        View view = ((RecyclerView.d0) holder).itemView;
        view.getClass();
        if (view instanceof ScrollerGPPurchaseSectionView) {
            final d dVarM28081C = m28081C(position);
            d.a aVarD = NullChecker.a(dVarM28081C.d()) ? dVarM28081C.d() : dVarM28081C.b();
            boolean zL = dVarM28081C.l();
            aVarD.getClass();
            ((ScrollerGPPurchaseSectionView) view).m7725d(zL, aVarD, dVarM28081C.g(), this.showBoostTip, this.boostPriceStr);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.v5e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    y5e0.m28079y(dVarM28081C, this, position, view2);
                }
            });
            return;
        }
        if (view instanceof ScrollerGPUpgradePurchaseSectionView) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            List<d> list = this.upgradeSections;
            objectRef.element = list != null ? list.get(0) : null;
            ((ScrollerGPUpgradePurchaseSectionView) view).m7733f(this.type, this.isUpgradeSelect, this.upgradeSections, new g30() { // from class: l.w5e0
                /* JADX INFO: renamed from: a */
                public final void m26225a(Object obj, Object obj2, Object obj3) {
                    y5e0.m28080z(this.f24993a, position, objectRef, ((Boolean) obj).booleanValue(), (d) obj2, ((Boolean) obj3).booleanValue());
                }
            });
            xdl0.E0(view, new View.OnClickListener() { // from class: l.x5e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    y5e0.m28078A(this.f27360a, position, objectRef, view2);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public z5e0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View viewInflate;
        parent.getClass();
        if (viewType == this.NORMAL_TYPE) {
            viewInflate = o7r.a(parent.getContext()).inflate(m6c0.T, parent, false);
            viewInflate.getClass();
        } else {
            viewInflate = o7r.a(parent.getContext()).inflate(m6c0.U, parent, false);
            viewInflate.getClass();
        }
        return new z5e0(viewInflate);
    }

    /* JADX INFO: renamed from: F */
    public final void m28084F(@NotNull String str) {
        str.getClass();
        this.boostPriceStr = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m28085G(boolean z) {
        this.showBoostTip = z;
    }

    public int getItemCount() {
        boolean zJ = vwb.J(this.upgradeSections);
        int size = this.items.size();
        return zJ ? size : size + 1;
    }

    public int getItemViewType(int position) {
        return (position != 0 || vwb.J(this.upgradeSections)) ? this.NORMAL_TYPE : this.UPGARDE_TYPE;
    }
}
