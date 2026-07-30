package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.m6c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103¨\u00068"}, d2 = {"Ll/hr5;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/gr5;", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/e30;", "", "onItemClick", "Ll/sq5;", "showcaseComponent", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ll/e30;Ll/sq5;)V", "position", "Lcom/p1/mobile/putong/core/data/Merchandise;", "y", "(I)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "z", "(I)Z", "Landroid/view/ViewGroup;", "parent", "viewType", "C", "(Landroid/view/ViewGroup;I)Ll/gr5;", "holder", "", "A", "(Ll/gr5;I)V", "getItemCount", "()I", "hQuantity", "bestValueQuantity", "D", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "Ll/e30;", "d", "Ll/sq5;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "e", "Ljava/text/NumberFormat;", "priceFormatter", "f", "Ljava/lang/Integer;", "hotQuantity", "g", "bestQuantity", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class hr5 extends RecyclerView.Adapter<gr5> {

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
    public final sq5 showcaseComponent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer hotQuantity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Integer bestQuantity;

    /* JADX WARN: Multi-variable type inference failed */
    public hr5(@NotNull Act act, @NotNull List<? extends C0190d> list, @Nullable e30<Integer> e30Var, @NotNull sq5 sq5Var) {
        act.getClass();
        list.getClass();
        sq5Var.getClass();
        this.act = act;
        this.sections = list;
        this.onItemClick = e30Var;
        this.showcaseComponent = sq5Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        this.priceFormatter = numberInstance;
        this.hotQuantity = 15;
        this.bestQuantity = 30;
    }

    /* JADX INFO: renamed from: y */
    private final Merchandise m14729y(int position) {
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
    private final boolean m14730z(int position) {
        return position == this.showcaseComponent.getSelectedPosition();
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull gr5 holder, int position) {
        holder.getClass();
        Merchandise merchandiseM14729y = m14729y(position);
        if (merchandiseM14729y != null) {
            holder.m14031b(merchandiseM14729y, m14730z(position), this.hotQuantity, this.bestQuantity);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public gr5 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.w, parent, false);
        viewInflate.getClass();
        Act act = this.act;
        List<C0190d> list = this.sections;
        NumberFormat numberFormat = this.priceFormatter;
        numberFormat.getClass();
        gr5 gr5Var = new gr5(viewInflate, act, list, numberFormat, this.onItemClick);
        gr5Var.m14033k();
        return gr5Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m14733D(@Nullable Integer hQuantity, @Nullable Integer bestValueQuantity) {
        if (Intrinsics.d(this.hotQuantity, hQuantity) && Intrinsics.d(this.bestQuantity, bestValueQuantity)) {
            return;
        }
        this.hotQuantity = hQuantity;
        this.bestQuantity = bestValueQuantity;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.sections.size();
    }

    /* JADX INFO: renamed from: l.hr5$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/hr5$a;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "b", "(Ljava/util/List;)I", "targetQuantity", "a", "(Ljava/util/List;I)I", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0038 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0039 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final int m14734a(List<? extends C0190d> sections, int targetQuantity) {
            Merchandise merchandiseM4167s;
            int i = 0;
            for (C0190d c0190d : sections) {
                C0190d.a aVarM4088d = c0190d.m4088d();
                if (aVarM4088d == null || (merchandiseM4167s = aVarM4088d.m4167s()) == null) {
                    C0190d.a aVarM4086b = c0190d.m4086b();
                    merchandiseM4167s = aVarM4086b != null ? aVarM4086b.m4167s() : null;
                }
                if (merchandiseM4167s != null && merchandiseM4167s.quantity == targetQuantity) {
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

        /* JADX INFO: renamed from: b */
        public final int m14735b(@NotNull List<? extends C0190d> sections) {
            sections.getClass();
            try {
                String strF = RemoteConfig.x().F("intl_compliment_iap_config");
                strF.getClass();
                return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optInt("selectedIndex") : m14734a(sections, 15);
            } catch (Exception unused) {
                return m14734a(sections, 15);
            }
        }

        public Companion() {
        }
    }
}
