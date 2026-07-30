package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/isk0;", "", "Landroid/content/Context;", "context", "", "accountId", "Ll/vzb;", "dbEncryptionHandler", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/vzb;)V", "data", "", "c", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getAccountId", "Ll/vzb;", "getDbEncryptionHandler", "()Ll/vzb;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class isk0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final vzb dbEncryptionHandler;

    public isk0(@NotNull Context context, @NotNull String str, @NotNull vzb vzbVar) {
        context.getClass();
        str.getClass();
        vzbVar.getClass();
        this.context = context;
        this.accountId = str;
        this.dbEncryptionHandler = vzbVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m138035a() {
        String strM200737b = this.dbEncryptionHandler.m200737b(mxf0.m156891k(this.context, this.accountId, Constants.CACHED_VARIABLES_KEY, WeJson.EMPTY_MAP));
        Logger.m5865d("VarCache loaded cache data:\n" + strM200737b);
        return strM200737b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m138036b() {
        String strM200737b = this.dbEncryptionHandler.m200737b(mxf0.m156891k(this.context, this.accountId, Constants.CACHED_VARIANTS_KEY, WeJson.EMPTY_ARR));
        Logger.m5865d("VarCache loaded variants cache data:\n" + strM200737b);
        return strM200737b;
    }

    /* JADX INFO: renamed from: c */
    public final void m138037c(@NotNull String data) {
        data.getClass();
        Logger.m5865d("storeDataInCache() called with: data = [" + data + ']');
        try {
            mxf0.m156897w(this.context, this.accountId, Constants.CACHED_VARIABLES_KEY, this.dbEncryptionHandler.m200738c(data));
        } catch (Throwable th) {
            Logger.m5868d("storeDataInCache failed", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m138038d(@NotNull String data) {
        data.getClass();
        Logger.m5865d("storeVariantsInCache() called with: data = [" + data + ']');
        try {
            mxf0.m156897w(this.context, this.accountId, Constants.CACHED_VARIANTS_KEY, this.dbEncryptionHandler.m200738c(data));
        } catch (Throwable th) {
            Logger.m5868d("storeVariantsInCache failed", th);
        }
    }
}
