package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.C12734a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerItemView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tvj extends dac0<BLiveStickerTemplatesGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveStickerTemplatesGiftItem> f172308c;

    /* JADX INFO: renamed from: d */
    public final C12734a f172309d;

    public tvj(C12734a c12734a, List<BLiveStickerTemplatesGiftItem> list) {
        this.f172309d = c12734a;
        this.f172308c = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f172308c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f167985C1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i, int i2) {
        ((LiveGiftStickerItemView) view).m72284l0(bLiveStickerTemplatesGiftItem, this.f172309d, i2);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveStickerTemplatesGiftItem getItem(int i) {
        return this.f172308c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m190749G(List<BLiveStickerTemplatesGiftItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f172308c.clear();
        this.f172308c.addAll(list);
        notifyDataSetChanged();
    }
}
