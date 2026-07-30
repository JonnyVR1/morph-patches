package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Target;
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
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0002\u001d\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006*"}, m87232d2 = {"Ll/nta0;", "", "Ll/nul;", "logger", "<init>", "(Ll/nul;)V", "Lorg/json/JSONObject;", Target.TYPE, "source", "", "path", "", "Ll/hi90;", "changes", "Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", MessageType.operation, "", "e", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)V", "basePath", Constants.KEY_KEY, "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ll/nta0$b;", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)Ll/nta0$b;", "a", "Ll/nul;", "Ll/ii90;", "b", "Ll/ii90;", "changeTracker", "Ll/g01;", "Ll/g01;", "arrayHandler", "Ll/as50;", "Ll/as50;", "updateHandler", "Ll/std;", "Ll/std;", "deleteHandler", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class nta0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ii90 changeTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final g01 arrayHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final as50 updateHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final std deleteHandler;

    /* JADX INFO: renamed from: l.nta0$b */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/nta0$b;", "", "", "", "Ll/hi90;", "changes", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C18772b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Map<String, hi90> changes;

        public C18772b(@NotNull Map<String, hi90> map) {
            map.getClass();
            this.changes = map;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, hi90> m161368a() {
            return this.changes;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C18772b) && Intrinsics.m87488d(this.changes, ((C18772b) other).changes);
        }

        public int hashCode() {
            return this.changes.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProfileTraversalResult(changes=" + this.changes + ')';
        }
    }

    /* JADX INFO: renamed from: l.nta0$c */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C18773c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f140457a;

        static {
            int[] iArr = new int[ProfileOperation.values().length];
            try {
                iArr[ProfileOperation.DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f140457a = iArr;
        }
    }

    public nta0(@NotNull nul nulVar) {
        nulVar.getClass();
        this.logger = nulVar;
        ii90 ii90Var = new ii90();
        this.changeTracker = ii90Var;
        g01 g01Var = new g01(ii90Var);
        this.arrayHandler = g01Var;
        this.updateHandler = new as50(ii90Var, g01Var);
        this.deleteHandler = new std(ii90Var);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m161362a(nta0 nta0Var, ProfileOperation profileOperation, JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        nta0Var.getClass();
        profileOperation.getClass();
        jSONObject.getClass();
        str.getClass();
        map.getClass();
        nta0Var.m161365e(jSONObject, jSONObject2, str, map, profileOperation);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m161363b(nta0 nta0Var, JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        nta0Var.getClass();
        jSONObject.getClass();
        str.getClass();
        map.getClass();
        nta0Var.m161365e(jSONObject, jSONObject2, str, map, ProfileOperation.DELETE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    private final String m161364c(String basePath, String key) {
        if (basePath.length() == 0) {
            return key;
        }
        return basePath + '.' + key;
    }

    /* JADX INFO: renamed from: e */
    private final void m161365e(JSONObject target, JSONObject source, String path, Map<String, hi90> changes, final ProfileOperation operation) {
        if (source == null) {
            return;
        }
        Iterator<String> itKeys = source.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            String strM161364c = m161364c(path, next);
            try {
                Object obj = source.get(next);
                if (C18773c.f140457a[operation.ordinal()] == 1) {
                    std stdVar = this.deleteHandler;
                    obj.getClass();
                    stdVar.m185908g(target, next, obj, strM161364c, changes, new Function4() { // from class: l.lta0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            return nta0.m161363b(this.f129951a, (JSONObject) obj2, (JSONObject) obj3, (String) obj4, (Map) obj5);
                        }
                    });
                } else {
                    as50 as50Var = this.updateHandler;
                    obj.getClass();
                    as50Var.m98584d(target, next, obj, strM161364c, changes, operation, new Function4() { // from class: l.mta0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            return nta0.m161362a(this.f135562a, operation, (JSONObject) obj2, (JSONObject) obj3, (String) obj4, (Map) obj5);
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
    public final C18772b m161366d(@NotNull JSONObject target, @NotNull JSONObject source, @NotNull ProfileOperation operation) {
        target.getClass();
        source.getClass();
        operation.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m161365e(target, source, "", linkedHashMap, operation);
        return new C18772b(linkedHashMap);
    }

    /* JADX INFO: renamed from: l.nta0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0004*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/nta0$a;", "", "<init>", "()V", "", "", "Ll/hi90;", "a", "(Ljava/util/Map;)Ljava/util/Map;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, Map<String, Object>> m161367a(@NotNull Map<String, hi90> map) {
            map.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                hi90 hi90Var = (hi90) entry.getValue();
                linkedHashMap.put(key, MapsKt.mapOf(TuplesKt.m87240a(Constants.KEY_OLD_VALUE, hi90Var.getCom.clevertap.android.sdk.Constants.KEY_OLD_VALUE java.lang.String()), TuplesKt.m87240a(Constants.KEY_NEW_VALUE, hi90Var.getCom.clevertap.android.sdk.Constants.KEY_NEW_VALUE java.lang.String())));
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }
}
