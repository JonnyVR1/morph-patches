package com.appsflyer.internal;

import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import p153l.ph3;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1rSDK implements AFj1qSDK {
    @Override // com.appsflyer.internal.AFj1qSDK
    @NotNull
    public final String getRevenue() {
        Object objM225066constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = ph3.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            objM225066constructorimpl = Result.m225066constructorimpl((String) obj);
            if (Result.m225072isFailureimpl(objM225066constructorimpl)) {
                objM225066constructorimpl = "";
            }
            return (String) objM225066constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }
}
