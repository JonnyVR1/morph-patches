package com.meituan.robust;

/* JADX INFO: loaded from: classes6.dex */
public interface RobustExtension {
    Object accessDispatch(RobustArguments robustArguments);

    String describeSelfFunction();

    boolean isSupport(RobustArguments robustArguments);

    void notifyListner(String str);
}
