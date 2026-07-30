package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hpn0 extends w660 {

    /* JADX INFO: renamed from: a */
    public List<String> f108949a;

    /* JADX INFO: renamed from: b */
    public List<? extends View> f108950b;

    public hpn0(List<String> list, List<? extends View> list2) {
        this.f108949a = list;
        this.f108950b = list2;
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f108949a.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f108949a.get(i);
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View view = this.f108950b.get(i);
        int i2 = xdl0.f192403e;
        viewGroup.addView(view, new ViewGroup.LayoutParams(i2, i2));
        return view;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
