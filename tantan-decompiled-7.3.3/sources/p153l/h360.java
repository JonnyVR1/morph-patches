package p153l;

import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public final class h360<T, V> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f107617a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, ? extends C22421c<V>> f107618b;

    /* JADX INFO: renamed from: l.h360$a */
    public class C17378a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C22508b f107619e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ are0 f107620f;

        /* JADX INFO: renamed from: l.h360$a$a */
        public class a implements qcj<V, T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f107622a;

            public a(Object obj) {
                this.f107622a = obj;
            }

            @Override // p153l.qcj
            public T call(V v2) {
                return (T) this.f107622a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17378a(gcg0 gcg0Var, C22508b c22508b, are0 are0Var) {
            super(gcg0Var);
            this.f107619e = c22508b;
            this.f107620f = are0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f107619e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f107620f.onError(th);
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
        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f107619e.onNext(h360.this.f107618b.call(t).take(1).defaultIfEmpty(null).map(new a(t)));
            } catch (Throwable th) {
                j6f.m143664f(th, this);
            }
        }
    }

    public h360(C22421c<? extends T> c22421c, qcj<? super T, ? extends C22421c<V>> qcjVar) {
        this.f107617a = c22421c;
        this.f107618b = qcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        are0 are0Var = new are0(gcg0Var);
        C22508b c22508bM222767b = C22508b.m222767b();
        gcg0Var.m129866b(C22421c.merge(c22508bM222767b).unsafeSubscribe(icg0.m139435b(are0Var)));
        return new C17378a(gcg0Var, c22508bM222767b, are0Var);
    }
}
