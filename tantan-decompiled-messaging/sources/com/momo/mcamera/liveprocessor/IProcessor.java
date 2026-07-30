package com.momo.mcamera.liveprocessor;

import java.util.List;
import p149l.pjw;

/* JADX INFO: loaded from: classes6.dex */
public interface IProcessor<T> {
    public static final int FACE_PROCESS_BY_BYTEDANCE = 0;
    public static final int FACE_PROCESS_BY_MOMO = 1;

    T process(pjw pjwVar);

    void release();

    void setModelPath(List<String> list);
}
