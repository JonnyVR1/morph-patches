package com.momo.mcamera.util;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.core.glcore.util.FileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class CopyAssetsToSDCard extends IntentService {
    private static final String KEY_FILTER_VERSION = "KEY_FILTER_VERSION";
    int Filter_Version;
    int Sticker_Version;

    public CopyAssetsToSDCard() {
        super("CopyAssetsToSDCard");
        this.Filter_Version = 9;
        this.Sticker_Version = 1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0044 A[Catch: IOException -> 0x0040, TRY_LEAVE, TryCatch #4 {IOException -> 0x0040, blocks: (B:28:0x003c, B:32:0x0044), top: B:40:0x003c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    private static void copyAndCloseStream(InputStream e, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (e.read(bArr) > 0) {
                            fileOutputStream2.write(bArr);
                        }
                        fileOutputStream2.flush();
                        e.close();
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (e != 0) {
                            e.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (e != 0) {
                            try {
                                e.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void copyAssertFileToSDcard(String str, String str2) throws Throwable {
        try {
            InputStream inputStreamOpen = getResources().getAssets().open(str);
            File parentFile = new File(str2).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            copyAndCloseStream(inputStreamOpen, new File(str2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void copyRawFileToSDcard(int i, String str, String str2) throws Throwable {
        try {
            String str3 = getResources().getResourceEntryName(i) + str2;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            copyAndCloseStream(getResources().openRawResource(i), new File(file, str3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) throws Throwable {
        String str = FileUtil.getCacheDirectory(this) + "/stickers.zip." + this.Filter_Version;
        String str2 = FileUtil.getCacheDirectory(this) + "/stickers";
        File file = new File(str);
        if (new File(str2).exists()) {
            return;
        }
        FileUtil.deleteFile(str2);
        copyAssertFileToSDcard("stickers.zip", str);
        try {
            FileUtil.ZipUtil.decompress(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copyAssertFileToSDcard(Context context, String str, String str2) throws Throwable {
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            File parentFile = new File(str2).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            copyAndCloseStream(inputStreamOpen, new File(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
