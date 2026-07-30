package p149l;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sw2 implements szl {
    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public static boolean m186123c(Context context, int i) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    @Override // p149l.szl
    /* JADX INFO: renamed from: b */
    public boolean mo132807b(Context context) {
        return m186123c(context, 24);
    }
}
