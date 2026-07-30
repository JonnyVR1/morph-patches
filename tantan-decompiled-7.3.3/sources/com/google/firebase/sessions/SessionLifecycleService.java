package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "()V", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "messageHandler", "Lcom/google/firebase/sessions/SessionLifecycleService$MessageHandler;", "messenger", "Landroid/os/Messenger;", "getClientCallback", "intent", "Landroid/content/Intent;", "onBind", "Landroid/os/IBinder;", "onCreate", "", "onDestroy", "Companion", "MessageHandler", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class SessionLifecycleService extends Service {
    public static final int BACKGROUNDED = 2;
    private static final int CLIENT_BOUND = 4;

    @NotNull
    public static final String CLIENT_CALLBACK_MESSENGER = "ClientCallbackMessenger";
    public static final int FOREGROUNDED = 1;
    public static final int SESSION_UPDATED = 3;

    @NotNull
    public static final String SESSION_UPDATE_EXTRA = "SessionUpdateExtra";

    @NotNull
    public static final String TAG = "SessionLifecycleService";

    @NotNull
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");

    @Nullable
    private MessageHandler messageHandler;

    @Nullable
    private Messenger messenger;

    @Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$MessageHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "boundClients", "Ljava/util/ArrayList;", "Landroid/os/Messenger;", "Lkotlin/collections/ArrayList;", "hasForegrounded", "", "lastMsgTimeMs", "", "broadcastSession", "", "handleBackgrounding", "msg", "Landroid/os/Message;", "handleClientBound", "handleForegrounding", "handleMessage", "isSessionRestart", "foregroundTimeMs", "maybeSendSessionToClient", "client", "newSession", "sendSessionToClient", "sessionId", "", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class MessageHandler extends Handler {

        @NotNull
        private final ArrayList<Messenger> boundClients;
        private boolean hasForegrounded;
        private long lastMsgTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageHandler(@NotNull Looper looper) {
            super(looper);
            looper.getClass();
            this.boundClients = new ArrayList<>();
        }

        private final void broadcastSession() {
            SessionFirelogPublisher.INSTANCE.getInstance().logSession(SessionGenerator.INSTANCE.getInstance().getCurrentSession());
            for (Messenger messenger : new ArrayList(this.boundClients)) {
                messenger.getClass();
                maybeSendSessionToClient(messenger);
            }
        }

        private final void handleBackgrounding(Message msg) {
            msg.getWhen();
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final void handleClientBound(Message msg) {
            this.boundClients.add(msg.replyTo);
            Messenger messenger = msg.replyTo;
            messenger.getClass();
            maybeSendSessionToClient(messenger);
            Objects.toString(msg.replyTo);
            msg.getWhen();
            this.boundClients.size();
        }

        private final void handleForegrounding(Message msg) {
            msg.getWhen();
            if (!this.hasForegrounded) {
                this.hasForegrounded = true;
                newSession();
            } else if (isSessionRestart(msg.getWhen())) {
                newSession();
            }
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final boolean isSessionRestart(long foregroundTimeMs) {
            return foregroundTimeMs - this.lastMsgTimeMs > Duration.m94426u(SessionsSettings.INSTANCE.getInstance().m225042getSessionRestartTimeoutUwyO8pc());
        }

        private final void maybeSendSessionToClient(Messenger client) {
            try {
                if (this.hasForegrounded) {
                    sendSessionToClient(client, SessionGenerator.INSTANCE.getInstance().getCurrentSession().getSessionId());
                    return;
                }
                String currentSessionId = SessionDatastore.INSTANCE.getInstance().getCurrentSessionId();
                if (currentSessionId != null) {
                    sendSessionToClient(client, currentSessionId);
                }
            } catch (IllegalStateException unused) {
            }
        }

        private final void newSession() {
            try {
                SessionGenerator.Companion companion = SessionGenerator.INSTANCE;
                companion.getInstance().generateNewSession();
                broadcastSession();
                SessionDatastore.INSTANCE.getInstance().updateSessionId(companion.getInstance().getCurrentSession().getSessionId());
            } catch (IllegalStateException unused) {
            }
        }

        private final void sendSessionToClient(Messenger client, String sessionId) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(SessionLifecycleService.SESSION_UPDATE_EXTRA, sessionId);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                client.send(messageObtain);
            } catch (DeadObjectException unused) {
                Objects.toString(client);
                this.boundClients.remove(client);
            } catch (Exception unused2) {
                Objects.toString(client);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            msg.getClass();
            if (this.lastMsgTimeMs > msg.getWhen()) {
                msg.getWhen();
                return;
            }
            int i = msg.what;
            if (i == 1) {
                handleForegrounding(msg);
                return;
            }
            if (i == 2) {
                handleBackgrounding(msg);
            } else if (i == 4) {
                handleClientBound(msg);
            } else {
                msg.toString();
                super.handleMessage(msg);
            }
        }
    }

    private final Messenger getClientCallback(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER, Messenger.class) : (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER);
    }

    @NotNull
    /* JADX INFO: renamed from: getHandlerThread$com_google_firebase_firebase_sessions, reason: from getter */
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger clientCallback = getClientCallback(intent);
        if (clientCallback != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = clientCallback;
            MessageHandler messageHandler = this.messageHandler;
            if (messageHandler != null) {
                messageHandler.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        looper.getClass();
        this.messageHandler = new MessageHandler(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
