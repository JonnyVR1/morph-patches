package com.facebook.appevents.codeless.internal;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.data.OMSWebPerimeterType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.zf60;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 +2\u00020\u0001:\u0003,\u0013-B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010(R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010(¨\u0006."}, m88121d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding;", "", "", "eventName", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", FirebaseAnalytics.Param.METHOD, "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "type", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "path", "Ll/zf60;", "parameters", "componentId", "pathType", "activityName", "<init>", "(Ljava/lang/String;Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "getMethod", "()Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "c", "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "getType", "()Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", Constants.INAPP_DATA_TAG, "getAppVersion", "e", "Ljava/util/List;", "f", "g", "getComponentId", "h", "getPathType", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/List;", "viewPath", "viewParameters", "Companion", "ActionType", "MappingMethod", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class EventBinding {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MappingMethod method;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ActionType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String appVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<PathComponent> path;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<zf60> parameters;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String componentId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String pathType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String activityName;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "", "(Ljava/lang/String;I)V", "CLICK", "SELECTED", "TEXT_CHANGED", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "", "(Ljava/lang/String;I)V", "MANUAL", "INFERENCE", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.internal.EventBinding$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "array", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "b", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "mapping", "a", "(Lorg/json/JSONObject;)Lcom/facebook/appevents/codeless/internal/EventBinding;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final EventBinding m7761a(@NotNull JSONObject mapping) throws JSONException, IllegalArgumentException {
            mapping.getClass();
            String string = mapping.getString("event_name");
            String string2 = mapping.getString(FirebaseAnalytics.Param.METHOD);
            string2.getClass();
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            String upperCase = string2.toUpperCase(locale);
            upperCase.getClass();
            MappingMethod mappingMethodValueOf = MappingMethod.valueOf(upperCase);
            String string3 = mapping.getString("event_type");
            string3.getClass();
            locale.getClass();
            String upperCase2 = string3.toUpperCase(locale);
            upperCase2.getClass();
            ActionType actionTypeValueOf = ActionType.valueOf(upperCase2);
            String string4 = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jSONObject.getClass();
                arrayList.add(new PathComponent(jSONObject));
            }
            String strOptString = mapping.optString("path_type", OMSWebPerimeterType.absolute);
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    arrayList2.add(new zf60(jSONObject2));
                }
            }
            String strOptString2 = mapping.optString("component_id");
            String strOptString3 = mapping.optString("activity_name");
            string.getClass();
            string4.getClass();
            strOptString2.getClass();
            strOptString.getClass();
            strOptString3.getClass();
            return new EventBinding(string, mappingMethodValueOf, actionTypeValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<EventBinding> m7762b(@Nullable JSONArray array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                try {
                    int length = array.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = array.getJSONObject(i);
                        jSONObject.getClass();
                        arrayList.add(m7761a(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        public Companion() {
        }
    }

    public EventBinding(@NotNull String str, @NotNull MappingMethod mappingMethod, @NotNull ActionType actionType, @NotNull String str2, @NotNull List<PathComponent> list, @NotNull List<zf60> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        str.getClass();
        mappingMethod.getClass();
        actionType.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.eventName = str;
        this.method = mappingMethod;
        this.type = actionType;
        this.appVersion = str2;
        this.path = list;
        this.parameters = list2;
        this.componentId = str3;
        this.pathType = str4;
        this.activityName = str5;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<zf60> m7759c() {
        List<zf60> listUnmodifiableList = Collections.unmodifiableList(this.parameters);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<PathComponent> m7760d() {
        List<PathComponent> listUnmodifiableList = Collections.unmodifiableList(this.path);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
