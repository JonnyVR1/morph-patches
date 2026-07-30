package com.tencent.could.huiyansdk.base;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.could.huiyansdk.entity.HuiYanBaseConfig;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.helper.C14063b;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanBaseApi {

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f58201a;

    /* JADX INFO: renamed from: b */
    public HuiYanBaseCallBack f58202b;

    /* JADX INFO: renamed from: c */
    public HuiYanBaseConfig f58203c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f58204d = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.base.HuiYanBaseApi$a */
    public static final class C14044a {

        /* JADX INFO: renamed from: a */
        public static final HuiYanBaseApi f58205a = new HuiYanBaseApi();
    }

    /* JADX INFO: renamed from: a */
    public void m83424a(int i, int i2) {
        C14068e.a.f58293a.m83520a(1, "HuiYanBaseApi", "updatePreviewSize width:" + i + " height:" + i2);
        C14063b.a.f58253a.getClass();
        YtSDKKitFramework.getInstance().setPreviewRect(new Rect(0, 0, i, i2));
    }

    /* JADX INFO: renamed from: b */
    public HuiYanLiveMode m83426b() {
        HuiYanBaseConfig huiYanBaseConfig = this.f58203c;
        return huiYanBaseConfig == null ? HuiYanLiveMode.ACTION_REFLECT_MODE : huiYanBaseConfig.getHuiYanLiveMode();
    }

    /* JADX INFO: renamed from: a */
    public Context m83423a() {
        WeakReference<Context> weakReference = this.f58201a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: a */
    public void m83425a(String str, int i, long j, String str2) {
        HuiYanBaseCallBack huiYanBaseCallBack = this.f58202b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo(str, i, j, str2);
        }
    }
}
