package tech.sud.base.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UtilsBridge {
    private static final String LINE_SEP = System.getProperty("line.separator");

    public static boolean createOrExistsDir(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    public static boolean createOrExistsFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String formatJson(String str, int i) {
        try {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '{') {
                    return new JSONObject(str).toString(i);
                }
                if (cCharAt == '[') {
                    return new JSONArray(str).toString(i);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    break;
                }
            }
            return str;
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getCurrentProcessName() {
        String currentProcessNameByFile = getCurrentProcessNameByFile();
        if (!TextUtils.isEmpty(currentProcessNameByFile)) {
            return currentProcessNameByFile;
        }
        String currentProcessNameByAms = getCurrentProcessNameByAms();
        return !TextUtils.isEmpty(currentProcessNameByAms) ? currentProcessNameByAms : getCurrentProcessNameByReflect();
    }

    private static String getCurrentProcessNameByAms() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) Utils.getApp().getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                int iMyPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid && (str = runningAppProcessInfo.processName) != null) {
                        return str;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static String getCurrentProcessNameByFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return strTrim;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getCurrentProcessNameByReflect() {
        try {
            Application app = Utils.getApp();
            Field field = app.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(app);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static File getFileByPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    public static String getFullStackTrace(Throwable th) {
        List<String> stackFrameList;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i = size - 1;
        List<String> stackFrameList2 = getStackFrameList((Throwable) arrayList.get(i));
        while (true) {
            int i2 = size - 1;
            if (i2 < 0) {
                break;
            }
            if (i2 != 0) {
                stackFrameList = getStackFrameList((Throwable) arrayList.get(size - 2));
                removeCommonFrames(stackFrameList2, stackFrameList);
            } else {
                stackFrameList = stackFrameList2;
            }
            if (i2 == i) {
                arrayList2.add(((Throwable) arrayList.get(i2)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i2)).toString());
            }
            arrayList2.addAll(stackFrameList2);
            stackFrameList2 = stackFrameList;
            size = i2;
        }
        StringBuilder sb = new StringBuilder();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList2.get(i3);
            i3++;
            sb.append((String) obj);
            sb.append(LINE_SEP);
        }
        return sb.toString();
    }

    private static List<String> getStackFrameList(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), LINE_SEP);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z = true;
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean isSDCardEnableByEnvironment() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static void removeCommonFrames(List<String> list, List<String> list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }

    public static boolean writeFileFromString(File file, String str, boolean z) throws Throwable {
        BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, z));
                try {
                    bufferedWriter.write(str);
                    try {
                        bufferedWriter.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedWriter2 = bufferedWriter;
                    e.printStackTrace();
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static final class FileHead {
        private LinkedHashMap<String, String> mFirst = new LinkedHashMap<>();
        private LinkedHashMap<String, String> mLast = new LinkedHashMap<>();
        private String mName;

        public FileHead(String str) {
            this.mName = str;
        }

        private void append2Host(Map<String, String> map, Map<String, String> map2) {
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                append2Host(map, entry.getKey(), entry.getValue());
            }
        }

        public void addFirst(String str, String str2) {
            append2Host(this.mFirst, str, str2);
        }

        public void append(Map<String, String> map) {
            append2Host(this.mLast, map);
        }

        public String getAppended() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.mLast.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = "************* " + this.mName + " Head ****************\n";
            sb.append(str);
            for (Map.Entry<String, String> entry : this.mFirst.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            sb.append("Rom Info           : ");
            sb.append(RomUtils.getRomInfo());
            sb.append("\nDevice Manufacturer: ");
            sb.append(Build.MANUFACTURER);
            sb.append("\nDevice Model       : ");
            sb.append(Build.MODEL);
            sb.append("\nAndroid Version    : ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\nAndroid SDK        : ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\nApp VersionName    : ");
            sb.append(AppUtils.getAppVersionName());
            sb.append("\nApp VersionCode    : ");
            sb.append(AppUtils.getAppVersionCode());
            sb.append("\n");
            sb.append(getAppended());
            sb.append(str);
            sb.append("\n");
            return sb.toString();
        }

        public void append(String str, String str2) {
            append2Host(this.mLast, str, str2);
        }

        private void append2Host(Map<String, String> map, String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            int length = 19 - str.length();
            if (length > 0) {
                str = str.concat("                   ".substring(0, length));
            }
            map.put(str, str2);
        }
    }

    public static String formatJson(String str) {
        return formatJson(str, 4);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z) {
        return writeFileFromString(getFileByPath(str), str2, z);
    }
}
