package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class avk extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

    /* JADX INFO: renamed from: a */
    public final ats f73623a;

    /* JADX INFO: renamed from: b */
    public List<lsw.C18451a> f73624b;

    /* JADX INFO: renamed from: c */
    public boolean f73625c;

    /* JADX INFO: renamed from: l.avk$a */
    public class C15847a extends RecyclerView.AbstractC0569e0 {
        public C15847a(View view) {
            super(view);
        }
    }

    public avk(ats atsVar) {
        this.f73623a = atsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (jyb.m147479J(this.f73624b)) {
            return 0;
        }
        return this.f73624b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        View view = abstractC0569e0.itemView;
        if (view instanceof LiveGuardPrivilegeRightList) {
            ((LiveGuardPrivilegeRightList) view).m75876k0(this.f73623a, this.f73624b.get(i), this.f73625c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C15847a(LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198981Y1, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewRecycled(abstractC0569e0);
        View view = abstractC0569e0.itemView;
        if (view instanceof LiveGuardPrivilegeRightList) {
            ((LiveGuardPrivilegeRightList) view).m75878m0();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m100465y(lsw lswVar) {
        this.f73624b = lswVar.f133472f;
        this.f73625c = lswVar.f133473g;
        notifyDataSetChanged();
    }
}
