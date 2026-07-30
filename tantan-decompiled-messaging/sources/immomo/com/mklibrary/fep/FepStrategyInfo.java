package immomo.com.mklibrary.fep;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Limmomo/com/mklibrary/fep/FepStrategyInfo;", "", "()V", "project", "", "getProject", "()Ljava/lang/String;", "setProject", "(Ljava/lang/String;)V", "versionInfos", "Ljava/util/concurrent/ConcurrentHashMap;", "Limmomo/com/mklibrary/fep/FepVersion;", "getVersionInfos", "()Ljava/util/concurrent/ConcurrentHashMap;", "setVersionInfos", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "sdk_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class FepStrategyInfo {

    @SerializedName("project")
    @Expose
    @Nullable
    private String project;

    @SerializedName("versions")
    @Expose
    @Nullable
    private ConcurrentHashMap<String, FepVersion> versionInfos;

    @Nullable
    public final String getProject() {
        return this.project;
    }

    @Nullable
    public final ConcurrentHashMap<String, FepVersion> getVersionInfos() {
        return this.versionInfos;
    }

    public final void setProject(@Nullable String str) {
        this.project = str;
    }

    public final void setVersionInfos(@Nullable ConcurrentHashMap<String, FepVersion> concurrentHashMap) {
        this.versionInfos = concurrentHashMap;
    }
}
