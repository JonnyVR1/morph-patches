package com.momo.xeengine;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class XEngineException extends Exception {
    public static final String CONTEXT_NOT_SET = "引擎全局上下文未设置";
    public static final String LIBRARY_LOAD_ERROR = "引擎动态库加载错误";
    public static final String LIBRARY_VERSION_ERROR = "引擎动态库版本错误";
    public static final String UNKNOWN_ERROR = "未知异常";

    public XEngineException(String str) {
        super(str);
    }

    public XEngineException(String str, Throwable th) {
        super(str, th);
    }

    public XEngineException(Throwable th) {
        super(th);
    }
}
