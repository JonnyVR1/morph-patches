package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class mdk<T> extends jic0<T> {
    /* JADX INFO: renamed from: E */
    public abstract void mo104449E(View view, T t, List<Object> list, int i, int i2);

    /* JADX INFO: renamed from: F */
    public abstract void mo104450F(String str);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i, @NonNull @NotNull List<Object> list) {
        super.onBindViewHolder(abstractC0569e0, i);
        mo104449E(abstractC0569e0.itemView, getItem(i), list, getItemViewType(i), i);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: A */
    public void mo29822A(View view, T t, int i, int i2) {
    }
}
