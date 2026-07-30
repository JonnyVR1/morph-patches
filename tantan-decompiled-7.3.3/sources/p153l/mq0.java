package p153l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mq0 implements lq0 {

    /* JADX INFO: renamed from: e */
    public static kq0 f137979e = m159445g("com.facebook.animated.gif.GifImage");

    /* JADX INFO: renamed from: f */
    public static kq0 f137980f = m159445g("com.facebook.animated.webp.WebPImage");

    /* JADX INFO: renamed from: a */
    public final bq0 f137981a;

    /* JADX INFO: renamed from: b */
    public final xc80 f137982b;

    /* JADX INFO: renamed from: c */
    public final boolean f137983c;

    /* JADX INFO: renamed from: d */
    public final boolean f137984d;

    public mq0(bq0 bq0Var, xc80 xc80Var, boolean z, boolean z2) {
        this.f137981a = bq0Var;
        this.f137982b = xc80Var;
        this.f137983c = z;
        this.f137984d = z2;
    }

    /* JADX INFO: renamed from: g */
    public static kq0 m159445g(String str) {
        try {
            return (kq0) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p153l.lq0
    /* JADX INFO: renamed from: a */
    public db5 mo155300a(n0f n0fVar, phm phmVar, Bitmap.Config config) {
        if (f137980f == null) {
            pr3.m173429a("To encode animated webp please add the dependency to the animated-webp module");
            return null;
        }
        fb5<PooledByteBuffer> fb5VarM160986t = n0fVar.m160986t();
        wn80.m207182g(fb5VarM160986t);
        try {
            PooledByteBuffer pooledByteBufferM124875B = fb5VarM160986t.m124875B();
            return m159449f(n0fVar.m160966N(), phmVar, pooledByteBufferM124875B.getByteBuffer() != null ? f137980f.decodeFromByteBuffer(pooledByteBufferM124875B.getByteBuffer(), phmVar) : f137980f.decodeFromNativeMemory(pooledByteBufferM124875B.mo8209o(), pooledByteBufferM124875B.size(), phmVar), config);
        } finally {
            fb5.m124874v(fb5VarM160986t);
        }
    }

    @Override // p153l.lq0
    /* JADX INFO: renamed from: b */
    public db5 mo155301b(n0f n0fVar, phm phmVar, Bitmap.Config config) {
        if (f137979e == null) {
            pr3.m173429a("To encode animated gif please add the dependency to the animated-gif module");
            return null;
        }
        fb5<PooledByteBuffer> fb5VarM160986t = n0fVar.m160986t();
        wn80.m207182g(fb5VarM160986t);
        try {
            PooledByteBuffer pooledByteBufferM124875B = fb5VarM160986t.m124875B();
            return m159449f(n0fVar.m160966N(), phmVar, pooledByteBufferM124875B.getByteBuffer() != null ? f137979e.decodeFromByteBuffer(pooledByteBufferM124875B.getByteBuffer(), phmVar) : f137979e.decodeFromNativeMemory(pooledByteBufferM124875B.mo8209o(), pooledByteBufferM124875B.size(), phmVar), config);
        } finally {
            fb5.m124874v(fb5VarM160986t);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public final fb5<Bitmap> m159446c(int i, int i2, Bitmap.Config config) {
        fb5<Bitmap> fb5VarMo188699d = this.f137982b.mo188699d(i, i2, config);
        fb5VarMo188699d.m124875B().eraseColor(0);
        fb5VarMo188699d.m124875B().setHasAlpha(true);
        return fb5VarMo188699d;
    }

    /* JADX INFO: renamed from: d */
    public final fb5<Bitmap> m159447d(jq0 jq0Var, Bitmap.Config config, int i) {
        fb5<Bitmap> fb5VarM159446c = m159446c(jq0Var.getWidth(), jq0Var.getHeight(), config);
        new AnimatedImageCompositor(this.f137981a.mo8432a(oq0.m168778b(jq0Var), null), this.f137983c, new C18669a()).m8456h(i, fb5VarM159446c.m124875B());
        return fb5VarM159446c;
    }

    /* JADX INFO: renamed from: e */
    public final List<fb5<Bitmap>> m159448e(jq0 jq0Var, Bitmap.Config config) {
        xp0 xp0VarMo8432a = this.f137981a.mo8432a(oq0.m168778b(jq0Var), null);
        ArrayList arrayList = new ArrayList(xp0VarMo8432a.getFrameCount());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(xp0VarMo8432a, this.f137983c, new C18670b(arrayList));
        for (int i = 0; i < xp0VarMo8432a.getFrameCount(); i++) {
            fb5<Bitmap> fb5VarM159446c = m159446c(xp0VarMo8432a.getWidth(), xp0VarMo8432a.getHeight(), config);
            animatedImageCompositor.m8456h(i, fb5VarM159446c.m124875B());
            arrayList.add(fb5VarM159446c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final db5 m159449f(String str, phm phmVar, jq0 jq0Var, Bitmap.Config config) throws Throwable {
        List<fb5<Bitmap>> listM159448e;
        fb5<Bitmap> fb5VarM159447d;
        fb5<Bitmap> fb5Var = null;
        try {
            int frameCount = phmVar.f152451d ? jq0Var.getFrameCount() - 1 : 0;
            if (phmVar.f152454g) {
                ib5 ib5VarM139282z = ib5.m139282z(m159447d(jq0Var, config, frameCount), anm.f72363d, 0);
                fb5.m124874v(null);
                fb5.m124873u(null);
                return ib5VarM139282z;
            }
            if (phmVar.f152453f) {
                listM159448e = m159448e(jq0Var, config);
                try {
                    fb5VarM159447d = fb5.m124872t(listM159448e.get(frameCount));
                } catch (Throwable th) {
                    th = th;
                    fb5.m124874v(fb5Var);
                    fb5.m124873u(listM159448e);
                    throw th;
                }
            } else {
                listM159448e = null;
                fb5VarM159447d = null;
            }
            try {
                if (phmVar.f152450c && fb5VarM159447d == null) {
                    fb5VarM159447d = m159447d(jq0Var, config, frameCount);
                }
                za5 za5Var = new za5(oq0.m168779f(jq0Var).m173281k(fb5VarM159447d).m173280j(frameCount).m173279i(listM159448e).m173278h(null).m173282l(str).m173271a(), this.f137984d);
                fb5.m124874v(fb5VarM159447d);
                fb5.m124873u(listM159448e);
                return za5Var;
            } catch (Throwable th2) {
                th = th2;
                fb5Var = fb5VarM159447d;
                fb5.m124874v(fb5Var);
                fb5.m124873u(listM159448e);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            listM159448e = null;
        }
    }

    public mq0(bq0 bq0Var, xc80 xc80Var, boolean z) {
        this(bq0Var, xc80Var, z, true);
    }

    /* JADX INFO: renamed from: l.mq0$a */
    public class C18669a implements AnimatedImageCompositor.InterfaceC1638b {
        public C18669a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1638b
        /* JADX INFO: renamed from: b */
        public fb5<Bitmap> mo8458b(int i) {
            return null;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1638b
        /* JADX INFO: renamed from: a */
        public void mo8457a(int i, Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: l.mq0$b */
    public class C18670b implements AnimatedImageCompositor.InterfaceC1638b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f137986a;

        public C18670b(List list) {
            this.f137986a = list;
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1638b
        /* JADX INFO: renamed from: b */
        public fb5<Bitmap> mo8458b(int i) {
            return fb5.m124872t((fb5) this.f137986a.get(i));
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1638b
        /* JADX INFO: renamed from: a */
        public void mo8457a(int i, Bitmap bitmap) {
        }
    }
}
