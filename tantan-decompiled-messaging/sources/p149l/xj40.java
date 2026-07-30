package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveStretchRange;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class xj40 {

    /* JADX INFO: renamed from: a */
    public static BLiveAddStickerResult f193177a;

    /* JADX INFO: renamed from: a */
    public static Bitmap m209684a(View view, File file) {
        return bk40.m102269i(view, BitmapFactory.decodeFile(file.getAbsolutePath()), t100.m186890d(25.0f), t100.m186890d(20.0f), t100.m186890d(15.0f), t100.m186890d(25.0f), 0.0f, 0.0f, 0.49f, 0.51f);
    }

    /* JADX INFO: renamed from: b */
    public static void m209685b(View view, Bitmap bitmap, BLiveAddStickerResult bLiveAddStickerResult) {
        BLiveAddStickerResult bLiveAddStickerResult2 = f193177a;
        if (bLiveAddStickerResult2 == null && bLiveAddStickerResult == null) {
            return;
        }
        if (bLiveAddStickerResult != null) {
            f193177a = bLiveAddStickerResult;
            bLiveAddStickerResult2 = bLiveAddStickerResult;
        }
        int iIntValue = bLiveAddStickerResult2.contentArea.size() >= 4 ? bLiveAddStickerResult2.contentArea.get(3).intValue() : 0;
        int iIntValue2 = bLiveAddStickerResult2.contentArea.size() >= 1 ? bLiveAddStickerResult2.contentArea.get(0).intValue() : 0;
        int iIntValue3 = bLiveAddStickerResult2.contentArea.size() >= 2 ? bLiveAddStickerResult2.contentArea.get(1).intValue() : 0;
        int iIntValue4 = bLiveAddStickerResult2.contentArea.size() >= 3 ? bLiveAddStickerResult2.contentArea.get(2).intValue() : 0;
        BLiveStretchRange bLiveStretchRange = bLiveAddStickerResult2.stretchRange;
        bk40.m102269i(view, bitmap, iIntValue, iIntValue2 + 20, iIntValue3, iIntValue4, bLiveStretchRange.start, bLiveStretchRange.end, 0.0f, 0.0f);
    }
}
