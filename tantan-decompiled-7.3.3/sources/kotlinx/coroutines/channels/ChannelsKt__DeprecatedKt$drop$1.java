package kotlinx.coroutines.channels;

import com.alibaba.fastjson.asm.Opcodes;
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
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.el90;
import p153l.uke0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"E", "Ll/el90;", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m88263f = "Deprecated.kt", m88264l = {CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNONNULL, 200}, m88265m = "invokeSuspend")
@SourceDebugExtension
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: $n */
    final /* synthetic */ int f67421$n;
    final /* synthetic */ ReceiveChannel $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f67421$n = i;
        this.$this_drop = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f67421$n, this.$this_drop, continuation);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull el90 el90Var, @Nullable Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r9 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (r2.mo94679E(r9, r8) == r0) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a3 -> B:8:0x001d). Please report as a decompilation issue!!! */
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
        ChannelIterator it2;
        el90 el90Var3;
        Object objMo94807a;
        Object objM198688e = uyp.m198688e();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            el90Var = (el90) this.L$0;
            i = this.f67421$n;
            if (!(i >= 0)) {
                uke0.m196486a("Requested element count ", i, " is less than zero.");
                return null;
            }
            if (i > 0) {
                it = this.$this_drop.iterator();
                el90Var2 = el90Var;
                this.L$0 = el90Var2;
                this.L$1 = it;
                this.I$0 = i;
                this.label = 1;
                obj = it.mo94807a(this);
            } else {
                it2 = this.$this_drop.iterator();
            }
            this.L$0 = el90Var;
            this.L$1 = it2;
            this.label = 2;
            objMo94807a = it2.mo94807a(this);
            if (objMo94807a != objM198688e) {
                el90Var3 = el90Var;
                obj = objMo94807a;
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                Object next = it2.next();
                this.L$0 = el90Var3;
                this.L$1 = it2;
                this.label = 3;
            }
            return objM198688e;
        }
        if (i2 == 1) {
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            el90Var2 = (el90) this.L$0;
            ResultKt.m88128b(obj);
            if (((Boolean) obj).booleanValue()) {
                it.next();
                i--;
                if (i != 0) {
                    this.L$0 = el90Var2;
                    this.L$1 = it;
                    this.I$0 = i;
                    this.label = 1;
                    obj = it.mo94807a(this);
                }
                return objM198688e;
            }
            el90Var = el90Var2;
            it2 = this.$this_drop.iterator();
            this.L$0 = el90Var;
            this.L$1 = it2;
            this.label = 2;
            objMo94807a = it2.mo94807a(this);
            if (objMo94807a != objM198688e) {
                el90Var3 = el90Var;
                obj = objMo94807a;
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                Object next2 = it2.next();
                this.L$0 = el90Var3;
                this.L$1 = it2;
                this.label = 3;
            }
            return objM198688e;
        }
        if (i2 == 2) {
            it2 = (ChannelIterator) this.L$1;
            el90Var3 = (el90) this.L$0;
            ResultKt.m88128b(obj);
            if (((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            Object next3 = it2.next();
            this.L$0 = el90Var3;
            this.L$1 = it2;
            this.label = 3;
        } else {
            if (i2 != 3) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it2 = (ChannelIterator) this.L$1;
            el90Var3 = (el90) this.L$0;
            ResultKt.m88128b(obj);
        }
        el90Var = el90Var3;
        this.L$0 = el90Var;
        this.L$1 = it2;
        this.label = 2;
        objMo94807a = it2.mo94807a(this);
        if (objMo94807a != objM198688e) {
            el90Var3 = el90Var;
            obj = objMo94807a;
            if (((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            Object next4 = it2.next();
            this.L$0 = el90Var3;
            this.L$1 = it2;
            this.label = 3;
        }
        return objM198688e;
    }
}
