package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterZodiacsItem;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lz20 extends m1i0<String, NewFilterZodiacsItem> {

    /* JADX INFO: renamed from: e */
    public List<t2i0> f134156e;

    @Override // p153l.j1i0
    /* JADX INFO: renamed from: a */
    public int mo143134a() {
        List<t2i0> list = this.f134156e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.m1i0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public NewFilterZodiacsItem mo156398g(ViewGroup viewGroup, int i) {
        NewFilterZodiacsItem newFilterZodiacsItem = (NewFilterZodiacsItem) LayoutInflater.from(viewGroup.getContext()).inflate(sec0.f167587q0, viewGroup, false);
        newFilterZodiacsItem.setData(this.f134156e.get(i));
        return newFilterZodiacsItem;
    }

    @Override // p153l.m1i0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String mo156399i(int i) {
        return this.f134156e.get(i).f171765c;
    }

    /* JADX INFO: renamed from: p */
    public void m156402p(List<t2i0> list) {
        if (list == null) {
            return;
        }
        this.f134156e = list;
        m143135b();
    }
}
