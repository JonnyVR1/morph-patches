package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class feg extends RecyclerView.Adapter<geg> {

    /* JADX INFO: renamed from: a */
    public boolean f97124a;

    /* JADX INFO: renamed from: b */
    public List<FanbaseGroupsBean.FansbaseGroupsItem> f97125b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public arl f97126c;

    /* JADX INFO: renamed from: l.feg$a */
    public class ViewOnClickListenerC16813a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f97127a;

        public ViewOnClickListenerC16813a(int i) {
            this.f97127a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (feg.this.f97124a) {
                lsi0.m151593w(R$string.f44111H);
            } else if (feg.this.f97126c != null) {
                feg.this.f97126c.mo70507d(String.valueOf(Long.parseLong(((FanbaseGroupsBean.FansbaseGroupsItem) feg.this.f97125b.get(this.f97127a)).getId()) + 1000000000000000L));
            }
        }
    }

    public feg(boolean z, arl arlVar) {
        this.f97124a = z;
        this.f97126c = arlVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull geg gegVar, @SuppressLint({"RecyclerView"}) int i) {
        gegVar.itemView.setOnClickListener(new ViewOnClickListenerC16813a(i));
        gegVar.m125782b(this.f97125b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public geg onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return new geg(LayoutInflater.from(viewGroup.getContext()).inflate(this.f97124a ? q6c0.f152862A : q6c0.f152901z, viewGroup, false), this.f97124a);
    }

    /* JADX INFO: renamed from: E */
    public void m121037E(List<FanbaseGroupsBean.FansbaseGroupsItem> list) {
        this.f97125b.clear();
        this.f97125b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97125b.size();
    }
}
