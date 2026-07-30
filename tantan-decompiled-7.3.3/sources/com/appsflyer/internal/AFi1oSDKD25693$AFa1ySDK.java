package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1oSDKD25693$AFa1ySDK implements OnCompleteListener<IntegrityTokenResponse> {
    private /* synthetic */ AFi1mSDK getCurrencyIso4217Code;
    private final long getRevenue;

    public AFi1oSDKD25693$AFa1ySDK(AFi1mSDK aFi1mSDK, long j) {
        this.getCurrencyIso4217Code = aFi1mSDK;
        this.getRevenue = j;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NotNull Task<IntegrityTokenResponse> task) throws Throwable {
        Object objInvoke;
        String str;
        task.getClass();
        long j = 0;
        char c = 1;
        if (task.mo15431p()) {
            str = task.mo15427l().token();
            j = 0;
            c = 1;
            objInvoke = null;
        } else {
            try {
                Object[] objArr = {this.getCurrencyIso4217Code, task.mo15426k()};
                Map map = AFc1gSDK.registerClient;
                Object method = map.get(1297776917);
                if (method == null) {
                    method = ((Class) AFc1gSDK.getCurrencyIso4217Code((ViewConfiguration.getWindowTouchSlop() >> 8) + 159, 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) View.MeasureSpec.getSize(0))).getMethod("getCurrencyIso4217Code", (Class) AFc1gSDK.getCurrencyIso4217Code(158 - ImageFormat.getBitsPerPixel(0), 37 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.indexOf("", "")), Exception.class);
                    map.put(1297776917, method);
                }
                objInvoke = ((Method) method).invoke(null, objArr);
                str = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        AFi1mSDK aFi1mSDK = this.getCurrencyIso4217Code;
        long j2 = this.getRevenue;
        Object[] objArr2 = new Object[4];
        objArr2[3] = objInvoke;
        objArr2[2] = str;
        objArr2[c] = Long.valueOf(j2);
        objArr2[0] = aFi1mSDK;
        Map map2 = AFc1gSDK.registerClient;
        Object method2 = map2.get(789342290);
        if (method2 == null) {
            method2 = ((Class) AFc1gSDK.getCurrencyIso4217Code(159 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, (char) TextUtils.getOffsetAfter("", 0))).getMethod("getRevenue", (Class) AFc1gSDK.getCurrencyIso4217Code(159 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 37 - Color.alpha(0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)), Long.TYPE, String.class, String.class);
            map2.put(789342290, method2);
        }
        ((Method) method2).invoke(null, objArr2);
        Object[] objArr3 = {this.getCurrencyIso4217Code};
        Object method3 = map2.get(-1655107056);
        if (method3 == null) {
            method3 = ((Class) AFc1gSDK.getCurrencyIso4217Code((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 159, (ViewConfiguration.getTouchSlop() >> 8) + 37, (char) View.resolveSize(0, 0))).getMethod("AFAdRevenueData", (Class) AFc1gSDK.getCurrencyIso4217Code(158 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollBarSize() >> 8) + 37, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1)));
            map2.put(-1655107056, method3);
        }
        ((CountDownLatch) ((Method) method3).invoke(null, objArr3)).countDown();
    }
}
