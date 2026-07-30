package p153l;

import android.os.Parcel;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lorg/json/JSONObject;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "b", "(Landroid/os/Parcel;)Lorg/json/JSONObject;", "json", "", "c", "(Landroid/os/Parcel;Lorg/json/JSONObject;)V", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xrq {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m212846a(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final JSONObject m212847b(@NotNull Parcel parcel) {
        parcel.getClass();
        try {
            String string = parcel.readString();
            if (string != null) {
                return new JSONObject(string);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m212848c(@NotNull Parcel parcel, @Nullable JSONObject jSONObject) {
        parcel.getClass();
        parcel.writeString(jSONObject != null ? jSONObject.toString() : null);
    }
}
