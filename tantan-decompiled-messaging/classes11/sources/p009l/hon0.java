package p009l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.w8u;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hon0 extends eb2 {

    /* JADX INFO: renamed from: f */
    public static final String[] f14199f;

    /* JADX INFO: renamed from: e */
    public final List<fon0> f14200e;

    static {
        f14199f = new String[]{w8u.t(((bgv) ypv.m25491l(fld0.f13080f)).m12018n() ? R.string.rj : R.string.gi), w8u.t(R.string.Xf)};
    }

    public hon0(List<fon0> list) {
        ArrayList arrayList = new ArrayList();
        this.f14200e = arrayList;
        arrayList.addAll(list);
    }

    public int getCount() {
        return f14199f.length;
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return f14199f[i];
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m15903o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m15904p(ViewGroup viewGroup, int i) {
        View viewM14543l = this.f14200e.get(i).m14543l();
        viewGroup.addView(viewM14543l);
        return viewM14543l;
    }
}
