package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.p000p1.mobile.putong.core.p004ui.settings.intlGender.IntlMoreGenderItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IntlGenderItem;
import com.p1.mobile.putong.data.SubGender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.dac0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b\u0018\u0010!J%\u0010&\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Ll/yko;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/google/android/material/card/MaterialCardView;", "card", "", "checked", "", "J", "(Lcom/google/android/material/card/MaterialCardView;Z)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "convertView", "item", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlGenderItem;II)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)V", "", "data", "Lcom/p1/mobile/putong/data/SubGender;", "option", "L", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "K", "(I)Lcom/p1/mobile/putong/data/IntlGenderItem;", "C", "()I", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "d", "Lcom/p1/mobile/putong/data/SubGender;", "_option", "", "e", "Ljava/lang/Number;", "selectedPosition", "f", "Ljava/util/List;", "Ll/yko$a;", "g", "Ll/yko$a;", "getItemClickListener", "()Ll/yko$a;", "M", "(Ll/yko$a;)V", "itemClickListener", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yko extends dac0<IntlGenderItem> {

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
    public InterfaceC1488a itemClickListener;

    /* JADX INFO: renamed from: l.yko$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ll/yko$a;", "", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1488a {
        /* JADX INFO: renamed from: a */
        void mo12444a(@Nullable SubGender optionId);
    }

    public yko(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
    }

    /* JADX INFO: renamed from: H */
    public static final void m28275H(yko ykoVar, MaterialCardView materialCardView, boolean z) {
        ykoVar.m28277J(materialCardView, z);
    }

    /* JADX INFO: renamed from: I */
    public static final void m28276I(IntlMoreGenderItemView intlMoreGenderItemView, yko ykoVar, int i, IntlGenderItem intlGenderItem, View view) {
        if (intlMoreGenderItemView.isChecked()) {
            ykoVar.selectedPosition = null;
            intlGenderItem.isSelected = false;
            intlMoreGenderItemView.setChecked(false);
            InterfaceC1488a interfaceC1488a = ykoVar.itemClickListener;
            if (interfaceC1488a != null) {
                interfaceC1488a.mo12444a(null);
                return;
            }
            return;
        }
        Number number = ykoVar.selectedPosition;
        if (number != null) {
            ykoVar.data.get(number.intValue()).isSelected = false;
            ykoVar.notifyItemChanged(number.intValue(), "selected");
        }
        ykoVar.selectedPosition = Integer.valueOf(i);
        intlGenderItem.isSelected = true;
        intlMoreGenderItemView.setChecked(true);
        InterfaceC1488a interfaceC1488a2 = ykoVar.itemClickListener;
        if (interfaceC1488a2 != null) {
            interfaceC1488a2.mo12444a(ykoVar.data.get(i).id);
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m28277J(MaterialCardView card, boolean checked) {
        if (card != null) {
            Act act = this.act;
            card.setStrokeColor(checked ? act.getColor(w0c0.f24613I) : act.getColor(w0c0.f24685f));
        }
    }

    /* JADX INFO: renamed from: C */
    public int m28279C() {
        return this.data.size();
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m28280D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        if (layoutInflaterInflater != null) {
            return layoutInflaterInflater.inflate(f6c0.f12021V4, parent, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.card.MaterialCardView, com.p1.mobile.putong.core.ui.settings.intlGender.IntlMoreGenderItemView] */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m28278A(@NotNull View convertView, @Nullable final IntlGenderItem item, int itemViewType, final int position) {
        convertView.getClass();
        if (item != null) {
            final ?? r1 = (IntlMoreGenderItemView) convertView;
            r1.m8956e(item);
            r1.setOnCheckedChangeListener(new MaterialCardView.OnCheckedChangeListener() { // from class: l.tko
                public final void onCheckedChanged(MaterialCardView materialCardView, boolean z) {
                    yko.m28275H(this.f22156a, materialCardView, z);
                }
            });
            xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.vko
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yko.m28276I(r1, this, position, item, view);
                }
            });
            r1.setChecked(item.isSelected);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public IntlGenderItem getItem(int position) {
        IntlGenderItem intlGenderItem = this.data.get(position);
        if (Intrinsics.d(this._option, intlGenderItem.id) && this.selectedPosition == null) {
            this.selectedPosition = Integer.valueOf(position);
            intlGenderItem.isSelected = true;
        }
        return intlGenderItem;
    }

    /* JADX INFO: renamed from: L */
    public final void m28283L(@NotNull List<? extends IntlGenderItem> data, @Nullable SubGender option) {
        data.getClass();
        this.data = data;
        this._option = option;
    }

    /* JADX INFO: renamed from: M */
    public final void m28284M(@Nullable InterfaceC1488a interfaceC1488a) {
        this.itemClickListener = interfaceC1488a;
    }

    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position, @NotNull List<Object> payloads) {
        holder.getClass();
        payloads.getClass();
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onBindViewHolder(holder, position, payloads);
        if (payloads.isEmpty() || !Intrinsics.d("selected", payloads.get(0))) {
            return;
        }
        Object obj = holder.itemView;
        obj.getClass();
        ((IntlMoreGenderItemView) obj).setChecked(false);
    }

    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
