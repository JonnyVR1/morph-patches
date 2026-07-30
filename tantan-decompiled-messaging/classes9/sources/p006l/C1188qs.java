package p006l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupSeekbarPageView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.vwb;

/* JADX INFO: renamed from: l.qs */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1188qs extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a */
    public Act f19993a;

    /* JADX INFO: renamed from: b */
    public List<b> f19994b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public e30<Boolean> f19995c;

    /* JADX INFO: renamed from: l.qs$a */
    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public AccountMakeupSeekbarPageView f19996a;

        public a(@NonNull AccountMakeupSeekbarPageView accountMakeupSeekbarPageView) {
            super(accountMakeupSeekbarPageView);
            this.f19996a = accountMakeupSeekbarPageView;
        }
    }

    /* JADX INFO: renamed from: l.qs$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f19997a;

        /* JADX INFO: renamed from: b */
        public float f19998b;

        /* JADX INFO: renamed from: c */
        public boolean f19999c;

        /* JADX INFO: renamed from: d */
        public boolean f20000d;

        public b(float f, float f2, boolean z, boolean z2) {
            this.f19997a = f;
            this.f19998b = f2;
            this.f20000d = z;
            this.f19999c = z2;
        }
    }

    public C1188qs(Act act) {
        this.f19993a = act;
    }

    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((AccountMakeupSeekbarPageView) this.f19993a.inflater().inflate(c6c0.f9431h, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m22332C(e30<Boolean> e30Var) {
        this.f19995c = e30Var;
    }

    public int getItemCount() {
        return 5;
    }

    /* JADX INFO: renamed from: y */
    public void m22333y(List<b> list) {
        list.size();
        if (!vwb.J(list)) {
            this.f19994b.clear();
            this.f19994b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        AccountMakeupSeekbarPageView accountMakeupSeekbarPageView = aVar.f19996a;
        accountMakeupSeekbarPageView.setTag(Integer.valueOf(i));
        accountMakeupSeekbarPageView.m993i();
        b bVar = this.f19994b.get(i);
        if (i == 0) {
            accountMakeupSeekbarPageView.m998n();
        } else if (i == 1) {
            accountMakeupSeekbarPageView.m999o(bVar);
        } else if (i == 2) {
            accountMakeupSeekbarPageView.m1002r(bVar);
        } else if (i == 3) {
            accountMakeupSeekbarPageView.m1003s(bVar);
        } else if (i == 4) {
            accountMakeupSeekbarPageView.m1000p(bVar);
        }
        accountMakeupSeekbarPageView.setOnResetItemClick(this.f19995c);
    }
}
