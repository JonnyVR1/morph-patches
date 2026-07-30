package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class iwj0 extends RecyclerView.Adapter<C17811a> {

    /* JADX INFO: renamed from: a */
    public List<BLiveUserMask> f117275a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f117276b;

    /* JADX INFO: renamed from: l.iwj0$a */
    public static class C17811a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f117277a;

        /* JADX INFO: renamed from: b */
        public VText f117278b;

        public C17811a(@NonNull @NotNull View view) {
            super(view);
            this.f117277a = (VDraweeView) view.findViewById(mdc0.f135990L7);
            this.f117278b = (VText) view.findViewById(mdc0.f136008N7);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m142385A(List<BLiveUserMask> list) {
        this.f117276b = list.size();
        this.f117275a.clear();
        this.f117275a.addAll(list.subList(0, Math.min(this.f117276b, 4)));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f117275a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull C17811a c17811a, int i) {
        if (this.f117276b <= 4 || i != 3) {
            ql3.m176984b(c17811a.f117277a, this.f117275a.get(i), false);
            c17811a.f117278b.setVisibility(8);
        } else {
            izs.m142865p("context_livingAct", c17811a.f117277a, this.f117275a.get(i).avatar, 1, qa00.f156323j);
            c17811a.f117278b.setVisibility(0);
            c17811a.f117278b.setText(String.valueOf(this.f117276b));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C17811a onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new C17811a(LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199127j6, viewGroup, false));
    }
}
