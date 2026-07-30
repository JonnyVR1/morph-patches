package com.cosmos.photon.baseim.p025im;

/* JADX INFO: loaded from: classes.dex */
public interface ITask {
    void failed();

    boolean process(TaskSender taskSender);

    void success();
}
