package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class eom0 extends lb2 {

    /* JADX INFO: renamed from: e */
    public final List<fom0> f94938e;

    public eom0(List<fom0> list) {
        ArrayList arrayList = new ArrayList();
        this.f94938e = arrayList;
        if (jyb.m147479J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p153l.cf60
    public int getCount() {
        List<fom0> list = this.f94938e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f94938e.get(i).m126477b();
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
        View viewM126478c = this.f94938e.get(i).m126478c();
        viewGroup.addView(viewM126478c);
        return viewM126478c;
    }

    /* JADX INFO: renamed from: q */
    public void m121754q(List<fom0> list) {
        this.f94938e.clear();
        this.f94938e.addAll(list);
        notifyDataSetChanged();
    }
}
