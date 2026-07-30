package com.tencent.open.p105b;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.open.b.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14362d {

    /* JADX INFO: renamed from: a */
    private static String f60212a;

    /* JADX INFO: renamed from: b */
    private static String f60213b;

    /* JADX INFO: renamed from: a */
    public static String m84264a(Context context) {
        if (!TextUtils.isEmpty(f60212a)) {
            return f60212a;
        }
        if (context == null) {
            return "";
        }
        f60212a = "";
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null) {
            f60212a = windowManager.getDefaultDisplay().getWidth() + BaseSei.f13930X + windowManager.getDefaultDisplay().getHeight();
        }
        return f60212a;
    }

    /* JADX INFO: renamed from: a */
    public static String m84263a() {
        return Locale.getDefault().getLanguage();
    }
}
