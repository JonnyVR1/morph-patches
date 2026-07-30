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
public class bjl extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<cjl> f8187e;

    public bjl(List<cjl> list) {
        ArrayList arrayList = new ArrayList();
        this.f8187e = arrayList;
        if (vwb.J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    public int getCount() {
        List<cjl> list = this.f8187e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f8187e.get(i).m11061b();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m10385o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m10386p(ViewGroup viewGroup, int i) {
        View viewM11062c = this.f8187e.get(i).m11062c();
        viewGroup.addView(viewM11062c);
        return viewM11062c;
    }

    /* JADX INFO: renamed from: q */
    public void m10387q(List<cjl> list) {
        this.f8187e.clear();
        this.f8187e.addAll(list);
        notifyDataSetChanged();
    }
}
