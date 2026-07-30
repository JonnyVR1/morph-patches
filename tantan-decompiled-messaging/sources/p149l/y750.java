package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013\"\u0004\b\u0011\u0010\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\f\u0010\u0014¨\u0006\u0018"}, m87232d2 = {"Ll/y750;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getSwBlackList", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "swBlackList", "b", "getServiceWorker", Constants.INAPP_DATA_TAG, "serviceWorker", "Lorg/json/JSONArray;", "c", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "downloadMk", "getDownloadMg", "downloadMg", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class y750 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String swBlackList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String serviceWorker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private JSONArray downloadMk;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private JSONArray downloadMg;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONArray getDownloadMk() {
        return this.downloadMk;
    }

    /* JADX INFO: renamed from: b */
    public final void m213305b(@Nullable JSONArray jSONArray) {
        this.downloadMg = jSONArray;
    }

    /* JADX INFO: renamed from: c */
    public final void m213306c(@Nullable JSONArray jSONArray) {
        this.downloadMk = jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public final void m213307d(@Nullable String str) {
        this.serviceWorker = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m213308e(@Nullable String str) {
        this.swBlackList = str;
    }
}
