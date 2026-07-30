package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\tJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\tJ\u001b\u0010\u0018\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/pom;", "", "<init>", "()V", "", "Lorg/json/JSONObject;", "inAppsList", "Ll/qee$a;", "g", "(Ljava/util/List;)Ll/qee$a;", "inApp", "", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;)Z", "c", RXScreenCaptureService.KEY_INDEX, "Ll/qee$b;", "j", "(Ljava/util/List;)Ll/qee$b;", "h", "Ll/qee$c;", "k", "(Ljava/util/List;)Ll/qee$c;", "e", "f", "", "a", "(Lorg/json/JSONObject;)J", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class pom {

    @NotNull
    public static final pom INSTANCE = new pom();

    private pom() {
    }

    /* JADX INFO: renamed from: c */
    private final boolean m170607c(JSONObject inApp) {
        return m170610a(inApp) > 0;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m170608d(JSONObject inApp) {
        return m170611b(inApp) > 0;
    }

    /* JADX INFO: renamed from: g */
    private final qee.C19471a m170609g(List<? extends JSONObject> inAppsList) {
        if (inAppsList.isEmpty()) {
            return qee.C19471a.INSTANCE.m174196a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : inAppsList) {
            if (INSTANCE.m170607c((JSONObject) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new qee.C19471a((List) pair.component2(), (List) pair.component1());
    }

    /* JADX INFO: renamed from: a */
    public final long m170610a(@NotNull JSONObject inApp) {
        inApp.getClass();
        int iOptInt = inApp.optInt("delayAfterTrigger", 0);
        if (1 > iOptInt || iOptInt >= 1201) {
            return 0L;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m93535u(DurationKt.m93561o(iOptInt, DurationUnit.SECONDS));
    }

    /* JADX INFO: renamed from: b */
    public final long m170611b(@NotNull JSONObject inApp) {
        inApp.getClass();
        int iOptInt = inApp.optInt("inactionDuration", 0);
        if (1 > iOptInt || iOptInt >= 1201) {
            return 0L;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m93535u(DurationKt.m93561o(iOptInt, DurationUnit.SECONDS));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final qee.C19471a m170612e(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return m170609g(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final qee.C19472b m170613f(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return new qee.C19472b(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final qee.C19471a m170614h(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return m170609g(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final qee.C19471a m170615i(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return m170609g(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final qee.C19472b m170616j(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return new qee.C19472b(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final qee.C19473c m170617k(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        if (inAppsList.isEmpty()) {
            return qee.C19473c.INSTANCE.m174203a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : inAppsList) {
            if (INSTANCE.m170608d((JSONObject) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new qee.C19473c((List) pair.component2(), (List) pair.component1());
    }
}
