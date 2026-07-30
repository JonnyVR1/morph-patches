package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyItemView;
import com.p1.mobile.putong.live.base.data.BLiveBeautyItem;
import java.util.List;
import l.e30;
import l.gac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hu2 extends gac0<BLiveBeautyItem> {

    /* JADX INFO: renamed from: d */
    public List<BLiveBeautyItem> f12268d;

    public hu2(List<BLiveBeautyItem> list, e30<BLiveBeautyItem> e30Var) {
        super(e30Var);
        this.f12268d = list;
    }

    /* JADX INFO: renamed from: C */
    public int m14810C() {
        return this.f12268d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14811D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), t6c0.f19962p, null);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m14809A(View view, BLiveBeautyItem bLiveBeautyItem, int i, int i2) {
        super.A(view, bLiveBeautyItem, i, i2);
        ((BeautyItemView) view).m5695b(bLiveBeautyItem);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveBeautyItem getItem(int i) {
        return this.f12268d.get(i);
    }
}
