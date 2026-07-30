package com.hellogroup.fep.base;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m88121d2 = {"Lcom/hellogroup/fep/base/FepLogModuleType;", "", "mName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMName", "()Ljava/lang/String;", Constants.KEY_CONFIG, "grey", "offlinepkg", "FEP_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public enum FepLogModuleType {
    config("FepConfig"),
    grey("FepGrey"),
    offlinepkg("FepPackage");


    @NotNull
    private final String mName;

    FepLogModuleType(String str) {
        this.mName = str;
    }

    @NotNull
    public final String getMName() {
        return this.mName;
    }
}
