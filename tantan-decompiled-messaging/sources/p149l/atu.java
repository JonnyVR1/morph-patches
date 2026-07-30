package p149l;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.AbstractC0425i;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;

/* JADX INFO: loaded from: classes13.dex */
public abstract class atu extends AbstractC0425i {

    /* JADX INFO: renamed from: h */
    public final int f71679h;

    /* JADX INFO: renamed from: i */
    public final int f71680i;

    /* JADX INFO: renamed from: j */
    public boolean f71681j;

    /* JADX INFO: renamed from: k */
    public SparseArray<LiveVPagerBaseFrag> f71682k;

    public atu(@NonNull FragmentManager fragmentManager, boolean z, int i, int i2) {
        super(fragmentManager);
        this.f71682k = new SparseArray<>();
        this.f71679h = i;
        this.f71680i = i2;
    }

    @Override // androidx.fragment.app.AbstractC0425i, p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        if (!this.f71681j) {
            super.destroyItem(viewGroup, i, obj);
        }
        this.f71682k.remove(i);
    }

    @Override // androidx.fragment.app.AbstractC0425i
    @NonNull
    public final Fragment getItem(int i) {
        if (this.f71682k.get(i, null) != null) {
            return this.f71682k.get(i);
        }
        LiveVPagerBaseFrag liveVPagerBaseFragMo98885k = mo98885k(i);
        int i2 = this.f71679h;
        int i3 = this.f71680i;
        if (i2 != i3 && i == i3) {
            liveVPagerBaseFragMo98885k.m70824V4(1, 1);
        }
        this.f71682k.put(i, liveVPagerBaseFragMo98885k);
        return liveVPagerBaseFragMo98885k;
    }

    /* JADX INFO: renamed from: j */
    public void m98884j() {
        this.f71682k.clear();
    }

    /* JADX INFO: renamed from: k */
    public abstract LiveVPagerBaseFrag mo98885k(int i);
}
