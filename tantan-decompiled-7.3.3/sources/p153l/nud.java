package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.cryption.CryptHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Ll/nud;", "", "Ll/kud;", "delayedLegacyInAppDAO", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "cryptHandler", "Ll/axl;", "logger", "", "accountId", "<init>", "(Ll/kud;Lcom/clevertap/android/sdk/cryption/CryptHandler;Ll/axl;Ljava/lang/String;)V", "", "Lorg/json/JSONObject;", "delayedInApps", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Z", "inAppId", "a", "(Ljava/lang/String;)Lorg/json/JSONObject;", "c", "(Ljava/lang/String;)Z", "b", "()Z", "Ll/kud;", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "Ll/axl;", "Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class nud {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final kud delayedLegacyInAppDAO;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CryptHandler cryptHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    public nud(@NotNull kud kudVar, @NotNull CryptHandler cryptHandler, @NotNull axl axlVar, @NotNull String str) {
        kudVar.getClass();
        cryptHandler.getClass();
        axlVar.getClass();
        str.getClass();
        this.delayedLegacyInAppDAO = kudVar;
        this.cryptHandler = cryptHandler;
        this.logger = axlVar;
        this.accountId = str;
    }

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public final JSONObject m164765a(@NotNull String inAppId) {
        inAppId.getClass();
        String strMo151506c = this.delayedLegacyInAppDAO.mo151506c(inAppId);
        if (strMo151506c == null) {
            return null;
        }
        try {
            String strMo6002a = this.cryptHandler.mo6002a(strMo151506c);
            if (strMo6002a != null) {
                return new JSONObject(strMo6002a);
            }
            this.logger.verbose(this.accountId, "Failed to decrypt delayed in-app: " + inAppId);
            return null;
        } catch (JSONException e) {
            this.logger.verbose(this.accountId, "Error parsing delayed in-app: " + inAppId, e);
            return null;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final boolean m164766b() {
        return this.delayedLegacyInAppDAO.mo151505b();
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final boolean m164767c(@NotNull String inAppId) {
        inAppId.getClass();
        return this.delayedLegacyInAppDAO.remove(inAppId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final boolean m164768d(@NotNull List<? extends JSONObject> delayedInApps) {
        delayedInApps.getClass();
        if (delayedInApps.isEmpty()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (JSONObject jSONObject : delayedInApps) {
            String strOptString = jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD);
            int iOptInt = jSONObject.optInt("delayAfterTrigger");
            CryptHandler cryptHandler = this.cryptHandler;
            String string = jSONObject.toString();
            string.getClass();
            String strMo6006e = cryptHandler.mo6006e(string);
            if (strMo6006e == null) {
                this.logger.verbose(this.accountId, "Failed to encrypt delayed in-app: " + strOptString + ". Skipping this item.");
                i++;
            } else {
                strOptString.getClass();
                arrayList.add(new mud(strOptString, iOptInt, strMo6006e));
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.verbose(this.accountId, "No delayed in-apps to save. All items failed encryption or parsing.");
            return false;
        }
        if (i > 0) {
            this.logger.verbose(this.accountId, "Skipped " + i + " delayed in-apps due to encryption failure");
        }
        return this.delayedLegacyInAppDAO.mo151507d(arrayList);
    }
}
