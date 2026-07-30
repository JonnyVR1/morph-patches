package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkCreateItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class km10 extends jic0<BLiveMultiPkPanelUser> {

    /* JADX INFO: renamed from: c */
    public final Act f127427c;

    /* JADX INFO: renamed from: d */
    public List<BLiveMultiPkPanelUser> f127428d;

    /* JADX INFO: renamed from: e */
    public final y20<Integer> f127429e;

    public km10(Act act, List<BLiveMultiPkPanelUser> list, y20<Integer> y20Var) {
        ArrayList arrayList = new ArrayList();
        this.f127428d = arrayList;
        arrayList.clear();
        this.f127427c = act;
        this.f127428d.addAll(list);
        this.f127429e = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f127428d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f127427c.inflater().inflate(yec0.f199099h4, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveMultiPkPanelUser bLiveMultiPkPanelUser, int i, int i2) {
        ((MultiCallPkCreateItemView) view).m77063j0(bLiveMultiPkPanelUser, i2, this.f127429e);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveMultiPkPanelUser getItem(int i) {
        return this.f127428d.get(i);
    }
}
