package com.tencent.connect.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14559n;
import com.tencent.open.utils.InterfaceC14550e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.connect.share.a */
/* JADX INFO: loaded from: classes12.dex */
public class C13994a {
    /* JADX INFO: renamed from: a */
    public static final Bitmap m83360a(String str, int i) {
        Bitmap bitmapDecodeFile;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            SLog.m85491e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap exception1:", e);
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (options.mCancel || i2 == -1 || i3 == -1) {
            return null;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        if (i2 > i) {
            options.inSampleSize = m83358a(options, -1, i * i);
        }
        options.inJustDecodeBounds = false;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } catch (Exception e2) {
            SLog.m85491e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap exception2:", e2);
            bitmapDecodeFile = null;
        } catch (OutOfMemoryError e3) {
            SLog.m85491e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap OutOfMemoryError:", e3);
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile == null) {
            SLog.m85490e("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap return null");
            return null;
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 <= i5) {
            i4 = i5;
        }
        return i4 > i ? m83359a(bitmapDecodeFile, i) : bitmapDecodeFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final boolean m83365b(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            SLog.m85491e("openSDK_LOG.AsynScaleCompressImage", "isBitMapNeedToCompress exception:", e);
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (options.mCancel || i3 == -1 || i4 == -1) {
            return false;
        }
        int i5 = i3 > i4 ? i3 : i4;
        if (i3 >= i4) {
            i3 = i4;
        }
        SLog.m85488d("openSDK_LOG.AsynScaleCompressImage", "longSide=" + i5 + "shortSide=" + i3);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return i5 > i2 || i3 > i;
    }

    /* JADX INFO: renamed from: b */
    private static int m83364b(BitmapFactory.Options options, int i, int i2) {
        int iMin;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int iCeil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / ((double) i2)));
        if (i == -1) {
            iMin = 128;
        } else {
            double d3 = i;
            iMin = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (iMin >= iCeil) {
            if (i2 == -1 && i == -1) {
                return 1;
            }
            if (i != -1) {
                return iMin;
            }
        }
        return iCeil;
    }

    /* JADX INFO: renamed from: a */
    public static final void m83362a(final Context context, final String str, final InterfaceC14550e interfaceC14550e) {
        SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage()");
        if (TextUtils.isEmpty(str)) {
            interfaceC14550e.mo83353a(1, (String) null);
        } else if (!C14559n.m85660a()) {
            interfaceC14550e.mo83353a(2, (String) null);
        } else {
            final Handler handler = new Handler(context.getMainLooper()) { // from class: com.tencent.connect.share.a.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i == 101) {
                        interfaceC14550e.mo83354a(0, (ArrayList<String>) message.obj);
                    } else if (i != 102) {
                        super.handleMessage(message);
                    } else {
                        interfaceC14550e.mo83353a(message.arg1, (String) null);
                    }
                }
            };
            new Thread(new Runnable() { // from class: com.tencent.connect.share.a.2
                @Override // java.lang.Runnable
                public void run() {
                    String absolutePath;
                    String string;
                    try {
                        Bitmap bitmapM83360a = C13994a.m83360a(str, 840);
                        if (bitmapM83360a != null) {
                            File fileM85588a = C14553h.m85588a("Images");
                            String str2 = null;
                            if (fileM85588a != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(fileM85588a.getAbsolutePath());
                                String str3 = File.separator;
                                sb.append(str3);
                                sb.append(Constants.QQ_SHARE_TEMP_DIR);
                                sb.append(str3);
                                string = sb.toString();
                                absolutePath = null;
                            } else {
                                File fileM85591c = C14553h.m85591c();
                                if (fileM85591c == null) {
                                    SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() getCacheDir = null,return error");
                                    Message messageObtainMessage = handler.obtainMessage();
                                    messageObtainMessage.arg1 = 102;
                                    handler.sendMessage(messageObtainMessage);
                                    return;
                                }
                                absolutePath = fileM85591c.getAbsolutePath();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(absolutePath);
                                String str4 = File.separator;
                                sb2.append(str4);
                                sb2.append(Constants.QQ_SHARE_TEMP_DIR);
                                sb2.append(str4);
                                String string2 = sb2.toString();
                                SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() use cache dir=".concat(string2));
                                string = string2;
                            }
                            String str5 = "share2qq_temp" + C14559n.m85686g(str) + ".jpg";
                            String str6 = str;
                            if (C13994a.m83365b(str6, 840, 840)) {
                                SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() out of bound,compress!");
                                String strM83361a = C13994a.m83361a(bitmapM83360a, string, str5);
                                if (!TextUtils.isEmpty(strM83361a)) {
                                    str6 = strM83361a;
                                }
                            } else {
                                SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() not out of bound,not compress!");
                            }
                            boolean zM85696m = C14559n.m85696m(str6);
                            SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() check file isAppSpecificDir=" + zM85696m);
                            ArrayList arrayList = new ArrayList(2);
                            if (zM85696m) {
                                str2 = str6;
                            } else if (TextUtils.isEmpty(absolutePath)) {
                                String strConcat = string.concat(str5);
                                boolean zM85662a = C14559n.m85662a(context, str6, strConcat);
                                SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() sd permission not denied. copy to app sepcific:" + strConcat + ",isSuccess=" + zM85662a);
                                if (zM85662a) {
                                    str2 = strConcat;
                                }
                            }
                            arrayList.add(str6);
                            arrayList.add(str2);
                            if (arrayList.size() >= 2 && (arrayList.get(0) != null || arrayList.get(1) != null)) {
                                SLog.m85492i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() return success ! destFilePath=[" + ((String) arrayList.get(0)) + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA + ((String) arrayList.get(1)) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
                                Message messageObtainMessage2 = handler.obtainMessage(101);
                                messageObtainMessage2.obj = arrayList;
                                handler.sendMessage(messageObtainMessage2);
                                return;
                            }
                        }
                    } catch (Exception e) {
                        SLog.m85491e("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage runnable exception e:", e);
                    }
                    SLog.m85488d("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() return failed!");
                    Message messageObtainMessage3 = handler.obtainMessage(102);
                    messageObtainMessage3.arg1 = 3;
                    handler.sendMessage(messageObtainMessage3);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m83359a(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            width = height;
        }
        float f = i / width;
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: a */
    public static final String m83361a(Bitmap bitmap, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(str2);
        String string = stringBuffer.toString();
        File file2 = new File(string);
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmap.recycle();
            return string;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m83358a(BitmapFactory.Options options, int i, int i2) {
        int iM83364b = m83364b(options, i, i2);
        if (iM83364b > 8) {
            return ((iM83364b + 7) / 8) * 8;
        }
        int i3 = 1;
        while (i3 < iM83364b) {
            i3 <<= 1;
        }
        return i3;
    }
}
