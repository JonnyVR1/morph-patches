package p149l;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ytd0 implements e5l0, ha4 {

    /* JADX INFO: renamed from: i */
    public int f199907i;

    /* JADX INFO: renamed from: j */
    public SurfaceTexture f199908j;

    /* JADX INFO: renamed from: m */
    @Nullable
    public byte[] f199911m;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f199899a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f199900b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final ywa0 f199901c = new ywa0();

    /* JADX INFO: renamed from: d */
    public final y4j f199902d = new y4j();

    /* JADX INFO: renamed from: e */
    public final tqi0<Long> f199903e = new tqi0<>();

    /* JADX INFO: renamed from: f */
    public final tqi0<wwa0> f199904f = new tqi0<>();

    /* JADX INFO: renamed from: g */
    public final float[] f199905g = new float[16];

    /* JADX INFO: renamed from: h */
    public final float[] f199906h = new float[16];

    /* JADX INFO: renamed from: k */
    public volatile int f199909k = 0;

    /* JADX INFO: renamed from: l */
    public int f199910l = -1;

    @Override // p149l.e5l0
    /* JADX INFO: renamed from: a */
    public void mo10130a(long j, long j2, C1871k c1871k, @Nullable MediaFormat mediaFormat) {
        this.f199903e.m190113a(j2, Long.valueOf(j));
        m216009g(c1871k.f7758v, c1871k.f7759w, j2);
    }

    /* JADX INFO: renamed from: c */
    public void m216006c(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            GlUtil.m12129b();
        } catch (GlUtil.GlException e) {
            jwv.m143684d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f199899a.compareAndSet(true, false)) {
            ((SurfaceTexture) p11.m167011e(this.f199908j)).updateTexImage();
            try {
                GlUtil.m12129b();
            } catch (GlUtil.GlException e2) {
                jwv.m143684d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f199900b.compareAndSet(true, false)) {
                GlUtil.m12137j(this.f199905g);
            }
            long timestamp = this.f199908j.getTimestamp();
            Long lM190118g = this.f199903e.m190118g(timestamp);
            if (lM190118g != null) {
                this.f199902d.m212913c(this.f199905g, lM190118g.longValue());
            }
            wwa0 wwa0VarM190121j = this.f199904f.m190121j(timestamp);
            if (wwa0VarM190121j != null) {
                this.f199901c.m216303d(wwa0VarM190121j);
            }
        }
        Matrix.multiplyMM(this.f199906h, 0, fArr, 0, this.f199905g, 0);
        this.f199901c.m216301a(this.f199907i, this.f199906h, z);
    }

    /* JADX INFO: renamed from: d */
    public SurfaceTexture m216007d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.m12129b();
            this.f199901c.m216302b();
            GlUtil.m12129b();
            this.f199907i = GlUtil.m12133f();
        } catch (GlUtil.GlException e) {
            jwv.m143684d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f199907i);
        this.f199908j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: l.xtd0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f194372a.f199899a.set(true);
            }
        });
        return this.f199908j;
    }

    @Override // p149l.ha4
    /* JADX INFO: renamed from: e */
    public void mo10131e(long j, float[] fArr) {
        this.f199902d.m212915e(j, fArr);
    }

    /* JADX INFO: renamed from: f */
    public void m216008f(int i) {
        this.f199909k = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m216009g(@Nullable byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f199911m;
        int i2 = this.f199910l;
        this.f199911m = bArr;
        if (i == -1) {
            i = this.f199909k;
        }
        this.f199910l = i;
        if (i2 == i && Arrays.equals(bArr2, this.f199911m)) {
            return;
        }
        byte[] bArr3 = this.f199911m;
        wwa0 wwa0VarM211317a = bArr3 != null ? xwa0.m211317a(bArr3, this.f199910l) : null;
        if (wwa0VarM211317a == null || !ywa0.m216300c(wwa0VarM211317a)) {
            wwa0VarM211317a = wwa0.m205848b(this.f199910l);
        }
        this.f199904f.m190113a(j, wwa0VarM211317a);
    }

    @Override // p149l.ha4
    /* JADX INFO: renamed from: h */
    public void mo10132h() {
        this.f199903e.m190115c();
        this.f199902d.m212914d();
        this.f199900b.set(true);
    }
}
