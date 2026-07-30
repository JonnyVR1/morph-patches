package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class jeg extends RecyclerView.Adapter<meg> {

    /* JADX INFO: renamed from: a */
    public boolean f117568a;

    /* JADX INFO: renamed from: b */
    public List<FanbaseGroupAuditsItemBean> f117569b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public brl f117570c;

    public jeg(boolean z, brl brlVar) {
        this.f117568a = z;
        this.f117570c = brlVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull meg megVar, int i) {
        megVar.m154190g(this.f117570c);
        megVar.m154189f(this.f117569b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public meg onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new meg(LayoutInflater.from(viewGroup.getContext()).inflate(this.f117568a ? q6c0.f152864C : q6c0.f152863B, viewGroup, false), this.f117568a);
    }

    /* JADX INFO: renamed from: D */
    public void m141129D(List<FanbaseGroupAuditsItemBean> list) {
        this.f117569b.clear();
        this.f117569b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f117569b.size();
    }

    /* JADX INFO: renamed from: y */
    public List<FanbaseGroupAuditsItemBean> m141130y() {
        return this.f117569b;
    }

    /* JADX INFO: renamed from: z */
    public void m141131z(List<FanbaseGroupAuditsItemBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f117569b.addAll(list);
        notifyDataSetChanged();
    }
}
