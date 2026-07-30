package p153l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rq2 {

    /* JADX INFO: renamed from: a */
    @StyleRes
    public int f164421a = jgc0.f120704k;

    /* JADX INFO: renamed from: b */
    public boolean f164422b = true;

    /* JADX INFO: renamed from: c */
    public float f164423c = -1.0f;

    /* JADX INFO: renamed from: d */
    public boolean f164424d = false;

    /* JADX INFO: renamed from: e */
    public y20<Window> f164425e = null;

    /* JADX INFO: renamed from: a */
    public float m182590a() {
        return this.f164423c;
    }

    /* JADX INFO: renamed from: b */
    public abstract ValueAnimator mo148405b(View view);

    /* JADX INFO: renamed from: c */
    public abstract ValueAnimator mo148406c(View view);

    /* JADX INFO: renamed from: d */
    public int m182591d() {
        return this.f164421a;
    }

    /* JADX INFO: renamed from: e */
    public y20<Window> m182592e() {
        return this.f164425e;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo148407f();

    /* JADX INFO: renamed from: g */
    public boolean m182593g() {
        return this.f164422b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m182594h() {
        return this.f164424d;
    }

    /* JADX INFO: renamed from: i */
    public rq2 m182595i(float f) {
        this.f164423c = f;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public rq2 m182596j(boolean z) {
        this.f164422b = z;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public rq2 m182597k(boolean z) {
        this.f164424d = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public rq2 m182598l(@StyleRes int i) {
        this.f164421a = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public rq2 m182599m(y20<Window> y20Var) {
        this.f164425e = y20Var;
        return this;
    }
}
