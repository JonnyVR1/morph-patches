package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceGiftWallLocalItemView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceUserCardGiftWallItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class q6p0 extends jic0<BLiveVoiceGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceGiftItem> f155828c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final y20<BLiveVoiceGiftItem> f155829d;

    /* JADX INFO: renamed from: e */
    public final boolean f155830e;

    public q6p0(boolean z, y20<BLiveVoiceGiftItem> y20Var) {
        this.f155830e = z;
        this.f155829d = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f155828c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f155830e ? LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198858Na, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198916S8, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveVoiceGiftItem bLiveVoiceGiftItem, int i, int i2) {
        if (this.f155830e) {
            ((VoiceUserCardGiftWallItemView) view).m79906j0(bLiveVoiceGiftItem, this.f155829d);
        } else {
            ((VoiceGiftWallLocalItemView) view).m79903j0(bLiveVoiceGiftItem, this.f155829d);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m175597F() {
        this.f155828c.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGiftItem getItem(int i) {
        return this.f155828c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m175599H(List<BLiveVoiceGiftItem> list) {
        this.f155828c.clear();
        this.f155828c.addAll(list);
        notifyDataSetChanged();
    }
}
