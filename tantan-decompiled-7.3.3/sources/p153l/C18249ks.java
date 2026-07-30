package p153l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupSeekbarPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ks */
/* JADX INFO: loaded from: classes9.dex */
public class C18249ks extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a */
    public Act f128512a;

    /* JADX INFO: renamed from: b */
    public List<b> f128513b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public y20<Boolean> f128514c;

    /* JADX INFO: renamed from: l.ks$a */
    public static class a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public AccountMakeupSeekbarPageView f128515a;

        public a(@NonNull AccountMakeupSeekbarPageView accountMakeupSeekbarPageView) {
            super(accountMakeupSeekbarPageView);
            this.f128515a = accountMakeupSeekbarPageView;
        }
    }

    /* JADX INFO: renamed from: l.ks$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f128516a;

        /* JADX INFO: renamed from: b */
        public float f128517b;

        /* JADX INFO: renamed from: c */
        public boolean f128518c;

        /* JADX INFO: renamed from: d */
        public boolean f128519d;

        public b(float f, float f2, boolean z, boolean z2) {
            this.f128516a = f;
            this.f128517b = f2;
            this.f128519d = z;
            this.f128518c = z2;
        }
    }

    public C18249ks(Act act) {
        this.f128512a = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((AccountMakeupSeekbarPageView) this.f128512a.inflater().inflate(hec0.f109113h, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m151130C(y20<Boolean> y20Var) {
        this.f128514c = y20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }

    /* JADX INFO: renamed from: y */
    public void m151131y(List<b> list) {
        list.size();
        if (!jyb.m147479J(list)) {
            this.f128513b.clear();
            this.f128513b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        AccountMakeupSeekbarPageView accountMakeupSeekbarPageView = aVar.f128515a;
        accountMakeupSeekbarPageView.setTag(Integer.valueOf(i));
        accountMakeupSeekbarPageView.m30086i();
        b bVar = this.f128513b.get(i);
        if (i == 0) {
            accountMakeupSeekbarPageView.m30091n();
        } else if (i == 1) {
            accountMakeupSeekbarPageView.m30092o(bVar);
        } else if (i == 2) {
            accountMakeupSeekbarPageView.m30095r(bVar);
        } else if (i == 3) {
            accountMakeupSeekbarPageView.m30096s(bVar);
        } else if (i == 4) {
            accountMakeupSeekbarPageView.m30093p(bVar);
        }
        accountMakeupSeekbarPageView.setOnResetItemClick(this.f128514c);
    }
}
