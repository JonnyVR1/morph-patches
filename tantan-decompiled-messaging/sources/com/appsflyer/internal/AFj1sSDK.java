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
    public final Intent m5259I_(@NotNull final String str, final long j) {
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
        Object objM223820constructorimpl;
        Object objM223820constructorimpl2;
        Object mediationNetwork;
        KClass[] kClassArr;
        Throwable thM223823exceptionOrNullimpl;
        Object objM223820constructorimpl3;
        synchronized (this.getRevenue) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            KClass[] kClassArr2 = {Reflection.m87507b(ConcurrentModificationException.class), Reflection.m87507b(ArrayIndexOutOfBoundsException.class)};
            Throwable thM223823exceptionOrNullimpl2 = Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
            if (thM223823exceptionOrNullimpl2 == null) {
                kClassArr = new KClass[]{Reflection.m87507b(RuntimeException.class)};
                thM223823exceptionOrNullimpl = Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
                if (thM223823exceptionOrNullimpl != null) {
                    try {
                        if (ArraysKt.contains(kClassArr, Reflection.m87507b(thM223823exceptionOrNullimpl.getClass()))) {
                            throw thM223823exceptionOrNullimpl;
                        }
                        AFLogger.afErrorLog(str, thM223823exceptionOrNullimpl, false, false);
                        objM223820constructorimpl3 = Result.m223820constructorimpl(t);
                        objM223820constructorimpl = (T) objM223820constructorimpl3;
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM223820constructorimpl3 = Result.m223820constructorimpl(ResultKt.m87238a(th2));
                    }
                }
                ResultKt.m87239b(objM223820constructorimpl);
            } else {
                try {
                    if (!ArraysKt.contains(kClassArr2, Reflection.m87507b(thM223823exceptionOrNullimpl2.getClass()))) {
                        throw thM223823exceptionOrNullimpl2;
                    }
                    if (z) {
                        mediationNetwork = getMediationNetwork(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, thM223823exceptionOrNullimpl2, false, false);
                        mediationNetwork = t;
                    }
                    objM223820constructorimpl2 = Result.m223820constructorimpl(mediationNetwork);
                    objM223820constructorimpl = objM223820constructorimpl2;
                    kClassArr = new KClass[]{Reflection.m87507b(RuntimeException.class)};
                    thM223823exceptionOrNullimpl = Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
                    if (thM223823exceptionOrNullimpl != null) {
                        if (ArraysKt.contains(kClassArr, Reflection.m87507b(thM223823exceptionOrNullimpl.getClass()))) {
                            throw thM223823exceptionOrNullimpl;
                        }
                        AFLogger.afErrorLog(str, thM223823exceptionOrNullimpl, false, false);
                        objM223820constructorimpl3 = Result.m223820constructorimpl(t);
                        objM223820constructorimpl = (T) objM223820constructorimpl3;
                    }
                    ResultKt.m87239b(objM223820constructorimpl);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM223820constructorimpl2 = Result.m223820constructorimpl(ResultKt.m87238a(th3));
                }
            }
            throw th;
        }
        return (T) objM223820constructorimpl;
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
