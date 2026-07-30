package com.clevertap.android.sdk.inbox;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.fetch.AbstractC1321a;
import com.clevertap.android.sdk.network.fetch.InboxDeleteCall;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p153l.axl;
import p153l.bu9;
import p153l.dl20;
import p153l.h1c;
import p153l.hxb0;
import p153l.oa5;
import p153l.r5e;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;
import p153l.yxb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m88121d2 = {"Lcom/clevertap/android/sdk/inbox/InboxDeleteCoordinator;", "", "Ll/dl20;", "networkScope", "Ll/yxb;", "ctApi", "Ll/hxb0;", "queueHeaderBuilder", "Lkotlin/Function0;", "Ll/h1c;", "dbAdapterProvider", "Ll/bu9;", "coreMetaData", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Ll/axl;", "logger", "Ll/oa5;", "clock", "Lkotlinx/coroutines/CoroutineDispatcher;", "httpDispatcher", "<init>", "(Ll/dl20;Ll/yxb;Ll/hxb0;Lkotlin/jvm/functions/Function0;Ll/bu9;Ljava/lang/String;Ll/axl;Ll/oa5;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "Lcom/clevertap/android/sdk/inbox/CTInboxMessage;", "messages", "userId", "", "f", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Ljava/lang/String;)V", "a", "Ll/dl20;", "b", "Ll/yxb;", "c", "Ll/hxb0;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function0;", "Ll/bu9;", "Ljava/lang/String;", "g", "Ll/axl;", "h", "Ll/oa5;", RXScreenCaptureService.KEY_INDEX, "Lkotlinx/coroutines/CoroutineDispatcher;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public final class InboxDeleteCoordinator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final dl20 networkScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final yxb ctApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final hxb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<h1c> dbAdapterProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String packageName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher httpDispatcher;

    public InboxDeleteCoordinator(@NotNull dl20 dl20Var, @NotNull yxb yxbVar, @NotNull hxb0 hxb0Var, @NotNull Function0<h1c> function0, @NotNull bu9 bu9Var, @NotNull String str, @NotNull axl axlVar, @NotNull oa5 oa5Var, @NotNull CoroutineDispatcher coroutineDispatcher) {
        dl20Var.getClass();
        yxbVar.getClass();
        hxb0Var.getClass();
        function0.getClass();
        bu9Var.getClass();
        str.getClass();
        axlVar.getClass();
        oa5Var.getClass();
        coroutineDispatcher.getClass();
        this.networkScope = dl20Var;
        this.ctApi = yxbVar;
        this.queueHeaderBuilder = hxb0Var;
        this.dbAdapterProvider = function0;
        this.coreMetaData = bu9Var;
        this.packageName = str;
        this.logger = axlVar;
        this.clock = oa5Var;
        this.httpDispatcher = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public final Object m6778f(List<? extends CTInboxMessage> list, String str, Continuation<? super Unit> continuation) throws Throwable {
        InboxDeleteCoordinator$runDelete$1 inboxDeleteCoordinator$runDelete$1;
        String str2;
        Object objMo6914a;
        List<? extends CTInboxMessage> list2;
        InboxDeleteCoordinator inboxDeleteCoordinator = this;
        if (continuation instanceof InboxDeleteCoordinator$runDelete$1) {
            inboxDeleteCoordinator$runDelete$1 = (InboxDeleteCoordinator$runDelete$1) continuation;
            int i = inboxDeleteCoordinator$runDelete$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inboxDeleteCoordinator$runDelete$1.label = i - Integer.MIN_VALUE;
            } else {
                inboxDeleteCoordinator$runDelete$1 = new InboxDeleteCoordinator$runDelete$1(inboxDeleteCoordinator, continuation);
            }
        } else {
            inboxDeleteCoordinator$runDelete$1 = new InboxDeleteCoordinator$runDelete$1(inboxDeleteCoordinator, continuation);
        }
        Object obj = inboxDeleteCoordinator$runDelete$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = inboxDeleteCoordinator$runDelete$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            InboxDeleteCall inboxDeleteCall = new InboxDeleteCall(inboxDeleteCoordinator.ctApi, inboxDeleteCoordinator.queueHeaderBuilder, list, inboxDeleteCoordinator.coreMetaData, inboxDeleteCoordinator.packageName, inboxDeleteCoordinator.logger, inboxDeleteCoordinator.clock, inboxDeleteCoordinator.httpDispatcher);
            inboxDeleteCoordinator$runDelete$1.L$0 = inboxDeleteCoordinator;
            inboxDeleteCoordinator$runDelete$1.L$1 = list;
            str2 = str;
            inboxDeleteCoordinator$runDelete$1.L$2 = str2;
            inboxDeleteCoordinator$runDelete$1.label = 1;
            objMo6914a = inboxDeleteCall.mo6914a(inboxDeleteCoordinator$runDelete$1);
            if (objMo6914a == objM198688e) {
                return objM198688e;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = (String) inboxDeleteCoordinator$runDelete$1.L$2;
            list2 = (List) inboxDeleteCoordinator$runDelete$1.L$1;
            InboxDeleteCoordinator inboxDeleteCoordinator2 = (InboxDeleteCoordinator) inboxDeleteCoordinator$runDelete$1.L$0;
            ResultKt.m88128b(obj);
            str2 = str3;
            inboxDeleteCoordinator = inboxDeleteCoordinator2;
            objMo6914a = obj;
        }
        if (((AbstractC1321a) objMo6914a) instanceof AbstractC1321a.c) {
            List<? extends CTInboxMessage> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((CTInboxMessage) it.next()).m6737e());
            }
            inboxDeleteCoordinator.dbAdapterProvider.invoke().m133288G(arrayList, str2);
            inboxDeleteCoordinator.logger.verbose("InboxV2", "syncDelete acked by server (n=" + arrayList.size() + ") — awaiting TTL");
        } else {
            inboxDeleteCoordinator.logger.verbose("InboxV2", "delete batch (n=" + list2.size() + ") did not confirm; will retry");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m6779e(@NotNull String userId) {
        userId.getClass();
        xh3.m210980d(this.networkScope.getCoroutineScope(), null, null, new InboxDeleteCoordinator$retryPending$1(this, userId, null), 3, null);
    }

    public /* synthetic */ InboxDeleteCoordinator(dl20 dl20Var, yxb yxbVar, hxb0 hxb0Var, Function0 function0, bu9 bu9Var, String str, axl axlVar, oa5 oa5Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dl20Var, yxbVar, hxb0Var, function0, bu9Var, str, axlVar, (i & 128) != 0 ? oa5.f145660a : oa5Var, (i & 256) != 0 ? r5e.m179861b() : coroutineDispatcher);
    }
}
