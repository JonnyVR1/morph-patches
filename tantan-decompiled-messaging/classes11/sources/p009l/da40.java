package p009l;

import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.greet.NewTagStatusItem;
import java.util.List;
import l.l6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class da40 extends vdm<ea40, NewTagStatusItem> {

    /* JADX INFO: renamed from: f */
    public List<ea40> f11691f;

    @Override // p009l.sdm
    /* JADX INFO: renamed from: a */
    public int mo13034a() {
        List<ea40> list = this.f11691f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p009l.vdm
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public NewTagStatusItem mo13035g(ViewGroup viewGroup, int i) {
        NewTagStatusItem newTagStatusItem = (NewTagStatusItem) o7r.m19649a(viewGroup.getContext()).inflate(l6c0.I, viewGroup, false);
        newTagStatusItem.setData(this.f11691f.get(i));
        return newTagStatusItem;
    }

    @Override // p009l.vdm
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ea40 mo13036h(int i) {
        return this.f11691f.get(i);
    }

    /* JADX INFO: renamed from: o */
    public void m13039o(List<ea40> list) {
        if (list == null) {
            return;
        }
        this.f11691f = list;
        m22102b();
    }
}
