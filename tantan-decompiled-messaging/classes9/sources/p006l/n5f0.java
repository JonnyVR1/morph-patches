package p006l;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.p1.mobile.android.app.Frag;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class n5f0 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: j */
    public List<Frag> f17503j;

    public n5f0(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, List<Frag> list) {
        super(fragmentManager, lifecycle);
        this.f17503j = list;
    }

    @NonNull
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Frag m19686A(int i) {
        return this.f17503j.get(i);
    }

    public int getItemCount() {
        return this.f17503j.size();
    }
}
