package com.momo.mcamera.liveprocessor;

import java.util.List;
import p153l.omw;

/* JADX INFO: loaded from: classes6.dex */
public interface IProcessor<T> {
    public static final int FACE_PROCESS_BY_BYTEDANCE = 0;
    public static final int FACE_PROCESS_BY_MOMO = 1;

    T process(omw omwVar);

    void release();

    void setModelPath(List<String> list);
}
