package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import com.p046p1.mobile.putong.core.data.MessageType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0015Jw\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u001822\u0010\u001b\u001a.\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"Jo\u0010#\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b22\u0010\u001b\u001a.\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u0085\u0001\u0010&\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u001822\u0010\u001b\u001a.\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000e0\u001a¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(¨\u0006)"}, m87232d2 = {"Ll/g01;", "", "Ll/ii90;", "changeTracker", "<init>", "(Ll/ii90;)V", "Lorg/json/JSONArray;", "oldArray", "newArray", "", "path", "", "Ll/hi90;", "changes", "", "c", "(Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;)V", "Lorg/json/JSONObject;", "parentJson", Constants.KEY_KEY, "f", "(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;)V", "e", "basePath", "Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", MessageType.operation, "Lkotlin/Function4;", "recursiveTraversal", "g", "(Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;Lkotlin/jvm/functions/Function4;)V", "", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "a", "(Ljava/lang/Number;Ljava/lang/Number;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)Ljava/lang/Number;", "b", "(Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)V", "currentPath", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;Lkotlin/jvm/functions/Function4;)V", "Ll/ii90;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class g01 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ii90 changeTracker;

    /* JADX INFO: renamed from: l.g01$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C16970a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100018a;

        static {
            int[] iArr = new int[ProfileOperation.values().length];
            try {
                iArr[ProfileOperation.ARRAY_ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileOperation.ARRAY_REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileOperation.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileOperation.UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfileOperation.INCREMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProfileOperation.DECREMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f100018a = iArr;
        }
    }

    public g01(@NotNull ii90 ii90Var) {
        ii90Var.getClass();
        this.changeTracker = ii90Var;
    }

    /* JADX INFO: renamed from: a */
    private final Number m123941a(Number oldValue, Number newValue, ProfileOperation operation) {
        return operation == ProfileOperation.INCREMENT ? yu40.INSTANCE.m216095a(oldValue, newValue) : yu40.INSTANCE.m216097c(oldValue, newValue);
    }

    /* JADX INFO: renamed from: b */
    private final void m123942b(JSONArray oldArray, JSONArray newArray, String basePath, Map<String, hi90> changes, Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, hi90>, Unit> recursiveTraversal) throws JSONException {
        int length = newArray.length();
        for (int i = 0; i < length; i++) {
            if (i < oldArray.length()) {
                Object obj = oldArray.get(i);
                Object obj2 = newArray.get(i);
                String str = basePath + '[' + i + ']';
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    recursiveTraversal.invoke(obj, obj2, str, changes);
                } else {
                    changes.put(str, new hi90(obj, Constants.GET_MARKER));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m123943c(JSONArray oldArray, JSONArray newArray, String path, Map<String, hi90> changes) throws JSONException {
        JSONArray jSONArrayM119030b = f01.m119030b(oldArray);
        int length = newArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Object obj = newArray.get(i);
            if (obj instanceof String) {
                oldArray.put(obj);
                z = true;
            }
        }
        if (z) {
            this.changeTracker.m136364f(path, jSONArrayM119030b, oldArray, changes);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m123944e(JSONObject parentJson, String key, JSONArray oldArray, JSONArray newArray, String path, Map<String, hi90> changes) throws JSONException {
        JSONArray jSONArrayM119030b = f01.m119030b(oldArray);
        JSONArray jSONArray = new JSONArray();
        int length = oldArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Object obj = oldArray.get(i);
            if ((obj instanceof String) && f01.m119029a(newArray, (String) obj)) {
                z = true;
            } else {
                jSONArray.put(obj);
            }
        }
        if (z) {
            parentJson.put(key, jSONArray);
            this.changeTracker.m136364f(path, jSONArrayM119030b, jSONArray, changes);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m123945f(JSONObject parentJson, String key, JSONArray oldArray, JSONArray newArray, String path, Map<String, hi90> changes) throws JSONException {
        if (lpq.INSTANCE.m150901a(oldArray, newArray)) {
            return;
        }
        parentJson.put(key, newArray);
        this.changeTracker.m136364f(path, oldArray, newArray, changes);
    }

    /* JADX INFO: renamed from: g */
    private final void m123946g(JSONArray oldArray, JSONArray newArray, String basePath, Map<String, hi90> changes, ProfileOperation operation, Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, hi90>, Unit> recursiveTraversal) throws JSONException {
        JSONArray jSONArrayM119030b = f01.m119030b(oldArray);
        int iMin = Math.min(oldArray.length(), newArray.length());
        boolean z = false;
        for (int i = 0; i < iMin; i++) {
            Object obj = oldArray.get(i);
            Object obj2 = newArray.get(i);
            if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                recursiveTraversal.invoke(obj, obj2, "", linkedHashMap);
                if (!linkedHashMap.isEmpty()) {
                    z = true;
                }
            } else if ((obj instanceof Number) && (obj2 instanceof Number)) {
                Number numberM123941a = m123941a((Number) obj, (Number) obj2, operation);
                if (!lpq.INSTANCE.m150901a(obj, numberM123941a)) {
                    oldArray.put(i, numberM123941a);
                    z = true;
                }
            }
        }
        if (z) {
            this.changeTracker.m136364f(basePath, jSONArrayM119030b, oldArray, changes);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m123947d(@NotNull JSONObject parentJson, @NotNull String key, @NotNull JSONArray oldArray, @NotNull JSONArray newArray, @NotNull String currentPath, @NotNull Map<String, hi90> changes, @NotNull ProfileOperation operation, @NotNull Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, hi90>, Unit> recursiveTraversal) throws JSONException {
        parentJson.getClass();
        key.getClass();
        oldArray.getClass();
        newArray.getClass();
        currentPath.getClass();
        changes.getClass();
        operation.getClass();
        recursiveTraversal.getClass();
        if (newArray.length() == 0) {
            return;
        }
        switch (C16970a.f100018a[operation.ordinal()]) {
            case 1:
                m123943c(oldArray, newArray, currentPath, changes);
                break;
            case 2:
                m123944e(parentJson, key, oldArray, newArray, currentPath, changes);
                break;
            case 3:
                m123942b(oldArray, newArray, currentPath, changes, recursiveTraversal);
                break;
            case 4:
                m123945f(parentJson, key, oldArray, newArray, currentPath, changes);
                break;
            case 5:
            case 6:
                m123946g(oldArray, newArray, currentPath, changes, operation, recursiveTraversal);
                break;
        }
    }
}
