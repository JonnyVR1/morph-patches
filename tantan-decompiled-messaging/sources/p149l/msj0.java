package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p149l.fsj0;

/* JADX INFO: loaded from: classes4.dex */
public class msj0<T extends fsj0> extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<T> f135504e = new ArrayList();

    @Override // p149l.w660
    public int getCount() {
        return this.f135504e.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
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
        T t = this.f135504e.get(i);
        View viewM122951a = t.m122951a(viewGroup.getContext(), viewGroup);
        viewM122951a.setTag(Integer.valueOf(i));
        t.mo122953c(viewM122951a);
        viewGroup.addView(viewM122951a);
        return viewM122951a;
    }

    /* JADX INFO: renamed from: q */
    public void m156149q(List<T> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f135504e.clear();
        this.f135504e.addAll(list);
        notifyDataSetChanged();
    }
}
