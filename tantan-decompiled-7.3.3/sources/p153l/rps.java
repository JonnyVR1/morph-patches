package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin.LiveGiftWallSkinItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rps extends jic0<BLiveNewGiftWallGiftDetail> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftDetail> f164393c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public jqs f164394d;

    public rps(jqs jqsVar) {
        this.f164394d = jqsVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f164393c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198849N1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, int i, int i2) {
        ((LiveGiftWallSkinItemView) view).m74841d(bLiveNewGiftWallGiftDetail, this.f164394d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftDetail getItem(int i) {
        return this.f164393c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public void m182546G(List<BLiveNewGiftWallGiftDetail> list) {
        this.f164393c.clear();
        this.f164393c.addAll(list);
        notifyDataSetChanged();
    }
}
