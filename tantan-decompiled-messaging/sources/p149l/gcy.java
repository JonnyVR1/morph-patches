package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gcy extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<hcy> f102059e;

    public gcy(List<hcy> list) {
        ArrayList arrayList = new ArrayList();
        this.f102059e = arrayList;
        if (vwb.m200296J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p149l.w660
    public int getCount() {
        List<hcy> list = this.f102059e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f102059e.get(i).m130525b();
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        View viewM130526c = this.f102059e.get(i).m130526c();
        viewGroup.addView(viewM130526c);
        return viewM130526c;
    }

    /* JADX INFO: renamed from: q */
    public void m125527q(List<hcy> list) {
        this.f102059e.clear();
        this.f102059e.addAll(list);
        notifyDataSetChanged();
    }
}
