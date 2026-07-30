package p149l;

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
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Ll/zsd;", "", "Ll/wsd;", "delayedLegacyInAppDAO", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "cryptHandler", "Ll/nul;", "logger", "", "accountId", "<init>", "(Ll/wsd;Lcom/clevertap/android/sdk/cryption/CryptHandler;Ll/nul;Ljava/lang/String;)V", "", "Lorg/json/JSONObject;", "delayedInApps", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Z", "inAppId", "a", "(Ljava/lang/String;)Lorg/json/JSONObject;", "c", "(Ljava/lang/String;)Z", "b", "()Z", "Ll/wsd;", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "Ll/nul;", "Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class zsd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final wsd delayedLegacyInAppDAO;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CryptHandler cryptHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    public zsd(@NotNull wsd wsdVar, @NotNull CryptHandler cryptHandler, @NotNull nul nulVar, @NotNull String str) {
        wsdVar.getClass();
        cryptHandler.getClass();
        nulVar.getClass();
        str.getClass();
        this.delayedLegacyInAppDAO = wsdVar;
        this.cryptHandler = cryptHandler;
        this.logger = nulVar;
        this.accountId = str;
    }

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public final JSONObject m220002a(@NotNull String inAppId) {
        inAppId.getClass();
        String strMo205476c = this.delayedLegacyInAppDAO.mo205476c(inAppId);
        if (strMo205476c == null) {
            return null;
        }
        try {
            String strMo5948a = this.cryptHandler.mo5948a(strMo205476c);
            if (strMo5948a != null) {
                return new JSONObject(strMo5948a);
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
    public final boolean m220003b() {
        return this.delayedLegacyInAppDAO.mo205475b();
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final boolean m220004c(@NotNull String inAppId) {
        inAppId.getClass();
        return this.delayedLegacyInAppDAO.remove(inAppId);
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final boolean m220005d(@NotNull List<? extends JSONObject> delayedInApps) {
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
            String strMo5952e = cryptHandler.mo5952e(string);
            if (strMo5952e == null) {
                this.logger.verbose(this.accountId, "Failed to encrypt delayed in-app: " + strOptString + ". Skipping this item.");
                i++;
            } else {
                strOptString.getClass();
                arrayList.add(new ysd(strOptString, iOptInt, strMo5952e));
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.verbose(this.accountId, "No delayed in-apps to save. All items failed encryption or parsing.");
            return false;
        }
        if (i > 0) {
            this.logger.verbose(this.accountId, "Skipped " + i + " delayed in-apps due to encryption failure");
        }
        return this.delayedLegacyInAppDAO.mo205477d(arrayList);
    }
}
