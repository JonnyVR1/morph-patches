package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class drj extends dac0<ihs> {

    /* JADX INFO: renamed from: c */
    public final List<ihs> f87638c;

    /* JADX INFO: renamed from: d */
    public final ahs<?> f87639d;

    public drj(ahs<?> ahsVar, List<ihs> list) {
        this.f87639d = ahsVar;
        this.f87638c = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f87638c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return vxj.m200564c(viewGroup);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, ihs ihsVar, int i, int i2) {
        ((LiveGiftItemView) view).m73481U0(ihsVar, this.f87639d, i2);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ihs getItem(int i) {
        return this.f87638c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m113309G(List<ihs> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f87638c.clear();
        this.f87638c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i, @NonNull @NotNull List<Object> list) {
        if (vwb.m200296J(list)) {
            onBindViewHolder(abstractC0566d0, i);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 0) {
            View view = abstractC0566d0.itemView;
            if (view instanceof LiveGiftItemView) {
                ((LiveGiftItemView) view).m73486o1();
                return;
            }
            return;
        }
        if (1 == iIntValue) {
            View view2 = abstractC0566d0.itemView;
            if (view2 instanceof LiveGiftItemView) {
                ((LiveGiftItemView) view2).m73479R0(getItem(i));
                return;
            }
            return;
        }
        if (2 == iIntValue) {
            View view3 = abstractC0566d0.itemView;
            if (view3 instanceof LiveGiftItemView) {
                ((LiveGiftItemView) view3).m73478Q0();
            }
        }
    }
}
