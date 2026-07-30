package p028v;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.e51;
import l.lsi0;
import l.roj0;
import l.x1l0;
import l.x8i0;
import p003l.e30;
import p003l.g30;
import p003l.iwl;
import p003l.thh0;
import p003l.vph0;
import p014rx.C1099c;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VTexturePlayer extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: x */
    public static C1186b<roj0> f13092x = C1186b.m9978b();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1376b f13093a;

    /* JADX INFO: renamed from: b */
    public double f13094b;

    /* JADX INFO: renamed from: c */
    public boolean f13095c;

    /* JADX INFO: renamed from: d */
    public boolean f13096d;

    /* JADX INFO: renamed from: e */
    public boolean f13097e;

    /* JADX INFO: renamed from: f */
    public boolean f13098f;

    /* JADX INFO: renamed from: g */
    public boolean f13099g;

    /* JADX INFO: renamed from: h */
    public long f13100h;

    /* JADX INFO: renamed from: i */
    public long f13101i;

    /* JADX INFO: renamed from: j */
    public boolean f13102j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1377c f13103k;

    /* JADX INFO: renamed from: l */
    public e30 f13104l;

    /* JADX INFO: renamed from: m */
    public String f13105m;

    /* JADX INFO: renamed from: n */
    public C1099c<Boolean> f13106n;

    /* JADX INFO: renamed from: o */
    public float f13107o;

    /* JADX INFO: renamed from: p */
    public boolean f13108p;

    /* JADX INFO: renamed from: q */
    public boolean f13109q;

    /* JADX INFO: renamed from: r */
    public Surface f13110r;

    /* JADX INFO: renamed from: s */
    public boolean f13111s;

    /* JADX INFO: renamed from: t */
    public iwl f13112t;

    /* JADX INFO: renamed from: u */
    public Uri f13113u;

    /* JADX INFO: renamed from: v */
    public boolean f13114v;

    /* JADX INFO: renamed from: w */
    public Runnable f13115w;

    /* JADX INFO: renamed from: v.VTexturePlayer$a */
    public interface InterfaceC1375a {
    }

    /* JADX INFO: renamed from: v.VTexturePlayer$b */
    public interface InterfaceC1376b {
        /* JADX INFO: renamed from: d */
        void mo8500d();

        /* JADX INFO: renamed from: h */
        void mo8505h();

        void onComplete();

        void onError(int i, int i2);

        void onPause();

        void onResume();

        /* JADX INFO: renamed from: y */
        void mo8511y();
    }

    /* JADX INFO: renamed from: v.VTexturePlayer$c */
    public interface InterfaceC1377c {
        /* JADX INFO: renamed from: O */
        void m11800O();

        /* JADX INFO: renamed from: a */
        void m11801a();

        /* JADX INFO: renamed from: b */
        void m11802b(int i, int i2);

        /* JADX INFO: renamed from: c */
        void m11803c(long j);
    }

    public VTexturePlayer(Context context, InterfaceC1376b interfaceC1376b) {
        super(context);
        this.f13095c = false;
        this.f13096d = false;
        this.f13097e = false;
        this.f13098f = false;
        this.f13099g = true;
        this.f13100h = -1L;
        this.f13101i = -1L;
        this.f13102j = true;
        this.f13105m = "";
        this.f13106n = null;
        this.f13107o = -1.0f;
        setSurfaceTextureListener(this);
        this.f13108p = true;
        this.f13109q = false;
        this.f13114v = false;
        this.f13093a = interfaceC1376b;
    }

    /* JADX INFO: renamed from: h */
    public final void m11784h(int i, int i2, double d) {
        int i3;
        int i4;
        if (!this.f13095c ? i2 > (i3 = (int) (((double) i) * d)) : i2 <= (i3 = (int) (((double) i) * d))) {
            i4 = (int) (((double) i2) / d);
            i3 = i2;
        } else {
            i4 = i;
        }
        Matrix matrix = new Matrix();
        getTransform(matrix);
        matrix.setScale(i4 / i, i3 / i2);
        matrix.postTranslate((i - i4) / 2, (i2 - i3) / 2);
        setTransform(matrix);
    }

    /* JADX INFO: renamed from: i */
    public void m11785i(boolean z) {
        Surface surface;
        e51.J(this.f13115w);
        this.f13109q = false;
        this.f13111s = false;
        this.f13114v = false;
        this.f13108p = true;
        if (this.f13113u != null) {
            this.f13113u = null;
            this.f13105m = "";
        }
        iwl iwlVar = this.f13112t;
        if (iwlVar != null) {
            try {
                iwlVar.reset();
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            if (z) {
                this.f13112t.release();
            }
        }
        if (!z || (surface = this.f13110r) == null) {
            return;
        }
        surface.release();
        this.f13110r = null;
    }

    /* JADX INFO: renamed from: j */
    public void m11786j() {
        Surface surface = this.f13110r;
        if (surface != null) {
            surface.release();
            this.f13110r = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m11787k(boolean z) {
        this.f13095c = z;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11788l(int i) {
        if (this.f13110r != null || this.f13093a == null) {
            return;
        }
        lsi0.h(i);
        this.f13093a.mo8500d();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m11789m(Boolean bool) {
        if (bool.booleanValue()) {
            this.f13102j = false;
        } else {
            this.f13102j = true;
            this.f13100h = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11790n(String str, Object obj) {
        if (this.f13100h > 0) {
            this.f13100h = -1L;
        }
        if (this.f13105m.equals(str)) {
            this.f13112t.start();
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m11791o(Object obj, Integer num, Integer num2) {
        if (num.intValue() == 3) {
            this.f13093a.mo8511y();
            this.f13098f = true;
            this.f13112t.mo5248a(null);
            InterfaceC1377c interfaceC1377c = this.f13103k;
            if (interfaceC1377c != null) {
                interfaceC1377c.m11801a();
            }
        }
        iwl iwlVar = this.f13112t;
        if (iwlVar == null || !(iwlVar instanceof vph0)) {
            return;
        }
        if (num.intValue() == 701) {
            this.f13101i = SystemClock.elapsedRealtime();
            InterfaceC1377c interfaceC1377c2 = this.f13103k;
            if (interfaceC1377c2 != null) {
                interfaceC1377c2.m11800O();
            }
        }
        if (num.intValue() == 702) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13101i;
            InterfaceC1377c interfaceC1377c3 = this.f13103k;
            if (interfaceC1377c3 != null) {
                interfaceC1377c3.m11803c(jElapsedRealtime);
            }
            this.f13101i = -1L;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.f13110r;
        if (surface != null) {
            surface.release();
        }
        this.f13110r = new Surface(surfaceTexture);
        e51.J(this.f13115w);
        iwl iwlVar = this.f13112t;
        if (iwlVar == null) {
            Uri uri = this.f13113u;
            if (uri == null || !uri.toString().startsWith("http")) {
                this.f13112t = new thh0();
            } else {
                vph0 vph0Var = new vph0();
                this.f13112t = vph0Var;
                if (this.f13097e) {
                    vph0Var.m8398j();
                }
            }
        } else {
            iwlVar.reset();
        }
        this.f13112t.setSurface(this.f13110r);
        if (this.f13114v) {
            m11784h(i, i2, this.f13094b);
            m11796t();
        } else {
            if (!this.f13109q || this.f13093a == null) {
                return;
            }
            this.f13111s = false;
            this.f13108p = true;
            this.f13112t.reset();
            this.f13093a.mo8500d();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        iwl iwlVar = this.f13112t;
        if (iwlVar == null) {
            return true;
        }
        iwlVar.mo5252e();
        final iwl iwlVar2 = this.f13112t;
        x8i0.a(new Runnable() { // from class: l.vqk0
            @Override // java.lang.Runnable
            public final void run() {
                iwlVar2.release();
            }
        });
        this.f13112t = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4) {
            this.f13099g = true;
            this.f13100h = -1L;
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11792p(Object obj, Integer num, Integer num2) {
        e30 e30Var;
        if (this.f13096d && num.intValue() == -541478725 && (e30Var = this.f13104l) != null) {
            e30Var.call(num);
        }
        this.f13093a.onError(num.intValue(), num2.intValue());
        this.f13108p = true;
        this.f13111s = false;
        this.f13112t.reset();
        this.f13093a.mo8500d();
        InterfaceC1377c interfaceC1377c = this.f13103k;
        if (interfaceC1377c != null) {
            interfaceC1377c.m11802b(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m11793q(Object obj) {
        this.f13093a.onComplete();
        this.f13109q = true;
        this.f13111s = true;
        this.f13099g = true;
        this.f13100h = -1L;
    }

    /* JADX INFO: renamed from: r */
    public void m11794r() {
        this.f13114v = false;
        this.f13109q = true;
        if (this.f13113u != null) {
            iwl iwlVar = this.f13112t;
            if (iwlVar != null) {
                if (iwlVar.isPlaying()) {
                    this.f13112t.pause();
                } else if (!this.f13111s) {
                    this.f13108p = true;
                    this.f13112t.reset();
                    if (!this.f13098f) {
                        setVisibility(4);
                    }
                }
            }
            this.f13093a.onPause();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m11795s(Uri uri, double d, String str, boolean z, int i, final int i2) {
        iwl iwlVar;
        iwl iwlVar2;
        if (z) {
            lsi0.i(i, true);
            setVisibility(4);
            return;
        }
        if (this.f13110r == null) {
            Runnable runnable = this.f13115w;
            if (runnable == null) {
                this.f13115w = new Runnable() { // from class: l.wqk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8602a.m11788l(i2);
                    }
                };
            } else {
                e51.J(runnable);
            }
            e51.H(getContext(), this.f13115w, 10000L);
        }
        setVisibility(0);
        if (this.f13113u == null) {
            this.f13113u = uri;
            this.f13094b = d;
            this.f13105m = str;
        } else if (!this.f13105m.equals(str)) {
            this.f13113u = uri;
            this.f13094b = d;
            this.f13105m = str;
            if (this.f13112t != null && this.f13110r != null) {
                if (m11797u()) {
                    this.f13112t.pause();
                }
                this.f13112t.reset();
            }
            this.f13108p = true;
            this.f13111s = false;
        }
        f13092x.onNext(roj0.a);
        this.f13109q = false;
        if (this.f13111s) {
            this.f13111s = false;
            if (this.f13110r != null && (iwlVar2 = this.f13112t) != null) {
                iwlVar2.start();
                this.f13093a.mo8511y();
                this.f13098f = true;
            }
        } else if (this.f13108p) {
            this.f13108p = false;
            m11784h(getWidth(), getHeight(), this.f13094b);
            this.f13093a.mo8505h();
            if (this.f13110r == null && isAvailable()) {
                onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
            }
            if (this.f13112t == null) {
                this.f13114v = true;
            } else {
                m11796t();
                this.f13099g = true;
                this.f13100h = -1L;
            }
        } else if (this.f13110r != null && (iwlVar = this.f13112t) != null) {
            iwlVar.start();
            this.f13093a.onResume();
        }
        x1l0.n().I(str);
        if (!this.f13099g) {
            this.f13100h = -1L;
            return;
        }
        this.f13099g = false;
        if (uri != null) {
            this.f13106n.first().subscribe(new e30() { // from class: l.xqk0
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8819a.m11789m((Boolean) obj);
                }
            });
        }
    }

    public void setIfUseTTDynamicCache(boolean z) {
        this.f13097e = z;
    }

    public void setIsInABGroup(boolean z) {
        this.f13096d = z;
    }

    public void setLooping(boolean z) {
        this.f13112t.setLooping(z);
    }

    public void setNetErrorListener(e30 e30Var) {
        this.f13104l = e30Var;
    }

    public void setOnBufferListener(InterfaceC1377c interfaceC1377c) {
        this.f13103k = interfaceC1377c;
    }

    public void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (NullChecker.a(this.f13112t)) {
            this.f13112t.setVolume(f);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m11796t() {
        try {
            this.f13114v = false;
            final String str = this.f13105m;
            this.f13112t.setDataSource(this.f13113u.toString());
            this.f13112t.mo5249b(new e30() { // from class: l.rqk0
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7048a.m11790n(str, obj);
                }
            });
            this.f13112t.mo5248a(new g30() { // from class: l.sqk0
                @Override // p003l.g30
                /* JADX INFO: renamed from: a */
                public final void mo4389a(Object obj, Object obj2, Object obj3) {
                    this.f7287a.m11791o(obj, (Integer) obj2, (Integer) obj3);
                }
            });
            this.f13112t.mo5250c(new g30() { // from class: l.tqk0
                @Override // p003l.g30
                /* JADX INFO: renamed from: a */
                public final void mo4389a(Object obj, Object obj2, Object obj3) {
                    this.f7586a.m11792p(obj, (Integer) obj2, (Integer) obj3);
                }
            });
            this.f13112t.mo5251d(new e30() { // from class: l.uqk0
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8064a.m11793q(obj);
                }
            });
            this.f13112t.prepareAsync();
        } catch (IOException e) {
            CrashHelper.c(e);
            this.f13112t.reset();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m11797u() {
        iwl iwlVar = this.f13112t;
        return iwlVar != null && iwlVar.isPlaying();
    }

    /* JADX INFO: renamed from: v */
    public void m11798v() {
        try {
            iwl iwlVar = this.f13112t;
            if (iwlVar != null) {
                iwlVar.seekTo(0L);
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception("VTexturePlayer seekToZero exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m11799w(InterfaceC1375a interfaceC1375a, C1099c c1099c, float f) {
        this.f13106n = c1099c;
        this.f13107o = f;
    }

    public void setVolume(boolean z) {
        setVolume(z ? 0.0f : 1.0f);
    }
}
