package com.hellogroup.p036mk.fdt;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/FDTException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "(Ljava/lang/String;)V", "ecode", "", "(Ljava/lang/String;I)V", Constants.KEY_T, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "errorCode", "getErrorCode", "()I", "setErrorCode", "(I)V", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public class FDTException extends Exception {
    private int errorCode;

    public FDTException(@Nullable String str) {
        super(str);
        this.errorCode = -1;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public FDTException(@Nullable String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public FDTException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
        this.errorCode = -1;
    }
}
