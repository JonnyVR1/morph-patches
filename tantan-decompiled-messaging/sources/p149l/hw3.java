package p149l;

import android.content.Context;
import androidx.work.C0763c;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.pushnotification.work.CTFlushPushImpressionsWork;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Ll/hw3;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "", "b", "()V", "a", "Landroid/content/Context;", "", "Ljava/lang/String;", "accountId", "Lcom/clevertap/android/sdk/Logger;", "c", "Lcom/clevertap/android/sdk/Logger;", "logger", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class hw3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    public hw3(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        this.context = context;
        String accountId = cleverTapInstanceConfig.getAccountId();
        accountId.getClass();
        this.accountId = accountId;
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final void m133232b() {
        this.logger.verbose(this.accountId, "scheduling one time work request to flush push impressions...");
        try {
            WorkManager.INSTANCE.m4356a(this.context).m4354f(Constants.FLUSH_PUSH_IMPRESSIONS_ONE_TIME_WORKER_NAME, ExistingWorkPolicy.KEEP, new C0763c.a(CTFlushPushImpressionsWork.class).m4441i(new gz5.C17205a().m128832b(NetworkType.CONNECTED).m128834d(true).m128831a()).m4436b());
            this.logger.verbose(this.accountId, "Finished scheduling one time work request to flush push impressions...");
        } catch (Throwable th) {
            this.logger.verbose(this.accountId, "Failed to schedule one time work request to flush push impressions.", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m133233a() {
        if (lw3.m151949s(this.context, 26)) {
            Context context = this.context;
            if (Utils.m5926w(context, context.getPackageName())) {
                m133232b();
            }
        }
    }
}
