package p153l;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/ytf;", "", "<init>", "()V", "", "macAddress", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setMacAddress", "(Ljava/lang/String;)V", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ytf {

    @SerializedName("mac_address")
    @Expose
    @Nullable
    private String macAddress;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }
}
