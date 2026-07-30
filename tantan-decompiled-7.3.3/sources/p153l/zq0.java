package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import p153l.yq0;

/* JADX INFO: loaded from: classes.dex */
public class zq0<T extends yq0> implements yq0 {

    /* JADX INFO: renamed from: a */
    public T f205552a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = -1, to = 255)
    public int f205553b = -1;

    /* JADX INFO: renamed from: c */
    public ColorFilter f205554c;

    /* JADX INFO: renamed from: d */
    public Rect f205555d;

    public zq0(T t) {
        this.f205552a = t;
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: a */
    public int mo143067a() {
        T t = this.f205552a;
        if (t == null) {
            return -1;
        }
        return t.mo143067a();
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: b */
    public int mo143068b() {
        T t = this.f205552a;
        if (t == null) {
            return -1;
        }
        return t.mo143068b();
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: c */
    public void mo143069c(Rect rect) {
        T t = this.f205552a;
        if (t != null) {
            t.mo143069c(rect);
        }
        this.f205555d = rect;
    }

    @Override // p153l.yq0
    public void clear() {
        T t = this.f205552a;
        if (t != null) {
            t.clear();
        }
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: d */
    public void mo143070d(ColorFilter colorFilter) {
        T t = this.f205552a;
        if (t != null) {
            t.mo143070d(colorFilter);
        }
        this.f205554c = colorFilter;
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: e */
    public void mo143071e(yq0.InterfaceC21665a interfaceC21665a) {
        T t = this.f205552a;
        if (t != null) {
            t.mo143071e(interfaceC21665a);
        }
    }

    @Override // p153l.kr0
    /* JADX INFO: renamed from: f */
    public int mo143072f() {
        T t = this.f205552a;
        if (t == null) {
            return 0;
        }
        return t.mo143072f();
    }

    @Override // p153l.kr0
    /* JADX INFO: renamed from: g */
    public int mo143073g(int i) {
        T t = this.f205552a;
        if (t == null) {
            return 0;
        }
        return t.mo143073g(i);
    }

    @Override // p153l.kr0
    public int getFrameCount() {
        T t = this.f205552a;
        if (t == null) {
            return 0;
        }
        return t.getFrameCount();
    }

    @Override // p153l.kr0
    public int getLoopCount() {
        T t = this.f205552a;
        if (t == null) {
            return 0;
        }
        return t.getLoopCount();
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: h */
    public void mo143074h(@IntRange(from = 0, to = 255) int i) {
        T t = this.f205552a;
        if (t != null) {
            t.mo143074h(i);
        }
        this.f205553b = i;
    }

    @Override // p153l.kr0
    public int height() {
        T t = this.f205552a;
        if (t == null) {
            return 0;
        }
        return t.height();
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: i */
    public boolean mo99580i(Drawable drawable, Canvas canvas, int i) {
        T t = this.f205552a;
        return t != null && t.mo99580i(drawable, canvas, i);
    }

    @Override // p153l.kr0
    public int width() {
        T t = this.f205552a;
        if (t == null) {
            return 0;
        }
        return t.width();
    }
}
