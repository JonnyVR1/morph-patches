package p149l;

import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes3.dex */
public final class bv50<T, V> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f77397a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends C22306c<V>> f77398b;

    /* JADX INFO: renamed from: l.bv50$a */
    public class C15979a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C22393b f77399e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f77400f;

        /* JADX INFO: renamed from: l.bv50$a$a */
        public class a implements w9j<V, T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f77402a;

            public a(Object obj) {
                this.f77402a = obj;
            }

            @Override // p149l.w9j
            public T call(V v2) {
                return (T) this.f77402a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15979a(z3g0 z3g0Var, C22393b c22393b, vie0 vie0Var) {
            super(z3g0Var);
            this.f77399e = c22393b;
            this.f77400f = vie0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f77399e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f77400f.onError(th);
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
        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f77399e.onNext(bv50.this.f77398b.call(t).take(1).defaultIfEmpty(null).map(new a(t)));
            } catch (Throwable th) {
                f5f.m119492f(th, this);
            }
        }
    }

    public bv50(C22306c<? extends T> c22306c, w9j<? super T, ? extends C22306c<V>> w9jVar) {
        this.f77397a = c22306c;
        this.f77398b = w9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        C22393b c22393bM221521b = C22393b.m221521b();
        z3g0Var.m217046b(C22306c.merge(c22393bM221521b).unsafeSubscribe(a4g0.m94918b(vie0Var)));
        return new C15979a(z3g0Var, c22393bM221521b, vie0Var);
    }
}
