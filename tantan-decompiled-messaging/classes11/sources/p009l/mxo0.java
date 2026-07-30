package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceGiftWallLocalItemView;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceUserCardGiftWallItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mxo0 extends dac0<BLiveVoiceGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceGiftItem> f17143c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final e30<BLiveVoiceGiftItem> f17144d;

    /* JADX INFO: renamed from: e */
    public final boolean f17145e;

    public mxo0(boolean z, e30<BLiveVoiceGiftItem> e30Var) {
        this.f17145e = z;
        this.f17144d = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m18665C() {
        return this.f17143c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m18666D(ViewGroup viewGroup, int i) {
        return this.f17145e ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.Na, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.S8, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m18664A(View view, BLiveVoiceGiftItem bLiveVoiceGiftItem, int i, int i2) {
        if (this.f17145e) {
            ((VoiceUserCardGiftWallItemView) view).m8939j0(bLiveVoiceGiftItem, this.f17144d);
        } else {
            ((VoiceGiftWallLocalItemView) view).m8936j0(bLiveVoiceGiftItem, this.f17144d);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m18668F() {
        this.f17143c.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGiftItem getItem(int i) {
        return this.f17143c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m18670H(List<BLiveVoiceGiftItem> list) {
        this.f17143c.clear();
        this.f17143c.addAll(list);
        notifyDataSetChanged();
    }
}
