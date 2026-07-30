package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyItemView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class xu2 extends mic0<BLiveBeautyItem> {

    /* JADX INFO: renamed from: d */
    public List<BLiveBeautyItem> f196258d;

    public xu2(List<BLiveBeautyItem> list, y20<BLiveBeautyItem> y20Var) {
        super(y20Var);
        this.f196258d = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.f196258d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), yec0.f199198p, null);
    }

    @Override // p153l.mic0, p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveBeautyItem bLiveBeautyItem, int i, int i2) {
        super.mo29822A(view, bLiveBeautyItem, i, i2);
        ((BeautyItemView) view).m73405b(bLiveBeautyItem);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public BLiveBeautyItem getItem(int i) {
        return this.f196258d.get(i);
    }
}
