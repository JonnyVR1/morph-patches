package com.bytedance.realx.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class RXDeviceInfoAndroid {
    public static final int BUFFER_SIZE = 8192;
    public static final int DEVICE_INFO_UNKNOWN = -1;
    private static final int ERROR_RESULT = -1;
    private static final String MEMORY_INFO_PATH = "/proc/meminfo";
    public static final String MEMTOTAL_PATTERN = "MemTotal[\\s]*:[\\s]*(\\d+)[\\s]*kB\n";
    private static final String ORIGIN_CPU_MANUFACTURER_PATTERN = "Hardware[\\s]*:[\\s]*([\\S\\s]*)\n";
    private static final String TAG = "DeviceInfo";
    private static final Pattern CPU_MANUFACTURER_PATTERN = Pattern.compile("Hardware[\\s]*:[\\s]*([\\S\\s]*)");
    private static String RomVersion = "";
    private static String sCpuModel = "";
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.RXDeviceInfoAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static String GetCpuModel() {
        if (!sCpuModel.isEmpty()) {
            return sCpuModel;
        }
        String strGroup = "";
        try {
            List<String> allLines = readAllLines("/proc/cpuinfo");
            if (allLines != null && !allLines.isEmpty()) {
                Iterator<String> it = allLines.iterator();
                while (it.hasNext()) {
                    try {
                        Matcher matcher = CPU_MANUFACTURER_PATTERN.matcher(it.next());
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                            break;
                        }
                        continue;
                    } catch (Exception e) {
                        Log.e(TAG, "GetCpuModel regex match throw Exception: " + e.getMessage());
                        e.printStackTrace();
                    }
                }
            }
            if (strGroup.isEmpty() && Build.VERSION.SDK_INT >= 31) {
                strGroup = Build.SOC_MODEL;
            }
            sCpuModel = strGroup;
        } catch (OutOfMemoryError unused) {
        }
        return strGroup;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.InputStream, java.lang.Process] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.InputStream] */
    public static String GetCpuModelOrigin() throws Throwable {
        Process processStart;
        String strGroup = "";
        ?? inputStream = 0;
        inputStream = 0;
        try {
            try {
                processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
                try {
                    inputStream = processStart.getInputStream();
                    if (inputStream != 0) {
                        Scanner scanner = new Scanner((InputStream) inputStream, "UTF-8");
                        if (scanner.findWithinHorizon(ORIGIN_CPU_MANUFACTURER_PATTERN, 3000) != null) {
                            MatchResult matchResultMatch = scanner.match();
                            if (matchResultMatch.groupCount() > 0) {
                                try {
                                    strGroup = matchResultMatch.group(1);
                                } catch (NumberFormatException e) {
                                    e.getMessage();
                                }
                            }
                        }
                        scanner.close();
                    }
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            e2.getMessage();
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    e.getMessage();
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e4) {
                            e4.getMessage();
                        }
                    }
                    if (processStart != null) {
                    }
                    return !strGroup.isEmpty() ? strGroup : strGroup;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e5) {
                        e5.getMessage();
                    }
                }
                if (0 != 0) {
                    throw th;
                }
                try {
                    inputStream.destroy();
                    throw th;
                } catch (Exception e6) {
                    e6.getMessage();
                    throw th;
                }
            }
        } catch (IOException e7) {
            e = e7;
            processStart = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                inputStream.close();
            }
            if (0 != 0) {
                throw th;
            }
            inputStream.destroy();
            throw th;
        }
        try {
            processStart.destroy();
        } catch (Exception e8) {
            e8.getMessage();
        }
        if (!strGroup.isEmpty() && Build.VERSION.SDK_INT >= 31) {
            return Build.SOC_MODEL;
        }
    }

    public static String GetDeviceBrand() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    public static String GetDeviceModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    private static int extractValue(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getAppRootPath() {
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            return applicationContext == null ? "" : applicationContext.getFilesDir().getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static int getCPUMaxFrequency() {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            int i4 = fileInputStream.read(bArr);
                            if (i4 == -1 || i4 > 128) {
                                throw new NumberFormatException();
                            }
                            int i5 = 0;
                            while (Character.isDigit(bArr[i5]) && i5 < 128) {
                                i5++;
                            }
                            int i6 = Integer.parseInt(new String(bArr, 0, i5, "UTF-8"));
                            if (i6 > i2) {
                                i2 = i6;
                            }
                            fileInputStream.close();
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (NumberFormatException e) {
                        Log.e(TAG, "getCPUMaxFrequency failed!", e);
                    }
                }
            } catch (IOException unused) {
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int fileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (fileForValue > i2) {
                    i2 = fileForValue;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                throw th2;
            }
        }
        i = i2;
        return i / 1000;
    }

    private static int getCoresFromFileInfo(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, "UTF-8"));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                int coresFromFileString = getCoresFromFileString(line);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return coresFromFileString;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return -1;
                }
                try {
                    fileInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    public static String getCpuName() {
        String strGetCpuModel = GetCpuModel();
        if (strGetCpuModel != null && !strGetCpuModel.isEmpty()) {
            return strGetCpuModel + Constants.PACKNAME_END + Build.HARDWARE;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return Build.HARDWARE;
        }
        return Build.SOC_MODEL + Constants.PACKNAME_END + Build.HARDWARE;
    }

    public static String getCpuNameOrigin() throws Throwable {
        String strGetCpuModelOrigin = GetCpuModelOrigin();
        if (strGetCpuModelOrigin != null && !strGetCpuModelOrigin.isEmpty()) {
            return strGetCpuModelOrigin + Constants.PACKNAME_END + Build.HARDWARE;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return Build.HARDWARE;
        }
        return Build.SOC_MODEL + Constants.PACKNAME_END + Build.HARDWARE;
    }

    public static int getCpuThreads() {
        return getNumberOfCPUCores();
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getGpuName() throws Throwable {
        String gPURenderer = GPUUtil.getGPURenderer();
        return gPURenderer == null ? "null-null" : gPURenderer;
    }

    public static int getMemSize() {
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return -1;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
            if (activityManager == null) {
                return -1;
            }
            activityManager.getMemoryInfo(memoryInfo);
            return (int) Math.ceil((((memoryInfo.totalMem * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
        } catch (Exception e) {
            e.printStackTrace();
            return (int) Math.ceil(-9.5367431640625E-10d);
        }
    }

    public static int getNumberOfCPUCores() {
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo != -1) {
                return coresFromFileInfo;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER);
            if (fileArrListFiles != null) {
                return fileArrListFiles.length;
            }
            return -1;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static String getRomVersionName() {
        if (TextUtils.isEmpty(RomVersion)) {
            RomVersion = RXDeviceUtil.getPhoneSystem(Build.BRAND);
        }
        return RomVersion;
    }

    public static String getSdkVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getSystemDefaultLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getValueFromCpuInfoFile(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream("/proc/cpuinfo");
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.contains(":")) {
                                String[] strArrSplit = line.split(":");
                                if (strArrSplit.length > 1 && strArrSplit[0].contains(str)) {
                                    str2 = strArrSplit[1];
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                            }
                            return str2;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (fileInputStream == null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                throw th;
                            }
                        }
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        try {
            fileInputStream.close();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return str2;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int i = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < i) {
                byte b = bArr[i2];
                if (b == 10 || i2 == 0) {
                    if (b == 10) {
                        i2++;
                    }
                    for (int i3 = i2; i3 < i; i3++) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != str.charAt(i4)) {
                            break;
                        }
                        if (i4 == str.length() - 1) {
                            return extractValue(bArr, i3);
                        }
                    }
                }
                i2++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    private static List<String> readAllLines(String str) {
        ArrayList arrayList = null;
        try {
            ArrayList arrayList2 = new ArrayList();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        return arrayList2;
                    }
                    arrayList2.add(line);
                }
            } catch (FileNotFoundException e) {
                e = e;
                arrayList = arrayList2;
                Log.e(TAG, "GetCpuModel FileNotFoundException:" + e.getMessage());
                e.printStackTrace();
                return arrayList;
            } catch (IOException e2) {
                e = e2;
                arrayList = arrayList2;
                Log.e(TAG, "GetCpuModel IOException:" + e.getMessage());
                e.printStackTrace();
                return arrayList;
            } catch (OutOfMemoryError unused) {
                return arrayList2;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
        } catch (IOException e4) {
            e = e4;
        } catch (OutOfMemoryError unused2) {
            return null;
        }
    }
}
