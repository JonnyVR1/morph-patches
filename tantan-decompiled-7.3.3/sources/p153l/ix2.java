package p153l;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ix2 implements m2m {
    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public static boolean m142397c(Context context, int i) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    @Override // p153l.m2m
    /* JADX INFO: renamed from: b */
    public boolean mo142398b(Context context) {
        return m142397c(context, 24);
    }
}
