package com.cosmos.photon.baseim.p025im;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;

/* JADX INFO: loaded from: classes.dex */
public abstract class SendTask implements ITask {
    public static final int TASK_TYPE_ASYNC = 2;
    public static final int TASK_TYPE_SUCCESSION = 0;
    public static final int TASK_TYPE_SUCCESSION_LONG = 1;
    private String taskId;
    private int type;

    public SendTask(int i) {
        this.taskId = LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default;
        this.type = i;
    }

    @NonNull
    public String getId() {
        return this.taskId;
    }

    public int getType() {
        return this.type;
    }

    public SendTask(int i, @NonNull String str) {
        this.type = i;
        this.taskId = str;
    }
}
