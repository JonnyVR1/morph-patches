package com.tencent.could.huiyansdk.base;

import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public interface HuiYanBaseCallBack {
    /* JADX INFO: renamed from: a */
    void mo83406a();

    /* JADX INFO: renamed from: a */
    void mo83407a(int i, boolean z, boolean z2);

    /* JADX INFO: renamed from: a */
    void mo83408a(String str);

    /* JADX INFO: renamed from: a */
    void mo83409a(HashMap<String, Object> map);

    /* JADX INFO: renamed from: b */
    void mo83410b();

    /* JADX INFO: renamed from: b */
    void mo83411b(String str);

    /* JADX INFO: renamed from: c */
    void mo83412c();

    void onFail(int i, String str);

    void onOperateTimeEvent(String str, int i, boolean z, String str2);

    void updateOperateInfo(String str, int i, long j, String str2);
}
