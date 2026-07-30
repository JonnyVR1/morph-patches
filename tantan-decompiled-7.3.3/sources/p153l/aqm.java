package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/aqm;", "Ll/ism;", "Ll/axl;", "logger", "", "accountId", "<init>", "(Ll/axl;Ljava/lang/String;)V", "", "Lorg/json/JSONObject;", "inApps", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Z", "id", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "a", "(Ljava/lang/String;)V", "b", "()V", "Ll/axl;", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "inActionCache", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class aqm implements ism {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, JSONObject> inActionCache;

    public aqm(@NotNull axl axlVar, @NotNull String str) {
        axlVar.getClass();
        str.getClass();
        this.logger = axlVar;
        this.accountId = str;
        this.inActionCache = new ConcurrentHashMap<>();
    }

    @Override // p153l.ism
    /* JADX INFO: renamed from: a */
    public void mo99520a(@NotNull String id) {
        id.getClass();
        this.inActionCache.remove(id);
    }

    @Override // p153l.ism
    /* JADX INFO: renamed from: b */
    public void mo99521b() {
        this.inActionCache.clear();
    }

    @Override // p153l.ism
    @Nullable
    /* JADX INFO: renamed from: c */
    public JSONObject mo99522c(@NotNull String id) {
        id.getClass();
        return this.inActionCache.get(id);
    }

    @Override // p153l.ism
    /* JADX INFO: renamed from: d */
    public boolean mo99523d(@NotNull List<? extends JSONObject> inApps) {
        inApps.getClass();
        for (JSONObject jSONObject : inApps) {
            String strOptString = jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD);
            strOptString.getClass();
            if (!StringsKt.m94329e0(strOptString)) {
                this.inActionCache.put(strOptString, jSONObject);
            }
        }
        return true;
    }
}
