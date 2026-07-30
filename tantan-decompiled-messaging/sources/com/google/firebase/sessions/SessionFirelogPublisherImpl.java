package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p149l.jh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0011\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m87232d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "attemptLoggingSessionEvent", "", "sessionEvent", "Lcom/google/firebase/sessions/SessionEvent;", "logSession", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "shouldCollectEvents", "", "shouldLogSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    @NotNull
    private static final String TAG = "SessionFirelogPublisher";

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final EventGDTLoggerInterface eventGDTLogger;

    @NotNull
    private final FirebaseApp firebaseApp;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallations;

    @NotNull
    private final SessionsSettings sessionSettings;
    private static final double randomValueForSampling = Math.random();

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", m87374f = "SessionFirelogPublisher.kt", m87375l = {63, 64, 70}, m87376m = "invokeSuspend")
    public static final class C32551 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionDetails $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32551(SessionDetails sessionDetails, Continuation<? super C32551> continuation) {
            super(2, continuation);
            this.$sessionDetails = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new C32551(this.$sessionDetails, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32551) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            InstallationId installationId;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            SessionEvents sessionEvents;
            FirebaseApp firebaseApp;
            SessionDetails sessionDetails;
            SessionsSettings sessionsSettings;
            Object registeredSubscribers$com_google_firebase_firebase_sessions;
            InstallationId installationId2;
            SessionEvents sessionEvents2;
            SessionDetails sessionDetails2;
            SessionsSettings sessionsSettings2;
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = SessionFirelogPublisherImpl.this;
                this.label = 1;
                obj = sessionFirelogPublisherImpl2.shouldLogSession(this);
                if (obj != objM196133e) {
                }
                return objM196133e;
            }
            if (i == 1) {
                ResultKt.m87239b(obj);
            } else {
                if (i == 2) {
                    ResultKt.m87239b(obj);
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    sessionEvents = SessionEvents.INSTANCE;
                    firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != objM196133e) {
                        obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                        installationId2 = installationId;
                        sessionEvents2 = sessionEvents;
                        sessionDetails2 = sessionDetails;
                        sessionsSettings2 = sessionsSettings;
                    }
                    return objM196133e;
                }
                if (i != 3) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SessionsSettings sessionsSettings3 = (SessionsSettings) this.L$5;
                SessionDetails sessionDetails3 = (SessionDetails) this.L$4;
                FirebaseApp firebaseApp2 = (FirebaseApp) this.L$3;
                SessionEvents sessionEvents3 = (SessionEvents) this.L$2;
                sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$1;
                installationId2 = (InstallationId) this.L$0;
                ResultKt.m87239b(obj);
                sessionsSettings2 = sessionsSettings3;
                sessionEvents2 = sessionEvents3;
                sessionDetails2 = sessionDetails3;
                firebaseApp = firebaseApp2;
            }
            sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp, sessionDetails2, sessionsSettings2, (Map) obj, installationId2.getFid(), installationId2.getAuthToken()));
            return Unit.INSTANCE;
            if (((Boolean) obj).booleanValue()) {
                InstallationId.Companion companion = InstallationId.INSTANCE;
                FirebaseInstallationsApi firebaseInstallationsApi = SessionFirelogPublisherImpl.this.firebaseInstallations;
                this.label = 2;
                obj = companion.create(firebaseInstallationsApi, this);
                if (obj != objM196133e) {
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    sessionEvents = SessionEvents.INSTANCE;
                    firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != objM196133e) {
                        obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                        installationId2 = installationId;
                        sessionEvents2 = sessionEvents;
                        sessionDetails2 = sessionDetails;
                        sessionsSettings2 = sessionsSettings;
                        sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp, sessionDetails2, sessionsSettings2, (Map) obj, installationId2.getFid(), installationId2.getAuthToken()));
                    }
                }
                return objM196133e;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m87374f = "SessionFirelogPublisher.kt", m87375l = {EACTags.LOGIN_DATA}, m87376m = "shouldLogSession")
    public static final class C32561 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C32561(Continuation<? super C32561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull SessionsSettings sessionsSettings, @NotNull EventGDTLoggerInterface eventGDTLoggerInterface, @NotNull CoroutineContext coroutineContext) {
        firebaseApp.getClass();
        firebaseInstallationsApi.getClass();
        sessionsSettings.getClass();
        eventGDTLoggerInterface.getClass();
        coroutineContext.getClass();
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.sessionSettings = sessionsSettings;
        this.eventGDTLogger = eventGDTLoggerInterface;
        this.backgroundDispatcher = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
        } catch (RuntimeException e) {
            Log.e(TAG, "Error logging Session Start event to DataTransport: ", e);
        }
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object shouldLogSession(Continuation<? super Boolean> continuation) throws Throwable {
        C32561 c32561;
        if (continuation instanceof C32561) {
            c32561 = (C32561) continuation;
            int i = c32561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32561.label = i - Integer.MIN_VALUE;
            } else {
                c32561 = new C32561(continuation);
            }
        } else {
            c32561 = new C32561(continuation);
        }
        Object obj = c32561.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c32561.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            SessionsSettings sessionsSettings = this.sessionSettings;
            c32561.L$0 = this;
            c32561.label = 1;
            if (sessionsSettings.updateSettings(c32561) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (SessionFirelogPublisherImpl) c32561.L$0;
            ResultKt.m87239b(obj);
        }
        if (this.sessionSettings.getSessionsEnabled()) {
            return !this.shouldCollectEvents() ? Boxing.m87370a(false) : Boxing.m87370a(true);
        }
        return Boxing.m87370a(false);
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(@NotNull SessionDetails sessionDetails) {
        sessionDetails.getClass();
        jh3.m141367d(C15424f.m94055a(this.backgroundDispatcher), null, null, new C32551(sessionDetails, null), 3, null);
    }
}
