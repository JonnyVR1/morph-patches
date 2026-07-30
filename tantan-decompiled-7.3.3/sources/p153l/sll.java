package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class sll extends lb2 {

    /* JADX INFO: renamed from: e */
    public final List<tll> f169391e;

    public sll(List<tll> list) {
        ArrayList arrayList = new ArrayList();
        this.f169391e = arrayList;
        if (jyb.m147479J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p153l.cf60
    public int getCount() {
        List<tll> list = this.f169391e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f169391e.get(i).m191643b();
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
        View viewM191644c = this.f169391e.get(i).m191644c();
        viewGroup.addView(viewM191644c);
        return viewM191644c;
    }

    /* JADX INFO: renamed from: q */
    public void m186595q(List<tll> list) {
        this.f169391e.clear();
        this.f169391e.addAll(list);
        notifyDataSetChanged();
    }
}
