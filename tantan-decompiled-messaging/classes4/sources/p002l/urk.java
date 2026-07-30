package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.AnchorGuardView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardLeadBoardView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class urk extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a */
    public final zqs f20762a;

    /* JADX INFO: renamed from: b */
    public mpw f20763b;

    /* JADX INFO: renamed from: c */
    public final boolean f20764c;

    /* JADX INFO: renamed from: l.urk$a */
    public class C0854a extends RecyclerView.d0 {
        public C0854a(View view) {
            super(view);
        }
    }

    public urk(zqs zqsVar, boolean z) {
        this.f20762a = zqsVar;
        this.f20764c = z;
    }

    /* JADX INFO: renamed from: z */
    private View m23581z(ViewGroup viewGroup, @LayoutRes int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* JADX INFO: renamed from: A */
    public void m23582A(mpw mpwVar) {
        this.f20763b = mpwVar;
    }

    public int getItemCount() {
        return this.f20764c ? 3 : 2;
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i) {
        Object obj = d0Var.itemView;
        if (obj instanceof LiveGuardPrivilegeView) {
            ((LiveGuardPrivilegeView) obj).m8293k0(this.f20762a, this.f20763b);
        }
    }

    @NonNull
    public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C0854a(m23583y(viewGroup, i));
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super.onViewAttachedToWindow(d0Var);
        Object obj = d0Var.itemView;
        if (obj instanceof AnchorGuardView) {
            ((AnchorGuardView) obj).m8231y0(this.f20762a);
        } else if (obj instanceof LiveGuardLeadBoardView) {
            ((LiveGuardLeadBoardView) obj).m8265k0(this.f20762a, this.f20763b);
        }
    }

    /* JADX INFO: renamed from: y */
    public View m23583y(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return m23581z(viewGroup, t6c0.f19770a2);
        }
        return (this.f20764c && i == 2) ? m23581z(viewGroup, t6c0.f19832f) : m23581z(viewGroup, t6c0.f19709V1);
    }

    public int getItemViewType(int i) {
        return i;
    }
}
