package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vak<T> extends dac0<T> {
    /* JADX INFO: renamed from: E */
    public abstract void mo173642E(View view, T t, List<Object> list, int i, int i2);

    /* JADX INFO: renamed from: F */
    public abstract void mo173643F(String str);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i, @NonNull @NotNull List<Object> list) {
        super.onBindViewHolder(abstractC0566d0, i);
        mo173642E(abstractC0566d0.itemView, getItem(i), list, getItemViewType(i), i);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: A */
    public void mo28823A(View view, T t, int i, int i2) {
    }
}
