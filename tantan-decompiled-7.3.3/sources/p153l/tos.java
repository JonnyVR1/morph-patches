package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallNewGiftItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tos extends jic0<BLiveNewGiftWallGiftDetail> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveNewGiftWallGiftDetail> f175434c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final y20<BLiveNewGiftWallGiftDetail> f175435d;

    public tos(y20<BLiveNewGiftWallGiftDetail> y20Var) {
        this.f175435d = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f175434c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198885Q1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, int i, int i2) {
        ((LiveGiftWallNewGiftItemView) view).m74825u(bLiveNewGiftWallGiftDetail, this.f175435d);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: F */
    public void m192082F() {
        this.f175434c.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveNewGiftWallGiftDetail getItem(int i) {
        return this.f175434c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: H */
    public void m192084H(List<BLiveNewGiftWallGiftDetail> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f175434c.clear();
        this.f175434c.addAll(list);
        notifyDataSetChanged();
    }
}
