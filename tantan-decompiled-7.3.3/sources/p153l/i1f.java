package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, m88121d2 = {"Ll/i1f;", "", "", "encryptedPayload", "iv", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class i1f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String encryptedPayload;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String iv;

    public i1f(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.encryptedPayload = str;
        this.iv = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIv() {
        return this.iv;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i1f)) {
            return false;
        }
        i1f i1fVar = (i1f) other;
        return Intrinsics.m88377d(this.encryptedPayload, i1fVar.encryptedPayload) && Intrinsics.m88377d(this.iv, i1fVar.iv);
    }

    public int hashCode() {
        return (this.encryptedPayload.hashCode() * 31) + this.iv.hashCode();
    }

    @NotNull
    public String toString() {
        return "EncryptedResponseBody(encryptedPayload=" + this.encryptedPayload + ", iv=" + this.iv + ')';
    }

    /* JADX INFO: renamed from: l.i1f$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/i1f$a;", "", "<init>", "()V", "", "json", "Ll/i1f;", "a", "(Ljava/lang/String;)Ll/i1f;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final i1f m138098a(@NotNull String json) throws JSONException {
            json.getClass();
            JSONObject jSONObject = new JSONObject(json);
            String string = jSONObject.getString("itp");
            string.getClass();
            String string2 = jSONObject.getString("itv");
            string2.getClass();
            return new i1f(string, string2);
        }

        private Companion() {
        }
    }
}
