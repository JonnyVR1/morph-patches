package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class s7o<T> extends cf60 {

    /* JADX INFO: renamed from: a */
    public List<BLiveVoiceTab> f166701a;

    /* JADX INFO: renamed from: b */
    public List<c8o<T>> f166702b;

    public s7o(List<BLiveVoiceTab> list, List<c8o<T>> list2) {
        this.f166701a = list;
        this.f166702b = list2;
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f166701a.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f166701a.get(i).name;
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View viewMo108373A = this.f166702b.get(i).mo108373A();
        int i2 = bnl0.f77544e;
        viewGroup.addView(viewMo108373A, new ViewGroup.LayoutParams(i2, i2));
        return viewMo108373A;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
