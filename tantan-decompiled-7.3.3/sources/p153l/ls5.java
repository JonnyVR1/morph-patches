package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103¨\u00068"}, m88121d2 = {"Ll/ls5;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/ks5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ll/y20;", "", "onItemClick", "Ll/wr5;", "showcaseComponent", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ll/y20;Ll/wr5;)V", "position", "Lcom/p1/mobile/putong/core/data/Merchandise;", BaseSei.f14625Y, "(I)Lcom/p1/mobile/putong/core/data/Merchandise;", "", BaseSei.f14626Z, "(I)Z", "Landroid/view/ViewGroup;", "parent", "viewType", c4s.C_ZONE, "(Landroid/view/ViewGroup;I)Ll/ks5;", "holder", "", "A", "(Ll/ks5;I)V", "getItemCount", "()I", "hQuantity", "bestValueQuantity", "D", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/util/List;", "c", "Ll/y20;", Constants.INAPP_DATA_TAG, "Ll/wr5;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "e", "Ljava/text/NumberFormat;", "priceFormatter", "f", "Ljava/lang/Integer;", "hotQuantity", "g", "bestQuantity", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ls5 extends RecyclerView.Adapter<ks5> {

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
    public final wr5 showcaseComponent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Integer hotQuantity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Integer bestQuantity;

    /* JADX WARN: Multi-variable type inference failed */
    public ls5(@NotNull Act act, @NotNull List<? extends C8928d> list, @Nullable y20<Integer> y20Var, @NotNull wr5 wr5Var) {
        act.getClass();
        list.getClass();
        wr5Var.getClass();
        this.act = act;
        this.sections = list;
        this.onItemClick = y20Var;
        this.showcaseComponent = wr5Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        this.priceFormatter = numberInstance;
        this.hotQuantity = 15;
        this.bestQuantity = 30;
    }

    /* JADX INFO: renamed from: y */
    private final Merchandise m155675y(int position) {
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
    private final boolean m155676z(int position) {
        return position == this.showcaseComponent.getSelectedPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ks5 holder, int position) {
        holder.getClass();
        Merchandise merchandiseM155675y = m155675y(position);
        if (merchandiseM155675y != null) {
            holder.m151144b(merchandiseM155675y, m155676z(position), this.hotQuantity, this.bestQuantity);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public ks5 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162617w, parent, false);
        viewInflate.getClass();
        Act act = this.act;
        List<C8928d> list = this.sections;
        NumberFormat numberFormat = this.priceFormatter;
        numberFormat.getClass();
        ks5 ks5Var = new ks5(viewInflate, act, list, numberFormat, this.onItemClick);
        ks5Var.m151146k();
        return ks5Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m155679D(@Nullable Integer hQuantity, @Nullable Integer bestValueQuantity) {
        if (Intrinsics.m88377d(this.hotQuantity, hQuantity) && Intrinsics.m88377d(this.bestQuantity, bestValueQuantity)) {
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

    /* JADX INFO: renamed from: l.ls5$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/ls5$a;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "b", "(Ljava/util/List;)I", "targetQuantity", "a", "(Ljava/util/List;I)I", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0038 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0039 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final int m155680a(List<? extends C8928d> sections, int targetQuantity) {
            Merchandise merchandiseM54784s;
            int i = 0;
            for (C8928d c8928d : sections) {
                C8928d.a aVarM54705d = c8928d.m54705d();
                if (aVarM54705d == null || (merchandiseM54784s = aVarM54705d.m54784s()) == null) {
                    C8928d.a aVarM54703b = c8928d.m54703b();
                    merchandiseM54784s = aVarM54703b != null ? aVarM54703b.m54784s() : null;
                }
                if (merchandiseM54784s != null && merchandiseM54784s.quantity == targetQuantity) {
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
        public final int m155681b(@NotNull List<? extends C8928d> sections) {
            sections.getClass();
            try {
                String strM80485F = RemoteConfig.m80481x().m80485F("intl_compliment_iap_config");
                strM80485F.getClass();
                return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optInt("selectedIndex") : m155680a(sections, 15);
            } catch (Exception unused) {
                return m155680a(sections, 15);
            }
        }

        public Companion() {
        }
    }
}
