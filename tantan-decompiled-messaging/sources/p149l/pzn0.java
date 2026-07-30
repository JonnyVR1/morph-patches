package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class pzn0 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<qzn0> f151962e;

    public pzn0(List<qzn0> list) {
        ArrayList arrayList = new ArrayList();
        this.f151962e = arrayList;
        if (vwb.m200296J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p149l.w660
    public int getCount() {
        List<qzn0> list = this.f151962e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f151962e.get(i).m177275b();
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
        View viewM177276c = this.f151962e.get(i).m177276c();
        viewGroup.addView(viewM177276c);
        return viewM177276c;
    }

    /* JADX INFO: renamed from: q */
    public void m172243q(List<qzn0> list) {
        this.f151962e.clear();
        this.f151962e.addAll(list);
        notifyDataSetChanged();
    }
}
