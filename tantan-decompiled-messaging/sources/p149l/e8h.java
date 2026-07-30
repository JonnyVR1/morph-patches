package p149l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p046p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e8h extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public Act f89824a;

    /* JADX INFO: renamed from: b */
    public List<pkg> f89825b;

    public e8h(@NonNull FragmentManager fragmentManager, Act act, List<pkg> list) {
        super(fragmentManager);
        new ArrayList();
        this.f89824a = act;
        this.f89825b = list;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f89825b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        return this.f89825b.get(i).m167248c();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f89825b.get(i).getTitle();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }
}
