package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.AnchorGuardView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardLeadBoardView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeView;

/* JADX INFO: loaded from: classes4.dex */
public class urk extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

    /* JADX INFO: renamed from: a */
    public final zqs f177838a;

    /* JADX INFO: renamed from: b */
    public mpw f177839b;

    /* JADX INFO: renamed from: c */
    public final boolean f177840c;

    /* JADX INFO: renamed from: l.urk$a */
    public class C20489a extends RecyclerView.AbstractC0566d0 {
        public C20489a(View view) {
            super(view);
        }
    }

    public urk(zqs zqsVar, boolean z) {
        this.f177838a = zqsVar;
        this.f177840c = z;
    }

    /* JADX INFO: renamed from: z */
    private View m195076z(ViewGroup viewGroup, @LayoutRes int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* JADX INFO: renamed from: A */
    public void m195077A(mpw mpwVar) {
        this.f177839b = mpwVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f177840c ? 3 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        View view = abstractC0566d0.itemView;
        if (view instanceof LiveGuardPrivilegeView) {
            ((LiveGuardPrivilegeView) view).m74699k0(this.f177838a, this.f177839b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C20489a(m195078y(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        View view = abstractC0566d0.itemView;
        if (view instanceof AnchorGuardView) {
            ((AnchorGuardView) view).m74638y0(this.f177838a);
        } else if (view instanceof LiveGuardLeadBoardView) {
            ((LiveGuardLeadBoardView) view).m74671k0(this.f177838a, this.f177839b);
        }
    }

    /* JADX INFO: renamed from: y */
    public View m195078y(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return m195076z(viewGroup, t6c0.f168274a2);
        }
        return (this.f177840c && i == 2) ? m195076z(viewGroup, t6c0.f168336f) : m195076z(viewGroup, t6c0.f168213V1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }
}
