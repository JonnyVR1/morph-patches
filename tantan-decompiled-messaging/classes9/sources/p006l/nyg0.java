package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import l.e30;
import l.m6c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Ll/nyg0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/myg0;", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/e30;", "", "onItemClick", "Ll/kyg0;", "showcaseComponent", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ll/e30;Ll/kyg0;)V", "position", "Lcom/p1/mobile/putong/core/data/Merchandise;", "y", "(I)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "z", "(I)Z", "Landroid/view/ViewGroup;", "parent", "viewType", "C", "(Landroid/view/ViewGroup;I)Ll/myg0;", "holder", "", "A", "(Ll/myg0;I)V", "getItemCount", "()I", "quantity", "D", "(Ljava/lang/Integer;)V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "Ll/e30;", "d", "Ll/kyg0;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "e", "Ljava/text/NumberFormat;", "priceFormatter", "f", "Ljava/lang/Integer;", "hotQuantity", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class nyg0 extends RecyclerView.Adapter<myg0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final e30<Integer> onItemClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final kyg0 showcaseComponent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer hotQuantity;

    public nyg0(@NotNull Act act, @NotNull List<? extends d> list, @Nullable e30<Integer> e30Var, @NotNull kyg0 kyg0Var) {
        act.getClass();
        list.getClass();
        kyg0Var.getClass();
        this.act = act;
        this.sections = list;
        this.onItemClick = e30Var;
        this.showcaseComponent = kyg0Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        this.priceFormatter = numberInstance;
        this.hotQuantity = 30;
    }

    /* JADX INFO: renamed from: y */
    private final Merchandise m20273y(int position) {
        d.a aVarD;
        Merchandise merchandiseS;
        d dVar = (d) CollectionsKt.getOrNull(this.sections, position);
        if (dVar == null || (aVarD = dVar.d()) == null || (merchandiseS = aVarD.s()) == null || !NullChecker.a(merchandiseS)) {
            return null;
        }
        return merchandiseS;
    }

    /* JADX INFO: renamed from: z */
    private final boolean m20274z(int position) {
        return position == this.showcaseComponent.getSelectedPosition();
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull myg0 holder, int position) {
        holder.getClass();
        Merchandise merchandiseM20273y = m20273y(position);
        if (merchandiseM20273y != null) {
            holder.m19596b(merchandiseM20273y, m20274z(position), this.hotQuantity);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public myg0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.d0, parent, false);
        viewInflate.getClass();
        Act act = this.act;
        List<d> list = this.sections;
        NumberFormat numberFormat = this.priceFormatter;
        numberFormat.getClass();
        myg0 myg0Var = new myg0(viewInflate, act, list, numberFormat, this.onItemClick);
        myg0Var.m19603k();
        return myg0Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m20277D(@Nullable Integer quantity) {
        if (Intrinsics.d(this.hotQuantity, quantity)) {
            return;
        }
        this.hotQuantity = quantity;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.sections.size();
    }

    /* JADX INFO: renamed from: l.nyg0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/nyg0$a;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "payWillingLevel", "c", "(Ljava/util/List;I)I", "a", "(I)Ljava/lang/Integer;", "targetQuantity", "b", "(Ljava/util/List;Ljava/lang/Integer;)I", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Integer m20278a(int payWillingLevel) {
            yxg0 yxg0Var = yxg0.INSTANCE;
            IntRange intRangeM28455a = yxg0Var.m28455a();
            int iA = intRangeM28455a.a();
            if (payWillingLevel <= intRangeM28455a.c() && iA <= payWillingLevel) {
                return 30;
            }
            IntRange intRangeM28456b = yxg0Var.m28456b();
            return (payWillingLevel > intRangeM28456b.c() || intRangeM28456b.a() > payWillingLevel) ? null : 15;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0030 A[RETURN] */
        /* JADX INFO: renamed from: b */
        public final int m20279b(List<? extends d> sections, Integer targetQuantity) {
            if (targetQuantity == null) {
                return 0;
            }
            Iterator<? extends d> it = sections.iterator();
            int i = 0;
            while (it.hasNext()) {
                Merchandise merchandiseS = it.next().d().s();
                if (merchandiseS != null && merchandiseS.quantity == targetQuantity.intValue()) {
                    if (i != -1) {
                        return i;
                    }
                    return 0;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return i;
            }
            return 0;
        }

        /* JADX INFO: renamed from: c */
        public final int m20280c(@NotNull List<? extends d> sections, int payWillingLevel) {
            sections.getClass();
            return m20279b(sections, m20278a(payWillingLevel));
        }

        public Companion() {
        }
    }
}
