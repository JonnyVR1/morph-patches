package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Ll/q93;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/p93;", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/e30;", "", "onItemClick", "Ll/s83;", "showcaseComponent", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ll/e30;Ll/s83;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "C", "(Landroid/view/ViewGroup;I)Ll/p93;", "holder", "position", "", "A", "(Ll/p93;I)V", "getItemCount", "()I", "quantity", "D", "(Ljava/lang/Integer;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "y", "(I)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "z", "(I)Z", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "Ll/e30;", "d", "Ll/s83;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "e", "Ljava/text/NumberFormat;", "priceFormatter", "f", "Ljava/lang/Integer;", "hotQuantity", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class q93 extends RecyclerView.Adapter<p93> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C0190d> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final e30<Integer> onItemClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final s83 showcaseComponent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer hotQuantity;

    /* JADX WARN: Multi-variable type inference failed */
    public q93(@NotNull Act act, @NotNull List<? extends C0190d> list, @Nullable e30<Integer> e30Var, @NotNull s83 s83Var) {
        act.getClass();
        list.getClass();
        s83Var.getClass();
        this.act = act;
        this.sections = list;
        this.onItemClick = e30Var;
        this.showcaseComponent = s83Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        this.priceFormatter = numberInstance;
        this.hotQuantity = 3;
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull p93 holder, int position) {
        holder.getClass();
        Merchandise merchandiseM21109y = m21109y(position);
        if (merchandiseM21109y != null) {
            holder.m20143b(merchandiseM21109y, m21110z(position), this.hotQuantity);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public p93 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.n, parent, false);
        viewInflate.getClass();
        Act act = this.act;
        List<C0190d> list = this.sections;
        NumberFormat numberFormat = this.priceFormatter;
        numberFormat.getClass();
        p93 p93Var = new p93(viewInflate, act, list, numberFormat, this.onItemClick);
        p93Var.m20152k();
        return p93Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m21108D(@Nullable Integer quantity) {
        if (Intrinsics.d(this.hotQuantity, quantity)) {
            return;
        }
        this.hotQuantity = quantity;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.sections.size();
    }

    /* JADX INFO: renamed from: y */
    public final Merchandise m21109y(int position) {
        Merchandise merchandiseM4167s;
        C0190d c0190d = (C0190d) CollectionsKt.getOrNull(this.sections, position);
        if (c0190d == null) {
            return null;
        }
        C0190d.a aVarM4088d = c0190d.m4088d();
        if (aVarM4088d == null || (merchandiseM4167s = aVarM4088d.m4167s()) == null) {
            C0190d.a aVarM4086b = c0190d.m4086b();
            merchandiseM4167s = aVarM4086b != null ? aVarM4086b.m4167s() : null;
        }
        if (merchandiseM4167s == null || !NullChecker.a(merchandiseM4167s)) {
            return null;
        }
        return merchandiseM4167s;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m21110z(int position) {
        return position == this.showcaseComponent.getSelectedPosition();
    }

    /* JADX INFO: renamed from: l.q93$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/q93$a;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "payWillingLevel", "c", "(Ljava/util/List;I)I", "a", "(I)Ljava/lang/Integer;", "targetQuantity", "b", "(Ljava/util/List;Ljava/lang/Integer;)I", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Integer m21111a(int payWillingLevel) {
            h83 h83Var = h83.INSTANCE;
            IntRange intRangeM14281a = h83Var.m14281a();
            int iA = intRangeM14281a.a();
            if (payWillingLevel <= intRangeM14281a.c() && iA <= payWillingLevel) {
                return 10;
            }
            IntRange intRangeM14282b = h83Var.m14282b();
            return (payWillingLevel > intRangeM14282b.c() || intRangeM14282b.a() > payWillingLevel) ? null : 3;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x003f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0040 A[RETURN] */
        /* JADX INFO: renamed from: b */
        public final int m21112b(List<? extends C0190d> sections, Integer targetQuantity) {
            Merchandise merchandiseM4167s;
            if (targetQuantity == null) {
                return 0;
            }
            int i = 0;
            for (C0190d c0190d : sections) {
                C0190d.a aVarM4088d = c0190d.m4088d();
                if (aVarM4088d == null || (merchandiseM4167s = aVarM4088d.m4167s()) == null) {
                    C0190d.a aVarM4086b = c0190d.m4086b();
                    merchandiseM4167s = aVarM4086b != null ? aVarM4086b.m4167s() : null;
                }
                if (merchandiseM4167s != null && merchandiseM4167s.quantity == targetQuantity.intValue()) {
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
        public final int m21113c(@NotNull List<? extends C0190d> sections, int payWillingLevel) {
            sections.getClass();
            return m21112b(sections, m21111a(payWillingLevel));
        }

        public Companion() {
        }
    }
}
