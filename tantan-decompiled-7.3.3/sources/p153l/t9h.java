package p153l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class t9h extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public Act f172639a;

    /* JADX INFO: renamed from: b */
    public List<emg> f172640b;

    public t9h(@NonNull FragmentManager fragmentManager, Act act, List<emg> list) {
        super(fragmentManager);
        new ArrayList();
        this.f172639a = act;
        this.f172640b = list;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f172640b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        return this.f172640b.get(i).m119535c();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f172640b.get(i).getTitle();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }
}
