package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.sunshine.engine.base.C13501r;

/* JADX INFO: loaded from: classes13.dex */
public class r860 extends djf0 {

    /* JADX INFO: renamed from: e */
    protected int f158150e = 1000;

    /* JADX INFO: renamed from: f */
    protected long f158151f = -1;

    /* JADX INFO: renamed from: g */
    protected Rect f158152g = new Rect();

    /* JADX INFO: renamed from: h */
    protected mo0 f158153h = new mo0();

    /* JADX INFO: renamed from: i */
    public String f158154i = null;

    /* JADX INFO: renamed from: a */
    public boolean m178240a(ttd0 ttd0Var, Canvas canvas, long j) {
        this.f86529b.reset();
        this.f86528a = false;
        this.f86530c.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.f158151f == -1) {
            this.f158151f = j;
        }
        String str = this.f158154i;
        if (str == null) {
            float f = (j - this.f158151f) / this.f158150e;
            if (f > 1.0f) {
                m178241b();
                return true;
            }
            if (this.f158153h.m155571a(f, ttd0Var)) {
                this.f86528a = true;
                this.f86530c.set(ttd0Var.f55671s.f197185a);
                ttd0Var.m80955g(this.f86529b);
                C13501r.m80961a(canvas, ttd0Var.f55657e, this.f158152g, ttd0Var.f55671s);
            }
            return false;
        }
        Bitmap bitmap = ttd0Var.f55673u.get(str);
        C13501r.a aVar = bitmap == null ? ttd0Var.f55675w.get(this.f158154i) : null;
        if (bitmap == null && aVar == null) {
            return false;
        }
        float f2 = (j - this.f158151f) / this.f158150e;
        if (f2 > 1.0f) {
            m178241b();
            return true;
        }
        if (this.f158153h.m155571a(f2, ttd0Var)) {
            this.f86528a = true;
            this.f86530c.set(ttd0Var.f55671s.f197185a);
            ttd0Var.m80955g(this.f86529b);
            if (bitmap != null) {
                C13501r.m80961a(canvas, bitmap, null, ttd0Var.f55671s);
            } else {
                C13501r.m80962b(canvas, aVar, f2, ttd0Var);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m178241b() {
        this.f86528a = false;
        this.f86531d = null;
        this.f158151f = -1L;
    }

    /* JADX INFO: renamed from: c */
    public void m178242c(Rect rect) {
        this.f158152g.set(rect);
    }
}
