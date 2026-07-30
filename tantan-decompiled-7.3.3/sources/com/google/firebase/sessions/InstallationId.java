package com.google.firebase.sessions;

import com.cosmos.photon.push.service.PushService;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.tasks.TasksKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m88121d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", "Companion", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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

    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m88121d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "()V", "TAG", "", PushService.COMMAND_CREATE, "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(@NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull Continuation<? super InstallationId> continuation) throws Throwable {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            ?? r7;
            String str;
            if (continuation instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuation;
                int i = installationId$Companion$create$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label = i - Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
                }
            } else {
                installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
            }
            Object objM95286a = installationId$Companion$create$1.result;
            Object objM198688e = uyp.m198688e();
            int i2 = installationId$Companion$create$1.label;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "";
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.m88128b(objM95286a);
                        Task<InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                        token.getClass();
                        installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                        installationId$Companion$create$1.label = 1;
                        objM95286a = TasksKt.m95286a(token, installationId$Companion$create$1);
                        firebaseInstallationsApi = firebaseInstallationsApi;
                        if (objM95286a == objM198688e) {
                        }
                        return objM198688e;
                    }
                    if (i2 == 1) {
                        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                        ResultKt.m88128b(objM95286a);
                        firebaseInstallationsApi = firebaseInstallationsApi2;
                    } else {
                        if (i2 != 2) {
                            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str3 = (String) installationId$Companion$create$1.L$0;
                        ResultKt.m88128b(objM95286a);
                        firebaseInstallationsApi = str3;
                    }
                    objM95286a.getClass();
                    str2 = (String) objM95286a;
                    return new InstallationId(str2, firebaseInstallationsApi, defaultConstructorMarker);
                    String token2 = ((InstallationTokenResult) objM95286a).getToken();
                    token2.getClass();
                    ?? r6 = firebaseInstallationsApi;
                    str = token2;
                    r7 = r6;
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                r7 = firebaseInstallationsApi;
                str = "";
            }
            Task<String> id = r7.getId();
            id.getClass();
            installationId$Companion$create$1.L$0 = str;
            installationId$Companion$create$1.label = 2;
            objM95286a = TasksKt.m95286a(id, installationId$Companion$create$1);
            firebaseInstallationsApi = str;
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
