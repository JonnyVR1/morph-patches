package p153l;

import com.google.android.gms.internal.play_billing.C2400c;
import com.google.android.gms.internal.play_billing.zzdh;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p153l.mwt0;

/* JADX INFO: loaded from: classes6.dex */
public final class vzs0 {

    /* JADX INFO: renamed from: a */
    public static final Collector f186510a = Collector.of(new Supplier() { // from class: l.mks0
        @Override // java.util.function.Supplier
        public final Object get() {
            return new tjt0(4);
        }
    }, new BiConsumer() { // from class: l.ios0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((tjt0) obj).m191454e(obj2);
        }
    }, new BinaryOperator() { // from class: l.sps0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            tjt0 tjt0Var = (tjt0) obj;
            tjt0 tjt0Var2 = (tjt0) obj2;
            tjt0Var.m206164c(tjt0Var2.f188886a, tjt0Var2.f188887b);
            return tjt0Var;
        }
    }, new Function() { // from class: l.brs0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((tjt0) obj).m191455f();
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: l.yrs0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new mwt0();
            }
        }, new BiConsumer() { // from class: l.hts0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((mwt0) obj).m160597e(obj2);
            }
        }, new BinaryOperator() { // from class: l.pus0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                mwt0 mwt0Var = (mwt0) obj;
                mwt0 mwt0Var2 = (mwt0) obj2;
                mwt0Var.m206164c(mwt0Var2.f188886a, mwt0Var2.f188887b);
                return mwt0Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                mwt0 mwt0Var = (mwt0) obj;
                int i = mwt0Var.f188887b;
                if (i == 0) {
                    return zzdq.zza;
                }
                Object[] objArr = mwt0Var.f188886a;
                if (i == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new zzdt(obj2);
                }
                zzcv zzcvVarZzl = zzcv.zzl(i, objArr);
                mwt0Var.f188887b = zzcvVarZzl.size();
                mwt0Var.f188888c = true;
                return zzcvVarZzl;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: l.fxs0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C2400c();
            }
        }, new BiConsumer() { // from class: l.lys0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C2400c) obj).m14807a((zzdh) obj2);
            }
        }, new BinaryOperator() { // from class: l.sls0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C2400c c2400c = (C2400c) obj;
                c2400c.m14808b((C2400c) obj2);
                return c2400c;
            }
        }, new Function() { // from class: l.cns0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C2400c) obj).m14809c();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: a */
    public static Collector m204124a() {
        return f186510a;
    }
}
