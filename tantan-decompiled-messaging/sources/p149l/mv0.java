package p149l;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.C1537b;
import com.facebook.appevents.C1538c;
import com.facebook.appevents.PersistedEvents;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/mv0;", "", "<init>", "()V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Ll/nke0;", "appEvents", "", "a", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Ll/nke0;)V", "Lcom/facebook/appevents/b;", "eventsToPersist", "b", "(Lcom/facebook/appevents/b;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class mv0 {

    @NotNull
    public static final mv0 INSTANCE = new mv0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = mv0.class.getName();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final synchronized void m156459a(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull nke0 appEvents) {
        if (lsb.m151554d(mv0.class)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            appEvents.getClass();
            nv0.m161519b();
            PersistedEvents persistedEventsM7664a = C1538c.m7664a();
            persistedEventsM7664a.addEvents(accessTokenAppIdPair, appEvents.m159829d());
            C1538c.m7665b(persistedEventsM7664a);
        } catch (Throwable th) {
            lsb.m151552b(th, mv0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final synchronized void m156460b(@NotNull C1537b eventsToPersist) {
        if (lsb.m151554d(mv0.class)) {
            return;
        }
        try {
            eventsToPersist.getClass();
            nv0.m161519b();
            PersistedEvents persistedEventsM7664a = C1538c.m7664a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.m7663f()) {
                nke0 nke0VarM7660c = eventsToPersist.m7660c(accessTokenAppIdPair);
                if (nke0VarM7660c == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                persistedEventsM7664a.addEvents(accessTokenAppIdPair, nke0VarM7660c.m159829d());
            }
            C1538c.m7665b(persistedEventsM7664a);
        } catch (Throwable th) {
            lsb.m151552b(th, mv0.class);
        }
    }
}
