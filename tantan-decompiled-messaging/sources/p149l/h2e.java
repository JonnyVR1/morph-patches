package p149l;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class h2e extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<Fragment> f105527a;

    public h2e(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.f105527a = list;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f105527a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return this.f105527a.get(i);
    }
}
