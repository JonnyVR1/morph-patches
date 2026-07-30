package com.clevertap.android.sdk.inapp.delay;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.delay.InAppScheduler;
import com.clevertap.android.sdk.inapp.delay.InAppTimerManager;
import com.momo.xeengine.gift.XEGiftErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.axl;
import p153l.ism;
import p153l.nbr;
import p153l.p7f;
import p153l.pqm;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(¨\u0006*"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", p7f.GPS_DIRECTION_TRUE, "", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager;", "timerManager", "Ll/ism;", "storageStrategy", "Ll/pqm;", "dataExtractor", "Ll/axl;", "logger", "", "accountId", "<init>", "(Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager;Ll/ism;Ll/pqm;Ll/axl;Ljava/lang/String;)V", "id", "", "delayInMs", "Lkotlin/Function1;", "", "onComplete", "f", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V", "", "Lorg/json/JSONObject;", "inApps", "e", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "c", "()I", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/clevertap/android/sdk/inapp/delay/InAppTimerManager;", "Ll/ism;", Constants.INAPP_DATA_TAG, "()Ll/ism;", "Ll/pqm;", "Ll/axl;", "Ljava/lang/String;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class InAppScheduler<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InAppTimerManager timerManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ism storageStrategy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final pqm<T> dataExtractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    public InAppScheduler(@NotNull InAppTimerManager inAppTimerManager, @NotNull ism ismVar, @NotNull pqm<T> pqmVar, @NotNull axl axlVar, @NotNull String str) {
        inAppTimerManager.getClass();
        ismVar.getClass();
        pqmVar.getClass();
        axlVar.getClass();
        str.getClass();
        this.timerManager = inAppTimerManager;
        this.storageStrategy = ismVar;
        this.dataExtractor = pqmVar;
        this.logger = axlVar;
        this.accountId = str;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6381a(InAppScheduler inAppScheduler, String str, Function1 function1, InAppTimerManager.AbstractC1251d abstractC1251d) {
        inAppScheduler.getClass();
        str.getClass();
        function1.getClass();
        abstractC1251d.getClass();
        if (abstractC1251d instanceof InAppTimerManager.AbstractC1251d.a) {
            JSONObject jSONObjectMo99522c = inAppScheduler.storageStrategy.mo99522c(str);
            pqm<T> pqmVar = inAppScheduler.dataExtractor;
            function1.invoke(jSONObjectMo99522c != null ? pqmVar.mo6411a(str, jSONObjectMo99522c) : pqmVar.mo6414d(str, "Data not found"));
            inAppScheduler.storageStrategy.mo99520a(str);
        } else if (abstractC1251d instanceof InAppTimerManager.AbstractC1251d.c) {
            pqm<T> pqmVar2 = inAppScheduler.dataExtractor;
            String message = ((InAppTimerManager.AbstractC1251d.c) abstractC1251d).getException().getMessage();
            if (message == null) {
                message = XEGiftErrorCode.ERROR_MSG_UNKNOWN;
            }
            function1.invoke(pqmVar2.mo6414d(str, message));
            inAppScheduler.storageStrategy.mo99520a(str);
        } else {
            if (!(abstractC1251d instanceof InAppTimerManager.AbstractC1251d.b)) {
                nbr.m162172a();
                return null;
            }
            function1.invoke(inAppScheduler.dataExtractor.mo6413c(str));
            inAppScheduler.storageStrategy.mo99520a(str);
            inAppScheduler.logger.verbose(inAppScheduler.accountId, "[InAppScheduler]: Timer discarded, cleaned up: ".concat(str));
        }
        return Unit.INSTANCE;
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    private final void m6382f(final String id, long delayInMs, final Function1<? super T, Unit> onComplete) {
        this.timerManager.m6403q(id, delayInMs, new Function1() { // from class: l.gsm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InAppScheduler.m6381a(this.f106311a, id, onComplete, (InAppTimerManager.AbstractC1251d) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m6383b(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        InAppScheduler$cancelAllScheduling$1 inAppScheduler$cancelAllScheduling$1;
        if (continuation instanceof InAppScheduler$cancelAllScheduling$1) {
            inAppScheduler$cancelAllScheduling$1 = (InAppScheduler$cancelAllScheduling$1) continuation;
            int i = inAppScheduler$cancelAllScheduling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inAppScheduler$cancelAllScheduling$1.label = i - Integer.MIN_VALUE;
            } else {
                inAppScheduler$cancelAllScheduling$1 = new InAppScheduler$cancelAllScheduling$1(this, continuation);
            }
        } else {
            inAppScheduler$cancelAllScheduling$1 = new InAppScheduler$cancelAllScheduling$1(this, continuation);
        }
        Object obj = inAppScheduler$cancelAllScheduling$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = inAppScheduler$cancelAllScheduling$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            InAppTimerManager inAppTimerManager = this.timerManager;
            inAppScheduler$cancelAllScheduling$1.L$0 = this;
            inAppScheduler$cancelAllScheduling$1.label = 1;
            if (inAppTimerManager.m6398k(inAppScheduler$cancelAllScheduling$1) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (InAppScheduler) inAppScheduler$cancelAllScheduling$1.L$0;
            ResultKt.m88128b(obj);
        }
        this.storageStrategy.mo99521b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final int m6384c() {
        return this.timerManager.m6399l();
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ism getStorageStrategy() {
        return this.storageStrategy;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void m6386e(@NotNull List<? extends JSONObject> inApps, @NotNull Function1<? super T, Unit> onComplete) {
        inApps.getClass();
        onComplete.getClass();
        this.logger.verbose(this.accountId, "[InAppScheduler]: Scheduling " + inApps.size() + " in-apps");
        ArrayList<JSONObject> arrayList = new ArrayList();
        for (T t : inApps) {
            String strOptString = ((JSONObject) t).optString(Constants.INAPP_ID_IN_PAYLOAD);
            InAppTimerManager inAppTimerManager = this.timerManager;
            strOptString.getClass();
            if (!inAppTimerManager.m6400m(strOptString)) {
                arrayList.add(t);
            }
        }
        if (!this.storageStrategy.mo99523d(arrayList)) {
            this.logger.verbose(this.accountId, "[InAppScheduler]: Failed to prepare in-apps for scheduling");
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                String strOptString2 = ((JSONObject) it.next()).optString(Constants.INAPP_ID_IN_PAYLOAD);
                pqm<T> pqmVar = this.dataExtractor;
                strOptString2.getClass();
                onComplete.invoke(pqmVar.mo6414d(strOptString2, "Preparation failed"));
            }
            return;
        }
        for (JSONObject jSONObject : arrayList) {
            String strOptString3 = jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD);
            long jMo6412b = this.dataExtractor.mo6412b(jSONObject);
            if (jMo6412b > 0) {
                strOptString3.getClass();
                m6382f(strOptString3, jMo6412b, onComplete);
            }
        }
    }
}
