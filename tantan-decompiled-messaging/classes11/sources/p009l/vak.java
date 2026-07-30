package p009l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import l.dac0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class vak<T> extends dac0<T> {
    /* JADX INFO: renamed from: E */
    public abstract void mo23340E(View view, T t, List<Object> list, int i, int i2);

    /* JADX INFO: renamed from: F */
    public abstract void mo23341F(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.d0 d0Var, int i, @NonNull @NotNull List<Object> list) {
        super.onBindViewHolder(d0Var, i);
        mo23340E(d0Var.itemView, getItem(i), list, getItemViewType(i), i);
    }

    /* JADX INFO: renamed from: A */
    public void m23339A(View view, T t, int i, int i2) {
    }
}
