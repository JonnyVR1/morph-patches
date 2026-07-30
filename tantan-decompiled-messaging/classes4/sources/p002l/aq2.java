package p002l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import androidx.annotation.StyleRes;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class aq2 {

    /* JADX INFO: renamed from: a */
    @StyleRes
    public int f7855a = d8c0.f9106k;

    /* JADX INFO: renamed from: b */
    public boolean f7856b = true;

    /* JADX INFO: renamed from: c */
    public float f7857c = -1.0f;

    /* JADX INFO: renamed from: d */
    public boolean f7858d = false;

    /* JADX INFO: renamed from: e */
    public e30<Window> f7859e = null;

    /* JADX INFO: renamed from: a */
    public float m10019a() {
        return this.f7857c;
    }

    /* JADX INFO: renamed from: b */
    public abstract ValueAnimator mo10020b(View view);

    /* JADX INFO: renamed from: c */
    public abstract ValueAnimator mo10021c(View view);

    /* JADX INFO: renamed from: d */
    public int m10022d() {
        return this.f7855a;
    }

    /* JADX INFO: renamed from: e */
    public e30<Window> m10023e() {
        return this.f7859e;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo10024f();

    /* JADX INFO: renamed from: g */
    public boolean m10025g() {
        return this.f7856b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m10026h() {
        return this.f7858d;
    }

    /* JADX INFO: renamed from: i */
    public aq2 m10027i(float f) {
        this.f7857c = f;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public aq2 m10028j(boolean z) {
        this.f7856b = z;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public aq2 m10029k(boolean z) {
        this.f7858d = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public aq2 m10030l(@StyleRes int i) {
        this.f7855a = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public aq2 m10031m(e30<Window> e30Var) {
        this.f7859e = e30Var;
        return this;
    }
}
