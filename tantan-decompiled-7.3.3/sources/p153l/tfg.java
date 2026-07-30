package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class tfg extends RecyclerView.Adapter<ufg> {

    /* JADX INFO: renamed from: a */
    public boolean f173953a;

    /* JADX INFO: renamed from: b */
    public List<FanbaseGroupsBean.FansbaseGroupsItem> f173954b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ntl f173955c;

    /* JADX INFO: renamed from: l.tfg$a */
    public class ViewOnClickListenerC20301a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f173956a;

        public ViewOnClickListenerC20301a(int i) {
            this.f173956a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (tfg.this.f173953a) {
                o1j0.m165649w(R$string.f44959H);
            } else if (tfg.this.f173955c != null) {
                tfg.this.f173955c.mo71690d(String.valueOf(Long.parseLong(((FanbaseGroupsBean.FansbaseGroupsItem) tfg.this.f173954b.get(this.f173956a)).getId()) + 1000000000000000L));
            }
        }
    }

    public tfg(boolean z, ntl ntlVar) {
        this.f173953a = z;
        this.f173955c = ntlVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull ufg ufgVar, @SuppressLint({"RecyclerView"}) int i) {
        ufgVar.itemView.setOnClickListener(new ViewOnClickListenerC20301a(i));
        ufgVar.m195841b(this.f173954b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public ufg onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new ufg(LayoutInflater.from(viewGroup.getContext()).inflate(this.f173953a ? vec0.f183719A : vec0.f183758z, viewGroup, false), this.f173953a);
    }

    /* JADX INFO: renamed from: E */
    public void m190937E(List<FanbaseGroupsBean.FansbaseGroupsItem> list) {
        this.f173954b.clear();
        this.f173954b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f173954b.size();
    }
}
