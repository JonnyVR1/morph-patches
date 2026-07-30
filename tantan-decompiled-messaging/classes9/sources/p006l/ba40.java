package p006l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterGenderItem;
import java.util.List;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ba40 extends gth0<ca40, NewFilterGenderItem> {

    /* JADX INFO: renamed from: g */
    public List<ca40> f8786g;

    @Override // p006l.bth0
    /* JADX INFO: renamed from: a */
    public int mo12578a() {
        List<ca40> list = this.f8786g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p006l.gth0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public NewFilterGenderItem mo12579h(ViewGroup viewGroup, int i) {
        NewFilterGenderItem newFilterGenderItem = (NewFilterGenderItem) LayoutInflater.from(viewGroup.getContext()).inflate(n6c0.o0, viewGroup, false);
        newFilterGenderItem.setData(this.f8786g.get(i));
        return newFilterGenderItem;
    }

    @Override // p006l.gth0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ca40 mo12580j(int i) {
        return this.f8786g.get(i);
    }

    /* JADX INFO: renamed from: r */
    public void m12583r(List<ca40> list) {
        if (list == null) {
            return;
        }
        this.f8786g = list;
        m12897b();
    }
}
