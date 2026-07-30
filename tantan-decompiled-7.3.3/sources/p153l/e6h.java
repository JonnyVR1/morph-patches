package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e6h extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public Act f92276a;

    /* JADX INFO: renamed from: b */
    public List<o7h> f92277b;

    public e6h(@NonNull FragmentManager fragmentManager, Act act, List<o7h> list) {
        super(fragmentManager);
        new ArrayList();
        this.f92276a = act;
        this.f92277b = list;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f92277b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        return this.f92277b.get(i).m166337c();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f92277b.get(i).getTitle();
    }
}
