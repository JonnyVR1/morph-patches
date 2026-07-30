package com.idv.identity.ocr;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.idv.identity.ocr.p037ui.CardScanActivity;
import com.idv.identity.ocr.p037ui.GlobalPassportIDCardResultActivity;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p046p1.mobile.putong.data.IdCard;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityOcrApi {
    private static IdentityOcrApi s_instance = new IdentityOcrApi();
    private String[] ocrIDCardModelFiles = null;
    private String[] ocrBankCardModelFiles = null;

    public static IdentityOcrApi getInstance() {
        return s_instance;
    }

    private boolean init(Context context) {
        this.ocrIDCardModelFiles = releaseAssetsModels(context, "ocr_idcard", IdCard.TYPE);
        String[] strArrReleaseAssetsModels = releaseAssetsModels(context, "ocr_bankcard", "bankcard");
        this.ocrBankCardModelFiles = strArrReleaseAssetsModels;
        return (this.ocrIDCardModelFiles == null || strArrReleaseAssetsModels == null) ? false : true;
    }

    private String[] releaseAssetsModels(Context context, String str, String str2) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/" + str);
        String[] strArr = null;
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        try {
            String[] list = context.getAssets().list(str2);
            if (list != null && list.length > 0) {
                strArr = new String[list.length];
                for (int i = 0; i < list.length; i++) {
                    String str3 = list[i];
                    InputStream inputStreamOpen = context.getAssets().open(str2 + "/" + str3);
                    String str4 = file + "/" + str3;
                    FileOutputStream fileOutputStream = new FileOutputStream(str4);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStreamOpen.read(bArr, 0, 1024);
                        if (-1 == i2) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i2);
                    }
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    strArr[i] = str4;
                }
            }
            return strArr;
        } catch (Exception e) {
            e.printStackTrace();
            return strArr;
        }
    }

    public String[] getOcrBankCardModelFiles() {
        return this.ocrBankCardModelFiles;
    }

    public String[] getOcrIDCardModelFiles() {
        return this.ocrIDCardModelFiles;
    }

    public boolean startPassport(Context context, boolean z) {
        try {
            Intent intent = new Intent(context, (Class<?>) GlobalPassportIDCardResultActivity.class);
            intent.putExtra("isEnabled", z);
            context.startActivity(intent);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "navigatePassport", NotificationCompat.CATEGORY_STATUS, "success");
            return true;
        } catch (Exception e) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "navigatePassport", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    public boolean startScan(Context context) {
        init(context);
        context.startActivity(new Intent(context, (Class<?>) CardScanActivity.class));
        return true;
    }
}
