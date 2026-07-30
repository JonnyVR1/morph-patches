package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.sunshine.engine.base.C13664r;

/* JADX INFO: loaded from: classes11.dex */
public class wg60 extends mrf0 {

    /* JADX INFO: renamed from: e */
    protected int f188913e = 1000;

    /* JADX INFO: renamed from: f */
    protected long f188914f = -1;

    /* JADX INFO: renamed from: g */
    protected Rect f188915g = new Rect();

    /* JADX INFO: renamed from: h */
    protected io0 f188916h = new io0();

    /* JADX INFO: renamed from: i */
    public String f188917i = null;

    /* JADX INFO: renamed from: a */
    public boolean m206178a(v1e0 v1e0Var, Canvas canvas, long j) {
        this.f138364b.reset();
        this.f138363a = false;
        this.f138365c.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.f188914f == -1) {
            this.f188914f = j;
        }
        String str = this.f188917i;
        if (str == null) {
            float f = (j - this.f188914f) / this.f188913e;
            if (f > 1.0f) {
                m206179b();
                return true;
            }
            if (this.f188916h.m141241a(f, v1e0Var)) {
                this.f138363a = true;
                this.f138365c.set(v1e0Var.f56519s.f80950a);
                v1e0Var.m82138g(this.f138364b);
                C13664r.m82144a(canvas, v1e0Var.f56505e, this.f188915g, v1e0Var.f56519s);
            }
            return false;
        }
        Bitmap bitmap = v1e0Var.f56521u.get(str);
        C13664r.a aVar = bitmap == null ? v1e0Var.f56523w.get(this.f188917i) : null;
        if (bitmap == null && aVar == null) {
            return false;
        }
        float f2 = (j - this.f188914f) / this.f188913e;
        if (f2 > 1.0f) {
            m206179b();
            return true;
        }
        if (this.f188916h.m141241a(f2, v1e0Var)) {
            this.f138363a = true;
            this.f138365c.set(v1e0Var.f56519s.f80950a);
            v1e0Var.m82138g(this.f138364b);
            if (bitmap != null) {
                C13664r.m82144a(canvas, bitmap, null, v1e0Var.f56519s);
            } else {
                C13664r.m82145b(canvas, aVar, f2, v1e0Var);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m206179b() {
        this.f138363a = false;
        this.f138366d = null;
        this.f188914f = -1L;
    }

    /* JADX INFO: renamed from: c */
    public void m206180c(Rect rect) {
        this.f188915g.set(rect);
    }
}
