package p153l;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\tJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\tJ\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\tJ\u001b\u0010\u0018\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/rqm;", "", "<init>", "()V", "", "Lorg/json/JSONObject;", "inAppsList", "Ll/ufe$a;", "g", "(Ljava/util/List;)Ll/ufe$a;", "inApp", "", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;)Z", "c", RXScreenCaptureService.KEY_INDEX, "Ll/ufe$b;", "j", "(Ljava/util/List;)Ll/ufe$b;", "h", "Ll/ufe$c;", "k", "(Ljava/util/List;)Ll/ufe$c;", "e", "f", "", "a", "(Lorg/json/JSONObject;)J", "b", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rqm {

    @NotNull
    public static final rqm INSTANCE = new rqm();

    private rqm() {
    }

    /* JADX INFO: renamed from: c */
    private final boolean m182647c(JSONObject inApp) {
        return m182650a(inApp) > 0;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m182648d(JSONObject inApp) {
        return m182651b(inApp) > 0;
    }

    /* JADX INFO: renamed from: g */
    private final ufe.C20557a m182649g(List<? extends JSONObject> inAppsList) {
        if (inAppsList.isEmpty()) {
            return ufe.C20557a.INSTANCE.m195832a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : inAppsList) {
            if (INSTANCE.m182647c((JSONObject) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new ufe.C20557a((List) pair.component2(), (List) pair.component1());
    }

    /* JADX INFO: renamed from: a */
    public final long m182650a(@NotNull JSONObject inApp) {
        inApp.getClass();
        int iOptInt = inApp.optInt("delayAfterTrigger", 0);
        if (1 > iOptInt || iOptInt >= 1201) {
            return 0L;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m94426u(DurationKt.m94452o(iOptInt, DurationUnit.SECONDS));
    }

    /* JADX INFO: renamed from: b */
    public final long m182651b(@NotNull JSONObject inApp) {
        inApp.getClass();
        int iOptInt = inApp.optInt("inactionDuration", 0);
        if (1 > iOptInt || iOptInt >= 1201) {
            return 0L;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m94426u(DurationKt.m94452o(iOptInt, DurationUnit.SECONDS));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ufe.C20557a m182652e(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return m182649g(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ufe.C20558b m182653f(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return new ufe.C20558b(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ufe.C20557a m182654h(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return m182649g(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ufe.C20557a m182655i(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return m182649g(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ufe.C20558b m182656j(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        return new ufe.C20558b(inAppsList);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ufe.C20559c m182657k(@NotNull List<? extends JSONObject> inAppsList) {
        inAppsList.getClass();
        if (inAppsList.isEmpty()) {
            return ufe.C20559c.INSTANCE.m195839a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : inAppsList) {
            if (INSTANCE.m182648d((JSONObject) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new ufe.C20559c((List) pair.component2(), (List) pair.component1());
    }
}
