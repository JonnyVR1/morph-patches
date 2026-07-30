package p153l;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class v3e extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<Fragment> f182181a;

    public v3e(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.f182181a = list;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f182181a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return this.f182181a.get(i);
    }
}
