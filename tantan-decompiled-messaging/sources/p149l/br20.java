package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterZodiacsItem;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class br20 extends eth0<String, NewFilterZodiacsItem> {

    /* JADX INFO: renamed from: e */
    public List<luh0> f76831e;

    @Override // p149l.bth0
    /* JADX INFO: renamed from: a */
    public int mo100890a() {
        List<luh0> list = this.f76831e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.eth0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public NewFilterZodiacsItem mo103438g(ViewGroup viewGroup, int i) {
        NewFilterZodiacsItem newFilterZodiacsItem = (NewFilterZodiacsItem) LayoutInflater.from(viewGroup.getContext()).inflate(n6c0.f137373q0, viewGroup, false);
        newFilterZodiacsItem.setData(this.f76831e.get(i));
        return newFilterZodiacsItem;
    }

    @Override // p149l.eth0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String mo103439i(int i) {
        return this.f76831e.get(i).f130064c;
    }

    /* JADX INFO: renamed from: p */
    public void m103442p(List<luh0> list) {
        if (list == null) {
            return;
        }
        this.f76831e = list;
        m103834b();
    }
}
