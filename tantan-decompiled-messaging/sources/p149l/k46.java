package p149l;

import androidx.annotation.NonNull;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class k46 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: j */
    public List<v9j<String>> f120948j;

    public k46(Act act) {
        super(act.getSupportFragmentManager(), act.getLifecycle());
        this.f120948j = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NonNull
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public PutongFrag mo4208A(int i) {
        return (PutongFrag) this.f120948j.get(i);
    }

    /* JADX INFO: renamed from: U */
    public void m144479U(List<v9j<String>> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f120948j = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120948j.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f120948j.get(i).getClass().getName().hashCode();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: z */
    public boolean mo4226z(long j) {
        for (int i = 0; i < getItemCount(); i++) {
            if (getItemId(i) == j) {
                return true;
            }
        }
        return super.mo4226z(j);
    }
}
