package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.greet.NewTagStatusItem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ri40 extends lgm<si40, NewTagStatusItem> {

    /* JADX INFO: renamed from: f */
    public List<si40> f163338f;

    @Override // p153l.igm
    /* JADX INFO: renamed from: a */
    public int mo139944a() {
        List<si40> list = this.f163338f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.lgm
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public NewTagStatusItem mo154083g(ViewGroup viewGroup, int i) {
        NewTagStatusItem newTagStatusItem = (NewTagStatusItem) p9r.m171370a(viewGroup.getContext()).inflate(qec0.f156867I, viewGroup, false);
        newTagStatusItem.setData(this.f163338f.get(i));
        return newTagStatusItem;
    }

    @Override // p153l.lgm
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public si40 mo154084h(int i) {
        return this.f163338f.get(i);
    }

    /* JADX INFO: renamed from: o */
    public void m181574o(List<si40> list) {
        if (list == null) {
            return;
        }
        this.f163338f = list;
        m139945b();
    }
}
