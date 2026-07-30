package p153l;

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
public class kw3 extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    private final Fragment[] f129024a;

    /* JADX INFO: renamed from: b */
    private final List<String> f129025b;

    public kw3(FragmentManager fragmentManager, int i) {
        super(fragmentManager, 1);
        this.f129025b = new ArrayList();
        this.f129024a = new Fragment[i];
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f129024a.length;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        return this.f129024a[i];
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f129025b.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Object objInstantiateItem = super.instantiateItem(viewGroup, i);
        this.f129024a[i] = (Fragment) objInstantiateItem;
        return objInstantiateItem;
    }

    /* JADX INFO: renamed from: j */
    public void m151679j(Fragment fragment, String str, int i) {
        this.f129024a[i] = fragment;
        this.f129025b.add(str);
    }
}
