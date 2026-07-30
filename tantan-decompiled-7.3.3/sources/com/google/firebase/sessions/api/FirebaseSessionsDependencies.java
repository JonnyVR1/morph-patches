package com.google.firebase.sessions.api;

import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.w120;
import p153l.wg3;
import p153l.wmw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\r\u0010\u0017\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t\u0018\u00010\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m88121d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "()V", "TAG", "", "dependencies", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "kotlin.jvm.PlatformType", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "addDependency", "", "subscriberName", "getDependency", "getRegisteredSubscribers", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriber", "getSubscriber$com_google_firebase_firebase_sessions", "register", "subscriber", "reset", "reset$com_google_firebase_firebase_sessions", "Dependency", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FirebaseSessionsDependencies {

    @NotNull
    private static final String TAG = "SessionsDependencies";

    @NotNull
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    private FirebaseSessionsDependencies() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void addDependency(@NotNull SessionSubscriber.Name subscriberName) {
        subscriberName.getClass();
        if (subscriberName == SessionSubscriber.Name.PERFORMANCE) {
            wg3.m206174a("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
            return;
        }
        Map<SessionSubscriber.Name, Dependency> map = dependencies;
        if (map.containsKey(subscriberName)) {
            Objects.toString(subscriberName);
            return;
        }
        map.getClass();
        map.put(subscriberName, new Dependency(MutexKt.m95254a(true), null, 2, 0 == true ? 1 : 0));
        Objects.toString(subscriberName);
    }

    private final Dependency getDependency(SessionSubscriber.Name subscriberName) {
        Map<SessionSubscriber.Name, Dependency> map = dependencies;
        map.getClass();
        Dependency dependency = map.get(subscriberName);
        if (dependency != null) {
            return dependency;
        }
        wmw.m207134a("Cannot get dependency ", subscriberName, ". Dependencies should be added at class load time.");
        return null;
    }

    @JvmStatic
    public static final void register(@NotNull SessionSubscriber subscriber) {
        subscriber.getClass();
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            Objects.toString(sessionSubscriberName);
            return;
        }
        dependency.setSubscriber(subscriber);
        Objects.toString(sessionSubscriberName);
        w120.C20991a.m204375a(dependency.getMutex(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009d -> B:27:0x009e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r10
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r10 = p153l.uyp.m198688e()
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L46
            if (r1 != r2) goto L40
            java.lang.Object r1 = r0.L$5
            java.lang.Object r4 = r0.L$4
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$3
            l.w120 r5 = (p153l.w120) r5
            java.lang.Object r6 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r6 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r6
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$0
            java.util.Map r8 = (java.util.Map) r8
            kotlin.ResultKt.m88128b(r9)
            goto L9e
        L40:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r9)
            return r3
        L46:
            kotlin.ResultKt.m88128b(r9)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r9 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            r9.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = kotlin.collections.MapsKt.mapCapacity(r4)
            r1.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r7 = r9
            r4 = r1
        L67:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lb1
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            r6 = r5
            com.google.firebase.sessions.api.SessionSubscriber$Name r6 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r6
            java.lang.Object r9 = r9.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r9 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r9
            l.w120 r5 = r9.getMutex()
            r0.L$0 = r4
            r0.L$1 = r7
            r0.L$2 = r6
            r0.L$3 = r5
            r0.L$4 = r4
            r0.L$5 = r1
            r0.label = r2
            java.lang.Object r9 = r5.mo95247c(r3, r0)
            if (r9 != r10) goto L9d
            return r10
        L9d:
            r8 = r4
        L9e:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r9 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lac
            com.google.firebase.sessions.api.SessionSubscriber r9 = r9.getSubscriber$com_google_firebase_firebase_sessions(r6)     // Catch: java.lang.Throwable -> Lac
            r5.mo95248d(r3)
            r4.put(r1, r9)
            r4 = r8
            goto L67
        Lac:
            r9 = move-exception
            r5.mo95248d(r3)
            throw r9
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @VisibleForTesting
    @NotNull
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber.Name subscriberName) {
        subscriberName.getClass();
        SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        wmw.m207134a("Subscriber ", subscriberName, " has not been registered.");
        return null;
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }

    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "Ll/w120;", "mutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "<init>", "(Ll/w120;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "()Ll/w120;", "component2", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", Constants.COPY_TYPE, "(Ll/w120;Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll/w120;", "getMutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final /* data */ class Dependency {

        @NotNull
        private final w120 mutex;

        @Nullable
        private SessionSubscriber subscriber;

        public Dependency(@NotNull w120 w120Var, @Nullable SessionSubscriber sessionSubscriber) {
            w120Var.getClass();
            this.mutex = w120Var;
            this.subscriber = sessionSubscriber;
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, w120 w120Var, SessionSubscriber sessionSubscriber, int i, Object obj) {
            if ((i & 1) != 0) {
                w120Var = dependency.mutex;
            }
            if ((i & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(w120Var, sessionSubscriber);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final w120 getMutex() {
            return this.mutex;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        @NotNull
        public final Dependency copy(@NotNull w120 mutex, @Nullable SessionSubscriber subscriber) {
            mutex.getClass();
            return new Dependency(mutex, subscriber);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return Intrinsics.m88377d(this.mutex, dependency.mutex) && Intrinsics.m88377d(this.subscriber, dependency.subscriber);
        }

        @NotNull
        public final w120 getMutex() {
            return this.mutex;
        }

        @Nullable
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(@Nullable SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        @NotNull
        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        public /* synthetic */ Dependency(w120 w120Var, SessionSubscriber sessionSubscriber, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(w120Var, (i & 2) != 0 ? null : sessionSubscriber);
        }
    }
}
