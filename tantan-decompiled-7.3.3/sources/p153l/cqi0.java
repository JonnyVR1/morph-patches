package p153l;

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
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u001fB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006)"}, m88121d2 = {"Ll/cqi0;", "Ll/d0c$a;", "", "Ll/c0c;", "templates", "Lcom/clevertap/android/sdk/Logger;", "logger", "<init>", "(Ljava/util/Collection;Lcom/clevertap/android/sdk/Logger;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "Ll/arm;", "inAppListener", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ll/d0c;", Constants.INAPP_DATA_TAG, "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/arm;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;)Ll/d0c;", "", CustomTemplateInAppData.KEY_TEMPLATE_NAME, "", "f", "(Ljava/lang/String;)Z", "e", "(Ljava/lang/String;)Ll/c0c;", "", "g", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/arm;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;)V", "c", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "context", "a", "(Ll/d0c;)V", "Lcom/clevertap/android/sdk/Logger;", "", "b", "Ljava/util/Map;", "customTemplates", "", "activeContexts", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class cqi0 implements d0c.InterfaceC16402a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    private static final List<bqi0> f83089d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, c0c> customTemplates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<String, d0c> activeContexts;

    public cqi0(@NotNull Collection<c0c> collection, @NotNull Logger logger) {
        collection.getClass();
        logger.getClass();
        this.logger = logger;
        Collection<c0c> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(collection2, 10)), 16));
        for (Object obj : collection2) {
            linkedHashMap.put(((c0c) obj).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), obj);
        }
        this.customTemplates = linkedHashMap;
        this.activeContexts = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: d */
    private final d0c m111905d(CTInAppNotification notification, arm inAppListener, FileResourceProvider resourceProvider) {
        CustomTemplateInAppData customTemplateData = notification.getCustomTemplateData();
        String templateName = customTemplateData != null ? customTemplateData.getTemplateName() : null;
        if (templateName == null) {
            this.logger.debug("CustomTemplates", "Cannot create TemplateContext from notification without template name");
            return null;
        }
        c0c c0cVar = this.customTemplates.get(templateName);
        if (c0cVar != null) {
            return d0c.INSTANCE.m113387a(c0cVar, notification, inAppListener, resourceProvider, this, this.logger);
        }
        this.logger.debug("CustomTemplates", "Cannot create TemplateContext for non-registered template: ".concat(templateName));
        return null;
    }

    @Override // p153l.d0c.InterfaceC16402a
    /* JADX INFO: renamed from: a */
    public void mo111906a(@NotNull d0c context) {
        context.getClass();
        this.activeContexts.remove(context.getCom.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.KEY_TEMPLATE_NAME java.lang.String());
    }

    /* JADX INFO: renamed from: c */
    public final void m111907c(@NotNull CTInAppNotification notification) {
        notification.getClass();
        CustomTemplateInAppData customTemplateData = notification.getCustomTemplateData();
        String templateName = customTemplateData != null ? customTemplateData.getTemplateName() : null;
        if (templateName == null) {
            this.logger.debug("CustomTemplates", "Cannot close custom template from notification without template name");
            return;
        }
        d0c d0cVar = this.activeContexts.get(templateName);
        if (d0cVar == null) {
            this.logger.debug("CustomTemplates", "Cannot close custom template without active context");
            return;
        }
        c0c c0cVar = this.customTemplates.get(templateName);
        if (c0cVar == null) {
            this.logger.info("CustomTemplates", "Cannot find template with name ".concat(templateName));
            return;
        }
        e0c<?> e0cVarM107393d = c0cVar.m107393d();
        if ((e0cVarM107393d instanceof aqi0) && (d0cVar instanceof d0c.C16405d)) {
            ((aqi0) e0cVarM107393d).m99488a((d0c.C16405d) d0cVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final c0c m111908e(@NotNull String templateName) {
        templateName.getClass();
        return this.customTemplates.get(templateName);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m111909f(@NotNull String templateName) {
        templateName.getClass();
        return this.customTemplates.containsKey(templateName);
    }

    /* JADX INFO: renamed from: g */
    public final void m111910g(@NotNull CTInAppNotification notification, @NotNull arm inAppListener, @NotNull FileResourceProvider resourceProvider) {
        notification.getClass();
        inAppListener.getClass();
        resourceProvider.getClass();
        d0c d0cVarM111905d = m111905d(notification, inAppListener, resourceProvider);
        if (d0cVarM111905d == null) {
            return;
        }
        c0c c0cVar = this.customTemplates.get(d0cVarM111905d.getCom.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.KEY_TEMPLATE_NAME java.lang.String());
        if (c0cVar == null) {
            this.logger.info("CustomTemplates", "Cannot find template with name " + d0cVarM111905d.getCom.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData.KEY_TEMPLATE_NAME java.lang.String());
            return;
        }
        e0c<?> e0cVarM107393d = c0cVar.m107393d();
        if (e0cVarM107393d instanceof aqi0) {
            if (d0cVarM111905d instanceof d0c.C16405d) {
                this.activeContexts.put(c0cVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), d0cVarM111905d);
                ((aqi0) e0cVarM107393d).mo118834b(d0cVarM111905d);
                return;
            }
            return;
        }
        if ((e0cVarM107393d instanceof ddj) && (d0cVarM111905d instanceof d0c.C16404c)) {
            this.activeContexts.put(c0cVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), d0cVarM111905d);
            ((ddj) e0cVarM107393d).mo118834b(d0cVarM111905d);
        }
    }

    /* JADX INFO: renamed from: l.cqi0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/cqi0$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "ctInstanceConfig", "", "Ll/c0c;", "systemTemplates", "Ll/cqi0;", "a", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/util/Set;)Ll/cqi0;", "", "Ll/bqi0;", "templateProducers", "Ljava/util/List;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final cqi0 m111911a(@NotNull CleverTapInstanceConfig ctInstanceConfig, @NotNull Set<c0c> systemTemplates) {
            ctInstanceConfig.getClass();
            systemTemplates.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = cqi0.f83089d.iterator();
            while (it.hasNext()) {
                for (c0c c0cVar : ((bqi0) it.next()).m105942a(ctInstanceConfig)) {
                    if (c0cVar.getIsSystemDefined()) {
                        throw new CustomTemplateException("Cannot define system template with a name \"" + c0cVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() + "\".", null, 2, null);
                    }
                    if (systemTemplates.contains(c0cVar)) {
                        throw new CustomTemplateException("CustomTemplate with a name \"" + c0cVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() + "\" is a system template.", null, 2, null);
                    }
                    if (linkedHashSet.contains(c0cVar)) {
                        throw new CustomTemplateException("CustomTemplate with a name \"" + c0cVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() + "\" is already registered.", null, 2, null);
                    }
                    linkedHashSet.add(c0cVar);
                }
            }
            linkedHashSet.addAll(systemTemplates);
            Logger logger = ctInstanceConfig.getLogger();
            logger.getClass();
            return new cqi0(linkedHashSet, logger);
        }

        private Companion() {
        }
    }
}
