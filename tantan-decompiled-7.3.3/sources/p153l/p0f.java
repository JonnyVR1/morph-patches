package p153l;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class p0f {

    /* JADX INFO: renamed from: l.p0f$a */
    public class C19263a implements opy<by3> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mhm f150044a;

        public C19263a(mhm mhmVar) {
            this.f150044a = mhmVar;
        }

        @Override // p153l.opy
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo142708a(by3 by3Var) {
            this.f150044a.mo122427m(by3Var);
        }

        @Override // p153l.opy
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo142709b(by3 by3Var) {
            this.f150044a.mo122423i(by3Var);
        }

        @Override // p153l.opy
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo142710c(by3 by3Var) {
            this.f150044a.mo122415a(by3Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public static hym<by3, PooledByteBuffer> m170052a(mpy<by3, PooledByteBuffer> mpyVar, mhm mhmVar) {
        mhmVar.mo122417c(mpyVar);
        return new hym<>(mpyVar, new C19263a(mhmVar));
    }
}
