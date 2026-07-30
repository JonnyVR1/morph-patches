package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppActionType;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateType;
import com.clevertap.android.sdk.inapp.customtemplates.TemplateArgumentType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 E2\u00020\u0001:\u0004$!\u001a\u001eB;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020&¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010/R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00100R\u001a\u0010\r\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b2\u00103R\u0017\u00106\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u0010+R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\b8\u00109R(\u0010@\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010\u00060\u00060;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010AR\u0014\u0010D\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010A\u0082\u0001\u0002FG¨\u0006H"}, m88121d2 = {"Ll/d0c;", "", "Ll/c0c;", "template", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "Ll/arm;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ll/d0c$a;", "dismissListener", "Lcom/clevertap/android/sdk/Logger;", "logger", "<init>", "(Ll/c0c;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/arm;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ll/d0c$a;Lcom/clevertap/android/sdk/Logger;)V", "", "Ll/zpi0;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lorg/json/JSONObject;", "overrides", "", "", "f", "(Ljava/util/List;Lorg/json/JSONObject;)Ljava/util/Map;", "argument", "c", "(Ll/zpi0;Lorg/json/JSONObject;)Ljava/lang/Object;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "a", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;)Ljava/lang/String;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "h", "()V", "g", "toString", "()Ljava/lang/String;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "getNotification$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "Ll/d0c$a;", "Lcom/clevertap/android/sdk/Logger;", "getLogger", "()Lcom/clevertap/android/sdk/Logger;", "e", "Ljava/lang/String;", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "Ljava/util/Map;", "getArgumentValues", "()Ljava/util/Map;", "argumentValues", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getInAppListenerRef$clevertap_core_release", "()Ljava/lang/ref/WeakReference;", "inAppListenerRef", "Z", "isAction", RXScreenCaptureService.KEY_INDEX, "isVisual", "j", "Ll/d0c$c;", "Ll/d0c$d;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class d0c {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CTInAppNotification notification;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FileResourceProvider resourceProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private InterfaceC16402a dismissListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String templateName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Object> argumentValues;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<arm> inAppListenerRef;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isVisual;

    /* JADX INFO: renamed from: l.d0c$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/d0c$a;", "", "Ll/d0c;", "context", "", "a", "(Ll/d0c;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface InterfaceC16402a {
        /* JADX INFO: renamed from: a */
        void mo111906a(@NotNull d0c context);
    }

    /* JADX INFO: renamed from: l.d0c$c */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/d0c$c;", "Ll/d0c;", "Ll/c0c;", "template", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "Ll/arm;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ll/d0c$a;", "dismissListener", "Lcom/clevertap/android/sdk/Logger;", "logger", "<init>", "(Ll/c0c;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/arm;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ll/d0c$a;Lcom/clevertap/android/sdk/Logger;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C16404c extends d0c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16404c(@NotNull c0c c0cVar, @NotNull CTInAppNotification cTInAppNotification, @NotNull arm armVar, @NotNull FileResourceProvider fileResourceProvider, @Nullable InterfaceC16402a interfaceC16402a, @NotNull Logger logger) {
            super(c0cVar, cTInAppNotification, armVar, fileResourceProvider, interfaceC16402a, logger, null);
            c0cVar.getClass();
            cTInAppNotification.getClass();
            armVar.getClass();
            fileResourceProvider.getClass();
            logger.getClass();
        }
    }

    /* JADX INFO: renamed from: l.d0c$d */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/d0c$d;", "Ll/d0c;", "Ll/c0c;", "template", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "Ll/arm;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ll/d0c$a;", "dismissListener", "Lcom/clevertap/android/sdk/Logger;", "logger", "<init>", "(Ll/c0c;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/arm;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ll/d0c$a;Lcom/clevertap/android/sdk/Logger;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C16405d extends d0c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16405d(@NotNull c0c c0cVar, @NotNull CTInAppNotification cTInAppNotification, @NotNull arm armVar, @NotNull FileResourceProvider fileResourceProvider, @Nullable InterfaceC16402a interfaceC16402a, @NotNull Logger logger) {
            super(c0cVar, cTInAppNotification, armVar, fileResourceProvider, interfaceC16402a, logger, null);
            c0cVar.getClass();
            cTInAppNotification.getClass();
            armVar.getClass();
            fileResourceProvider.getClass();
            logger.getClass();
        }
    }

    /* JADX INFO: renamed from: l.d0c$e */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C16406e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84554a;

        static {
            int[] iArr = new int[TemplateArgumentType.values().length];
            try {
                iArr[TemplateArgumentType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TemplateArgumentType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TemplateArgumentType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TemplateArgumentType.FILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TemplateArgumentType.ACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f84554a = iArr;
        }
    }

    private d0c(c0c c0cVar, CTInAppNotification cTInAppNotification, arm armVar, FileResourceProvider fileResourceProvider, InterfaceC16402a interfaceC16402a, Logger logger) {
        this.notification = cTInAppNotification;
        this.resourceProvider = fileResourceProvider;
        this.dismissListener = interfaceC16402a;
        this.logger = logger;
        this.templateName = c0cVar.getName();
        List<zpi0> listM107391b = c0cVar.m107391b();
        CustomTemplateInAppData customTemplateData = cTInAppNotification.getCustomTemplateData();
        this.argumentValues = m113381f(listM107391b, customTemplateData != null ? customTemplateData.m6356b() : null);
        this.inAppListenerRef = new WeakReference<>(armVar);
        CustomTemplateInAppData customTemplateData2 = cTInAppNotification.getCustomTemplateData();
        this.isAction = customTemplateData2 != null ? customTemplateData2.getIsAction() : false;
        this.isVisual = c0cVar.getIsVisual();
    }

    /* JADX INFO: renamed from: a */
    private final String m113379a(CTInAppAction action) {
        InAppActionType type;
        CustomTemplateInAppData customTemplateInAppData;
        String templateName;
        if (action == null || (customTemplateInAppData = action.getCustomTemplateInAppData()) == null || (templateName = customTemplateInAppData.getTemplateName()) == null) {
            return (action == null || (type = action.getType()) == null) ? "" : type.toString();
        }
        return templateName;
    }

    /* JADX INFO: renamed from: c */
    private final Object m113380c(zpi0 argument, JSONObject overrides) {
        if (overrides != null && overrides.has(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String())) {
            try {
                int i = C16406e.f84554a[argument.getType().ordinal()];
                if (i == 1) {
                    return overrides.getString(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                }
                if (i == 2) {
                    return Boolean.valueOf(overrides.getBoolean(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
                }
                if (i != 3) {
                    if (i == 4) {
                        return overrides.getString(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
                    JSONObject jSONObjectOptJSONObject = overrides.optJSONObject(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                    return companion.m6185b(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(Constants.KEY_ACTIONS) : null);
                }
                Object defaultValue = argument.getDefaultValue();
                if (defaultValue instanceof Byte) {
                    return Byte.valueOf((byte) overrides.getInt(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
                }
                if (defaultValue instanceof Short) {
                    return Short.valueOf((short) overrides.getInt(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
                }
                if (defaultValue instanceof Integer) {
                    return Integer.valueOf(overrides.getInt(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
                }
                if (defaultValue instanceof Long) {
                    return Long.valueOf(overrides.getLong(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
                }
                return defaultValue instanceof Float ? Float.valueOf((float) overrides.getDouble(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String())) : Double.valueOf(overrides.getDouble(argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
            } catch (JSONException unused) {
                this.logger.debug("CustomTemplates", "Received argument with invalid type. Expected type: " + argument.getType() + " for argument: " + argument.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final Map<String, Object> m113381f(List<zpi0> defaults, JSONObject overrides) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (zpi0 zpi0Var : defaults) {
            Object objM113380c = m113380c(zpi0Var, overrides);
            if (objM113380c == null) {
                objM113380c = zpi0Var.getDefaultValue();
            }
            if (objM113380c != null) {
                linkedHashMap.put(zpi0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), objM113380c);
            }
        }
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Boolean m113382b(@NotNull String name) {
        name.getClass();
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return (Boolean) obj;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m113383d(@NotNull String name) {
        name.getClass();
        Object obj = this.argumentValues.get(name);
        if (!(obj instanceof String)) {
            obj = null;
        }
        return (String) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: g */
    public final void m113385g() {
        InterfaceC16402a interfaceC16402a = this.dismissListener;
        if (interfaceC16402a != null) {
            interfaceC16402a.mo111906a(this);
        }
        this.dismissListener = null;
        if (!this.isAction || this.isVisual) {
            arm armVar = this.inAppListenerRef.get();
            if (armVar != null) {
                armVar.mo5909K(this.notification, null);
            } else {
                this.logger.debug("CustomTemplates", "Cannot set template as dismissed");
            }
            this.inAppListenerRef.clear();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m113386h() {
        if (this.isAction) {
            return;
        }
        arm armVar = this.inAppListenerRef.get();
        if (armVar != null) {
            armVar.mo5918t0(this.notification, null);
        } else {
            this.logger.debug("CustomTemplates", "Cannot set template as presented");
        }
    }

    @NotNull
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("CustomTemplateContext {\ntemplateName = ");
        sb.append(this.templateName);
        sb.append(",\nargs = {\n");
        Map<String, Object> map = this.argumentValues;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            StringBuilder sb2 = new StringBuilder("\t");
            sb2.append(entry.getKey());
            sb2.append(" = ");
            if (entry.getValue() instanceof CTInAppAction) {
                StringBuilder sb3 = new StringBuilder("Action {");
                Object value = entry.getValue();
                sb3.append(m113379a(value instanceof CTInAppAction ? (CTInAppAction) value : null));
                sb3.append('}');
                string = sb3.toString();
            } else {
                string = entry.getValue().toString();
            }
            sb2.append(string);
            arrayList.add(sb2.toString());
        }
        sb.append(CollectionsKt.joinToString$default(arrayList, ",\n", null, null, 0, null, null, 62, null));
        sb.append("\n}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: l.d0c$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/d0c$b;", "", "<init>", "()V", "Ll/c0c;", "template", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "Ll/arm;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ll/d0c$a;", "dismissListener", "Lcom/clevertap/android/sdk/Logger;", "logger", "Ll/d0c;", "a", "(Ll/c0c;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/arm;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ll/d0c$a;Lcom/clevertap/android/sdk/Logger;)Ll/d0c;", "", "ARGS_KEY_ACTIONS", "Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: l.d0c$b$a */
        @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f84553a;

            static {
                int[] iArr = new int[CustomTemplateType.values().length];
                try {
                    iArr[CustomTemplateType.TEMPLATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CustomTemplateType.FUNCTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f84553a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final d0c m113387a(@NotNull c0c template, @NotNull CTInAppNotification notification, @NotNull arm inAppListener, @NotNull FileResourceProvider resourceProvider, @Nullable InterfaceC16402a dismissListener, @NotNull Logger logger) {
            template.getClass();
            notification.getClass();
            inAppListener.getClass();
            resourceProvider.getClass();
            logger.getClass();
            int i = a.f84553a[template.getType().ordinal()];
            if (i == 1) {
                return new C16405d(template, notification, inAppListener, resourceProvider, dismissListener, logger);
            }
            if (i == 2) {
                return new C16404c(template, notification, inAppListener, resourceProvider, dismissListener, logger);
            }
            nbr.m162172a();
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d0c(c0c c0cVar, CTInAppNotification cTInAppNotification, arm armVar, FileResourceProvider fileResourceProvider, InterfaceC16402a interfaceC16402a, Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0cVar, cTInAppNotification, armVar, fileResourceProvider, interfaceC16402a, logger);
    }
}
