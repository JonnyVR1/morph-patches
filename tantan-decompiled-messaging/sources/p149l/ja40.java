package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterTagItem;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ja40 extends gth0<ca40, NewFilterTagItem> {

    /* JADX INFO: renamed from: g */
    public List<ca40> f117065g;

    @Override // p149l.bth0
    /* JADX INFO: renamed from: a */
    public int mo100890a() {
        List<ca40> list = this.f117065g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.gth0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public NewFilterTagItem mo100891h(ViewGroup viewGroup, int i) {
        NewFilterTagItem newFilterTagItem = (NewFilterTagItem) LayoutInflater.from(viewGroup.getContext()).inflate(n6c0.f137371p0, viewGroup, false);
        newFilterTagItem.setData(this.f117065g.get(i));
        return newFilterTagItem;
    }

    @Override // p149l.gth0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ca40 mo100892j(int i) {
        return this.f117065g.get(i);
    }

    /* JADX INFO: renamed from: r */
    public void m140687r(List<ca40> list) {
        if (list == null) {
            return;
        }
        this.f117065g = list;
        m103834b();
    }
}
