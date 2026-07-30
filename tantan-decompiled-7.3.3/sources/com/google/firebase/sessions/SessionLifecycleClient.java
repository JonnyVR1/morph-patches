package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.go5;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001,\b\u0000\u0018\u0000 /2\u00020\u0001:\u00020/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", "", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "messageCode", "", "sendLifecycleEvent", "(I)V", "", "Landroid/os/Message;", "messages", "Lkotlinx/coroutines/o;", "sendLifecycleEvents", "(Ljava/util/List;)Lkotlinx/coroutines/o;", "msg", "sendMessageToServer", "(Landroid/os/Message;)V", "queueMessage", "", "drainQueue", "()Ljava/util/List;", "msgCode", "getLatestByCode", "(Ljava/util/List;I)Landroid/os/Message;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "sessionLifecycleServiceBinder", "bindToService", "(Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;)V", "foregrounded", "()V", "backgrounded", "Lkotlin/coroutines/CoroutineContext;", "Landroid/os/Messenger;", NotificationCompat.CATEGORY_SERVICE, "Landroid/os/Messenger;", "", "serviceBound", "Z", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "Ljava/util/concurrent/LinkedBlockingDeque;", "com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "serviceConnection", "Lcom/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1;", "Companion", "ClientUpdateHandler", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SessionLifecycleClient {
    private static final int MAX_QUEUED_MESSAGES = 20;

    @NotNull
    public static final String TAG = "SessionLifecycleClient";

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final LinkedBlockingDeque<Message> queuedMessages;

    @Nullable
    private Messenger service;
    private boolean serviceBound;

    @NotNull
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection;

    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "handleSessionUpdate", "sessionId", "", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class ClientUpdateHandler extends Handler {

        @NotNull
        private final CoroutineContext backgroundDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull CoroutineContext coroutineContext) {
            super(Looper.getMainLooper());
            coroutineContext.getClass();
            this.backgroundDispatcher = coroutineContext;
        }

        private final void handleSessionUpdate(String sessionId) {
            xh3.m210980d(C15531f.m94947a(this.backgroundDispatcher), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(sessionId, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            String string;
            msg.getClass();
            if (msg.what != 3) {
                msg.toString();
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (string = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                string = "";
            }
            handleSessionUpdate(string);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
    @DebugMetadata(m88262c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", m88263f = "SessionLifecycleClient.kt", m88264l = {151}, m88265m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C32811 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Message> $messages;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32811(List<Message> list, Continuation<? super C32811> continuation) {
            super(2, continuation);
            this.$messages = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionLifecycleClient.this.new C32811(this.$messages, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32811) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.label = 1;
                obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                Collection collectionValues = map.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.filterNotNull(CollectionsKt.mutableListOf(SessionLifecycleClient.this.getLatestByCode(this.$messages, 2), SessionLifecycleClient.this.getLatestByCode(this.$messages, 1))), new Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return go5.m131087d(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
                                }
                            });
                            SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                            Iterator it2 = listSortedWith.iterator();
                            while (it2.hasNext()) {
                                sessionLifecycleClient.sendMessageToServer((Message) it2.next());
                            }
                            break;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(@NotNull CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.backgroundDispatcher = coroutineContext;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName className, @Nullable IBinder serviceBinder) {
                this.this$0.queuedMessages.size();
                this.this$0.service = new Messenger(serviceBinder);
                this.this$0.serviceBound = true;
                SessionLifecycleClient sessionLifecycleClient = this.this$0;
                sessionLifecycleClient.sendLifecycleEvents(sessionLifecycleClient.drainQueue());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName className) {
                this.this$0.service = null;
                this.this$0.serviceBound = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message getLatestByCode(List<Message> messages, int msgCode) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : messages) {
            if (((Message) obj2).what == msgCode) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void queueMessage(Message msg) {
        if (!this.queuedMessages.offer(msg)) {
            int i = msg.what;
        } else {
            int i2 = msg.what;
            this.queuedMessages.size();
        }
    }

    private final void sendLifecycleEvent(int messageCode) {
        List<Message> listDrainQueue = drainQueue();
        Message messageObtain = Message.obtain(null, messageCode, 0, 0);
        messageObtain.getClass();
        listDrainQueue.add(messageObtain);
        sendLifecycleEvents(listDrainQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC15593o sendLifecycleEvents(List<Message> messages) {
        return xh3.m210980d(C15531f.m94947a(this.backgroundDispatcher), null, null, new C32811(messages, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessageToServer(Message msg) {
        Messenger messenger = this.service;
        if (messenger == null) {
            queueMessage(msg);
            return;
        }
        try {
            int i = msg.what;
            if (messenger != null) {
                messenger.send(msg);
            }
        } catch (RemoteException unused) {
            int i2 = msg.what;
            queueMessage(msg);
        }
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    public final void bindToService(@NotNull SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        sessionLifecycleServiceBinder.getClass();
        sessionLifecycleServiceBinder.bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }
}
