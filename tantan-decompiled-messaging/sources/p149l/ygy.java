package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;

/* JADX INFO: loaded from: classes13.dex */
public class ygy {

    /* JADX INFO: renamed from: a */
    public static Debug.MemoryInfo[] f198259a;

    /* JADX INFO: renamed from: b */
    public static hhy f198260b = new hhy();

    /* JADX INFO: renamed from: a */
    public static hhy m214780a(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            f198260b.f107861c = (int) Debug.getPss();
            hhy hhyVar = f198260b;
            hhyVar.f107862d = 0;
            hhyVar.f107859a = 0;
            hhyVar.f107860b = 0;
        } else {
            try {
                Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
                f198259a = processMemoryInfo;
                if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                    f198260b.f107861c = processMemoryInfo[0].getTotalPss();
                    hhy hhyVar2 = f198260b;
                    Debug.MemoryInfo memoryInfo = f198259a[0];
                    hhyVar2.f107862d = memoryInfo.otherPss;
                    hhyVar2.f107859a = memoryInfo.nativePss;
                    hhyVar2.f107860b = memoryInfo.dalvikPss;
                }
            } catch (Throwable unused) {
                return f198260b;
            }
        }
        return f198260b;
    }
}
