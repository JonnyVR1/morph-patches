package p153l;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/klj;", "", "<init>", "()V", "", "Lcom/facebook/internal/gatekeeper/AppID;", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "Ll/jlj;", "gateKeeperList", "", "b", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "gateKeepers", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class klj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, jlj>> gateKeepers = new ConcurrentHashMap<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<jlj> m150368a(@NotNull String appId) {
        appId.getClass();
        ConcurrentHashMap<String, jlj> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, jlj>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m150369b(@NotNull String appId, @NotNull List<jlj> gateKeeperList) {
        appId.getClass();
        gateKeeperList.getClass();
        ConcurrentHashMap<String, jlj> concurrentHashMap = new ConcurrentHashMap<>();
        for (jlj jljVar : gateKeeperList) {
            concurrentHashMap.put(jljVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), jljVar);
        }
        this.gateKeepers.put(appId, concurrentHashMap);
    }
}
