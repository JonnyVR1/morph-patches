package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class obg extends lb2 {

    /* JADX INFO: renamed from: e */
    public final List<pf60<String, View>> f146584e;

    public obg(List<pf60<String, View>> list) {
        ArrayList arrayList = new ArrayList();
        this.f146584e = arrayList;
        arrayList.addAll(list);
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f146584e.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f146584e.get(i).f152156a;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        View view = this.f146584e.get(i).f152157b;
        viewGroup.addView(view);
        return view;
    }
}
