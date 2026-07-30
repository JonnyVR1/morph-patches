package com.tencent.wcdb.repair;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DBDumpUtil {
    private static final String TAG = "WCDB.DBDumpUtil";

    public interface ExecuteSqlCallback {
        String preExecute(String str);
    }

    public static String buildColumnsString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i != arrayList.size() - 1) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        sb.append(")");
        String string = sb.toString();
        System.out.println(string);
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[PHI: r12 r18
      0x0073: PHI (r12v5 java.lang.String) = (r12v1 java.lang.String), (r12v16 java.lang.String), (r12v16 java.lang.String) binds: [B:32:0x0086, B:20:0x0064, B:23:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r18v7 java.io.BufferedReader) = (r18v6 java.io.BufferedReader), (r18v10 java.io.BufferedReader), (r18v10 java.io.BufferedReader) binds: [B:32:0x0086, B:20:0x0064, B:23:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[Catch: all -> 0x006f, IOException -> 0x01f2, TryCatch #2 {IOException -> 0x01f2, blocks: (B:19:0x004e, B:21:0x0066, B:39:0x0098, B:41:0x009e, B:42:0x00a6, B:44:0x00ac, B:61:0x00f1, B:50:0x00c1, B:52:0x00c7, B:53:0x00cf, B:55:0x00d5, B:29:0x0078, B:31:0x0082, B:33:0x0088, B:35:0x008e, B:83:0x0173, B:86:0x017b), top: B:134:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1 A[Catch: all -> 0x006f, IOException -> 0x01f2, TRY_LEAVE, TryCatch #2 {IOException -> 0x01f2, blocks: (B:19:0x004e, B:21:0x0066, B:39:0x0098, B:41:0x009e, B:42:0x00a6, B:44:0x00ac, B:61:0x00f1, B:50:0x00c1, B:52:0x00c7, B:53:0x00cf, B:55:0x00d5, B:29:0x0078, B:31:0x0082, B:33:0x0088, B:35:0x008e, B:83:0x0173, B:86:0x017b), top: B:134:0x004e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, List<String> list, List<String> list2, ExecuteSqlCallback executeSqlCallback, boolean z) throws Throwable {
        BufferedReader bufferedReader;
        boolean z2;
        Throwable th;
        boolean z3;
        String tableNameFromSql;
        boolean z4 = false;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            Log.m84627w(TAG, "Database is not open");
            return false;
        }
        if (!nativeDumpDB(str, str2, str3)) {
            return false;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str3));
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=OFF;");
            sQLiteDatabase.beginTransaction();
            try {
                HashMap map = new HashMap();
                boolean z5 = false;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                loop0: while (true) {
                    String strReplace = null;
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break loop0;
                        }
                        z2 = z4;
                        if (z5) {
                            bufferedReader = bufferedReader2;
                            try {
                                try {
                                    strReplace = strReplace + SignParameters.NEW_LINE + line;
                                    if (strReplace.endsWith(com.meituan.robust.Constants.PACKNAME_END) && nativeIsSqlComplete(strReplace)) {
                                        line = strReplace;
                                        if (list2 == null && list2.size() > 0) {
                                            tableNameFromSql = getTableNameFromSql(line);
                                            Iterator<String> it = list2.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    z3 = true;
                                                    break;
                                                }
                                                if (tableNameFromSql.equals(it.next())) {
                                                    z3 = z2;
                                                    break;
                                                }
                                            }
                                            strReplace = line;
                                        } else if (list == null && list.size() > 0) {
                                            tableNameFromSql = getTableNameFromSql(line);
                                            Iterator<String> it2 = list.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    strReplace = line;
                                                    z3 = z2;
                                                    break;
                                                }
                                                if (tableNameFromSql.equals(it2.next())) {
                                                    strReplace = "";
                                                    z3 = true;
                                                    break;
                                                }
                                            }
                                        } else {
                                            strReplace = line;
                                            z3 = z2;
                                            tableNameFromSql = null;
                                        }
                                        if (z3) {
                                            Log.m84624i(TAG, "filter table %s", tableNameFromSql);
                                            z4 = z2;
                                            z5 = z4;
                                        }
                                    } else {
                                        z4 = z2;
                                    }
                                } catch (IOException unused) {
                                    Log.m84627w(TAG, "I/O error in read sql file ");
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    return z2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    throw th;
                                }
                            }
                        } else {
                            bufferedReader = bufferedReader2;
                            if (!line.startsWith("INSERT") && !line.startsWith("CREATE TABLE")) {
                                z4 = z2;
                            } else if (line.endsWith(com.meituan.robust.Constants.PACKNAME_END) && nativeIsSqlComplete(line)) {
                                if (list2 == null) {
                                    if (list == null) {
                                        strReplace = line;
                                        z3 = z2;
                                        tableNameFromSql = null;
                                    } else {
                                        strReplace = line;
                                        z3 = z2;
                                        tableNameFromSql = null;
                                    }
                                } else if (list == null) {
                                    strReplace = line;
                                    z3 = z2;
                                    tableNameFromSql = null;
                                } else {
                                    strReplace = line;
                                    z3 = z2;
                                    tableNameFromSql = null;
                                }
                                if (z3) {
                                    Log.m84624i(TAG, "filter table %s", tableNameFromSql);
                                    z4 = z2;
                                    z5 = z4;
                                }
                            } else {
                                if (TextUtils.isEmpty(strReplace)) {
                                    strReplace = line;
                                } else {
                                    strReplace = strReplace + SignParameters.NEW_LINE + line;
                                }
                                z4 = z2;
                                z5 = true;
                            }
                        }
                        bufferedReader2 = bufferedReader;
                    }
                    try {
                        if (strReplace.startsWith("CREATE TABLE")) {
                            map.put(tableNameFromSql, buildColumnsString(getColumnNamesFromSql(strReplace)));
                        } else if (strReplace.startsWith("INSERT INTO")) {
                            String str4 = (String) map.get(tableNameFromSql);
                            if (!TextUtils.isEmpty(str4)) {
                                StringBuilder sb = new StringBuilder("INSERT INTO ");
                                sb.append("\"");
                                sb.append(tableNameFromSql);
                                sb.append("\"");
                                String string = sb.toString();
                                sb.append(str4);
                                strReplace = strReplace.replace(string, sb.toString());
                            }
                        }
                        String strPreExecute = executeSqlCallback != null ? executeSqlCallback.preExecute(strReplace) : null;
                        if (!TextUtils.isEmpty(strPreExecute)) {
                            strReplace = strPreExecute;
                        }
                        i2++;
                        sQLiteDatabase.execSQL(strReplace);
                        i3++;
                        if (i3 >= 100) {
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            sQLiteDatabase.beginTransaction();
                            i3 = z2;
                        }
                    } catch (Exception unused2) {
                        i++;
                    }
                    z4 = z2;
                    z5 = z4;
                    bufferedReader2 = bufferedReader;
                    i3 = i3;
                }
                boolean z6 = z4;
                try {
                    bufferedReader2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                if (i2 <= i) {
                    return z6;
                }
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.setTransactionSuccessful();
                }
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
                if (z) {
                    File file = new File(str3);
                    if (file.exists()) {
                        file.delete();
                    }
                    File file2 = new File(str);
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
                Log.m84624i(TAG, "restore : %d , fail:%d ", Integer.valueOf(i2), Integer.valueOf(i));
                return true;
            } catch (IOException unused3) {
                z2 = z4;
                bufferedReader = bufferedReader2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                th = th;
                bufferedReader.close();
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            Log.m84628w(TAG, "SQL file '%s' not found", str3);
            return false;
        }
    }

    public static ArrayList<String> getColumnNamesFromSql(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).trim().split(Constants.SEPARATOR_COMMA);
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            strArrSplit[i] = strTrim;
            arrayList.add(strArrSplit[i].substring(0, strTrim.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)));
        }
        return arrayList;
    }

    public static String getTableNameFromSql(String str) {
        if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        String[] strArrSplit = str.split("\\s");
        if (strArrSplit == null || strArrSplit.length <= 1) {
            return null;
        }
        return strArrSplit[2].replaceAll("\"", "");
    }

    private static native boolean nativeDumpDB(String str, String str2, String str3);

    private static native boolean nativeIsSqlComplete(String str);

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0045: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:70), block:B:16:0x0045 */
    public static byte[] readFromFile(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        File file = new File(str);
        FileInputStream fileInputStream3 = null;
        try {
            if (!file.exists()) {
                Log.m84628w(TAG, "readFromFile error, file is not exit, path = %s", str);
                return null;
            }
            try {
                int length = (int) file.length();
                fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[length];
                    int i = fileInputStream2.read(bArr);
                    if (i == length) {
                        try {
                            fileInputStream2.close();
                            return bArr;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return bArr;
                        }
                    }
                    Log.m84628w(TAG, "readFromFile error, size is not equal, path = %s, file length is %d, count is %d", str, Integer.valueOf(length), Integer.valueOf(i));
                    try {
                        fileInputStream2.close();
                        return null;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    Log.m84619e(TAG, "readFromFile failed!");
                    return null;
                }
            } catch (Exception e5) {
                e = e5;
                fileInputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream3 = fileInputStream;
        }
    }

    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        return doRecoveryDb(sQLiteDatabase, str, str2, str3, null, null, null, true);
    }
}
