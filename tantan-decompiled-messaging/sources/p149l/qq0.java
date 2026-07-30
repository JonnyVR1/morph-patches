package p149l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qq0 implements pq0 {

    /* JADX INFO: renamed from: e */
    public static oq0 f155846e = m175869g("com.facebook.animated.gif.GifImage");

    /* JADX INFO: renamed from: f */
    public static oq0 f155847f = m175869g("com.facebook.animated.webp.WebPImage");

    /* JADX INFO: renamed from: a */
    public final fq0 f155848a;

    /* JADX INFO: renamed from: b */
    public final r480 f155849b;

    /* JADX INFO: renamed from: c */
    public final boolean f155850c;

    /* JADX INFO: renamed from: d */
    public final boolean f155851d;

    public qq0(fq0 fq0Var, r480 r480Var, boolean z, boolean z2) {
        this.f155848a = fq0Var;
        this.f155849b = r480Var;
        this.f155850c = z;
        this.f155851d = z2;
    }

    /* JADX INFO: renamed from: g */
    public static oq0 m175869g(String str) {
        try {
            return (oq0) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p149l.pq0
    /* JADX INFO: renamed from: a */
    public da5 mo170872a(jze jzeVar, zem zemVar, Bitmap.Config config) {
        if (f155847f == null) {
            qq3.m175877a("To encode animated webp please add the dependency to the animated-webp module");
            return null;
        }
        fa5<PooledByteBuffer> fa5VarM143923t = jzeVar.m143923t();
        rf80.m179116g(fa5VarM143923t);
        try {
            PooledByteBuffer pooledByteBufferM120155B = fa5VarM143923t.m120155B();
            return m175873f(jzeVar.m143903N(), zemVar, pooledByteBufferM120155B.getByteBuffer() != null ? f155847f.decodeFromByteBuffer(pooledByteBufferM120155B.getByteBuffer(), zemVar) : f155847f.decodeFromNativeMemory(pooledByteBufferM120155B.mo8155o(), pooledByteBufferM120155B.size(), zemVar), config);
        } finally {
            fa5.m120154v(fa5VarM143923t);
        }
    }

    @Override // p149l.pq0
    /* JADX INFO: renamed from: b */
    public da5 mo170873b(jze jzeVar, zem zemVar, Bitmap.Config config) {
        if (f155846e == null) {
            qq3.m175877a("To encode animated gif please add the dependency to the animated-gif module");
            return null;
        }
        fa5<PooledByteBuffer> fa5VarM143923t = jzeVar.m143923t();
        rf80.m179116g(fa5VarM143923t);
        try {
            PooledByteBuffer pooledByteBufferM120155B = fa5VarM143923t.m120155B();
            return m175873f(jzeVar.m143903N(), zemVar, pooledByteBufferM120155B.getByteBuffer() != null ? f155846e.decodeFromByteBuffer(pooledByteBufferM120155B.getByteBuffer(), zemVar) : f155846e.decodeFromNativeMemory(pooledByteBufferM120155B.mo8155o(), pooledByteBufferM120155B.size(), zemVar), config);
        } finally {
            fa5.m120154v(fa5VarM143923t);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public final fa5<Bitmap> m175870c(int i, int i2, Bitmap.Config config) {
        fa5<Bitmap> fa5VarMo152410d = this.f155849b.mo152410d(i, i2, config);
        fa5VarMo152410d.m120155B().eraseColor(0);
        fa5VarMo152410d.m120155B().setHasAlpha(true);
        return fa5VarMo152410d;
    }

    /* JADX INFO: renamed from: d */
    public final fa5<Bitmap> m175871d(nq0 nq0Var, Bitmap.Config config, int i) {
        fa5<Bitmap> fa5VarM175870c = m175870c(nq0Var.getWidth(), nq0Var.getHeight(), config);
        new AnimatedImageCompositor(this.f155848a.mo8378a(sq0.m185425b(nq0Var), null), this.f155850c, new C19555a()).m8402h(i, fa5VarM175870c.m120155B());
        return fa5VarM175870c;
    }

    /* JADX INFO: renamed from: e */
    public final List<fa5<Bitmap>> m175872e(nq0 nq0Var, Bitmap.Config config) {
        bq0 bq0VarMo8378a = this.f155848a.mo8378a(sq0.m185425b(nq0Var), null);
        ArrayList arrayList = new ArrayList(bq0VarMo8378a.getFrameCount());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(bq0VarMo8378a, this.f155850c, new C19556b(arrayList));
        for (int i = 0; i < bq0VarMo8378a.getFrameCount(); i++) {
            fa5<Bitmap> fa5VarM175870c = m175870c(bq0VarMo8378a.getWidth(), bq0VarMo8378a.getHeight(), config);
            animatedImageCompositor.m8402h(i, fa5VarM175870c.m120155B());
            arrayList.add(fa5VarM175870c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final da5 m175873f(String str, zem zemVar, nq0 nq0Var, Bitmap.Config config) throws Throwable {
        List<fa5<Bitmap>> listM175872e;
        fa5<Bitmap> fa5VarM175871d;
        fa5<Bitmap> fa5Var = null;
        try {
            int frameCount = zemVar.f202841d ? nq0Var.getFrameCount() - 1 : 0;
            if (zemVar.f202844g) {
                ia5 ia5VarM135131z = ia5.m135131z(m175871d(nq0Var, config, frameCount), ykm.f198776d, 0);
                fa5.m120154v(null);
                fa5.m120153u(null);
                return ia5VarM135131z;
            }
            if (zemVar.f202843f) {
                listM175872e = m175872e(nq0Var, config);
                try {
                    fa5VarM175871d = fa5.m120152t(listM175872e.get(frameCount));
                } catch (Throwable th) {
                    th = th;
                    fa5.m120154v(fa5Var);
                    fa5.m120153u(listM175872e);
                    throw th;
                }
            } else {
                listM175872e = null;
                fa5VarM175871d = null;
            }
            try {
                if (zemVar.f202840c && fa5VarM175871d == null) {
                    fa5VarM175871d = m175871d(nq0Var, config, frameCount);
                }
                z95 z95Var = new z95(sq0.m185426f(nq0Var).m190078k(fa5VarM175871d).m190077j(frameCount).m190076i(listM175872e).m190075h(null).m190079l(str).m190068a(), this.f155851d);
                fa5.m120154v(fa5VarM175871d);
                fa5.m120153u(listM175872e);
                return z95Var;
            } catch (Throwable th2) {
                th = th2;
                fa5Var = fa5VarM175871d;
                fa5.m120154v(fa5Var);
                fa5.m120153u(listM175872e);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            listM175872e = null;
        }
    }

    public qq0(fq0 fq0Var, r480 r480Var, boolean z) {
        this(fq0Var, r480Var, z, true);
    }

    /* JADX INFO: renamed from: l.qq0$a */
    public class C19555a implements AnimatedImageCompositor.InterfaceC1615b {
        public C19555a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1615b
        /* JADX INFO: renamed from: b */
        public fa5<Bitmap> mo8404b(int i) {
            return null;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1615b
        /* JADX INFO: renamed from: a */
        public void mo8403a(int i, Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: l.qq0$b */
    public class C19556b implements AnimatedImageCompositor.InterfaceC1615b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f155853a;

        public C19556b(List list) {
            this.f155853a = list;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1615b
        /* JADX INFO: renamed from: b */
        public fa5<Bitmap> mo8404b(int i) {
            return fa5.m120152t((fa5) this.f155853a.get(i));
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1615b
        /* JADX INFO: renamed from: a */
        public void mo8403a(int i, Bitmap bitmap) {
        }
    }
}
