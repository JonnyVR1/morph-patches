package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.p046p1.mobile.putong.data.Settings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.jh3;
import p149l.ppb;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m87232d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", Settings.TYPE, "Lcom/google/firebase/sessions/settings/SessionsSettings;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "lifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;)V", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "FirebaseSessions";

    @NotNull
    private final FirebaseApp firebaseApp;

    @NotNull
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "com.google.firebase.sessions.FirebaseSessions$1", m87374f = "FirebaseSessions.kt", m87375l = {45, 49}, m87376m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C32501 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $backgroundDispatcher;
        final /* synthetic */ SessionLifecycleServiceBinder $lifecycleServiceBinder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32501(CoroutineContext coroutineContext, SessionLifecycleServiceBinder sessionLifecycleServiceBinder, Continuation<? super C32501> continuation) {
            super(2, continuation);
            this.$backgroundDispatcher = coroutineContext;
            this.$lifecycleServiceBinder = sessionLifecycleServiceBinder;
        }

        /* JADX INFO: renamed from: h */
        public static void m16865h(String str, FirebaseOptions firebaseOptions) {
            SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FirebaseSessions.this.new C32501(this.$backgroundDispatcher, this.$lifecycleServiceBinder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32501) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r5.updateSettings(r4) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p149l.uwp.m196133e()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                kotlin.ResultKt.m87239b(r5)
                goto L66
            L12:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                p149l.qkq0.m175383a(r4)
                r4 = 0
                return r4
            L19:
                kotlin.ResultKt.m87239b(r5)
                goto L2b
            L1d:
                kotlin.ResultKt.m87239b(r5)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r5 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r4.label = r3
                java.lang.Object r5 = r5.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r4)
                if (r5 != r0) goto L2b
                goto L65
            L2b:
                java.util.Map r5 = (java.util.Map) r5
                java.util.Collection r5 = r5.values()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r1 = r5 instanceof java.util.Collection
                if (r1 == 0) goto L41
                r1 = r5
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L41
                goto L92
            L41:
                java.util.Iterator r5 = r5.iterator()
            L45:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L92
                java.lang.Object r1 = r5.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L45
                com.google.firebase.sessions.FirebaseSessions r5 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r5 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r5)
                r4.label = r2
                java.lang.Object r5 = r5.updateSettings(r4)
                if (r5 != r0) goto L66
            L65:
                return r0
            L66:
                com.google.firebase.sessions.FirebaseSessions r5 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r5 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r5)
                boolean r5 = r5.getSessionsEnabled()
                if (r5 != 0) goto L73
                goto L92
            L73:
                com.google.firebase.sessions.SessionLifecycleClient r5 = new com.google.firebase.sessions.SessionLifecycleClient
                kotlin.coroutines.CoroutineContext r0 = r4.$backgroundDispatcher
                r5.<init>(r0)
                com.google.firebase.sessions.SessionLifecycleServiceBinder r0 = r4.$lifecycleServiceBinder
                r5.bindToService(r0)
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE
                r0.setLifecycleClient(r5)
                com.google.firebase.sessions.FirebaseSessions r4 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.FirebaseApp r4 = com.google.firebase.sessions.FirebaseSessions.access$getFirebaseApp$p(r4)
                com.google.firebase.sessions.a r5 = new com.google.firebase.sessions.a
                r5.<init>()
                r4.addLifecycleEventListener(r5)
            L92:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.C32501.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "()V", "TAG", "", "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            obj.getClass();
            return (FirebaseSessions) obj;
        }

        private Companion() {
        }
    }

    public FirebaseSessions(@NotNull FirebaseApp firebaseApp, @NotNull SessionsSettings sessionsSettings, @NotNull CoroutineContext coroutineContext, @NotNull SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        firebaseApp.getClass();
        sessionsSettings.getClass();
        coroutineContext.getClass();
        sessionLifecycleServiceBinder.getClass();
        this.firebaseApp = firebaseApp;
        this.settings = sessionsSettings;
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.INSTANCE);
            jh3.m141367d(C15424f.m94055a(coroutineContext), null, null, new C32501(coroutineContext, sessionLifecycleServiceBinder, null), 3, null);
        } else {
            Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
