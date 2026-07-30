package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1", m88263f = "SuperLikeComboAnimView.kt", m88264l = {313}, m88265m = "invokeSuspend", m88266v = 1)
public final class SuperLikeComboAnimView$animIn$1$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFemale;
    int I$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$1 */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/bui;", "", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
    @DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$1", m88263f = "SuperLikeComboAnimView.kt", m88264l = {308, 309}, m88265m = "invokeSuspend", m88266v = 1)
    public static final class C90621 extends SuspendLambda implements Function2<bui<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $frameDuration;
        final /* synthetic */ boolean $isFemale;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C90621(boolean z, int i, Continuation<? super C90621> continuation) {
            super(2, continuation);
            this.$isFemale = z;
            this.$frameDuration = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90621 c90621 = new C90621(this.$isFemale, this.$frameDuration, continuation);
            c90621.L$0 = obj;
            return c90621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(bui<? super Integer> buiVar, Continuation<? super Unit> continuation) {
            return ((C90621) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0051  */
        /* JADX WARN: Code duplicated, block: B:19:0x006a A[PHI: r2 r5 r6 r10
          0x006a: PHI (r2v2 int) = (r2v3 int), (r2v6 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r5v1 int) = (r5v2 int), (r5v6 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r6v0 int) = (r6v2 int), (r6v4 int) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x006a: PHI (r10v7 int[]) = (r10v8 int[]), (r10v11 int[]) binds: [B:17:0x0067, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0082  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        
            if (kotlinx.coroutines.DelayKt.m94502b(r7, r9) == r1) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:22:0x0080). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int[] iArrM57005j;
            int length;
            int i;
            int i2;
            Integer numM88260b;
            bui buiVar = (bui) this.L$0;
            Object objM198688e = uyp.m198688e();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.m88128b(obj);
                iArrM57005j = this.$isFemale ? C9073a.INSTANCE.m57005j() : C9073a.INSTANCE.m57006k();
                length = iArrM57005j.length;
                i = 0;
                if (i < length) {
                    return Unit.INSTANCE;
                }
                i2 = iArrM57005j[i];
                numM88260b = Boxing.m88260b(i2);
                this.L$0 = buiVar;
                this.L$1 = iArrM57005j;
                this.I$0 = i;
                this.I$1 = length;
                this.I$2 = i2;
                this.label = 1;
                if (buiVar.emit(numM88260b, this) != objM198688e) {
                    long j = this.$frameDuration;
                    this.L$0 = buiVar;
                    this.L$1 = iArrM57005j;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.I$2 = i2;
                    this.label = 2;
                }
                return objM198688e;
            }
            if (i3 == 1) {
                int i4 = this.I$2;
                int i5 = this.I$1;
                int i6 = this.I$0;
                int[] iArr = (int[]) this.L$1;
                ResultKt.m88128b(obj);
                i2 = i4;
                length = i5;
                i = i6;
                iArrM57005j = iArr;
                long j2 = this.$frameDuration;
                this.L$0 = buiVar;
                this.L$1 = iArrM57005j;
                this.I$0 = i;
                this.I$1 = length;
                this.I$2 = i2;
                this.label = 2;
            } else {
                if (i3 != 2) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                length = this.I$1;
                i = this.I$0;
                int[] iArr2 = (int[]) this.L$1;
                ResultKt.m88128b(obj);
                iArrM57005j = iArr2;
            }
            i++;
            if (i < length) {
                return Unit.INSTANCE;
            }
            i2 = iArrM57005j[i];
            numM88260b = Boxing.m88260b(i2);
            this.L$0 = buiVar;
            this.L$1 = iArrM57005j;
            this.I$0 = i;
            this.I$1 = length;
            this.I$2 = i2;
            this.label = 1;
            if (buiVar.emit(numM88260b, this) != objM198688e) {
                long j3 = this.$frameDuration;
                this.L$0 = buiVar;
                this.L$1 = iArrM57005j;
                this.I$0 = i;
                this.I$1 = length;
                this.I$2 = i2;
                this.label = 2;
            }
            return objM198688e;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, ""}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$2", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
    public static final class C90632 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C90632(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super C90632> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90632 c90632 = new C90632(this.this$0, continuation);
            c90632.I$0 = ((Number) obj).intValue();
            return c90632;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((C90632) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.I$0;
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            this.this$0.get_superlike_foreground().setImageResource(i);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$animIn$1$1$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C9064a<T> implements bui {
        public static final C9064a<T> INSTANCE = new C9064a<>();

        /* JADX INFO: renamed from: a */
        public final Object m56976a(int i, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // p153l.bui
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m56976a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$animIn$1$1(boolean z, SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$animIn$1$1> continuation) {
        super(2, continuation);
        this.$isFemale = z;
        this.this$0 = superLikeComboAnimView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$animIn$1$1(this.$isFemale, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$animIn$1$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            aui auiVarM127468E = fui.m127468E(fui.m127499w(new C90621(this.$isFemale, 17, null)), new C90632(this.this$0, null));
            Object obj2 = C9064a.INSTANCE;
            this.I$0 = 17;
            this.label = 1;
            if (auiVarM127468E.collect(obj2, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
