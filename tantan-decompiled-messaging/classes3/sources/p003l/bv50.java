package p003l;

import p014rx.C1099c;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class bv50<T, V> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f2510a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends C1099c<V>> f2511b;

    /* JADX INFO: renamed from: l.bv50$a */
    public class C0186a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1186b f2512e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f2513f;

        /* JADX INFO: renamed from: l.bv50$a$a */
        public class a implements w9j<V, T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f2515a;

            public a(Object obj) {
                this.f2515a = obj;
            }

            @Override // p003l.w9j
            public T call(V v2) {
                return (T) this.f2515a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0186a(z3g0 z3g0Var, C1186b c1186b, vie0 vie0Var) {
            super(z3g0Var);
            this.f2512e = c1186b;
            this.f2513f = vie0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f2512e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2513f.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f2512e.onNext(bv50.this.f2511b.call(t).take(1).defaultIfEmpty(null).map(new a(t)));
            } catch (Throwable th) {
                f5f.m3965f(th, this);
            }
        }
    }

    public bv50(C1099c<? extends T> c1099c, w9j<? super T, ? extends C1099c<V>> w9jVar) {
        this.f2510a = c1099c;
        this.f2511b = w9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        C1186b c1186bM9978b = C1186b.m9978b();
        z3g0Var.m9240b(C1099c.merge(c1186bM9978b).unsafeSubscribe(a4g0.m2742b(vie0Var)));
        return new C0186a(z3g0Var, c1186bM9978b, vie0Var);
    }
}
