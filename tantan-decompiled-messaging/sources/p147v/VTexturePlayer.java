package p147v;

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
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.e30;
import p149l.e51;
import p149l.g30;
import p149l.iwl;
import p149l.lsi0;
import p149l.roj0;
import p149l.thh0;
import p149l.vph0;
import p149l.x1l0;
import p149l.x8i0;

/* JADX INFO: loaded from: classes3.dex */
public class VTexturePlayer extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: x */
    public static C22393b<roj0> f209467x = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public final InterfaceC22583b f209468a;

    /* JADX INFO: renamed from: b */
    public double f209469b;

    /* JADX INFO: renamed from: c */
    public boolean f209470c;

    /* JADX INFO: renamed from: d */
    public boolean f209471d;

    /* JADX INFO: renamed from: e */
    public boolean f209472e;

    /* JADX INFO: renamed from: f */
    public boolean f209473f;

    /* JADX INFO: renamed from: g */
    public boolean f209474g;

    /* JADX INFO: renamed from: h */
    public long f209475h;

    /* JADX INFO: renamed from: i */
    public long f209476i;

    /* JADX INFO: renamed from: j */
    public boolean f209477j;

    /* JADX INFO: renamed from: k */
    public InterfaceC22584c f209478k;

    /* JADX INFO: renamed from: l */
    public e30 f209479l;

    /* JADX INFO: renamed from: m */
    public String f209480m;

    /* JADX INFO: renamed from: n */
    public C22306c<Boolean> f209481n;

    /* JADX INFO: renamed from: o */
    public float f209482o;

    /* JADX INFO: renamed from: p */
    public boolean f209483p;

    /* JADX INFO: renamed from: q */
    public boolean f209484q;

    /* JADX INFO: renamed from: r */
    public Surface f209485r;

    /* JADX INFO: renamed from: s */
    public boolean f209486s;

    /* JADX INFO: renamed from: t */
    public iwl f209487t;

    /* JADX INFO: renamed from: u */
    public Uri f209488u;

    /* JADX INFO: renamed from: v */
    public boolean f209489v;

    /* JADX INFO: renamed from: w */
    public Runnable f209490w;

    /* JADX INFO: renamed from: v.VTexturePlayer$a */
    public interface InterfaceC22582a {
    }

    /* JADX INFO: renamed from: v.VTexturePlayer$b */
    public interface InterfaceC22583b {
        /* JADX INFO: renamed from: d */
        void mo36116d();

        /* JADX INFO: renamed from: h */
        void mo36117h();

        void onComplete();

        void onError(int i, int i2);

        void onPause();

        void onResume();

        /* JADX INFO: renamed from: y */
        void mo36127y();
    }

    /* JADX INFO: renamed from: v.VTexturePlayer$c */
    public interface InterfaceC22584c {
        /* JADX INFO: renamed from: O */
        void mo36129O();

        /* JADX INFO: renamed from: a */
        void mo36130a();

        /* JADX INFO: renamed from: b */
        void mo36131b(int i, int i2);

        /* JADX INFO: renamed from: c */
        void mo36132c(long j);
    }

    public VTexturePlayer(Context context, InterfaceC22583b interfaceC22583b) {
        super(context);
        this.f209470c = false;
        this.f209471d = false;
        this.f209472e = false;
        this.f209473f = false;
        this.f209474g = true;
        this.f209475h = -1L;
        this.f209476i = -1L;
        this.f209477j = true;
        this.f209480m = "";
        this.f209481n = null;
        this.f209482o = -1.0f;
        setSurfaceTextureListener(this);
        this.f209483p = true;
        this.f209484q = false;
        this.f209489v = false;
        this.f209468a = interfaceC22583b;
    }

    /* JADX INFO: renamed from: h */
    public final void m223297h(int i, int i2, double d) {
        int i3;
        int i4;
        if (!this.f209470c ? i2 > (i3 = (int) (((double) i) * d)) : i2 <= (i3 = (int) (((double) i) * d))) {
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
    public void m223298i(boolean z) {
        Surface surface;
        e51.m114745J(this.f209490w);
        this.f209484q = false;
        this.f209486s = false;
        this.f209489v = false;
        this.f209483p = true;
        if (this.f209488u != null) {
            this.f209488u = null;
            this.f209480m = "";
        }
        iwl iwlVar = this.f209487t;
        if (iwlVar != null) {
            try {
                iwlVar.reset();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            if (z) {
                this.f209487t.release();
            }
        }
        if (!z || (surface = this.f209485r) == null) {
            return;
        }
        surface.release();
        this.f209485r = null;
    }

    /* JADX INFO: renamed from: j */
    public void m223299j() {
        Surface surface = this.f209485r;
        if (surface != null) {
            surface.release();
            this.f209485r = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m223300k(boolean z) {
        this.f209470c = z;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m223301l(int i) {
        if (this.f209485r != null || this.f209468a == null) {
            return;
        }
        lsi0.m151578h(i);
        this.f209468a.mo36116d();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m223302m(Boolean bool) {
        if (bool.booleanValue()) {
            this.f209477j = false;
        } else {
            this.f209477j = true;
            this.f209475h = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m223303n(String str, Object obj) {
        if (this.f209475h > 0) {
            this.f209475h = -1L;
        }
        if (this.f209480m.equals(str)) {
            this.f209487t.start();
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m223304o(Object obj, Integer num, Integer num2) {
        if (num.intValue() == 3) {
            this.f209468a.mo36127y();
            this.f209473f = true;
            this.f209487t.mo138750a(null);
            InterfaceC22584c interfaceC22584c = this.f209478k;
            if (interfaceC22584c != null) {
                interfaceC22584c.mo36130a();
            }
        }
        iwl iwlVar = this.f209487t;
        if (iwlVar == null || !(iwlVar instanceof vph0)) {
            return;
        }
        if (num.intValue() == 701) {
            this.f209476i = SystemClock.elapsedRealtime();
            InterfaceC22584c interfaceC22584c2 = this.f209478k;
            if (interfaceC22584c2 != null) {
                interfaceC22584c2.mo36129O();
            }
        }
        if (num.intValue() == 702) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f209476i;
            InterfaceC22584c interfaceC22584c3 = this.f209478k;
            if (interfaceC22584c3 != null) {
                interfaceC22584c3.mo36132c(jElapsedRealtime);
            }
            this.f209476i = -1L;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.f209485r;
        if (surface != null) {
            surface.release();
        }
        this.f209485r = new Surface(surfaceTexture);
        e51.m114745J(this.f209490w);
        iwl iwlVar = this.f209487t;
        if (iwlVar == null) {
            Uri uri = this.f209488u;
            if (uri == null || !uri.toString().startsWith("http")) {
                this.f209487t = new thh0();
            } else {
                vph0 vph0Var = new vph0();
                this.f209487t = vph0Var;
                if (this.f209472e) {
                    vph0Var.m199240j();
                }
            }
        } else {
            iwlVar.reset();
        }
        this.f209487t.setSurface(this.f209485r);
        if (this.f209489v) {
            m223297h(i, i2, this.f209469b);
            m223309t();
        } else {
            if (!this.f209484q || this.f209468a == null) {
                return;
            }
            this.f209486s = false;
            this.f209483p = true;
            this.f209487t.reset();
            this.f209468a.mo36116d();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        iwl iwlVar = this.f209487t;
        if (iwlVar == null) {
            return true;
        }
        iwlVar.mo138754e();
        final iwl iwlVar2 = this.f209487t;
        x8i0.m207417a(new Runnable() { // from class: l.vqk0
            @Override // java.lang.Runnable
            public final void run() {
                iwlVar2.release();
            }
        });
        this.f209487t = null;
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
            this.f209474g = true;
            this.f209475h = -1L;
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m223305p(Object obj, Integer num, Integer num2) {
        e30 e30Var;
        if (this.f209471d && num.intValue() == -541478725 && (e30Var = this.f209479l) != null) {
            e30Var.call(num);
        }
        this.f209468a.onError(num.intValue(), num2.intValue());
        this.f209483p = true;
        this.f209486s = false;
        this.f209487t.reset();
        this.f209468a.mo36116d();
        InterfaceC22584c interfaceC22584c = this.f209478k;
        if (interfaceC22584c != null) {
            interfaceC22584c.mo36131b(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m223306q(Object obj) {
        this.f209468a.onComplete();
        this.f209484q = true;
        this.f209486s = true;
        this.f209474g = true;
        this.f209475h = -1L;
    }

    /* JADX INFO: renamed from: r */
    public void m223307r() {
        this.f209489v = false;
        this.f209484q = true;
        if (this.f209488u != null) {
            iwl iwlVar = this.f209487t;
            if (iwlVar != null) {
                if (iwlVar.isPlaying()) {
                    this.f209487t.pause();
                } else if (!this.f209486s) {
                    this.f209483p = true;
                    this.f209487t.reset();
                    if (!this.f209473f) {
                        setVisibility(4);
                    }
                }
            }
            this.f209468a.onPause();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m223308s(Uri uri, double d, String str, boolean z, int i, final int i2) {
        iwl iwlVar;
        iwl iwlVar2;
        if (z) {
            lsi0.m151579i(i, true);
            setVisibility(4);
            return;
        }
        if (this.f209485r == null) {
            Runnable runnable = this.f209490w;
            if (runnable == null) {
                this.f209490w = new Runnable() { // from class: l.wqk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f187700a.m223301l(i2);
                    }
                };
            } else {
                e51.m114745J(runnable);
            }
            e51.m114743H(getContext(), this.f209490w, 10000L);
        }
        setVisibility(0);
        if (this.f209488u == null) {
            this.f209488u = uri;
            this.f209469b = d;
            this.f209480m = str;
        } else if (!this.f209480m.equals(str)) {
            this.f209488u = uri;
            this.f209469b = d;
            this.f209480m = str;
            if (this.f209487t != null && this.f209485r != null) {
                if (m223310u()) {
                    this.f209487t.pause();
                }
                this.f209487t.reset();
            }
            this.f209483p = true;
            this.f209486s = false;
        }
        f209467x.onNext(roj0.f160388a);
        this.f209484q = false;
        if (this.f209486s) {
            this.f209486s = false;
            if (this.f209485r != null && (iwlVar2 = this.f209487t) != null) {
                iwlVar2.start();
                this.f209468a.mo36127y();
                this.f209473f = true;
            }
        } else if (this.f209483p) {
            this.f209483p = false;
            m223297h(getWidth(), getHeight(), this.f209469b);
            this.f209468a.mo36117h();
            if (this.f209485r == null && isAvailable()) {
                onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
            }
            if (this.f209487t == null) {
                this.f209489v = true;
            } else {
                m223309t();
                this.f209474g = true;
                this.f209475h = -1L;
            }
        } else if (this.f209485r != null && (iwlVar = this.f209487t) != null) {
            iwlVar.start();
            this.f209468a.onResume();
        }
        x1l0.m206744n().m206748I(str);
        if (!this.f209474g) {
            this.f209475h = -1L;
            return;
        }
        this.f209474g = false;
        if (uri != null) {
            this.f209481n.first().subscribe(new e30() { // from class: l.xqk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194019a.m223302m((Boolean) obj);
                }
            });
        }
    }

    public void setIfUseTTDynamicCache(boolean z) {
        this.f209472e = z;
    }

    public void setIsInABGroup(boolean z) {
        this.f209471d = z;
    }

    public void setLooping(boolean z) {
        this.f209487t.setLooping(z);
    }

    public void setNetErrorListener(e30 e30Var) {
        this.f209479l = e30Var;
    }

    public void setOnBufferListener(InterfaceC22584c interfaceC22584c) {
        this.f209478k = interfaceC22584c;
    }

    public void setVolume(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        if (NullChecker.m81303a(this.f209487t)) {
            this.f209487t.setVolume(f);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m223309t() {
        try {
            this.f209489v = false;
            final String str = this.f209480m;
            this.f209487t.setDataSource(this.f209488u.toString());
            this.f209487t.mo138751b(new e30() { // from class: l.rqk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160668a.m223303n(str, obj);
                }
            });
            this.f209487t.mo138750a(new g30() { // from class: l.sqk0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f165991a.m223304o(obj, (Integer) obj2, (Integer) obj3);
                }
            });
            this.f209487t.mo138752c(new g30() { // from class: l.tqk0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f171600a.m223305p(obj, (Integer) obj2, (Integer) obj3);
                }
            });
            this.f209487t.mo138753d(new e30() { // from class: l.uqk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177756a.m223306q(obj);
                }
            });
            this.f209487t.prepareAsync();
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            this.f209487t.reset();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m223310u() {
        iwl iwlVar = this.f209487t;
        return iwlVar != null && iwlVar.isPlaying();
    }

    /* JADX INFO: renamed from: v */
    public void m223311v() {
        try {
            iwl iwlVar = this.f209487t;
            if (iwlVar != null) {
                iwlVar.seekTo(0L);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("VTexturePlayer seekToZero exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m223312w(InterfaceC22582a interfaceC22582a, C22306c c22306c, float f) {
        this.f209481n = c22306c;
        this.f209482o = f;
    }

    public void setVolume(boolean z) {
        setVolume(z ? 0.0f : 1.0f);
    }
}
