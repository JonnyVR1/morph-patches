package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h5g0 {
    /* JADX INFO: renamed from: a */
    public static int m133658a(List<BLiveStickerTemplatesGiftItem> list, BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        if (!jyb.m147479J(list) && bLiveStickerTemplatesGiftItem != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).giftId.equals(bLiveStickerTemplatesGiftItem.giftId)) {
                    return i % 8;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static jyj m133659b(lyj lyjVar, List<BLiveStickerTemplatesGiftItem> list, BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        if (!jyb.m147479J(list) && bLiveStickerTemplatesGiftItem != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).giftId.equals(bLiveStickerTemplatesGiftItem.giftId)) {
                    return (jyj) lyjVar.m156293q().get(i / 8).m151978b().getAdapter();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<kyj> m133660c(List<BLiveStickerTemplatesGiftItem> list) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            int iCeil = (int) Math.ceil((list.size() * 1.0f) / 8.0f);
            for (int i = 0; i < iCeil; i++) {
                int i2 = i * 8;
                arrayList.add(new kyj(new ArrayList(list.subList(i2, Math.min(i2 + 8, list.size())))));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static int m133661d(List<BLiveStickerTemplatesGiftItem> list) {
        if (jyb.m147479J(list)) {
            return 0;
        }
        return (int) Math.ceil((list.size() * 1.0f) / 8.0f);
    }
}
