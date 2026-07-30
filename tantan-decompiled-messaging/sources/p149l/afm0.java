package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class afm0 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<bfm0> f69196e;

    public afm0(List<bfm0> list) {
        ArrayList arrayList = new ArrayList();
        this.f69196e = arrayList;
        if (vwb.m200296J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p149l.w660
    public int getCount() {
        List<bfm0> list = this.f69196e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f69196e.get(i).m101548b();
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
        View viewM101549c = this.f69196e.get(i).m101549c();
        viewGroup.addView(viewM101549c);
        return viewM101549c;
    }

    /* JADX INFO: renamed from: q */
    public void m96258q(List<bfm0> list) {
        this.f69196e.clear();
        this.f69196e.addAll(list);
        notifyDataSetChanged();
    }
}
