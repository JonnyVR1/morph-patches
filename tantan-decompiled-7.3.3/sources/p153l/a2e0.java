package p153l;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class a2e0 implements iel0, gb4 {

    /* JADX INFO: renamed from: i */
    public int f67977i;

    /* JADX INFO: renamed from: j */
    public SurfaceTexture f67978j;

    /* JADX INFO: renamed from: m */
    @Nullable
    public byte[] f67981m;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f67969a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f67970b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final c5b0 f67971c = new c5b0();

    /* JADX INFO: renamed from: d */
    public final t7j f67972d = new t7j();

    /* JADX INFO: renamed from: e */
    public final wzi0<Long> f67973e = new wzi0<>();

    /* JADX INFO: renamed from: f */
    public final wzi0<a5b0> f67974f = new wzi0<>();

    /* JADX INFO: renamed from: g */
    public final float[] f67975g = new float[16];

    /* JADX INFO: renamed from: h */
    public final float[] f67976h = new float[16];

    /* JADX INFO: renamed from: k */
    public volatile int f67979k = 0;

    /* JADX INFO: renamed from: l */
    public int f67980l = -1;

    @Override // p153l.iel0
    /* JADX INFO: renamed from: a */
    public void mo10184a(long j, long j2, C1894k c1894k, @Nullable MediaFormat mediaFormat) {
        this.f67973e.m208726a(j2, Long.valueOf(j));
        m95658g(c1894k.f7795v, c1894k.f7796w, j2);
    }

    /* JADX INFO: renamed from: c */
    public void m95655c(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            GlUtil.m12183b();
        } catch (GlUtil.GlException e) {
            kyv.m152146d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f67969a.compareAndSet(true, false)) {
            ((SurfaceTexture) w11.m204369e(this.f67978j)).updateTexImage();
            try {
                GlUtil.m12183b();
            } catch (GlUtil.GlException e2) {
                kyv.m152146d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f67970b.compareAndSet(true, false)) {
                GlUtil.m12191j(this.f67975g);
            }
            long timestamp = this.f67978j.getTimestamp();
            Long lM208731g = this.f67973e.m208731g(timestamp);
            if (lM208731g != null) {
                this.f67972d.m189613c(this.f67975g, lM208731g.longValue());
            }
            a5b0 a5b0VarM208734j = this.f67974f.m208734j(timestamp);
            if (a5b0VarM208734j != null) {
                this.f67971c.m108026d(a5b0VarM208734j);
            }
        }
        Matrix.multiplyMM(this.f67976h, 0, fArr, 0, this.f67975g, 0);
        this.f67971c.m108024a(this.f67977i, this.f67976h, z);
    }

    /* JADX INFO: renamed from: d */
    public SurfaceTexture m95656d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.m12183b();
            this.f67971c.m108025b();
            GlUtil.m12183b();
            this.f67977i = GlUtil.m12187f();
        } catch (GlUtil.GlException e) {
            kyv.m152146d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f67977i);
        this.f67978j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l.z1e0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f202513a.f67969a.set(true);
            }
        });
        return this.f67978j;
    }

    @Override // p153l.gb4
    /* JADX INFO: renamed from: e */
    public void mo10185e(long j, float[] fArr) {
        this.f67972d.m189615e(j, fArr);
    }

    /* JADX INFO: renamed from: f */
    public void m95657f(int i) {
        this.f67979k = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m95658g(@Nullable byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f67981m;
        int i2 = this.f67980l;
        this.f67981m = bArr;
        if (i == -1) {
            i = this.f67979k;
        }
        this.f67980l = i;
        if (i2 == i && Arrays.equals(bArr2, this.f67981m)) {
            return;
        }
        byte[] bArr3 = this.f67981m;
        a5b0 a5b0VarM102559a = bArr3 != null ? b5b0.m102559a(bArr3, this.f67980l) : null;
        if (a5b0VarM102559a == null || !c5b0.m108023c(a5b0VarM102559a)) {
            a5b0VarM102559a = a5b0.m96043b(this.f67980l);
        }
        this.f67974f.m208726a(j, a5b0VarM102559a);
    }

    @Override // p153l.gb4
    /* JADX INFO: renamed from: h */
    public void mo10186h() {
        this.f67973e.m208728c();
        this.f67972d.m189614d();
        this.f67970b.set(true);
    }
}
