package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m88121d2 = {"Ll/v6h0;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/u6h0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/y20;", "", "onItemClick", "Ll/s6h0;", "showcaseComponent", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ll/y20;Ll/s6h0;)V", "position", "Lcom/p1/mobile/putong/core/data/Merchandise;", BaseSei.f14625Y, "(I)Lcom/p1/mobile/putong/core/data/Merchandise;", "", BaseSei.f14626Z, "(I)Z", "Landroid/view/ViewGroup;", "parent", "viewType", c4s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/u6h0;", "holder", "", "A", "(Ll/u6h0;I)V", "getItemCount", "()I", FirebaseAnalytics.Param.QUANTITY, "D", "(Ljava/lang/Integer;)V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "Ll/y20;", Constants.INAPP_DATA_TAG, "Ll/s6h0;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "e", "Ljava/text/NumberFormat;", "priceFormatter", "f", "Ljava/lang/Integer;", "hotQuantity", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class v6h0 extends RecyclerView.Adapter<u6h0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C8928d> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final y20<Integer> onItemClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final s6h0 showcaseComponent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer hotQuantity;

    /* JADX WARN: Multi-variable type inference failed */
    public v6h0(@NotNull Act act, @NotNull List<? extends C8928d> list, @Nullable y20<Integer> y20Var, @NotNull s6h0 s6h0Var) {
        act.getClass();
        list.getClass();
        s6h0Var.getClass();
        this.act = act;
        this.sections = list;
        this.onItemClick = y20Var;
        this.showcaseComponent = s6h0Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        this.priceFormatter = numberInstance;
        this.hotQuantity = 30;
    }

    /* JADX INFO: renamed from: y */
    private final Merchandise m200056y(int position) {
        C8928d.a aVarM54705d;
        Merchandise merchandiseM54784s;
        C8928d c8928d = (C8928d) CollectionsKt.getOrNull(this.sections, position);
        if (c8928d == null || (aVarM54705d = c8928d.m54705d()) == null || (merchandiseM54784s = aVarM54705d.m54784s()) == null || !NullChecker.m82486a(merchandiseM54784s)) {
            return null;
        }
        return merchandiseM54784s;
    }

    /* JADX INFO: renamed from: z */
    private final boolean m200057z(int position) {
        return position == this.showcaseComponent.getSelectedPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull u6h0 holder, int position) {
        holder.getClass();
        Merchandise merchandiseM200056y = m200056y(position);
        if (merchandiseM200056y != null) {
            holder.m194700b(merchandiseM200056y, m200057z(position), this.hotQuantity);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public u6h0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162537d0, parent, false);
        viewInflate.getClass();
        Act act = this.act;
        List<C8928d> list = this.sections;
        NumberFormat numberFormat = this.priceFormatter;
        numberFormat.getClass();
        u6h0 u6h0Var = new u6h0(viewInflate, act, list, numberFormat, this.onItemClick);
        u6h0Var.m194707k();
        return u6h0Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m200060D(@Nullable Integer quantity) {
        if (Intrinsics.m88377d(this.hotQuantity, quantity)) {
            return;
        }
        this.hotQuantity = quantity;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sections.size();
    }

    /* JADX INFO: renamed from: l.v6h0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/v6h0$a;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "payWillingLevel", "c", "(Ljava/util/List;I)I", "a", "(I)Ljava/lang/Integer;", "targetQuantity", "b", "(Ljava/util/List;Ljava/lang/Integer;)I", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Integer m200061a(int payWillingLevel) {
            g6h0 g6h0Var = g6h0.INSTANCE;
            IntRange intRangeM129251a = g6h0Var.m129251a();
            int first = intRangeM129251a.getFirst();
            if (payWillingLevel <= intRangeM129251a.getLast() && first <= payWillingLevel) {
                return 30;
            }
            IntRange intRangeM129252b = g6h0Var.m129252b();
            return (payWillingLevel > intRangeM129252b.getLast() || intRangeM129252b.getFirst() > payWillingLevel) ? null : 15;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0030 A[RETURN] */
        /* JADX INFO: renamed from: b */
        public final int m200062b(List<? extends C8928d> sections, Integer targetQuantity) {
            if (targetQuantity == null) {
                return 0;
            }
            Iterator<? extends C8928d> it = sections.iterator();
            int i = 0;
            while (it.hasNext()) {
                Merchandise merchandiseM54784s = it.next().m54705d().m54784s();
                if (merchandiseM54784s != null && merchandiseM54784s.quantity == targetQuantity.intValue()) {
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
        public final int m200063c(@NotNull List<? extends C8928d> sections, int payWillingLevel) {
            sections.getClass();
            return m200062b(sections, m200061a(payWillingLevel));
        }

        public Companion() {
        }
    }
}
