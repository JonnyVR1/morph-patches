package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class uw50<T> implements C22306c.c<hri0<T>, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f178621a;

    /* JADX INFO: renamed from: l.uw50$a */
    public class C20530a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f178622e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20530a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f178622e = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f178622e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f178622e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f178622e.onNext(new hri0(uw50.this.f178621a.now(), t));
        }
    }

    public uw50(bud0 bud0Var) {
        this.f178621a = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super hri0<T>> z3g0Var) {
        return new C20530a(z3g0Var, z3g0Var);
    }
}
