package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p149l.ci80;
import p149l.di80;
import p149l.ei80;
import p149l.eri;
import p149l.esc0;
import p149l.fpd0;
import p149l.fri;
import p149l.i5c;
import p149l.j6f;
import p149l.jh3;
import p149l.jri;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m87232d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl;", "Lcom/google/firebase/sessions/SessionDatastore;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Ll/ci80;", fpd0.DEFAULT_FILE_NAME, "Lcom/google/firebase/sessions/FirebaseSessionsData;", "mapSessionsData", "(Ll/ci80;)Lcom/google/firebase/sessions/FirebaseSessionsData;", "", "sessionId", "", "updateSessionId", "(Ljava/lang/String;)V", "getCurrentSessionId", "()Ljava/lang/String;", "Landroid/content/Context;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "Ljava/util/concurrent/atomic/AtomicReference;", "Ll/eri;", "firebaseSessionDataFlow", "Ll/eri;", "Companion", "FirebaseSessionDataKeys", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SessionDatastoreImpl implements SessionDatastore {

    @NotNull
    private static final String TAG = "FirebaseSessionsRepo";

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicReference<FirebaseSessionsData> currentSessionFromDatastore;

    @NotNull
    private final eri<FirebaseSessionsData> firebaseSessionDataFlow;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final ReadOnlyProperty<Context, i5c<ci80>> dataStore$delegate = PreferenceDataStoreDelegateKt.m1434b(SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), new esc0(new Function1<CorruptionException, ci80>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ci80 invoke(@NotNull CorruptionException corruptionException) throws Throwable {
            corruptionException.getClass();
            ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
            return di80.m111869a();
        }
    }), null, null, 12, null);

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "com.google.firebase.sessions.SessionDatastoreImpl$1", m87374f = "SessionDatastore.kt", m87375l = {EACTags.COMMAND_TO_PERFORM}, m87376m = "invokeSuspend")
    public static final class C32521 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        int label;

        public C32521(Continuation<? super C32521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new C32521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32521) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                eri eriVar = SessionDatastoreImpl.this.firebaseSessionDataFlow;
                final SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                fri friVar = new fri() { // from class: com.google.firebase.sessions.SessionDatastoreImpl.1.1
                    @Nullable
                    public final Object emit(@NotNull FirebaseSessionsData firebaseSessionsData, @NotNull Continuation<? super Unit> continuation) {
                        sessionDatastoreImpl.currentSessionFromDatastore.set(firebaseSessionsData);
                        return Unit.INSTANCE;
                    }

                    @Override // p149l.fri
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((FirebaseSessionsData) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (eriVar.collect(friVar, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "Ll/i5c;", "Ll/ci80;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)Ll/i5c;", "dataStore", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.m87515j(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i5c<ci80> getDataStore(Context context) {
            return (i5c) SessionDatastoreImpl.dataStore$delegate.mo1436a(context, $$delegatedProperties[0]);
        }

        private Companion() {
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$FirebaseSessionDataKeys;", "", "<init>", "()V", "Ll/ci80$a;", "", "SESSION_ID", "Ll/ci80$a;", "getSESSION_ID", "()Ll/ci80$a;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class FirebaseSessionDataKeys {

        @NotNull
        public static final FirebaseSessionDataKeys INSTANCE = new FirebaseSessionDataKeys();

        @NotNull
        private static final ci80.C16162a<String> SESSION_ID = ei80.m116659f("session_id");

        private FirebaseSessionDataKeys() {
        }

        @NotNull
        public final ci80.C16162a<String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", m87374f = "SessionDatastore.kt", m87375l = {89}, m87376m = "invokeSuspend")
    public static final class C32541 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m87232d2 = {"<anonymous>", "", fpd0.DEFAULT_FILE_NAME, "Landroidx/datastore/preferences/core/MutablePreferences;"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
        @DebugMetadata(m87373c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", m87374f = "SessionDatastore.kt", m87375l = {}, m87376m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $sessionId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$sessionId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                uwp.m196133e();
                if (this.label != 0) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
                ((MutablePreferences) this.L$0).m1486j(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID(), this.$sessionId);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32541(String str, Continuation<? super C32541> continuation) {
            super(2, continuation);
            this.$sessionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new C32541(this.$sessionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32541) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.m87239b(obj);
                    i5c dataStore = SessionDatastoreImpl.Companion.getDataStore(SessionDatastoreImpl.this.context);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, null);
                    this.label = 1;
                    if (PreferencesKt.m1489a(dataStore, anonymousClass1, this) == objM196133e) {
                        return objM196133e;
                    }
                } else {
                    if (i != 1) {
                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m87239b(obj);
                }
            } catch (IOException e) {
                e.toString();
            }
            return Unit.INSTANCE;
        }
    }

    public SessionDatastoreImpl(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        context.getClass();
        coroutineContext.getClass();
        this.context = context;
        this.backgroundDispatcher = coroutineContext;
        this.currentSessionFromDatastore = new AtomicReference<>();
        final eri eriVarM142947f = jri.m142947f(Companion.getDataStore(context).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1(null));
        this.firebaseSessionDataFlow = new eri<FirebaseSessionsData>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2 */
            @Metadata(m87231d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/psi", "<anonymous>"}, m87233k = 3, m87234mv = {1, 8, 0})
            @SourceDebugExtension
            public static final class C32532<T> implements fri {
                final /* synthetic */ fri $this_unsafeFlow;
                final /* synthetic */ SessionDatastoreImpl this$0;

                /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
                @DebugMetadata(m87373c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", m87374f = "SessionDatastore.kt", m87375l = {223}, m87376m = "emit")
                @SourceDebugExtension
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C32532.this.emit(null, this);
                    }
                }

                public C32532(fri friVar, SessionDatastoreImpl sessionDatastoreImpl) {
                    this.$this_unsafeFlow = friVar;
                    this.this$0 = sessionDatastoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p149l.fri
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objM196133e = uwp.m196133e();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.m87239b(obj2);
                        fri friVar = this.$this_unsafeFlow;
                        FirebaseSessionsData firebaseSessionsDataMapSessionsData = this.this$0.mapSessionsData((ci80) obj);
                        anonymousClass1.label = 1;
                        if (friVar.emit(firebaseSessionsDataMapSessionsData, anonymousClass1) == objM196133e) {
                            return objM196133e;
                        }
                    } else {
                        if (i2 != 1) {
                            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.m87239b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p149l.eri
            @Nullable
            public Object collect(@NotNull fri<? super FirebaseSessionsData> friVar, @NotNull Continuation continuation) {
                Object objCollect = eriVarM142947f.collect(new C32532(friVar, this), continuation);
                return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
            }
        };
        jh3.m141367d(C15424f.m94055a(coroutineContext), null, null, new C32521(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseSessionsData mapSessionsData(ci80 preferences) {
        return new FirebaseSessionsData((String) preferences.mo1480b(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID()));
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    @Nullable
    public String getCurrentSessionId() {
        FirebaseSessionsData firebaseSessionsData = this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public void updateSessionId(@NotNull String sessionId) {
        sessionId.getClass();
        jh3.m141367d(C15424f.m94055a(this.backgroundDispatcher), null, null, new C32541(sessionId, null), 3, null);
    }
}
