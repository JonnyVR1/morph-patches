package p149l;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateException;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u001fB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006)"}, m87232d2 = {"Ll/chi0;", "Ll/pyb$a;", "", "Ll/oyb;", "templates", "Lcom/clevertap/android/sdk/Logger;", "logger", "<init>", "(Ljava/util/Collection;Lcom/clevertap/android/sdk/Logger;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "Ll/yom;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ll/pyb;", Constants.INAPP_DATA_TAG, "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/yom;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;)Ll/pyb;", "", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "", "f", "(Ljava/lang/String;)Z", "e", "(Ljava/lang/String;)Ll/oyb;", "", "g", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/yom;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;)V", "c", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "context", "a", "(Ll/pyb;)V", "Lcom/clevertap/android/sdk/Logger;", "", "b", "Ljava/util/Map;", "customTemplates", "", "activeContexts", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class chi0 implements pyb.InterfaceC19371a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final List<bhi0> f80881d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, oyb> customTemplates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<String, pyb> activeContexts;

    public chi0(@NotNull Collection<oyb> collection, @NotNull Logger logger) {
        collection.getClass();
        logger.getClass();
        this.logger = logger;
        Collection<oyb> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(collection2, 10)), 16));
        for (Object obj : collection2) {
            linkedHashMap.put(((oyb) obj).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), obj);
        }
        this.customTemplates = linkedHashMap;
        this.activeContexts = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: d */
    private final pyb m106881d(CTInAppNotification notification, yom inAppListener, FileResourceProvider resourceProvider) {
        CustomTemplateInAppData customTemplateData = notification.getCustomTemplateData();
        String templateName = customTemplateData != null ? customTemplateData.getTemplateName() : null;
        if (templateName == null) {
            this.logger.debug("CustomTemplates", "Cannot create TemplateContext from notification without template name");
            return null;
        }
        oyb oybVar = this.customTemplates.get(templateName);
        if (oybVar != null) {
            return pyb.INSTANCE.m172108a(oybVar, notification, inAppListener, resourceProvider, this, this.logger);
        }
        this.logger.debug("CustomTemplates", "Cannot create TemplateContext for non-registered template: ".concat(templateName));
        return null;
    }

    @Override // p149l.pyb.InterfaceC19371a
    /* JADX INFO: renamed from: a */
    public void mo106882a(@NotNull pyb context) {
        context.getClass();
        this.activeContexts.remove(context.getCom.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.KEY_TEMPLATE_NAME java.lang.String());
    }

    /* JADX INFO: renamed from: c */
    public final void m106883c(@NotNull CTInAppNotification notification) {
        notification.getClass();
        CustomTemplateInAppData customTemplateData = notification.getCustomTemplateData();
        String templateName = customTemplateData != null ? customTemplateData.getTemplateName() : null;
        if (templateName == null) {
            this.logger.debug("CustomTemplates", "Cannot close custom template from notification without template name");
            return;
        }
        pyb pybVar = this.activeContexts.get(templateName);
        if (pybVar == null) {
            this.logger.debug("CustomTemplates", "Cannot close custom template without active context");
            return;
        }
        oyb oybVar = this.customTemplates.get(templateName);
        if (oybVar == null) {
            this.logger.info("CustomTemplates", "Cannot find template with name ".concat(templateName));
            return;
        }
        qyb<?> qybVarM166633d = oybVar.m166633d();
        if ((qybVarM166633d instanceof ahi0) && (pybVar instanceof pyb.C19374d)) {
            ((ahi0) qybVarM166633d).m96487a((pyb.C19374d) pybVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final oyb m106884e(@NotNull String templateName) {
        templateName.getClass();
        return this.customTemplates.get(templateName);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m106885f(@NotNull String templateName) {
        templateName.getClass();
        return this.customTemplates.containsKey(templateName);
    }

    /* JADX INFO: renamed from: g */
    public final void m106886g(@NotNull CTInAppNotification notification, @NotNull yom inAppListener, @NotNull FileResourceProvider resourceProvider) {
        notification.getClass();
        inAppListener.getClass();
        resourceProvider.getClass();
        pyb pybVarM106881d = m106881d(notification, inAppListener, resourceProvider);
        if (pybVarM106881d == null) {
            return;
        }
        oyb oybVar = this.customTemplates.get(pybVarM106881d.getCom.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.KEY_TEMPLATE_NAME java.lang.String());
        if (oybVar == null) {
            this.logger.info("CustomTemplates", "Cannot find template with name " + pybVarM106881d.getCom.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.KEY_TEMPLATE_NAME java.lang.String());
            return;
        }
        qyb<?> qybVarM166633d = oybVar.m166633d();
        if (qybVarM166633d instanceof ahi0) {
            if (pybVarM106881d instanceof pyb.C19374d) {
                this.activeContexts.put(oybVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), pybVarM106881d);
                ((ahi0) qybVarM166633d).mo127536b(pybVarM106881d);
                return;
            }
            return;
        }
        if ((qybVarM166633d instanceof jaj) && (pybVarM106881d instanceof pyb.C19373c)) {
            this.activeContexts.put(oybVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), pybVarM106881d);
            ((jaj) qybVarM166633d).mo127536b(pybVarM106881d);
        }
    }

    /* JADX INFO: renamed from: l.chi0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/chi0$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "ctInstanceConfig", "", "Ll/oyb;", "systemTemplates", "Ll/chi0;", "a", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/util/Set;)Ll/chi0;", "", "Ll/bhi0;", "templateProducers", "Ljava/util/List;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final chi0 m106887a(@NotNull CleverTapInstanceConfig ctInstanceConfig, @NotNull Set<oyb> systemTemplates) {
            ctInstanceConfig.getClass();
            systemTemplates.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = chi0.f80881d.iterator();
            while (it.hasNext()) {
                for (oyb oybVar : ((bhi0) it.next()).m101845a(ctInstanceConfig)) {
                    if (oybVar.getIsSystemDefined()) {
                        throw new CustomTemplateException("Cannot define system template with a name \"" + oybVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() + "\".", null, 2, null);
                    }
                    if (systemTemplates.contains(oybVar)) {
                        throw new CustomTemplateException("CustomTemplate with a name \"" + oybVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() + "\" is a system template.", null, 2, null);
                    }
                    if (linkedHashSet.contains(oybVar)) {
                        throw new CustomTemplateException("CustomTemplate with a name \"" + oybVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() + "\" is already registered.", null, 2, null);
                    }
                    linkedHashSet.add(oybVar);
                }
            }
            linkedHashSet.addAll(systemTemplates);
            Logger logger = ctInstanceConfig.getLogger();
            logger.getClass();
            return new chi0(linkedHashSet, logger);
        }

        private Companion() {
        }
    }
}
