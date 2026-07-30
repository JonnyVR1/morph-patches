package p149l;

import android.view.View;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class uc80 implements Comparable<uc80> {

    /* JADX INFO: renamed from: a */
    public l0m f175803a;

    /* JADX INFO: renamed from: b */
    public WeakReference<View> f175804b;

    /* JADX INFO: renamed from: c */
    public String f175805c;

    /* JADX INFO: renamed from: d */
    public boolean f175806d;

    /* JADX INFO: renamed from: g */
    public int f175809g;

    /* JADX INFO: renamed from: f */
    public boolean f175808f = false;

    /* JADX INFO: renamed from: e */
    public long f175807e = System.currentTimeMillis();

    public uc80(l0m l0mVar) {
        this.f175809g = 2;
        this.f175803a = l0mVar;
        if (l0mVar instanceof SimplePushBubble) {
            SimplePushBubble simplePushBubble = (SimplePushBubble) l0mVar;
            if (simplePushBubble.getPriority() == 5) {
                this.f175809g = simplePushBubble.getPriority();
                return;
            }
            return;
        }
        if (l0mVar instanceof m0m) {
            m0m m0mVar = (m0m) l0mVar;
            if (m0mVar.getPriority() == 4) {
                this.f175809g = m0mVar.getPriority();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static uc80 m192995a(l0m l0mVar) {
        return new uc80(l0mVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(uc80 uc80Var) {
        return uc80Var.m192999h() == m192999h() ? Long.compare(this.f175807e, uc80Var.f175807e) : uc80Var.m192999h() - m192999h();
    }

    /* JADX INFO: renamed from: f */
    public String m192997f() {
        return this.f175805c;
    }

    /* JADX INFO: renamed from: g */
    public l0m m192998g() {
        return this.f175803a;
    }

    /* JADX INFO: renamed from: h */
    public int m192999h() {
        return this.f175809g;
    }

    /* JADX INFO: renamed from: i */
    public WeakReference<View> m193000i() {
        return this.f175804b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m193001j() {
        return this.f175806d;
    }

    /* JADX INFO: renamed from: m */
    public boolean m193002m() {
        return this.f175808f;
    }

    /* JADX INFO: renamed from: n */
    public uc80 m193003n(String str) {
        this.f175805c = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public uc80 m193004o(boolean z) {
        this.f175806d = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public uc80 m193005p(int i) {
        this.f175809g = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m193006q(boolean z) {
        this.f175808f = z;
    }

    /* JADX INFO: renamed from: r */
    public uc80 m193007r(WeakReference<View> weakReference) {
        this.f175804b = weakReference;
        return this;
    }
}
