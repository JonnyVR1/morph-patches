package p007l;

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
import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import l.ab80;
import l.c5c;
import l.dx3;
import l.e30;
import l.ei2;
import l.ejj;
import l.fa5;
import l.fi70;
import l.g84;
import l.hce;
import l.ihy;
import l.k850;
import l.knd;
import l.l6j;
import l.la5;
import l.n2e;
import l.ngm;
import l.ohm;
import l.phm;
import l.qgy;
import l.rhi;
import l.sk40;
import l.stc0;
import l.sx3;
import l.syg0;
import l.ti2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class sl2 {

    /* JADX INFO: renamed from: c */
    public static final int f4153c = ((int) Runtime.getRuntime().maxMemory()) / 4;

    /* JADX INFO: renamed from: d */
    public static File f4154d = null;

    /* JADX INFO: renamed from: e */
    public static File f4155e = null;

    /* JADX INFO: renamed from: a */
    public ohm f4156a;

    /* JADX INFO: renamed from: b */
    public n850 f4157b;

    /* JADX INFO: renamed from: l.sl2$a */
    public class C0694a extends ti2<fa5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f4158a;

        public C0694a(e30 e30Var) {
            this.f4158a = e30Var;
        }

        /* JADX INFO: renamed from: e */
        public void m10677e(c5c<fa5<PooledByteBuffer>> c5cVar) {
            this.f4158a.call((Object) null);
        }

        /* JADX INFO: renamed from: f */
        public void m10678f(c5c<fa5<PooledByteBuffer>> c5cVar) {
            fa5 fa5Var = (fa5) c5cVar.getResult();
            ab80 ab80Var = new ab80((PooledByteBuffer) fa5Var.B());
            try {
                try {
                    try {
                        File fileM9572O = k9j.m9572O("facebook");
                        rhi.f(ab80Var, new FileOutputStream(fileM9572O));
                        this.f4158a.call(fileM9572O.getAbsolutePath());
                        la5.b(ab80Var);
                        fa5.v(fa5Var);
                    } catch (AssertionError e) {
                        CrashHelper.c(e);
                        this.f4158a.call((Object) null);
                    }
                } catch (IOException e2) {
                    CrashHelper.c(e2);
                    this.f4158a.call((Object) null);
                    la5.b(ab80Var);
                    fa5.v(fa5Var);
                }
            } catch (Throwable th) {
                try {
                    la5.b(ab80Var);
                    fa5.v(fa5Var);
                } catch (AssertionError e3) {
                    CrashHelper.c(e3);
                    this.f4158a.call((Object) null);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.sl2$b */
    public static class C0695b extends ei2<ngm> {

        /* JADX INFO: renamed from: b */
        public final ym2 f4160b;

        public C0695b(ym2 ym2Var) {
            this.f4160b = ym2Var;
        }

        /* JADX INFO: renamed from: a */
        public void m10679a(String str) {
            ym2 ym2Var = this.f4160b;
            if (ym2Var != null) {
                ym2Var.m11940f(str);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m10681c(String str, Object obj) {
            ym2 ym2Var = this.f4160b;
            if (ym2Var != null) {
                ym2Var.m11941g(str, obj);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m10682d(String str, Throwable th) {
            ym2 ym2Var = this.f4160b;
            if (ym2Var != null) {
                ym2Var.m11937c(str, th);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m10684f(String str, Throwable th) {
            ym2 ym2Var = this.f4160b;
            if (ym2Var != null) {
                ym2Var.m11938d(str, th);
            }
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void m10683e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            if (ngmVar == null) {
                m10682d(str, sl2.m10663k());
                return;
            }
            ym2 ym2Var = this.f4160b;
            if (ym2Var != null) {
                ym2Var.m11942h(str, ngmVar, animatable);
            }
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void m10680b(String str, ngm ngmVar) {
            ym2 ym2Var = this.f4160b;
            if (ym2Var != null) {
                ym2Var.m11939e(str, ngmVar);
            }
        }
    }

    public sl2(k850 k850Var, dx3 dx3Var) throws Exception {
        try {
            l6j.c(App.f1068e, m10667f(k850Var, dx3Var));
        } catch (Exception e) {
            if (!xck0.m11791c(e, EOFException.class)) {
                throw e;
            }
            CrashHelper.c(e);
        }
        this.f4156a = l6j.a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ qgy m10661a(qgy qgyVar) {
        return qgyVar;
    }

    /* JADX INFO: renamed from: k */
    public static Throwable m10663k() {
        return new Throwable("imageinfo is null");
    }

    /* JADX INFO: renamed from: c */
    public final ImageRequestBuilder m10664c(String str) {
        if (str.startsWith("file://")) {
            str = "file://" + Uri.parse(str).getPath();
        }
        return ImageRequestBuilder.y(Uri.parse(str)).z(true);
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: d */
    public void m10665d(int i) {
        Log.e("low_memory_callback", "System Callback level:" + i);
        if (eew.m9068h(App.f1068e) && i >= 40) {
            l6j.a().c();
        } else if (i >= 60 || i == 15) {
            l6j.a().c();
        }
    }

    /* JADX INFO: renamed from: e */
    public n850 m10666e(k850 k850Var) {
        throw null;
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: f */
    public final phm m10667f(k850 k850Var, dx3 dx3Var) {
        final qgy qgyVar = new qgy(f4153c, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        File cacheDir = App.f1068e.getCacheDir();
        n2e n2eVarN = n2e.m(App.f1068e).p(cacheDir).o("imagepipeline_cache_small").q(41943040L).r(20971520L).s(5242880L).n();
        f4155e = new File(cacheDir, "imagepipeline_cache_small");
        File externalCacheDir = rhi.n() ? App.f1068e.getExternalCacheDir() : App.f1068e.getCacheDir();
        n2e n2eVarN2 = n2e.m(App.f1068e).p(externalCacheDir).o("imagepipeline_cache").q(78643200L).r(31457280L).s(15728640L).n();
        f4154d = new File(externalCacheDir, "imagepipeline_cache");
        this.f4157b = m10666e(k850Var);
        phm.a aVarZ = phm.K(App.f1068e).Q(new syg0() { // from class: l.ql2
            public final Object get() {
                return sl2.m10661a(qgyVar);
            }
        }).S(dx3Var).X(n2eVarN2).T(true).W(new knd(Math.max(2, Runtime.getRuntime().availableProcessors() / 2))).a0(n2eVarN).Z(this.f4157b);
        sk40 sk40VarB = sk40.b();
        sk40VarB.a(new ihy() { // from class: l.rl2
        });
        aVarZ.Y(sk40VarB);
        if (eew.m9068h(App.f1068e)) {
            ActivityManager activityManager = (ActivityManager) App.f1068e.getSystemService("activity");
            aVarZ.Q(eew.m9063c(activityManager)).V(eew.m9064d(activityManager)).R(Bitmap.Config.RGB_565).T(true);
        }
        return aVarZ.a();
    }

    /* JADX INFO: renamed from: g */
    public fi70 m10668g(DraweeView draweeView) {
        return m10669h(draweeView, true);
    }

    /* JADX INFO: renamed from: h */
    public fi70 m10669h(DraweeView draweeView, boolean z) {
        return l6j.g().E(draweeView.getController()).z(z);
    }

    /* JADX INFO: renamed from: i */
    public void m10670i(String str, e30<String> e30Var) {
        this.f4156a.k(m10674n(str).a(), App.f1068e).f(new C0694a(e30Var), g84.k());
    }

    /* JADX INFO: renamed from: j */
    public void m10671j() {
        this.f4156a.c();
    }

    /* JADX INFO: renamed from: l */
    public ejj m10672l() {
        return new ejj(App.f1068e.getResources());
    }

    /* JADX INFO: renamed from: m */
    public sx3 m10673m(stc0 stc0Var) {
        return this.f4157b.m9962l().a(stc0Var);
    }

    /* JADX INFO: renamed from: n */
    public ImageRequestBuilder m10674n(String str) {
        ImageRequestBuilder imageRequestBuilderM10664c = m10664c(str);
        if (eew.m9068h(App.f1068e)) {
            imageRequestBuilderM10664c.O(eew.m9066f(App.f1068e));
        }
        return imageRequestBuilderM10664c;
    }

    /* JADX INFO: renamed from: o */
    public void m10675o(DraweeView draweeView) {
        draweeView.setController((hce) null);
    }

    /* JADX INFO: renamed from: p */
    public void m10676p() {
        this.f4157b.m9966p();
    }
}
