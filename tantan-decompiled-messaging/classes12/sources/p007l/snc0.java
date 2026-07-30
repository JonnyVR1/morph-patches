package p007l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.p000p1.mobile.putong.core.p001ui.intloperation.regularsticker.RegularStickerHeaderItem;
import com.p000p1.mobile.putong.core.p001ui.intloperation.regularsticker.RegularStickerItemView;
import com.p000p1.mobile.putong.data.BloodType;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.MatchFrom;
import com.p000p1.mobile.putong.data.Position;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlMarketStickerData;
import com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData;
import com.p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dac0;
import l.f6c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002PQB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b\u0018\u0010!J%\u0010'\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006R"}, d2 = {"Ll/snc0;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/google/android/material/card/MaterialCardView;", MomentMessageType.card, "", "checked", "", "J", "(Lcom/google/android/material/card/MaterialCardView;Z)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", Position.TYPE, "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "convertView", "item", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;II)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "sticker", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "summary", "option", "N", "(Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;I)V", "K", "(I)Lcom/p1/mobile/putong/core/data/IntlMarketStickerOptionsData;", "getItemViewType", "(I)I", "C", "()I", "M", "()V", "L", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "d", "Ljava/lang/Integer;", "_option", "", "e", "Ljava/lang/Number;", "selectedPosition", "f", "Lcom/p1/mobile/putong/core/data/IntlMarketStickerData;", "baseData", "", "g", "Ljava/util/List;", Data.TYPE, "h", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "_summary", "Ll/snc0$b;", RXScreenCaptureService.KEY_INDEX, "Ll/snc0$b;", "getItemClickListener", "()Ll/snc0$b;", BloodType.f189O, "(Ll/snc0$b;)V", "itemClickListener", "Companion", "a", "b", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class snc0 extends dac0<IntlMarketStickerOptionsData> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Integer _option;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Number selectedPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public IntlMarketStickerData baseData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<? extends IntlMarketStickerOptionsData> data;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public IntlMarketSummaryData _summary;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC2491b itemClickListener;

    /* JADX INFO: renamed from: l.snc0$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ll/snc0$b;", "", "", "optionId", "", "a", "(I)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC2491b {
        /* JADX INFO: renamed from: a */
        void mo8971a(int optionId);
    }

    public snc0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
    }

    /* JADX INFO: renamed from: H */
    public static final void m14265H(snc0 snc0Var, MaterialCardView materialCardView, boolean z) {
        snc0Var.m14267J(materialCardView, z);
    }

    /* JADX INFO: renamed from: I */
    public static final void m14266I(RegularStickerItemView regularStickerItemView, snc0 snc0Var, int i, IntlMarketStickerOptionsData intlMarketStickerOptionsData, View view) {
        foc0.INSTANCE.m10250d();
        if (regularStickerItemView.isChecked()) {
            return;
        }
        Number number = snc0Var.selectedPosition;
        if (number != null) {
            IntlMarketStickerOptionsData intlMarketStickerOptionsDataM14273L = snc0Var.m14273L(number.intValue());
            if (intlMarketStickerOptionsDataM14273L != null) {
                intlMarketStickerOptionsDataM14273L.isSelected = false;
            }
            snc0Var.notifyItemChanged(number.intValue(), MatchFrom.selected);
        }
        snc0Var.selectedPosition = Integer.valueOf(i);
        intlMarketStickerOptionsData.isSelected = true;
        regularStickerItemView.setChecked(true);
        InterfaceC2491b interfaceC2491b = snc0Var.itemClickListener;
        if (interfaceC2491b != null) {
            interfaceC2491b.mo8971a(snc0Var.data.get(i - 1).id);
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m14267J(MaterialCardView card, boolean checked) {
        if (card != null) {
            IntlMarketStickerData intlMarketStickerData = this.baseData;
            if (!checked) {
                if (intlMarketStickerData != null) {
                    card.setStrokeColor(Color.parseColor(intlMarketStickerData.bg_border_color));
                }
            } else if (intlMarketStickerData != null) {
                try {
                    card.setStrokeColor(Color.parseColor(intlMarketStickerData.focus_border_color));
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public int m14269C() {
        return this.data.size() + 1;
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m14270D(@Nullable ViewGroup parent, int itemViewType) {
        Act act = this.act;
        if (itemViewType == 0) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            if (layoutInflaterInflater != null) {
                return layoutInflaterInflater.inflate(f6c0.H5, parent, false);
            }
            return null;
        }
        LayoutInflater layoutInflaterInflater2 = act.inflater();
        if (layoutInflaterInflater2 != null) {
            return layoutInflaterInflater2.inflate(f6c0.I5, parent, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.card.MaterialCardView, com.p1.mobile.putong.core.ui.intloperation.regularsticker.RegularStickerItemView] */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m14268A(@NotNull View convertView, @Nullable final IntlMarketStickerOptionsData item, int itemViewType, final int position) {
        convertView.getClass();
        if (itemViewType == 0) {
            ((RegularStickerHeaderItem) convertView).m10i0(this._summary);
            return;
        }
        if (item != null) {
            foc0.INSTANCE.m10251e();
            final ?? r1 = (RegularStickerItemView) convertView;
            r1.m12e(this.baseData, item);
            r1.setOnCheckedChangeListener(new MaterialCardView.OnCheckedChangeListener() { // from class: l.qnc0
                public final void onCheckedChanged(MaterialCardView materialCardView, boolean z) {
                    snc0.m14265H(this.f12294a, materialCardView, z);
                }
            });
            xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.rnc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    snc0.m14266I(r1, this, position, item, view);
                }
            });
            r1.setChecked(item.isSelected);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public IntlMarketStickerOptionsData getItem(int position) {
        if (position == 0) {
            return null;
        }
        IntlMarketStickerOptionsData intlMarketStickerOptionsDataM14273L = m14273L(position);
        Integer num = this._option;
        int i = intlMarketStickerOptionsDataM14273L.id;
        if (num != null && num.intValue() == i && this.selectedPosition == null) {
            this.selectedPosition = Integer.valueOf(position);
            intlMarketStickerOptionsDataM14273L.isSelected = true;
        }
        return intlMarketStickerOptionsDataM14273L;
    }

    /* JADX INFO: renamed from: L */
    public final IntlMarketStickerOptionsData m14273L(int position) {
        return this.data.get(position - 1);
    }

    /* JADX INFO: renamed from: M */
    public final void m14274M() {
        this.selectedPosition = null;
    }

    /* JADX INFO: renamed from: N */
    public final void m14275N(@NotNull IntlMarketStickerData sticker, @NotNull IntlMarketSummaryData summary, int option) {
        sticker.getClass();
        summary.getClass();
        List<? extends IntlMarketStickerOptionsData> list = sticker.options;
        list.getClass();
        this.data = list;
        this.baseData = sticker;
        this._summary = summary;
        this._option = Integer.valueOf(option);
    }

    /* JADX INFO: renamed from: O */
    public final void m14276O(@Nullable InterfaceC2491b interfaceC2491b) {
        this.itemClickListener = interfaceC2491b;
    }

    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position, @NotNull List<Object> payloads) {
        holder.getClass();
        payloads.getClass();
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onBindViewHolder(holder, position, payloads);
        if (payloads.isEmpty() || !Intrinsics.d(MatchFrom.selected, payloads.get(0))) {
            return;
        }
        Object obj = holder.itemView;
        obj.getClass();
        ((RegularStickerItemView) obj).setChecked(false);
    }

    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
