package androidx.datastore.core;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.kum;
import p153l.uyp;
import p153l.w120;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JF\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m88121d2 = {"androidx/datastore/core/SingleProcessDataStore$readAndInit$api$1", "Ll/kum;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.KEY_T, "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class SingleProcessDataStore$readAndInit$api$1<T> implements kum<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w120 f1529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.BooleanRef f1530b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref.ObjectRef<T> f1531c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SingleProcessDataStore<T> f1532d;

    public SingleProcessDataStore$readAndInit$api$1(w120 w120Var, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f1529a = w120Var;
        this.f1530b = booleanRef;
        this.f1531c = objectRef;
        this.f1532d = singleProcessDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:35:0x00ae, B:37:0x00b6), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p153l.kum
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo1433a(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        w120 w120Var;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<T> objectRef;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        w120 w120Var2;
        w120 w120Var3;
        Ref.ObjectRef<T> objectRef2;
        SingleProcessDataStore singleProcessDataStore3;
        T t;
        if (continuation instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) continuation;
            int i = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, continuation);
            }
        } else {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, continuation);
        }
        Object obj = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
        try {
            if (i2 == 0) {
                ResultKt.m88128b(obj);
                w120Var = this.f1529a;
                booleanRef = this.f1530b;
                objectRef = this.f1531c;
                singleProcessDataStore = (SingleProcessDataStore<T>) this.f1532d;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = function2;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = w120Var;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = booleanRef;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = objectRef;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = singleProcessDataStore;
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 1;
                if (w120Var.mo95247c(null, singleProcessDataStore$readAndInit$api$1$updateData$1) != objM198688e) {
                }
                singleProcessDataStore2 = singleProcessDataStore;
                return objM198688e;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t = (T) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                    objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                    w120Var2 = (w120) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                    try {
                        ResultKt.m88128b(obj);
                        objectRef2.element = t;
                        T t2 = objectRef2.element;
                        w120Var2.mo95248d(null);
                        return t2;
                    } catch (Throwable th) {
                        th = th;
                        w120Var2.mo95248d(null);
                        throw th;
                    }
                }
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                objectRef2 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                w120Var3 = (w120) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                try {
                    ResultKt.m88128b(obj);
                    singleProcessDataStore3 = singleProcessDataStore4;
                    if (!Intrinsics.m88377d(obj, objectRef2.element)) {
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = w120Var3;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = objectRef2;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                        if (singleProcessDataStore3.m1425z(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) != objM198688e) {
                            t = (T) obj;
                            w120Var2 = w120Var3;
                            objectRef2.element = t;
                        }
                        singleProcessDataStore2 = singleProcessDataStore;
                        return objM198688e;
                    }
                    w120Var2 = w120Var3;
                    T t3 = objectRef2.element;
                    w120Var2.mo95248d(null);
                    return t3;
                } catch (Throwable th2) {
                    th = th2;
                    w120Var2 = w120Var3;
                    w120Var2.mo95248d(null);
                    throw th;
                }
            }
            SingleProcessDataStore singleProcessDataStore5 = (SingleProcessDataStore<T>) ((SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$4);
            Ref.ObjectRef<T> objectRef3 = (Ref.ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$3;
            booleanRef = (Ref.BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
            w120 w120Var4 = (w120) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
            Function2<? super T, ? super Continuation<? super T>, ? extends Object> function3 = (Function2) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
            ResultKt.m88128b(obj);
            objectRef = objectRef3;
            function2 = function3;
            w120Var = w120Var4;
            singleProcessDataStore2 = singleProcessDataStore5;
            singleProcessDataStore2 = singleProcessDataStore;
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            T t4 = objectRef.element;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = w120Var;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = objectRef;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = singleProcessDataStore2;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 2;
            Object objInvoke = function2.invoke(t4, singleProcessDataStore$readAndInit$api$1$updateData$1);
            if (objInvoke != objM198688e) {
                w120Var3 = w120Var;
                obj = objInvoke;
                objectRef2 = objectRef;
                singleProcessDataStore3 = singleProcessDataStore2;
                if (!Intrinsics.m88377d(obj, objectRef2.element)) {
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = w120Var3;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = objectRef2;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                    if (singleProcessDataStore3.m1425z(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) != objM198688e) {
                        t = (T) obj;
                        w120Var2 = w120Var3;
                        objectRef2.element = t;
                    }
                } else {
                    w120Var2 = w120Var3;
                }
                T t5 = objectRef2.element;
                w120Var2.mo95248d(null);
                return t5;
            }
            singleProcessDataStore2 = singleProcessDataStore;
            return objM198688e;
        } catch (Throwable th3) {
            th = th3;
            w120Var2 = w120Var;
            w120Var2.mo95248d(null);
            throw th;
        }
    }
}
