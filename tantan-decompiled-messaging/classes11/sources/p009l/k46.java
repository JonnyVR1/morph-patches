package p009l;

import androidx.annotation.NonNull;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import java.util.ArrayList;
import java.util.List;
import l.v9j;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k46 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: j */
    public List<v9j<String>> f15403j;

    public k46(Act act) {
        super(act.getSupportFragmentManager(), act.getLifecycle());
        this.f15403j = new ArrayList();
    }

    @NonNull
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public PutongFrag m17287A(int i) {
        return this.f15403j.get(i);
    }

    /* JADX INFO: renamed from: U */
    public void m17289U(List<v9j<String>> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f15403j = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f15403j.size();
    }

    public long getItemId(int i) {
        return this.f15403j.get(i).getClass().getName().hashCode();
    }

    /* JADX INFO: renamed from: z */
    public boolean m17290z(long j) {
        for (int i = 0; i < getItemCount(); i++) {
            if (getItemId(i) == j) {
                return true;
            }
        }
        return super.z(j);
    }
}
