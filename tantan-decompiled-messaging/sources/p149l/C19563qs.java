package p149l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupSeekbarPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.qs */
/* JADX INFO: loaded from: classes9.dex */
public class C19563qs extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a */
    public Act f156075a;

    /* JADX INFO: renamed from: b */
    public List<b> f156076b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public e30<Boolean> f156077c;

    /* JADX INFO: renamed from: l.qs$a */
    public static class a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public AccountMakeupSeekbarPageView f156078a;

        public a(@NonNull AccountMakeupSeekbarPageView accountMakeupSeekbarPageView) {
            super(accountMakeupSeekbarPageView);
            this.f156078a = accountMakeupSeekbarPageView;
        }
    }

    /* JADX INFO: renamed from: l.qs$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f156079a;

        /* JADX INFO: renamed from: b */
        public float f156080b;

        /* JADX INFO: renamed from: c */
        public boolean f156081c;

        /* JADX INFO: renamed from: d */
        public boolean f156082d;

        public b(float f, float f2, boolean z, boolean z2) {
            this.f156079a = f;
            this.f156080b = f2;
            this.f156082d = z;
            this.f156081c = z2;
        }
    }

    public C19563qs(Act act) {
        this.f156075a = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((AccountMakeupSeekbarPageView) this.f156075a.inflater().inflate(c6c0.f79501h, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m176142C(e30<Boolean> e30Var) {
        this.f156077c = e30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }

    /* JADX INFO: renamed from: y */
    public void m176143y(List<b> list) {
        list.size();
        if (!vwb.m200296J(list)) {
            this.f156076b.clear();
            this.f156076b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        AccountMakeupSeekbarPageView accountMakeupSeekbarPageView = aVar.f156078a;
        accountMakeupSeekbarPageView.setTag(Integer.valueOf(i));
        accountMakeupSeekbarPageView.m29087i();
        b bVar = this.f156076b.get(i);
        if (i == 0) {
            accountMakeupSeekbarPageView.m29092n();
        } else if (i == 1) {
            accountMakeupSeekbarPageView.m29093o(bVar);
        } else if (i == 2) {
            accountMakeupSeekbarPageView.m29096r(bVar);
        } else if (i == 3) {
            accountMakeupSeekbarPageView.m29097s(bVar);
        } else if (i == 4) {
            accountMakeupSeekbarPageView.m29094p(bVar);
        }
        accountMakeupSeekbarPageView.setOnResetItemClick(this.f156077c);
    }
}
