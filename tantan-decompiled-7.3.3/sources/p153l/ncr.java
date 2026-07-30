package p153l;

import com.tencent.connect.common.Constants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0018"}, m88121d2 = {"Ll/ncr;", "", "Ll/spl;", "ctPreference", "", "accountId", "<init>", "(Ll/spl;Ljava/lang/String;)V", "Lorg/json/JSONArray;", "b", "()Lorg/json/JSONArray;", "", "c", "()V", "", Constants.f58037TS, com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "(J)V", "a", "()J", "Ll/spl;", "Ljava/lang/String;", "inAppKey", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ncr {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final spl ctPreference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String inAppKey;

    public ncr(@NotNull spl splVar, @NotNull String str) {
        splVar.getClass();
        str.getClass();
        this.ctPreference = splVar;
        this.inAppKey = kx3.m151784e("inApp", str, ":");
    }

    /* JADX INFO: renamed from: a */
    public final long m162590a() {
        return this.ctPreference.mo174042e("last_assets_cleanup", 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JSONArray m162591b() {
        spl splVar = this.ctPreference;
        String str = this.inAppKey;
        str.getClass();
        try {
            return new JSONArray(splVar.mo174039b(str, WeJson.EMPTY_ARR));
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m162592c() {
        spl splVar = this.ctPreference;
        String str = this.inAppKey;
        str.getClass();
        splVar.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m162593d(long ts) {
        this.ctPreference.mo174040c("last_assets_cleanup", ts);
    }
}
