package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import l.eb2;
import l.vwb;
import p002l.fsj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class msj0<T extends fsj0> extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<T> f15615e = new ArrayList();

    public int getCount() {
        return this.f15615e.size();
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m18146o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m18147p(ViewGroup viewGroup, int i) {
        T t = this.f15615e.get(i);
        View viewM13482a = t.m13482a(viewGroup.getContext(), viewGroup);
        viewM13482a.setTag(Integer.valueOf(i));
        t.mo13484c(viewM13482a);
        viewGroup.addView(viewM13482a);
        return viewM13482a;
    }

    /* JADX INFO: renamed from: q */
    public void m18148q(List<T> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f15615e.clear();
        this.f15615e.addAll(list);
        notifyDataSetChanged();
    }
}
