package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bjl extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<cjl> f75920e;

    public bjl(List<cjl> list) {
        ArrayList arrayList = new ArrayList();
        this.f75920e = arrayList;
        if (vwb.m200296J(list)) {
            return;
        }
        arrayList.addAll(list);
    }

    @Override // p149l.w660
    public int getCount() {
        List<cjl> list = this.f75920e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f75920e.get(i).m107176b();
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
        View viewM107177c = this.f75920e.get(i).m107177c();
        viewGroup.addView(viewM107177c);
        return viewM107177c;
    }

    /* JADX INFO: renamed from: q */
    public void m102186q(List<cjl> list) {
        this.f75920e.clear();
        this.f75920e.addAll(list);
        notifyDataSetChanged();
    }
}
