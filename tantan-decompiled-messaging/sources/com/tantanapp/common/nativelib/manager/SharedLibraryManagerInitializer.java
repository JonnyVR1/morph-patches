package com.tantanapp.common.nativelib.manager;

import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003RM\u0010\u0010\u001a'\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/SharedLibraryManagerInitializer;", "", "<init>", "()V", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "func", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "setInstallNativeLibraryPathAction", "(Lkotlin/jvm/functions/Function1;)V", "getInstallNativeLibraryPathAction$annotations", "installNativeLibraryPathAction", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class SharedLibraryManagerInitializer {

    @NotNull
    public static final SharedLibraryManagerInitializer INSTANCE = new SharedLibraryManagerInitializer();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super Function0<? extends Throwable>, ? extends Throwable> installNativeLibraryPathAction = new Function1<Function0<? extends Throwable>, Throwable>() { // from class: com.tantanapp.common.nativelib.manager.SharedLibraryManagerInitializer$installNativeLibraryPathAction$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Throwable invoke(@NotNull Function0<? extends Throwable> function0) {
            function0.getClass();
            return function0.invoke();
        }
    };

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Function1<Function0<? extends Throwable>, Throwable> m81269a() {
        return installNativeLibraryPathAction;
    }
}
