package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class b3o0 extends cf60 {

    /* JADX INFO: renamed from: a */
    public List<String> f74799a;

    /* JADX INFO: renamed from: b */
    public List<? extends View> f74800b;

    public b3o0(List<String> list, List<? extends View> list2) {
        this.f74799a = list;
        this.f74800b = list2;
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f74799a.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f74799a.get(i);
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View view = this.f74800b.get(i);
        int i2 = bnl0.f77544e;
        viewGroup.addView(view, new ViewGroup.LayoutParams(i2, i2));
        return view;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
