package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p046p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class p4h extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public Act f147172a;

    /* JADX INFO: renamed from: b */
    public List<z5h> f147173b;

    public p4h(@NonNull FragmentManager fragmentManager, Act act, List<z5h> list) {
        super(fragmentManager);
        new ArrayList();
        this.f147172a = act;
        this.f147173b = list;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f147173b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        return this.f147173b.get(i).m217335c();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f147173b.get(i).getTitle();
    }
}
