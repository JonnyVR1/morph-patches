package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.List;
import l.dac0;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class drj extends dac0<ihs> {

    /* JADX INFO: renamed from: c */
    public final List<ihs> f9412c;

    /* JADX INFO: renamed from: d */
    public final ahs<?> f9413d;

    public drj(ahs<?> ahsVar, List<ihs> list) {
        this.f9413d = ahsVar;
        this.f9412c = list;
    }

    /* JADX INFO: renamed from: C */
    public int m12008C() {
        return this.f9412c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m12009D(ViewGroup viewGroup, int i) {
        return vxj.m24195c(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m12007A(View view, ihs ihsVar, int i, int i2) {
        ((LiveGiftItemView) view).m7023U0(ihsVar, this.f9413d, i2);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ihs getItem(int i) {
        return this.f9412c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m12012G(List<ihs> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f9412c.clear();
        this.f9412c.addAll(list);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(@NonNull @NotNull RecyclerView.d0 d0Var, int i, @NonNull @NotNull List<Object> list) {
        if (vwb.J(list)) {
            onBindViewHolder(d0Var, i);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 0) {
            Object obj = d0Var.itemView;
            if (obj instanceof LiveGiftItemView) {
                ((LiveGiftItemView) obj).m7028o1();
                return;
            }
            return;
        }
        if (1 == iIntValue) {
            Object obj2 = d0Var.itemView;
            if (obj2 instanceof LiveGiftItemView) {
                ((LiveGiftItemView) obj2).m7021R0(getItem(i));
                return;
            }
            return;
        }
        if (2 == iIntValue) {
            Object obj3 = d0Var.itemView;
            if (obj3 instanceof LiveGiftItemView) {
                ((LiveGiftItemView) obj3).m7020Q0();
            }
        }
    }
}
