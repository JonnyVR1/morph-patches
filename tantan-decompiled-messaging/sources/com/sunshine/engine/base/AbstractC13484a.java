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
import com.sunshine.engine.base.AbstractC13484a;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.helpers.DefaultHandler;
import p149l.gc90;
import p149l.r860;
import p149l.uif0;
import p149l.xsi0;
import p149l.yae;
import p149l.yy0;

/* JADX INFO: renamed from: com.sunshine.engine.base.a */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC13484a {

    /* JADX INFO: renamed from: a */
    public AbstractC13502s f55653a;

    /* JADX INFO: renamed from: b */
    public String f55654b;

    /* JADX INFO: renamed from: c */
    public String f55655c;

    /* JADX INFO: renamed from: d */
    public String f55656d;

    /* JADX INFO: renamed from: e */
    public Bitmap f55657e = null;

    /* JADX INFO: renamed from: f */
    public MediaPlayer f55658f = null;

    /* JADX INFO: renamed from: g */
    public float f55659g = 0.0f;

    /* JADX INFO: renamed from: h */
    public uif0<Integer> f55660h = new uif0<>(720, Integer.valueOf(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK));

    /* JADX INFO: renamed from: i */
    public yy0 f55661i = new yy0();

    /* JADX INFO: renamed from: j */
    public yy0 f55662j = new yy0();

    /* JADX INFO: renamed from: k */
    public String f55663k = LayoutType.center.toString();

    /* JADX INFO: renamed from: l */
    public boolean f55664l = true;

    /* JADX INFO: renamed from: m */
    public int f55665m = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;

    /* JADX INFO: renamed from: n */
    public boolean f55666n = false;

    /* JADX INFO: renamed from: o */
    protected long f55667o = -1;

    /* JADX INFO: renamed from: p */
    public gc90 f55668p = new gc90(Float.valueOf(0.0f), Float.valueOf(1.0f));

    /* JADX INFO: renamed from: q */
    private float f55669q = 0.0f;

    /* JADX INFO: renamed from: r */
    public boolean f55670r = false;

    /* JADX INFO: renamed from: s */
    public yae f55671s = new yae();

    /* JADX INFO: renamed from: t */
    public boolean f55672t = false;

    /* JADX INFO: renamed from: u */
    public Map<String, Bitmap> f55673u = new HashMap();

    /* JADX INFO: renamed from: v */
    protected boolean f55674v = true;

    /* JADX INFO: renamed from: w */
    public Map<String, C13501r.a> f55675w = new HashMap();

    /* JADX INFO: renamed from: x */
    public Map<String, a> f55676x = new HashMap();

    /* JADX INFO: renamed from: y */
    public Map<String, Rect> f55677y = new HashMap();

    /* JADX INFO: renamed from: z */
    protected Runnable f55678z = null;

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
        void m80959a(String str, r860 r860Var);
    }

    /* JADX INFO: renamed from: com.sunshine.engine.base.a$d */
    public interface d extends a {
        /* JADX INFO: renamed from: b */
        void m80960b(String str, RectF rectF, int i, int i2);
    }

    public AbstractC13484a(AbstractC13502s abstractC13502s, String str, String str2, String str3) {
        this.f55653a = null;
        this.f55654b = null;
        this.f55655c = null;
        this.f55656d = null;
        this.f55653a = abstractC13502s;
        this.f55654b = str;
        this.f55655c = str2;
        this.f55656d = str3;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80949a(AbstractC13484a abstractC13484a, Bitmap bitmap, MediaPlayer mediaPlayer) {
        if (abstractC13484a.equals(abstractC13484a.f55653a.f55685e)) {
            abstractC13484a.f55657e = bitmap;
            abstractC13484a.f55658f = mediaPlayer;
            abstractC13484a.f55653a.mo80971b();
            abstractC13484a.f55653a.m80973g("in setSrcAsync set bmp").m80973g("   this.hashCode()=" + abstractC13484a.hashCode()).m80973g("   helper.entity.hashCode()=" + abstractC13484a.f55653a.f55685e.hashCode()).m80973g("   bmp.hashCode()=" + bitmap.hashCode());
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            AbstractC13502s abstractC13502s = abstractC13484a.f55653a;
            T t = abstractC13502s.f55685e;
            AbstractC13502s abstractC13502sM80973g = abstractC13502s.m80973g("in setSrcAsync recycle bmp").m80973g("   this.hashCode()=" + abstractC13484a.hashCode());
            StringBuilder sb = new StringBuilder("   helper.entity.hashCode()=");
            sb.append(t == 0 ? -1 : t.hashCode());
            abstractC13502sM80973g.m80973g(sb.toString()).m80973g("   bmp.hashCode()=" + bitmap.hashCode());
            bitmap.recycle();
        }
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m80950b() {
        if (this.f55657e != null) {
            this.f55653a.m80973g("destroy bmp.hashCode()=" + this.f55657e.hashCode());
            this.f55657e.recycle();
            this.f55657e = null;
        }
        MediaPlayer mediaPlayer = this.f55658f;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f55658f.release();
            this.f55658f = null;
        }
        if (this.f55674v) {
            for (Bitmap bitmap : this.f55673u.values()) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
        this.f55673u.clear();
        Runnable runnable = this.f55678z;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo80951c(Canvas canvas);

    /* JADX INFO: renamed from: d */
    public boolean mo80952d(Canvas canvas, long j) {
        Bitmap bitmap;
        if (xsi0.m210764e(this.f55659g) || (bitmap = this.f55657e) == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            this.f55653a.m80973g("before draw").m80973g("   bmp.isRecycled()").m80973g("   entity.configPath=" + this.f55654b).m80973g("   entity.picPath=" + this.f55655c).m80973g("   entity.hashCode()=" + hashCode()).m80973g("   bmp.hashCode()=" + this.f55657e.hashCode()).m80977k();
            this.f55657e = null;
            return false;
        }
        if (this.f55667o == -1) {
            this.f55667o = j;
        }
        int i = this.f55665m;
        gc90 gc90Var = this.f55668p;
        if (i > 0) {
            this.f55669q = gc90Var.mo125466a((j - this.f55667o) / i).floatValue();
        } else {
            this.f55669q = gc90Var.m145368g().floatValue();
        }
        this.f55669q = xsi0.m210762c(this.f55669q, this.f55668p.m145364c().floatValue(), this.f55668p.m145368g().floatValue());
        try {
            mo80951c(canvas);
            if (this.f55658f != null && xsi0.m210764e(this.f55669q) && this.f55665m > 0) {
                if (this.f55658f.isPlaying()) {
                    this.f55658f.stop();
                }
                this.f55658f.start();
            }
            return mo80956h(this.f55669q);
        } catch (Throwable th) {
            this.f55653a.m80973g("in draw").m80973g("   bmp.isRecycled()").m80973g("   exp=" + th.toString()).m80973g("   entity.configPath=" + this.f55654b).m80973g("   entity.picPath=" + this.f55655c).m80973g("   entity.hashCode()=" + hashCode()).m80973g("   bmp.hashCode()=" + this.f55657e.hashCode()).m80977k();
            this.f55657e = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract DefaultHandler mo80953e();

    /* JADX INFO: renamed from: f */
    public float m80954f() {
        return this.f55669q;
    }

    /* JADX INFO: renamed from: g */
    public void m80955g(Matrix matrix) {
        matrix.reset();
        yy0 yy0Var = this.f55662j;
        matrix.preTranslate(yy0Var.f200685b, yy0Var.f200687d);
        float f = this.f55659g;
        matrix.preScale(f, f);
        yae yaeVar = this.f55671s;
        matrix.mapRect(yaeVar.f197187c, yaeVar.f197185a);
        yae yaeVar2 = this.f55671s;
        PointF pointF = yaeVar2.f197189e;
        PointF pointF2 = yaeVar2.f197186b;
        float f2 = pointF2.x;
        float f3 = this.f55659g;
        yy0 yy0Var2 = this.f55662j;
        pointF.x = (f2 * f3) + yy0Var2.f200685b;
        pointF.y = (pointF2.y * f3) + yy0Var2.f200687d;
        matrix.preRotate(yaeVar2.f197188d, pointF2.x, pointF2.y);
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo80956h(float f);

    /* JADX INFO: renamed from: i */
    public void mo80957i(float f, float f2, int i) {
        this.f55667o = -1L;
        this.f55669q = f;
        if (this.f55666n) {
            this.f55664l = true;
            this.f55668p.mo125467i(Float.valueOf(f), Float.valueOf(f2));
        } else {
            this.f55664l = false;
            this.f55665m = i;
            this.f55668p.mo125467i(Float.valueOf(f), Float.valueOf(f2));
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo80958j(final Bitmap bitmap, final MediaPlayer mediaPlayer) {
        AbstractC13502s.f55682g.post(new Runnable() { // from class: l.n1f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13484a.m80949a(this.f136625a, bitmap, mediaPlayer);
            }
        });
    }
}
