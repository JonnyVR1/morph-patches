package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyItemView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hu2 extends gac0<BLiveBeautyItem> {

    /* JADX INFO: renamed from: d */
    public List<BLiveBeautyItem> f109470d;

    public hu2(List<BLiveBeautyItem> list, e30<BLiveBeautyItem> e30Var) {
        super(e30Var);
        this.f109470d = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.f109470d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), t6c0.f168466p, null);
    }

    @Override // p149l.gac0, p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveBeautyItem bLiveBeautyItem, int i, int i2) {
        super.mo28823A(view, bLiveBeautyItem, i, i2);
        ((BeautyItemView) view).m72222b(bLiveBeautyItem);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveBeautyItem getItem(int i) {
        return this.f109470d.get(i);
    }
}
