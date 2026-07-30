package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.util.ENCUtils;
import com.cosmos.photon.push.util.PermissionUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UniqueCache {
    private static final String TAG = "UniqueCache";
    private static final String UNIQUE_EXTRA_PATH = ".backup/.mm/.push/.uniqueidcache";
    private final String ENCKey = "uniqueidEncKey";

    private String getCacheUniqueIdFromInner(Context context) {
        try {
            return context.getSharedPreferences(SPKeyConstants.SP_UNIQUE_ID, 0).getString(SPKeyConstants.SP_UNIQUE_ID_KEY, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private String getUniqueIdFromSdCard(Context context) {
        if (!PermissionUtils.checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") || !Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        File file = new File(Environment.getExternalStorageDirectory(), UNIQUE_EXTRA_PATH);
        if (!file.exists()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            randomAccessFile.close();
            return new String(bArr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void saveUniqueInner(Context context, String str) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(SPKeyConstants.SP_UNIQUE_ID, 0).edit();
            editorEdit.putString(SPKeyConstants.SP_UNIQUE_ID_KEY, str);
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[Catch: IOException -> 0x003f, PHI: r0
      0x005d: PHI (r0v6 java.io.FileOutputStream) = (r0v9 java.io.FileOutputStream), (r0v10 java.io.FileOutputStream) binds: [B:33:0x005b, B:37:0x0067] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x003f, blocks: (B:16:0x003b, B:34:0x005d), top: B:53:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    private void saveUniqueSdCard(Context context, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        IOException e;
        FileNotFoundException e2;
        FileOutputStream fileOutputStream2;
        if (!PermissionUtils.checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        Object obj = UNIQUE_EXTRA_PATH;
        File file = new File(externalStorageDirectory, UNIQUE_EXTRA_PATH);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e3) {
                e3.printStackTrace();
                return;
            }
        }
        ?? r2 = 0;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(str.getBytes());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (FileNotFoundException e4) {
                        e2 = e4;
                        e2.printStackTrace();
                        file.delete();
                        fileOutputStream2 = fileOutputStream;
                        obj = fileOutputStream;
                        if (fileOutputStream != null) {
                            fileOutputStream2.close();
                            obj = fileOutputStream2;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        e.printStackTrace();
                        file.delete();
                        fileOutputStream2 = fileOutputStream;
                        obj = fileOutputStream;
                        if (fileOutputStream != null) {
                            fileOutputStream2.close();
                            obj = fileOutputStream2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r2 = obj;
                    if (r2 != 0) {
                        try {
                            r2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                fileOutputStream = null;
                e2 = e7;
            } catch (IOException e8) {
                fileOutputStream = null;
                e = e8;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public JSONObject getCacheUniqueId(Context context) {
        String cacheUniqueIdFromInner = getCacheUniqueIdFromInner(context);
        if (TextUtils.isEmpty(cacheUniqueIdFromInner)) {
            cacheUniqueIdFromInner = getUniqueIdFromSdCard(context);
            if (cacheUniqueIdFromInner != null) {
                MDLog.m7397v(TAG, "getUniqueId from sdcard");
            }
        } else {
            MDLog.m7397v(TAG, "getUniqueId from inner");
        }
        if (TextUtils.isEmpty(cacheUniqueIdFromInner)) {
            return new JSONObject();
        }
        try {
            cacheUniqueIdFromInner = ENCUtils.getInstance().decrypt(cacheUniqueIdFromInner, "uniqueidEncKey");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(cacheUniqueIdFromInner)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(cacheUniqueIdFromInner);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public void saveUnique(Context context, JSONObject jSONObject, String str) throws Throwable {
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            string = ENCUtils.getInstance().encrypt(jSONObject.toString(), "uniqueidEncKey");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
        }
        saveUniqueInner(context, string);
        try {
            jSONObject.put(str, (Object) null);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        String string2 = jSONObject.toString();
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        try {
            string2 = ENCUtils.getInstance().encrypt(jSONObject.toString(), "uniqueidEncKey");
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
        } catch (NoSuchPaddingException e5) {
            e5.printStackTrace();
        }
        saveUniqueSdCard(context, string2);
    }
}
