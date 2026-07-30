package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class utj extends jic0<jjs> {

    /* JADX INFO: renamed from: c */
    public final List<jjs> f180974c;

    /* JADX INFO: renamed from: d */
    public final vlu<?> f180975d;

    public utj(vlu<?> vluVar, List<jjs> list) {
        this.f180975d = vluVar;
        this.f180974c = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f180974c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return m0k.m156515c(viewGroup);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, jjs jjsVar, int i, int i2) {
        ((LiveVChatGiftItemView) view).m70616R0(jjsVar, this.f180975d, i2);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public jjs getItem(int i) {
        return this.f180974c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m198065G(List<jjs> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f180974c.clear();
        this.f180974c.addAll(list);
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
            if (view instanceof LiveVChatGiftItemView) {
                ((LiveVChatGiftItemView) view).m70631k1();
                return;
            }
            return;
        }
        if (1 == iIntValue) {
            View view2 = abstractC0569e0.itemView;
            if (view2 instanceof LiveVChatGiftItemView) {
                ((LiveVChatGiftItemView) view2).m70613O0(getItem(i));
                return;
            }
            return;
        }
        if (2 == iIntValue) {
            View view3 = abstractC0569e0.itemView;
            if (view3 instanceof LiveVChatGiftItemView) {
                ((LiveVChatGiftItemView) view3).m70612N0();
            }
        }
    }
}
