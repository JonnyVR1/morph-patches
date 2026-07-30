package p002l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0323a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerContentView;
import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uvj {

    /* JADX INFO: renamed from: a */
    public List<BLiveStickerTemplatesGiftItem> f20847a;

    /* JADX INFO: renamed from: b */
    public LiveGiftStickerContentView f20848b;

    public uvj(List<BLiveStickerTemplatesGiftItem> list) {
        this.f20847a = list;
    }

    /* JADX INFO: renamed from: a */
    public void m23644a(LiveGiftStickerContentView liveGiftStickerContentView, C0323a c0323a) {
        liveGiftStickerContentView.m5751H(this.f20847a, c0323a);
    }

    /* JADX INFO: renamed from: b */
    public LiveGiftStickerContentView m23645b() {
        return this.f20848b;
    }

    /* JADX INFO: renamed from: c */
    public LiveGiftStickerContentView m23646c(ViewGroup viewGroup) {
        LiveGiftStickerContentView liveGiftStickerContentView = (LiveGiftStickerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19689T5, viewGroup, false);
        this.f20848b = liveGiftStickerContentView;
        return liveGiftStickerContentView;
    }
}
