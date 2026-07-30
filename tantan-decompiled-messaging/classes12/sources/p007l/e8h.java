package p007l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e8h extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public Act f7250a;

    /* JADX INFO: renamed from: b */
    public List<pkg> f7251b;

    public e8h(@NonNull FragmentManager fragmentManager, Act act, List<pkg> list) {
        super(fragmentManager);
        new ArrayList();
        this.f7250a = act;
        this.f7251b = list;
    }

    public int getCount() {
        return this.f7251b.size();
    }

    @NonNull
    public Fragment getItem(int i) {
        return this.f7251b.get(i).m12907c();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f7251b.get(i).getTitle();
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }
}
