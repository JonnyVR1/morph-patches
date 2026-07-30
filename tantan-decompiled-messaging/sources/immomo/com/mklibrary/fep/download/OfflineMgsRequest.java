package immomo.com.mklibrary.fep.download;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m87232d2 = {"Limmomo/com/mklibrary/fep/download/OfflineMgsRequest;", "", "()V", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", WBConstants.AUTH_PARAMS_VERSION, "getVersion", "setVersion", "sdk_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class OfflineMgsRequest {

    @SerializedName(RemoteConfigConstants.RequestFieldKey.APP_ID)
    @Expose
    @NotNull
    private String appId = "";

    @SerializedName(WBConstants.AUTH_PARAMS_VERSION)
    @Expose
    @NotNull
    private String version = "";

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final void setAppId(@NotNull String str) {
        str.getClass();
        this.appId = str;
    }

    public final void setVersion(@NotNull String str) {
        str.getClass();
        this.version = str;
    }
}
