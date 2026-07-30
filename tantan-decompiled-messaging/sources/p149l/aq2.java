package p149l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aq2 {

    /* JADX INFO: renamed from: a */
    @StyleRes
    public int f71119a = d8c0.f84856k;

    /* JADX INFO: renamed from: b */
    public boolean f71120b = true;

    /* JADX INFO: renamed from: c */
    public float f71121c = -1.0f;

    /* JADX INFO: renamed from: d */
    public boolean f71122d = false;

    /* JADX INFO: renamed from: e */
    public e30<Window> f71123e = null;

    /* JADX INFO: renamed from: a */
    public float m98215a() {
        return this.f71121c;
    }

    /* JADX INFO: renamed from: b */
    public abstract ValueAnimator mo98216b(View view);

    /* JADX INFO: renamed from: c */
    public abstract ValueAnimator mo98217c(View view);

    /* JADX INFO: renamed from: d */
    public int m98218d() {
        return this.f71119a;
    }

    /* JADX INFO: renamed from: e */
    public e30<Window> m98219e() {
        return this.f71123e;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo98220f();

    /* JADX INFO: renamed from: g */
    public boolean m98221g() {
        return this.f71120b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m98222h() {
        return this.f71122d;
    }

    /* JADX INFO: renamed from: i */
    public aq2 m98223i(float f) {
        this.f71121c = f;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public aq2 m98224j(boolean z) {
        this.f71120b = z;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public aq2 m98225k(boolean z) {
        this.f71122d = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public aq2 m98226l(@StyleRes int i) {
        this.f71119a = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public aq2 m98227m(e30<Window> e30Var) {
        this.f71123e = e30Var;
        return this;
    }
}
