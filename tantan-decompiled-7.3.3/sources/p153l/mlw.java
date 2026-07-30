package p153l;

import com.google.gson.annotations.SerializedName;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"Ll/mlw;", "", "", WBConstants.SHARE_CALLBACK_ID, "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallbackId", "setCallbackId", "(Ljava/lang/String;)V", "getData", "setData", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class mlw {

    @SerializedName(WBConstants.SHARE_CALLBACK_ID)
    @Nullable
    private String callbackId;

    @SerializedName("data")
    @Nullable
    private String data;

    public /* synthetic */ mlw(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mlw)) {
            return false;
        }
        mlw mlwVar = (mlw) other;
        return Intrinsics.m88377d(this.callbackId, mlwVar.callbackId) && Intrinsics.m88377d(this.data, mlwVar.data);
    }

    public int hashCode() {
        String str = this.callbackId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.data;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MKWebRebuildCallbackInfo(callbackId=" + this.callbackId + ", data=" + this.data + ")";
    }

    public mlw(@Nullable String str, @Nullable String str2) {
        this.callbackId = str;
        this.data = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mlw() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
