package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class t8o0 extends lb2 {

    /* JADX INFO: renamed from: e */
    public final List<u8o0> f172558e;

    public t8o0(List<u8o0> list) {
        ArrayList arrayList = new ArrayList();
        this.f172558e = arrayList;
        if (jyb.m147479J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p153l.cf60
    public int getCount() {
        List<u8o0> list = this.f172558e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f172558e.get(i).m195067b();
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
        View viewM195068c = this.f172558e.get(i).m195068c();
        viewGroup.addView(viewM195068c);
        return viewM195068c;
    }

    /* JADX INFO: renamed from: q */
    public void m189679q(List<u8o0> list) {
        this.f172558e.clear();
        this.f172558e.addAll(list);
        notifyDataSetChanged();
    }
}
