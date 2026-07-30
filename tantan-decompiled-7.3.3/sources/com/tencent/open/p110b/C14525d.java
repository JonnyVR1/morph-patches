package com.tencent.open.p110b;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.open.b.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14525d {

    /* JADX INFO: renamed from: a */
    private static String f61060a;

    /* JADX INFO: renamed from: b */
    private static String f61061b;

    /* JADX INFO: renamed from: a */
    public static String m85447a(Context context) {
        if (!TextUtils.isEmpty(f61060a)) {
            return f61060a;
        }
        if (context == null) {
            return "";
        }
        f61060a = "";
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null) {
            f61060a = windowManager.getDefaultDisplay().getWidth() + BaseSei.f14624X + windowManager.getDefaultDisplay().getHeight();
        }
        return f61060a;
    }

    /* JADX INFO: renamed from: a */
    public static String m85446a() {
        return Locale.getDefault().getLanguage();
    }
}
