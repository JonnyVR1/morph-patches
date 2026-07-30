package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Target;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JS\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ}\u0010!\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u001122\u0010 \u001a.\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$¨\u0006%"}, m87232d2 = {"Ll/as50;", "", "Ll/ii90;", "changeTracker", "Ll/g01;", "arrayHandler", "<init>", "(Ll/ii90;Ll/g01;)V", "Lorg/json/JSONObject;", Target.TYPE, "", Constants.KEY_KEY, Constants.KEY_NEW_VALUE, "currentPath", "", "Ll/hi90;", "changes", "Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", MessageType.operation, "", "b", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)V", "parent", Constants.KEY_OLD_VALUE, "path", "c", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)V", "e", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "Lkotlin/Function4;", "recursiveApply", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;Lkotlin/jvm/functions/Function4;)V", "Ll/ii90;", "Ll/g01;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class as50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ii90 changeTracker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final g01 arrayHandler;

    /* JADX INFO: renamed from: l.as50$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C15707a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71387a;

        static {
            int[] iArr = new int[ProfileOperation.values().length];
            try {
                iArr[ProfileOperation.DECREMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileOperation.INCREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71387a = iArr;
        }
    }

    public as50(@NotNull ii90 ii90Var, @NotNull g01 g01Var) {
        ii90Var.getClass();
        g01Var.getClass();
        this.changeTracker = ii90Var;
        this.arrayHandler = g01Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m98580a(Object oldValue, String path, Map<String, hi90> changes) {
        changes.put(path, new hi90(oldValue, Constants.GET_MARKER));
    }

    /* JADX INFO: renamed from: b */
    private final void m98581b(JSONObject target, String key, Object newValue, String currentPath, Map<String, hi90> changes, ProfileOperation operation) throws JSONException {
        if (operation == ProfileOperation.GET || operation == ProfileOperation.ARRAY_REMOVE) {
            return;
        }
        int i = C15707a.f71387a[operation.ordinal()];
        if (i != 1) {
            if (i == 2 && !(newValue instanceof Number)) {
                return;
            }
        } else if (!(newValue instanceof Number)) {
            return;
        } else {
            newValue = yu40.INSTANCE.m216096b((Number) newValue);
        }
        target.put(key, newValue);
        this.changeTracker.m136363c(currentPath, newValue, changes);
    }

    /* JADX INFO: renamed from: c */
    private final void m98582c(JSONObject parent, String key, Object oldValue, Object newValue, String path, Map<String, hi90> changes, ProfileOperation operation) throws JSONException {
        Number numberM216097c;
        if ((oldValue instanceof Number) && (newValue instanceof Number)) {
            int i = C15707a.f71387a[operation.ordinal()];
            if (i != 1) {
                numberM216097c = i != 2 ? (Number) oldValue : yu40.INSTANCE.m216095a((Number) oldValue, (Number) newValue);
            } else {
                numberM216097c = yu40.INSTANCE.m216097c((Number) oldValue, (Number) newValue);
            }
            if (lpq.INSTANCE.m150901a(oldValue, numberM216097c)) {
                return;
            }
            parent.put(key, numberM216097c);
            this.changeTracker.m136364f(path, oldValue, numberM216097c, changes);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m98583e(JSONObject parent, String key, Object oldValue, Object newValue, String path, Map<String, hi90> changes) throws JSONException {
        if (lpq.INSTANCE.m150901a(oldValue, newValue)) {
            return;
        }
        parent.put(key, newValue);
        this.changeTracker.m136364f(path, oldValue, newValue, changes);
    }

    /* JADX INFO: renamed from: d */
    public final void m98584d(@NotNull JSONObject target, @NotNull String key, @NotNull Object newValue, @NotNull String currentPath, @NotNull Map<String, hi90> changes, @NotNull ProfileOperation operation, @NotNull Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, hi90>, Unit> recursiveApply) throws JSONException {
        target.getClass();
        key.getClass();
        newValue.getClass();
        currentPath.getClass();
        changes.getClass();
        operation.getClass();
        recursiveApply.getClass();
        if (!target.has(key)) {
            m98581b(target, key, newValue, currentPath, changes, operation);
            return;
        }
        Object obj = target.get(key);
        if ((obj instanceof JSONObject) && (newValue instanceof JSONObject)) {
            recursiveApply.invoke(obj, newValue, currentPath, changes);
            return;
        }
        if ((obj instanceof JSONArray) && (newValue instanceof JSONArray)) {
            this.arrayHandler.m123947d(target, key, (JSONArray) obj, (JSONArray) newValue, currentPath, changes, operation, recursiveApply);
            return;
        }
        if (operation.isNumericOperation()) {
            obj.getClass();
            m98582c(target, key, obj, newValue, currentPath, changes, operation);
        } else if (operation == ProfileOperation.GET) {
            obj.getClass();
            m98580a(obj, currentPath, changes);
        } else {
            obj.getClass();
            m98583e(target, key, obj, newValue, currentPath, changes);
        }
    }
}
