package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.card.MaterialCardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.SimilarInterestsBaseData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemCard;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemStatusData;
import com.p051p1.mobile.putong.core.p058ui.intloperation.interesting.SimilarInterestsHeaderItem;
import com.p051p1.mobile.putong.core.p058ui.intloperation.interesting.SimilarInterestsItemView;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0004\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002RSB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b\u0018\u0010!JI\u0010,\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020&0%2\u0006\u0010(\u001a\u00020#2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010#¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103J%\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020#042\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010+\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010<R\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006T"}, m88121d2 = {"Ll/knf0;", "Ll/jic0;", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemStatusData;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/google/android/material/card/MaterialCardView;", "card", "", "checked", "", "J", "(Lcom/google/android/material/card/MaterialCardView;Z)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "convertView", Item.TYPE, "G", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/SimilarInterestsItemStatusData;II)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$e0;ILjava/util/List;)V", "", "", "itemData", "", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemData;", "same", IjkMediaMeta.IJKM_KEY_LANGUAGE, "Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "baseData", "type", "M", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;Ljava/lang/String;)V", "K", "(I)Lcom/p1/mobile/putong/core/data/SimilarInterestsItemStatusData;", "getItemViewType", "(I)I", c4s.C_ZONE, "()I", "Lkotlin/Pair;", "L", "(I)Lkotlin/Pair;", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "", "e", "Ljava/lang/Number;", "selectedPosition", "f", "Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "g", "Ljava/util/List;", "data", "h", RXScreenCaptureService.KEY_INDEX, "Ljava/util/Map;", "Ll/knf0$b;", "j", "Ll/knf0$b;", "getItemClickListener", "()Ll/knf0$b;", "N", "(Ll/knf0$b;)V", "itemClickListener", "Companion", "a", "b", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class knf0 extends jic0<SimilarInterestsItemStatusData> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Number selectedPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public SimilarInterestsBaseData baseData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<String> data;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public String language;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Map<String, ? extends SimilarInterestsItemData> same;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public InterfaceC18215b itemClickListener;

    /* JADX INFO: renamed from: l.knf0$b */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m88121d2 = {"Ll/knf0$b;", "", "", "type", "", "onClick", "(Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC18215b {
        void onClick(@NotNull String type);
    }

    public knf0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
        this.language = "";
        this.same = MapsKt.emptyMap();
    }

    /* JADX INFO: renamed from: H */
    public static final void m150513H(knf0 knf0Var, MaterialCardView materialCardView, boolean z) {
        knf0Var.m150515J(materialCardView, z);
    }

    /* JADX INFO: renamed from: I */
    public static final void m150514I(SimilarInterestsItemView similarInterestsItemView, knf0 knf0Var, int i, SimilarInterestsItemStatusData similarInterestsItemStatusData, View view) {
        if (similarInterestsItemView.isChecked()) {
            return;
        }
        Number number = knf0Var.selectedPosition;
        if (number != null) {
            SimilarInterestsItemStatusData first = knf0Var.m150518L(number.intValue()).getFirst();
            if (first != null) {
                first.isSelected = false;
            }
            knf0Var.notifyItemChanged(number.intValue(), MatchFrom.selected);
        }
        knf0Var.selectedPosition = Integer.valueOf(i);
        similarInterestsItemStatusData.isSelected = true;
        similarInterestsItemView.setChecked(true);
        InterfaceC18215b interfaceC18215b = knf0Var.itemClickListener;
        if (interfaceC18215b != null) {
            interfaceC18215b.onClick(knf0Var.data.get(i - 1));
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m150515J(MaterialCardView card, boolean checked) {
        SimilarInterestsItemCard similarInterestsItemCard;
        if (card != null) {
            if (!checked) {
                card.setAlpha(0.8f);
                card.setStrokeColor(0);
                return;
            }
            card.setAlpha(1.0f);
            SimilarInterestsBaseData similarInterestsBaseData = this.baseData;
            if (similarInterestsBaseData == null || (similarInterestsItemCard = similarInterestsBaseData.itemCard) == null) {
                return;
            }
            try {
                card.setStrokeColor(Color.parseColor(TextUtils.isEmpty(similarInterestsItemCard.borderColor) ? similarInterestsItemCard.borderColor : "#FF6489"));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.data.size() + 1;
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        Act act = this.act;
        if (itemViewType == 0) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            if (layoutInflaterInflater != null) {
                return layoutInflaterInflater.inflate(kec0.f125517M4, parent, false);
            }
            return null;
        }
        LayoutInflater layoutInflaterInflater2 = act.inflater();
        if (layoutInflaterInflater2 != null) {
            return layoutInflaterInflater2.inflate(kec0.f125533N4, parent, false);
        }
        return null;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @Nullable final SimilarInterestsItemStatusData item, int itemViewType, final int position) {
        String str;
        Map<String, SimilarInterestsItemLanguagesData> map;
        Map<String, SimilarInterestsItemLanguagesData> map2;
        convertView.getClass();
        if (itemViewType != 0) {
            if (item != null) {
                final SimilarInterestsItemView similarInterestsItemView = (SimilarInterestsItemView) convertView;
                similarInterestsItemView.m47498e(item);
                similarInterestsItemView.setOnCheckedChangeListener(new MaterialCardView.OnCheckedChangeListener() { // from class: l.inf0
                    @Override // com.google.android.material.card.MaterialCardView.OnCheckedChangeListener
                    public final void onCheckedChanged(MaterialCardView materialCardView, boolean z) {
                        knf0.m150513H(this.f115951a, materialCardView, z);
                    }
                });
                bnl0.m105509E0(similarInterestsItemView, new View.OnClickListener() { // from class: l.jnf0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        knf0.m150514I(similarInterestsItemView, this, position, item, view);
                    }
                });
                similarInterestsItemView.setChecked(item.isSelected);
                return;
            }
            return;
        }
        SimilarInterestsItemData similarInterestsItemData = this.same.get("header");
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData = null;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData2 = (similarInterestsItemData == null || (map2 = similarInterestsItemData.multiLanguage) == null) ? null : map2.get(this.language);
        if (similarInterestsItemLanguagesData2 == null) {
            SimilarInterestsItemData similarInterestsItemData2 = this.same.get("header");
            if (similarInterestsItemData2 != null && (map = similarInterestsItemData2.multiLanguage) != null) {
                similarInterestsItemLanguagesData = map.get("en-US");
            }
            similarInterestsItemLanguagesData2 = similarInterestsItemLanguagesData;
        }
        if (similarInterestsItemLanguagesData2 != null) {
            SimilarInterestsHeaderItem similarInterestsHeaderItem = (SimilarInterestsHeaderItem) convertView;
            SimilarInterestsBaseData similarInterestsBaseData = this.baseData;
            if (similarInterestsBaseData == null || (str = similarInterestsBaseData.descColor) == null) {
                str = "#FFFFFF";
            }
            similarInterestsHeaderItem.m47496i0(similarInterestsItemLanguagesData2, str);
        }
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public SimilarInterestsItemStatusData getItem(int position) {
        if (position == 0) {
            return null;
        }
        Pair<SimilarInterestsItemStatusData, String> pairM150518L = m150518L(position);
        SimilarInterestsItemStatusData first = pairM150518L.getFirst();
        String second = pairM150518L.getSecond();
        if (!NullChecker.m82486a(this.selectedPosition) && Intrinsics.m88377d(this.type, second)) {
            this.selectedPosition = Integer.valueOf(position);
            if (first != null) {
                first.isSelected = true;
            }
        }
        return first;
    }

    /* JADX INFO: renamed from: L */
    public final Pair<SimilarInterestsItemStatusData, String> m150518L(int position) {
        Map<String, SimilarInterestsItemLanguagesData> map;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData;
        Map<String, SimilarInterestsItemLanguagesData> map2;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData2;
        String str = this.data.get(position - 1);
        SimilarInterestsItemData similarInterestsItemData = this.same.get(str);
        SimilarInterestsItemStatusData similarInterestsItemStatusData = null;
        SimilarInterestsItemStatusData similarInterestsItemStatusData2 = (similarInterestsItemData == null || (map2 = similarInterestsItemData.multiLanguage) == null || (similarInterestsItemLanguagesData2 = map2.get(this.language)) == null) ? null : similarInterestsItemLanguagesData2.status;
        if (similarInterestsItemStatusData2 == null) {
            SimilarInterestsItemData similarInterestsItemData2 = this.same.get(str);
            if (similarInterestsItemData2 != null && (map = similarInterestsItemData2.multiLanguage) != null && (similarInterestsItemLanguagesData = map.get("en-US")) != null) {
                similarInterestsItemStatusData = similarInterestsItemLanguagesData.status;
            }
            similarInterestsItemStatusData2 = similarInterestsItemStatusData;
        }
        return new Pair<>(similarInterestsItemStatusData2, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m150519M(@NotNull List<String> itemData, @NotNull Map<String, ? extends SimilarInterestsItemData> same, @NotNull String language, @NotNull SimilarInterestsBaseData baseData, @Nullable String type) {
        itemData.getClass();
        same.getClass();
        language.getClass();
        baseData.getClass();
        this.data = itemData;
        this.same = same;
        this.baseData = baseData;
        this.language = language;
        this.type = type;
    }

    /* JADX INFO: renamed from: N */
    public final void m150520N(@Nullable InterfaceC18215b interfaceC18215b) {
        this.itemClickListener = interfaceC18215b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0569e0 holder, int position, @NotNull List<Object> payloads) {
        holder.getClass();
        payloads.getClass();
        super.onBindViewHolder(holder, position, payloads);
        if (payloads.isEmpty() || !Intrinsics.m88377d(MatchFrom.selected, payloads.get(0))) {
            return;
        }
        View view = holder.itemView;
        view.getClass();
        ((SimilarInterestsItemView) view).setChecked(false);
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0569e0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
