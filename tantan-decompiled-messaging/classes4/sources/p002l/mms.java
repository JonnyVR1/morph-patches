package p002l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallGiftListItemView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mms extends dac0<BLiveNewGiftWallGiftList> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftList> f15486c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final wps f15487d;

    public mms(wps wpsVar) {
        this.f15487d = wpsVar;
    }

    /* JADX INFO: renamed from: C */
    public int m18083C() {
        return this.f15486c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m18084D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19637P1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m18082A(View view, BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, int i, int i2) {
        ((LiveGiftWallGiftListItemView) view).m7185o0(bLiveNewGiftWallGiftList, this.f15487d);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: F */
    public void m18086F() {
        this.f15486c.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftList getItem(int i) {
        return this.f15486c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: H */
    public void m18088H(List<BLiveNewGiftWallGiftList> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f15486c.clear();
        this.f15486c.addAll(list);
        notifyDataSetChanged();
    }
}
