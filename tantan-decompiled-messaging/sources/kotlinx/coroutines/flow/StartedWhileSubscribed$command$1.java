package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.avf0;
import p149l.fri;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"Ll/fri;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "", "<anonymous>", "(Ll/fri;I)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m87374f = "SharingStarted.kt", m87375l = {CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 176, 178, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 181}, m87376m = "invokeSuspend")
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<fri<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ avf0 this$0;

    public StartedWhileSubscribed$command$1(avf0 avf0Var, Continuation<? super StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull fri<? super SharingCommand> friVar, int i, @Nullable Continuation<? super Unit> continuation) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(null, continuation);
        startedWhileSubscribed$command$1.L$0 = friVar;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[PHI: r1
      0x0078: PHI (r1v4 l.fri) = (r1v3 l.fri), (r1v9 l.fri) binds: [B:27:0x0075, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[PHI: r1
      0x0087: PHI (r1v5 l.fri) = (r1v3 l.fri), (r1v4 l.fri), (r1v11 l.fri) binds: [B:25:0x0069, B:30:0x0084, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p149l.uwp.m196133e()
            int r1 = r10.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L3b
            if (r1 == r6) goto L37
            if (r1 == r5) goto L2f
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            goto L37
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r10)
            return r7
        L1f:
            java.lang.Object r1 = r10.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r11)
            goto L87
        L27:
            java.lang.Object r1 = r10.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r11)
            goto L78
        L2f:
            java.lang.Object r1 = r10.L$0
            l.fri r1 = (p149l.fri) r1
            kotlin.ResultKt.m87239b(r11)
            goto L61
        L37:
            kotlin.ResultKt.m87239b(r11)
            goto L94
        L3b:
            kotlin.ResultKt.m87239b(r11)
            java.lang.Object r11 = r10.L$0
            r1 = r11
            l.fri r1 = (p149l.fri) r1
            int r11 = r10.I$0
            if (r11 <= 0) goto L52
            kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.START
            r10.label = r6
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r0) goto L94
            goto L93
        L52:
            long r8 = p149l.avf0.m99177c(r7)
            r10.L$0 = r1
            r10.label = r5
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m93611b(r8, r10)
            if (r11 != r0) goto L61
            goto L93
        L61:
            long r5 = p149l.avf0.m99176b(r7)
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L87
            kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.STOP
            r10.L$0 = r1
            r10.label = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L78
            goto L93
        L78:
            long r4 = p149l.avf0.m99176b(r7)
            r10.L$0 = r1
            r10.label = r3
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m93611b(r4, r10)
            if (r11 != r0) goto L87
            goto L93
        L87:
            kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r10.L$0 = r7
            r10.label = r2
            java.lang.Object r10 = r1.emit(r11, r10)
            if (r10 != r0) goto L94
        L93:
            return r0
        L94:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(fri<? super SharingCommand> friVar, Integer num, Continuation<? super Unit> continuation) {
        return invoke(friVar, num.intValue(), continuation);
    }
}
