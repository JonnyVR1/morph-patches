package com.clevertap.android.sdk.network;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.network.ContentFetchManager$handleContentFetch$1", m87374f = "ContentFetchManager.kt", m87375l = {55}, m87376m = "invokeSuspend")
public final class ContentFetchManager$handleContentFetch$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ JSONArray $contentFetchItems;
    final /* synthetic */ String $packageName;
    int label;
    final /* synthetic */ ContentFetchManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFetchManager$handleContentFetch$1(ContentFetchManager contentFetchManager, JSONArray jSONArray, String str, Continuation<? super ContentFetchManager$handleContentFetch$1> continuation) {
        super(2, continuation);
        this.this$0 = contentFetchManager;
        this.$contentFetchItems = jSONArray;
        this.$packageName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentFetchManager$handleContentFetch$1(this.this$0, this.$contentFetchItems, this.$packageName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((ContentFetchManager$handleContentFetch$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM6777k;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                JSONArray jSONArrayM6773e = this.this$0.m6773e(this.$contentFetchItems, this.$packageName);
                int length = jSONArrayM6773e.length();
                ContentFetchManager contentFetchManager = this.this$0;
                if (length > 0) {
                    this.label = 1;
                    objM6777k = contentFetchManager.m6777k(jSONArrayM6773e, this);
                    if (objM6777k == objM196133e) {
                        this = objM6777k;
                        return objM196133e;
                    }
                } else {
                    contentFetchManager.logger.verbose("ContentFetch", "No valid content fetch items to send.");
                    this = Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
                this = this;
            }
            this = objM6777k;
        } catch (CancellationException unused) {
            this.this$0.logger.verbose("ContentFetch", "Fetch job was cancelled.");
        } catch (Exception e) {
            this.this$0.logger.verbose("ContentFetch", "Unexpected error during content fetch", e);
        }
        return Unit.INSTANCE;
    }
}
