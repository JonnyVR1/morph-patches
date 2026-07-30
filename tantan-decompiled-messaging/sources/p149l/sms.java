package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallNewGiftItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class sms extends dac0<BLiveNewGiftWallGiftDetail> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftDetail> f165377c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final e30<BLiveNewGiftWallGiftDetail> f165378d;

    public sms(e30<BLiveNewGiftWallGiftDetail> e30Var) {
        this.f165378d = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f165377c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168153Q1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, int i, int i2) {
        ((LiveGiftWallNewGiftItemView) view).m73642u(bLiveNewGiftWallGiftDetail, this.f165378d);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: F */
    public void m185027F() {
        this.f165377c.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftDetail getItem(int i) {
        return this.f165377c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: H */
    public void m185029H(List<BLiveNewGiftWallGiftDetail> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f165377c.clear();
        this.f165377c.addAll(list);
        notifyDataSetChanged();
    }
}
