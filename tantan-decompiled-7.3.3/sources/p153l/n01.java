package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import com.p051p1.mobile.putong.core.data.MessageType;
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
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0015Jw\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u001822\u0010\u001b\u001a.\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"Jo\u0010#\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b22\u0010\u001b\u001a.\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u0085\u0001\u0010&\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u001822\u0010\u001b\u001a.\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000e0\u001a¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(¨\u0006)"}, m88121d2 = {"Ll/n01;", "", "Ll/mq90;", "changeTracker", "<init>", "(Ll/mq90;)V", "Lorg/json/JSONArray;", "oldArray", "newArray", "", "path", "", "Ll/lq90;", "changes", "", "c", "(Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;)V", "Lorg/json/JSONObject;", "parentJson", Constants.KEY_KEY, "f", "(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;)V", "e", "basePath", "Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;", MessageType.operation, "Lkotlin/Function4;", "recursiveTraversal", "g", "(Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;Lkotlin/jvm/functions/Function4;)V", "", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "a", "(Ljava/lang/Number;Ljava/lang/Number;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;)Ljava/lang/Number;", "b", "(Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)V", "currentPath", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;Lcom/clevertap/android/sdk/profile/traversal/ProfileOperation;Lkotlin/jvm/functions/Function4;)V", "Ll/mq90;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class n01 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final mq90 changeTracker;

    /* JADX INFO: renamed from: l.n01$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C18752a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f139582a;

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
            f139582a = iArr;
        }
    }

    public n01(@NotNull mq90 mq90Var) {
        mq90Var.getClass();
        this.changeTracker = mq90Var;
    }

    /* JADX INFO: renamed from: a */
    private final Number m160944a(Number oldValue, Number newValue, ProfileOperation operation) {
        return operation == ProfileOperation.INCREMENT ? n350.INSTANCE.m161271a(oldValue, newValue) : n350.INSTANCE.m161273c(oldValue, newValue);
    }

    /* JADX INFO: renamed from: b */
    private final void m160945b(JSONArray oldArray, JSONArray newArray, String basePath, Map<String, lq90> changes, Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, lq90>, Unit> recursiveTraversal) throws JSONException {
        int length = newArray.length();
        for (int i = 0; i < length; i++) {
            if (i < oldArray.length()) {
                Object obj = oldArray.get(i);
                Object obj2 = newArray.get(i);
                String str = basePath + '[' + i + ']';
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    recursiveTraversal.invoke(obj, obj2, str, changes);
                } else {
                    changes.put(str, new lq90(obj, Constants.GET_MARKER));
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m160946c(JSONArray oldArray, JSONArray newArray, String path, Map<String, lq90> changes) throws JSONException {
        JSONArray jSONArrayM156503b = m01.m156503b(oldArray);
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
            this.changeTracker.m159504f(path, jSONArrayM156503b, oldArray, changes);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m160947e(JSONObject parentJson, String key, JSONArray oldArray, JSONArray newArray, String path, Map<String, lq90> changes) throws JSONException {
        JSONArray jSONArrayM156503b = m01.m156503b(oldArray);
        JSONArray jSONArray = new JSONArray();
        int length = oldArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Object obj = oldArray.get(i);
            if ((obj instanceof String) && m01.m156502a(newArray, (String) obj)) {
                z = true;
            } else {
                jSONArray.put(obj);
            }
        }
        if (z) {
            parentJson.put(key, jSONArray);
            this.changeTracker.m159504f(path, jSONArrayM156503b, jSONArray, changes);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m160948f(JSONObject parentJson, String key, JSONArray oldArray, JSONArray newArray, String path, Map<String, lq90> changes) throws JSONException {
        if (lrq.INSTANCE.m155636a(oldArray, newArray)) {
            return;
        }
        parentJson.put(key, newArray);
        this.changeTracker.m159504f(path, oldArray, newArray, changes);
    }

    /* JADX INFO: renamed from: g */
    private final void m160949g(JSONArray oldArray, JSONArray newArray, String basePath, Map<String, lq90> changes, ProfileOperation operation, Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, lq90>, Unit> recursiveTraversal) throws JSONException {
        JSONArray jSONArrayM156503b = m01.m156503b(oldArray);
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
                Number numberM160944a = m160944a((Number) obj, (Number) obj2, operation);
                if (!lrq.INSTANCE.m155636a(obj, numberM160944a)) {
                    oldArray.put(i, numberM160944a);
                    z = true;
                }
            }
        }
        if (z) {
            this.changeTracker.m159504f(basePath, jSONArrayM156503b, oldArray, changes);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m160950d(@NotNull JSONObject parentJson, @NotNull String key, @NotNull JSONArray oldArray, @NotNull JSONArray newArray, @NotNull String currentPath, @NotNull Map<String, lq90> changes, @NotNull ProfileOperation operation, @NotNull Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, lq90>, Unit> recursiveTraversal) throws JSONException {
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
        switch (C18752a.f139582a[operation.ordinal()]) {
            case 1:
                m160946c(oldArray, newArray, currentPath, changes);
                break;
            case 2:
                m160947e(parentJson, key, oldArray, newArray, currentPath, changes);
                break;
            case 3:
                m160945b(oldArray, newArray, currentPath, changes, recursiveTraversal);
                break;
            case 4:
                m160948f(parentJson, key, oldArray, newArray, currentPath, changes);
                break;
            case 5:
            case 6:
                m160949g(oldArray, newArray, currentPath, changes, operation, recursiveTraversal);
                break;
        }
    }
}
