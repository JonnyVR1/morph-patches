package p002l;

import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xwf0 {
    /* JADX INFO: renamed from: a */
    public static int m26152a(List<BLiveStickerTemplatesGiftItem> list, BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        if (!vwb.J(list) && bLiveStickerTemplatesGiftItem != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).giftId.equals(bLiveStickerTemplatesGiftItem.giftId)) {
                    return i % 8;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static tvj m26153b(vvj vvjVar, List<BLiveStickerTemplatesGiftItem> list, BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        if (!vwb.J(list) && bLiveStickerTemplatesGiftItem != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).giftId.equals(bLiveStickerTemplatesGiftItem.giftId)) {
                    return vvjVar.m24177q().get(i / 8).m23645b().getAdapter();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<uvj> m26154c(List<BLiveStickerTemplatesGiftItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            int iCeil = (int) Math.ceil((list.size() * 1.0f) / 8.0f);
            for (int i = 0; i < iCeil; i++) {
                int i2 = i * 8;
                arrayList.add(new uvj(new ArrayList(list.subList(i2, Math.min(i2 + 8, list.size())))));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static int m26155d(List<BLiveStickerTemplatesGiftItem> list) {
        if (vwb.J(list)) {
            return 0;
        }
        return (int) Math.ceil((list.size() * 1.0f) / 8.0f);
    }
}
