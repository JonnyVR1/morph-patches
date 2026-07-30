package com.cosmos.photon.baseim.p024im;

/* JADX INFO: loaded from: classes.dex */
public interface ITask {
    void failed();

    boolean process(TaskSender taskSender);

    void success();
}
