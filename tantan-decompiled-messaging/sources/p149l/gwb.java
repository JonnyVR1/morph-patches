package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/gwb;", "", "Landroid/content/Context;", "context", "", "accountId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "a", "()Z", "migrated", "", "e", "(Z)V", "", "c", "()I", "b", "configEncryptionLevel", Constants.INAPP_DATA_TAG, "(I)V", "migrationSuccessful", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getAccountId", "()Ljava/lang/String;", "I", "migrationFailureCount", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class gwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int migrationFailureCount;

    public gwb(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.accountId = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m128390a() {
        return mxf0.m156884b(this.context, this.accountId, "ssInAppMigrated");
    }

    /* JADX INFO: renamed from: b */
    public int m128391b() {
        return mxf0.m156886d(this.context, this.accountId, "encryptionMigrationFailureCount", -1);
    }

    /* JADX INFO: renamed from: c */
    public int m128392c() {
        return mxf0.m156886d(this.context, this.accountId, CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL, -1);
    }

    /* JADX INFO: renamed from: d */
    public void m128393d(int configEncryptionLevel) {
        mxf0.m156895r(this.context, this.accountId, CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL, configEncryptionLevel);
    }

    /* JADX INFO: renamed from: e */
    public void m128394e(boolean migrated) {
        mxf0.m156893n(this.context, this.accountId, "ssInAppMigrated", migrated);
    }

    /* JADX INFO: renamed from: f */
    public void m128395f(boolean migrationSuccessful) {
        this.migrationFailureCount = migrationSuccessful ? 0 : this.migrationFailureCount + 1;
        Logger.m5874v(this.accountId, "Updating migrationFailureCount to " + this.migrationFailureCount);
        mxf0.m156895r(this.context, this.accountId, "encryptionMigrationFailureCount", this.migrationFailureCount);
    }
}
