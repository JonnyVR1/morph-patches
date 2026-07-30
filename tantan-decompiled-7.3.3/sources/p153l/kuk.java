package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.AnchorGuardView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardLeadBoardView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeView;

/* JADX INFO: loaded from: classes4.dex */
public class kuk extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

    /* JADX INFO: renamed from: a */
    public final ats f128872a;

    /* JADX INFO: renamed from: b */
    public lsw f128873b;

    /* JADX INFO: renamed from: c */
    public final boolean f128874c;

    /* JADX INFO: renamed from: l.kuk$a */
    public class C18272a extends RecyclerView.AbstractC0569e0 {
        public C18272a(View view) {
            super(view);
        }
    }

    public kuk(ats atsVar, boolean z) {
        this.f128872a = atsVar;
        this.f128874c = z;
    }

    /* JADX INFO: renamed from: z */
    private View m151543z(ViewGroup viewGroup, @LayoutRes int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* JADX INFO: renamed from: A */
    public void m151544A(lsw lswVar) {
        this.f128873b = lswVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f128874c ? 3 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        View view = abstractC0569e0.itemView;
        if (view instanceof LiveGuardPrivilegeView) {
            ((LiveGuardPrivilegeView) view).m75882k0(this.f128872a, this.f128873b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C18272a(m151545y(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        View view = abstractC0569e0.itemView;
        if (view instanceof AnchorGuardView) {
            ((AnchorGuardView) view).m75821y0(this.f128872a);
        } else if (view instanceof LiveGuardLeadBoardView) {
            ((LiveGuardLeadBoardView) view).m75854k0(this.f128872a, this.f128873b);
        }
    }

    /* JADX INFO: renamed from: y */
    public View m151545y(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return m151543z(viewGroup, yec0.f199006a2);
        }
        return (this.f128874c && i == 2) ? m151543z(viewGroup, yec0.f199068f) : m151543z(viewGroup, yec0.f198945V1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }
}
