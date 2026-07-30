package p153l;

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
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class am2 {

    /* JADX INFO: renamed from: c */
    public static final int f72186c = ((int) Runtime.getRuntime().maxMemory()) / 4;

    /* JADX INFO: renamed from: d */
    public static File f72187d = null;

    /* JADX INFO: renamed from: e */
    public static File f72188e = null;

    /* JADX INFO: renamed from: a */
    public rjm f72189a;

    /* JADX INFO: renamed from: b */
    public ug50 f72190b;

    /* JADX INFO: renamed from: l.am2$a */
    public class C15743a extends aj2<fb5<PooledByteBuffer>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f72191a;

        public C15743a(y20 y20Var) {
            this.f72191a = y20Var;
        }

        @Override // p153l.aj2
        /* JADX INFO: renamed from: e */
        public void mo98346e(i6c<fb5<PooledByteBuffer>> i6cVar) {
            this.f72191a.call(null);
        }

        @Override // p153l.aj2
        /* JADX INFO: renamed from: f */
        public void mo98347f(i6c<fb5<PooledByteBuffer>> i6cVar) {
            fb5<PooledByteBuffer> result = i6cVar.getResult();
            gj80 gj80Var = new gj80(result.m124875B());
            try {
                try {
                    try {
                        File fileM120381O = ecj.m120381O("facebook");
                        oki.m168018f(gj80Var, new FileOutputStream(fileM120381O));
                        this.f72191a.call(fileM120381O.getAbsolutePath());
                        lb5.m153575b(gj80Var);
                        fb5.m124874v(result);
                    } catch (AssertionError e) {
                        CrashHelper.m82479c(e);
                        this.f72191a.call(null);
                    }
                } catch (IOException e2) {
                    CrashHelper.m82479c(e2);
                    this.f72191a.call(null);
                    lb5.m153575b(gj80Var);
                    fb5.m124874v(result);
                }
            } catch (Throwable th) {
                try {
                    lb5.m153575b(gj80Var);
                    fb5.m124874v(result);
                } catch (AssertionError e3) {
                    CrashHelper.m82479c(e3);
                    this.f72191a.call(null);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.am2$b */
    public static class C15744b extends li2<qim> {

        /* JADX INFO: renamed from: b */
        public final fn2 f72193b;

        public C15744b(fn2 fn2Var) {
            this.f72193b = fn2Var;
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: a */
        public void mo98800a(String str) {
            fn2 fn2Var = this.f72193b;
            if (fn2Var != null) {
                fn2Var.mo108585f(str);
            }
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: c */
        public void mo98801c(String str, Object obj) {
            fn2 fn2Var = this.f72193b;
            if (fn2Var != null) {
                fn2Var.m126355g(str, obj);
            }
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: d */
        public void mo49464d(String str, Throwable th) {
            fn2 fn2Var = this.f72193b;
            if (fn2Var != null) {
                fn2Var.mo40110c(str, th);
            }
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: f */
        public void mo98802f(String str, Throwable th) {
            fn2 fn2Var = this.f72193b;
            if (fn2Var != null) {
                fn2Var.m126353d(str, th);
            }
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8288e(String str, @Nullable qim qimVar, @Nullable Animatable animatable) {
            if (qimVar == null) {
                mo49464d(str, am2.m98786k());
                return;
            }
            fn2 fn2Var = this.f72193b;
            if (fn2Var != null) {
                fn2Var.mo40111h(str, qimVar, animatable);
            }
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo49463b(String str, qim qimVar) {
            fn2 fn2Var = this.f72193b;
            if (fn2Var != null) {
                fn2Var.m126354e(str, qimVar);
            }
        }
    }

    public am2(rg50 rg50Var, cy3 cy3Var) throws Exception {
        try {
            f9j.m124661c(App.f16088e, m98790f(rg50Var, cy3Var));
        } catch (Exception e) {
            if (!dmk0.m116964c(e, EOFException.class)) {
                throw e;
            }
            CrashHelper.m82479c(e);
        }
        this.f72189a = f9j.m124659a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ npy m98784a(npy npyVar) {
        return npyVar;
    }

    /* JADX INFO: renamed from: k */
    public static Throwable m98786k() {
        return new Throwable("imageinfo is null");
    }

    /* JADX INFO: renamed from: c */
    public final ImageRequestBuilder m98787c(String str) {
        if (str.startsWith("file://")) {
            str = "file://" + Uri.parse(str).getPath();
        }
        return ImageRequestBuilder.m8646y(Uri.parse(str)).m8689z(true);
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: d */
    public void m98788d(int i) {
        Log.e("low_memory_callback", "System Callback level:" + i);
        if (cgw.m109764h(App.f16088e) && i >= 40) {
            f9j.m124659a().m181715c();
        } else if (i >= 60 || i == 15) {
            f9j.m124659a().m181715c();
        }
    }

    /* JADX INFO: renamed from: e */
    public ug50 mo98789e(rg50 rg50Var) {
        throw null;
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: f */
    public final sjm m98790f(rg50 rg50Var, cy3 cy3Var) {
        final npy npyVar = new npy(f72186c, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        File cacheDir = App.f16088e.getCacheDir();
        b4e b4eVarM102441n = b4e.m102415m(App.f16088e).m102443p(cacheDir).m102442o("imagepipeline_cache_small").m102444q(41943040L).m102445r(20971520L).m102446s(5242880L).m102441n();
        f72188e = new File(cacheDir, "imagepipeline_cache_small");
        File externalCacheDir = oki.m168026n() ? App.f16088e.getExternalCacheDir() : App.f16088e.getCacheDir();
        b4e b4eVarM102441n2 = b4e.m102415m(App.f16088e).m102443p(externalCacheDir).m102442o("imagepipeline_cache").m102444q(78643200L).m102445r(31457280L).m102446s(15728640L).m102441n();
        f72187d = new File(externalCacheDir, "imagepipeline_cache");
        this.f72190b = mo98789e(rg50Var);
        sjm.C20058a c20058aM186230Z = sjm.m186170K(App.f16088e).m186221Q(new a7h0() { // from class: l.yl2
            @Override // p153l.a7h0
            public final Object get() {
                return am2.m98784a(npyVar);
            }
        }).m186223S(cy3Var).m186228X(b4eVarM102441n2).m186224T(true).m186227W(new pod(Math.max(2, Runtime.getRuntime().availableProcessors() / 2))).m186232a0(b4eVarM102441n).m186230Z(this.f72190b);
        gt40 gt40VarM132200b = gt40.m132200b();
        gt40VarM132200b.mo131504a(new fqy() { // from class: l.zl2
        });
        c20058aM186230Z.m186229Y(gt40VarM132200b);
        if (cgw.m109764h(App.f16088e)) {
            ActivityManager activityManager = (ActivityManager) App.f16088e.getSystemService("activity");
            c20058aM186230Z.m186221Q(cgw.m109759c(activityManager)).m186226V(cgw.m109760d(activityManager)).m186222R(Bitmap.Config.RGB_565).m186224T(true);
        }
        return c20058aM186230Z.m186231a();
    }

    /* JADX INFO: renamed from: g */
    public lq70 m98791g(DraweeView draweeView) {
        return m98792h(draweeView, true);
    }

    /* JADX INFO: renamed from: h */
    public lq70 m98792h(DraweeView draweeView, boolean z) {
        return f9j.m124665g().mo8264b(draweeView.getController()).m8287z(z);
    }

    /* JADX INFO: renamed from: i */
    public void m98793i(String str, y20<String> y20Var) {
        this.f72189a.m181722k(m98797n(str).m8668a(), App.f16088e).mo8237f(new C15743a(y20Var), f94.m124626k());
    }

    /* JADX INFO: renamed from: j */
    public void m98794j() {
        this.f72189a.m181715c();
    }

    /* JADX INFO: renamed from: l */
    public xlj m98795l() {
        return new xlj(App.f16088e.getResources());
    }

    /* JADX INFO: renamed from: m */
    public ry3 m98796m(x1d0 x1d0Var) {
        return this.f72190b.m195893l().mo181341a(x1d0Var);
    }

    /* JADX INFO: renamed from: n */
    public ImageRequestBuilder m98797n(String str) {
        ImageRequestBuilder imageRequestBuilderM98787c = m98787c(str);
        if (cgw.m109764h(App.f16088e)) {
            imageRequestBuilderM98787c.m8661O(cgw.m109762f(App.f16088e));
        }
        return imageRequestBuilderM98787c;
    }

    /* JADX INFO: renamed from: o */
    public void m98798o(DraweeView draweeView) {
        draweeView.setController(null);
    }

    /* JADX INFO: renamed from: p */
    public void m98799p() {
        this.f72190b.m195897p();
    }
}
