package com.sina.weibo.sdk.share;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareUtils {
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[EDGE_INSN: B:104:0x0146->B:67:0x0146 BREAK  A[LOOP:0: B:60:0x0134->B:62:0x013b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9 A[Catch: all -> 0x0016, Exception -> 0x001b, TRY_ENTER, TryCatch #13 {Exception -> 0x001b, all -> 0x0016, blocks: (B:3:0x0005, B:10:0x0021, B:33:0x00ae, B:41:0x00bd, B:43:0x00c3, B:47:0x00da, B:48:0x00e1, B:71:0x0153, B:72:0x0156, B:39:0x00b9), top: B:89:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[Catch: all -> 0x0016, Exception -> 0x001b, TryCatch #13 {Exception -> 0x001b, all -> 0x0016, blocks: (B:3:0x0005, B:10:0x0021, B:33:0x00ae, B:41:0x00bd, B:43:0x00c3, B:47:0x00da, B:48:0x00e1, B:71:0x0153, B:72:0x0156, B:39:0x00b9), top: B:89:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e A[Catch: all -> 0x0122, Exception -> 0x0127, TryCatch #14 {Exception -> 0x0127, all -> 0x0122, blocks: (B:49:0x00f9, B:51:0x011e, B:57:0x012b), top: B:102:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x013b A[Catch: all -> 0x0140, Exception -> 0x0143, LOOP:0: B:60:0x0134->B:62:0x013b, LOOP_END, TryCatch #1 {all -> 0x0140, blocks: (B:59:0x0132, B:60:0x0134, B:62:0x013b, B:67:0x0146, B:73:0x0157), top: B:89:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0167 A[Catch: Exception -> 0x016a, TRY_LEAVE, TryCatch #4 {Exception -> 0x016a, blocks: (B:75:0x0162, B:77:0x0167), top: B:91:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0172 A[Catch: Exception -> 0x0175, TRY_LEAVE, TryCatch #6 {Exception -> 0x0175, blocks: (B:80:0x016d, B:82:0x0172), top: B:95:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:95:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static String copyFileToWeiboTem(Context context, Uri uri, int i) throws Throwable {
        Throwable th;
        ?? r11;
        Exception exc;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        ?? r12;
        Object obj;
        Throwable th2;
        ?? r10;
        Uri uri2;
        Cursor cursorQuery;
        String string;
        BufferedInputStream bufferedInputStream2;
        File file;
        byte[] bArr;
        int i2;
        String str;
        ?? r2 = 0;
        try {
            try {
                String packageName = WeiboAppManager.queryWbInfoInternal(context).getPackageName();
                if (TextUtils.isEmpty(packageName)) {
                    packageName = "com.sina.weibo";
                }
                try {
                    String str2 = "/Android/data/" + packageName + "/files/.composerTem/";
                    new File(Environment.getExternalStorageDirectory().getAbsolutePath() + str2).mkdirs();
                    Calendar calendar = Calendar.getInstance();
                    try {
                        try {
                            if (uri.getScheme().equals("file")) {
                                string = calendar.getTimeInMillis() + uri.getLastPathSegment();
                                uri2 = uri;
                                cursorQuery = null;
                            } else {
                                uri2 = uri;
                                try {
                                    cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                                    if (cursorQuery != null) {
                                        try {
                                            if (cursorQuery.moveToFirst()) {
                                                string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            } else {
                                                string = null;
                                                uri2 = uri2;
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            e.toString();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            string = null;
                                        }
                                    } else {
                                        string = null;
                                        uri2 = uri2;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    cursorQuery = null;
                                    e.toString();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    string = null;
                                    uri2 = uri2;
                                    if (TextUtils.isEmpty(string)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(Calendar.getInstance().getTimeInMillis());
                                        if (i == 0) {
                                            str = "_sdk_temp.mp4";
                                        } else {
                                            str = "_sdk_temp.jpg";
                                        }
                                        sb.append(str);
                                        string = sb.toString();
                                    }
                                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(context.getContentResolver().openFileDescriptor(uri2, "r").getFileDescriptor()));
                                    file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + str2 + string);
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        bArr = new byte[1444];
                                        while (true) {
                                            i2 = bufferedInputStream2.read(bArr);
                                            if (i2 != -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i2);
                                        }
                                        String path = file.getPath();
                                        try {
                                            bufferedInputStream2.close();
                                            fileOutputStream.close();
                                        } catch (Exception unused) {
                                        }
                                        return path;
                                    } catch (Exception e3) {
                                        exc = e3;
                                        bufferedInputStream = bufferedInputStream2;
                                        LogUtil.m81662e("weibo sdk copy", exc.toString());
                                        if (bufferedInputStream != null) {
                                            try {
                                                bufferedInputStream.close();
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                            } catch (Exception unused2) {
                                                return null;
                                            }
                                        } else if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        return null;
                                    }
                                }
                            }
                            if (cursorQuery != null) {
                                uri2 = uri2;
                                cursorQuery.close();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            uri2 = uri;
                        }
                        uri2 = uri2;
                        if (TextUtils.isEmpty(string)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Calendar.getInstance().getTimeInMillis());
                            if (i == 0) {
                                str = "_sdk_temp.mp4";
                            } else {
                                str = "_sdk_temp.jpg";
                            }
                            sb2.append(str);
                            string = sb2.toString();
                        }
                        bufferedInputStream2 = new BufferedInputStream(new FileInputStream(context.getContentResolver().openFileDescriptor(uri2, "r").getFileDescriptor()));
                        try {
                            file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + str2 + string);
                            if (file.exists()) {
                                file.delete();
                            }
                            fileOutputStream = new FileOutputStream(file);
                            bArr = new byte[1444];
                            while (true) {
                                i2 = bufferedInputStream2.read(bArr);
                                if (i2 != -1) {
                                    break;
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            }
                            String path2 = file.getPath();
                            bufferedInputStream2.close();
                            fileOutputStream.close();
                            return path2;
                        } catch (Exception e5) {
                            exc = e5;
                            fileOutputStream = null;
                            bufferedInputStream = bufferedInputStream2;
                        } catch (Throwable th3) {
                            th = th3;
                            r12 = 0;
                            obj = bufferedInputStream2;
                            r2 = obj;
                            r11 = r12;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                } catch (Exception unused3) {
                                    throw th;
                                }
                            }
                            if (r11 != 0) {
                                throw th;
                            }
                            r11.close();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        r10 = 0;
                        if (r10 == 0) {
                            throw th2;
                        }
                        r10.close();
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    r10 = uri;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = uri;
                r12 = i;
            }
        } catch (Exception e6) {
            exc = e6;
            bufferedInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            r11 = 0;
            if (r2 != 0) {
                r2.close();
            }
            if (r11 != 0) {
                throw th;
            }
            r11.close();
            throw th;
        }
    }
}
