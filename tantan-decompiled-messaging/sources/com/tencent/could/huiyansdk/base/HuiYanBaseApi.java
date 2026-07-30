package com.tencent.could.huiyansdk.base;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.could.huiyansdk.entity.HuiYanBaseConfig;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.helper.C13900b;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class HuiYanBaseApi {

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f57353a;

    /* JADX INFO: renamed from: b */
    public HuiYanBaseCallBack f57354b;

    /* JADX INFO: renamed from: c */
    public HuiYanBaseConfig f57355c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f57356d = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.base.HuiYanBaseApi$a */
    public static final class C13881a {

        /* JADX INFO: renamed from: a */
        public static final HuiYanBaseApi f57357a = new HuiYanBaseApi();
    }

    /* JADX INFO: renamed from: a */
    public void m82241a(int i, int i2) {
        C13905e.a.f57445a.m82337a(1, "HuiYanBaseApi", "updatePreviewSize width:" + i + " height:" + i2);
        C13900b.a.f57405a.getClass();
        YtSDKKitFramework.getInstance().setPreviewRect(new Rect(0, 0, i, i2));
    }

    /* JADX INFO: renamed from: b */
    public HuiYanLiveMode m82243b() {
        HuiYanBaseConfig huiYanBaseConfig = this.f57355c;
        return huiYanBaseConfig == null ? HuiYanLiveMode.ACTION_REFLECT_MODE : huiYanBaseConfig.getHuiYanLiveMode();
    }

    /* JADX INFO: renamed from: a */
    public Context m82240a() {
        WeakReference<Context> weakReference = this.f57353a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: a */
    public void m82242a(String str, int i, long j, String str2) {
        HuiYanBaseCallBack huiYanBaseCallBack = this.f57354b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo(str, i, j, str2);
        }
    }
}
