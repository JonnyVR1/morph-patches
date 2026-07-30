package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BG\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b\u0018\u0010\u001d\"\u0004\b!\u0010\u001fR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\"\u001a\u0004\b \u0010#\"\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Ll/ell;", "", "", "connectTimeout", "readTimeout", "", "useCaches", "doInput", "", "", "requestMap", "<init>", "(IIZZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "setConnectTimeout", "(I)V", "b", "c", "setReadTimeout", "Z", "e", "()Z", "setUseCaches", "(Z)V", Constants.INAPP_DATA_TAG, "setDoInput", "Ljava/util/Map;", "()Ljava/util/Map;", "setRequestMap", "(Ljava/util/Map;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class ell {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int connectTimeout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int readTimeout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean useCaches;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean doInput;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Map<String, String> requestMap;

    public /* synthetic */ ell(int i, int i2, boolean z, boolean z2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDoInput() {
        return this.doInput;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, String> m117141d() {
        return this.requestMap;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getUseCaches() {
        return this.useCaches;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ell)) {
            return false;
        }
        ell ellVar = (ell) other;
        return this.connectTimeout == ellVar.connectTimeout && this.readTimeout == ellVar.readTimeout && this.useCaches == ellVar.useCaches && this.doInput == ellVar.doInput && Intrinsics.m87488d(this.requestMap, ellVar.requestMap);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.connectTimeout) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Boolean.hashCode(this.useCaches)) * 31) + Boolean.hashCode(this.doInput)) * 31) + this.requestMap.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpUrlConnectionParams(connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", useCaches=" + this.useCaches + ", doInput=" + this.doInput + ", requestMap=" + this.requestMap + ')';
    }

    @JvmOverloads
    public ell(int i, int i2, boolean z, boolean z2, @NotNull Map<String, String> map) {
        map.getClass();
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.useCaches = z;
        this.doInput = z2;
        this.requestMap = map;
    }

    @JvmOverloads
    public ell() {
        this(0, 0, false, false, null, 31, null);
    }
}
