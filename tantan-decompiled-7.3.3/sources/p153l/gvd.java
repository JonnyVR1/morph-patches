package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0016JC\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 Ju\u0010$\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e22\u0010#\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00110\"¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m88121d2 = {"Ll/gvd;", "", "Ll/mq90;", "changeTracker", "<init>", "(Ll/mq90;)V", "Lorg/json/JSONObject;", "parentJson", "", Constants.KEY_KEY, "Lorg/json/JSONArray;", "oldArray", "newArray", "currentPath", "", "Ll/lq90;", "changes", "", "f", "(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;)V", "basePath", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Map;)V", Target.TYPE, "source", "h", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "c", "parent", "value", "path", "e", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", Constants.KEY_NEW_VALUE, "Lkotlin/Function4;", "recursiveMerge", "g", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)V", "a", "Ll/mq90;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class gvd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final mq90 changeTracker;

    public gvd(@NotNull mq90 mq90Var) {
        mq90Var.getClass();
        this.changeTracker = mq90Var;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m132533a(gvd gvdVar, JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) throws JSONException {
        gvdVar.getClass();
        jSONObject.getClass();
        str.getClass();
        map.getClass();
        if (jSONObject2 != null) {
            gvdVar.m132539h(jSONObject, jSONObject2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m132534b(gvd gvdVar, JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) throws JSONException {
        gvdVar.getClass();
        jSONObject.getClass();
        str.getClass();
        map.getClass();
        if (jSONObject2 != null) {
            gvdVar.m132539h(jSONObject, jSONObject2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    private final void m132535c(JSONArray oldArray, JSONArray newArray, String basePath, Map<String, lq90> changes) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = newArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            if (d6c.INSTANCE.m114427a(newArray.opt(i)) && i < oldArray.length()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        JSONArray jSONArrayM156503b = m01.m156503b(oldArray);
        Iterator it = CollectionsKt.sortedDescending(arrayList).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Object obj = oldArray.get(iIntValue);
            if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                oldArray.remove(iIntValue);
                z = true;
            }
        }
        if (z) {
            this.changeTracker.m159504f(basePath, jSONArrayM156503b, oldArray, changes);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m132536d(JSONArray oldArray, JSONArray newArray, String basePath, Map<String, lq90> changes) throws JSONException {
        JSONArray jSONArrayM156503b = m01.m156503b(oldArray);
        ArrayList arrayList = new ArrayList();
        int iMin = Math.min(newArray.length(), oldArray.length());
        boolean z = false;
        for (int i = 0; i < iMin; i++) {
            Object obj = oldArray.get(i);
            Object obj2 = newArray.get(i);
            if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                JSONObject jSONObject = (JSONObject) obj2;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj3 = jSONObject.get(next);
                    next.getClass();
                    obj3.getClass();
                    m132540g((JSONObject) obj, next, obj3, "", new LinkedHashMap(), new Function4() { // from class: l.evd
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            return gvd.m132533a(this.f95998a, (JSONObject) obj4, (JSONObject) obj5, (String) obj6, (Map) obj7);
                        }
                    });
                }
                if (((JSONObject) obj).length() == 0) {
                    arrayList.add(Integer.valueOf(i));
                }
                z = true;
            }
        }
        Iterator it = CollectionsKt.sortedDescending(arrayList).iterator();
        while (it.hasNext()) {
            oldArray.remove(((Number) it.next()).intValue());
        }
        if (z) {
            this.changeTracker.m159504f(basePath, jSONArrayM156503b, oldArray, changes);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m132537e(JSONObject parent, String key, Object value, String path, Map<String, lq90> changes) throws JSONException {
        if ((value instanceof JSONArray) || (value instanceof JSONObject)) {
            return;
        }
        this.changeTracker.m159505g(value, path, changes);
        parent.remove(key);
    }

    /* JADX INFO: renamed from: f */
    private final void m132538f(JSONObject parentJson, String key, JSONArray oldArray, JSONArray newArray, String currentPath, Map<String, lq90> changes) throws JSONException {
        if (newArray.length() == 0) {
            return;
        }
        boolean zM156504c = m01.m156504c(newArray);
        boolean zM156505d = m01.m156505d(newArray);
        if (zM156504c) {
            m132535c(oldArray, newArray, currentPath, changes);
        } else if (zM156505d) {
            m132536d(oldArray, newArray, currentPath, changes);
        } else {
            m132537e(parentJson, key, oldArray, currentPath, changes);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m132539h(JSONObject target, JSONObject source) throws JSONException {
        Iterator<String> itKeys = source.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = source.get(next);
            next.getClass();
            obj.getClass();
            m132540g(target, next, obj, "", new LinkedHashMap(), new Function4() { // from class: l.fvd
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    return gvd.m132534b(this.f101008a, (JSONObject) obj2, (JSONObject) obj3, (String) obj4, (Map) obj5);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m132540g(@NotNull JSONObject target, @NotNull String key, @NotNull Object newValue, @NotNull String currentPath, @NotNull Map<String, lq90> changes, @NotNull Function4<? super JSONObject, ? super JSONObject, ? super String, ? super Map<String, lq90>, Unit> recursiveMerge) throws JSONException {
        target.getClass();
        key.getClass();
        newValue.getClass();
        currentPath.getClass();
        changes.getClass();
        recursiveMerge.getClass();
        if (target.has(key)) {
            Object obj = target.get(key);
            if (d6c.INSTANCE.m114427a(newValue)) {
                obj.getClass();
                m132537e(target, key, obj, currentPath, changes);
                return;
            }
            if ((obj instanceof JSONObject) && (newValue instanceof JSONObject)) {
                recursiveMerge.invoke(obj, newValue, currentPath, changes);
                if (((JSONObject) obj).length() == 0) {
                    target.remove(key);
                    return;
                }
                return;
            }
            if ((obj instanceof JSONArray) && (newValue instanceof JSONArray)) {
                m132538f(target, key, (JSONArray) obj, (JSONArray) newValue, currentPath, changes);
            }
        }
    }
}
