package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallGiftListItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nos extends jic0<BLiveNewGiftWallGiftList> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftList> f143025c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final xrs f143026d;

    public nos(xrs xrsVar) {
        this.f143026d = xrsVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f143025c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198873P1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, int i, int i2) {
        ((LiveGiftWallGiftListItemView) view).m74820o0(bLiveNewGiftWallGiftList, this.f143026d);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: F */
    public void m164185F() {
        this.f143025c.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftList getItem(int i) {
        return this.f143025c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: H */
    public void m164187H(List<BLiveNewGiftWallGiftList> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f143025c.clear();
        this.f143025c.addAll(list);
        notifyDataSetChanged();
    }
}
