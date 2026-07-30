package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterGenderItem;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ba40 extends gth0<ca40, NewFilterGenderItem> {

    /* JADX INFO: renamed from: g */
    public List<ca40> f74650g;

    @Override // p149l.bth0
    /* JADX INFO: renamed from: a */
    public int mo100890a() {
        List<ca40> list = this.f74650g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.gth0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public NewFilterGenderItem mo100891h(ViewGroup viewGroup, int i) {
        NewFilterGenderItem newFilterGenderItem = (NewFilterGenderItem) LayoutInflater.from(viewGroup.getContext()).inflate(n6c0.f137369o0, viewGroup, false);
        newFilterGenderItem.setData(this.f74650g.get(i));
        return newFilterGenderItem;
    }

    @Override // p149l.gth0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ca40 mo100892j(int i) {
        return this.f74650g.get(i);
    }

    /* JADX INFO: renamed from: r */
    public void m100895r(List<ca40> list) {
        if (list == null) {
            return;
        }
        this.f74650g = list;
        m103834b();
    }
}
