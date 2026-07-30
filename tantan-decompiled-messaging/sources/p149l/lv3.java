package p149l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class lv3 extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    private final Fragment[] f130117a;

    /* JADX INFO: renamed from: b */
    private final List<String> f130118b;

    public lv3(FragmentManager fragmentManager, int i) {
        super(fragmentManager, 1);
        this.f130118b = new ArrayList();
        this.f130117a = new Fragment[i];
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f130117a.length;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        return this.f130117a[i];
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f130118b.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Object objInstantiateItem = super.instantiateItem(viewGroup, i);
        this.f130117a[i] = (Fragment) objInstantiateItem;
        return objInstantiateItem;
    }

    /* JADX INFO: renamed from: j */
    public void m151834j(Fragment fragment, String str, int i) {
        this.f130117a[i] = fragment;
        this.f130118b.add(str);
    }
}
