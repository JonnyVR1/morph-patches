package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class er3 extends RecyclerView.Adapter<C16669a> {

    /* JADX INFO: renamed from: a */
    public final Context f92878a;

    /* JADX INFO: renamed from: b */
    public final eej0<i80<View>> f92879b = new eej0<>();

    /* JADX INFO: renamed from: l.er3$a */
    public static class C16669a extends RecyclerView.AbstractC0566d0 {
        public C16669a(@NonNull View view) {
            super(view);
        }
    }

    public er3(Context context) {
        this.f92878a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C16669a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C16669a(LayoutInflater.from(this.f92878a).inflate(i, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m117810C(List<i80<View>> list) {
        this.f92879b.clear();
        this.f92879b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92879b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f92879b.get(i).f85890n;
    }

    /* JADX INFO: renamed from: y */
    public List<i80<View>> m117811y() {
        return this.f92879b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C16669a c16669a, int i) {
        this.f92879b.get(i).mo108215d4(c16669a.itemView);
    }
}
