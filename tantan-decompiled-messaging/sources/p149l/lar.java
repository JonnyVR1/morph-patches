package p149l;

import com.tencent.connect.common.Constants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0018"}, m87232d2 = {"Ll/lar;", "", "Ll/hnl;", "ctPreference", "", "accountId", "<init>", "(Ll/hnl;Ljava/lang/String;)V", "Lorg/json/JSONArray;", "b", "()Lorg/json/JSONArray;", "", "c", "()V", "", Constants.f57189TS, com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "(J)V", "a", "()J", "Ll/hnl;", "Ljava/lang/String;", "inAppKey", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class lar {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final hnl ctPreference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String inAppKey;

    public lar(@NotNull hnl hnlVar, @NotNull String str) {
        hnlVar.getClass();
        str.getClass();
        this.ctPreference = hnlVar;
        this.inAppKey = lw3.m151935e("inApp", str, ":");
    }

    /* JADX INFO: renamed from: a */
    public final long m149172a() {
        return this.ctPreference.mo131948e("last_assets_cleanup", 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JSONArray m149173b() {
        hnl hnlVar = this.ctPreference;
        String str = this.inAppKey;
        str.getClass();
        try {
            return new JSONArray(hnlVar.mo131945b(str, WeJson.EMPTY_ARR));
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m149174c() {
        hnl hnlVar = this.ctPreference;
        String str = this.inAppKey;
        str.getClass();
        hnlVar.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m149175d(long ts) {
        this.ctPreference.mo131946c("last_assets_cleanup", ts);
    }
}
