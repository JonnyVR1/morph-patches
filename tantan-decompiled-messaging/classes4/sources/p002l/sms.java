package p002l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallNewGiftItemView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sms extends dac0<BLiveNewGiftWallGiftDetail> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftDetail> f19128c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final e30<BLiveNewGiftWallGiftDetail> f19129d;

    public sms(e30<BLiveNewGiftWallGiftDetail> e30Var) {
        this.f19129d = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m22576C() {
        return this.f19128c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m22577D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19649Q1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m22575A(View view, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, int i, int i2) {
        ((LiveGiftWallNewGiftItemView) view).m7190u(bLiveNewGiftWallGiftDetail, this.f19129d);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: F */
    public void m22579F() {
        this.f19128c.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftDetail getItem(int i) {
        return this.f19128c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: H */
    public void m22581H(List<BLiveNewGiftWallGiftDetail> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f19128c.clear();
        this.f19128c.addAll(list);
        notifyDataSetChanged();
    }
}
