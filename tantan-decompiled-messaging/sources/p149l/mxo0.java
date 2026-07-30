package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceGiftWallLocalItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceUserCardGiftWallItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxo0 extends dac0<BLiveVoiceGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceGiftItem> f136189c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final e30<BLiveVoiceGiftItem> f136190d;

    /* JADX INFO: renamed from: e */
    public final boolean f136191e;

    public mxo0(boolean z, e30<BLiveVoiceGiftItem> e30Var) {
        this.f136191e = z;
        this.f136190d = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f136189c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f136191e ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168126Na, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168184S8, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceGiftItem bLiveVoiceGiftItem, int i, int i2) {
        if (this.f136191e) {
            ((VoiceUserCardGiftWallItemView) view).m78723j0(bLiveVoiceGiftItem, this.f136190d);
        } else {
            ((VoiceGiftWallLocalItemView) view).m78720j0(bLiveVoiceGiftItem, this.f136190d);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m156914F() {
        this.f136189c.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGiftItem getItem(int i) {
        return this.f136189c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m156916H(List<BLiveVoiceGiftItem> list) {
        this.f136189c.clear();
        this.f136189c.addAll(list);
        notifyDataSetChanged();
    }
}
