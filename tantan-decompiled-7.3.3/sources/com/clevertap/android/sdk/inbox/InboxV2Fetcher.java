package com.clevertap.android.sdk.inbox;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.fetch.AbstractC1321a;
import com.clevertap.android.sdk.network.fetch.FetchTrigger;
import com.p051p1.mobile.putong.core.data.Trigger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.axl;
import p153l.ftm;
import p153l.nbr;
import p153l.q1f;
import p153l.uyp;
import p153l.whi;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001f¨\u0006!"}, m88121d2 = {"Lcom/clevertap/android/sdk/inbox/InboxV2Fetcher;", "", "Ll/q1f;", "Lorg/json/JSONObject;", "endpoint", "Ll/whi;", "throttle", "Ll/ftm;", "inboxV2Response", "Ll/axl;", "logger", "<init>", "(Ll/q1f;Ll/whi;Ll/ftm;Ll/axl;)V", "", "c", "()V", "Lcom/clevertap/android/sdk/network/fetch/FetchTrigger;", Trigger.TYPE, "Lcom/clevertap/android/sdk/network/fetch/a;", "a", "(Lcom/clevertap/android/sdk/network/fetch/FetchTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/q1f;", "b", "Ll/whi;", "Ll/ftm;", Constants.INAPP_DATA_TAG, "Ll/axl;", "", "e", "Z", "disabledForSession", "()Z", "isDisabledForSession", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class InboxV2Fetcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final q1f<JSONObject> endpoint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final whi throttle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ftm inboxV2Response;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private volatile boolean disabledForSession;

    public InboxV2Fetcher(@NotNull q1f<JSONObject> q1fVar, @NotNull whi whiVar, @NotNull ftm ftmVar, @NotNull axl axlVar) {
        q1fVar.getClass();
        whiVar.getClass();
        ftmVar.getClass();
        axlVar.getClass();
        this.endpoint = q1fVar;
        this.throttle = whiVar;
        this.inboxV2Response = ftmVar;
        this.logger = axlVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m6785a(@NotNull FetchTrigger fetchTrigger, @NotNull Continuation<? super AbstractC1321a<Unit>> continuation) throws Throwable {
        InboxV2Fetcher$fetch$1 inboxV2Fetcher$fetch$1;
        if (continuation instanceof InboxV2Fetcher$fetch$1) {
            inboxV2Fetcher$fetch$1 = (InboxV2Fetcher$fetch$1) continuation;
            int i = inboxV2Fetcher$fetch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inboxV2Fetcher$fetch$1.label = i - Integer.MIN_VALUE;
            } else {
                inboxV2Fetcher$fetch$1 = new InboxV2Fetcher$fetch$1(this, continuation);
            }
        } else {
            inboxV2Fetcher$fetch$1 = new InboxV2Fetcher$fetch$1(this, continuation);
        }
        Object objMo6914a = inboxV2Fetcher$fetch$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = inboxV2Fetcher$fetch$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objMo6914a);
            if (this.disabledForSession) {
                this.logger.verbose("InboxV2", "disabled for session — skipping");
                return AbstractC1321a.a.INSTANCE;
            }
            if (fetchTrigger == FetchTrigger.USER_INITIATED && this.throttle.m206355c()) {
                this.logger.verbose("InboxV2", "throttled");
                return AbstractC1321a.d.INSTANCE;
            }
            this.logger.verbose("InboxV2", "starting fetch (trigger=" + fetchTrigger + ')');
            q1f<JSONObject> q1fVar = this.endpoint;
            inboxV2Fetcher$fetch$1.L$0 = this;
            inboxV2Fetcher$fetch$1.L$1 = fetchTrigger;
            inboxV2Fetcher$fetch$1.label = 1;
            objMo6914a = q1fVar.mo6914a(inboxV2Fetcher$fetch$1);
            if (objMo6914a == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fetchTrigger = (FetchTrigger) inboxV2Fetcher$fetch$1.L$1;
            this = (InboxV2Fetcher) inboxV2Fetcher$fetch$1.L$0;
            ResultKt.m88128b(objMo6914a);
        }
        Object cVar = (AbstractC1321a) objMo6914a;
        if (fetchTrigger == FetchTrigger.USER_INITIATED && (cVar instanceof AbstractC1321a.c)) {
            this.throttle.m206353a();
        }
        if (cVar instanceof AbstractC1321a.c) {
            this.inboxV2Response.m127329d((JSONObject) ((AbstractC1321a.c) cVar).m6921a());
            cVar = new AbstractC1321a.c(Unit.INSTANCE);
        } else {
            Object obj = AbstractC1321a.a.INSTANCE;
            if (Intrinsics.m88377d(cVar, obj)) {
                this.disabledForSession = true;
                this.logger.verbose("InboxV2", "session disabled — subsequent calls will short-circuit");
            } else if (!(cVar instanceof AbstractC1321a.b)) {
                obj = AbstractC1321a.d.INSTANCE;
                if (!Intrinsics.m88377d(cVar, obj)) {
                    nbr.m162172a();
                    return null;
                }
            }
            cVar = obj;
        }
        this.logger.verbose("InboxV2", "fetch finished — " + Reflection.m88396b(cVar.getClass()).mo88360s());
        return cVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisabledForSession() {
        return this.disabledForSession;
    }

    /* JADX INFO: renamed from: c */
    public final void m6787c() {
        this.throttle.m206354b();
    }
}
