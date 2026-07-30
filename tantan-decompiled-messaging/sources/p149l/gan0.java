package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class gan0 extends dac0<BLiveVoiceGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveVoiceGiftItem> f101686c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final e30<BLiveVoiceGiftItem> f101687d;

    /* JADX INFO: renamed from: e */
    public uzj<nnn0, qzj> f101688e;

    public gan0(uzj<nnn0, qzj> uzjVar, e30<BLiveVoiceGiftItem> e30Var) {
        this.f101687d = e30Var;
        this.f101688e = uzjVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f101686c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168246Xa, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveVoiceGiftItem bLiveVoiceGiftItem, int i, int i2) {
        ((VoiceGiftWallItemView) view).m76976j0(bLiveVoiceGiftItem, this.f101687d);
    }

    /* JADX INFO: renamed from: F */
    public void m125004F() {
        this.f101686c.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGiftItem getItem(int i) {
        return this.f101686c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m125006H(List<BLiveVoiceGiftItem> list) {
        this.f101686c.clear();
        this.f101686c.addAll(list);
        notifyDataSetChanged();
    }
}
