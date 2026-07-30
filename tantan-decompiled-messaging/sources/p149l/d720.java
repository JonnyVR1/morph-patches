package p149l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.idv.identity.platform.CardGuideActivity;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;

/* JADX INFO: loaded from: classes7.dex */
public class d720 {
    /* JADX INFO: renamed from: a */
    public static void m110211a(CardGuideActivity cardGuideActivity, String str) {
        if (str == null && str.isEmpty()) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "NavigationUtils", "startAuth", NotificationCompat.CATEGORY_STATUS, "authLinkEmpty:".concat(str));
        } else {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "NavigationUtils", "startAuth");
            cardGuideActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m110212b(Context context, boolean z) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "NavigationUtils", "startFace");
        try {
            return ((Boolean) context.getClassLoader().loadClass("com.idv.identity.face.IdentityFaceApi").getDeclaredMethod("start", Context.class, Boolean.TYPE).invoke(null, context, Boolean.valueOf(z))).booleanValue();
        } catch (Exception e) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "action", "startFace", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m110213c(Context context) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "NavigationUtils", "startNFCInput");
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.idv.identity.nfc.IdentityNfcApi");
            return ((Boolean) clsLoadClass.getDeclaredMethod("startNfcInput", Context.class).invoke(clsLoadClass.getDeclaredMethod("getInstance", null).invoke(null, null), context)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startNFCInput", "action", "startNFC", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m110214d(Context context, String str, String str2, String str3) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "NavigationUtils", "startNFCRead", "passportNum", str, "birthday", str2, "validity", str3);
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.idv.identity.nfc.IdentityNfcApi");
            return ((Boolean) clsLoadClass.getDeclaredMethod("startNfcRead", Context.class, String.class, String.class, String.class).invoke(clsLoadClass.getDeclaredMethod("getInstance", null).invoke(null, null), context, str, str2, str3)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "startNFCInput", "action", "startNFC", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m110215e(boolean z, Context context) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "NavigationUtils", "startOCR");
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.idv.identity.ocr.IdentityOcrApi");
            return z ? m110216f(context) : ((Boolean) clsLoadClass.getDeclaredMethod("startScan", Context.class).invoke(clsLoadClass.getDeclaredMethod("getInstance", null).invoke(null, null), context)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "action", "startOCR", NotificationCompat.CATEGORY_STATUS, "catchException", "exception", e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m110216f(Context context) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "NavigationUtils", "startOcrGuide");
        context.startActivity(new Intent(context, (Class<?>) CardGuideActivity.class));
        return true;
    }
}
