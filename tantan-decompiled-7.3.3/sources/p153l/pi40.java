package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterGenderItem;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pi40 extends o1i0<qi40, NewFilterGenderItem> {

    /* JADX INFO: renamed from: g */
    public List<qi40> f152513g;

    @Override // p153l.j1i0
    /* JADX INFO: renamed from: a */
    public int mo143134a() {
        List<qi40> list = this.f152513g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.o1i0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public NewFilterGenderItem mo165612h(ViewGroup viewGroup, int i) {
        NewFilterGenderItem newFilterGenderItem = (NewFilterGenderItem) LayoutInflater.from(viewGroup.getContext()).inflate(sec0.f167583o0, viewGroup, false);
        newFilterGenderItem.setData(this.f152513g.get(i));
        return newFilterGenderItem;
    }

    @Override // p153l.o1i0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public qi40 mo165614j(int i) {
        return this.f152513g.get(i);
    }

    /* JADX INFO: renamed from: r */
    public void m172355r(List<qi40> list) {
        if (list == null) {
            return;
        }
        this.f152513g = list;
        m143135b();
    }
}
