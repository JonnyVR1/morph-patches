package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "uuidGenerator", "Lkotlin/Function0;", "Ljava/util/UUID;", "(Lcom/google/firebase/sessions/TimeProvider;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "Lcom/google/firebase/sessions/SessionDetails;", "currentSession", "getCurrentSession", "()Lcom/google/firebase/sessions/SessionDetails;", "firstSessionId", "", "hasGenerateSession", "", "getHasGenerateSession", "()Z", "sessionIndex", "", "generateNewSession", "generateSessionId", "Companion", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class SessionGenerator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private SessionDetails currentSession;

    @NotNull
    private final String firstSessionId;
    private int sessionIndex;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private final Function0<UUID> uuidGenerator;

    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/google/firebase/sessions/SessionGenerator$Companion;", "", "()V", "instance", "Lcom/google/firebase/sessions/SessionGenerator;", "getInstance", "()Lcom/google/firebase/sessions/SessionGenerator;", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SessionGenerator getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionGenerator.class);
            obj.getClass();
            return (SessionGenerator) obj;
        }

        private Companion() {
        }
    }

    public SessionGenerator(@NotNull TimeProvider timeProvider, @NotNull Function0<UUID> function0) {
        timeProvider.getClass();
        function0.getClass();
        this.timeProvider = timeProvider;
        this.uuidGenerator = function0;
        this.firstSessionId = generateSessionId();
        this.sessionIndex = -1;
    }

    private final String generateSessionId() {
        String string = this.uuidGenerator.invoke().toString();
        string.getClass();
        String lowerCase = C15493d.m94370F(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @NotNull
    public final SessionDetails generateNewSession() {
        int i = this.sessionIndex + 1;
        this.sessionIndex = i;
        this.currentSession = new SessionDetails(i == 0 ? this.firstSessionId : generateSessionId(), this.firstSessionId, this.sessionIndex, this.timeProvider.currentTimeUs());
        return getCurrentSession();
    }

    @NotNull
    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        Intrinsics.m88391r("currentSession");
        return null;
    }

    public final boolean getHasGenerateSession() {
        return this.currentSession != null;
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionGenerator$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    public /* synthetic */ class C32801 extends FunctionReferenceImpl implements Function0<UUID> {
        public static final C32801 INSTANCE = new C32801();

        public C32801() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, (i & 2) != 0 ? C32801.INSTANCE : function0);
    }
}
