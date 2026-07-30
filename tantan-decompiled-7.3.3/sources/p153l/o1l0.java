package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/o1l0;", "", "Landroid/content/Context;", "context", "", "accountId", "Ll/j1c;", "dbEncryptionHandler", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/j1c;)V", "data", "", "c", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getAccountId", "Ll/j1c;", "getDbEncryptionHandler", "()Ll/j1c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class o1l0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final j1c dbEncryptionHandler;

    public o1l0(@NotNull Context context, @NotNull String str, @NotNull j1c j1cVar) {
        context.getClass();
        str.getClass();
        j1cVar.getClass();
        this.context = context;
        this.accountId = str;
        this.dbEncryptionHandler = j1cVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m165653a() {
        String strM143113b = this.dbEncryptionHandler.m143113b(v5g0.m199857k(this.context, this.accountId, Constants.CACHED_VARIABLES_KEY, WeJson.EMPTY_MAP));
        Logger.m5919d("VarCache loaded cache data:\n" + strM143113b);
        return strM143113b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m165654b() {
        String strM143113b = this.dbEncryptionHandler.m143113b(v5g0.m199857k(this.context, this.accountId, Constants.CACHED_VARIANTS_KEY, WeJson.EMPTY_ARR));
        Logger.m5919d("VarCache loaded variants cache data:\n" + strM143113b);
        return strM143113b;
    }

    /* JADX INFO: renamed from: c */
    public final void m165655c(@NotNull String data) {
        data.getClass();
        Logger.m5919d("storeDataInCache() called with: data = [" + data + ']');
        try {
            v5g0.m199863w(this.context, this.accountId, Constants.CACHED_VARIABLES_KEY, this.dbEncryptionHandler.m143114c(data));
        } catch (Throwable th) {
            Logger.m5922d("storeDataInCache failed", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m165656d(@NotNull String data) {
        data.getClass();
        Logger.m5919d("storeVariantsInCache() called with: data = [" + data + ']');
        try {
            v5g0.m199863w(this.context, this.accountId, Constants.CACHED_VARIANTS_KEY, this.dbEncryptionHandler.m143114c(data));
        } catch (Throwable th) {
            Logger.m5922d("storeVariantsInCache failed", th);
        }
    }
}
