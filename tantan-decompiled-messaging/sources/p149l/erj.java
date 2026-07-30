package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class erj extends dac0<ihs> {

    /* JADX INFO: renamed from: c */
    public final List<ihs> f92934c;

    /* JADX INFO: renamed from: d */
    public final uju<?> f92935d;

    public erj(uju<?> ujuVar, List<ihs> list) {
        this.f92935d = ujuVar;
        this.f92934c = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f92934c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return wxj.m206014c(viewGroup);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, ihs ihsVar, int i, int i2) {
        ((LiveVChatGiftItemView) view).m69433R0(ihsVar, this.f92935d, i2);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ihs getItem(int i) {
        return this.f92934c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m117846G(List<ihs> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f92934c.clear();
        this.f92934c.addAll(list);
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
            if (view instanceof LiveVChatGiftItemView) {
                ((LiveVChatGiftItemView) view).m69448k1();
                return;
            }
            return;
        }
        if (1 == iIntValue) {
            View view2 = abstractC0566d0.itemView;
            if (view2 instanceof LiveVChatGiftItemView) {
                ((LiveVChatGiftItemView) view2).m69430O0(getItem(i));
                return;
            }
            return;
        }
        if (2 == iIntValue) {
            View view3 = abstractC0566d0.itemView;
            if (view3 instanceof LiveVChatGiftItemView) {
                ((LiveVChatGiftItemView) view3).m69429N0();
            }
        }
    }
}
