package com.google.firebase.sessions;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.SessionEvent;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m87232d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "(Lcom/google/firebase/inject/Provider;)V", "encode", "", "value", "Lcom/google/firebase/sessions/SessionEvent;", "log", "", "sessionEvent", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class EventGDTLogger implements EventGDTLoggerInterface {

    @NotNull
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";

    @NotNull
    private static final String TAG = "EventGDTLogger";

    @NotNull
    private final Provider<TransportFactory> transportFactoryProvider;

    public EventGDTLogger(@NotNull Provider<TransportFactory> provider) {
        provider.getClass();
        this.transportFactoryProvider = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(SessionEvent value) {
        String strEncode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(value);
        strEncode.getClass();
        value.getEventType().name();
        byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(@NotNull SessionEvent sessionEvent) {
        sessionEvent.getClass();
        this.transportFactoryProvider.get().getTransport(AQS_LOG_SOURCE, SessionEvent.class, Encoding.m9292of("json"), new Transformer() { // from class: l.i3f
            @Override // com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                return this.f111282a.encode((SessionEvent) obj);
            }
        }).send(Event.ofData(sessionEvent));
    }
}
