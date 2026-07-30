package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/cqm;", "", "Ll/spl;", "ctPreference", "<init>", "(Ll/spl;)V", "", "url", "", "expiry", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;J)V", "a", "(Ljava/lang/String;)V", "", "c", "()Ljava/util/Set;", "b", "(Ljava/lang/String;)J", "Ll/spl;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class cqm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final spl ctPreference;

    public cqm(@NotNull spl splVar) {
        splVar.getClass();
        this.ctPreference = splVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m111960a(@NotNull String url) {
        url.getClass();
        this.ctPreference.remove(url);
    }

    /* JADX INFO: renamed from: b */
    public final long m111961b(@NotNull String url) {
        url.getClass();
        return this.ctPreference.mo174042e(url, 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m111962c() {
        Set<String> setKeySet;
        Map<String, ?> all = this.ctPreference.readAll();
        return (all == null || (setKeySet = all.keySet()) == null) ? SetsKt.emptySet() : setKeySet;
    }

    /* JADX INFO: renamed from: d */
    public final void m111963d(@NotNull String url, long expiry) {
        url.getClass();
        this.ctPreference.mo174040c(url, expiry);
    }
}
