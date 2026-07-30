package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class xfg extends RecyclerView.Adapter<agg> {

    /* JADX INFO: renamed from: a */
    public boolean f194031a;

    /* JADX INFO: renamed from: b */
    public List<FanbaseGroupAuditsItemBean> f194032b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public otl f194033c;

    public xfg(boolean z, otl otlVar) {
        this.f194031a = z;
        this.f194033c = otlVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull agg aggVar, int i) {
        aggVar.m97628g(this.f194033c);
        aggVar.m97627f(this.f194032b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public agg onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new agg(LayoutInflater.from(viewGroup.getContext()).inflate(this.f194031a ? vec0.f183721C : vec0.f183720B, viewGroup, false), this.f194031a);
    }

    /* JADX INFO: renamed from: D */
    public void m210795D(List<FanbaseGroupAuditsItemBean> list) {
        this.f194032b.clear();
        this.f194032b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f194032b.size();
    }

    /* JADX INFO: renamed from: y */
    public List<FanbaseGroupAuditsItemBean> m210796y() {
        return this.f194032b;
    }

    /* JADX INFO: renamed from: z */
    public void m210797z(List<FanbaseGroupAuditsItemBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f194032b.addAll(list);
        notifyDataSetChanged();
    }
}
