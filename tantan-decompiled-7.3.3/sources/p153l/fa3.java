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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m88121d2 = {"Ll/fa3;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/ea3;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/y20;", "", "onItemClick", "Ll/h93;", "showcaseComponent", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ll/y20;Ll/h93;)V", "Landroid/view/ViewGroup;", "parent", "viewType", c4s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/ea3;", "holder", "position", "", "A", "(Ll/ea3;I)V", "getItemCount", "()I", FirebaseAnalytics.Param.QUANTITY, "D", "(Ljava/lang/Integer;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", BaseSei.f14625Y, "(I)Lcom/p1/mobile/putong/core/data/Merchandise;", "", BaseSei.f14626Z, "(I)Z", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "Ll/y20;", Constants.INAPP_DATA_TAG, "Ll/h93;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "e", "Ljava/text/NumberFormat;", "priceFormatter", "f", "Ljava/lang/Integer;", "hotQuantity", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fa3 extends RecyclerView.Adapter<ea3> {

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
    public final h93 showcaseComponent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer hotQuantity;

    /* JADX WARN: Multi-variable type inference failed */
    public fa3(@NotNull Act act, @NotNull List<? extends C8928d> list, @Nullable y20<Integer> y20Var, @NotNull h93 h93Var) {
        act.getClass();
        list.getClass();
        h93Var.getClass();
        this.act = act;
        this.sections = list;
        this.onItemClick = y20Var;
        this.showcaseComponent = h93Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        this.priceFormatter = numberInstance;
        this.hotQuantity = 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ea3 holder, int position) {
        holder.getClass();
        Merchandise merchandiseM124704y = m124704y(position);
        if (merchandiseM124704y != null) {
            holder.m119996b(merchandiseM124704y, m124705z(position), this.hotQuantity);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public ea3 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162581n, parent, false);
        viewInflate.getClass();
        Act act = this.act;
        List<C8928d> list = this.sections;
        NumberFormat numberFormat = this.priceFormatter;
        numberFormat.getClass();
        ea3 ea3Var = new ea3(viewInflate, act, list, numberFormat, this.onItemClick);
        ea3Var.m120005k();
        return ea3Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m124703D(@Nullable Integer quantity) {
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

    /* JADX INFO: renamed from: y */
    public final Merchandise m124704y(int position) {
        Merchandise merchandiseM54784s;
        C8928d c8928d = (C8928d) CollectionsKt.getOrNull(this.sections, position);
        if (c8928d == null) {
            return null;
        }
        C8928d.a aVarM54705d = c8928d.m54705d();
        if (aVarM54705d == null || (merchandiseM54784s = aVarM54705d.m54784s()) == null) {
            C8928d.a aVarM54703b = c8928d.m54703b();
            merchandiseM54784s = aVarM54703b != null ? aVarM54703b.m54784s() : null;
        }
        if (merchandiseM54784s == null || !NullChecker.m82486a(merchandiseM54784s)) {
            return null;
        }
        return merchandiseM54784s;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m124705z(int position) {
        return position == this.showcaseComponent.getSelectedPosition();
    }

    /* JADX INFO: renamed from: l.fa3$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/fa3$a;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "payWillingLevel", "c", "(Ljava/util/List;I)I", "a", "(I)Ljava/lang/Integer;", "targetQuantity", "b", "(Ljava/util/List;Ljava/lang/Integer;)I", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Integer m124706a(int payWillingLevel) {
            w83 w83Var = w83.INSTANCE;
            IntRange intRangeM205397a = w83Var.m205397a();
            int first = intRangeM205397a.getFirst();
            if (payWillingLevel <= intRangeM205397a.getLast() && first <= payWillingLevel) {
                return 10;
            }
            IntRange intRangeM205398b = w83Var.m205398b();
            return (payWillingLevel > intRangeM205398b.getLast() || intRangeM205398b.getFirst() > payWillingLevel) ? null : 3;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x003f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0040 A[RETURN] */
        /* JADX INFO: renamed from: b */
        public final int m124707b(List<? extends C8928d> sections, Integer targetQuantity) {
            Merchandise merchandiseM54784s;
            if (targetQuantity == null) {
                return 0;
            }
            int i = 0;
            for (C8928d c8928d : sections) {
                C8928d.a aVarM54705d = c8928d.m54705d();
                if (aVarM54705d == null || (merchandiseM54784s = aVarM54705d.m54784s()) == null) {
                    C8928d.a aVarM54703b = c8928d.m54703b();
                    merchandiseM54784s = aVarM54703b != null ? aVarM54703b.m54784s() : null;
                }
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
        public final int m124708c(@NotNull List<? extends C8928d> sections, int payWillingLevel) {
            sections.getClass();
            return m124707b(sections, m124706a(payWillingLevel));
        }

        public Companion() {
        }
    }
}
