package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.Sticker;
import com.momo.xeengine.lightningrender.StickerModel;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class h6x {

    /* JADX INFO: renamed from: a */
    private static final Map<StickerModel, MaskModel> f108064a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m133751a(String str) {
        for (Map.Entry<StickerModel, MaskModel> entry : f108064a.entrySet()) {
            if (TextUtils.equals(entry.getKey().getBusinessType(), str)) {
                f108064a.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static MaskModel m133752b(@NonNull StickerModel stickerModel) {
        for (Map.Entry<StickerModel, MaskModel> entry : f108064a.entrySet()) {
            if (TextUtils.equals(entry.getKey().getStickerId(), stickerModel.getStickerId())) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static StickerModel m133753c(@NonNull MaskModel maskModel, Sticker sticker) {
        StickerModel stickerModel = new StickerModel();
        String xengineEsPath = maskModel.getXengineEsPath();
        StringBuilder sb = new StringBuilder();
        sb.append(xengineEsPath);
        String str = File.separator;
        sb.append(str);
        sb.append(maskModel.getXengineSearchPath());
        sb.append(str);
        sb.append(sticker.getImagePreName());
        sb.append(str);
        stickerModel.setAssetPath(sb.toString());
        stickerModel.setStickerId(maskModel.getName());
        stickerModel.setBusinessType(String.valueOf(maskModel.getModelType()));
        stickerModel.setDuration(sticker.getDuration() > 0 ? sticker.getDuration() / 1000 : -1L);
        f108064a.put(stickerModel, maskModel);
        return stickerModel;
    }

    /* JADX INFO: renamed from: d */
    public static StickerModel m133754d(@NonNull MaskModel maskModel, Sticker sticker) {
        StickerModel stickerModel = new StickerModel();
        StringBuilder sb = new StringBuilder();
        sb.append(maskModel.getFolderPath());
        String str = File.separator;
        sb.append(str);
        sb.append(sticker.getImagePreName());
        sb.append(str);
        stickerModel.setAssetPath(sb.toString());
        stickerModel.setStickerId(maskModel.getName());
        stickerModel.setBusinessType(String.valueOf(maskModel.getModelType()));
        stickerModel.setDuration(sticker.getDuration() > 0 ? sticker.getDuration() / 1000 : -1L);
        f108064a.put(stickerModel, maskModel);
        return stickerModel;
    }
}
