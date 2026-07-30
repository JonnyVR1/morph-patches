package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ksk extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a */
    public final zqs f14499a;

    /* JADX INFO: renamed from: b */
    public List<mpw.C0681a> f14500b;

    /* JADX INFO: renamed from: c */
    public boolean f14501c;

    /* JADX INFO: renamed from: l.ksk$a */
    public class C0651a extends RecyclerView.d0 {
        public C0651a(View view) {
            super(view);
        }
    }

    public ksk(zqs zqsVar) {
        this.f14499a = zqsVar;
    }

    public int getItemCount() {
        if (vwb.J(this.f14500b)) {
            return 0;
        }
        return this.f14500b.size();
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i) {
        Object obj = d0Var.itemView;
        if (obj instanceof LiveGuardPrivilegeRightList) {
            ((LiveGuardPrivilegeRightList) obj).m8287k0(this.f14499a, this.f14500b.get(i), this.f14501c);
        }
    }

    @NonNull
    public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C0651a(LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19745Y1, viewGroup, false));
    }

    public void onViewRecycled(@NonNull RecyclerView.d0 d0Var) {
        super.onViewRecycled(d0Var);
        Object obj = d0Var.itemView;
        if (obj instanceof LiveGuardPrivilegeRightList) {
            ((LiveGuardPrivilegeRightList) obj).m8289m0();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m16783y(mpw mpwVar) {
        this.f14500b = mpwVar.f15524f;
        this.f14501c = mpwVar.f15525g;
        notifyDataSetChanged();
    }
}
