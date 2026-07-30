package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.C12734a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class uvj {

    /* JADX INFO: renamed from: a */
    public List<BLiveStickerTemplatesGiftItem> f178537a;

    /* JADX INFO: renamed from: b */
    public LiveGiftStickerContentView f178538b;

    public uvj(List<BLiveStickerTemplatesGiftItem> list) {
        this.f178537a = list;
    }

    /* JADX INFO: renamed from: a */
    public void m196081a(LiveGiftStickerContentView liveGiftStickerContentView, C12734a c12734a) {
        liveGiftStickerContentView.m72278H(this.f178537a, c12734a);
    }

    /* JADX INFO: renamed from: b */
    public LiveGiftStickerContentView m196082b() {
        return this.f178538b;
    }

    /* JADX INFO: renamed from: c */
    public LiveGiftStickerContentView m196083c(ViewGroup viewGroup) {
        LiveGiftStickerContentView liveGiftStickerContentView = (LiveGiftStickerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168193T5, viewGroup, false);
        this.f178538b = liveGiftStickerContentView;
        return liveGiftStickerContentView;
    }
}
