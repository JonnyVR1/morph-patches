package p153l;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class nvv implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final Executor f143863a;

    /* JADX INFO: renamed from: b */
    public final fj80 f143864b;

    /* JADX INFO: renamed from: l.nvv$a */
    public class C18962a extends z3g0<n0f> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImageRequest f143865f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ cl90 f143866g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ yk90 f143867h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18962a(z06 z06Var, cl90 cl90Var, yk90 yk90Var, String str, ImageRequest imageRequest, cl90 cl90Var2, yk90 yk90Var2) {
            super(z06Var, cl90Var, yk90Var, str);
            this.f143865f = imageRequest;
            this.f143866g = cl90Var2;
            this.f143867h = yk90Var2;
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8545b(n0f n0fVar) {
            n0f.m160959n(n0fVar);
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public n0f mo8546c() throws Exception {
            n0f n0fVarMo100405d = nvv.this.mo100405d(this.f143865f);
            if (n0fVarMo100405d == null) {
                this.f143866g.mo110445e(this.f143867h, nvv.this.mo100406f(), false);
                this.f143867h.mo117679u("local", RemoteConfigComponent.FETCH_FILE_NAME);
                return null;
            }
            n0fVarMo100405d.m160972e0();
            this.f143866g.mo110445e(this.f143867h, nvv.this.mo100406f(), true);
            this.f143867h.mo117679u("local", RemoteConfigComponent.FETCH_FILE_NAME);
            this.f143867h.mo97949b("image_color_space", n0fVarMo100405d.m160988v());
            return n0fVarMo100405d;
        }
    }

    /* JADX INFO: renamed from: l.nvv$b */
    public class C18963b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f143869a;

        public C18963b(z3g0 z3g0Var) {
            this.f143869a = z3g0Var;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            this.f143869a.m95923a();
        }
    }

    public nvv(Executor executor, fj80 fj80Var) {
        this.f143863a = executor;
        this.f143864b = fj80Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        cl90 cl90VarMo117675n = yk90Var.mo117675n();
        ImageRequest imageRequestMo117678t = yk90Var.mo117678t();
        yk90Var.mo117679u("local", RemoteConfigComponent.FETCH_FILE_NAME);
        C18962a c18962a = new C18962a(z06Var, cl90VarMo117675n, yk90Var, mo100406f(), imageRequestMo117678t, cl90VarMo117675n, yk90Var);
        yk90Var.mo117677q(new C18963b(c18962a));
        this.f143863a.execute(c18962a);
    }

    /* JADX INFO: renamed from: c */
    public n0f m164928c(InputStream inputStream, int i) throws IOException {
        fj80 fj80Var = this.f143864b;
        fb5 fb5VarM124865S = null;
        try {
            fb5VarM124865S = i <= 0 ? fb5.m124865S(fj80Var.mo99563a(inputStream)) : fb5.m124865S(fj80Var.mo99567e(inputStream, i));
            n0f n0fVar = new n0f((fb5<PooledByteBuffer>) fb5VarM124865S);
            lb5.m153575b(inputStream);
            fb5.m124874v(fb5VarM124865S);
            return n0fVar;
        } catch (Throwable th) {
            lb5.m153575b(inputStream);
            fb5.m124874v(fb5VarM124865S);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract n0f mo100405d(ImageRequest imageRequest) throws IOException;

    /* JADX INFO: renamed from: e */
    public n0f m164929e(InputStream inputStream, int i) throws IOException {
        return m164928c(inputStream, i);
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo100406f();
}
