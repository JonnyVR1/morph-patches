package p009l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pzn0 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<qzn0> f18978e;

    public pzn0(List<qzn0> list) {
        ArrayList arrayList = new ArrayList();
        this.f18978e = arrayList;
        if (vwb.J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    public int getCount() {
        List<qzn0> list = this.f18978e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f18978e.get(i).m21350b();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m20791o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m20792p(ViewGroup viewGroup, int i) {
        View viewM21351c = this.f18978e.get(i).m21351c();
        viewGroup.addView(viewM21351c);
        return viewM21351c;
    }

    /* JADX INFO: renamed from: q */
    public void m20793q(List<qzn0> list) {
        this.f18978e.clear();
        this.f18978e.addAll(list);
        notifyDataSetChanged();
    }
}
