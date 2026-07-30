package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0323a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerItemView;
import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.List;
import l.dac0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tvj extends dac0<BLiveStickerTemplatesGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveStickerTemplatesGiftItem> f20398c;

    /* JADX INFO: renamed from: d */
    public final C0323a f20399d;

    public tvj(C0323a c0323a, List<BLiveStickerTemplatesGiftItem> list) {
        this.f20399d = c0323a;
        this.f20398c = list;
    }

    /* JADX INFO: renamed from: C */
    public int m23181C() {
        return this.f20398c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m23182D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19481C1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m23180A(View view, BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i, int i2) {
        ((LiveGiftStickerItemView) view).m5757l0(bLiveStickerTemplatesGiftItem, this.f20399d, i2);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveStickerTemplatesGiftItem getItem(int i) {
        return this.f20398c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m23185G(List<BLiveStickerTemplatesGiftItem> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f20398c.clear();
        this.f20398c.addAll(list);
        notifyDataSetChanged();
    }
}
