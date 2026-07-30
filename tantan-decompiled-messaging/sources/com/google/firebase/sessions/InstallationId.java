package com.google.firebase.sessions;

import com.cosmos.photon.push.service.PushService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m87232d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", "Companion", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "InstallationId";

    @NotNull
    private final String authToken;

    @NotNull
    private final String fid;

    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m87232d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "()V", "TAG", "", PushService.COMMAND_CREATE, "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        
            if (r7 == r9) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object create(@org.jetbrains.annotations.NotNull com.google.firebase.installations.FirebaseInstallationsApi r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r9
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r9 = p149l.uwp.m196133e()
                int r1 = r0.label
                r2 = 0
                java.lang.String r3 = ""
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L41
                if (r1 == r5) goto L39
                if (r1 != r4) goto L33
                java.lang.Object r8 = r0.L$0
                java.lang.String r8 = (java.lang.String) r8
                kotlin.ResultKt.m87239b(r7)     // Catch: java.lang.Exception -> L7e
                goto L78
            L33:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p149l.qkq0.m175383a(r7)
                return r2
            L39:
                java.lang.Object r8 = r0.L$0
                com.google.firebase.installations.FirebaseInstallationsApi r8 = (com.google.firebase.installations.FirebaseInstallationsApi) r8
                kotlin.ResultKt.m87239b(r7)     // Catch: java.lang.Exception -> L64
                goto L57
            L41:
                kotlin.ResultKt.m87239b(r7)
                r7 = 0
                com.google.android.gms.tasks.Task r7 = r8.getToken(r7)     // Catch: java.lang.Exception -> L64
                r7.getClass()     // Catch: java.lang.Exception -> L64
                r0.L$0 = r8     // Catch: java.lang.Exception -> L64
                r0.label = r5     // Catch: java.lang.Exception -> L64
                java.lang.Object r7 = kotlinx.coroutines.tasks.TasksKt.m94393a(r7, r0)     // Catch: java.lang.Exception -> L64
                if (r7 != r9) goto L57
                goto L77
            L57:
                com.google.firebase.installations.InstallationTokenResult r7 = (com.google.firebase.installations.InstallationTokenResult) r7     // Catch: java.lang.Exception -> L64
                java.lang.String r7 = r7.getToken()     // Catch: java.lang.Exception -> L64
                r7.getClass()     // Catch: java.lang.Exception -> L64
                r6 = r8
                r8 = r7
                r7 = r6
                goto L66
            L64:
                r7 = r8
                r8 = r3
            L66:
                com.google.android.gms.tasks.Task r7 = r7.getId()     // Catch: java.lang.Exception -> L7e
                r7.getClass()     // Catch: java.lang.Exception -> L7e
                r0.L$0 = r8     // Catch: java.lang.Exception -> L7e
                r0.label = r4     // Catch: java.lang.Exception -> L7e
                java.lang.Object r7 = kotlinx.coroutines.tasks.TasksKt.m94393a(r7, r0)     // Catch: java.lang.Exception -> L7e
                if (r7 != r9) goto L78
            L77:
                return r9
            L78:
                r7.getClass()     // Catch: java.lang.Exception -> L7e
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L7e
                r3 = r7
            L7e:
                com.google.firebase.sessions.InstallationId r7 = new com.google.firebase.sessions.InstallationId
                r7.<init>(r3, r8, r2)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.create(com.google.firebase.installations.FirebaseInstallationsApi, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private Companion() {
        }
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getFid() {
        return this.fid;
    }

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
