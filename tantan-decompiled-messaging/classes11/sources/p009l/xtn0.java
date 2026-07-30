package p009l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import l.w660;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xtn0 extends w660 {

    /* JADX INFO: renamed from: a */
    public List<String> f22725a;

    /* JADX INFO: renamed from: b */
    public List<? extends View> f22726b;

    public xtn0(List<String> list, List<? extends View> list2) {
        this.f22725a = list;
        this.f22726b = list2;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f22725a.size();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f22725a.get(i);
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View view = this.f22726b.get(i);
        int i2 = xdl0.e;
        viewGroup.addView(view, new ViewGroup.LayoutParams(i2, i2));
        return view;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
