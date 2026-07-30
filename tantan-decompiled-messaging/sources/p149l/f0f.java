package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\t¨\u0006\u0019"}, m87232d2 = {"Ll/f0f;", "", "", "encryptedPayload", Constants.KEY_KEY, "iv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEncryptedPayload", "b", "getKey", "c", "getIv", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class f0f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String encryptedPayload;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String iv;

    public f0f(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.encryptedPayload = str;
        this.key = str2;
        this.iv = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m119037a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itp", this.encryptedPayload);
        jSONObject.put("itk", this.key);
        jSONObject.put("itv", this.iv);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f0f)) {
            return false;
        }
        f0f f0fVar = (f0f) other;
        return Intrinsics.m87488d(this.encryptedPayload, f0fVar.encryptedPayload) && Intrinsics.m87488d(this.key, f0fVar.key) && Intrinsics.m87488d(this.iv, f0fVar.iv);
    }

    public int hashCode() {
        return (((this.encryptedPayload.hashCode() * 31) + this.key.hashCode()) * 31) + this.iv.hashCode();
    }

    @NotNull
    public String toString() {
        return "EncryptedSendQueueRequestBody(encryptedPayload=" + this.encryptedPayload + ", key=" + this.key + ", iv=" + this.iv + ')';
    }
}
