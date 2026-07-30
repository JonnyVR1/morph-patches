package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u001dR\"\u0010(\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b\u001f\u0010\u0013¨\u0006-"}, m88121d2 = {"Ll/xfi;", "", "Ll/wfi;", "baseConfig", "", "fetchURL", "<init>", "(Ll/wfi;Ljava/lang/String;)V", "Lkotlin/Pair;", "", "f", "()Lkotlin/Pair;", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "currentHash", "", "a", "(Lcom/hellogroup/fep/config/model/FepConfigFetchType;Ljava/lang/String;)Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", Constants.INAPP_DATA_TAG, "h", "(I)V", "pollInterval", "b", "e", RXScreenCaptureService.KEY_INDEX, "requestInterval", "c", "Z", "()Z", "g", "(Z)V", "pollEnabled", "Ll/wfi;", "getBaseConfig", "()Ll/wfi;", "Ljava/lang/String;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class xfi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int pollInterval;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int requestInterval;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean pollEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final wfi baseConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String fetchURL;

    public xfi(@NotNull wfi wfiVar, @NotNull String str) {
        wfiVar.getClass();
        str.getClass();
        this.baseConfig = wfiVar;
        this.fetchURL = str;
        this.pollInterval = 5;
        this.requestInterval = 5;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, String> m210798a(@NotNull FepConfigFetchType type, @NotNull String currentHash) {
        type.getClass();
        currentHash.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.baseConfig.m206126a(linkedHashMap);
        linkedHashMap.put("hash", currentHash);
        linkedHashMap.put("pollType", String.valueOf(type.getCode()));
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFetchURL() {
        return this.fetchURL;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPollEnabled() {
        return this.pollEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPollInterval() {
        return this.pollInterval;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRequestInterval() {
        return this.requestInterval;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof xfi)) {
            return false;
        }
        xfi xfiVar = (xfi) other;
        return Intrinsics.m88377d(this.baseConfig, xfiVar.baseConfig) && Intrinsics.m88377d(this.fetchURL, xfiVar.fetchURL);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Pair<Boolean, String> m210803f() {
        String second;
        Pair<Boolean, String> pairM206130e = this.baseConfig.m206130e();
        if (pairM206130e.getFirst().booleanValue()) {
            second = pairM206130e.getSecond();
        } else {
            second = StringsKt.m94329e0(this.fetchURL) ? "fetchURL must input" : "";
        }
        return new Pair<>(Boolean.valueOf(second.length() == 0), second);
    }

    /* JADX INFO: renamed from: g */
    public final void m210804g(boolean z) {
        this.pollEnabled = z;
    }

    /* JADX INFO: renamed from: h */
    public final void m210805h(int i) {
        this.pollInterval = i;
    }

    public int hashCode() {
        wfi wfiVar = this.baseConfig;
        int iHashCode = (wfiVar != null ? wfiVar.hashCode() : 0) * 31;
        String str = this.fetchURL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m210806i(int i) {
        this.requestInterval = i;
    }

    @NotNull
    public String toString() {
        return "FepConfigConfiguration(baseConfig=" + this.baseConfig + ", fetchURL=" + this.fetchURL + ")";
    }
}
