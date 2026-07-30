package com.appsflyer.internal;

import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import p149l.bh3;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1rSDK implements AFj1qSDK {
    @Override // com.appsflyer.internal.AFj1qSDK
    @NotNull
    public final String getRevenue() {
        Object objM223820constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = bh3.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            objM223820constructorimpl = Result.m223820constructorimpl((String) obj);
            if (Result.m223826isFailureimpl(objM223820constructorimpl)) {
                objM223820constructorimpl = "";
            }
            return (String) objM223820constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }
}
