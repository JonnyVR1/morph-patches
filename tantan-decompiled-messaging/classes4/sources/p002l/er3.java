package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class er3 extends RecyclerView.Adapter<C0548a> {

    /* JADX INFO: renamed from: a */
    public final Context f9946a;

    /* JADX INFO: renamed from: b */
    public final eej0<i80<View>> f9947b = new eej0<>();

    /* JADX INFO: renamed from: l.er3$a */
    public static class C0548a extends RecyclerView.d0 {
        public C0548a(@NonNull View view) {
            super(view);
        }
    }

    public er3(Context context) {
        this.f9946a = context;
    }

    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0548a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C0548a(LayoutInflater.from(this.f9946a).inflate(i, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m12671C(List<i80<View>> list) {
        this.f9947b.clear();
        this.f9947b.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f9947b.size();
    }

    public int getItemViewType(int i) {
        return ((i80) this.f9947b.j(i)).f9199n;
    }

    /* JADX INFO: renamed from: y */
    public List<i80<View>> m12672y() {
        return this.f9947b;
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C0548a c0548a, int i) {
        ((i80) this.f9947b.j(i)).mo11312d4(((RecyclerView.d0) c0548a).itemView);
    }
}
