package p149l;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class lze {

    /* JADX INFO: renamed from: l.lze$a */
    public class C18360a implements rgy<cx3> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wem f130648a;

        public C18360a(wem wemVar) {
            this.f130648a = wemVar;
        }

        @Override // p149l.rgy
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo133253a(cx3 cx3Var) {
            this.f130648a.mo175144m(cx3Var);
        }

        @Override // p149l.rgy
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo133254b(cx3 cx3Var) {
            this.f130648a.mo175140i(cx3Var);
        }

        @Override // p149l.rgy
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo133255c(cx3 cx3Var) {
            this.f130648a.mo175132a(cx3Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public static gwm<cx3, PooledByteBuffer> m152344a(pgy<cx3, PooledByteBuffer> pgyVar, wem wemVar) {
        wemVar.mo175134c(pgyVar);
        return new gwm<>(pgyVar, new C18360a(wemVar));
    }
}
