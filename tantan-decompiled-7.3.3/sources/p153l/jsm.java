package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\b\nJ7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m88121d2 = {"Ll/jsm;", "", "", "Lorg/json/JSONObject;", "sortedInApps", "Lkotlin/Function1;", "", "suppressionHandler", "b", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "a", "()Z", "Ll/jsm$a;", "Ll/jsm$b;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface jsm {

    /* JADX INFO: renamed from: l.jsm$a */
    @Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/jsm$a;", "Ll/jsm;", "<init>", "()V", "", "a", "()Z", "", "Lorg/json/JSONObject;", "sortedInApps", "Lkotlin/Function1;", "suppressionHandler", "b", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "TAG", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final /* data */ class C18025a implements jsm {

        @NotNull
        public static final C18025a INSTANCE = new C18025a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private static final String TAG = "DelayedInAppSelectionStrategy";

        private C18025a() {
        }

        @Override // p153l.jsm
        /* JADX INFO: renamed from: a */
        public boolean mo146850a() {
            return false;
        }

        @Override // p153l.jsm
        @NotNull
        /* JADX INFO: renamed from: b */
        public List<JSONObject> mo146851b(@NotNull List<? extends JSONObject> sortedInApps, @NotNull Function1<? super JSONObject, Boolean> suppressionHandler) {
            Object next;
            sortedInApps.getClass();
            suppressionHandler.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : sortedInApps) {
                Integer numValueOf = Integer.valueOf(((JSONObject) obj).optInt("delayAfterTrigger", 0));
                Object arrayList = linkedHashMap.get(numValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                List list = (List) entry.getValue();
                Logger.m5928v(TAG, "Processing " + list.size() + " in-apps with delay: " + iIntValue + 's');
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (suppressionHandler.invoke((JSONObject) next).booleanValue());
                JSONObject jSONObject = (JSONObject) next;
                if (jSONObject != null) {
                    arrayList2.add(jSONObject);
                    Logger.m5928v(TAG, "Selected in-app for delay " + iIntValue + "s: " + jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD));
                }
            }
            return arrayList2;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C18025a);
        }

        public int hashCode() {
            return -498871163;
        }

        @NotNull
        public String toString() {
            return "Delayed";
        }
    }

    /* JADX INFO: renamed from: l.jsm$b */
    @Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/jsm$b;", "Ll/jsm;", "<init>", "()V", "", "a", "()Z", "", "Lorg/json/JSONObject;", "sortedInApps", "Lkotlin/Function1;", "suppressionHandler", "b", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C18026b implements jsm {

        @NotNull
        public static final C18026b INSTANCE = new C18026b();

        private C18026b() {
        }

        @Override // p153l.jsm
        /* JADX INFO: renamed from: a */
        public boolean mo146850a() {
            return true;
        }

        @Override // p153l.jsm
        @NotNull
        /* JADX INFO: renamed from: b */
        public List<JSONObject> mo146851b(@NotNull List<? extends JSONObject> sortedInApps, @NotNull Function1<? super JSONObject, Boolean> suppressionHandler) {
            sortedInApps.getClass();
            suppressionHandler.getClass();
            for (JSONObject jSONObject : sortedInApps) {
                if (!suppressionHandler.invoke(jSONObject).booleanValue()) {
                    return CollectionsKt.listOf(jSONObject);
                }
            }
            return CollectionsKt.emptyList();
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof C18026b);
        }

        public int hashCode() {
            return -1080828396;
        }

        @NotNull
        public String toString() {
            return "Immediate";
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo146850a();

    @NotNull
    /* JADX INFO: renamed from: b */
    List<JSONObject> mo146851b(@NotNull List<? extends JSONObject> sortedInApps, @NotNull Function1<? super JSONObject, Boolean> suppressionHandler);
}
