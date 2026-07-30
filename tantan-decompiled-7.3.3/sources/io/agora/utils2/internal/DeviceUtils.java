package io.agora.utils2.internal;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceUtils {
    private static final List<String> CPU_TEMP_FILE_PATHS = Arrays.asList("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");
    private static double INVALIED_TMPERATURE = -100000.0d;
    private static final String TAG = "DeviceUtils";
    private static double TMPERATURE_HIGH_THR = 250.0d;
    private static double TMPERATURE_LOW_THR = -30.0d;

    public static int getCpuTemperature(@NonNull List<String> list) {
        double validateTemperature = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (String str : list) {
            try {
                validateTemperature = getValidateTemperature(readDoubleValueFromFileFirstLine(str, INVALIED_TMPERATURE));
                Logging.m88105d(TAG, "getCpuTemperature from file: " + str);
                break;
            } catch (IllegalArgumentException unused) {
                Logging.m88105d(TAG, "can't getCpuTemperature from file: " + str);
            }
        }
        return (int) (validateTemperature * 1000.0d);
    }

    public static String getDeviceId() {
        String strReplace = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(strReplace)) {
            strReplace = strReplace.replace('/', '_');
        }
        String strReplace2 = Build.MODEL;
        if (!TextUtils.isEmpty(strReplace2)) {
            strReplace2 = strReplace2.replace('/', '_');
        }
        String strReplace3 = Build.PRODUCT;
        if (!TextUtils.isEmpty(strReplace3)) {
            strReplace3 = strReplace3.replace('/', '_');
        }
        String strReplace4 = Build.HARDWARE;
        if (!TextUtils.isEmpty(strReplace4)) {
            strReplace4 = strReplace4.replace('/', '_');
        }
        String lowerCase = (strReplace + "/" + strReplace2 + "/" + strReplace3 + "/" + Build.VERSION.SDK_INT + "/" + strReplace4).toLowerCase();
        Matcher matcher = Pattern.compile(".*[A-Z][A-M][0-9]$").matcher(Build.ID);
        if (Build.BRAND.toLowerCase().equals("samsung") && Build.DEVICE.toLowerCase().startsWith("cs02")) {
            matcher.find();
        }
        return lowerCase;
    }

    public static String getDeviceInfo() {
        String strReplace = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(strReplace)) {
            strReplace = strReplace.replace('/', '_');
        }
        String strReplace2 = Build.MODEL;
        if (!TextUtils.isEmpty(strReplace2)) {
            strReplace2 = strReplace2.replace('/', '_');
        }
        return (strReplace + "/" + strReplace2).toLowerCase();
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER.toLowerCase();
    }

    public static String getSystemInfo() {
        return "Android/" + Build.VERSION.RELEASE;
    }

    public static double getValidateTemperature(double d) throws IllegalArgumentException {
        if (Math.abs(d) > 1000.0d) {
            double d2 = d / 1000.0d;
            if (isTemperatureValid(d2)) {
                return d2;
            }
        } else if (isTemperatureValid(d)) {
            return d;
        }
        wg3.m206174a("not a validate temperature value");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public static boolean isTemperatureValid(double d) {
        return d >= TMPERATURE_LOW_THR && d <= TMPERATURE_HIGH_THR;
    }

    public static double parseDouble(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Exception e) {
            Logging.m88105d(TAG, "failed to conver string to double " + e.toString());
            return d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0053 A[EXC_TOP_SPLITTER, PHI: r3
      0x0053: PHI (r3v5 java.io.BufferedReader) = (r3v4 java.io.BufferedReader), (r3v6 java.io.BufferedReader) binds: [B:26:0x0051, B:32:0x0061] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static double readDoubleValueFromFileFirstLine(String str, double d) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        FileNotFoundException e2;
        File file = new File(str);
        if (file.exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        double d2 = parseDouble(bufferedReader.readLine(), d);
                        try {
                            bufferedReader.close();
                            return d2;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return d2;
                        }
                    } catch (FileNotFoundException e4) {
                        e2 = e4;
                        Logging.m88106d(TAG, "failed to read from file", e2);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return d;
                    } catch (IOException e6) {
                        e = e6;
                        Logging.m88105d(TAG, "failed to read from file " + e.toString());
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return d;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                bufferedReader = null;
                e2 = e8;
            } catch (IOException e9) {
                bufferedReader = null;
                e = e9;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    bufferedReader2.close();
                }
                throw th;
            }
        }
        return d;
    }

    public static int getCpuTemperature() {
        return getCpuTemperature(CPU_TEMP_FILE_PATHS);
    }
}
