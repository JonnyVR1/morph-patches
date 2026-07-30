package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class o6o0 extends w660 {

    /* JADX INFO: renamed from: a */
    public List<View> f142415a;

    public o6o0(List<View> list) {
        this.f142415a = list;
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f142415a.size();
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        viewGroup.addView(this.f142415a.get(i));
        return this.f142415a.get(i);
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
