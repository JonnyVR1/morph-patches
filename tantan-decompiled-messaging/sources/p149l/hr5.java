package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103¨\u00068"}, m87232d2 = {"Ll/hr5;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/gr5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/e30;", "", "onItemClick", "Ll/sq5;", "showcaseComponent", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ll/e30;Ll/sq5;)V", "position", "Lcom/p1/mobile/putong/core/data/Merchandise;", BaseSei.f13931Y, "(I)Lcom/p1/mobile/putong/core/data/Merchandise;", "", BaseSei.f13932Z, "(I)Z", "Landroid/view/ViewGroup;", "parent", "viewType", b2s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/gr5;", "holder", "", "A", "(Ll/gr5;I)V", "getItemCount", "()I", "hQuantity", "bestValueQuantity", "D", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "Ll/e30;", Constants.INAPP_DATA_TAG, "Ll/sq5;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "e", "Ljava/text/NumberFormat;", "priceFormatter", "f", "Ljava/lang/Integer;", "hotQuantity", "g", "bestQuantity", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final List<C8765d> sections;

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
    public hr5(@NotNull Act act, @NotNull List<? extends C8765d> list, @Nullable e30<Integer> e30Var, @NotNull sq5 sq5Var) {
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
    private final Merchandise m132614y(int position) {
        Merchandise merchandiseM53601s;
        C8765d c8765d = (C8765d) CollectionsKt.getOrNull(this.sections, position);
        if (c8765d == null) {
            return null;
        }
        C8765d.a aVarM53522d = c8765d.m53522d();
        if (aVarM53522d == null || (merchandiseM53601s = aVarM53522d.m53601s()) == null) {
            C8765d.a aVarM53520b = c8765d.m53520b();
            merchandiseM53601s = aVarM53520b != null ? aVarM53520b.m53601s() : null;
        }
        if (merchandiseM53601s == null || !NullChecker.m81303a(merchandiseM53601s)) {
            return null;
        }
        return merchandiseM53601s;
    }

    /* JADX INFO: renamed from: z */
    private final boolean m132615z(int position) {
        return position == this.showcaseComponent.getSelectedPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull gr5 holder, int position) {
        holder.getClass();
        Merchandise merchandiseM132614y = m132614y(position);
        if (merchandiseM132614y != null) {
            holder.m127674b(merchandiseM132614y, m132615z(position), this.hotQuantity, this.bestQuantity);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public gr5 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.f131657w, parent, false);
        viewInflate.getClass();
        Act act = this.act;
        List<C8765d> list = this.sections;
        NumberFormat numberFormat = this.priceFormatter;
        numberFormat.getClass();
        gr5 gr5Var = new gr5(viewInflate, act, list, numberFormat, this.onItemClick);
        gr5Var.m127676k();
        return gr5Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m132618D(@Nullable Integer hQuantity, @Nullable Integer bestValueQuantity) {
        if (Intrinsics.m87488d(this.hotQuantity, hQuantity) && Intrinsics.m87488d(this.bestQuantity, bestValueQuantity)) {
            return;
        }
        this.hotQuantity = hQuantity;
        this.bestQuantity = bestValueQuantity;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sections.size();
    }

    /* JADX INFO: renamed from: l.hr5$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/hr5$a;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "b", "(Ljava/util/List;)I", "targetQuantity", "a", "(Ljava/util/List;I)I", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0038 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0039 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final int m132619a(List<? extends C8765d> sections, int targetQuantity) {
            Merchandise merchandiseM53601s;
            int i = 0;
            for (C8765d c8765d : sections) {
                C8765d.a aVarM53522d = c8765d.m53522d();
                if (aVarM53522d == null || (merchandiseM53601s = aVarM53522d.m53601s()) == null) {
                    C8765d.a aVarM53520b = c8765d.m53520b();
                    merchandiseM53601s = aVarM53520b != null ? aVarM53520b.m53601s() : null;
                }
                if (merchandiseM53601s != null && merchandiseM53601s.quantity == targetQuantity) {
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
        public final int m132620b(@NotNull List<? extends C8765d> sections) {
            sections.getClass();
            try {
                String strM79302F = RemoteConfig.m79298x().m79302F("intl_compliment_iap_config");
                strM79302F.getClass();
                return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optInt("selectedIndex") : m132619a(sections, 15);
            } catch (Exception unused) {
                return m132619a(sections, 15);
            }
        }

        public Companion() {
        }
    }
}
