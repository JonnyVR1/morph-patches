package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class hon0 extends eb2 {

    /* JADX INFO: renamed from: f */
    public static final String[] f108833f;

    /* JADX INFO: renamed from: e */
    public final List<fon0> f108834e;

    static {
        f108833f = new String[]{w8u.m202217t(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f47506rj : R$string.f47264gi), w8u.m202217t(R$string.f47066Xf)};
    }

    public hon0(List<fon0> list) {
        ArrayList arrayList = new ArrayList();
        this.f108834e = arrayList;
        arrayList.addAll(list);
    }

    @Override // p149l.w660
    public int getCount() {
        return f108833f.length;
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return f108833f[i];
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        View viewM122471l = this.f108834e.get(i).m122471l();
        viewGroup.addView(viewM122471l);
        return viewM122471l;
    }
}
