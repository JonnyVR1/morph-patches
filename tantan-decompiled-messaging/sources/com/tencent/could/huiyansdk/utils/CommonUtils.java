package com.tencent.could.huiyansdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.tencent.could.component.common.p079ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.LiveDataCheckResult;
import com.tencent.could.huiyansdk.enums.HuiYanAction;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.manager.C13901a;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.liteav.TXLiteAVCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CommonUtils {

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.CommonUtils$a */
    public static class RunnableC13925a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f57497a;

        public RunnableC13925a(String str) {
            this.f57497a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f57497a);
            if (file.exists() && !file.delete()) {
                C13905e.a.f57445a.m82337a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "delete file error， path:" + this.f57497a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m82387a(byte[] bArr, int i, int i2, String str) {
        File file = new File("/mnt/sdcard/Camera");
        if (!file.exists()) {
            file.mkdir();
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 50, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap bitmapDecodeByteArray = byteArray != null ? BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArray.length) : null;
        try {
            if (bitmapDecodeByteArray == null) {
                C13905e.a.f57445a.m82337a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "bmp is null!");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(String.format("/mnt/sdcard/Camera/%s_%d_%s_%s.jpg", str, Long.valueOf(System.currentTimeMillis()), String.valueOf(i), String.valueOf(i2)));
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String base64DecodeToString(String str) {
        return new String(Base64.decode(str, 2));
    }

    public static String base64EncodeToString(String str) {
        return new String(Base64.encode(str.getBytes(), 2));
    }

    public static TwoTuple calculateTuringErrorCode(long j) {
        int i = (int) (j / (-100000));
        return new TwoTuple(Integer.valueOf(i), Integer.valueOf((int) (j % ((long) (TXLiteAVCode.ERR_SERVER_INFO_UNPACKING_ERROR * i)))));
    }

    public static int[] changeActions(HuiYanAction[] huiYanActionArr) {
        if (huiYanActionArr == null || huiYanActionArr.length == 0) {
            return null;
        }
        int[] iArr = new int[huiYanActionArr.length];
        for (int i = 0; i < huiYanActionArr.length; i++) {
            int iOrdinal = huiYanActionArr[i].ordinal();
            int i2 = 2;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    i2 = 4;
                    if (iOrdinal != 3) {
                        i2 = iOrdinal != 4 ? 1 : 5;
                    }
                } else {
                    i2 = 3;
                }
            }
            iArr[i] = i2;
        }
        return iArr;
    }

    public static LiveDataCheckResult checkHaveColorData(String str) {
        LiveDataCheckResult liveDataCheckResult = new LiveDataCheckResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("select_data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("select_data");
                if (jSONObject2.has(Constants.KEY_CONFIG)) {
                    String[] strArrSplit = jSONObject2.getString(Constants.KEY_CONFIG).split("&");
                    boolean z = false;
                    for (String str2 : strArrSplit) {
                        String[] strArrSplit2 = str2.split("=");
                        if (strArrSplit2.length == 2 && "actref_ux_mode".equals(strArrSplit2[0])) {
                            if ("0".equals(strArrSplit2[1]) || "1".equals(strArrSplit2[1])) {
                                liveDataCheckResult.setHaveColorData(true);
                            } else {
                                liveDataCheckResult.setHaveColorData(false);
                            }
                            z = !"1".equals(strArrSplit2[1]);
                        }
                    }
                    liveDataCheckResult.setNoAction(m82388a(z, strArrSplit));
                    return liveDataCheckResult;
                }
            }
            return liveDataCheckResult;
        } catch (NullPointerException e) {
            e = e;
            C13905e.a.f57445a.m82337a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "check have color data json exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            return liveDataCheckResult;
        } catch (JSONException e2) {
            e = e2;
            C13905e.a.f57445a.m82337a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "check have color data json exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            return liveDataCheckResult;
        }
    }

    public static byte[] clipNV21(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 % 2 == 1) {
            i3--;
        }
        if (i4 % 2 == 1) {
            i4--;
        }
        int i7 = i4 + i6;
        int i8 = ((i5 * i6) * 3) / 2;
        byte[] bArrM82390a = C13926a.a.f57499a.m82390a();
        if (bArrM82390a == null) {
            bArrM82390a = new byte[i8];
        }
        for (int i9 = i4; i9 < i7; i9++) {
            System.arraycopy(bArr, (i9 * i) + i3, bArrM82390a, (i9 - i4) * i5, i5);
        }
        int i10 = (i4 / 2) + i2;
        int i11 = i2 + (i7 / 2);
        for (int i12 = i10; i12 < i11; i12++) {
            System.arraycopy(bArr, (i12 * i) + i3, bArrM82390a, ((i12 - i10) + i6) * i5, i5);
        }
        return bArrM82390a;
    }

    public static void closeCurrentFragment() {
        try {
            final BaseFragment baseFragmentM82322a = C13901a.a.f57409a.m82322a();
            if (baseFragmentM82322a != null) {
                baseFragmentM82322a.runOnUiThread(new Runnable() { // from class: l.nm5
                    @Override // java.lang.Runnable
                    public final void run() {
                        baseFragmentM82322a.exit();
                    }
                });
            }
        } catch (Exception e) {
            C13905e.a.f57445a.m82337a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "close current fragment error! e" + e.getLocalizedMessage());
        }
    }

    public static boolean copyFile(String str, String str2) {
        if (!new File(str).exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            fileInputStream.close();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th3.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (Exception unused) {
            C13905e.a.f57445a.m82337a(2, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "copy video error.");
            return false;
        }
    }

    public static void deleteFileByPath(String str) {
        C13935j.a.f57520a.m82410a(new RunnableC13925a(str));
    }

    public static int dpToPx(View view, float f) {
        return Math.round(view.getResources().getDisplayMetrics().density * f);
    }

    public static Context getContext() {
        Context contextM82230a = C13880j.a.f57352a.m82230a();
        return contextM82230a == null ? HuiYanBaseApi.C13881a.f57357a.m82240a() : contextM82230a;
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(null)) {
            return "";
        }
        throw null;
    }

    public static void saveDataToFile(final byte[] bArr, final int i, final int i2, final String str) {
        C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.mm5
            @Override // java.lang.Runnable
            public final void run() {
                CommonUtils.m82387a(bArr, i, i2, str);
            }
        });
    }

    public static void sendErrorAndExitAuth(int i, String str) {
        final BaseFragment baseFragmentM82322a = C13901a.a.f57409a.m82322a();
        if (baseFragmentM82322a != null) {
            baseFragmentM82322a.runOnUiThread(new Runnable() { // from class: l.om5
                @Override // java.lang.Runnable
                public final void run() {
                    baseFragmentM82322a.exit();
                }
            });
        }
        C13880j.a.f57352a.m82231a(i, str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m82388a(boolean z, String[] strArr) {
        C13905e.a.f57445a.m82337a(1, com.tencent.youtu.sdkkitframework.common.CommonUtils.TAG, "contain action or not: " + z);
        if (!z) {
            return true;
        }
        for (String str : strArr) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length == 2 && "action_data".equals(strArrSplit[0])) {
                for (String str2 : strArrSplit[1].split(Constants.SEPARATOR_COMMA)) {
                    if (!"5".equals(str2.trim())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
