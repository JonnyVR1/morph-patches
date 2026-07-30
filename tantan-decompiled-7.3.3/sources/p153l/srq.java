package p153l;

import com.clevertap.android.sdk.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15492c;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m88121d2 = {"Ll/srq;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "", "", "b", "(Lorg/json/JSONObject;)Ljava/util/Map;", "Lorg/json/JSONArray;", "jsonArray", "", "a", "(Lorg/json/JSONArray;)Ljava/util/List;", "value", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "number", Constants.INAPP_DATA_TAG, "(Ljava/lang/Number;)Ljava/lang/Object;", "jsonObj", "c", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class srq {
    public static final srq INSTANCE = new srq();

    private srq() {
    }

    /* JADX INFO: renamed from: a */
    private final List<Object> m187632a(JSONArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(m187635e(jsonArray.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> m187633b(JSONObject jsonObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            next.getClass();
            linkedHashMap.put(next, m187635e(obj));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    private final Object m187634d(Number number) {
        String string = number.toString();
        Long lP = StringsKt.m94281p(string);
        if (lP != null) {
            long jLongValue = lP.longValue();
            return (-2147483648L <= jLongValue && 2147483647L >= jLongValue) ? Integer.valueOf((int) lP.longValue()) : lP;
        }
        Double dM94363m = C15492c.m94363m(string);
        if (dM94363m == null) {
            return new BigDecimal(number.toString());
        }
        float fDoubleValue = (float) dM94363m.doubleValue();
        return Intrinsics.m88374a((double) fDoubleValue, dM94363m) ? Float.valueOf(fDoubleValue) : dM94363m;
    }

    /* JADX INFO: renamed from: e */
    private final Object m187635e(Object value) {
        if (value == null || Intrinsics.m88377d(value, JSONObject.NULL)) {
            return null;
        }
        if ((value instanceof String) || (value instanceof Boolean)) {
            return value;
        }
        if (value instanceof Number) {
            return m187634d((Number) value);
        }
        if (value instanceof JSONObject) {
            return m187633b((JSONObject) value);
        }
        return value instanceof JSONArray ? m187632a((JSONArray) value) : value;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m187636c(@NotNull JSONObject jsonObj) {
        jsonObj.getClass();
        try {
            return m187633b(jsonObj);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid JSON string provided.", e);
        }
    }
}
