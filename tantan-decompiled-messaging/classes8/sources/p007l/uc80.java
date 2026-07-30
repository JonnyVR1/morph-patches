package p007l;

import android.view.View;
import com.p003p1.mobile.android.p005ui.pushbubble.SimplePushBubble;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class uc80 implements Comparable<uc80> {

    /* JADX INFO: renamed from: a */
    public l0m f4877a;

    /* JADX INFO: renamed from: b */
    public WeakReference<View> f4878b;

    /* JADX INFO: renamed from: c */
    public String f4879c;

    /* JADX INFO: renamed from: d */
    public boolean f4880d;

    /* JADX INFO: renamed from: g */
    public int f4883g;

    /* JADX INFO: renamed from: f */
    public boolean f4882f = false;

    /* JADX INFO: renamed from: e */
    public long f4881e = System.currentTimeMillis();

    public uc80(l0m l0mVar) {
        this.f4883g = 2;
        this.f4877a = l0mVar;
        if (l0mVar instanceof SimplePushBubble) {
            SimplePushBubble simplePushBubble = (SimplePushBubble) l0mVar;
            if (simplePushBubble.getPriority() == 5) {
                this.f4883g = simplePushBubble.getPriority();
                return;
            }
            return;
        }
        if (l0mVar instanceof m0m) {
            m0m m0mVar = (m0m) l0mVar;
            if (m0mVar.getPriority() == 4) {
                this.f4883g = m0mVar.getPriority();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static uc80 m11203a(l0m l0mVar) {
        return new uc80(l0mVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(uc80 uc80Var) {
        return uc80Var.m11207h() == m11207h() ? Long.compare(this.f4881e, uc80Var.f4881e) : uc80Var.m11207h() - m11207h();
    }

    /* JADX INFO: renamed from: f */
    public String m11205f() {
        return this.f4879c;
    }

    /* JADX INFO: renamed from: g */
    public l0m m11206g() {
        return this.f4877a;
    }

    /* JADX INFO: renamed from: h */
    public int m11207h() {
        return this.f4883g;
    }

    /* JADX INFO: renamed from: i */
    public WeakReference<View> m11208i() {
        return this.f4878b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m11209j() {
        return this.f4880d;
    }

    /* JADX INFO: renamed from: m */
    public boolean m11210m() {
        return this.f4882f;
    }

    /* JADX INFO: renamed from: n */
    public uc80 m11211n(String str) {
        this.f4879c = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public uc80 m11212o(boolean z) {
        this.f4880d = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public uc80 m11213p(int i) {
        this.f4883g = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m11214q(boolean z) {
        this.f4882f = z;
    }

    /* JADX INFO: renamed from: r */
    public uc80 m11215r(WeakReference<View> weakReference) {
        this.f4878b = weakReference;
        return this;
    }
}
