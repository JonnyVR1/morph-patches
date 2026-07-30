package p149l;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.drawee.view.DraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class sl2 {

    /* JADX INFO: renamed from: c */
    public static final int f165094c = ((int) Runtime.getRuntime().maxMemory()) / 4;

    /* JADX INFO: renamed from: d */
    public static File f165095d = null;

    /* JADX INFO: renamed from: e */
    public static File f165096e = null;

    /* JADX INFO: renamed from: a */
    public ohm f165097a;

    /* JADX INFO: renamed from: b */
    public n850 f165098b;

    /* JADX INFO: renamed from: l.sl2$a */
    public class C19980a extends ti2<fa5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f165099a;

        public C19980a(e30 e30Var) {
            this.f165099a = e30Var;
        }

        @Override // p149l.ti2
        /* JADX INFO: renamed from: e */
        public void mo102384e(c5c<fa5<PooledByteBuffer>> c5cVar) {
            this.f165099a.call(null);
        }

        @Override // p149l.ti2
        /* JADX INFO: renamed from: f */
        public void mo96183f(c5c<fa5<PooledByteBuffer>> c5cVar) {
            fa5<PooledByteBuffer> result = c5cVar.getResult();
            ab80 ab80Var = new ab80(result.m120155B());
            try {
                try {
                    try {
                        File fileM145083O = k9j.m145083O("facebook");
                        rhi.m179362f(ab80Var, new FileOutputStream(fileM145083O));
                        this.f165099a.call(fileM145083O.getAbsolutePath());
                        la5.m149128b(ab80Var);
                        fa5.m120154v(result);
                    } catch (AssertionError e) {
                        CrashHelper.m81296c(e);
                        this.f165099a.call(null);
                    }
                } catch (IOException e2) {
                    CrashHelper.m81296c(e2);
                    this.f165099a.call(null);
                    la5.m149128b(ab80Var);
                    fa5.m120154v(result);
                }
            } catch (Throwable th) {
                try {
                    la5.m149128b(ab80Var);
                    fa5.m120154v(result);
                } catch (AssertionError e3) {
                    CrashHelper.m81296c(e3);
                    this.f165099a.call(null);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.sl2$b */
    public static class C19981b extends ei2<ngm> {

        /* JADX INFO: renamed from: b */
        public final ym2 f165101b;

        public C19981b(ym2 ym2Var) {
            this.f165101b = ym2Var;
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: a */
        public void mo102385a(String str) {
            ym2 ym2Var = this.f165101b;
            if (ym2Var != null) {
                ym2Var.mo102386f(str);
            }
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: c */
        public void mo116619c(String str, Object obj) {
            ym2 ym2Var = this.f165101b;
            if (ym2Var != null) {
                ym2Var.m215337g(str, obj);
            }
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: d */
        public void mo48281d(String str, Throwable th) {
            ym2 ym2Var = this.f165101b;
            if (ym2Var != null) {
                ym2Var.mo39107c(str, th);
            }
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: f */
        public void mo116620f(String str, Throwable th) {
            ym2 ym2Var = this.f165101b;
            if (ym2Var != null) {
                ym2Var.m215335d(str, th);
            }
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8234e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            if (ngmVar == null) {
                mo48281d(str, sl2.m184714k());
                return;
            }
            ym2 ym2Var = this.f165101b;
            if (ym2Var != null) {
                ym2Var.mo39108h(str, ngmVar, animatable);
            }
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo48280b(String str, ngm ngmVar) {
            ym2 ym2Var = this.f165101b;
            if (ym2Var != null) {
                ym2Var.m215336e(str, ngmVar);
            }
        }
    }

    public sl2(k850 k850Var, dx3 dx3Var) throws Exception {
        try {
            l6j.m148746c(App.f15369e, m184717f(k850Var, dx3Var));
        } catch (Exception e) {
            if (!xck0.m208122c(e, EOFException.class)) {
                throw e;
            }
            CrashHelper.m81296c(e);
        }
        this.f165097a = l6j.m148744a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ qgy m184712a(qgy qgyVar) {
        return qgyVar;
    }

    /* JADX INFO: renamed from: k */
    public static Throwable m184714k() {
        return new Throwable("imageinfo is null");
    }

    /* JADX INFO: renamed from: c */
    public final ImageRequestBuilder m184715c(String str) {
        if (str.startsWith("file://")) {
            str = "file://" + Uri.parse(str).getPath();
        }
        return ImageRequestBuilder.m8592y(Uri.parse(str)).m8635z(true);
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: d */
    public void m184716d(int i) {
        Log.e("low_memory_callback", "System Callback level:" + i);
        if (eew.m116012h(App.f15369e) && i >= 40) {
            l6j.m148744a().m164404c();
        } else if (i >= 60 || i == 15) {
            l6j.m148744a().m164404c();
        }
    }

    /* JADX INFO: renamed from: e */
    public n850 mo102358e(k850 k850Var) {
        throw null;
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: f */
    public final phm m184717f(k850 k850Var, dx3 dx3Var) {
        final qgy qgyVar = new qgy(f165094c, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        File cacheDir = App.f15369e.getCacheDir();
        n2e n2eVarM157592n = n2e.m157566m(App.f15369e).m157594p(cacheDir).m157593o("imagepipeline_cache_small").m157595q(41943040L).m157596r(20971520L).m157597s(5242880L).m157592n();
        f165096e = new File(cacheDir, "imagepipeline_cache_small");
        File externalCacheDir = rhi.m179370n() ? App.f15369e.getExternalCacheDir() : App.f15369e.getCacheDir();
        n2e n2eVarM157592n2 = n2e.m157566m(App.f15369e).m157594p(externalCacheDir).m157593o("imagepipeline_cache").m157595q(78643200L).m157596r(31457280L).m157597s(15728640L).m157592n();
        f165095d = new File(externalCacheDir, "imagepipeline_cache");
        this.f165098b = mo102358e(k850Var);
        phm.C19215a c19215aM169039Z = phm.m168979K(App.f15369e).m169030Q(new syg0() { // from class: l.ql2
            @Override // p149l.syg0
            public final Object get() {
                return sl2.m184712a(qgyVar);
            }
        }).m169032S(dx3Var).m169037X(n2eVarM157592n2).m169033T(true).m169036W(new knd(Math.max(2, Runtime.getRuntime().availableProcessors() / 2))).m169041a0(n2eVarM157592n).m169039Z(this.f165098b);
        sk40 sk40VarM184576b = sk40.m184576b();
        sk40VarM184576b.mo141613a(new ihy() { // from class: l.rl2
        });
        c19215aM169039Z.m169038Y(sk40VarM184576b);
        if (eew.m116012h(App.f15369e)) {
            ActivityManager activityManager = (ActivityManager) App.f15369e.getSystemService("activity");
            c19215aM169039Z.m169030Q(eew.m116007c(activityManager)).m169035V(eew.m116008d(activityManager)).m169031R(Bitmap.Config.RGB_565).m169033T(true);
        }
        return c19215aM169039Z.m169040a();
    }

    /* JADX INFO: renamed from: g */
    public fi70 m184718g(DraweeView draweeView) {
        return m184719h(draweeView, true);
    }

    /* JADX INFO: renamed from: h */
    public fi70 m184719h(DraweeView draweeView, boolean z) {
        return l6j.m148750g().mo8210b(draweeView.getController()).m8233z(z);
    }

    /* JADX INFO: renamed from: i */
    public void m184720i(String str, e30<String> e30Var) {
        this.f165097a.m164411k(m184724n(str).m8614a(), App.f15369e).mo8183f(new C19980a(e30Var), g84.m124744k());
    }

    /* JADX INFO: renamed from: j */
    public void m184721j() {
        this.f165097a.m164404c();
    }

    /* JADX INFO: renamed from: l */
    public ejj m184722l() {
        return new ejj(App.f15369e.getResources());
    }

    /* JADX INFO: renamed from: m */
    public sx3 m184723m(stc0 stc0Var) {
        return this.f165098b.m158194l().mo144849a(stc0Var);
    }

    /* JADX INFO: renamed from: n */
    public ImageRequestBuilder m184724n(String str) {
        ImageRequestBuilder imageRequestBuilderM184715c = m184715c(str);
        if (eew.m116012h(App.f15369e)) {
            imageRequestBuilderM184715c.m8607O(eew.m116010f(App.f15369e));
        }
        return imageRequestBuilderM184715c;
    }

    /* JADX INFO: renamed from: o */
    public void m184725o(DraweeView draweeView) {
        draweeView.setController(null);
    }

    /* JADX INFO: renamed from: p */
    public void m184726p() {
        this.f165098b.m158198p();
    }
}
