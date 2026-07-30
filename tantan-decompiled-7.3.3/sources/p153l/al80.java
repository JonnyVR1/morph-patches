package p153l;

import android.view.View;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class al80 implements Comparable<al80> {

    /* JADX INFO: renamed from: a */
    public f3m f72081a;

    /* JADX INFO: renamed from: b */
    public WeakReference<View> f72082b;

    /* JADX INFO: renamed from: c */
    public String f72083c;

    /* JADX INFO: renamed from: d */
    public boolean f72084d;

    /* JADX INFO: renamed from: g */
    public int f72087g;

    /* JADX INFO: renamed from: f */
    public boolean f72086f = false;

    /* JADX INFO: renamed from: e */
    public long f72085e = System.currentTimeMillis();

    public al80(f3m f3mVar) {
        this.f72087g = 2;
        this.f72081a = f3mVar;
        if (f3mVar instanceof SimplePushBubble) {
            SimplePushBubble simplePushBubble = (SimplePushBubble) f3mVar;
            if (simplePushBubble.getPriority() == 5) {
                this.f72087g = simplePushBubble.getPriority();
                return;
            }
            return;
        }
        if (f3mVar instanceof g3m) {
            g3m g3mVar = (g3m) f3mVar;
            if (g3mVar.getPriority() == 4) {
                this.f72087g = g3mVar.getPriority();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static al80 m98641a(f3m f3mVar) {
        return new al80(f3mVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(al80 al80Var) {
        return al80Var.m98645h() == m98645h() ? Long.compare(this.f72085e, al80Var.f72085e) : al80Var.m98645h() - m98645h();
    }

    /* JADX INFO: renamed from: f */
    public String m98643f() {
        return this.f72083c;
    }

    /* JADX INFO: renamed from: g */
    public f3m m98644g() {
        return this.f72081a;
    }

    /* JADX INFO: renamed from: h */
    public int m98645h() {
        return this.f72087g;
    }

    /* JADX INFO: renamed from: i */
    public WeakReference<View> m98646i() {
        return this.f72082b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m98647j() {
        return this.f72084d;
    }

    /* JADX INFO: renamed from: m */
    public boolean m98648m() {
        return this.f72086f;
    }

    /* JADX INFO: renamed from: n */
    public al80 m98649n(String str) {
        this.f72083c = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public al80 m98650o(boolean z) {
        this.f72084d = z;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public al80 m98651p(int i) {
        this.f72087g = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m98652q(boolean z) {
        this.f72086f = z;
    }

    /* JADX INFO: renamed from: r */
    public al80 m98653r(WeakReference<View> weakReference) {
        this.f72082b = weakReference;
        return this;
    }
}
