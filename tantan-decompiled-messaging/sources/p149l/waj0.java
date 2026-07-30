package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R \u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/waj0;", "", "value", "", "listValue", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "", "e", "()Ljava/lang/Number;", "", "f", "()Ljava/lang/String;", "g", "c", "()Ljava/util/List;", Constants.INAPP_DATA_TAG, "", "b", "()Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Ljava/util/List;", "Ljava/lang/String;", "stringValue", "stringValueCleaned", "listValueWithCleanedStringIfPresent", "Ljava/lang/Number;", "numberValue", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class waj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Object value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private List<? extends Object> listValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String stringValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String stringValueCleaned;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<? extends Object> listValueWithCleanedStringIfPresent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Number numberValue;

    public waj0(@Nullable Object obj, @Nullable List<? extends Object> list) {
        ArrayList arrayList;
        this.value = obj;
        this.listValue = list;
        if (obj instanceof String) {
            this.stringValue = (String) obj;
            String lowerCase = StringsKt.m93433Z0((String) obj).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.stringValueCleaned = lowerCase;
            return;
        }
        if (obj instanceof Boolean) {
            this.stringValue = String.valueOf(((Boolean) obj).booleanValue());
            String lowerCase2 = StringsKt.m93433Z0(String.valueOf(((Boolean) obj).booleanValue())).toString().toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            this.stringValueCleaned = lowerCase2;
            return;
        }
        if (obj instanceof Number) {
            this.numberValue = (Number) obj;
            return;
        }
        if (obj instanceof List) {
            this.listValue = (List) obj;
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Object lowerCase3 : iterable) {
                if (lowerCase3 instanceof String) {
                    lowerCase3 = StringsKt.m93433Z0((String) lowerCase3).toString().toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                }
                arrayList2.add(lowerCase3);
            }
            this.listValueWithCleanedStringIfPresent = arrayList2;
            return;
        }
        if (obj instanceof JSONArray) {
            List<? extends Object> listM199282b = vpq.m199282b((JSONArray) obj);
            this.listValue = listM199282b;
            if (listM199282b != null) {
                List<? extends Object> list2 = listM199282b;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (Object lowerCase4 : list2) {
                    if (lowerCase4 instanceof String) {
                        lowerCase4 = StringsKt.m93433Z0((String) lowerCase4).toString().toLowerCase(Locale.ROOT);
                        lowerCase4.getClass();
                    }
                    arrayList.add(lowerCase4);
                }
            } else {
                arrayList = null;
            }
            this.listValueWithCleanedStringIfPresent = arrayList;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m202436b() {
        return this.listValue != null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final List<?> m202437c() {
        return this.listValue;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final List<?> m202438d() {
        return this.listValueWithCleanedStringIfPresent;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Number getNumberValue() {
        return this.numberValue;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStringValueCleaned() {
        return this.stringValueCleaned;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public waj0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ waj0(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : list);
    }
}
