package p153l;

import com.facebook.imagepipeline.memory.AbstractC1642b;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.C1641a;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class aj80 {

    /* JADX INFO: renamed from: a */
    public final yi80 f71792a;

    /* JADX INFO: renamed from: b */
    public AbstractC1642b f71793b;

    /* JADX INFO: renamed from: c */
    public v23 f71794c;

    /* JADX INFO: renamed from: d */
    public AbstractC1642b f71795d;

    /* JADX INFO: renamed from: e */
    public vsi f71796e;

    /* JADX INFO: renamed from: f */
    public AbstractC1642b f71797f;

    /* JADX INFO: renamed from: g */
    public fj80 f71798g;

    /* JADX INFO: renamed from: h */
    public ij80 f71799h;

    /* JADX INFO: renamed from: i */
    public wq3 f71800i;

    public aj80(yi80 yi80Var) {
        this.f71792a = (yi80) wn80.m207182g(yi80Var);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1642b m98355a() {
        if (this.f71793b == null) {
            try {
                this.f71793b = (AbstractC1642b) AshmemMemoryChunkPool.class.getConstructor(gqy.class, bj80.class, cj80.class).newInstance(this.f71792a.m216024i(), this.f71792a.m216022g(), this.f71792a.m216023h());
            } catch (ClassNotFoundException unused) {
                this.f71793b = null;
            } catch (IllegalAccessException unused2) {
                this.f71793b = null;
            } catch (InstantiationException unused3) {
                this.f71793b = null;
            } catch (NoSuchMethodException unused4) {
                this.f71793b = null;
            } catch (InvocationTargetException unused5) {
                this.f71793b = null;
            }
        }
        return this.f71793b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX INFO: renamed from: b */
    public v23 m98356b() {
        if (this.f71794c == null) {
            String strM216020e = this.f71792a.m216020e();
            switch (strM216020e.hashCode()) {
                case -1868884870:
                    if (!strM216020e.equals("legacy_default_params")) {
                        this.f71794c = new sg3(this.f71792a.m216024i(), this.f71792a.m216018c(), this.f71792a.m216019d(), this.f71792a.m216027l());
                    } else {
                        this.f71794c = new sg3(this.f71792a.m216024i(), tmd.m191727a(), this.f71792a.m216019d(), this.f71792a.m216027l());
                    }
                    break;
                case -1106578487:
                    strM216020e.equals("legacy");
                    this.f71794c = new sg3(this.f71792a.m216024i(), this.f71792a.m216018c(), this.f71792a.m216019d(), this.f71792a.m216027l());
                    break;
                case -404562712:
                    if (!strM216020e.equals("experimental")) {
                        this.f71794c = new sg3(this.f71792a.m216024i(), this.f71792a.m216018c(), this.f71792a.m216019d(), this.f71792a.m216027l());
                    } else {
                        this.f71794c = new ugw(this.f71792a.m216017b(), this.f71792a.m216016a(), ht40.m137066h(), this.f71792a.m216028m() ? this.f71792a.m216024i() : null);
                    }
                    break;
                case -402149703:
                    if (!strM216020e.equals("dummy_with_tracking")) {
                        this.f71794c = new sg3(this.f71792a.m216024i(), this.f71792a.m216018c(), this.f71792a.m216019d(), this.f71792a.m216027l());
                    } else {
                        this.f71794c = new sfe();
                    }
                    break;
                case 95945896:
                    if (!strM216020e.equals("dummy")) {
                        this.f71794c = new sg3(this.f71792a.m216024i(), this.f71792a.m216018c(), this.f71792a.m216019d(), this.f71792a.m216027l());
                    } else {
                        this.f71794c = new pfe();
                    }
                    break;
                default:
                    this.f71794c = new sg3(this.f71792a.m216024i(), this.f71792a.m216018c(), this.f71792a.m216019d(), this.f71792a.m216027l());
                    break;
            }
        }
        return this.f71794c;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1642b m98357c() {
        if (this.f71795d == null) {
            try {
                this.f71795d = (AbstractC1642b) BufferMemoryChunkPool.class.getConstructor(gqy.class, bj80.class, cj80.class).newInstance(this.f71792a.m216024i(), this.f71792a.m216022g(), this.f71792a.m216023h());
            } catch (ClassNotFoundException unused) {
                this.f71795d = null;
            } catch (IllegalAccessException unused2) {
                this.f71795d = null;
            } catch (InstantiationException unused3) {
                this.f71795d = null;
            } catch (NoSuchMethodException unused4) {
                this.f71795d = null;
            } catch (InvocationTargetException unused5) {
                this.f71795d = null;
            }
        }
        return this.f71795d;
    }

    /* JADX INFO: renamed from: d */
    public vsi m98358d() {
        if (this.f71796e == null) {
            this.f71796e = new vsi(this.f71792a.m216024i(), this.f71792a.m216021f());
        }
        return this.f71796e;
    }

    /* JADX INFO: renamed from: e */
    public int m98359e() {
        return this.f71792a.m216021f().f76970g;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1642b m98360f(int i) {
        if (i == 0) {
            return m98361g();
        }
        if (i == 1) {
            return m98357c();
        }
        if (i == 2) {
            return m98355a();
        }
        wg3.m206174a("Invalid MemoryChunkType");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC1642b m98361g() {
        if (this.f71797f == null) {
            try {
                this.f71797f = (AbstractC1642b) NativeMemoryChunkPool.class.getConstructor(gqy.class, bj80.class, cj80.class).newInstance(this.f71792a.m216024i(), this.f71792a.m216022g(), this.f71792a.m216023h());
            } catch (ClassNotFoundException e) {
                huf.m137181i("PoolFactory", "", e);
                this.f71797f = null;
            } catch (IllegalAccessException e2) {
                huf.m137181i("PoolFactory", "", e2);
                this.f71797f = null;
            } catch (InstantiationException e3) {
                huf.m137181i("PoolFactory", "", e3);
                this.f71797f = null;
            } catch (NoSuchMethodException e4) {
                huf.m137181i("PoolFactory", "", e4);
                this.f71797f = null;
            } catch (InvocationTargetException e5) {
                huf.m137181i("PoolFactory", "", e5);
                this.f71797f = null;
            }
        }
        return this.f71797f;
    }

    /* JADX INFO: renamed from: h */
    public fj80 m98362h() {
        return m98363i(!ie20.m139588a() ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public fj80 m98363i(int i) {
        if (this.f71798g == null) {
            AbstractC1642b abstractC1642bM98360f = m98360f(i);
            wn80.m207183h(abstractC1642bM98360f, "failed to get pool for chunk type: " + i);
            this.f71798g = new aqy(abstractC1642bM98360f, m98364j());
        }
        return this.f71798g;
    }

    /* JADX INFO: renamed from: j */
    public ij80 m98364j() {
        if (this.f71799h == null) {
            this.f71799h = new ij80(m98365k());
        }
        return this.f71799h;
    }

    /* JADX INFO: renamed from: k */
    public wq3 m98365k() {
        if (this.f71800i == null) {
            this.f71800i = new C1641a(this.f71792a.m216024i(), this.f71792a.m216025j(), this.f71792a.m216026k());
        }
        return this.f71800i;
    }
}
