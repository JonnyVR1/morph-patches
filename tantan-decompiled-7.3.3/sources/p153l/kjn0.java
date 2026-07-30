package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class kjn0 extends jic0<BLiveVoiceGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceGiftItem> f127120c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final y20<BLiveVoiceGiftItem> f127121d;

    /* JADX INFO: renamed from: e */
    public k2k<rwn0, g2k> f127122e;

    public kjn0(k2k<rwn0, g2k> k2kVar, y20<BLiveVoiceGiftItem> y20Var) {
        this.f127121d = y20Var;
        this.f127122e = k2kVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f127120c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198978Xa, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceGiftItem bLiveVoiceGiftItem, int i, int i2) {
        ((VoiceGiftWallItemView) view).m78159j0(bLiveVoiceGiftItem, this.f127121d);
    }

    /* JADX INFO: renamed from: F */
    public void m150050F() {
        this.f127120c.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGiftItem getItem(int i) {
        return this.f127120c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m150052H(List<BLiveVoiceGiftItem> list) {
        this.f127120c.clear();
        this.f127120c.addAll(list);
        notifyDataSetChanged();
    }
}
