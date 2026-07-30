package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategyCoroutine;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/pji;", "", "<init>", "()V", "Companion", "a", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class pji {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final vji m172492a(@NotNull Context context, @NotNull Logger logger, @NotNull h6g0 h6g0Var) {
        return INSTANCE.m172494b(context, logger, h6g0Var);
    }

    /* JADX INFO: renamed from: l.pji$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/pji$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/Logger;", "logger", "Ll/h6g0;", "storeRegistry", "Ll/vji;", "b", "(Landroid/content/Context;Lcom/clevertap/android/sdk/Logger;Ll/h6g0;)Ll/vji;", "", "USE_COROUTINES", "Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static FileResourceProvider m172493a(Context context, Logger logger) {
            context.getClass();
            logger.getClass();
            return FileResourceProvider.INSTANCE.m6556a(context, logger);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final vji m172494b(@NotNull final Context context, @NotNull final Logger logger, @NotNull h6g0 storeRegistry) {
            context.getClass();
            logger.getClass();
            storeRegistry.getClass();
            cqm inAppAssetsStore = storeRegistry.getInAppAssetsStore();
            aki filesStore = storeRegistry.getFilesStore();
            ncr legacyInAppStore = storeRegistry.getLegacyInAppStore();
            Function0 function0 = new Function0() { // from class: l.oji
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return pji.Companion.m172493a(context, logger);
                }
            };
            return new vji(new FileCleanupStrategyCoroutine(function0, null, 2, 0 == true ? 1 : 0), new FilePreloaderCoroutine(function0, logger, null, null, 0L, false, 60, null), inAppAssetsStore, filesStore, legacyInAppStore);
        }

        private Companion() {
        }
    }
}
