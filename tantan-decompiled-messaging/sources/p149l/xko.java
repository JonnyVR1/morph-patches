package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.card.MaterialCardView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.moregender.IntlMoreGenderItemView;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.Option;
import com.p046p1.mobile.putong.data.IntlGenderItem;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.SubGender;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u0012\u0010\u001bJ%\u0010 \u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, m87232d2 = {"Ll/xko;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "convertView", Item.TYPE, "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlGenderItem;II)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)V", "", "data", "Lcom/p1/mobile/putong/data/SubGender;", Option.TYPE, "M", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "K", "(I)Lcom/p1/mobile/putong/data/IntlGenderItem;", b2s.C_ZONE, "()I", "L", "()V", "Lcom/google/android/material/card/MaterialCardView;", "card", "", "checked", "J", "(Lcom/google/android/material/card/MaterialCardView;Z)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/data/SubGender;", "_option", "", "e", "Ljava/lang/Number;", "selectedPosition", "f", "Ljava/util/List;", "Ll/xko$a;", "g", "Ll/xko$a;", "getItemClickListener", "()Ll/xko$a;", "N", "(Ll/xko$a;)V", "itemClickListener", "a", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xko extends dac0<IntlGenderItem> {

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
    public InterfaceC21166a itemClickListener;

    /* JADX INFO: renamed from: l.xko$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Ll/xko$a;", "", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC21166a {
        /* JADX INFO: renamed from: a */
        void mo126888a(@Nullable SubGender optionId);
    }

    public xko(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
    }

    /* JADX INFO: renamed from: H */
    public static final void m209813H(xko xkoVar, MaterialCardView materialCardView, boolean z) {
        xkoVar.m209816J(materialCardView, z);
    }

    /* JADX INFO: renamed from: I */
    public static final void m209814I(IntlMoreGenderItemView intlMoreGenderItemView, xko xkoVar, int i, IntlGenderItem intlGenderItem, View view) {
        ilo.INSTANCE.m137013f();
        if (intlMoreGenderItemView.isChecked()) {
            xkoVar.selectedPosition = null;
            intlGenderItem.isSelected = false;
            intlMoreGenderItemView.setChecked(false);
            InterfaceC21166a interfaceC21166a = xkoVar.itemClickListener;
            if (interfaceC21166a != null) {
                interfaceC21166a.mo126888a(null);
                return;
            }
            return;
        }
        Number number = xkoVar.selectedPosition;
        if (number != null) {
            xkoVar.data.get(number.intValue()).isSelected = false;
            xkoVar.notifyItemChanged(number.intValue(), MatchFrom.selected);
        }
        xkoVar.selectedPosition = Integer.valueOf(i);
        intlGenderItem.isSelected = true;
        intlMoreGenderItemView.setChecked(true);
        InterfaceC21166a interfaceC21166a2 = xkoVar.itemClickListener;
        if (interfaceC21166a2 != null) {
            interfaceC21166a2.mo126888a(xkoVar.data.get(i).f38761id);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.data.size();
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo28825D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        if (layoutInflaterInflater != null) {
            return layoutInflaterInflater.inflate(c6c0.f79527y, parent, false);
        }
        return null;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@NotNull View convertView, @Nullable final IntlGenderItem item, int itemViewType, final int position) {
        convertView.getClass();
        if (item != null) {
            ilo.INSTANCE.m137014g();
            final IntlMoreGenderItemView intlMoreGenderItemView = (IntlMoreGenderItemView) convertView;
            intlMoreGenderItemView.m29193e(item);
            intlMoreGenderItemView.setOnCheckedChangeListener(new MaterialCardView.OnCheckedChangeListener() { // from class: l.uko
                @Override // com.google.android.material.card.MaterialCardView.OnCheckedChangeListener
                public final void onCheckedChanged(MaterialCardView materialCardView, boolean z) {
                    xko.m209813H(this.f176948a, materialCardView, z);
                }
            });
            intlMoreGenderItemView.setOnClickListener(new View.OnClickListener() { // from class: l.wko
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xko.m209814I(intlMoreGenderItemView, this, position, item, view);
                }
            });
            intlMoreGenderItemView.setChecked(item.isSelected);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m209816J(MaterialCardView card, boolean checked) {
        if (card != null) {
            Act act = this.act;
            card.setStrokeColor(checked ? act.getColor(u0c0.f172889j) : act.getColor(u0c0.f172883d));
        }
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public IntlGenderItem getItem(int position) {
        IntlGenderItem intlGenderItem = this.data.get(position);
        if (Intrinsics.m87488d(intlGenderItem.f38761id, this._option) && this.selectedPosition == null) {
            this.selectedPosition = Integer.valueOf(position);
            intlGenderItem.isSelected = true;
        }
        return intlGenderItem;
    }

    /* JADX INFO: renamed from: L */
    public final void m209818L() {
        this.selectedPosition = null;
    }

    /* JADX INFO: renamed from: M */
    public final void m209819M(@NotNull List<? extends IntlGenderItem> data, @Nullable SubGender option) {
        data.getClass();
        this.data = data;
        this._option = option;
    }

    /* JADX INFO: renamed from: N */
    public final void m209820N(@Nullable InterfaceC21166a interfaceC21166a) {
        this.itemClickListener = interfaceC21166a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0566d0 holder, int position, @NotNull List<Object> payloads) {
        holder.getClass();
        payloads.getClass();
        super.onBindViewHolder(holder, position, payloads);
        if (payloads.isEmpty() || !Intrinsics.m87488d(MatchFrom.selected, payloads.get(0))) {
            return;
        }
        View view = holder.itemView;
        view.getClass();
        ((IntlMoreGenderItemView) view).setChecked(false);
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0566d0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
