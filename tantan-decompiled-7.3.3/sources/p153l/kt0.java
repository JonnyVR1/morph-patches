package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\r*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0010*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\n*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00020\u0007*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\u0001*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0010¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u0004\u0018\u00010\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b$\u0010\u0014¨\u0006%"}, m88121d2 = {"", "", "o", "(Ljava/lang/Object;)Ljava/lang/String;", "", "k", "(Ljava/lang/Object;)Ljava/lang/Integer;", "", "m", "(Ljava/lang/Object;)Ljava/lang/Long;", "", "j", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "", "n", "(Ljava/lang/Object;)Ljava/util/Map;", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/Object;)Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)Ljava/lang/Object;", "default", "a", "(Ljava/lang/Object;Z)Z", "b", "(Ljava/lang/Object;I)I", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;J)J", "e", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "", "h", "(Ljava/util/Map;)Ljava/lang/String;", "g", "(Ljava/util/List;)Ljava/lang/String;", "value", "f", "HelloFoundation_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class kt0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m151313a(@Nullable Object obj, boolean z) {
        int iIntValue;
        Integer numM151323k = m151323k(obj);
        if (numM151323k != null) {
            iIntValue = numM151323k.intValue();
        } else {
            iIntValue = z ? 1 : 0;
        }
        return iIntValue == 1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m151314b(@Nullable Object obj, int i) {
        Integer numM151323k = m151323k(obj);
        return numM151323k != null ? numM151323k.intValue() : i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m151315c(Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m151314b(obj, i);
    }

    /* JADX INFO: renamed from: d */
    public static final long m151316d(@Nullable Object obj, long j) {
        Long lM151325m = m151325m(obj);
        return lM151325m != null ? lM151325m.longValue() : j;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m151317e(@Nullable Object obj, @NotNull String str) {
        str.getClass();
        String strM151327o = m151327o(obj);
        return strM151327o != null ? strM151327o : str;
    }

    /* JADX INFO: renamed from: f */
    private static final Object m151318f(Object obj) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean)) {
            return obj;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj.toString();
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(m151318f(it.next()));
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                jSONObject.put((String) key, m151318f(value));
            }
        }
        return jSONObject;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m151319g(@Nullable List<?> list) {
        List<?> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(m151318f(it.next()));
                }
                String string = jSONArray.toString();
                string.getClass();
                return string;
            } catch (Exception unused) {
            }
        }
        return WeJson.EMPTY_ARR;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m151320h(@Nullable Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof String) {
                        jSONObject.put((String) key, m151318f(value));
                    }
                }
                String string = jSONObject.toString();
                string.getClass();
                return string;
            } catch (Exception unused) {
            }
        }
        return WeJson.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: i */
    private static final Object m151321i(@Nullable Object obj) {
        if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Map) {
            return m151326n(obj);
        }
        if (obj instanceof List) {
            return m151324l(obj);
        }
        return obj instanceof Number ? Long.valueOf(((Number) obj).longValue()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r3.equals("false") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r3.equals("true") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r3.equals("1") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r3.equals("0") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    @Nullable
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Boolean m151322j(@Nullable Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Integer) {
                return Boolean.valueOf(!Intrinsics.m88377d(obj, 0));
            }
            if (obj instanceof Long) {
                return Boolean.valueOf(!Intrinsics.m88377d(obj, 0L));
            }
            return null;
        }
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = ((String) obj).toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 3569038) {
                    if (iHashCode == 97196323) {
                    }
                }
                return null;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final Integer m151323k(@Nullable Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            Number number = (Number) obj;
            long jLongValue = number.longValue();
            if (-2147483648L <= jLongValue && 2147483647L >= jLongValue) {
                return Integer.valueOf((int) number.longValue());
            }
            return null;
        }
        if (obj instanceof String) {
            return StringsKt.toIntOrNull((String) obj);
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return Integer.valueOf((int) ((Number) obj).floatValue());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final List<Object> m151324l(@Nullable Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m151321i(it.next()));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final Long m151325m(@Nullable Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return StringsKt.m94281p((String) obj);
        }
        if (obj instanceof Double) {
            return Long.valueOf((long) ((Number) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return Long.valueOf((long) ((Number) obj).floatValue());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final Map<String, Object> m151326n(@Nullable Object obj) {
        if (!(obj instanceof Map)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                linkedHashMap.put(key, m151321i(value));
            }
        }
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final String m151327o(@Nullable Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).name();
        }
        if (obj instanceof List) {
            return m151319g((List) obj);
        }
        if (obj instanceof Map) {
            return m151320h((Map) obj);
        }
        return null;
    }
}
