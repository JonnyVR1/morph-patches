package com.tencent.could.huiyansdk.base;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface HuiYanBaseCallBack {
    /* JADX INFO: renamed from: a */
    void mo82223a();

    /* JADX INFO: renamed from: a */
    void mo82224a(int i, boolean z, boolean z2);

    /* JADX INFO: renamed from: a */
    void mo82225a(String str);

    /* JADX INFO: renamed from: a */
    void mo82226a(HashMap<String, Object> map);

    /* JADX INFO: renamed from: b */
    void mo82227b();

    /* JADX INFO: renamed from: b */
    void mo82228b(String str);

    /* JADX INFO: renamed from: c */
    void mo82229c();

    void onFail(int i, String str);

    void onOperateTimeEvent(String str, int i, boolean z, String str2);

    void updateOperateInfo(String str, int i, long j, String str2);
}
