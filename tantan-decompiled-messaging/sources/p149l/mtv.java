package p149l;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class mtv implements sc90<jze> {

    /* JADX INFO: renamed from: a */
    public final Executor f135698a;

    /* JADX INFO: renamed from: b */
    public final za80 f135699b;

    /* JADX INFO: renamed from: l.mtv$a */
    public class C18557a extends qvf0<jze> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImageRequest f135700f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ yc90 f135701g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ uc90 f135702h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18557a(uz5 uz5Var, yc90 yc90Var, uc90 uc90Var, String str, ImageRequest imageRequest, yc90 yc90Var2, uc90 uc90Var2) {
            super(uz5Var, yc90Var, uc90Var, str);
            this.f135700f = imageRequest;
            this.f135701g = yc90Var2;
            this.f135702h = uc90Var2;
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8491b(jze jzeVar) {
            jze.m143896n(jzeVar);
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public jze mo8492c() throws Exception {
            jze jzeVarMo98619d = mtv.this.mo98619d(this.f135700f);
            if (jzeVarMo98619d == null) {
                this.f135701g.mo104755e(this.f135702h, mtv.this.mo98620f(), false);
                this.f135702h.mo155874u("local", RemoteConfigComponent.FETCH_FILE_NAME);
                return null;
            }
            jzeVarMo98619d.m143909d0();
            this.f135701g.mo104755e(this.f135702h, mtv.this.mo98620f(), true);
            this.f135702h.mo155874u("local", RemoteConfigComponent.FETCH_FILE_NAME);
            this.f135702h.mo155861b("image_color_space", jzeVarMo98619d.m143925v());
            return jzeVarMo98619d;
        }
    }

    /* JADX INFO: renamed from: l.mtv$b */
    public class C18558b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qvf0 f135704a;

        public C18558b(qvf0 qvf0Var) {
            this.f135704a = qvf0Var;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            this.f135704a.m181279a();
        }
    }

    public mtv(Executor executor, za80 za80Var) {
        this.f135698a = executor;
        this.f135699b = za80Var;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        yc90 yc90VarMo155870n = uc90Var.mo155870n();
        ImageRequest imageRequestMo155873t = uc90Var.mo155873t();
        uc90Var.mo155874u("local", RemoteConfigComponent.FETCH_FILE_NAME);
        C18557a c18557a = new C18557a(uz5Var, yc90VarMo155870n, uc90Var, mo98620f(), imageRequestMo155873t, yc90VarMo155870n, uc90Var);
        uc90Var.mo155872q(new C18558b(c18557a));
        this.f135698a.execute(c18557a);
    }

    /* JADX INFO: renamed from: c */
    public jze m156358c(InputStream inputStream, int i) throws IOException {
        za80 za80Var = this.f135699b;
        fa5 fa5VarM120145S = null;
        try {
            fa5VarM120145S = i <= 0 ? fa5.m120145S(za80Var.mo111845a(inputStream)) : fa5.m120145S(za80Var.mo111849e(inputStream, i));
            jze jzeVar = new jze((fa5<PooledByteBuffer>) fa5VarM120145S);
            la5.m149128b(inputStream);
            fa5.m120154v(fa5VarM120145S);
            return jzeVar;
        } catch (Throwable th) {
            la5.m149128b(inputStream);
            fa5.m120154v(fa5VarM120145S);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract jze mo98619d(ImageRequest imageRequest) throws IOException;

    /* JADX INFO: renamed from: e */
    public jze m156359e(InputStream inputStream, int i) throws IOException {
        return m156358c(inputStream, i);
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo98620f();
}
