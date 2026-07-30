package p149l;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.p046p1.mobile.android.app.Frag;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class n5f0 extends FragmentStateAdapter {

    /* JADX INFO: renamed from: j */
    public List<Frag> f137209j;

    public n5f0(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, List<Frag> list) {
        super(fragmentManager, lifecycle);
        this.f137209j = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NonNull
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Frag mo4208A(int i) {
        return this.f137209j.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f137209j.size();
    }
}
