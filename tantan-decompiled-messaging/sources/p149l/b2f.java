package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u0010B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010 \u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001f¨\u0006\""}, m87232d2 = {"Ll/b2f;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "data", "", "b", "(Ll/b2f;)I", "", "e", "()V", "a", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "filename", "errorMessage", "", "c", "Ljava/lang/Long;", "timestamp", "", Constants.INAPP_DATA_TAG, "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b2f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String filename;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String errorMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Long timestamp;

    public b2f(@Nullable String str) {
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        this.errorMessage = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        Long l2 = this.timestamp;
        l2.getClass();
        stringBuffer.append(l2.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        this.filename = string;
    }

    /* JADX INFO: renamed from: a */
    public final void m99963a() {
        fwm.m123533d(this.filename);
    }

    /* JADX INFO: renamed from: b */
    public final int m99964b(@NotNull b2f data) {
        data.getClass();
        Long l2 = this.timestamp;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l3 = data.timestamp;
        if (l3 != null) {
            return Intrinsics.m87490f(l3.longValue(), jLongValue);
        }
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final JSONObject m99965c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.timestamp;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m99966d() {
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final void m99967e() {
        if (m99966d()) {
            fwm.m123546q(this.filename, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectM99965c = m99965c();
        if (jSONObjectM99965c == null) {
            return super.toString();
        }
        String string = jSONObjectM99965c.toString();
        string.getClass();
        return string;
    }

    public b2f(@NotNull File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        this.filename = name;
        JSONObject jSONObjectM123544o = fwm.m123544o(name, true);
        if (jSONObjectM123544o != null) {
            this.timestamp = Long.valueOf(jSONObjectM123544o.optLong("timestamp", 0L));
            this.errorMessage = jSONObjectM123544o.optString("error_message", null);
        }
    }
}
