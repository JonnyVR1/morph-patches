package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class sfo0 extends cf60 {

    /* JADX INFO: renamed from: a */
    public List<View> f167751a;

    public sfo0(List<View> list) {
        this.f167751a = list;
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f167751a.size();
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        viewGroup.addView(this.f167751a.get(i));
        return this.f167751a.get(i);
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
