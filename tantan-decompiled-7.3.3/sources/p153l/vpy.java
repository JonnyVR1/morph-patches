package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;

/* JADX INFO: loaded from: classes11.dex */
public class vpy {

    /* JADX INFO: renamed from: a */
    public static Debug.MemoryInfo[] f185313a;

    /* JADX INFO: renamed from: b */
    public static eqy f185314b = new eqy();

    /* JADX INFO: renamed from: a */
    public static eqy m202349a(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            f185314b.f95428c = (int) Debug.getPss();
            eqy eqyVar = f185314b;
            eqyVar.f95429d = 0;
            eqyVar.f95426a = 0;
            eqyVar.f95427b = 0;
        } else {
            try {
                Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
                f185313a = processMemoryInfo;
                if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                    f185314b.f95428c = processMemoryInfo[0].getTotalPss();
                    eqy eqyVar2 = f185314b;
                    Debug.MemoryInfo memoryInfo = f185313a[0];
                    eqyVar2.f95429d = memoryInfo.otherPss;
                    eqyVar2.f95426a = memoryInfo.nativePss;
                    eqyVar2.f95427b = memoryInfo.dalvikPss;
                }
            } catch (Throwable unused) {
                return f185314b;
            }
        }
        return f185314b;
    }
}
