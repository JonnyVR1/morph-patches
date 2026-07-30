package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class zdp0 extends RecyclerView.Adapter<C21663a> {

    /* JADX INFO: renamed from: a */
    public List<Integer> f202700a = new ArrayList();

    /* JADX INFO: renamed from: l.zdp0$a */
    public static class C21663a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VText f202701a;

        public C21663a(@NonNull @NotNull View view) {
            super(view);
            this.f202701a = (VText) view;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m218189A(List<Integer> list) {
        this.f202700a.clear();
        this.f202700a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f202700a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull C21663a c21663a, int i) {
        c21663a.f202701a.setText(String.valueOf(this.f202700a.get(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C21663a onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new C21663a(LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168499r6, viewGroup, false));
    }
}
