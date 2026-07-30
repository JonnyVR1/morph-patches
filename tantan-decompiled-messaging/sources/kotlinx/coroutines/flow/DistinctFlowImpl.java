package kotlinx.coroutines.flow;

import com.facebook.AuthenticationTokenClaims;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.su40;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012:\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018RH\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, ShareConstants.OLD_VERSION, ShareConstants.NEW_VERSION, "", "areEquivalent", "<init>", "(Ll/eri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ll/eri;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class DistinctFlowImpl<T> implements eri<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eri<T> upstream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Function1<T, Object> keySelector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Function2<Object, Object, Boolean> areEquivalent;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2 */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C154262<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DistinctFlowImpl<T> f66797a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<Object> f66798b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fri<T> f66799c;

        /* JADX WARN: Multi-variable type inference failed */
        public C154262(DistinctFlowImpl<T> distinctFlowImpl, Ref.ObjectRef<Object> objectRef, fri<? super T> friVar) {
            this.f66797a = distinctFlowImpl;
            this.f66798b = objectRef;
            this.f66799c = friVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
                int i = distinctFlowImpl$collect$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
            }
            Object obj = distinctFlowImpl$collect$2$emit$1.result;
            Object objM196133e = uwp.m196133e();
            int i2 = distinctFlowImpl$collect$2$emit$1.label;
            if (i2 == 0) {
                ResultKt.m87239b(obj);
                T t2 = (T) this.f66797a.keySelector.invoke(t);
                Object obj2 = this.f66798b.element;
                if (obj2 != su40.f166433a && this.f66797a.areEquivalent.invoke(obj2, t2).booleanValue()) {
                    return Unit.INSTANCE;
                }
                this.f66798b.element = t2;
                fri<T> friVar = this.f66799c;
                distinctFlowImpl$collect$2$emit$1.label = 1;
                if (friVar.emit(t, distinctFlowImpl$collect$2$emit$1) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@NotNull eri<? extends T> eriVar, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.upstream = eriVar;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    @Override // p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) su40.f166433a;
        Object objCollect = this.upstream.collect(new C154262(this, objectRef, friVar), continuation);
        return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
    }
}
