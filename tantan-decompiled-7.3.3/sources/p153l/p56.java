package p153l;

import androidx.annotation.NonNull;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class p56 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: j */
    public List<pcj<String>> f150610j;

    public p56(Act act) {
        super(act.getSupportFragmentManager(), act.getLifecycle());
        this.f150610j = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NonNull
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public PutongFrag mo4210A(int i) {
        return (PutongFrag) this.f150610j.get(i);
    }

    /* JADX INFO: renamed from: U */
    public void m170611U(List<pcj<String>> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f150610j = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f150610j.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f150610j.get(i).getClass().getName().hashCode();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: z */
    public boolean mo4228z(long j) {
        for (int i = 0; i < getItemCount(); i++) {
            if (getItemId(i) == j) {
                return true;
            }
        }
        return super.mo4228z(j);
    }
}
