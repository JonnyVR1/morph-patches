package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.C12897a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class kyj {

    /* JADX INFO: renamed from: a */
    public List<BLiveStickerTemplatesGiftItem> f129320a;

    /* JADX INFO: renamed from: b */
    public LiveGiftStickerContentView f129321b;

    public kyj(List<BLiveStickerTemplatesGiftItem> list) {
        this.f129320a = list;
    }

    /* JADX INFO: renamed from: a */
    public void m151977a(LiveGiftStickerContentView liveGiftStickerContentView, C12897a c12897a) {
        liveGiftStickerContentView.m73461H(this.f129320a, c12897a);
    }

    /* JADX INFO: renamed from: b */
    public LiveGiftStickerContentView m151978b() {
        return this.f129321b;
    }

    /* JADX INFO: renamed from: c */
    public LiveGiftStickerContentView m151979c(ViewGroup viewGroup) {
        LiveGiftStickerContentView liveGiftStickerContentView = (LiveGiftStickerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198925T5, viewGroup, false);
        this.f129321b = liveGiftStickerContentView;
        return liveGiftStickerContentView;
    }
}
