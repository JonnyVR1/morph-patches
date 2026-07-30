package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveStretchRange;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class ls40 {

    /* JADX INFO: renamed from: a */
    public static BLiveAddStickerResult f133393a;

    /* JADX INFO: renamed from: a */
    public static Bitmap m155673a(View view, File file) {
        return ps40.m173588i(view, BitmapFactory.decodeFile(file.getAbsolutePath()), qa00.m175859d(25.0f), qa00.m175859d(20.0f), qa00.m175859d(15.0f), qa00.m175859d(25.0f), 0.0f, 0.0f, 0.49f, 0.51f);
    }

    /* JADX INFO: renamed from: b */
    public static void m155674b(View view, Bitmap bitmap, BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResult2 = f133393a;
        if (bLiveAddStickerResult2 == null && bLiveAddStickerResult == null) {
            return;
        }
        if (bLiveAddStickerResult != null) {
            f133393a = bLiveAddStickerResult;
            bLiveAddStickerResult2 = bLiveAddStickerResult;
        }
        int iIntValue = bLiveAddStickerResult2.contentArea.size() >= 4 ? bLiveAddStickerResult2.contentArea.get(3).intValue() : 0;
        int iIntValue2 = bLiveAddStickerResult2.contentArea.size() >= 1 ? bLiveAddStickerResult2.contentArea.get(0).intValue() : 0;
        int iIntValue3 = bLiveAddStickerResult2.contentArea.size() >= 2 ? bLiveAddStickerResult2.contentArea.get(1).intValue() : 0;
        int iIntValue4 = bLiveAddStickerResult2.contentArea.size() >= 3 ? bLiveAddStickerResult2.contentArea.get(2).intValue() : 0;
        BLiveStretchRange bLiveStretchRange = bLiveAddStickerResult2.stretchRange;
        ps40.m173588i(view, bitmap, iIntValue, iIntValue2 + 20, iIntValue3, iIntValue4, bLiveStretchRange.start, bLiveStretchRange.end, 0.0f, 0.0f);
    }
}
