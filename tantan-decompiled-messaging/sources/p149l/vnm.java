package p149l;

import com.clevertap.android.sdk.C1289j;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/vnm;", "Ll/fr4;", "Ll/hnl;", "ctPreference", "<init>", "(Ll/hnl;)V", "", Constants.KEY_KEY, "", "", "list", "", "e", "(Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljava/lang/String;)Ljava/util/List;", "campaignId", Constants.INAPP_DATA_TAG, "timestamp", "f", "(Ljava/lang/String;J)V", "b", "(Ljava/lang/String;)V", Constants.DEVICE_ID_TAG, "accountId", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Ll/hnl;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vnm implements fr4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final hnl ctPreference;

    public vnm(@NotNull hnl hnlVar) {
        hnlVar.getClass();
        this.ctPreference = hnlVar;
    }

    /* JADX INFO: renamed from: c */
    private final List<Long> m199034c(String key) {
        String strMo131945b = this.ctPreference.mo131945b(key, "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            return CollectionsKt.emptyList();
        }
        List listSplit$default = StringsKt.split$default(strMo131945b, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Long lP = StringsKt.m93390p((String) it.next());
            if (lP != null) {
                arrayList.add(lP);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private final void m199035e(String key, List<Long> list) {
        this.ctPreference.mo131944a(key, CollectionsKt.joinToString$default(list, Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null));
    }

    @Override // p149l.fr4
    /* JADX INFO: renamed from: a */
    public void mo122801a(@NotNull String deviceId, @NotNull String accountId) {
        deviceId.getClass();
        accountId.getClass();
        this.ctPreference.mo131947d(C1289j.INSTANCE.m6769a().m6762c(2, deviceId, accountId));
    }

    /* JADX INFO: renamed from: b */
    public final void m199036b(@NotNull String campaignId) {
        campaignId.getClass();
        this.ctPreference.remove("__impressions_" + campaignId);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Long> m199037d(@NotNull String campaignId) {
        campaignId.getClass();
        return m199034c("__impressions_" + campaignId);
    }

    /* JADX INFO: renamed from: f */
    public final void m199038f(@NotNull String campaignId, long timestamp) {
        campaignId.getClass();
        List<Long> mutableList = CollectionsKt.toMutableList((Collection) m199037d(campaignId));
        mutableList.add(Long.valueOf(timestamp));
        m199035e("__impressions_" + campaignId, mutableList);
    }
}
