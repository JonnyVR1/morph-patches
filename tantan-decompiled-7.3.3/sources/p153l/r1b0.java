package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Target;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0002\u001d\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006*"}, m88121d2 = {"Ll/r1b0;", "", "Ll/axl;", "logger", "<init>", "(Ll/axl;)V", "Lorg/json/JSONObject;", Target.TYPE, "source", "", "path", "", "Ll/lq90;", "changes", "Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", MessageType.operation, "", "e", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)V", "basePath", Constants.KEY_KEY, "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ll/r1b0$b;", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)Ll/r1b0$b;", "a", "Ll/axl;", "Ll/mq90;", "b", "Ll/mq90;", "changeTracker", "Ll/n01;", "Ll/n01;", "arrayHandler", "Ll/g060;", "Ll/g060;", "updateHandler", "Ll/gvd;", "Ll/gvd;", "deleteHandler", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class r1b0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final mq90 changeTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final n01 arrayHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final g060 updateHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final gvd deleteHandler;

    /* JADX INFO: renamed from: l.r1b0$b */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/r1b0$b;", "", "", "", "Ll/lq90;", "changes", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C19726b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Map<String, lq90> changes;

        public C19726b(@NotNull Map<String, lq90> map) {
            map.getClass();
            this.changes = map;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, lq90> m179395a() {
            return this.changes;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C19726b) && Intrinsics.m88377d(this.changes, ((C19726b) other).changes);
        }

        public int hashCode() {
            return this.changes.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProfileTraversalResult(changes=" + this.changes + ')';
        }
    }

    /* JADX INFO: renamed from: l.r1b0$c */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C19727c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f160796a;

        static {
            int[] iArr = new int[ProfileOperation.values().length];
            try {
                iArr[ProfileOperation.DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f160796a = iArr;
        }
    }

    public r1b0(@NotNull axl axlVar) {
        axlVar.getClass();
        this.logger = axlVar;
        mq90 mq90Var = new mq90();
        this.changeTracker = mq90Var;
        n01 n01Var = new n01(mq90Var);
        this.arrayHandler = n01Var;
        this.updateHandler = new g060(mq90Var, n01Var);
        this.deleteHandler = new gvd(mq90Var);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m179389a(r1b0 r1b0Var, ProfileOperation profileOperation, JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        r1b0Var.getClass();
        profileOperation.getClass();
        jSONObject.getClass();
        str.getClass();
        map.getClass();
        r1b0Var.m179392e(jSONObject, jSONObject2, str, map, profileOperation);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m179390b(r1b0 r1b0Var, JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        r1b0Var.getClass();
        jSONObject.getClass();
        str.getClass();
        map.getClass();
        r1b0Var.m179392e(jSONObject, jSONObject2, str, map, ProfileOperation.DELETE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    private final String m179391c(String basePath, String key) {
        if (basePath.length() == 0) {
            return key;
        }
        return basePath + '.' + key;
    }

    /* JADX INFO: renamed from: e */
    private final void m179392e(JSONObject target, JSONObject source, String path, Map<String, lq90> changes, final ProfileOperation operation) {
        if (source == null) {
            return;
        }
        Iterator<String> itKeys = source.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            String strM179391c = m179391c(path, next);
            try {
                Object obj = source.get(next);
                if (C19727c.f160796a[operation.ordinal()] == 1) {
                    gvd gvdVar = this.deleteHandler;
                    obj.getClass();
                    gvdVar.m132540g(target, next, obj, strM179391c, changes, new Function4() { // from class: l.p1b0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            return r1b0.m179390b(this.f150140a, (JSONObject) obj2, (JSONObject) obj3, (String) obj4, (Map) obj5);
                        }
                    });
                } else {
                    g060 g060Var = this.updateHandler;
                    obj.getClass();
                    g060Var.m128405d(target, next, obj, strM179391c, changes, operation, new Function4() { // from class: l.q1b0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            return r1b0.m179389a(this.f155166a, operation, (JSONObject) obj2, (JSONObject) obj3, (String) obj4, (Map) obj5);
                        }
                    });
                }
            } catch (JSONException e) {
                this.logger.verbose("ProfileStateTraverser", "Failed to process key '" + next + "': " + e.getMessage());
            } catch (Exception e2) {
                this.logger.verbose("ProfileStateTraverser", "Unexpected error processing key '" + next + "': " + e2.getMessage());
            }
        }
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d */
    public final C19726b m179393d(@NotNull JSONObject target, @NotNull JSONObject source, @NotNull ProfileOperation operation) {
        target.getClass();
        source.getClass();
        operation.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m179392e(target, source, "", linkedHashMap, operation);
        return new C19726b(linkedHashMap);
    }

    /* JADX INFO: renamed from: l.r1b0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0004*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/r1b0$a;", "", "<init>", "()V", "", "", "Ll/lq90;", "a", "(Ljava/util/Map;)Ljava/util/Map;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, Map<String, Object>> m179394a(@NotNull Map<String, lq90> map) {
            map.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                lq90 lq90Var = (lq90) entry.getValue();
                linkedHashMap.put(key, MapsKt.mapOf(TuplesKt.m88129a(Constants.KEY_OLD_VALUE, lq90Var.getCom.clevertap.android.sdk.Constants.KEY_OLD_VALUE java.lang.String()), TuplesKt.m88129a(Constants.KEY_NEW_VALUE, lq90Var.getCom.clevertap.android.sdk.Constants.KEY_NEW_VALUE java.lang.String())));
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }
}
