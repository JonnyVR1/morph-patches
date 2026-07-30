package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gcy extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<hcy> f11369e;

    public gcy(List<hcy> list) {
        ArrayList arrayList = new ArrayList();
        this.f11369e = arrayList;
        if (vwb.J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    public int getCount() {
        List<hcy> list = this.f11369e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f11369e.get(i).m14336b();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m13721o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m13722p(ViewGroup viewGroup, int i) {
        View viewM14337c = this.f11369e.get(i).m14337c();
        viewGroup.addView(viewM14337c);
        return viewM14337c;
    }

    /* JADX INFO: renamed from: q */
    public void m13723q(List<hcy> list) {
        this.f11369e.clear();
        this.f11369e.addAll(list);
        notifyDataSetChanged();
    }
}
