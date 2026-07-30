package com.sunshine.engine.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaPlayer;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.PlaybackException;
import com.sunshine.engine.base.AbstractC13647a;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.helpers.DefaultHandler;
import p153l.a2j0;
import p153l.cce;
import p153l.drf0;
import p153l.fz0;
import p153l.kk90;
import p153l.wg60;

/* JADX INFO: renamed from: com.sunshine.engine.base.a */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC13647a {

    /* JADX INFO: renamed from: a */
    public AbstractC13665s f56501a;

    /* JADX INFO: renamed from: b */
    public String f56502b;

    /* JADX INFO: renamed from: c */
    public String f56503c;

    /* JADX INFO: renamed from: d */
    public String f56504d;

    /* JADX INFO: renamed from: e */
    public Bitmap f56505e = null;

    /* JADX INFO: renamed from: f */
    public MediaPlayer f56506f = null;

    /* JADX INFO: renamed from: g */
    public float f56507g = 0.0f;

    /* JADX INFO: renamed from: h */
    public drf0<Integer> f56508h = new drf0<>(720, Integer.valueOf(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK));

    /* JADX INFO: renamed from: i */
    public fz0 f56509i = new fz0();

    /* JADX INFO: renamed from: j */
    public fz0 f56510j = new fz0();

    /* JADX INFO: renamed from: k */
    public String f56511k = LayoutType.center.toString();

    /* JADX INFO: renamed from: l */
    public boolean f56512l = true;

    /* JADX INFO: renamed from: m */
    public int f56513m = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;

    /* JADX INFO: renamed from: n */
    public boolean f56514n = false;

    /* JADX INFO: renamed from: o */
    protected long f56515o = -1;

    /* JADX INFO: renamed from: p */
    public kk90 f56516p = new kk90(Float.valueOf(0.0f), Float.valueOf(1.0f));

    /* JADX INFO: renamed from: q */
    private float f56517q = 0.0f;

    /* JADX INFO: renamed from: r */
    public boolean f56518r = false;

    /* JADX INFO: renamed from: s */
    public cce f56519s = new cce();

    /* JADX INFO: renamed from: t */
    public boolean f56520t = false;

    /* JADX INFO: renamed from: u */
    public Map<String, Bitmap> f56521u = new HashMap();

    /* JADX INFO: renamed from: v */
    protected boolean f56522v = true;

    /* JADX INFO: renamed from: w */
    public Map<String, C13664r.a> f56523w = new HashMap();

    /* JADX INFO: renamed from: x */
    public Map<String, a> f56524x = new HashMap();

    /* JADX INFO: renamed from: y */
    public Map<String, Rect> f56525y = new HashMap();

    /* JADX INFO: renamed from: z */
    protected Runnable f56526z = null;

    /* JADX INFO: renamed from: com.sunshine.engine.base.a$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.sunshine.engine.base.a$b */
    public interface b extends a {
        void onClick(String str);
    }

    /* JADX INFO: renamed from: com.sunshine.engine.base.a$c */
    public interface c extends a {
        /* JADX INFO: renamed from: a */
        void m82142a(String str, wg60 wg60Var);
    }

    /* JADX INFO: renamed from: com.sunshine.engine.base.a$d */
    public interface d extends a {
        /* JADX INFO: renamed from: b */
        void m82143b(String str, RectF rectF, int i, int i2);
    }

    public AbstractC13647a(AbstractC13665s abstractC13665s, String str, String str2, String str3) {
        this.f56501a = null;
        this.f56502b = null;
        this.f56503c = null;
        this.f56504d = null;
        this.f56501a = abstractC13665s;
        this.f56502b = str;
        this.f56503c = str2;
        this.f56504d = str3;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82132a(AbstractC13647a abstractC13647a, Bitmap bitmap, MediaPlayer mediaPlayer) {
        if (abstractC13647a.equals(abstractC13647a.f56501a.f56533e)) {
            abstractC13647a.f56505e = bitmap;
            abstractC13647a.f56506f = mediaPlayer;
            abstractC13647a.f56501a.mo82154b();
            abstractC13647a.f56501a.m82156g("in setSrcAsync set bmp").m82156g("   this.hashCode()=" + abstractC13647a.hashCode()).m82156g("   helper.entity.hashCode()=" + abstractC13647a.f56501a.f56533e.hashCode()).m82156g("   bmp.hashCode()=" + bitmap.hashCode());
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            AbstractC13665s abstractC13665s = abstractC13647a.f56501a;
            T t = abstractC13665s.f56533e;
            AbstractC13665s abstractC13665sM82156g = abstractC13665s.m82156g("in setSrcAsync recycle bmp").m82156g("   this.hashCode()=" + abstractC13647a.hashCode());
            StringBuilder sb = new StringBuilder("   helper.entity.hashCode()=");
            sb.append(t == 0 ? -1 : t.hashCode());
            abstractC13665sM82156g.m82156g(sb.toString()).m82156g("   bmp.hashCode()=" + bitmap.hashCode());
            bitmap.recycle();
        }
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82133b() {
        if (this.f56505e != null) {
            this.f56501a.m82156g("destroy bmp.hashCode()=" + this.f56505e.hashCode());
            this.f56505e.recycle();
            this.f56505e = null;
        }
        MediaPlayer mediaPlayer = this.f56506f;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f56506f.release();
            this.f56506f = null;
        }
        if (this.f56522v) {
            for (Bitmap bitmap : this.f56521u.values()) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
        this.f56521u.clear();
        Runnable runnable = this.f56526z;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo82134c(Canvas canvas);

    /* JADX INFO: renamed from: d */
    public boolean mo82135d(Canvas canvas, long j) {
        Bitmap bitmap;
        if (a2j0.m95702e(this.f56507g) || (bitmap = this.f56505e) == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            this.f56501a.m82156g("before draw").m82156g("   bmp.isRecycled()").m82156g("   entity.configPath=" + this.f56502b).m82156g("   entity.picPath=" + this.f56503c).m82156g("   entity.hashCode()=" + hashCode()).m82156g("   bmp.hashCode()=" + this.f56505e.hashCode()).m82160k();
            this.f56505e = null;
            return false;
        }
        if (this.f56515o == -1) {
            this.f56515o = j;
        }
        int i = this.f56513m;
        kk90 kk90Var = this.f56516p;
        if (i > 0) {
            this.f56517q = kk90Var.mo150085a((j - this.f56515o) / i).floatValue();
        } else {
            this.f56517q = kk90Var.m167992g().floatValue();
        }
        this.f56517q = a2j0.m95700c(this.f56517q, this.f56516p.m167988c().floatValue(), this.f56516p.m167992g().floatValue());
        try {
            mo82134c(canvas);
            if (this.f56506f != null && a2j0.m95702e(this.f56517q) && this.f56513m > 0) {
                if (this.f56506f.isPlaying()) {
                    this.f56506f.stop();
                }
                this.f56506f.start();
            }
            return mo82139h(this.f56517q);
        } catch (Throwable th) {
            this.f56501a.m82156g("in draw").m82156g("   bmp.isRecycled()").m82156g("   exp=" + th.toString()).m82156g("   entity.configPath=" + this.f56502b).m82156g("   entity.picPath=" + this.f56503c).m82156g("   entity.hashCode()=" + hashCode()).m82156g("   bmp.hashCode()=" + this.f56505e.hashCode()).m82160k();
            this.f56505e = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract DefaultHandler mo82136e();

    /* JADX INFO: renamed from: f */
    public float m82137f() {
        return this.f56517q;
    }

    /* JADX INFO: renamed from: g */
    public void m82138g(Matrix matrix) {
        matrix.reset();
        fz0 fz0Var = this.f56510j;
        matrix.preTranslate(fz0Var.f101431b, fz0Var.f101433d);
        float f = this.f56507g;
        matrix.preScale(f, f);
        cce cceVar = this.f56519s;
        matrix.mapRect(cceVar.f80952c, cceVar.f80950a);
        cce cceVar2 = this.f56519s;
        PointF pointF = cceVar2.f80954e;
        PointF pointF2 = cceVar2.f80951b;
        float f2 = pointF2.x;
        float f3 = this.f56507g;
        fz0 fz0Var2 = this.f56510j;
        pointF.x = (f2 * f3) + fz0Var2.f101431b;
        pointF.y = (pointF2.y * f3) + fz0Var2.f101433d;
        matrix.preRotate(cceVar2.f80953d, pointF2.x, pointF2.y);
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo82139h(float f);

    /* JADX INFO: renamed from: i */
    public void mo82140i(float f, float f2, int i) {
        this.f56515o = -1L;
        this.f56517q = f;
        if (this.f56514n) {
            this.f56512l = true;
            this.f56516p.mo150086i(Float.valueOf(f), Float.valueOf(f2));
        } else {
            this.f56512l = false;
            this.f56513m = i;
            this.f56516p.mo150086i(Float.valueOf(f), Float.valueOf(f2));
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo82141j(final Bitmap bitmap, final MediaPlayer mediaPlayer) {
        AbstractC13665s.f56530g.post(new Runnable() { // from class: l.s2f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13647a.m82132a(this.f165882a, bitmap, mediaPlayer);
            }
        });
    }
}
