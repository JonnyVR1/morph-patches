package com.tencent.could.huiyansdk.operate;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CloudOperateBody {

    @SerializedName("Actions")
    public List<CloudOperateItem> actions = new ArrayList();

    public CloudOperateBody() {
        initData();
    }

    public abstract void initData();

    public abstract void reset();

    public void updateInfo(String str, int i, long j, long j2, String str2) {
        for (CloudOperateItem cloudOperateItem : this.actions) {
            if (cloudOperateItem != null && cloudOperateItem.getAction().equals(str)) {
                cloudOperateItem.updateInfo(i, j, j2);
                cloudOperateItem.setInfo(str2);
            }
        }
    }

    public void updateInfo(String str, int i, long j, long j2) {
        updateInfo(str, i, j, j2, "");
    }
}
