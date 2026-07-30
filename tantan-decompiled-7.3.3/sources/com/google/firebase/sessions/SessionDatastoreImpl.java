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
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fui;
import p153l.hq80;
import p153l.hxd0;
import p153l.iq80;
import p153l.j0d0;
import p153l.jq80;
import p153l.o6c;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl;", "Lcom/google/firebase/sessions/SessionDatastore;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Ll/hq80;", hxd0.DEFAULT_FILE_NAME, "Lcom/google/firebase/sessions/FirebaseSessionsData;", "mapSessionsData", "(Ll/hq80;)Lcom/google/firebase/sessions/FirebaseSessionsData;", "", "sessionId", "", "updateSessionId", "(Ljava/lang/String;)V", "getCurrentSessionId", "()Ljava/lang/String;", "Landroid/content/Context;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "Ljava/util/concurrent/atomic/AtomicReference;", "Ll/aui;", "firebaseSessionDataFlow", "Ll/aui;", "Companion", "FirebaseSessionDataKeys", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
    private final aui<FirebaseSessionsData> firebaseSessionDataFlow;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final ReadOnlyProperty<Context, o6c<hq80>> dataStore$delegate = PreferenceDataStoreDelegateKt.m1435b(SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), new j0d0(new Function1<CorruptionException, hq80>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final hq80 invoke(@NotNull CorruptionException corruptionException) throws Throwable {
            corruptionException.getClass();
            ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
            return iq80.m141660a();
        }
    }), null, null, 12, null);

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
    @DebugMetadata(m88262c = "com.google.firebase.sessions.SessionDatastoreImpl$1", m88263f = "SessionDatastore.kt", m88264l = {EACTags.COMMAND_TO_PERFORM}, m88265m = "invokeSuspend")
    public static final class C32751 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        int label;

        public C32751(Continuation<? super C32751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new C32751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32751) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                aui auiVar = SessionDatastoreImpl.this.firebaseSessionDataFlow;
                final SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                bui buiVar = new bui() { // from class: com.google.firebase.sessions.SessionDatastoreImpl.1.1
                    @Nullable
                    public final Object emit(@NotNull FirebaseSessionsData firebaseSessionsData, @NotNull Continuation<? super Unit> continuation) {
                        sessionDatastoreImpl.currentSessionFromDatastore.set(firebaseSessionsData);
                        return Unit.INSTANCE;
                    }

                    @Override // p153l.bui
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((FirebaseSessionsData) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (auiVar.collect(buiVar, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "Ll/o6c;", "Ll/hq80;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)Ll/o6c;", "dataStore", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.m88404j(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o6c<hq80> getDataStore(Context context) {
            return (o6c) SessionDatastoreImpl.dataStore$delegate.mo1437a(context, $$delegatedProperties[0]);
        }

        private Companion() {
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$FirebaseSessionDataKeys;", "", "<init>", "()V", "Ll/hq80$a;", "", "SESSION_ID", "Ll/hq80$a;", "getSESSION_ID", "()Ll/hq80$a;", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class FirebaseSessionDataKeys {

        @NotNull
        public static final FirebaseSessionDataKeys INSTANCE = new FirebaseSessionDataKeys();

        @NotNull
        private static final hq80.C17536a<String> SESSION_ID = jq80.m146565f("session_id");

        private FirebaseSessionDataKeys() {
        }

        @NotNull
        public final hq80.C17536a<String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
    @DebugMetadata(m88262c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", m88263f = "SessionDatastore.kt", m88264l = {89}, m88265m = "invokeSuspend")
    public static final class C32771 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m88121d2 = {"<anonymous>", "", hxd0.DEFAULT_FILE_NAME, "Landroidx/datastore/preferences/core/MutablePreferences;"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
        @DebugMetadata(m88262c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", m88263f = "SessionDatastore.kt", m88264l = {}, m88265m = "invokeSuspend")
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
                uyp.m198688e();
                if (this.label != 0) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
                ((MutablePreferences) this.L$0).m1487j(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID(), this.$sessionId);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32771(String str, Continuation<? super C32771> continuation) {
            super(2, continuation);
            this.$sessionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new C32771(this.$sessionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32771) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.m88128b(obj);
                    o6c dataStore = SessionDatastoreImpl.Companion.getDataStore(SessionDatastoreImpl.this.context);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, null);
                    this.label = 1;
                    if (PreferencesKt.m1490a(dataStore, anonymousClass1, this) == objM198688e) {
                        return objM198688e;
                    }
                } else {
                    if (i != 1) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m88128b(obj);
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
        final aui auiVarM127482f = fui.m127482f(Companion.getDataStore(context).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1(null));
        this.firebaseSessionDataFlow = new aui<FirebaseSessionsData>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2 */
            @Metadata(m88120d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/lvi", "<anonymous>"}, m88122k = 3, m88123mv = {1, 8, 0})
            @SourceDebugExtension
            public static final class C32762<T> implements bui {
                final /* synthetic */ bui $this_unsafeFlow;
                final /* synthetic */ SessionDatastoreImpl this$0;

                /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
                @DebugMetadata(m88262c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", m88263f = "SessionDatastore.kt", m88264l = {223}, m88265m = "emit")
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
                        return C32762.this.emit(null, this);
                    }
                }

                public C32762(bui buiVar, SessionDatastoreImpl sessionDatastoreImpl) {
                    this.$this_unsafeFlow = buiVar;
                    this.this$0 = sessionDatastoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p153l.bui
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
                    Object objM198688e = uyp.m198688e();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.m88128b(obj2);
                        bui buiVar = this.$this_unsafeFlow;
                        FirebaseSessionsData firebaseSessionsDataMapSessionsData = this.this$0.mapSessionsData((hq80) obj);
                        anonymousClass1.label = 1;
                        if (buiVar.emit(firebaseSessionsDataMapSessionsData, anonymousClass1) == objM198688e) {
                            return objM198688e;
                        }
                    } else {
                        if (i2 != 1) {
                            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.m88128b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p153l.aui
            @Nullable
            public Object collect(@NotNull bui<? super FirebaseSessionsData> buiVar, @NotNull Continuation continuation) {
                Object objCollect = auiVarM127482f.collect(new C32762(buiVar, this), continuation);
                return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
            }
        };
        xh3.m210980d(C15531f.m94947a(coroutineContext), null, null, new C32751(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseSessionsData mapSessionsData(hq80 preferences) {
        return new FirebaseSessionsData((String) preferences.mo1481b(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID()));
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
        xh3.m210980d(C15531f.m94947a(this.backgroundDispatcher), null, null, new C32771(sessionId, null), 3, null);
    }
}
