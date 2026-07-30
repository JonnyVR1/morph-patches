package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.bui;
import p153l.j3g0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "", "<anonymous>", "(Ll/bui;I)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m88263f = "SharingStarted.kt", m88264l = {CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 176, 178, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 181}, m88265m = "invokeSuspend")
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<bui<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j3g0 this$0;

    public StartedWhileSubscribed$command$1(j3g0 j3g0Var, Continuation<? super StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull bui<? super SharingCommand> buiVar, int i, @Nullable Continuation<? super Unit> continuation) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(null, continuation);
        startedWhileSubscribed$command$1.L$0 = buiVar;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[PHI: r1
      0x0078: PHI (r1v4 l.bui) = (r1v3 l.bui), (r1v9 l.bui) binds: [B:27:0x0075, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[PHI: r1
      0x0087: PHI (r1v5 l.bui) = (r1v3 l.bui), (r1v4 l.bui), (r1v11 l.bui) binds: [B:25:0x0069, B:30:0x0084, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        bui buiVar;
        SharingCommand sharingCommand;
        long jM143350b;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            buiVar = (bui) this.L$0;
            if (this.I$0 > 0) {
                SharingCommand sharingCommand2 = SharingCommand.START;
                this.label = 1;
            } else {
                long jM143351c = j3g0.m143351c(null);
                this.L$0 = buiVar;
                this.label = 2;
                if (DelayKt.m94502b(jM143351c, this) != objM198688e) {
                    if (j3g0.m143350b(null) > 0) {
                        sharingCommand = SharingCommand.STOP;
                        this.L$0 = buiVar;
                        this.label = 3;
                        if (buiVar.emit(sharingCommand, this) != objM198688e) {
                            jM143350b = j3g0.m143350b(null);
                            this.L$0 = buiVar;
                            this.label = 4;
                            if (DelayKt.m94502b(jM143350b, this) != objM198688e) {
                                SharingCommand sharingCommand3 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                                this.L$0 = null;
                                this.label = 5;
                            }
                        }
                    } else {
                        SharingCommand sharingCommand4 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                        this.L$0 = null;
                        this.label = 5;
                    }
                }
            }
            return objM198688e;
        }
        if (i != 1) {
            if (i == 2) {
                buiVar = (bui) this.L$0;
                ResultKt.m88128b(obj);
                if (j3g0.m143350b(null) > 0) {
                    sharingCommand = SharingCommand.STOP;
                    this.L$0 = buiVar;
                    this.label = 3;
                    if (buiVar.emit(sharingCommand, this) != objM198688e) {
                        jM143350b = j3g0.m143350b(null);
                        this.L$0 = buiVar;
                        this.label = 4;
                        if (DelayKt.m94502b(jM143350b, this) != objM198688e) {
                        }
                    }
                }
                return objM198688e;
            }
            if (i == 3) {
                buiVar = (bui) this.L$0;
                ResultKt.m88128b(obj);
                jM143350b = j3g0.m143350b(null);
                this.L$0 = buiVar;
                this.label = 4;
                if (DelayKt.m94502b(jM143350b, this) != objM198688e) {
                }
                return objM198688e;
            }
            if (i == 4) {
                buiVar = (bui) this.L$0;
                ResultKt.m88128b(obj);
            } else if (i != 5) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SharingCommand sharingCommand5 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
            this.L$0 = null;
            this.label = 5;
        }
        ResultKt.m88128b(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(bui<? super SharingCommand> buiVar, Integer num, Continuation<? super Unit> continuation) {
        return invoke(buiVar, num.intValue(), continuation);
    }
}
