package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.C12897a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerItemView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jyj extends jic0<BLiveStickerTemplatesGiftItem> {

    /* JADX INFO: renamed from: c */
    public final List<BLiveStickerTemplatesGiftItem> f123177c;

    /* JADX INFO: renamed from: d */
    public final C12897a f123178d;

    public jyj(C12897a c12897a, List<BLiveStickerTemplatesGiftItem> list) {
        this.f123178d = c12897a;
        this.f123177c = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f123177c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198717C1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, int i, int i2) {
        ((LiveGiftStickerItemView) view).m73467l0(bLiveStickerTemplatesGiftItem, this.f123178d, i2);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveStickerTemplatesGiftItem getItem(int i) {
        return this.f123177c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m147594G(List<BLiveStickerTemplatesGiftItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f123177c.clear();
        this.f123177c.addAll(list);
        notifyDataSetChanged();
    }
}
