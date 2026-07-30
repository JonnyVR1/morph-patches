package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.p000p1.mobile.putong.account.p002ui.moregender.IntlMoreGenderItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IntlGenderItem;
import com.p1.mobile.putong.data.SubGender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.dac0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u0012\u0010\u001bJ%\u0010 \u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Ll/xko;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "convertView", "item", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlGenderItem;II)V", "", "", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)V", "", "data", "Lcom/p1/mobile/putong/data/SubGender;", "option", "M", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "K", "(I)Lcom/p1/mobile/putong/data/IntlGenderItem;", "C", "()I", "L", "()V", "Lcom/google/android/material/card/MaterialCardView;", "card", "", "checked", "J", "(Lcom/google/android/material/card/MaterialCardView;Z)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "d", "Lcom/p1/mobile/putong/data/SubGender;", "_option", "", "e", "Ljava/lang/Number;", "selectedPosition", "f", "Ljava/util/List;", "Ll/xko$a;", "g", "Ll/xko$a;", "getItemClickListener", "()Ll/xko$a;", "N", "(Ll/xko$a;)V", "itemClickListener", "a", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public InterfaceC1442a itemClickListener;

    /* JADX INFO: renamed from: l.xko$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ll/xko$a;", "", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1442a {
        /* JADX INFO: renamed from: a */
        void mo15865a(@Nullable SubGender optionId);
    }

    public xko(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
    }

    /* JADX INFO: renamed from: H */
    public static final void m27270H(xko xkoVar, MaterialCardView materialCardView, boolean z) {
        xkoVar.m27276J(materialCardView, z);
    }

    /* JADX INFO: renamed from: I */
    public static final void m27271I(IntlMoreGenderItemView intlMoreGenderItemView, xko xkoVar, int i, IntlGenderItem intlGenderItem, View view) {
        ilo.INSTANCE.m16735f();
        if (intlMoreGenderItemView.isChecked()) {
            xkoVar.selectedPosition = null;
            intlGenderItem.isSelected = false;
            intlMoreGenderItemView.setChecked(false);
            InterfaceC1442a interfaceC1442a = xkoVar.itemClickListener;
            if (interfaceC1442a != null) {
                interfaceC1442a.mo15865a(null);
                return;
            }
            return;
        }
        Number number = xkoVar.selectedPosition;
        if (number != null) {
            xkoVar.data.get(number.intValue()).isSelected = false;
            xkoVar.notifyItemChanged(number.intValue(), "selected");
        }
        xkoVar.selectedPosition = Integer.valueOf(i);
        intlGenderItem.isSelected = true;
        intlMoreGenderItemView.setChecked(true);
        InterfaceC1442a interfaceC1442a2 = xkoVar.itemClickListener;
        if (interfaceC1442a2 != null) {
            interfaceC1442a2.mo15865a(xkoVar.data.get(i).id);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m27273C() {
        return this.data.size();
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public View m27274D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        if (layoutInflaterInflater != null) {
            return layoutInflaterInflater.inflate(c6c0.f9457y, parent, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.google.android.material.card.MaterialCardView, com.p1.mobile.putong.account.ui.moregender.IntlMoreGenderItemView] */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m27272A(@NotNull View convertView, @Nullable final IntlGenderItem item, int itemViewType, final int position) {
        convertView.getClass();
        if (item != null) {
            ilo.INSTANCE.m16736g();
            final ?? r1 = (IntlMoreGenderItemView) convertView;
            r1.m1099e(item);
            r1.setOnCheckedChangeListener(new MaterialCardView.OnCheckedChangeListener() { // from class: l.uko
                public final void onCheckedChanged(MaterialCardView materialCardView, boolean z) {
                    xko.m27270H(this.f23591a, materialCardView, z);
                }
            });
            r1.setOnClickListener(new View.OnClickListener() { // from class: l.wko
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xko.m27271I(r1, this, position, item, view);
                }
            });
            r1.setChecked(item.isSelected);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m27276J(MaterialCardView card, boolean checked) {
        if (card != null) {
            Act act = this.act;
            card.setStrokeColor(checked ? act.getColor(u0c0.f22403j) : act.getColor(u0c0.f22397d));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public IntlGenderItem getItem(int position) {
        IntlGenderItem intlGenderItem = this.data.get(position);
        if (Intrinsics.d(intlGenderItem.id, this._option) && this.selectedPosition == null) {
            this.selectedPosition = Integer.valueOf(position);
            intlGenderItem.isSelected = true;
        }
        return intlGenderItem;
    }

    /* JADX INFO: renamed from: L */
    public final void m27278L() {
        this.selectedPosition = null;
    }

    /* JADX INFO: renamed from: M */
    public final void m27279M(@NotNull List<? extends IntlGenderItem> data, @Nullable SubGender option) {
        data.getClass();
        this.data = data;
        this._option = option;
    }

    /* JADX INFO: renamed from: N */
    public final void m27280N(@Nullable InterfaceC1442a interfaceC1442a) {
        this.itemClickListener = interfaceC1442a;
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
