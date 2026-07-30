package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ds3 extends RecyclerView.Adapter<C16616a> {

    /* JADX INFO: renamed from: a */
    public final Context f90450a;

    /* JADX INFO: renamed from: b */
    public final inj0<e80<View>> f90451b = new inj0<>();

    /* JADX INFO: renamed from: l.ds3$a */
    public static class C16616a extends RecyclerView.AbstractC0569e0 {
        public C16616a(@NonNull View view) {
            super(view);
        }
    }

    public ds3(Context context) {
        this.f90450a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C16616a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C16616a(LayoutInflater.from(this.f90450a).inflate(i, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m117717C(List<e80<View>> list) {
        this.f90451b.clear();
        this.f90451b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f90451b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f90451b.get(i).f126235n;
    }

    /* JADX INFO: renamed from: y */
    public List<e80<View>> m117718y() {
        return this.f90451b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C16616a c16616a, int i) {
        this.f90451b.get(i).mo108591d4(c16616a.itemView);
    }
}
