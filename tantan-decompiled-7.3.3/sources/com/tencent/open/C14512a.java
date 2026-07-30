package com.tencent.open;

import android.app.Dialog;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.open.log.SLog;

/* JADX INFO: renamed from: com.tencent.open.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14512a {
    /* JADX INFO: renamed from: a */
    public static void m85393a(Window window) {
        if (window == null) {
            return;
        }
        window.setFlags(1024, 1024);
        window.getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85392a(final Dialog dialog, Handler handler) {
        if (dialog == null || dialog.getContext() == null || handler == null) {
            return;
        }
        Toast.makeText(dialog.getContext(), "网页加载异常，请自行下载并安装QQ后，再重新登录。", 0).show();
        handler.postDelayed(new Runnable() { // from class: com.tencent.open.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dialog.dismiss();
                } catch (Exception e) {
                    SLog.m85491e("openSDK_LOG.DialogUtils", "dismiss dialog exception", e);
                }
            }
        }, 100L);
    }
}
