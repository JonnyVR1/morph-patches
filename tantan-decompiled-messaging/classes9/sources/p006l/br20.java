package p006l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterZodiacsItem;
import java.util.List;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class br20 extends eth0<String, NewFilterZodiacsItem> {

    /* JADX INFO: renamed from: e */
    public List<luh0> f9040e;

    @Override // p006l.bth0
    /* JADX INFO: renamed from: a */
    public int mo12578a() {
        List<luh0> list = this.f9040e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p006l.eth0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public NewFilterZodiacsItem mo12840g(ViewGroup viewGroup, int i) {
        NewFilterZodiacsItem newFilterZodiacsItem = (NewFilterZodiacsItem) LayoutInflater.from(viewGroup.getContext()).inflate(n6c0.q0, viewGroup, false);
        newFilterZodiacsItem.setData(this.f9040e.get(i));
        return newFilterZodiacsItem;
    }

    @Override // p006l.eth0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String mo12841i(int i) {
        return this.f9040e.get(i).f16657c;
    }

    /* JADX INFO: renamed from: p */
    public void m12844p(List<luh0> list) {
        if (list == null) {
            return;
        }
        this.f9040e = list;
        m12897b();
    }
}
