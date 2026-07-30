package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkCreateItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ae10 extends dac0<BLiveMultiPkPanelUser> {

    /* JADX INFO: renamed from: c */
    public final Act f68983c;

    /* JADX INFO: renamed from: d */
    public List<BLiveMultiPkPanelUser> f68984d;

    /* JADX INFO: renamed from: e */
    public final e30<Integer> f68985e;

    public ae10(Act act, List<BLiveMultiPkPanelUser> list, e30<Integer> e30Var) {
        ArrayList arrayList = new ArrayList();
        this.f68984d = arrayList;
        arrayList.clear();
        this.f68983c = act;
        this.f68984d.addAll(list);
        this.f68985e = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f68984d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f68983c.inflater().inflate(t6c0.f168367h4, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveMultiPkPanelUser bLiveMultiPkPanelUser, int i, int i2) {
        ((MultiCallPkCreateItemView) view).m75880j0(bLiveMultiPkPanelUser, i2, this.f68985e);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveMultiPkPanelUser getItem(int i) {
        return this.f68984d.get(i);
    }
}
