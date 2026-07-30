package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterTagItem;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class xi40 extends o1i0<qi40, NewFilterTagItem> {

    /* JADX INFO: renamed from: g */
    public List<qi40> f194432g;

    @Override // p153l.j1i0
    /* JADX INFO: renamed from: a */
    public int mo143134a() {
        List<qi40> list = this.f194432g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.o1i0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public NewFilterTagItem mo165612h(ViewGroup viewGroup, int i) {
        NewFilterTagItem newFilterTagItem = (NewFilterTagItem) LayoutInflater.from(viewGroup.getContext()).inflate(sec0.f167585p0, viewGroup, false);
        newFilterTagItem.setData(this.f194432g.get(i));
        return newFilterTagItem;
    }

    @Override // p153l.o1i0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public qi40 mo165614j(int i) {
        return this.f194432g.get(i);
    }

    /* JADX INFO: renamed from: r */
    public void m211098r(List<qi40> list) {
        if (list == null) {
            return;
        }
        this.f194432g = list;
        m143135b();
    }
}
