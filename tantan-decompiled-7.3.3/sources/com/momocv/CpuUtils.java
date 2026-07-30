package com.momocv;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class CpuUtils {
    private static int exitOpenCL = -1;
    private static int qualcommCPU = -1;

    public static String getCpuModel() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return Build.HARDWARE;
                }
            } while (!line.contains("Hardware"));
            bufferedReader.close();
            return line.split(":")[1].trim();
        } catch (IOException unused) {
        }
    }

    public static boolean rightHardware() {
        int i = exitOpenCL;
        if (i != 0 && qualcommCPU != 0) {
            if (i == -1) {
                exitOpenCL = FileUtil.exist("/system/vendor/lib/libOpenCL.so") ? 1 : 0;
            }
            if (qualcommCPU == -1) {
                String string = FileUtil.readString("/proc/cpuinfo");
                if (TextUtils.isEmpty(string)) {
                    qualcommCPU = 0;
                } else {
                    qualcommCPU = (string.toLowerCase().contains("qualcomm") || string.toLowerCase().contains("qcom")) ? 1 : 0;
                }
                String str = Build.HARDWARE;
                if (qualcommCPU == 0 && !TextUtils.isEmpty(str)) {
                    qualcommCPU = (str.toLowerCase().contains("qualcomm") || str.toLowerCase().contains("qcom")) ? 1 : 0;
                }
            }
            if (exitOpenCL == 1 && qualcommCPU == 1) {
                return true;
            }
        }
        return false;
    }
}
