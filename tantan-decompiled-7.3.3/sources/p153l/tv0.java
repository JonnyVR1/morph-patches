package p153l;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.C1560b;
import com.facebook.appevents.C1561c;
import com.facebook.appevents.PersistedEvents;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/tv0;", "", "<init>", "()V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Ll/sse0;", "appEvents", "", "a", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Ll/sse0;)V", "Lcom/facebook/appevents/b;", "eventsToPersist", "b", "(Lcom/facebook/appevents/b;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class tv0 {

    @NotNull
    public static final tv0 INSTANCE = new tv0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = tv0.class.getName();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final synchronized void m192772a(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull sse0 appEvents) {
        if (ztb.m221490d(tv0.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            appEvents.getClass();
            uv0.m198218b();
            PersistedEvents persistedEventsM7718a = C1561c.m7718a();
            persistedEventsM7718a.addEvents(accessTokenAppIdPair, appEvents.m187704d());
            C1561c.m7719b(persistedEventsM7718a);
        } catch (Throwable th) {
            ztb.m221488b(th, tv0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final synchronized void m192773b(@NotNull C1560b eventsToPersist) {
        if (ztb.m221490d(tv0.class)) {
            return;
        }
        try {
            eventsToPersist.getClass();
            uv0.m198218b();
            PersistedEvents persistedEventsM7718a = C1561c.m7718a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.m7717f()) {
                sse0 sse0VarM7714c = eventsToPersist.m7714c(accessTokenAppIdPair);
                if (sse0VarM7714c == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                persistedEventsM7718a.addEvents(accessTokenAppIdPair, sse0VarM7714c.m187704d());
            }
            C1561c.m7719b(persistedEventsM7718a);
        } catch (Throwable th) {
            ztb.m221488b(th, tv0.class);
        }
    }
}
