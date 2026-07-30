package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class dnp0 extends RecyclerView.Adapter<C16586a> {

    /* JADX INFO: renamed from: a */
    public List<Integer> f89820a = new ArrayList();

    /* JADX INFO: renamed from: l.dnp0$a */
    public static class C16586a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VText f89821a;

        public C16586a(@NonNull @NotNull View view) {
            super(view);
            this.f89821a = (VText) view;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m117067A(List<Integer> list) {
        this.f89820a.clear();
        this.f89820a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f89820a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull C16586a c16586a, int i) {
        c16586a.f89821a.setText(String.valueOf(this.f89820a.get(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C16586a onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new C16586a(LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199231r6, viewGroup, false));
    }
}
