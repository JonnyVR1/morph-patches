package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class fnj0 extends RecyclerView.Adapter<C16886a> {

    /* JADX INFO: renamed from: a */
    public List<BLiveUserMask> f98423a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f98424b;

    /* JADX INFO: renamed from: l.fnj0$a */
    public static class C16886a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f98425a;

        /* JADX INFO: renamed from: b */
        public VText f98426b;

        public C16886a(@NonNull @NotNull View view) {
            super(view);
            this.f98425a = (VDraweeView) view.findViewById(g5c0.f100745L7);
            this.f98426b = (VText) view.findViewById(g5c0.f100763N7);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m122313A(List<BLiveUserMask> list) {
        this.f98424b = list.size();
        this.f98423a.clear();
        this.f98423a.addAll(list.subList(0, Math.min(this.f98424b, 4)));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f98423a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull C16886a c16886a, int i) {
        if (this.f98424b <= 4 || i != 3) {
            wk3.m203643b(c16886a.f98425a, this.f98423a.get(i), false);
            c16886a.f98426b.setVisibility(8);
        } else {
            hxs.m133403p("context_livingAct", c16886a.f98425a, this.f98423a.get(i).avatar, 1, t100.f167261j);
            c16886a.f98426b.setVisibility(0);
            c16886a.f98426b.setText(String.valueOf(this.f98424b));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C16886a onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new C16886a(LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168395j6, viewGroup, false));
    }
}
