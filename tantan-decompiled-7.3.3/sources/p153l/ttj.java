package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class ttj extends jic0<jjs> {

    /* JADX INFO: renamed from: c */
    public final List<jjs> f176076c;

    /* JADX INFO: renamed from: d */
    public final bjs<?> f176077d;

    public ttj(bjs<?> bjsVar, List<jjs> list) {
        this.f176077d = bjsVar;
        this.f176076c = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f176076c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return l0k.m152350c(viewGroup);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, jjs jjsVar, int i, int i2) {
        ((LiveGiftItemView) view).m74664U0(jjsVar, this.f176077d, i2);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public jjs getItem(int i) {
        return this.f176076c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m192673G(List<jjs> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f176076c.clear();
        this.f176076c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i, @NonNull @NotNull List<Object> list) {
        if (jyb.m147479J(list)) {
            onBindViewHolder(abstractC0569e0, i);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 0) {
            View view = abstractC0569e0.itemView;
            if (view instanceof LiveGiftItemView) {
                ((LiveGiftItemView) view).m74669o1();
                return;
            }
            return;
        }
        if (1 == iIntValue) {
            View view2 = abstractC0569e0.itemView;
            if (view2 instanceof LiveGiftItemView) {
                ((LiveGiftItemView) view2).m74662R0(getItem(i));
                return;
            }
            return;
        }
        if (2 == iIntValue) {
            View view3 = abstractC0569e0.itemView;
            if (view3 instanceof LiveGiftItemView) {
                ((LiveGiftItemView) view3).m74661Q0();
            }
        }
    }
}
