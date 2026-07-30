package p153l;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.AbstractC0426i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bvu extends AbstractC0426i {

    /* JADX INFO: renamed from: h */
    public final int f78634h;

    /* JADX INFO: renamed from: i */
    public final int f78635i;

    /* JADX INFO: renamed from: j */
    public boolean f78636j;

    /* JADX INFO: renamed from: k */
    public SparseArray<LiveVPagerBaseFrag> f78637k;

    public bvu(@NonNull FragmentManager fragmentManager, boolean z, int i, int i2) {
        super(fragmentManager);
        this.f78637k = new SparseArray<>();
        this.f78634h = i;
        this.f78635i = i2;
    }

    @Override // androidx.fragment.app.AbstractC0426i, p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        if (!this.f78636j) {
            super.destroyItem(viewGroup, i, obj);
        }
        this.f78637k.remove(i);
    }

    @Override // androidx.fragment.app.AbstractC0426i
    @NonNull
    public final Fragment getItem(int i) {
        if (this.f78637k.get(i, null) != null) {
            return this.f78637k.get(i);
        }
        LiveVPagerBaseFrag liveVPagerBaseFragMo106611k = mo106611k(i);
        int i2 = this.f78634h;
        int i3 = this.f78635i;
        if (i2 != i3 && i == i3) {
            liveVPagerBaseFragMo106611k.m72007V4(1, 1);
        }
        this.f78637k.put(i, liveVPagerBaseFragMo106611k);
        return liveVPagerBaseFragMo106611k;
    }

    /* JADX INFO: renamed from: j */
    public void m106610j() {
        this.f78637k.clear();
    }

    /* JADX INFO: renamed from: k */
    public abstract LiveVPagerBaseFrag mo106611k(int i);
}
