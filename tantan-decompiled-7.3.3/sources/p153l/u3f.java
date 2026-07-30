package p153l;

import android.location.Location;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b%\u0010\u001bR&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e¨\u0006("}, m88121d2 = {"Ll/u3f;", "", "", "eventName", "", "eventProperties", "", FirebaseAnalytics.Param.ITEMS, "Landroid/location/Location;", "userLocation", "profileAttrName", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Landroid/location/Location;Ljava/lang/String;)V", "propertyName", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "Ll/akj0;", "g", "(Ljava/lang/String;)Ll/akj0;", "e", "(Ljava/lang/String;)Ljava/util/List;", "", RXScreenCaptureService.KEY_INDEX, "()Z", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/Map;", Constants.INAPP_DATA_TAG, "()Ljava/util/Map;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Landroid/location/Location;", "h", "()Landroid/location/Location;", "f", "getSystemPropToKey$clevertap_core_release", "systemPropToKey", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class u3f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Object> eventProperties;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Map<String, Object>> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Location userLocation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String profileAttrName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> systemPropToKey;

    /* JADX WARN: Multi-variable type inference failed */
    public u3f(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull List<? extends Map<String, ? extends Object>> list, @Nullable Location location, @Nullable String str2) {
        str.getClass();
        map.getClass();
        list.getClass();
        this.eventName = str;
        this.eventProperties = map;
        this.items = list;
        this.userLocation = location;
        this.profileAttrName = str2;
        this.systemPropToKey = MapsKt.mapOf(TuplesKt.m88129a("CT App Version", Constants.CLTAP_APP_VERSION), TuplesKt.m88129a("ct_app_version", Constants.CLTAP_APP_VERSION), TuplesKt.m88129a("CT Latitude", Constants.CLTAP_LATITUDE), TuplesKt.m88129a("ct_latitude", Constants.CLTAP_LATITUDE), TuplesKt.m88129a("CT Longitude", Constants.CLTAP_LONGITUDE), TuplesKt.m88129a("ct_longitude", Constants.CLTAP_LONGITUDE), TuplesKt.m88129a("CT OS Version", Constants.CLTAP_OS_VERSION), TuplesKt.m88129a("ct_os_version", Constants.CLTAP_OS_VERSION), TuplesKt.m88129a("CT SDK Version", Constants.CLTAP_SDK_VERSION), TuplesKt.m88129a("ct_sdk_version", Constants.CLTAP_SDK_VERSION), TuplesKt.m88129a("CT Network Carrier", Constants.CLTAP_CARRIER), TuplesKt.m88129a("ct_network_carrier", Constants.CLTAP_CARRIER), TuplesKt.m88129a("CT Network Type", Constants.CLTAP_NETWORK_TYPE), TuplesKt.m88129a("ct_network_type", Constants.CLTAP_NETWORK_TYPE), TuplesKt.m88129a("CT Connected To WiFi", "wifi"), TuplesKt.m88129a("ct_connected_to_wifi", "wifi"), TuplesKt.m88129a("CT Bluetooth Version", Constants.CLTAP_BLUETOOTH_VERSION), TuplesKt.m88129a("ct_bluetooth_version", Constants.CLTAP_BLUETOOTH_VERSION), TuplesKt.m88129a("CT Bluetooth Enabled", Constants.CLTAP_BLUETOOTH_ENABLED), TuplesKt.m88129a("ct_bluetooth_enabled", Constants.CLTAP_BLUETOOTH_ENABLED), TuplesKt.m88129a("CT App Name", "appnId"));
    }

    /* JADX INFO: renamed from: a */
    private final Object m194362a(String propertyName) {
        Object obj = this.eventProperties.get(propertyName);
        if (obj == null) {
            obj = this.eventProperties.get(Utils.m5972o(propertyName));
        }
        if (obj != null) {
            return obj;
        }
        Map<String, Object> map = this.eventProperties;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(TuplesKt.m88129a(Utils.m5972o(entry.getKey()), entry.getValue()));
        }
        return MapsKt.toMap(arrayList).get(Utils.m5972o(propertyName));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @VisibleForTesting
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m194363b(@NotNull String propertyName) {
        propertyName.getClass();
        Object objM194362a = m194362a(propertyName);
        if (objM194362a != null) {
            return objM194362a;
        }
        switch (propertyName.hashCode()) {
            case -543370741:
                if (propertyName.equals(Constants.CLTAP_PROP_CAMPAIGN_ID)) {
                    return m194362a(Constants.NOTIFICATION_ID_TAG);
                }
                break;
            case 1035561631:
                if (propertyName.equals(Constants.INAPP_WZRK_PIVOT)) {
                    return m194362a(Constants.CLTAP_PROP_VARIANT);
                }
                break;
            case 1840075742:
                if (propertyName.equals(Constants.NOTIFICATION_ID_TAG)) {
                    return m194362a(Constants.CLTAP_PROP_CAMPAIGN_ID);
                }
                break;
            case 1901439077:
                if (propertyName.equals(Constants.CLTAP_PROP_VARIANT)) {
                    return m194362a(Constants.INAPP_WZRK_PIVOT);
                }
                break;
        }
        String str = this.systemPropToKey.get(propertyName);
        if (str != null) {
            return m194362a(str);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m194365d() {
        return this.eventProperties;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<akj0> m194366e(@NotNull String propertyName) {
        propertyName.getClass();
        List<Map> listFilterNotNull = CollectionsKt.filterNotNull(this.items);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
        for (Map map : listFilterNotNull) {
            Object obj = map.get(propertyName);
            if (obj == null) {
                obj = map.get(Utils.m5972o(propertyName));
            }
            if (obj == null) {
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList2.add(TuplesKt.m88129a(Utils.m5972o((String) entry.getKey()), entry.getValue()));
                }
                obj = MapsKt.toMap(arrayList2).get(Utils.m5972o(propertyName));
            }
            arrayList.add(new akj0(obj, null, 2, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((akj0) obj2).getValue() != null) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProfileAttrName() {
        return this.profileAttrName;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final akj0 m194368g(@NotNull String propertyName) {
        propertyName.getClass();
        return new akj0(m194363b(propertyName), null, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Location getUserLocation() {
        return this.userLocation;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m194370i() {
        return Intrinsics.m88377d(this.eventName, Constants.CHARGED_EVENT);
    }

    public /* synthetic */ u3f(String str, Map map, List list, Location location, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : location, (i & 16) != 0 ? null : str2);
    }
}
