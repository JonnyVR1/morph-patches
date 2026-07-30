package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¨\u0006\t"}, m87232d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final Qualified<CoroutineDispatcher> backgroundDispatcher;

    @NotNull
    private static final Qualified<CoroutineDispatcher> blockingDispatcher;

    @NotNull
    private static final Qualified<FirebaseApp> firebaseApp;

    @NotNull
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;

    @NotNull
    private static final Qualified<SessionLifecycleServiceBinder> sessionLifecycleServiceBinder;

    @NotNull
    private static final Qualified<SessionsSettings> sessionsSettings;

    @NotNull
    private static final Qualified<TransportFactory> transportFactory;

    @Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000b0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\r0\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u00110\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00130\u00130\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m87232d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "()V", "LIBRARY_NAME", "", "backgroundDispatcher", "Lcom/google/firebase/components/Qualified;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "blockingDispatcher", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionLifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "transportFactory", "Lcom/google/android/datatransport/TransportFactory;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Qualified<FirebaseApp> qualifiedUnqualified = Qualified.unqualified(FirebaseApp.class);
        qualifiedUnqualified.getClass();
        firebaseApp = qualifiedUnqualified;
        Qualified<FirebaseInstallationsApi> qualifiedUnqualified2 = Qualified.unqualified(FirebaseInstallationsApi.class);
        qualifiedUnqualified2.getClass();
        firebaseInstallationsApi = qualifiedUnqualified2;
        Qualified<CoroutineDispatcher> qualified = Qualified.qualified(Background.class, CoroutineDispatcher.class);
        qualified.getClass();
        backgroundDispatcher = qualified;
        Qualified<CoroutineDispatcher> qualified2 = Qualified.qualified(Blocking.class, CoroutineDispatcher.class);
        qualified2.getClass();
        blockingDispatcher = qualified2;
        Qualified<TransportFactory> qualifiedUnqualified3 = Qualified.unqualified(TransportFactory.class);
        qualifiedUnqualified3.getClass();
        transportFactory = qualifiedUnqualified3;
        Qualified<SessionsSettings> qualifiedUnqualified4 = Qualified.unqualified(SessionsSettings.class);
        qualifiedUnqualified4.getClass();
        sessionsSettings = qualifiedUnqualified4;
        Qualified<SessionLifecycleServiceBinder> qualifiedUnqualified5 = Qualified.unqualified(SessionLifecycleServiceBinder.class);
        qualifiedUnqualified5.getClass();
        sessionLifecycleServiceBinder = qualifiedUnqualified5;
    }

    /* JADX INFO: renamed from: a */
    public static SessionDatastore m16866a(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        applicationContext.getClass();
        Object obj = componentContainer.get(backgroundDispatcher);
        obj.getClass();
        return new SessionDatastoreImpl(applicationContext, (CoroutineContext) obj);
    }

    /* JADX INFO: renamed from: b */
    public static SessionLifecycleServiceBinder m16867b(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        obj.getClass();
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    /* JADX INFO: renamed from: c */
    public static SessionsSettings m16868c(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        obj.getClass();
        Object obj2 = componentContainer.get(blockingDispatcher);
        obj2.getClass();
        Object obj3 = componentContainer.get(backgroundDispatcher);
        obj3.getClass();
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        obj4.getClass();
        return new SessionsSettings((FirebaseApp) obj, (CoroutineContext) obj2, (CoroutineContext) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* JADX INFO: renamed from: d */
    public static SessionFirelogPublisher m16869d(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        obj.getClass();
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        obj2.getClass();
        Object obj3 = componentContainer.get(sessionsSettings);
        obj3.getClass();
        Provider provider = componentContainer.getProvider(transportFactory);
        provider.getClass();
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        obj4.getClass();
        return new SessionFirelogPublisherImpl((FirebaseApp) obj, (FirebaseInstallationsApi) obj2, (SessionsSettings) obj3, eventGDTLogger, (CoroutineContext) obj4);
    }

    /* JADX INFO: renamed from: e */
    public static SessionGenerator m16870e(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, null, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public static FirebaseSessions m16871f(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        obj.getClass();
        Object obj2 = componentContainer.get(sessionsSettings);
        obj2.getClass();
        Object obj3 = componentContainer.get(backgroundDispatcher);
        obj3.getClass();
        Object obj4 = componentContainer.get(sessionLifecycleServiceBinder);
        obj4.getClass();
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (CoroutineContext) obj3, (SessionLifecycleServiceBinder) obj4);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        Component.Builder builderName = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder builderAdd = builderName.add(Dependency.required(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder builderAdd2 = builderAdd.add(Dependency.required(qualified2));
        Qualified<CoroutineDispatcher> qualified3 = backgroundDispatcher;
        Component componentBuild = builderAdd2.add(Dependency.required(qualified3)).add(Dependency.required(sessionLifecycleServiceBinder)).factory(new ComponentFactory() { // from class: l.pni
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.m16871f(componentContainer);
            }
        }).eagerInDefaultApp().build();
        Component componentBuild2 = Component.builder(SessionGenerator.class).name("session-generator").factory(new ComponentFactory() { // from class: l.qni
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.m16870e(componentContainer);
            }
        }).build();
        Component.Builder builderAdd3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        return CollectionsKt.listOf((Object[]) new Component[]{componentBuild, componentBuild2, builderAdd3.add(Dependency.required(qualified4)).add(Dependency.required(qualified2)).add(Dependency.requiredProvider(transportFactory)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: l.rni
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.m16869d(componentContainer);
            }
        }).build(), Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required(qualified)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(qualified3)).add(Dependency.required(qualified4)).factory(new ComponentFactory() { // from class: l.sni
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.m16868c(componentContainer);
            }
        }).build(), Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required(qualified)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: l.tni
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.m16866a(componentContainer);
            }
        }).build(), Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required(qualified)).factory(new ComponentFactory() { // from class: l.uni
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseSessionsRegistrar.m16867b(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME)});
    }
}
