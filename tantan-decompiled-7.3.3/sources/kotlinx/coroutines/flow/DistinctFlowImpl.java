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
import p153l.aui;
import p153l.bui;
import p153l.h350;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012:\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018RH\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, ShareConstants.OLD_VERSION, ShareConstants.NEW_VERSION, "", "areEquivalent", "<init>", "(Ll/aui;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ll/aui;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class DistinctFlowImpl<T> implements aui<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final aui<T> upstream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Function1<T, Object> keySelector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Function2<Object, Object, Boolean> areEquivalent;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2 */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C155332<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DistinctFlowImpl<T> f67471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<Object> f67472b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bui<T> f67473c;

        /* JADX WARN: Multi-variable type inference failed */
        public C155332(DistinctFlowImpl<T> distinctFlowImpl, Ref.ObjectRef<Object> objectRef, bui<? super T> buiVar) {
            this.f67471a = distinctFlowImpl;
            this.f67472b = objectRef;
            this.f67473c = buiVar;
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
        @Override // p153l.bui
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
            Object objM198688e = uyp.m198688e();
            int i2 = distinctFlowImpl$collect$2$emit$1.label;
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                T t2 = (T) this.f67471a.keySelector.invoke(t);
                Object obj2 = this.f67472b.element;
                if (obj2 != h350.f107614a && this.f67471a.areEquivalent.invoke(obj2, t2).booleanValue()) {
                    return Unit.INSTANCE;
                }
                this.f67472b.element = t2;
                bui<T> buiVar = this.f67473c;
                distinctFlowImpl$collect$2$emit$1.label = 1;
                if (buiVar.emit(t, distinctFlowImpl$collect$2$emit$1) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@NotNull aui<? extends T> auiVar, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.upstream = auiVar;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    @Override // p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) h350.f107614a;
        Object objCollect = this.upstream.collect(new C155332(this, objectRef, buiVar), continuation);
        return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
    }
}
