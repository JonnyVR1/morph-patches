package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.el90;
import p153l.uke0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"E", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m88263f = "Deprecated.kt", m88264l = {284, 285}, m88265m = "invokeSuspend")
@SourceDebugExtension
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: $n */
    final /* synthetic */ int f67422$n;
    final /* synthetic */ ReceiveChannel $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f67422$n = i;
        this.$this_take = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f67422$n, this.$this_take, continuation);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90 el90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r5.mo94679E(r8, r7) == r0) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0077 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        el90 el90Var;
        int i;
        ChannelIterator it;
        el90 el90Var2;
        Object objMo94807a;
        Object objM198688e = uyp.m198688e();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            el90Var = (el90) this.L$0;
            i = this.f67422$n;
            if (i == 0) {
                return Unit.INSTANCE;
            }
            if (!(i >= 0)) {
                uke0.m196486a("Requested element count ", i, " is less than zero.");
                return null;
            }
            it = this.$this_take.iterator();
            this.L$0 = el90Var;
            this.L$1 = it;
            this.I$0 = i;
            this.label = 1;
            objMo94807a = it.mo94807a(this);
            if (objMo94807a != objM198688e) {
                el90Var2 = el90Var;
                obj = objMo94807a;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                Object next = it.next();
                this.L$0 = el90Var2;
                this.L$1 = it;
                this.I$0 = i;
                this.label = 2;
            }
            return objM198688e;
        }
        if (i2 == 1) {
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            el90Var2 = (el90) this.L$0;
            ResultKt.m88128b(obj);
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            Object next2 = it.next();
            this.L$0 = el90Var2;
            this.L$1 = it;
            this.I$0 = i;
            this.label = 2;
        } else {
            if (i2 != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            el90Var2 = (el90) this.L$0;
            ResultKt.m88128b(obj);
        }
        el90Var = el90Var2;
        i--;
        if (i == 0) {
            return Unit.INSTANCE;
        }
        this.L$0 = el90Var;
        this.L$1 = it;
        this.I$0 = i;
        this.label = 1;
        objMo94807a = it.mo94807a(this);
        if (objMo94807a != objM198688e) {
            el90Var2 = el90Var;
            obj = objMo94807a;
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            Object next3 = it.next();
            this.L$0 = el90Var2;
            this.L$1 = it;
            this.I$0 = i;
            this.label = 2;
        }
        return objM198688e;
    }
}
