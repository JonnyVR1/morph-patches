package p002l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin.LiveGiftWallSkinItemView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import java.util.ArrayList;
import java.util.List;
import l.dac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qns extends dac0<BLiveNewGiftWallGiftDetail> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftDetail> f18104c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public ios f18105d;

    public qns(ios iosVar) {
        this.f18105d = iosVar;
    }

    /* JADX INFO: renamed from: C */
    public int m21487C() {
        return this.f18104c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m21488D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19613N1, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m21486A(View view, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, int i, int i2) {
        ((LiveGiftWallSkinItemView) view).m7206d(bLiveNewGiftWallGiftDetail, this.f18105d);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftDetail getItem(int i) {
        return this.f18104c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public void m21491G(List<BLiveNewGiftWallGiftDetail> list) {
        this.f18104c.clear();
        this.f18104c.addAll(list);
        notifyDataSetChanged();
    }
}
