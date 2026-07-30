package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aag extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<j760<String, View>> f7474e;

    public aag(List<j760<String, View>> list) {
        ArrayList arrayList = new ArrayList();
        this.f7474e = arrayList;
        arrayList.addAll(list);
    }

    public int getCount() {
        return this.f7474e.size();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return (CharSequence) this.f7474e.get(i).a;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m9462o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m9463p(ViewGroup viewGroup, int i) {
        View view = (View) this.f7474e.get(i).b;
        viewGroup.addView(view);
        return view;
    }
}
