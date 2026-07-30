package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.greet.NewTagStatusItem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class da40 extends vdm<ea40, NewTagStatusItem> {

    /* JADX INFO: renamed from: f */
    public List<ea40> f85191f;

    @Override // p149l.sdm
    /* JADX INFO: renamed from: a */
    public int mo110558a() {
        List<ea40> list = this.f85191f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.vdm
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public NewTagStatusItem mo110559g(ViewGroup viewGroup, int i) {
        NewTagStatusItem newTagStatusItem = (NewTagStatusItem) o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126311I, viewGroup, false);
        newTagStatusItem.setData(this.f85191f.get(i));
        return newTagStatusItem;
    }

    @Override // p149l.vdm
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ea40 mo110560h(int i) {
        return this.f85191f.get(i);
    }

    /* JADX INFO: renamed from: o */
    public void m110563o(List<ea40> list) {
        if (list == null) {
            return;
        }
        this.f85191f = list;
        m183506b();
    }
}
