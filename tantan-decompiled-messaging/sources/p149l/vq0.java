package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import p149l.uq0;

/* JADX INFO: loaded from: classes.dex */
public class vq0<T extends uq0> implements uq0 {

    /* JADX INFO: renamed from: a */
    public T f182558a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = -1, to = 255)
    public int f182559b = -1;

    /* JADX INFO: renamed from: c */
    public ColorFilter f182560c;

    /* JADX INFO: renamed from: d */
    public Rect f182561d;

    public vq0(T t) {
        this.f182558a = t;
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: a */
    public int mo191269a() {
        T t = this.f182558a;
        if (t == null) {
            return -1;
        }
        return t.mo191269a();
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: b */
    public int mo191270b() {
        T t = this.f182558a;
        if (t == null) {
            return -1;
        }
        return t.mo191270b();
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: c */
    public void mo191271c(Rect rect) {
        T t = this.f182558a;
        if (t != null) {
            t.mo191271c(rect);
        }
        this.f182561d = rect;
    }

    @Override // p149l.uq0
    public void clear() {
        T t = this.f182558a;
        if (t != null) {
            t.clear();
        }
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: d */
    public void mo191272d(ColorFilter colorFilter) {
        T t = this.f182558a;
        if (t != null) {
            t.mo191272d(colorFilter);
        }
        this.f182560c = colorFilter;
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: e */
    public void mo191273e(uq0.InterfaceC20483a interfaceC20483a) {
        T t = this.f182558a;
        if (t != null) {
            t.mo191273e(interfaceC20483a);
        }
    }

    @Override // p149l.gr0
    /* JADX INFO: renamed from: f */
    public int mo108210f() {
        T t = this.f182558a;
        if (t == null) {
            return 0;
        }
        return t.mo108210f();
    }

    @Override // p149l.gr0
    /* JADX INFO: renamed from: g */
    public int mo108211g(int i) {
        T t = this.f182558a;
        if (t == null) {
            return 0;
        }
        return t.mo108211g(i);
    }

    @Override // p149l.gr0
    public int getFrameCount() {
        T t = this.f182558a;
        if (t == null) {
            return 0;
        }
        return t.getFrameCount();
    }

    @Override // p149l.gr0
    public int getLoopCount() {
        T t = this.f182558a;
        if (t == null) {
            return 0;
        }
        return t.getLoopCount();
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: h */
    public void mo191274h(@IntRange(from = 0, to = 255) int i) {
        T t = this.f182558a;
        if (t != null) {
            t.mo191274h(i);
        }
        this.f182559b = i;
    }

    @Override // p149l.gr0
    public int height() {
        T t = this.f182558a;
        if (t == null) {
            return 0;
        }
        return t.height();
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: i */
    public boolean mo191275i(Drawable drawable, Canvas canvas, int i) {
        T t = this.f182558a;
        return t != null && t.mo191275i(drawable, canvas, i);
    }

    @Override // p149l.gr0
    public int width() {
        T t = this.f182558a;
        if (t == null) {
            return 0;
        }
        return t.width();
    }
}
