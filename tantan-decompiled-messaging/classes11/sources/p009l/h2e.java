package p009l;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class h2e extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<Fragment> f13845a;

    public h2e(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.f13845a = list;
    }

    public int getCount() {
        return this.f13845a.size();
    }

    public Fragment getItem(int i) {
        return this.f13845a.get(i);
    }
}
