package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class aag extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<j760<String, View>> f68556e;

    public aag(List<j760<String, View>> list) {
        ArrayList arrayList = new ArrayList();
        this.f68556e = arrayList;
        arrayList.addAll(list);
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f68556e.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f68556e.get(i).f116564a;
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
        View view = this.f68556e.get(i).f116565b;
        viewGroup.addView(view);
        return view;
    }
}
