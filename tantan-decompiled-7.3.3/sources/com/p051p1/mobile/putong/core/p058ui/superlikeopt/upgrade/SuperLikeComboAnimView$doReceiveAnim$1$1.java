package com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade;

import com.alibaba.fastjson.asm.Opcodes;
import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
@DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1", m88263f = "SuperLikeComboAnimView.kt", m88264l = {Opcodes.IFNULL}, m88265m = "invokeSuspend", m88266v = 1)
final class SuperLikeComboAnimView$doReceiveAnim$1$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFemale;
    final /* synthetic */ int $received;
    int I$0;
    int label;
    final /* synthetic */ SuperLikeComboAnimView this$0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$1 */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/bui;", "", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
    @DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$1", m88263f = "SuperLikeComboAnimView.kt", m88264l = {192, 193}, m88265m = "invokeSuspend", m88266v = 1)
    public static final class C90681 extends SuspendLambda implements Function2<bui<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $frameDuration;
        final /* synthetic */ boolean $isFemale;
        final /* synthetic */ int $received;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C90681(int i, boolean z, int i2, Continuation<? super C90681> continuation) {
            super(2, continuation);
            this.$received = i;
            this.$isFemale = z;
            this.$frameDuration = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90681 c90681 = new C90681(this.$received, this.$isFemale, this.$frameDuration, continuation);
            c90681.L$0 = obj;
            return c90681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(bui<? super Integer> buiVar, Continuation<? super Unit> continuation) {
            return ((C90681) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0095 A[PHI: r2 r5 r6 r10
          0x0095: PHI (r2v4 int) = (r2v5 int), (r2v8 int) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r5v2 int) = (r5v3 int), (r5v7 int) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r6v0 int) = (r6v2 int), (r6v4 int) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0095: PHI (r10v16 int[]) = (r10v17 int[]), (r10v20 int[]) binds: [B:27:0x0092, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        
            if (kotlinx.coroutines.DelayKt.m94502b(r7, r9) == r1) goto L31;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a8 -> B:32:0x00ab). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int[] iArrM57003h;
            int length;
            int i;
            int i2;
            Integer numM88260b;
            bui buiVar = (bui) this.L$0;
            Object objM198688e = uyp.m198688e();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.m88128b(obj);
                int i4 = this.$received;
                if (i4 <= 3) {
                    iArrM57003h = this.$isFemale ? C9073a.INSTANCE.m56999d() : C9073a.INSTANCE.m57000e();
                } else {
                    boolean z = this.$isFemale;
                    if (i4 <= 6) {
                        iArrM57003h = z ? C9073a.INSTANCE.m57001f() : C9073a.INSTANCE.m57002g();
                    } else {
                        iArrM57003h = z ? C9073a.INSTANCE.m57003h() : C9073a.INSTANCE.m57004i();
                    }
                }
                length = iArrM57003h.length;
                i = 0;
                if (i < length) {
                    return Unit.INSTANCE;
                }
                i2 = iArrM57003h[i];
                numM88260b = Boxing.m88260b(i2);
                this.L$0 = buiVar;
                this.L$1 = iArrM57003h;
                this.I$0 = i;
                this.I$1 = length;
                this.I$2 = i2;
                this.label = 1;
                if (buiVar.emit(numM88260b, this) != objM198688e) {
                    long j = this.$frameDuration;
                    this.L$0 = buiVar;
                    this.L$1 = iArrM57003h;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.I$2 = i2;
                    this.label = 2;
                }
                return objM198688e;
            }
            if (i3 == 1) {
                int i5 = this.I$2;
                int i6 = this.I$1;
                int i7 = this.I$0;
                int[] iArr = (int[]) this.L$1;
                ResultKt.m88128b(obj);
                i2 = i5;
                length = i6;
                i = i7;
                iArrM57003h = iArr;
                long j2 = this.$frameDuration;
                this.L$0 = buiVar;
                this.L$1 = iArrM57003h;
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
                iArrM57003h = iArr2;
            }
            i++;
            if (i < length) {
                return Unit.INSTANCE;
            }
            i2 = iArrM57003h[i];
            numM88260b = Boxing.m88260b(i2);
            this.L$0 = buiVar;
            this.L$1 = iArrM57003h;
            this.I$0 = i;
            this.I$1 = length;
            this.I$2 = i2;
            this.label = 1;
            if (buiVar.emit(numM88260b, this) != objM198688e) {
                long j3 = this.$frameDuration;
                this.L$0 = buiVar;
                this.L$1 = iArrM57003h;
                this.I$0 = i;
                this.I$1 = length;
                this.I$2 = i2;
                this.label = 2;
            }
            return objM198688e;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, ""}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$2", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
    public static final class C90692 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ SuperLikeComboAnimView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C90692(SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super C90692> continuation) {
            super(2, continuation);
            this.this$0 = superLikeComboAnimView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90692 c90692 = new C90692(this.this$0, continuation);
            c90692.I$0 = ((Number) obj).intValue();
            return c90692;
        }

        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((C90692) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.get_receive_superlike_img().setImageResource(i);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$3 */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "", "", "cause", "", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
    @DebugMetadata(m88262c = "com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$3", m88263f = "SuperLikeComboAnimView.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
    public static final class C90703 extends SuspendLambda implements Function3<bui<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
        int label;

        public C90703(Continuation<? super C90703> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(bui<? super Integer> buiVar, Throwable th, Continuation<? super Unit> continuation) {
            return new C90703(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label == 0) {
                ResultKt.m88128b(obj);
                return Unit.INSTANCE;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView$doReceiveAnim$1$1$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C9071a<T> implements bui {
        public static final C9071a<T> INSTANCE = new C9071a<>();

        /* JADX INFO: renamed from: a */
        public final Object m56978a(int i, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Override // p153l.bui
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m56978a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperLikeComboAnimView$doReceiveAnim$1$1(int i, boolean z, SuperLikeComboAnimView superLikeComboAnimView, Continuation<? super SuperLikeComboAnimView$doReceiveAnim$1$1> continuation) {
        super(2, continuation);
        this.$received = i;
        this.$isFemale = z;
        this.this$0 = superLikeComboAnimView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuperLikeComboAnimView$doReceiveAnim$1$1(this.$received, this.$isFemale, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((SuperLikeComboAnimView$doReceiveAnim$1$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            aui auiVarM127482f = fui.m127482f(fui.m127468E(fui.m127499w(new C90681(this.$received, this.$isFemale, 17, null)), new C90692(this.this$0, null)), new C90703(null));
            Object obj2 = C9071a.INSTANCE;
            this.I$0 = 17;
            this.label = 1;
            if (auiVarM127482f.collect(obj2, this) == objM198688e) {
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
