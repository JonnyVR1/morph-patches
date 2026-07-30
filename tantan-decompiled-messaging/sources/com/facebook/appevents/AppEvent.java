package com.facebook.appevents;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.c3f;
import p149l.lxc0;
import p149l.rwm;
import p149l.uxv;
import p149l.xlc0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 42\u00020\u0001:\u000256BS\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B)\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0016J=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0017¢\u0006\u0004\b%\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b%\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0017\u0010.\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010$R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b\u0014\u0010\"R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010*¨\u00067"}, m87232d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "", "contextName", "eventName", "", "valueToSum", "Landroid/os/Bundle;", "parameters", "", "isImplicitlyLogged", "isInBackground", "Ljava/util/UUID;", "currentSessionId", "Lcom/facebook/appevents/g;", "operationalParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;Lcom/facebook/appevents/g;)V", "jsonString", "operationalJsonString", "isImplicit", "inBackground", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "Lorg/json/JSONObject;", "getJSONObjectForAppEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "isOperational", "", "validateParameters", "(Landroid/os/Bundle;Z)Ljava/util/Map;", "", "writeReplace", "()Ljava/lang/Object;", "getIsImplicit", "()Z", "getJSONObject", "()Lorg/json/JSONObject;", "getOperationalJSONObject", "Lcom/facebook/appevents/OperationalDataEnum;", "type", "(Lcom/facebook/appevents/OperationalDataEnum;)Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "operationalJsonObject", "getOperationalJsonObject", "Z", AuthenticationTokenClaims.JSON_KEY_NAME, "Ljava/lang/String;", "getName", "Companion", "a", "SerializationProxyV2", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppEvent implements Serializable {
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    private final boolean inBackground;
    private final boolean isImplicit;

    @NotNull
    private final JSONObject jsonObject;

    @NotNull
    private final String name;

    @NotNull
    private final JSONObject operationalJsonObject;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashSet<String> validatedIdentifiers = new HashSet<>();

    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0011"}, m87232d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "", "jsonString", "operationalJsonString", "", "isImplicit", "inBackground", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/String;", "Z", "Companion", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final boolean inBackground;
        private final boolean isImplicit;

        @NotNull
        private final String jsonString;

        @NotNull
        private final String operationalJsonString;

        public SerializationProxyV2(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.jsonString = str;
            this.operationalJsonString = str2;
            this.isImplicit = z;
            this.inBackground = z2;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.jsonString, this.operationalJsonString, this.isImplicit, this.inBackground, null);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.AppEvent$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/facebook/appevents/AppEvent$a;", "", "<init>", "()V", "", "identifier", "", "a", "(Ljava/lang/String;)V", "", "MAX_IDENTIFIER_LENGTH", "I", "", "serialVersionUID", "J", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validatedIdentifiers", "Ljava/util/HashSet;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m7640a(@NotNull String identifier) {
            boolean zContains;
            identifier.getClass();
            if (identifier.length() == 0 || identifier.length() > 40) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2)));
            }
            synchronized (AppEvent.validatedIdentifiers) {
                zContains = AppEvent.validatedIdentifiers.contains(identifier);
                Unit unit = Unit.INSTANCE;
            }
            if (zContains) {
                return;
            }
            if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(identifier)) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1)));
            }
            synchronized (AppEvent.validatedIdentifiers) {
                AppEvent.validatedIdentifiers.add(identifier);
            }
        }

        public Companion() {
        }
    }

    public AppEvent(@NotNull String str, @NotNull String str2, @Nullable Double d, @Nullable Bundle bundle, boolean z, boolean z2, @Nullable UUID uuid, @Nullable C1555g c1555g) throws JSONException, FacebookException {
        JSONObject jSONObjectM7791e;
        str.getClass();
        str2.getClass();
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        this.operationalJsonObject = (c1555g == null || (jSONObjectM7791e = c1555g.m7791e()) == null) ? new JSONObject() : jSONObjectM7791e;
        this.jsonObject = getJSONObjectForAppEvent(str, str2, d, bundle, uuid);
    }

    private final JSONObject getJSONObjectForAppEvent(String contextName, String eventName, Double valueToSum, Bundle parameters, UUID currentSessionId) throws JSONException {
        INSTANCE.m7640a(eventName);
        JSONObject jSONObject = new JSONObject();
        String strM152050e = lxc0.m152050e(eventName);
        if (Intrinsics.m87488d(strM152050e, eventName)) {
            strM152050e = xlc0.m209869d(eventName);
        }
        jSONObject.put("_eventName", strM152050e);
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", contextName);
        if (currentSessionId != null) {
            jSONObject.put("_session_id", currentSessionId);
        }
        if (parameters != null) {
            Map mapValidateParameters$default = validateParameters$default(this, parameters, false, 2, null);
            for (String str : mapValidateParameters$default.keySet()) {
                jSONObject.put(str, mapValidateParameters$default.get(str));
            }
        }
        if (valueToSum != null) {
            jSONObject.put("_valueToSum", valueToSum.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        uxv.Companion companion = uxv.INSTANCE;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        String string = jSONObject.toString();
        string.getClass();
        companion.m196208c(loggingBehavior, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    private final Map<String, String> validateParameters(Bundle parameters, boolean isOperational) {
        HashMap map = new HashMap();
        for (String str : parameters.keySet()) {
            Companion companion = INSTANCE;
            str.getClass();
            companion.m7640a(str);
            Object obj = parameters.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            map.put(str, obj.toString());
        }
        if (!isOperational) {
            rwm.m181438c(map);
            lxc0.m152051f(TypeIntrinsics.m87537d(map), this.name);
            c3f.m105009c(TypeIntrinsics.m87537d(map), this.name);
        }
        return map;
    }

    public static /* synthetic */ Map validateParameters$default(AppEvent appEvent, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appEvent.validateParameters(bundle, z);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.jsonObject.toString();
        string.getClass();
        String string2 = this.operationalJsonObject.toString();
        string2.getClass();
        return new SerializationProxyV2(string, string2, this.isImplicit, this.inBackground);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final JSONObject getOperationalJSONObject(@NotNull OperationalDataEnum type) {
        type.getClass();
        return this.operationalJsonObject.optJSONObject(type.getValue());
    }

    @NotNull
    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
    }

    @NotNull
    /* JADX INFO: renamed from: getOperationalJSONObject, reason: from getter */
    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public /* synthetic */ AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, C1555g c1555g, int i, DefaultConstructorMarker defaultConstructorMarker) throws JSONException, FacebookException {
        this(str, str2, d, bundle, z, z2, uuid, (i & 128) != 0 ? null : c1555g);
    }

    public /* synthetic */ AppEvent(String str, String str2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2);
    }

    private AppEvent(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.operationalJsonObject = new JSONObject(str2);
        this.isImplicit = z;
        String strOptString = jSONObject.optString("_eventName");
        strOptString.getClass();
        this.name = strOptString;
        this.inBackground = z2;
    }
}
