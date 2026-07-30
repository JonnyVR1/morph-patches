package p149l;

import com.google.android.gms.internal.play_billing.C2377c;
import com.google.android.gms.internal.play_billing.zzdh;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p149l.gnt0;

/* JADX INFO: loaded from: classes6.dex */
public final class pqs0 {

    /* JADX INFO: renamed from: a */
    public static final Collector f150814a = Collector.of(new Supplier() { // from class: l.gbs0
        @Override // java.util.function.Supplier
        public final Object get() {
            return new nat0(4);
        }
    }, new BiConsumer() { // from class: l.cfs0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((nat0) obj).m158714e(obj2);
        }
    }, new BinaryOperator() { // from class: l.mgs0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            nat0 nat0Var = (nat0) obj;
            nat0 nat0Var2 = (nat0) obj2;
            nat0Var.m173173c(nat0Var2.f152957a, nat0Var2.f152958b);
            return nat0Var;
        }
    }, new Function() { // from class: l.vhs0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((nat0) obj).m158715f();
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: l.sis0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new gnt0();
            }
        }, new BiConsumer() { // from class: l.bks0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((gnt0) obj).m127188e(obj2);
            }
        }, new BinaryOperator() { // from class: l.jls0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                gnt0 gnt0Var = (gnt0) obj;
                gnt0 gnt0Var2 = (gnt0) obj2;
                gnt0Var.m173173c(gnt0Var2.f152957a, gnt0Var2.f152958b);
                return gnt0Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                gnt0 gnt0Var = (gnt0) obj;
                int i = gnt0Var.f152958b;
                if (i == 0) {
                    return zzdq.zza;
                }
                Object[] objArr = gnt0Var.f152957a;
                if (i == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new zzdt(obj2);
                }
                zzcv zzcvVarZzl = zzcv.zzl(i, objArr);
                gnt0Var.f152958b = zzcvVarZzl.size();
                gnt0Var.f152959c = true;
                return zzcvVarZzl;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: l.zns0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C2377c();
            }
        }, new BiConsumer() { // from class: l.fps0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C2377c) obj).m14753a((zzdh) obj2);
            }
        }, new BinaryOperator() { // from class: l.mcs0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C2377c c2377c = (C2377c) obj;
                c2377c.m14754b((C2377c) obj2);
                return c2377c;
            }
        }, new Function() { // from class: l.wds0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C2377c) obj).m14755c();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: a */
    public static Collector m170936a() {
        return f150814a;
    }
}
