package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ksk extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

    /* JADX INFO: renamed from: a */
    public final zqs f124483a;

    /* JADX INFO: renamed from: b */
    public List<mpw.C18528a> f124484b;

    /* JADX INFO: renamed from: c */
    public boolean f124485c;

    /* JADX INFO: renamed from: l.ksk$a */
    public class C18072a extends RecyclerView.AbstractC0566d0 {
        public C18072a(View view) {
            super(view);
        }
    }

    public ksk(zqs zqsVar) {
        this.f124483a = zqsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (vwb.m200296J(this.f124484b)) {
            return 0;
        }
        return this.f124484b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        View view = abstractC0566d0.itemView;
        if (view instanceof LiveGuardPrivilegeRightList) {
            ((LiveGuardPrivilegeRightList) view).m74693k0(this.f124483a, this.f124484b.get(i), this.f124485c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C18072a(LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168249Y1, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewRecycled(abstractC0566d0);
        View view = abstractC0566d0.itemView;
        if (view instanceof LiveGuardPrivilegeRightList) {
            ((LiveGuardPrivilegeRightList) view).m74695m0();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m147083y(mpw mpwVar) {
        this.f124484b = mpwVar.f135096f;
        this.f124485c = mpwVar.f135097g;
        notifyDataSetChanged();
    }
}
