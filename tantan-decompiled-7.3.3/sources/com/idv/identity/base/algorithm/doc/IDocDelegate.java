package com.idv.identity.base.algorithm.doc;

/* JADX INFO: loaded from: classes7.dex */
public interface IDocDelegate {
    public static final String KEY_ALGORITHM_CONFIG = "algorithmConfig";
    public static final String KEY_UPLOAD_CONFIG = "uploadConfig";

    void handleEvent(int i, String str);

    void handleFinish(int i, Info info);

    void handleUpdate(State state, Attr attr);

    void preProcess();

    boolean processImage(Frame frame);
}
