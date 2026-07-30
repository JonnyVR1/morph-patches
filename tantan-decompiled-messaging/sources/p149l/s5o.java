package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class s5o<T> extends w660 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceTab> f162575a;

    /* JADX INFO: renamed from: b */
    public List<c6o<T>> f162576b;

    public s5o(List<BLiveVoiceTab> list, List<c6o<T>> list2) {
        this.f162575a = list;
        this.f162576b = list2;
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f162575a.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f162575a.get(i).name;
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View viewMo105486A = this.f162576b.get(i).mo105486A();
        int i2 = xdl0.f192403e;
        viewGroup.addView(viewMo105486A, new ViewGroup.LayoutParams(i2, i2));
        return viewMo105486A;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
