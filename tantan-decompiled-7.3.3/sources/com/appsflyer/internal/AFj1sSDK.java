package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1sSDK {

    @NotNull
    final Intent getRevenue;

    public AFj1sSDK(@NotNull Intent intent) {
        intent.getClass();
        this.getRevenue = intent;
    }

    @Nullable
    /* JADX INFO: renamed from: I_ */
    public final Intent m5269I_(@NotNull final String str, final long j) {
        str.getClass();
        Function0<Intent> function0 = new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1sSDK.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1sSDK.this.getRevenue.putExtra(str, j);
            }
        };
        StringBuilder sb = new StringBuilder("Error while trying to write ");
        sb.append(str);
        sb.append(" extra to intent");
        return (Intent) getMediationNetwork(function0, sb.toString(), null, true);
    }

    public final boolean getCurrencyIso4217Code(@NotNull final String str) {
        str.getClass();
        Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1sSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1sSDK.this.getRevenue.hasExtra(str));
            }
        };
        StringBuilder sb = new StringBuilder("Error while trying to check presence of ");
        sb.append(str);
        sb.append(" extra from intent");
        Boolean bool = (Boolean) getMediationNetwork(function0, sb.toString(), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:25:0x0073, B:27:0x0081, B:31:0x008c), top: B:39:0x0073, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #0 {all -> 0x008a, blocks: (B:25:0x0073, B:27:0x0081, B:31:0x008c), top: B:39:0x0073, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final <T> T getMediationNetwork(Function0<? extends T> function0, String str, T t, boolean z) {
        Object objM225066constructorimpl;
        Object objM225066constructorimpl2;
        Object mediationNetwork;
        KClass[] kClassArr;
        Throwable thM225069exceptionOrNullimpl;
        Object objM225066constructorimpl3;
        synchronized (this.getRevenue) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            KClass[] kClassArr2 = {Reflection.m88396b(ConcurrentModificationException.class), Reflection.m88396b(ArrayIndexOutOfBoundsException.class)};
            Throwable thM225069exceptionOrNullimpl2 = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
            if (thM225069exceptionOrNullimpl2 == null) {
                kClassArr = new KClass[]{Reflection.m88396b(RuntimeException.class)};
                thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
                if (thM225069exceptionOrNullimpl != null) {
                    try {
                        if (ArraysKt.contains(kClassArr, Reflection.m88396b(thM225069exceptionOrNullimpl.getClass()))) {
                            throw thM225069exceptionOrNullimpl;
                        }
                        AFLogger.afErrorLog(str, thM225069exceptionOrNullimpl, false, false);
                        objM225066constructorimpl3 = Result.m225066constructorimpl(t);
                        objM225066constructorimpl = (T) objM225066constructorimpl3;
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM225066constructorimpl3 = Result.m225066constructorimpl(ResultKt.m88127a(th2));
                    }
                }
                ResultKt.m88128b(objM225066constructorimpl);
            } else {
                try {
                    if (!ArraysKt.contains(kClassArr2, Reflection.m88396b(thM225069exceptionOrNullimpl2.getClass()))) {
                        throw thM225069exceptionOrNullimpl2;
                    }
                    if (z) {
                        mediationNetwork = getMediationNetwork(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, thM225069exceptionOrNullimpl2, false, false);
                        mediationNetwork = t;
                    }
                    objM225066constructorimpl2 = Result.m225066constructorimpl(mediationNetwork);
                    objM225066constructorimpl = objM225066constructorimpl2;
                    kClassArr = new KClass[]{Reflection.m88396b(RuntimeException.class)};
                    thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
                    if (thM225069exceptionOrNullimpl != null) {
                        if (ArraysKt.contains(kClassArr, Reflection.m88396b(thM225069exceptionOrNullimpl.getClass()))) {
                            throw thM225069exceptionOrNullimpl;
                        }
                        AFLogger.afErrorLog(str, thM225069exceptionOrNullimpl, false, false);
                        objM225066constructorimpl3 = Result.m225066constructorimpl(t);
                        objM225066constructorimpl = (T) objM225066constructorimpl3;
                    }
                    ResultKt.m88128b(objM225066constructorimpl);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM225066constructorimpl2 = Result.m225066constructorimpl(ResultKt.m88127a(th3));
                }
            }
            throw th;
        }
        return (T) objM225066constructorimpl;
    }

    @Nullable
    public final String getMonetizationNetwork(@NotNull final String str) {
        str.getClass();
        Function0<String> function0 = new Function0<String>() { // from class: com.appsflyer.internal.AFj1sSDK.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1sSDK.this.getRevenue.getStringExtra(str);
            }
        };
        StringBuilder sb = new StringBuilder("Error while trying to read ");
        sb.append(str);
        sb.append(" extra from intent");
        return (String) getMediationNetwork(function0, sb.toString(), null, true);
    }
}
