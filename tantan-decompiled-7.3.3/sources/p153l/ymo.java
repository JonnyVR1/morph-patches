package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.card.MaterialCardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.p058ui.settings.intlGender.IntlMoreGenderItemView;
import com.p051p1.mobile.putong.data.IntlGenderItem;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.SubGender;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b\u0018\u0010!J%\u0010&\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, m88121d2 = {"Ll/ymo;", "Ll/jic0;", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/google/android/material/card/MaterialCardView;", "card", "", "checked", "", "J", "(Lcom/google/android/material/card/MaterialCardView;Z)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "convertView", Item.TYPE, "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlGenderItem;II)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$e0;ILjava/util/List;)V", "", "data", "Lcom/p1/mobile/putong/data/SubGender;", Option.TYPE, "L", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "K", "(I)Lcom/p1/mobile/putong/data/IntlGenderItem;", c4s.C_ZONE, "()I", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/data/SubGender;", "_option", "", "e", "Ljava/lang/Number;", "selectedPosition", "f", "Ljava/util/List;", "Ll/ymo$a;", "g", "Ll/ymo$a;", "getItemClickListener", "()Ll/ymo$a;", "M", "(Ll/ymo$a;)V", "itemClickListener", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ymo extends jic0<IntlGenderItem> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public SubGender _option;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Number selectedPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public List<? extends IntlGenderItem> data;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC21631a itemClickListener;

    /* JADX INFO: renamed from: l.ymo$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m88121d2 = {"Ll/ymo$a;", "", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC21631a {
        /* JADX INFO: renamed from: a */
        void mo102356a(@Nullable SubGender optionId);
    }

    public ymo(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
    }

    /* JADX INFO: renamed from: H */
    public static final void m216725H(ymo ymoVar, MaterialCardView materialCardView, boolean z) {
        ymoVar.m216727J(materialCardView, z);
    }

    /* JADX INFO: renamed from: I */
    public static final void m216726I(IntlMoreGenderItemView intlMoreGenderItemView, ymo ymoVar, int i, IntlGenderItem intlGenderItem, View view) {
        if (intlMoreGenderItemView.isChecked()) {
            ymoVar.selectedPosition = null;
            intlGenderItem.isSelected = false;
            intlMoreGenderItemView.setChecked(false);
            InterfaceC21631a interfaceC21631a = ymoVar.itemClickListener;
            if (interfaceC21631a != null) {
                interfaceC21631a.mo102356a(null);
                return;
            }
            return;
        }
        Number number = ymoVar.selectedPosition;
        if (number != null) {
            ymoVar.data.get(number.intValue()).isSelected = false;
            ymoVar.notifyItemChanged(number.intValue(), MatchFrom.selected);
        }
        ymoVar.selectedPosition = Integer.valueOf(i);
        intlGenderItem.isSelected = true;
        intlMoreGenderItemView.setChecked(true);
        InterfaceC21631a interfaceC21631a2 = ymoVar.itemClickListener;
        if (interfaceC21631a2 != null) {
            interfaceC21631a2.mo102356a(ymoVar.data.get(i).f39609id);
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m216727J(MaterialCardView card, boolean checked) {
        if (card != null) {
            Act act = this.act;
            card.setStrokeColor(checked ? act.getColor(c9c0.f80342I) : act.getColor(c9c0.f80415f));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.data.size();
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        if (layoutInflaterInflater != null) {
            return layoutInflaterInflater.inflate(kec0.f125677W4, parent, false);
        }
        return null;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @Nullable final IntlGenderItem item, int itemViewType, final int position) {
        convertView.getClass();
        if (item != null) {
            final IntlMoreGenderItemView intlMoreGenderItemView = (IntlMoreGenderItemView) convertView;
            intlMoreGenderItemView.m56746e(item);
            intlMoreGenderItemView.setOnCheckedChangeListener(new MaterialCardView.OnCheckedChangeListener() { // from class: l.tmo
                @Override // com.google.android.material.card.MaterialCardView.OnCheckedChangeListener
                public final void onCheckedChanged(MaterialCardView materialCardView, boolean z) {
                    ymo.m216725H(this.f174950a, materialCardView, z);
                }
            });
            bnl0.m105509E0(intlMoreGenderItemView, new View.OnClickListener() { // from class: l.vmo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ymo.m216726I(intlMoreGenderItemView, this, position, item, view);
                }
            });
            intlMoreGenderItemView.setChecked(item.isSelected);
        }
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public IntlGenderItem getItem(int position) {
        IntlGenderItem intlGenderItem = this.data.get(position);
        if (Intrinsics.m88377d(this._option, intlGenderItem.f39609id) && this.selectedPosition == null) {
            this.selectedPosition = Integer.valueOf(position);
            intlGenderItem.isSelected = true;
        }
        return intlGenderItem;
    }

    /* JADX INFO: renamed from: L */
    public final void m216730L(@NotNull List<? extends IntlGenderItem> data, @Nullable SubGender option) {
        data.getClass();
        this.data = data;
        this._option = option;
    }

    /* JADX INFO: renamed from: M */
    public final void m216731M(@Nullable InterfaceC21631a interfaceC21631a) {
        this.itemClickListener = interfaceC21631a;
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
        ((IntlMoreGenderItemView) view).setChecked(false);
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0569e0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
