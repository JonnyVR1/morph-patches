package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallGiftListItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class mms extends dac0<BLiveNewGiftWallGiftList> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftList> f134693c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final wps f134694d;

    public mms(wps wpsVar) {
        this.f134694d = wpsVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f134693c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168141P1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, int i, int i2) {
        ((LiveGiftWallGiftListItemView) view).m73637o0(bLiveNewGiftWallGiftList, this.f134694d);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: F */
    public void m155489F() {
        this.f134693c.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftList getItem(int i) {
        return this.f134693c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: H */
    public void m155491H(List<BLiveNewGiftWallGiftList> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f134693c.clear();
        this.f134693c.addAll(list);
        notifyDataSetChanged();
    }
}
