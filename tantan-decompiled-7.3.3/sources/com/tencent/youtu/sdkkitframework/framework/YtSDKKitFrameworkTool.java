package com.tencent.youtu.sdkkitframework.framework;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class YtSDKKitFrameworkTool {
    public static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static String huiYanVersion = "";
    public final String MD5_FILE_NAME = "files_md5";
    public final Map<String, String> moduleFileMd5Map = new ConcurrentHashMap();
    public final String TAG = YtSDKKitFrameworkTool.class.getSimpleName();

    public enum ModelValidityCode {
        VALIDITY_OK,
        NOT_FOUND_MODEL_DIR,
        NOT_FOUND_MODEL_MD5,
        READ_MD5_ERROR,
        VALIDITY_ERROR,
        TARGET_MD5_NOT_FOUND,
        CREATE_MD5_ERROR,
        MODEL_FILE_MISS
    }

    private String bytesToHexString(byte[] bArr) {
        if (bArr == null || bArr.length != 16) {
            return "";
        }
        char[] cArr = new char[32];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            int i3 = i + 1;
            char[] cArr2 = hexDigits;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private String getFileMD5(File file) throws Throwable {
        if (file != null && file.exists() && file.length() > 0) {
            BufferedInputStream bufferedInputStream = null;
            try {
                try {
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                        try {
                            String inputStreamMd5 = getInputStreamMd5(bufferedInputStream2);
                            bufferedInputStream2.close();
                            return inputStreamMd5;
                        } catch (FileNotFoundException e) {
                            e = e;
                            bufferedInputStream = bufferedInputStream2;
                            e.printStackTrace();
                            YtLogger.m85809e(this.TAG, "get file  md5 error ", e);
                            this = this;
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                                this = this;
                            }
                            return "";
                        } catch (OutOfMemoryError e2) {
                            e = e2;
                            bufferedInputStream = bufferedInputStream2;
                            YtLogger.m85809e(this.TAG, "get file  md5 error oom", e);
                            this = this;
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                                this = this;
                            }
                            return "";
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream = bufferedInputStream2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                    YtLogger.m85809e(this.TAG, "get file  md5 close io error:", e3);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        String str = this.TAG;
                        YtLogger.m85809e(str, "get file  md5 close io error:", e4);
                        this = str;
                        return "";
                    }
                } catch (FileNotFoundException e5) {
                    e = e5;
                } catch (OutOfMemoryError e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return "";
    }

    public static native String getFrameworkVersion();

    private String getInputStreamMd5(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[Message.MESSAGE_STAT];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr, 0, Message.MESSAGE_STAT);
                if (i2 == -1) {
                    break;
                }
                if (i2 > 0) {
                    messageDigest.update(bArr, 0, i2);
                    i += i2;
                }
            }
            return i == 0 ? "" : bytesToHexString(messageDigest.digest());
        } catch (IOException e) {
            e.printStackTrace();
            YtLogger.m85809e(this.TAG, "get input stream  md5 error ", e);
            return "";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            YtLogger.m85809e(this.TAG, "get input stream  md5 error ", e2);
            return "";
        }
    }

    private int getModleMd5ToMap(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file));
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                try {
                                    bufferedReader2.close();
                                    try {
                                        inputStreamReader.close();
                                        return 0;
                                    } catch (IOException e) {
                                        YtLogger.m85809e(this.TAG, "get modle md5 to map close io  error:", e);
                                        e.printStackTrace();
                                        return -1;
                                    }
                                } catch (IOException e2) {
                                    YtLogger.m85809e(this.TAG, "get modle md5 to map close io error:", e2);
                                    e2.printStackTrace();
                                    return -1;
                                }
                            }
                            String[] strArrSplit = line.split(":");
                            if (strArrSplit.length >= 2) {
                                if (TextUtils.isEmpty(strArrSplit[0]) || TextUtils.isEmpty(strArrSplit[1])) {
                                    break;
                                    break;
                                }
                                this.moduleFileMd5Map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                            } else {
                                try {
                                    bufferedReader2.close();
                                    try {
                                        inputStreamReader.close();
                                        return -2;
                                    } catch (IOException e3) {
                                        YtLogger.m85809e(this.TAG, "get modle md5 to map close io  error:", e3);
                                        e3.printStackTrace();
                                        return -1;
                                    }
                                } catch (IOException e4) {
                                    YtLogger.m85809e(this.TAG, "get modle md5 to map close io error:", e4);
                                    e4.printStackTrace();
                                    return -1;
                                }
                            }
                        } catch (Exception e5) {
                            bufferedReader = bufferedReader2;
                            e = e5;
                            YtLogger.m85809e(this.TAG, "get modle md5 to map error:", e);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e6) {
                                    YtLogger.m85809e(this.TAG, "get modle md5 to map close io error:", e6);
                                    e6.printStackTrace();
                                    return -1;
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e7) {
                                    YtLogger.m85809e(this.TAG, "get modle md5 to map close io  error:", e7);
                                    e7.printStackTrace();
                                }
                            }
                            return -1;
                        } catch (Throwable th) {
                            bufferedReader = bufferedReader2;
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e8) {
                                    YtLogger.m85809e(this.TAG, "get modle md5 to map close io error:", e8);
                                    e8.printStackTrace();
                                    return -1;
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e9) {
                                    YtLogger.m85809e(this.TAG, "get modle md5 to map close io  error:", e9);
                                    e9.printStackTrace();
                                    return -1;
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        bufferedReader2.close();
                        try {
                            inputStreamReader.close();
                            return -3;
                        } catch (IOException e10) {
                            YtLogger.m85809e(this.TAG, "get modle md5 to map close io  error:", e10);
                            e10.printStackTrace();
                            return -1;
                        }
                    } catch (IOException e11) {
                        YtLogger.m85809e(this.TAG, "get modle md5 to map close io error:", e11);
                        e11.printStackTrace();
                        return -1;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e13) {
            e = e13;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
    }

    public static synchronized void openBuglyShared(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        String frameworkVersion = getFrameworkVersion();
        if (!TextUtils.isEmpty(huiYanVersion)) {
            frameworkVersion = frameworkVersion + "_" + huiYanVersion;
        }
        editorEdit.putString("63a0c81546", frameworkVersion);
        editorEdit.commit();
    }

    public static native YTImageData rotateYUVImage(byte[] bArr, int i, int i2, int i3);

    private void searchFiles(File file, List<String> list) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            YtLogger.m85809e(this.TAG, "dir is empty", null);
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                searchFiles(file2, list);
            } else {
                String path = file2.getPath();
                if (!file2.getName().equalsIgnoreCase("files_md5")) {
                    list.add(path);
                }
            }
        }
    }

    public static void setHuiYanVersion(String str) {
        huiYanVersion = str;
    }

    private int traverseFolder(File file) throws Throwable {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList();
        searchFiles(file, copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() == 0) {
            YtLogger.m85809e(this.TAG, "dir is empty", null);
            return -1;
        }
        String name = file.getName();
        for (String str : copyOnWriteArrayList) {
            String strSubstring = str.substring(str.indexOf(name) + name.length() + 1);
            if (!this.moduleFileMd5Map.containsKey(strSubstring)) {
                YtLogger.m85809e(this.TAG, "the file name not found md5 with md5 map：".concat(strSubstring), null);
                return -3;
            }
            String fileMD5 = getFileMD5(new File(str));
            if (TextUtils.isEmpty(fileMD5)) {
                YtLogger.m85809e(this.TAG, "create md5 by file is error,md5 is null", null);
                return -4;
            }
            if (!fileMD5.equalsIgnoreCase(this.moduleFileMd5Map.get(strSubstring))) {
                YtLogger.m85809e(this.TAG, "md5 validity by dir error,file name is " + strSubstring + "   target md5 is " + this.moduleFileMd5Map.get(strSubstring) + " cur md5 is " + fileMD5, null);
                return -2;
            }
            this.moduleFileMd5Map.remove(strSubstring);
        }
        if (this.moduleFileMd5Map.size() == 0) {
            return 0;
        }
        for (String str2 : this.moduleFileMd5Map.keySet()) {
            YtLogger.m85809e(this.TAG, "module file miss:" + str2 + " md5:" + this.moduleFileMd5Map.get(str2), null);
        }
        return -5;
    }

    public static native YTImageData yuv2bgrImge(byte[] bArr, int i, int i2, int i3);

    public static native YTImageData yuvRotateAnd2bgrImge(byte[] bArr, int i, int i2, int i3, int i4);

    public ModelValidityCode md5ValidityByDir(String str) throws Throwable {
        YtLogger.m85810i(this.TAG, "module path :" + str);
        File file = new File(str);
        if (!file.exists()) {
            String str2 = this.TAG;
            ModelValidityCode modelValidityCode = ModelValidityCode.VALIDITY_OK;
            YtLogger.m85809e(str2, "md5 validity by dir error:NOT_FOUND_MODEL_DIR", null);
            return ModelValidityCode.NOT_FOUND_MODEL_DIR;
        }
        File file2 = new File(str + "files_md5");
        if (!file2.exists()) {
            String str3 = this.TAG;
            ModelValidityCode modelValidityCode2 = ModelValidityCode.VALIDITY_OK;
            YtLogger.m85809e(str3, "md5 validity by dir error:NOT_FOUND_MODEL_MD5", null);
            return ModelValidityCode.NOT_FOUND_MODEL_MD5;
        }
        if (getModleMd5ToMap(file2) != 0) {
            String str4 = this.TAG;
            ModelValidityCode modelValidityCode3 = ModelValidityCode.VALIDITY_OK;
            YtLogger.m85809e(str4, "md5 validity by dir error:READ_MD5_ERROR", null);
            return ModelValidityCode.READ_MD5_ERROR;
        }
        int iTraverseFolder = traverseFolder(file);
        if (iTraverseFolder == -1) {
            String str5 = this.TAG;
            ModelValidityCode modelValidityCode4 = ModelValidityCode.VALIDITY_OK;
            YtLogger.m85809e(str5, "md5 validity by dir error:NOT_FOUND_MODEL_DIR", null);
            return ModelValidityCode.NOT_FOUND_MODEL_DIR;
        }
        if (iTraverseFolder == -2) {
            String str6 = this.TAG;
            ModelValidityCode modelValidityCode5 = ModelValidityCode.VALIDITY_OK;
            YtLogger.m85809e(str6, "md5 validity by dir error:VALIDITY_ERROR", null);
            return ModelValidityCode.VALIDITY_ERROR;
        }
        if (iTraverseFolder == -3) {
            String str7 = this.TAG;
            ModelValidityCode modelValidityCode6 = ModelValidityCode.VALIDITY_OK;
            YtLogger.m85809e(str7, "md5 validity by dir error:TARGET_MD5_NOT_FOUND", null);
            return ModelValidityCode.TARGET_MD5_NOT_FOUND;
        }
        if (iTraverseFolder == -4) {
            String str8 = this.TAG;
            ModelValidityCode modelValidityCode7 = ModelValidityCode.VALIDITY_OK;
            YtLogger.m85809e(str8, "md5 validity by dir error:CREATE_MD5_ERROR", null);
            return ModelValidityCode.CREATE_MD5_ERROR;
        }
        String str9 = this.TAG;
        if (iTraverseFolder != -5) {
            YtLogger.m85808d(str9, "md5 validity by dir ok");
            return ModelValidityCode.VALIDITY_OK;
        }
        ModelValidityCode modelValidityCode8 = ModelValidityCode.VALIDITY_OK;
        YtLogger.m85809e(str9, "md5 validity by dir error:MODEL_FILE_MISS", null);
        return ModelValidityCode.MODEL_FILE_MISS;
    }
}
