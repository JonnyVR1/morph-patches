package p151v;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.a30;
import p153l.aqh0;
import p153l.azl;
import p153l.cbl0;
import p153l.cyh0;
import p153l.l51;
import p153l.o1j0;
import p153l.uxj0;
import p153l.xhi0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class VTexturePlayer extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: x */
    public static C22508b<uxj0> f210389x = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public final InterfaceC22698b f210390a;

    /* JADX INFO: renamed from: b */
    public double f210391b;

    /* JADX INFO: renamed from: c */
    public boolean f210392c;

    /* JADX INFO: renamed from: d */
    public boolean f210393d;

    /* JADX INFO: renamed from: e */
    public boolean f210394e;

    /* JADX INFO: renamed from: f */
    public boolean f210395f;

    /* JADX INFO: renamed from: g */
    public boolean f210396g;

    /* JADX INFO: renamed from: h */
    public long f210397h;

    /* JADX INFO: renamed from: i */
    public long f210398i;

    /* JADX INFO: renamed from: j */
    public boolean f210399j;

    /* JADX INFO: renamed from: k */
    public InterfaceC22699c f210400k;

    /* JADX INFO: renamed from: l */
    public y20 f210401l;

    /* JADX INFO: renamed from: m */
    public String f210402m;

    /* JADX INFO: renamed from: n */
    public C22421c<Boolean> f210403n;

    /* JADX INFO: renamed from: o */
    public float f210404o;

    /* JADX INFO: renamed from: p */
    public boolean f210405p;

    /* JADX INFO: renamed from: q */
    public boolean f210406q;

    /* JADX INFO: renamed from: r */
    public Surface f210407r;

    /* JADX INFO: renamed from: s */
    public boolean f210408s;

    /* JADX INFO: renamed from: t */
    public azl f210409t;

    /* JADX INFO: renamed from: u */
    public Uri f210410u;

    /* JADX INFO: renamed from: v */
    public boolean f210411v;

    /* JADX INFO: renamed from: w */
    public Runnable f210412w;

    /* JADX INFO: renamed from: v.VTexturePlayer$a */
    public interface InterfaceC22697a {
    }

    /* JADX INFO: renamed from: v.VTexturePlayer$b */
    public interface InterfaceC22698b {
        /* JADX INFO: renamed from: d */
        void mo37119d();

        /* JADX INFO: renamed from: h */
        void mo37120h();

        void onComplete();

        void onError(int i, int i2);

        void onPause();

        void onResume();

        /* JADX INFO: renamed from: y */
        void mo37130y();
    }

    /* JADX INFO: renamed from: v.VTexturePlayer$c */
    public interface InterfaceC22699c {
        /* JADX INFO: renamed from: O */
        void mo37132O();

        /* JADX INFO: renamed from: a */
        void mo37133a();

        /* JADX INFO: renamed from: b */
        void mo37134b(int i, int i2);

        /* JADX INFO: renamed from: c */
        void mo37135c(long j);
    }

    public VTexturePlayer(Context context, InterfaceC22698b interfaceC22698b) {
        super(context);
        this.f210392c = false;
        this.f210393d = false;
        this.f210394e = false;
        this.f210395f = false;
        this.f210396g = true;
        this.f210397h = -1L;
        this.f210398i = -1L;
        this.f210399j = true;
        this.f210402m = "";
        this.f210403n = null;
        this.f210404o = -1.0f;
        setSurfaceTextureListener(this);
        this.f210405p = true;
        this.f210406q = false;
        this.f210411v = false;
        this.f210390a = interfaceC22698b;
    }

    /* JADX INFO: renamed from: h */
    public final void m224543h(int i, int i2, double d) {
        int i3;
        int i4;
        if (!this.f210392c ? i2 > (i3 = (int) (((double) i) * d)) : i2 <= (i3 = (int) (((double) i) * d))) {
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
    public void m224544i(boolean z) {
        Surface surface;
        l51.m152890J(this.f210412w);
        this.f210406q = false;
        this.f210408s = false;
        this.f210411v = false;
        this.f210405p = true;
        if (this.f210410u != null) {
            this.f210410u = null;
            this.f210402m = "";
        }
        azl azlVar = this.f210409t;
        if (azlVar != null) {
            try {
                azlVar.reset();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            if (z) {
                this.f210409t.release();
            }
        }
        if (!z || (surface = this.f210407r) == null) {
            return;
        }
        surface.release();
        this.f210407r = null;
    }

    /* JADX INFO: renamed from: j */
    public void m224545j() {
        Surface surface = this.f210407r;
        if (surface != null) {
            surface.release();
            this.f210407r = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m224546k(boolean z) {
        this.f210392c = z;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m224547l(int i) {
        if (this.f210407r != null || this.f210390a == null) {
            return;
        }
        o1j0.m165634h(i);
        this.f210390a.mo37119d();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m224548m(Boolean bool) {
        if (bool.booleanValue()) {
            this.f210399j = false;
        } else {
            this.f210399j = true;
            this.f210397h = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m224549n(String str, Object obj) {
        if (this.f210397h > 0) {
            this.f210397h = -1L;
        }
        if (this.f210402m.equals(str)) {
            this.f210409t.start();
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m224550o(Object obj, Integer num, Integer num2) {
        if (num.intValue() == 3) {
            this.f210390a.mo37130y();
            this.f210395f = true;
            this.f210409t.mo99483a(null);
            InterfaceC22699c interfaceC22699c = this.f210400k;
            if (interfaceC22699c != null) {
                interfaceC22699c.mo37133a();
            }
        }
        azl azlVar = this.f210409t;
        if (azlVar == null || !(azlVar instanceof cyh0)) {
            return;
        }
        if (num.intValue() == 701) {
            this.f210398i = SystemClock.elapsedRealtime();
            InterfaceC22699c interfaceC22699c2 = this.f210400k;
            if (interfaceC22699c2 != null) {
                interfaceC22699c2.mo37132O();
            }
        }
        if (num.intValue() == 702) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f210398i;
            InterfaceC22699c interfaceC22699c3 = this.f210400k;
            if (interfaceC22699c3 != null) {
                interfaceC22699c3.mo37135c(jElapsedRealtime);
            }
            this.f210398i = -1L;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.f210407r;
        if (surface != null) {
            surface.release();
        }
        this.f210407r = new Surface(surfaceTexture);
        l51.m152890J(this.f210412w);
        azl azlVar = this.f210409t;
        if (azlVar == null) {
            Uri uri = this.f210410u;
            if (uri == null || !uri.toString().startsWith("http")) {
                this.f210409t = new aqh0();
            } else {
                cyh0 cyh0Var = new cyh0();
                this.f210409t = cyh0Var;
                if (this.f210394e) {
                    cyh0Var.m113168j();
                }
            }
        } else {
            azlVar.reset();
        }
        this.f210409t.setSurface(this.f210407r);
        if (this.f210411v) {
            m224543h(i, i2, this.f210391b);
            m224555t();
        } else {
            if (!this.f210406q || this.f210390a == null) {
                return;
            }
            this.f210408s = false;
            this.f210405p = true;
            this.f210409t.reset();
            this.f210390a.mo37119d();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        azl azlVar = this.f210409t;
        if (azlVar == null) {
            return true;
        }
        azlVar.mo99487e();
        final azl azlVar2 = this.f210409t;
        xhi0.m211045a(new Runnable() { // from class: l.b0l0
            @Override // java.lang.Runnable
            public final void run() {
                azlVar2.release();
            }
        });
        this.f210409t = null;
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
            this.f210396g = true;
            this.f210397h = -1L;
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m224551p(Object obj, Integer num, Integer num2) {
        y20 y20Var;
        if (this.f210393d && num.intValue() == -541478725 && (y20Var = this.f210401l) != null) {
            y20Var.call(num);
        }
        this.f210390a.onError(num.intValue(), num2.intValue());
        this.f210405p = true;
        this.f210408s = false;
        this.f210409t.reset();
        this.f210390a.mo37119d();
        InterfaceC22699c interfaceC22699c = this.f210400k;
        if (interfaceC22699c != null) {
            interfaceC22699c.mo37134b(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m224552q(Object obj) {
        this.f210390a.onComplete();
        this.f210406q = true;
        this.f210408s = true;
        this.f210396g = true;
        this.f210397h = -1L;
    }

    /* JADX INFO: renamed from: r */
    public void m224553r() {
        this.f210411v = false;
        this.f210406q = true;
        if (this.f210410u != null) {
            azl azlVar = this.f210409t;
            if (azlVar != null) {
                if (azlVar.isPlaying()) {
                    this.f210409t.pause();
                } else if (!this.f210408s) {
                    this.f210405p = true;
                    this.f210409t.reset();
                    if (!this.f210395f) {
                        setVisibility(4);
                    }
                }
            }
            this.f210390a.onPause();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m224554s(Uri uri, double d, String str, boolean z, int i, final int i2) {
        azl azlVar;
        azl azlVar2;
        if (z) {
            o1j0.m165635i(i, true);
            setVisibility(4);
            return;
        }
        if (this.f210407r == null) {
            Runnable runnable = this.f210412w;
            if (runnable == null) {
                this.f210412w = new Runnable() { // from class: l.c0l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79280a.m224547l(i2);
                    }
                };
            } else {
                l51.m152890J(runnable);
            }
            l51.m152888H(getContext(), this.f210412w, 10000L);
        }
        setVisibility(0);
        if (this.f210410u == null) {
            this.f210410u = uri;
            this.f210391b = d;
            this.f210402m = str;
        } else if (!this.f210402m.equals(str)) {
            this.f210410u = uri;
            this.f210391b = d;
            this.f210402m = str;
            if (this.f210409t != null && this.f210407r != null) {
                if (m224556u()) {
                    this.f210409t.pause();
                }
                this.f210409t.reset();
            }
            this.f210405p = true;
            this.f210408s = false;
        }
        f210389x.onNext(uxj0.f181467a);
        this.f210406q = false;
        if (this.f210408s) {
            this.f210408s = false;
            if (this.f210407r != null && (azlVar2 = this.f210409t) != null) {
                azlVar2.start();
                this.f210390a.mo37130y();
                this.f210395f = true;
            }
        } else if (this.f210405p) {
            this.f210405p = false;
            m224543h(getWidth(), getHeight(), this.f210391b);
            this.f210390a.mo37120h();
            if (this.f210407r == null && isAvailable()) {
                onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
            }
            if (this.f210409t == null) {
                this.f210411v = true;
            } else {
                m224555t();
                this.f210396g = true;
                this.f210397h = -1L;
            }
        } else if (this.f210407r != null && (azlVar = this.f210409t) != null) {
            azlVar.start();
            this.f210390a.onResume();
        }
        cbl0.m108642n().m108646I(str);
        if (!this.f210396g) {
            this.f210397h = -1L;
            return;
        }
        this.f210396g = false;
        if (uri != null) {
            this.f210403n.first().subscribe(new y20() { // from class: l.d0l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84580a.m224548m((Boolean) obj);
                }
            });
        }
    }

    public void setIfUseTTDynamicCache(boolean z) {
        this.f210394e = z;
    }

    public void setIsInABGroup(boolean z) {
        this.f210393d = z;
    }

    public void setLooping(boolean z) {
        this.f210409t.setLooping(z);
    }

    public void setNetErrorListener(y20 y20Var) {
        this.f210401l = y20Var;
    }

    public void setOnBufferListener(InterfaceC22699c interfaceC22699c) {
        this.f210400k = interfaceC22699c;
    }

    public void setVolume(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        if (NullChecker.m82486a(this.f210409t)) {
            this.f210409t.setVolume(f);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m224555t() {
        try {
            this.f210411v = false;
            final String str = this.f210402m;
            this.f210409t.setDataSource(this.f210410u.toString());
            this.f210409t.mo99484b(new y20() { // from class: l.xzk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196887a.m224549n(str, obj);
                }
            });
            this.f210409t.mo99483a(new a30() { // from class: l.yzk0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f202201a.m224550o(obj, (Integer) obj2, (Integer) obj3);
                }
            });
            this.f210409t.mo99485c(new a30() { // from class: l.zzk0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f206715a.m224551p(obj, (Integer) obj2, (Integer) obj3);
                }
            });
            this.f210409t.mo99486d(new y20() { // from class: l.a0l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f67727a.m224552q(obj);
                }
            });
            this.f210409t.prepareAsync();
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            this.f210409t.reset();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m224556u() {
        azl azlVar = this.f210409t;
        return azlVar != null && azlVar.isPlaying();
    }

    /* JADX INFO: renamed from: v */
    public void m224557v() {
        try {
            azl azlVar = this.f210409t;
            if (azlVar != null) {
                azlVar.seekTo(0L);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("VTexturePlayer seekToZero exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m224558w(InterfaceC22697a interfaceC22697a, C22421c c22421c, float f) {
        this.f210403n = c22421c;
        this.f210404o = f;
    }

    public void setVolume(boolean z) {
        setVolume(z ? 0.0f : 1.0f);
    }
}
