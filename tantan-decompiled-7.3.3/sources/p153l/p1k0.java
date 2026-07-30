package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p153l.i1k0;

/* JADX INFO: loaded from: classes4.dex */
public class p1k0<T extends i1k0> extends lb2 {

    /* JADX INFO: renamed from: e */
    public List<T> f150175e = new ArrayList();

    @Override // p153l.cf60
    public int getCount() {
        return this.f150175e.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
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
        T t = this.f150175e.get(i);
        View viewM138115a = t.m138115a(viewGroup.getContext(), viewGroup);
        viewM138115a.setTag(Integer.valueOf(i));
        t.mo95709c(viewM138115a);
        viewGroup.addView(viewM138115a);
        return viewM138115a;
    }

    /* JADX INFO: renamed from: q */
    public void m170211q(List<T> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f150175e.clear();
        this.f150175e.addAll(list);
        notifyDataSetChanged();
    }
}
