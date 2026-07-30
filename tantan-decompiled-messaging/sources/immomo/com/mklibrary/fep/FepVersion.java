package immomo.com.mklibrary.fep;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\n\u0010\u0018\u001a\u00020\u0019\"\u00020\nR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m87232d2 = {"Limmomo/com/mklibrary/fep/FepVersion;", "", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "type", "", "getType", "()I", "setType", "(I)V", WBConstants.AUTH_PARAMS_VERSION, "", "getVersion", "()J", "setVersion", "(J)V", "isSafe", "", "isSupportType", "types", "", "sdk_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class FepVersion {

    @SerializedName("versionStr")
    @Expose
    @Nullable
    private String tag;

    @SerializedName("type")
    @Expose
    private int type;

    @SerializedName(WBConstants.AUTH_PARAMS_VERSION)
    @Expose
    private long version;

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final int getType() {
        return this.type;
    }

    public final long getVersion() {
        return this.version;
    }

    public final boolean isSafe() {
        return this.version > 0;
    }

    public final boolean isSupportType(@NotNull int... types) {
        types.getClass();
        return ArraysKt.contains(types, this.type);
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setVersion(long j) {
        this.version = j;
    }
}
