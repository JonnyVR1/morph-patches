package p007l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class p4h extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public Act f11693a;

    /* JADX INFO: renamed from: b */
    public List<z5h> f11694b;

    public p4h(@NonNull FragmentManager fragmentManager, Act act, List<z5h> list) {
        super(fragmentManager);
        new ArrayList();
        this.f11693a = act;
        this.f11694b = list;
    }

    public int getCount() {
        return this.f11694b.size();
    }

    @NonNull
    public Fragment getItem(int i) {
        return this.f11694b.get(i).m17224c();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f11694b.get(i).getTitle();
    }
}
