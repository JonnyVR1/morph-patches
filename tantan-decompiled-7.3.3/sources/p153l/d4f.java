package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import com.clevertap.android.sdk.validation.pipeline.RemovalReason;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0018\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0005Ju\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ_\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010#J_\u0010'\u001a\u00020&2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010\u001e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(JS\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010+J[\u0010-\u001a\u00020&2\u0006\u0010,\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010.J1\u0010/\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b/\u00100J=\u00101\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b1\u00102J;\u00103\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b3\u00104J)\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u00032\u0010\u0010:\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0016\u0010A\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010?R\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010?R\u0016\u0010C\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010?R\u0016\u0010D\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010?R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010G¨\u0006M"}, m88121d2 = {"Ll/d4f;", "", "", "Ll/c4f;", "<init>", "()V", "Ll/b4f;", "a", "()Ll/b4f;", "", "m", "map", "", "", "restrictedMultiValueFields", "deviceCountryCode", "", "keyCharsNotAllowed", "", "maxKeyLength", "valueCharsNotAllowed", "maxValueLength", "depth", "Lorg/json/JSONObject;", "g", "(Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;Ljava/lang/Integer;I)Lorg/json/JSONObject;", Constants.KEY_KEY, "value", "n", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "parentKey", "b", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;Ljava/lang/Integer;I)Ljava/lang/Object;", "", "j", "(Ljava/lang/Object;)Z", "", "list", "Lorg/json/JSONArray;", "f", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;Ljava/lang/Integer;I)Lorg/json/JSONArray;", "json", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;Ljava/lang/Integer;I)Lorg/json/JSONObject;", "array", "c", "(Lorg/json/JSONArray;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/Set;Ljava/lang/Integer;I)Lorg/json/JSONArray;", "e", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;)Ljava/lang/String;", "h", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;)Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;)Ljava/lang/String;", "Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", Reason.TYPE, "originalValue", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;Ljava/lang/Object;)V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "k", "(Ljava/util/Map;Ll/i0l0;)Ll/c4f;", "I", "maxDepth", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "", "Ll/mzq;", "Ljava/util/List;", "keysModified", "Ll/y0l0;", "valuesModified", "Ll/dzc0;", "itemsRemoved", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class d4f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int maxDepth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int maxArrayKeyCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int maxObjectKeyCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int maxArrayLength;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int maxKVPairCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<mzq> keysModified = new ArrayList();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<y0l0> valuesModified = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<dzc0> itemsRemoved = new ArrayList();

    /* JADX INFO: renamed from: a */
    private final b4f m114184a() {
        return new b4f(this.maxDepth, this.maxArrayKeyCount, this.maxObjectKeyCount, this.maxArrayLength, this.maxKVPairCount, CollectionsKt.toList(this.keysModified), CollectionsKt.toList(this.valuesModified), CollectionsKt.toList(this.itemsRemoved));
    }

    /* JADX INFO: renamed from: b */
    private final Object m114185b(Object value, String parentKey, Set<Character> keyCharsNotAllowed, Integer maxKeyLength, Set<Character> valueCharsNotAllowed, Integer maxValueLength, int depth) throws JSONException, IOException {
        Object objM114186c;
        if (value == null || Intrinsics.m88377d(value, JSONObject.NULL)) {
            return null;
        }
        if (value instanceof Map) {
            objM114186c = m114190g((Map) value, null, null, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, depth + 1);
        } else if (value instanceof JSONObject) {
            objM114186c = m114187d((JSONObject) value, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, depth + 1);
        } else if (value instanceof List) {
            objM114186c = m114189f((List) value, parentKey, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, depth);
        } else if (value instanceof Object[]) {
            objM114186c = m114189f(ArraysKt.toList((Object[]) value), parentKey, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, depth);
        } else {
            if (!(value instanceof JSONArray)) {
                return m114191h(value, parentKey, valueCharsNotAllowed, maxValueLength);
            }
            objM114186c = m114186c((JSONArray) value, parentKey, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, depth);
        }
        if (!m114193j(objM114186c)) {
            return objM114186c;
        }
        m114194l(parentKey, RemovalReason.EMPTY_VALUE, "");
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final JSONArray m114186c(JSONArray array, String parentKey, Set<Character> keyCharsNotAllowed, Integer maxKeyLength, Set<Character> valueCharsNotAllowed, Integer maxValueLength, int depth) throws JSONException, IOException {
        int i = depth;
        this.maxDepth = Math.max(this.maxDepth, i);
        this.maxArrayLength = Math.max(this.maxArrayLength, array.length());
        JSONArray jSONArray = new JSONArray();
        int length = array.length();
        int i2 = 0;
        while (i2 < length) {
            Object obj = array.get(i2);
            if (obj == null || Intrinsics.m88377d(obj, JSONObject.NULL)) {
                m114194l(parentKey, RemovalReason.NULL_VALUE, null);
            } else {
                Object objM114185b = m114185b(obj, parentKey, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, i);
                if (objM114185b != null) {
                    jSONArray.put(objM114185b);
                }
            }
            i2++;
            i = depth;
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    private final JSONObject m114187d(JSONObject json, Set<Character> keyCharsNotAllowed, Integer maxKeyLength, Set<Character> valueCharsNotAllowed, Integer maxValueLength, int depth) throws JSONException, IOException {
        depth = depth;
        this.maxDepth = Math.max(this.maxDepth, depth);
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = json.keys();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            String strM114188e = m114188e(next, keyCharsNotAllowed, maxKeyLength);
            if (strM114188e.length() == 0) {
                m114194l(next, RemovalReason.EMPTY_KEY, "");
            } else {
                Object obj = json.get(next);
                if (obj == null || Intrinsics.m88377d(obj, JSONObject.NULL)) {
                    m114194l(strM114188e, RemovalReason.NULL_VALUE, "");
                } else {
                    if (obj instanceof JSONObject) {
                        i2++;
                    } else if (obj instanceof JSONArray) {
                        i++;
                    }
                    int i4 = i;
                    int i5 = i2;
                    Object objM114185b = m114185b(obj, strM114188e, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, depth);
                    if (objM114185b != null) {
                        jSONObject.put(strM114188e, objM114185b);
                        i3++;
                    }
                    i = i4;
                    i2 = i5;
                }
            }
        }
        this.maxArrayKeyCount = Math.max(this.maxArrayKeyCount, i);
        this.maxObjectKeyCount = Math.max(this.maxObjectKeyCount, i2);
        this.maxKVPairCount = Math.max(this.maxKVPairCount, i3);
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    private final String m114188e(String key, Set<Character> keyCharsNotAllowed, Integer maxKeyLength) throws IOException {
        int iIntValue;
        String string = StringsKt.m94324Z0(key).toString();
        if (string.length() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if (keyCharsNotAllowed != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (!keyCharsNotAllowed.contains(Character.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (!Intrinsics.m88377d(string2, string)) {
                arrayList.add(ModificationReason.INVALID_CHARACTERS_REMOVED);
                string = string2;
            }
        }
        if (maxKeyLength != null && string.length() > (iIntValue = maxKeyLength.intValue())) {
            arrayList.add(ModificationReason.TRUNCATED_TO_MAX_LENGTH);
            string = string.substring(0, iIntValue);
        }
        String string3 = StringsKt.m94324Z0(string).toString();
        if (!Intrinsics.m88377d(string3, key) && !arrayList.isEmpty()) {
            this.keysModified.add(new mzq(key, string3, arrayList));
        }
        return string3;
    }

    /* JADX INFO: renamed from: f */
    private final JSONArray m114189f(List<?> list, String parentKey, Set<Character> keyCharsNotAllowed, Integer maxKeyLength, Set<Character> valueCharsNotAllowed, Integer maxValueLength, int depth) throws JSONException, IOException {
        int i = depth;
        this.maxDepth = Math.max(this.maxDepth, i);
        this.maxArrayLength = Math.max(this.maxArrayLength, list.size());
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                m114194l(parentKey, RemovalReason.NULL_VALUE, null);
            } else {
                Object objM114185b = m114185b(obj, parentKey, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, i);
                if (objM114185b != null) {
                    jSONArray.put(objM114185b);
                }
                i = depth;
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX INFO: renamed from: g */
    private final JSONObject m114190g(Map<?, ?> map, Set<String> restrictedMultiValueFields, String deviceCountryCode, Set<Character> keyCharsNotAllowed, Integer maxKeyLength, Set<Character> valueCharsNotAllowed, Integer maxValueLength, int depth) throws JSONException, IOException {
        int i;
        Object objM114185b;
        int i2 = depth;
        this.maxDepth = Math.max(this.maxDepth, i2);
        JSONObject jSONObject = new JSONObject();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                m114194l("null", RemovalReason.EMPTY_KEY, "");
                i = i4;
            } else {
                String string = key.toString();
                i = i4;
                String strM114188e = m114188e(string, keyCharsNotAllowed, maxKeyLength);
                if (strM114188e.length() == 0) {
                    m114194l(string, RemovalReason.EMPTY_KEY, "");
                } else if (value == null) {
                    m114194l(strM114188e, RemovalReason.NULL_VALUE, null);
                } else if (i2 != 0 || restrictedMultiValueFields == null) {
                    if (C15493d.m94381x(strM114188e, "Phone", true)) {
                        m114196n(strM114188e, value, deviceCountryCode);
                    }
                    if (!(value instanceof Map) || (value instanceof JSONObject)) {
                        i++;
                    } else if ((value instanceof List) || (value instanceof Object[]) || (value instanceof JSONArray)) {
                        i3++;
                    }
                    int i6 = i3;
                    objM114185b = m114185b(value, strM114188e, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, i2);
                    if (objM114185b != null) {
                        jSONObject.put(strM114188e, objM114185b);
                        i5++;
                    }
                    i2 = depth;
                    i3 = i6;
                } else {
                    String lowerCase = strM114188e.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (restrictedMultiValueFields.contains(lowerCase) && ((value instanceof Map) || (value instanceof JSONObject) || (value instanceof List) || (value instanceof Object[]) || (value instanceof JSONArray))) {
                        m114194l(strM114188e, RemovalReason.RESTRICTED_KEY_NESTED_VALUE, value);
                    } else {
                        if (C15493d.m94381x(strM114188e, "Phone", true)) {
                            m114196n(strM114188e, value, deviceCountryCode);
                        }
                        if (value instanceof Map) {
                            i++;
                        } else {
                            i++;
                        }
                        int i7 = i3;
                        objM114185b = m114185b(value, strM114188e, keyCharsNotAllowed, maxKeyLength, valueCharsNotAllowed, maxValueLength, i2);
                        if (objM114185b != null) {
                            jSONObject.put(strM114188e, objM114185b);
                            i5++;
                        }
                        i2 = depth;
                        i3 = i7;
                    }
                }
            }
            i4 = i;
        }
        this.maxArrayKeyCount = Math.max(this.maxArrayKeyCount, i3);
        this.maxObjectKeyCount = Math.max(this.maxObjectKeyCount, i4);
        this.maxKVPairCount = Math.max(this.maxKVPairCount, i5);
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    private final Object m114191h(Object value, String key, Set<Character> valueCharsNotAllowed, Integer maxValueLength) {
        if ((value instanceof Integer) || (value instanceof Long) || (value instanceof Float) || (value instanceof Double) || (value instanceof Boolean)) {
            return value;
        }
        if (value instanceof String) {
            return m114192i((String) value, key, valueCharsNotAllowed, maxValueLength);
        }
        if (value instanceof Character) {
            return m114191h(String.valueOf(((Character) value).charValue()), key, valueCharsNotAllowed, maxValueLength);
        }
        if (!(value instanceof Date)) {
            m114194l(key, RemovalReason.NON_PRIMITIVE_VALUE, value);
            return null;
        }
        return Constants.DATE_PREFIX + (((Date) value).getTime() / 1000);
    }

    /* JADX INFO: renamed from: i */
    private final String m114192i(String value, String key, Set<Character> valueCharsNotAllowed, Integer maxValueLength) throws IOException {
        int iIntValue;
        String string = StringsKt.m94324Z0(value).toString();
        if (string.length() == 0) {
            m114194l(key, RemovalReason.EMPTY_VALUE, "");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (valueCharsNotAllowed != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (!valueCharsNotAllowed.contains(Character.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (!Intrinsics.m88377d(string2, string)) {
                arrayList.add(ModificationReason.INVALID_CHARACTERS_REMOVED);
                string = string2;
            }
        }
        if (maxValueLength != null && string.length() > (iIntValue = maxValueLength.intValue())) {
            arrayList.add(ModificationReason.TRUNCATED_TO_MAX_LENGTH);
            string = string.substring(0, iIntValue);
        }
        String string3 = StringsKt.m94324Z0(string).toString();
        if (!Intrinsics.m88377d(string3, value) && !arrayList.isEmpty()) {
            this.valuesModified.add(new y0l0(key, value, string3, arrayList));
        }
        if (string3.length() != 0) {
            return string3;
        }
        m114194l(key, RemovalReason.EMPTY_VALUE, "");
        return null;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m114193j(Object value) {
        if (value instanceof JSONObject) {
            return ((JSONObject) value).length() == 0;
        }
        return (value instanceof JSONArray) && ((JSONArray) value).length() == 0;
    }

    /* JADX INFO: renamed from: l */
    private final void m114194l(String key, RemovalReason reason, Object originalValue) {
        this.itemsRemoved.add(new dzc0(key, reason, originalValue));
    }

    /* JADX INFO: renamed from: m */
    private final void m114195m() {
        this.maxDepth = 0;
        this.maxArrayKeyCount = 0;
        this.maxObjectKeyCount = 0;
        this.maxArrayLength = 0;
        this.maxKVPairCount = 0;
        this.keysModified.clear();
        this.valuesModified.clear();
        this.itemsRemoved.clear();
    }

    /* JADX INFO: renamed from: n */
    private final void m114196n(String key, Object value, String deviceCountryCode) {
        if (!(value instanceof String)) {
            m114194l(key, RemovalReason.INVALID_PHONE_NUMBER, value);
            return;
        }
        String string = StringsKt.m94324Z0((String) value).toString();
        if ((deviceCountryCode == null || deviceCountryCode.length() == 0) && !C15493d.m94374J(string, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
            m114194l(key, RemovalReason.INVALID_COUNTRY_CODE, string);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public c4f m114197k(@Nullable Map<?, ?> input, @NotNull i0l0 config) throws IOException {
        d4f d4fVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        config.getClass();
        m114195m();
        if (input == null) {
            jSONObject2 = new JSONObject();
            d4fVar = this;
        } else {
            try {
                d4fVar = this;
                try {
                    jSONObject = d4fVar.m114190g(input, config.m137994q(), config.m137980c().invoke(), config.m137983f(), config.getMaxKeyLength(), config.m137995r(), config.getMaxValueLength(), 0);
                } catch (JSONException unused) {
                    jSONObject = new JSONObject();
                }
            } catch (JSONException unused2) {
                d4fVar = this;
            }
            jSONObject2 = jSONObject;
        }
        return new c4f(jSONObject2, d4fVar.m114184a());
    }
}
