package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dly extends lb2 {

    /* JADX INFO: renamed from: e */
    public final List<ely> f89590e;

    public dly(List<ely> list) {
        ArrayList arrayList = new ArrayList();
        this.f89590e = arrayList;
        if (jyb.m147479J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p153l.cf60
    public int getCount() {
        List<ely> list = this.f89590e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f89590e.get(i).m121309b();
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
        View viewM121310c = this.f89590e.get(i).m121310c();
        viewGroup.addView(viewM121310c);
        return viewM121310c;
    }

    /* JADX INFO: renamed from: q */
    public void m116909q(List<ely> list) {
        this.f89590e.clear();
        this.f89590e.addAll(list);
        notifyDataSetChanged();
    }
}
